package com.example.ooad.model.domain.client;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

@Value
@Builder
@Jacksonized
public class Client {

    Integer id;
    // some common data, as credentials is skipped
    Boolean blocked; // client can be blocked if he has too many unpaid invoices
}
