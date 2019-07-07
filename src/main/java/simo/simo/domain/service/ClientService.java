/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import simo.simo.bean.Client;

/**
 *
 * @author mounaim
 */
public interface ClientService {
    public Client findByCin(String cin);
    public Client findByNom(String nom);
    public Client findByPrenom(String prenom);
    
    @Transactional
    public Client deleteByCin(String cin);
    
    public List<Client> findAll();
    public int save(Client client);
}
