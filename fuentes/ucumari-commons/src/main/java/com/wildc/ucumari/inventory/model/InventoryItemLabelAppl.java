/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "inventory_item_label_appl")
@NamedQueries({
    @NamedQuery(name = "InventoryItemLabelAppl.findAll", query = "SELECT i FROM InventoryItemLabelAppl i")})
public class InventoryItemLabelAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventoryItemLabelApplPK inventoryItemLabelApplPK;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "INVENTORY_ITEM_LABEL_TYPE_ID", referencedColumnName = "INVENTORY_ITEM_LABEL_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItemLabelType inventoryItemLabelType;
    @JoinColumn(name = "INVENTORY_ITEM_LABEL_ID", referencedColumnName = "INVENTORY_ITEM_LABEL_ID")
    @ManyToOne
    private InventoryItemLabel inventoryItemLabelId;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private InventoryItem inventoryItem;

    public InventoryItemLabelAppl() {
    }

    public InventoryItemLabelAppl(InventoryItemLabelApplPK inventoryItemLabelApplPK) {
        this.inventoryItemLabelApplPK = inventoryItemLabelApplPK;
    }

    public InventoryItemLabelAppl(String inventoryItemId, String inventoryItemLabelTypeId) {
        this.inventoryItemLabelApplPK = new InventoryItemLabelApplPK(inventoryItemId, inventoryItemLabelTypeId);
    }

    public InventoryItemLabelApplPK getInventoryItemLabelApplPK() {
        return inventoryItemLabelApplPK;
    }

    public void setInventoryItemLabelApplPK(InventoryItemLabelApplPK inventoryItemLabelApplPK) {
        this.inventoryItemLabelApplPK = inventoryItemLabelApplPK;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public InventoryItemLabelType getInventoryItemLabelType() {
        return inventoryItemLabelType;
    }

    public void setInventoryItemLabelType(InventoryItemLabelType inventoryItemLabelType) {
        this.inventoryItemLabelType = inventoryItemLabelType;
    }

    public InventoryItemLabel getInventoryItemLabelId() {
        return inventoryItemLabelId;
    }

    public void setInventoryItemLabelId(InventoryItemLabel inventoryItemLabelId) {
        this.inventoryItemLabelId = inventoryItemLabelId;
    }

    public InventoryItem getInventoryItem() {
        return inventoryItem;
    }

    public void setInventoryItem(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemLabelApplPK != null ? inventoryItemLabelApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemLabelAppl)) {
            return false;
        }
        InventoryItemLabelAppl other = (InventoryItemLabelAppl) object;
        if ((this.inventoryItemLabelApplPK == null && other.inventoryItemLabelApplPK != null) || (this.inventoryItemLabelApplPK != null && !this.inventoryItemLabelApplPK.equals(other.inventoryItemLabelApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemLabelAppl[ inventoryItemLabelApplPK=" + inventoryItemLabelApplPK + " ]";
    }
    
}
