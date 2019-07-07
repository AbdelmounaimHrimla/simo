/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import simo.simo.bean.Client;
import simo.simo.bean.Reservation;
import simo.simo.bean.Terain;

/**
 *
 * @author mounaim
 */
@Repository
public interface ReservationDao extends JpaRepository<Reservation, Long>{
    
    public Reservation findByClient (Client client);
    public Reservation findByTerain (Terain terain);
}
