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
@Table(name = "cost_component_attribute")
@NamedQueries({
    @NamedQuery(name = "CostComponentAttribute.findAll", query = "SELECT c FROM CostComponentAttribute c")})
public class CostComponentAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostComponentAttributePK costComponentAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "COST_COMPONENT_ID", referencedColumnName = "COST_COMPONENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CostComponent costComponent;

    public CostComponentAttribute() {
    }

    public CostComponentAttribute(CostComponentAttributePK costComponentAttributePK) {
        this.costComponentAttributePK = costComponentAttributePK;
    }

    public CostComponentAttribute(String costComponentId, String attrName) {
        this.costComponentAttributePK = new CostComponentAttributePK(costComponentId, attrName);
    }

    public CostComponentAttributePK getCostComponentAttributePK() {
        return costComponentAttributePK;
    }

    public void setCostComponentAttributePK(CostComponentAttributePK costComponentAttributePK) {
        this.costComponentAttributePK = costComponentAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public CostComponent getCostComponent() {
        return costComponent;
    }

    public void setCostComponent(CostComponent costComponent) {
        this.costComponent = costComponent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costComponentAttributePK != null ? costComponentAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentAttribute)) {
            return false;
        }
        CostComponentAttribute other = (CostComponentAttribute) object;
        if ((this.costComponentAttributePK == null && other.costComponentAttributePK != null) || (this.costComponentAttributePK != null && !this.costComponentAttributePK.equals(other.costComponentAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentAttribute[ costComponentAttributePK=" + costComponentAttributePK + " ]";
    }
    
}
