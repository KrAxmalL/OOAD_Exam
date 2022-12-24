package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.Card;
import com.example.ooad.model.domain.invoice.Invoice;
import com.example.ooad.model.domain.payment.AutomaticPayment;
import com.example.ooad.model.domain.payment.ManualPayment;

public interface PaymentService {

    boolean pay(AutomaticPayment automaticPayment);

    boolean pay(ManualPayment manualPayment);
}
