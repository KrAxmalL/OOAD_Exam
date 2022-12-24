package com.example.ooad.model.domain.payment;

import com.example.ooad.model.domain.invoice.Card;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class ManualPayment {

    Integer invoiceId;
    Card card; //client needs to enter full card data when performing manual payment;
}
