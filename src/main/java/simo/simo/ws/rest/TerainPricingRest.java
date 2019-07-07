/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.ws.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simo.simo.bean.Terain;
import simo.simo.bean.TerainPricing;
import simo.simo.domain.service.TerainPricingService;

/**
 *
 * @author mounaim
 */

@RestController
@RequestMapping("location-terain/terain-pricing")
public class TerainPricingRest {
    
    @Autowired
    private TerainPricingService terainPricingService;

    @GetMapping("terain/{terain}")
    public TerainPricing findByTerain(@RequestBody Terain terain) {
        return terainPricingService.findByTerain(terain);
    }

    @GetMapping("/")
    public List<TerainPricing> findAll() {
        return terainPricingService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody TerainPricing terainPricing) {
        return terainPricingService.save(terainPricing);
    }

    public TerainPricingService getTerainPricingService() {
        return terainPricingService;
    }

    public void setTerainPricingService(TerainPricingService terainPricingService) {
        this.terainPricingService = terainPricingService;
    }
    
}
