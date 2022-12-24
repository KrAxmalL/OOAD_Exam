package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.Card;
import com.example.ooad.model.domain.invoice.Invoice;
import com.example.ooad.model.domain.invoice.InvoiceTemplate;
import com.example.ooad.model.domain.invoice.PaymentAttempts;
import com.example.ooad.model.domain.payment.AutomaticPayment;
import com.example.ooad.model.domain.payment.ManualPayment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final CardService cardService;
    private final InvoiceService invoiceService;
    private final InvoiceTemplateService invoiceTemplateService;
    private final PaymentAttemptsService paymentAttemptsService;

    // Can be any number from business requirements,
    // 5 is an example
    private static final Integer MAX_AUTOMATIC_PAYMENT_ATTEMPTS = 5;

    @Override
    public boolean pay(AutomaticPayment automaticPayment) {
        Invoice invoice = invoiceService.getInvoiceById(automaticPayment.getInvoiceId());
        InvoiceTemplate invoiceTemplate = invoiceTemplateService.getInvoiceTemplateById(invoice.getInvoiceTemplateId());
        PaymentAttempts paymentAttempts = paymentAttemptsService.getAttemptsForInvoice(invoice.getId());
        if(paymentAttempts.getPaymentAttempts() > MAX_AUTOMATIC_PAYMENT_ATTEMPTS) {
            // if many automatic attempts failed, we need to notify client about it
            // maybe, the card is expired, or he has not enough money
            // for simplicity, return only boolean result here
            return false;
        }

        boolean paidSuccessfully = payInvoice(invoiceTemplate.getCard(), invoice);
        if(paidSuccessfully) {
            return true;
        } else {
            // increase number of automatic payment attempts
            // schedule next automatic payment attempt to be performed on the next day
            // (according to the task, this scheduling will be performed somewhere else by users of our API)
            return false;
        }
    }

    @Override
    public boolean pay(ManualPayment manualPayment) {
        Invoice invoice = invoiceService.getInvoiceById(manualPayment.getInvoiceId());
        return payInvoice(manualPayment.getCard(), invoice);
    }

    private boolean payInvoice(Card card, Invoice invoice) {
        boolean validCard = cardService.isValidCard(card);
        if(validCard) {
            // call to some external system to perform payment
            // card data is used and amount is taken from invoice
            return true;
        } else {
            return false;
        }
    }
}
