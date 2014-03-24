/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.inventory.model;

import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "inventory_item_trace")
@NamedQueries({
    @NamedQuery(name = "InventoryItemTrace.findAll", query = "SELECT i FROM InventoryItemTrace i")})
public class InventoryItemTrace implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INVENTORY_ITEM_TRACE_ID")
    private String inventoryItemTraceId;
    @Column(name = "RUN_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date runDatetime;
    @Column(name = "LOT_ID")
    private String lotId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryItemTrace")
    private List<InventoryItemTraceDetail> inventoryItemTraceDetailList;
    @JoinColumn(name = "RUN_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin runByUserLogin;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;

    public InventoryItemTrace() {
    }

    public InventoryItemTrace(String inventoryItemTraceId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
    }

    public String getInventoryItemTraceId() {
        return inventoryItemTraceId;
    }

    public void setInventoryItemTraceId(String inventoryItemTraceId) {
        this.inventoryItemTraceId = inventoryItemTraceId;
    }

    public Date getRunDatetime() {
        return runDatetime;
    }

    public void setRunDatetime(Date runDatetime) {
        this.runDatetime = runDatetime;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
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

    public List<InventoryItemTraceDetail> getInventoryItemTraceDetailList() {
        return inventoryItemTraceDetailList;
    }

    public void setInventoryItemTraceDetailList(List<InventoryItemTraceDetail> inventoryItemTraceDetailList) {
        this.inventoryItemTraceDetailList = inventoryItemTraceDetailList;
    }

    public UserLogin getRunByUserLogin() {
        return runByUserLogin;
    }

    public void setRunByUserLogin(UserLogin runByUserLogin) {
        this.runByUserLogin = runByUserLogin;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventoryItemTraceId != null ? inventoryItemTraceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventoryItemTrace)) {
            return false;
        }
        InventoryItemTrace other = (InventoryItemTrace) object;
        if ((this.inventoryItemTraceId == null && other.inventoryItemTraceId != null) || (this.inventoryItemTraceId != null && !this.inventoryItemTraceId.equals(other.inventoryItemTraceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InventoryItemTrace[ inventoryItemTraceId=" + inventoryItemTraceId + " ]";
    }
    
}
