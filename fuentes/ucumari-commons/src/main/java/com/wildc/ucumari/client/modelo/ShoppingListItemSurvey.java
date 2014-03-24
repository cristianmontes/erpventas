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
import javax.persistence.JoinColumns;
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
@Table(name = "shopping_list_item_survey")
@NamedQueries({
    @NamedQuery(name = "ShoppingListItemSurvey.findAll", query = "SELECT s FROM ShoppingListItemSurvey s")})
public class ShoppingListItemSurvey implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShoppingListItemSurveyPK shoppingListItemSurveyPK;
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
    @JoinColumn(name = "SURVEY_RESPONSE_ID", referencedColumnName = "SURVEY_RESPONSE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyResponse surveyResponse;
    @JoinColumn(name = "SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShoppingList shoppingList;
    @JoinColumns({
        @JoinColumn(name = "SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHOPPING_LIST_ITEM_SEQ_ID", referencedColumnName = "SHOPPING_LIST_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShoppingListItem shoppingListItem;

    public ShoppingListItemSurvey() {
    }

    public ShoppingListItemSurvey(ShoppingListItemSurveyPK shoppingListItemSurveyPK) {
        this.shoppingListItemSurveyPK = shoppingListItemSurveyPK;
    }

    public ShoppingListItemSurvey(String shoppingListId, String shoppingListItemSeqId, String surveyResponseId) {
        this.shoppingListItemSurveyPK = new ShoppingListItemSurveyPK(shoppingListId, shoppingListItemSeqId, surveyResponseId);
    }

    public ShoppingListItemSurveyPK getShoppingListItemSurveyPK() {
        return shoppingListItemSurveyPK;
    }

    public void setShoppingListItemSurveyPK(ShoppingListItemSurveyPK shoppingListItemSurveyPK) {
        this.shoppingListItemSurveyPK = shoppingListItemSurveyPK;
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

    public SurveyResponse getSurveyResponse() {
        return surveyResponse;
    }

    public void setSurveyResponse(SurveyResponse surveyResponse) {
        this.surveyResponse = surveyResponse;
    }

    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    public ShoppingListItem getShoppingListItem() {
        return shoppingListItem;
    }

    public void setShoppingListItem(ShoppingListItem shoppingListItem) {
        this.shoppingListItem = shoppingListItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoppingListItemSurveyPK != null ? shoppingListItemSurveyPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingListItemSurvey)) {
            return false;
        }
        ShoppingListItemSurvey other = (ShoppingListItemSurvey) object;
        if ((this.shoppingListItemSurveyPK == null && other.shoppingListItemSurveyPK != null) || (this.shoppingListItemSurveyPK != null && !this.shoppingListItemSurveyPK.equals(other.shoppingListItemSurveyPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingListItemSurvey[ shoppingListItemSurveyPK=" + shoppingListItemSurveyPK + " ]";
    }
    
}
