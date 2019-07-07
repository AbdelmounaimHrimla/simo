/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simo.simo.bean.Terain;
import simo.simo.domain.dao.TerainDao;
import simo.simo.domain.service.TerainService;

/**
 *
 * @author mounaim
 */

@Service
public class TerainServiceImpl implements TerainService{

    @Autowired
    private TerainDao terainDao;
    @Override
    public Terain findByLibelle(String libelle) {
        return terainDao.findByLibelle(libelle);
    }

    @Override
    public Terain deleteByLibelle(String libelle) {
        return terainDao.deleteByLibelle(libelle);
    }

    @Override
    public List<Terain> findAll() {
        return terainDao.findAll();
    }

    @Override
    public int save(Terain terain) {
        if(findByLibelle(terain.getLibelle()) !=  null) {
            return -1;
        } else {
            terainDao.save(terain);
            return 1;
        }
    }

    public TerainDao getTerainDao() {
        return terainDao;
    }

    public void setTerainDao(TerainDao terainDao) {
        this.terainDao = terainDao;
    }
    
    
    
}
