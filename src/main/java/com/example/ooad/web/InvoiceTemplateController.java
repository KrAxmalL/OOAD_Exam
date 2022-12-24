package com.example.ooad.web;

import com.example.ooad.model.domain.invoice.InvoiceTemplate;
import com.example.ooad.service.InvoiceService;
import com.example.ooad.service.InvoiceTemplateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoice-templates")
@RequiredArgsConstructor
public class InvoiceTemplateController {

    private final InvoiceTemplateService invoiceTemplateService;

    @PostMapping
    public void createInvoiceTemplate(@RequestBody InvoiceTemplate invoiceTemplate) {
        invoiceTemplateService.createInvoiceTemplate(invoiceTemplate);
    }
}
