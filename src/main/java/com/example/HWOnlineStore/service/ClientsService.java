package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.model.Basket;
import com.example.HWOnlineStore.model.Client;


import java.util.List;

public interface ClientsService {

    List<Client> getAllClients();

    Client getClientById(int id);

    Client newClient(Client client);

    Client addToBasket(int id, Basket basket);
}
