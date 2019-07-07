/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.ws.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import simo.simo.bean.Terain;
import simo.simo.domain.service.TerainService;

/**
 *
 * @author mounaim
 */

@RestController
@RequestMapping("location-terain/terain")
public class TerainRest {
    @Autowired
    private TerainService terainService;

    @GetMapping("libelle/{libelle}")
    public Terain findByLibelle(@PathVariable String libelle) {
        return terainService.findByLibelle(libelle);
    }

    @PostMapping("libelle/{libelle}")
    public Terain deleteByLibelle(@PathVariable String libelle) {
        return terainService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<Terain> findAll() {
        return terainService.findAll();
    }

    @PostMapping("/")
    public int save(Terain terain) {
        return terainService.save(terain);
    }

    public TerainService getTerainService() {
        return terainService;
    }

    public void setTerainService(TerainService terainService) {
        this.terainService = terainService;
    }
}
