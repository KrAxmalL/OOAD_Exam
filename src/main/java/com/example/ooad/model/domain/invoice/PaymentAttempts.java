package com.example.ooad.model.domain.invoice;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class PaymentAttempts {

    Integer invoiceId;
    Integer paymentAttempts;
}
