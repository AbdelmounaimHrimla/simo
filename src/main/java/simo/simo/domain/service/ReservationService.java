/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service;

import java.util.List;
import simo.simo.bean.Client;
import simo.simo.bean.Reservation;
import simo.simo.bean.Terain;

/**
 *
 * @author mounaim
 */
public interface ReservationService {
    public Reservation findByClient (Client client);
    public Reservation findByTerain (Terain terain);
    public List<Reservation> findAll();
    public int save(Reservation reservation);
}
