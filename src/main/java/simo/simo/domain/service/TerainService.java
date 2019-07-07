/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import simo.simo.bean.Terain;

/**
 *
 * @author mounaim
 */
public interface TerainService {
    public Terain findByLibelle(String libelle);
    
    @Transactional
    public Terain deleteByLibelle(String libelle);
    
    public List<Terain> findAll();
    public int save(Terain terain);
}
