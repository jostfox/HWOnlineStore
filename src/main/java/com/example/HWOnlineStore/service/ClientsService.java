package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.model.Client;

import java.util.List;

public interface ClientsService {

    List <Client> getAllClients();

    Client getClientById(int id);

    Client newClient (Client client);

}
