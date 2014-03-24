/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "cost_component_type_attr")
@NamedQueries({
    @NamedQuery(name = "CostComponentTypeAttr.findAll", query = "SELECT c FROM CostComponentTypeAttr c")})
public class CostComponentTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostComponentTypeAttrPK costComponentTypeAttrPK;
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
    @JoinColumn(name = "COST_COMPONENT_TYPE_ID", referencedColumnName = "COST_COMPONENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CostComponentType costComponentType;

    public CostComponentTypeAttr() {
    }

    public CostComponentTypeAttr(CostComponentTypeAttrPK costComponentTypeAttrPK) {
        this.costComponentTypeAttrPK = costComponentTypeAttrPK;
    }

    public CostComponentTypeAttr(String costComponentTypeId, String attrName) {
        this.costComponentTypeAttrPK = new CostComponentTypeAttrPK(costComponentTypeId, attrName);
    }

    public CostComponentTypeAttrPK getCostComponentTypeAttrPK() {
        return costComponentTypeAttrPK;
    }

    public void setCostComponentTypeAttrPK(CostComponentTypeAttrPK costComponentTypeAttrPK) {
        this.costComponentTypeAttrPK = costComponentTypeAttrPK;
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

    public CostComponentType getCostComponentType() {
        return costComponentType;
    }

    public void setCostComponentType(CostComponentType costComponentType) {
        this.costComponentType = costComponentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costComponentTypeAttrPK != null ? costComponentTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentTypeAttr)) {
            return false;
        }
        CostComponentTypeAttr other = (CostComponentTypeAttr) object;
        if ((this.costComponentTypeAttrPK == null && other.costComponentTypeAttrPK != null) || (this.costComponentTypeAttrPK != null && !this.costComponentTypeAttrPK.equals(other.costComponentTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentTypeAttr[ costComponentTypeAttrPK=" + costComponentTypeAttrPK + " ]";
    }
    
}
