/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import simo.simo.bean.Client;

/**
 *
 * @author mounaimI
 */

@Repository
public interface ClientDao extends JpaRepository<Client, Long>{
    public Client findByCin(String cin);
    public Client findByNom(String nom);
    public Client findByPrenom(String prenom);    
    @Transactional
    public Client deleteByCin(String cin);
    
}
