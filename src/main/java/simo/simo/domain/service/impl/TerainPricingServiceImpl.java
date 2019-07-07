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
import simo.simo.bean.TerainPricing;
import simo.simo.domain.dao.TerainPricingDao;
import simo.simo.domain.service.TerainPricingService;

/**
 *
 * @author mounaim
 */

@Service
public class TerainPricingServiceImpl implements TerainPricingService{

    @Autowired
    private TerainPricingDao terainPricingDao;
    @Override
    public TerainPricing findByTerain(Terain terain) {
        return terainPricingDao.findByTerain(terain);
    }

    @Override
    public List<TerainPricing> findAll() {
        return terainPricingDao.findAll();
    }

    @Override
    public int save(TerainPricing terainPricing) {
        if(findByTerain(terainPricing.getTerain()) != null) {
            return -1;
        } else {
            terainPricingDao.save(terainPricing);
            return 1;
        }
    }

    public TerainPricingDao getTerainPricingDao() {
        return terainPricingDao;
    }

    public void setTerainPricingDao(TerainPricingDao terainPricingDao) {
        this.terainPricingDao = terainPricingDao;
    }
    
    
    
}
