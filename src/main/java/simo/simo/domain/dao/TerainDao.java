/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import simo.simo.bean.Terain;

/**
 *
 * @author mounaim
 */

@Repository
public interface TerainDao extends JpaRepository<Terain, Long>{
    public Terain findByLibelle(String libelle);
    
    @Transactional
    public Terain deleteByLibelle(String libelle);
}
