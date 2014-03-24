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
@Table(name = "inventory_item_value_history")
@NamedQueries({
    @NamedQuery(name = "InventoryItemValueHistory.findAll", query = "SELECT i FROM InventoryItemValueHistory i")})
public class InventoryItemValueHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_VALUE_HIST_ID")
    private String inventoryItemValueHistId;
    @Column(name = "INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Column(name = "DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIT_COST")
    private BigDecimal unitCost;
    @Column(name = "SET_BY_USER_LOGIN")
    private String setByUserLogin;
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

    public InventoryItemValueHistory() {
    }

    public InventoryItemValueHistory(String inventoryItemValueHistId) {
        this.inventoryItemValueHistId = inventoryItemValueHistId;
    }

    public String getInventoryItemValueHistId() {
        return inventoryItemValueHistId;
    }

    public void setInventoryItemValueHistId(String inventoryItemValueHistId) {
        this.inventoryItemValueHistId = inventoryItemValueHistId;
    }

    public String getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public BigDecimal getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(BigDecimal unitCost) {
        this.unitCost = unitCost;
    }

    public String getSetByUserLogin() {
        return setByUserLogin;
    }

    public void setSetByUserLogin(String setByUserLogin) {
        this.setByUserLogin = setByUserLogin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemValueHistId != null ? inventoryItemValueHistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemValueHistory)) {
            return false;
        }
        InventoryItemValueHistory other = (InventoryItemValueHistory) object;
        if ((this.inventoryItemValueHistId == null && other.inventoryItemValueHistId != null) || (this.inventoryItemValueHistId != null && !this.inventoryItemValueHistId.equals(other.inventoryItemValueHistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemValueHistory[ inventoryItemValueHistId=" + inventoryItemValueHistId + " ]";
    }
    
}
