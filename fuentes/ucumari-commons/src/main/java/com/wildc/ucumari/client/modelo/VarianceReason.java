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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItemVariance;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "variance_reason")
@NamedQueries({
    @NamedQuery(name = "VarianceReason.findAll", query = "SELECT v FROM VarianceReason v")})
public class VarianceReason implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "varianceReason")
    private List<VarianceReasonGlAccount> varianceReasonGlAccountList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VARIANCE_REASON_ID")
    private String varianceReasonId;
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
    @OneToMany(mappedBy = "varianceReasonId")
    private List<InventoryItemVariance> inventoryItemVarianceList;

    public VarianceReason() {
    }

    public VarianceReason(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
    }

    public String getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(String varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
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

    public List<InventoryItemVariance> getInventoryItemVarianceList() {
        return inventoryItemVarianceList;
    }

    public void setInventoryItemVarianceList(List<InventoryItemVariance> inventoryItemVarianceList) {
        this.inventoryItemVarianceList = inventoryItemVarianceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (varianceReasonId != null ? varianceReasonId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VarianceReason)) {
            return false;
        }
        VarianceReason other = (VarianceReason) object;
        if ((this.varianceReasonId == null && other.varianceReasonId != null) || (this.varianceReasonId != null && !this.varianceReasonId.equals(other.varianceReasonId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VarianceReason[ varianceReasonId=" + varianceReasonId + " ]";
    }

    public List<VarianceReasonGlAccount> getVarianceReasonGlAccountList() {
        return varianceReasonGlAccountList;
    }

    public void setVarianceReasonGlAccountList(List<VarianceReasonGlAccount> varianceReasonGlAccountList) {
        this.varianceReasonGlAccountList = varianceReasonGlAccountList;
    }
    
}
