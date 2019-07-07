/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simo.simo.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author mounaim
 */
@Entity
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Terain terain;
    private double prix;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateReservation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heureDebutReservation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date heureFinReservation;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Terain getTerain() {
        return terain;
    }

    public void setTerain(Terain terain) {
        this.terain = terain;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getHeureDebutReservation() {
        return heureDebutReservation;
    }

    public void setHeureDebutReservation(Date heureDebutReservation) {
        this.heureDebutReservation = heureDebutReservation;
    }

    public Date getHeureFinReservation() {
        return heureFinReservation;
    }

    public void setHeureFinReservation(Date heureFinReservation) {
        this.heureFinReservation = heureFinReservation;
    }

    public Reservation() {
    }

    public Reservation(Long id, Client client, Terain terain, double prix, Date dateReservation, Date heureDebutReservation, Date heureFinReservation) {
        this.id = id;
        this.client = client;
        this.terain = terain;
        this.prix = prix;
        this.dateReservation = dateReservation;
        this.heureDebutReservation = heureDebutReservation;
        this.heureFinReservation = heureFinReservation;
    }

    public Reservation(Client client, Terain terain, double prix, Date dateReservation, Date heureDebutReservation, Date heureFinReservation) {
        this.client = client;
        this.terain = terain;
        this.prix = prix;
        this.dateReservation = dateReservation;
        this.heureDebutReservation = heureDebutReservation;
        this.heureFinReservation = heureFinReservation;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "simo.simo.bean.Reservation[ id=" + id + " ]";
    }
    
}
