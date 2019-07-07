/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service;

import java.util.List;
import simo.simo.bean.Terain;
import simo.simo.bean.TerainPricing;

/**
 *
 * @author mounaim
 */
public interface TerainPricingService {
    public TerainPricing findByTerain(Terain terain);
    public List<TerainPricing> findAll();
    public int save(TerainPricing terainPricing);
}
