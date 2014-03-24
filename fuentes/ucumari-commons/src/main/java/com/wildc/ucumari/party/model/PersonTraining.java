/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.TrainingClassType;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "person_training")
@NamedQueries({
    @NamedQuery(name = "PersonTraining.findAll", query = "SELECT p FROM PersonTraining p")})
public class PersonTraining implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonTrainingPK personTrainingPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "TRAINING_CLASS_TYPE_ID", referencedColumnName = "TRAINING_CLASS_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TrainingClassType trainingClassType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public PersonTraining() {
    }

    public PersonTraining(PersonTrainingPK personTrainingPK) {
        this.personTrainingPK = personTrainingPK;
    }

    public PersonTraining(String partyId, String trainingClassTypeId, Date fromDate) {
        this.personTrainingPK = new PersonTrainingPK(partyId, trainingClassTypeId, fromDate);
    }

    public PersonTrainingPK getPersonTrainingPK() {
        return personTrainingPK;
    }

    public void setPersonTrainingPK(PersonTrainingPK personTrainingPK) {
        this.personTrainingPK = personTrainingPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public TrainingClassType getTrainingClassType() {
        return trainingClassType;
    }

    public void setTrainingClassType(TrainingClassType trainingClassType) {
        this.trainingClassType = trainingClassType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personTrainingPK != null ? personTrainingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonTraining)) {
            return false;
        }
        PersonTraining other = (PersonTraining) object;
        if ((this.personTrainingPK == null && other.personTrainingPK != null) || (this.personTrainingPK != null && !this.personTrainingPK.equals(other.personTrainingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PersonTraining[ personTrainingPK=" + personTrainingPK + " ]";
    }
    
}
