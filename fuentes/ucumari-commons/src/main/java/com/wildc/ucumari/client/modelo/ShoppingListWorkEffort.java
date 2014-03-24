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
@Table(name = "shopping_list_work_effort")
@NamedQueries({
    @NamedQuery(name = "ShoppingListWorkEffort.findAll", query = "SELECT s FROM ShoppingListWorkEffort s")})
public class ShoppingListWorkEffort implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShoppingListWorkEffortPK shoppingListWorkEffortPK;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShoppingList shoppingList;

    public ShoppingListWorkEffort() {
    }

    public ShoppingListWorkEffort(ShoppingListWorkEffortPK shoppingListWorkEffortPK) {
        this.shoppingListWorkEffortPK = shoppingListWorkEffortPK;
    }

    public ShoppingListWorkEffort(String shoppingListId, String workEffortId) {
        this.shoppingListWorkEffortPK = new ShoppingListWorkEffortPK(shoppingListId, workEffortId);
    }

    public ShoppingListWorkEffortPK getShoppingListWorkEffortPK() {
        return shoppingListWorkEffortPK;
    }

    public void setShoppingListWorkEffortPK(ShoppingListWorkEffortPK shoppingListWorkEffortPK) {
        this.shoppingListWorkEffortPK = shoppingListWorkEffortPK;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoppingListWorkEffortPK != null ? shoppingListWorkEffortPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingListWorkEffort)) {
            return false;
        }
        ShoppingListWorkEffort other = (ShoppingListWorkEffort) object;
        if ((this.shoppingListWorkEffortPK == null && other.shoppingListWorkEffortPK != null) || (this.shoppingListWorkEffortPK != null && !this.shoppingListWorkEffortPK.equals(other.shoppingListWorkEffortPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingListWorkEffort[ shoppingListWorkEffortPK=" + shoppingListWorkEffortPK + " ]";
    }
    
}
