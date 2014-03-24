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
@Table(name = "responsibility_type")
@NamedQueries({
    @NamedQuery(name = "ResponsibilityType.findAll", query = "SELECT r FROM ResponsibilityType r")})
public class ResponsibilityType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsibilityType")
    private List<ValidResponsibility> validResponsibilityList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RESPONSIBILITY_TYPE_ID")
    private String responsibilityTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "responsibilityType")
    private List<EmplPositionResponsibility> emplPositionResponsibilityList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ResponsibilityType> responsibilityTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "RESPONSIBILITY_TYPE_ID")
    @ManyToOne
    private ResponsibilityType parentTypeId;

    public ResponsibilityType() {
    }

    public ResponsibilityType(String responsibilityTypeId) {
        this.responsibilityTypeId = responsibilityTypeId;
    }

    public String getResponsibilityTypeId() {
        return responsibilityTypeId;
    }

    public void setResponsibilityTypeId(String responsibilityTypeId) {
        this.responsibilityTypeId = responsibilityTypeId;
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

    public List<EmplPositionResponsibility> getEmplPositionResponsibilityList() {
        return emplPositionResponsibilityList;
    }

    public void setEmplPositionResponsibilityList(List<EmplPositionResponsibility> emplPositionResponsibilityList) {
        this.emplPositionResponsibilityList = emplPositionResponsibilityList;
    }

    public List<ResponsibilityType> getResponsibilityTypeList() {
        return responsibilityTypeList;
    }

    public void setResponsibilityTypeList(List<ResponsibilityType> responsibilityTypeList) {
        this.responsibilityTypeList = responsibilityTypeList;
    }

    public ResponsibilityType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ResponsibilityType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (responsibilityTypeId != null ? responsibilityTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResponsibilityType)) {
            return false;
        }
        ResponsibilityType other = (ResponsibilityType) object;
        if ((this.responsibilityTypeId == null && other.responsibilityTypeId != null) || (this.responsibilityTypeId != null && !this.responsibilityTypeId.equals(other.responsibilityTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ResponsibilityType[ responsibilityTypeId=" + responsibilityTypeId + " ]";
    }

    public List<ValidResponsibility> getValidResponsibilityList() {
        return validResponsibilityList;
    }

    public void setValidResponsibilityList(List<ValidResponsibility> validResponsibilityList) {
        this.validResponsibilityList = validResponsibilityList;
    }
    
}
