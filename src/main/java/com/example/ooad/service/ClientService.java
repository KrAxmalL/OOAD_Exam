package com.example.ooad.service;

public interface ClientService {

    // This method is scheduled and executed periodically
    // for each client, it checks how many unpaid invoices client has for some defined time period
    // if the limit of such invoices is reached (limit is probably defined by some business requirements)
    // client is blocked in the system
    void checkUnpaidInvoicesOfClients();
}
