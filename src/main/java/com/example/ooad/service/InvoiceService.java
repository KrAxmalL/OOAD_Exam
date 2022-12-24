package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.Invoice;
import com.example.ooad.model.domain.invoice.InvoiceTemplate;

public interface InvoiceService {

    // probably, some database call
    Invoice getInvoiceById(Integer invoiceId);

    // Will read invoice template from database and perform scheduling
    // using data from invoice template: day, month, tariff, payment period
    void scheduleInvoiceCreation(Integer invoiceTemplateId);
}
