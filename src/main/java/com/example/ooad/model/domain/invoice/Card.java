package com.example.ooad.model.domain.invoice;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;

@Value
@Builder
@Jacksonized
public class Card {

    String number;
    Date activeTo;
    Integer cvv;
}
