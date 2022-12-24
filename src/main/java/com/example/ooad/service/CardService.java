package com.example.ooad.service;

import com.example.ooad.model.domain.invoice.Card;

public interface CardService {

    // probably, some database call
    Card getCardByNumber(String cardNumber);

    // method for validating card
    // probably, it will be performed using external payment system or bank
    boolean isValidCard(Card card);
}
