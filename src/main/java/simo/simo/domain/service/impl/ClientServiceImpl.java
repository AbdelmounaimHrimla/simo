/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simo.simo.bean.Client;
import simo.simo.domain.dao.ClientDao;
import simo.simo.domain.service.ClientService;

/**
 *
 * @author mounaim
 */

@Service
public class ClientServiceImpl implements  ClientService{
    
    
    @Autowired
    private ClientDao clientDao;

    @Override
    public Client findByCin(String cin) {
        return clientDao.findByCin(cin);
    }

    @Override
    public Client findByNom(String nom) {
        return clientDao.findByNom(nom);
    }

    @Override
    public Client findByPrenom(String prenom) {
        return clientDao.findByPrenom(prenom);
    }

    @Override
    public Client deleteByCin(String cin) {
        return clientDao.deleteByCin(cin);
    }

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public int save(Client client) {
        if(findByCin(client.getCin()) != null){
            return -1;
        } else {
            clientDao.save(client);
            return 1;
        }
    }
    
    public ClientDao getClientDao() {
        return clientDao;
    }

    public void setClientDao(ClientDao clientDao) {
        this.clientDao = clientDao;
    }
}
