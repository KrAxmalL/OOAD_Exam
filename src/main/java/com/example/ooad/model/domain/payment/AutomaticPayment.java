package com.example.ooad.model.domain.payment;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class AutomaticPayment {

    Integer invoiceId; //need only invoice id to pay, card data can be taken from invoice template
}
