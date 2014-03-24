/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
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

import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shopping_list_item")
@NamedQueries({
    @NamedQuery(name = "ShoppingListItem.findAll", query = "SELECT s FROM ShoppingListItem s")})
public class ShoppingListItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShoppingListItemPK shoppingListItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "RESERV_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservStart;
    @Column(name = "RESERV_LENGTH")
    private BigDecimal reservLength;
    @Column(name = "RESERV_PERSONS")
    private BigDecimal reservPersons;
    @Column(name = "QUANTITY_PURCHASED")
    private BigDecimal quantityPurchased;
    @Column(name = "CONFIG_ID")
    private String configId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingListItem")
    private List<ShoppingListItemSurvey> shoppingListItemSurveyList;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShoppingList shoppingList;

    public ShoppingListItem() {
    }

    public ShoppingListItem(ShoppingListItemPK shoppingListItemPK) {
        this.shoppingListItemPK = shoppingListItemPK;
    }

    public ShoppingListItem(String shoppingListId, String shoppingListItemSeqId) {
        this.shoppingListItemPK = new ShoppingListItemPK(shoppingListId, shoppingListItemSeqId);
    }

    public ShoppingListItemPK getShoppingListItemPK() {
        return shoppingListItemPK;
    }

    public void setShoppingListItemPK(ShoppingListItemPK shoppingListItemPK) {
        this.shoppingListItemPK = shoppingListItemPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getReservStart() {
        return reservStart;
    }

    public void setReservStart(Date reservStart) {
        this.reservStart = reservStart;
    }

    public BigDecimal getReservLength() {
        return reservLength;
    }

    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public BigDecimal getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(BigDecimal quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
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

    public List<ShoppingListItemSurvey> getShoppingListItemSurveyList() {
        return shoppingListItemSurveyList;
    }

    public void setShoppingListItemSurveyList(List<ShoppingListItemSurvey> shoppingListItemSurveyList) {
        this.shoppingListItemSurveyList = shoppingListItemSurveyList;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
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
        hash += (shoppingListItemPK != null ? shoppingListItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingListItem)) {
            return false;
        }
        ShoppingListItem other = (ShoppingListItem) object;
        if ((this.shoppingListItemPK == null && other.shoppingListItemPK != null) || (this.shoppingListItemPK != null && !this.shoppingListItemPK.equals(other.shoppingListItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingListItem[ shoppingListItemPK=" + shoppingListItemPK + " ]";
    }
    
}
