package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.InvoiceTemplate;

public interface InvoiceTemplateService {

    // probably, some database call
    InvoiceTemplate getInvoiceTemplateById(Integer invoiceTemplateId);

    boolean createInvoiceTemplate(InvoiceTemplate invoiceTemplate);
}
