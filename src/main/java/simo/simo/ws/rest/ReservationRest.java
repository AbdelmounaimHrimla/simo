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
import simo.simo.bean.Client;
import simo.simo.bean.Reservation;
import simo.simo.bean.Terain;
import simo.simo.domain.service.ReservationService;

/**
 *
 * @author mounaim
 */
@RestController
@RequestMapping("location-terain/reservation")
public class ReservationRest {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/client/{client}")
    public Reservation findByClient(@RequestBody Client client) {
        return reservationService.findByClient(client);
    }

    @GetMapping("/terain/{terain}")
    public Reservation findByTerain(@RequestBody Terain terain) {
        return reservationService.findByTerain(terain);
    }

    @GetMapping("/")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }

    public ReservationService getReservationService() {
        return reservationService;
    }

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
}
