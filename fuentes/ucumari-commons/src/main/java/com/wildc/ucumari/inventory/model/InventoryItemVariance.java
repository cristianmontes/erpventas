/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import com.wildc.ucumari.accounting.model.AcctgTrans;
import com.wildc.ucumari.client.modelo.VarianceReason;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "inventory_item_variance")
@NamedQueries({
    @NamedQuery(name = "InventoryItemVariance.findAll", query = "SELECT i FROM InventoryItemVariance i")})
public class InventoryItemVariance implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemVariancePK inventoryItemVariancePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AVAILABLE_TO_PROMISE_VAR")
    private BigDecimal availableToPromiseVar;
    @Column(name = "QUANTITY_ON_HAND_VAR")
    private BigDecimal quantityOnHandVar;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "VARIANCE_REASON_ID", referencedColumnName = "VARIANCE_REASON_ID")
    @ManyToOne
    private VarianceReason varianceReasonId;
    @JoinColumn(name = "PHYSICAL_INVENTORY_ID", referencedColumnName = "PHYSICAL_INVENTORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PhysicalInventory physicalInventory;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;
    @OneToMany(mappedBy = "inventoryItemVariance")
    private List<AcctgTrans> acctgTransList;

    public InventoryItemVariance() {
    }

    public InventoryItemVariance(InventoryItemVariancePK inventoryItemVariancePK) {
        this.inventoryItemVariancePK = inventoryItemVariancePK;
    }

    public InventoryItemVariance(String inventoryItemId, String physicalInventoryId) {
        this.inventoryItemVariancePK = new InventoryItemVariancePK(inventoryItemId, physicalInventoryId);
    }

    public InventoryItemVariancePK getInventoryItemVariancePK() {
        return inventoryItemVariancePK;
    }

    public void setInventoryItemVariancePK(InventoryItemVariancePK inventoryItemVariancePK) {
        this.inventoryItemVariancePK = inventoryItemVariancePK;
    }

    public BigDecimal getAvailableToPromiseVar() {
        return availableToPromiseVar;
    }

    public void setAvailableToPromiseVar(BigDecimal availableToPromiseVar) {
        this.availableToPromiseVar = availableToPromiseVar;
    }

    public BigDecimal getQuantityOnHandVar() {
        return quantityOnHandVar;
    }

    public void setQuantityOnHandVar(BigDecimal quantityOnHandVar) {
        this.quantityOnHandVar = quantityOnHandVar;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public VarianceReason getVarianceReasonId() {
        return varianceReasonId;
    }

    public void setVarianceReasonId(VarianceReason varianceReasonId) {
        this.varianceReasonId = varianceReasonId;
    }

    public PhysicalInventory getPhysicalInventory() {
        return physicalInventory;
    }

    public void setPhysicalInventory(PhysicalInventory physicalInventory) {
        this.physicalInventory = physicalInventory;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemVariancePK != null ? inventoryItemVariancePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemVariance)) {
            return false;
        }
        InventoryItemVariance other = (InventoryItemVariance) object;
        if ((this.inventoryItemVariancePK == null && other.inventoryItemVariancePK != null) || (this.inventoryItemVariancePK != null && !this.inventoryItemVariancePK.equals(other.inventoryItemVariancePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemVariance[ inventoryItemVariancePK=" + inventoryItemVariancePK + " ]";
    }
    
}
