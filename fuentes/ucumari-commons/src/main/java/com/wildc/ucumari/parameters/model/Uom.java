/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "uom")

public class Uom implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "UOM_ID")
    private String uomId;
    @Column(name = "ABBREVIATION")
    private String abbreviation;
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
    
    @JoinColumn(name = "UOM_TYPE_ID", referencedColumnName = "UOM_TYPE_ID")
    @ManyToOne
    private UomType uomTypeId;
    
    public Uom() {
    }

    public Uom(String uomId) {
        this.uomId = uomId;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
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
    
    public UomType getUomTypeId() {
        return uomTypeId;
    }

    public void setUomTypeId(UomType uomTypeId) {
        this.uomTypeId = uomTypeId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uomId != null ? uomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Uom)) {
            return false;
        }
        Uom other = (Uom) object;
        if ((this.uomId == null && other.uomId != null) || (this.uomId != null && !this.uomId.equals(other.uomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Uom[ uomId=" + uomId + " ]";
    }    
}
