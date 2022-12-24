package com.example.ooad.model.domain.invoice;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Value
@Builder
@Jacksonized
public class Invoice {

    Integer id;
    Integer clientId;
    Integer invoiceTemplateId;
    Integer amount;
    Date createdAt;
    Date paidAt; // when invoice was paid
    Date payTo; // if invoice is not paid until this date - it is considered unpaid
}
