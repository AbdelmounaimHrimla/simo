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
public class TerainPricing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    @ManyToOne
    private Terain terain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Terain getTerain() {
        return terain;
    }

    public void setTerain(Terain terain) {
        this.terain = terain;
    }

    public TerainPricing() {
    }

    public TerainPricing(Long id, Date dateDebut, Date dateFin, Terain terain) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.terain = terain;
    }

    public TerainPricing(Date dateDebut, Date dateFin, Terain terain) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.terain = terain;
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
        if (!(object instanceof TerainPricing)) {
            return false;
        }
        TerainPricing other = (TerainPricing) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "simo.simo.bean.TerainPricing[ id=" + id + " ]";
    }
    
}
