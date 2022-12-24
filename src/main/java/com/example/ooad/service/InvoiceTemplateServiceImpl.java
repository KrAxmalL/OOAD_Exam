package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.InvoiceTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceTemplateServiceImpl implements InvoiceTemplateService {

    private final CardService cardService;
    private final InvoiceService invoiceService;

    @Override
    public InvoiceTemplate getInvoiceTemplateById(Integer invoiceTemplateId) {
        // probably, some database call
        return null;
    }

    @Override
    public boolean createInvoiceTemplate(InvoiceTemplate invoiceTemplate) {
        if(cardService.isValidCard(invoiceTemplate.getCard())) {
            // save template to the database

            // schedule invoice creation using template - only for automatic payments
            if(invoiceTemplate.getAutomatic()) {
                invoiceService.scheduleInvoiceCreation(invoiceTemplate.getId());
            }
            return true;
        } else {
            return false;
        }
    }
}
