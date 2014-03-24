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
public class ShoppingListItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SHOPPING_LIST_ID")
    private String shoppingListId;
    @Basic(optional = false)
    @Column(name = "SHOPPING_LIST_ITEM_SEQ_ID")
    private String shoppingListItemSeqId;

    public ShoppingListItemPK() {
    }

    public ShoppingListItemPK(String shoppingListId, String shoppingListItemSeqId) {
        this.shoppingListId = shoppingListId;
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListItemSeqId() {
        return shoppingListItemSeqId;
    }

    public void setShoppingListItemSeqId(String shoppingListItemSeqId) {
        this.shoppingListItemSeqId = shoppingListItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoppingListId != null ? shoppingListId.hashCode() : 0);
        hash += (shoppingListItemSeqId != null ? shoppingListItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingListItemPK)) {
            return false;
        }
        ShoppingListItemPK other = (ShoppingListItemPK) object;
        if ((this.shoppingListId == null && other.shoppingListId != null) || (this.shoppingListId != null && !this.shoppingListId.equals(other.shoppingListId))) {
            return false;
        }
        if ((this.shoppingListItemSeqId == null && other.shoppingListItemSeqId != null) || (this.shoppingListItemSeqId != null && !this.shoppingListItemSeqId.equals(other.shoppingListItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingListItemPK[ shoppingListId=" + shoppingListId + ", shoppingListItemSeqId=" + shoppingListItemSeqId + " ]";
    }
    
}
