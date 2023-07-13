package com.example.HWOnlineStore.service;

import com.example.HWOnlineStore.exceptions.EmptyClientsListException;
import com.example.HWOnlineStore.exceptions.MissingArgumentException;
import com.example.HWOnlineStore.exceptions.NoSuchIdException;
import com.example.HWOnlineStore.model.Client;
import com.example.HWOnlineStore.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    ClientsRepository clientsRepository;

    @Override
    public List<Client> getAllClients() {
        List <Client> clientList = clientsRepository.getAllClients();
        if (clientList.isEmpty()){
            throw new EmptyClientsListException("Empty Client List Exception");
        }
        return clientList;
    }

    @Override
    public Client getClientById(int id) {
        Client client = clientsRepository.getClientById(id);
        if (id < 1 || client == null){
            throw new NoSuchIdException("No such ID Exception");
        }
        return clientsRepository.getClientById(id);
    }

    @Override
    public Client newClient(Client client) {
        if (client.getFirstName() == null ||
        client.getLastName() == null ||
        client.getLocation() == null){
            throw new MissingArgumentException("Missing argument Exception");
        }
        return clientsRepository.newClient(client);
    }
}
