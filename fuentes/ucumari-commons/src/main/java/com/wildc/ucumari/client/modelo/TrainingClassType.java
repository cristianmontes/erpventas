/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.PersonTraining;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "training_class_type")
@NamedQueries({
    @NamedQuery(name = "TrainingClassType.findAll", query = "SELECT t FROM TrainingClassType t")})
public class TrainingClassType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRAINING_CLASS_TYPE_ID")
    private String trainingClassTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<TrainingClassType> trainingClassTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "TRAINING_CLASS_TYPE_ID")
    @ManyToOne
    private TrainingClassType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trainingClassType")
    private List<PersonTraining> personTrainingList;

    public TrainingClassType() {
    }

    public TrainingClassType(String trainingClassTypeId) {
        this.trainingClassTypeId = trainingClassTypeId;
    }

    public String getTrainingClassTypeId() {
        return trainingClassTypeId;
    }

    public void setTrainingClassTypeId(String trainingClassTypeId) {
        this.trainingClassTypeId = trainingClassTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<TrainingClassType> getTrainingClassTypeList() {
        return trainingClassTypeList;
    }

    public void setTrainingClassTypeList(List<TrainingClassType> trainingClassTypeList) {
        this.trainingClassTypeList = trainingClassTypeList;
    }

    public TrainingClassType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(TrainingClassType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<PersonTraining> getPersonTrainingList() {
        return personTrainingList;
    }

    public void setPersonTrainingList(List<PersonTraining> personTrainingList) {
        this.personTrainingList = personTrainingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainingClassTypeId != null ? trainingClassTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrainingClassType)) {
            return false;
        }
        TrainingClassType other = (TrainingClassType) object;
        if ((this.trainingClassTypeId == null && other.trainingClassTypeId != null) || (this.trainingClassTypeId != null && !this.trainingClassTypeId.equals(other.trainingClassTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrainingClassType[ trainingClassTypeId=" + trainingClassTypeId + " ]";
    }
    
}
