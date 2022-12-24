package com.example.ooad.model.domain.invoice;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class InvoiceTemplate {

    Integer id;
    Integer clientId;
    Integer tariff; // amount of money
    PaymentPeriod paymentPeriod;
    Integer paymentMonth; // only for yearly period
    Integer paymentDay;
    Boolean automatic;
    Card card; // only for automatic payments
}
