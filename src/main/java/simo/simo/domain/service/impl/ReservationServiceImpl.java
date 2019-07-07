/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simo.simo.bean.Client;
import simo.simo.bean.Reservation;
import simo.simo.bean.Terain;
import simo.simo.domain.dao.ReservationDao;
import simo.simo.domain.service.ReservationService;

/**
 *
 * @author mounaim
 */

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private ReservationDao reservationDao;
    @Override
    public Reservation findByClient(Client client) {
        return reservationDao.findByClient(client);
    }

    @Override
    public Reservation findByTerain(Terain terain) {
        return reservationDao.findByTerain(terain);
    }

    @Override
    public List<Reservation> findAll() {
        return reservationDao.findAll();
    }

    @Override
    public int save(Reservation reservation) {
        if(findByTerain(reservation.getTerain()) != null){
            return -1;
        } else {
            reservationDao.save(reservation);
            return 1;
        }
    }

    public ReservationDao getReservationDao() {
        return reservationDao;
    }

    public void setReservationDao(ReservationDao reservationDao) {
        this.reservationDao = reservationDao;
    }
    
}
