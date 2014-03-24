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
@Table(name = "data_import_shopping_list_item")
@NamedQueries({
    @NamedQuery(name = "DataImportShoppingListItem.findAll", query = "SELECT d FROM DataImportShoppingListItem d")})
public class DataImportShoppingListItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImportShoppingListItemPK dataImportShoppingListItemPK;
    @Column(name = "QUANTITY")
    private String quantity;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
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

    public DataImportShoppingListItem() {
    }

    public DataImportShoppingListItem(DataImportShoppingListItemPK dataImportShoppingListItemPK) {
        this.dataImportShoppingListItemPK = dataImportShoppingListItemPK;
    }

    public DataImportShoppingListItem(String partyId, String productId) {
        this.dataImportShoppingListItemPK = new DataImportShoppingListItemPK(partyId, productId);
    }

    public DataImportShoppingListItemPK getDataImportShoppingListItemPK() {
        return dataImportShoppingListItemPK;
    }

    public void setDataImportShoppingListItemPK(DataImportShoppingListItemPK dataImportShoppingListItemPK) {
        this.dataImportShoppingListItemPK = dataImportShoppingListItemPK;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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
        hash += (dataImportShoppingListItemPK != null ? dataImportShoppingListItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportShoppingListItem)) {
            return false;
        }
        DataImportShoppingListItem other = (DataImportShoppingListItem) object;
        if ((this.dataImportShoppingListItemPK == null && other.dataImportShoppingListItemPK != null) || (this.dataImportShoppingListItemPK != null && !this.dataImportShoppingListItemPK.equals(other.dataImportShoppingListItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportShoppingListItem[ dataImportShoppingListItemPK=" + dataImportShoppingListItemPK + " ]";
    }
    
}
