/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "lot")
public class Lot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOT_ID")
    private String lotId;
    @Column(name = "CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "EXPIRATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
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
    @Lob
    @Column(name = "COMMENTS")
    private String comments;
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "SUPPLIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party supplierPartyId;
    /*@OneToMany(mappedBy = "lotId")
    private List<InventoryItem> inventoryItemList;*/

    public Lot() {
    }

    public Lot(String lotId) {
        this.lotId = lotId;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public Party getSupplierPartyId() {
        return supplierPartyId;
    }

    public void setSupplierPartyId(Party supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }
/*
    public List<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(List<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lotId != null ? lotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lot)) {
            return false;
        }
        Lot other = (Lot) object;
        if ((this.lotId == null && other.lotId != null) || (this.lotId != null && !this.lotId.equals(other.lotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Lot[ lotId=" + lotId + " ]";
    }
    
}
