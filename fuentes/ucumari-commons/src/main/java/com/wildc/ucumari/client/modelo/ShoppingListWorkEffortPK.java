/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ShoppingListWorkEffortPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHOPPING_LIST_ID")
    private String shoppingListId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;

    public ShoppingListWorkEffortPK() {
    }

    public ShoppingListWorkEffortPK(String shoppingListId, String workEffortId) {
        this.shoppingListId = shoppingListId;
        this.workEffortId = workEffortId;
    }

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoppingListId != null ? shoppingListId.hashCode() : 0);
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingListWorkEffortPK)) {
            return false;
        }
        ShoppingListWorkEffortPK other = (ShoppingListWorkEffortPK) object;
        if ((this.shoppingListId == null && other.shoppingListId != null) || (this.shoppingListId != null && !this.shoppingListId.equals(other.shoppingListId))) {
            return false;
        }
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingListWorkEffortPK[ shoppingListId=" + shoppingListId + ", workEffortId=" + workEffortId + " ]";
    }
    
}
