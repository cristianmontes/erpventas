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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "empl_position_type")
@NamedQueries({
    @NamedQuery(name = "EmplPositionType.findAll", query = "SELECT e FROM EmplPositionType e")})
public class EmplPositionType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionType")
    private List<RateAmount> rateAmountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionType")
    private List<ValidResponsibility> validResponsibilityList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_TYPE_ID")
    private String emplPositionTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionType")
    private List<EmplPositionTypeRate> emplPositionTypeRateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionType")
    private List<EmplPositionTypeRateNew> emplPositionTypeRateNewList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<EmplPositionType> emplPositionTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID")
    @ManyToOne
    private EmplPositionType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionType")
    private List<EmplPositionTypeClass> emplPositionTypeClassList;

    public EmplPositionType() {
    }

    public EmplPositionType(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
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

    public List<EmplPositionTypeRate> getEmplPositionTypeRateList() {
        return emplPositionTypeRateList;
    }

    public void setEmplPositionTypeRateList(List<EmplPositionTypeRate> emplPositionTypeRateList) {
        this.emplPositionTypeRateList = emplPositionTypeRateList;
    }

    public List<EmplPositionTypeRateNew> getEmplPositionTypeRateNewList() {
        return emplPositionTypeRateNewList;
    }

    public void setEmplPositionTypeRateNewList(List<EmplPositionTypeRateNew> emplPositionTypeRateNewList) {
        this.emplPositionTypeRateNewList = emplPositionTypeRateNewList;
    }

    public List<EmplPositionType> getEmplPositionTypeList() {
        return emplPositionTypeList;
    }

    public void setEmplPositionTypeList(List<EmplPositionType> emplPositionTypeList) {
        this.emplPositionTypeList = emplPositionTypeList;
    }

    public EmplPositionType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(EmplPositionType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<EmplPositionTypeClass> getEmplPositionTypeClassList() {
        return emplPositionTypeClassList;
    }

    public void setEmplPositionTypeClassList(List<EmplPositionTypeClass> emplPositionTypeClassList) {
        this.emplPositionTypeClassList = emplPositionTypeClassList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionTypeId != null ? emplPositionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionType)) {
            return false;
        }
        EmplPositionType other = (EmplPositionType) object;
        if ((this.emplPositionTypeId == null && other.emplPositionTypeId != null) || (this.emplPositionTypeId != null && !this.emplPositionTypeId.equals(other.emplPositionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionType[ emplPositionTypeId=" + emplPositionTypeId + " ]";
    }

    public List<RateAmount> getRateAmountList() {
        return rateAmountList;
    }

    public void setRateAmountList(List<RateAmount> rateAmountList) {
        this.rateAmountList = rateAmountList;
    }

    public List<ValidResponsibility> getValidResponsibilityList() {
        return validResponsibilityList;
    }

    public void setValidResponsibilityList(List<ValidResponsibility> validResponsibilityList) {
        this.validResponsibilityList = validResponsibilityList;
    }
    
}
