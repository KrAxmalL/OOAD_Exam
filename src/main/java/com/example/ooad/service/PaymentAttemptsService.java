package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.PaymentAttempts;

public interface PaymentAttemptsService {

    // probably, some database call
    PaymentAttempts getAttemptsForInvoice(Integer invoiceId);
}
