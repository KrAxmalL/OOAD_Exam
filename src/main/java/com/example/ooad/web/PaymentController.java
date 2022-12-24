package com.example.ooad.web;

import com.example.ooad.model.domain.invoice.Card;
import com.example.ooad.model.domain.payment.AutomaticPayment;
import com.example.ooad.model.domain.payment.ManualPayment;
import com.example.ooad.service.CardService;
import com.example.ooad.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/manual-payment")
    public void payManually(@RequestBody ManualPayment manualPayment) {
        paymentService.pay(manualPayment);
    }

    @PostMapping("/automatic-payment")
    public void payAutomatically(@RequestBody AutomaticPayment automaticPayment) {
        paymentService.pay(automaticPayment);
    }
}
