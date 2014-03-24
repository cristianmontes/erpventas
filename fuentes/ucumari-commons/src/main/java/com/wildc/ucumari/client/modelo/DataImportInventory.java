/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "data_import_inventory")
@NamedQueries({
    @NamedQuery(name = "DataImportInventory.findAll", query = "SELECT d FROM DataImportInventory d")})
public class DataImportInventory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEM_ID")
    private String itemId;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "FACILITY_ID")
    private String facilityId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AVAILABLE_TO_PROMISE")
    private BigDecimal availableToPromise;
    @Column(name = "ON_HAND")
    private BigDecimal onHand;
    @Column(name = "MINIMUM_STOCK")
    private BigDecimal minimumStock;
    @Column(name = "REORDER_QUANTITY")
    private BigDecimal reorderQuantity;
    @Column(name = "DAYS_TO_SHIP")
    private BigDecimal daysToShip;
    @Column(name = "INVENTORY_VALUE")
    private BigDecimal inventoryValue;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
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

    public DataImportInventory() {
    }

    public DataImportInventory(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public BigDecimal getAvailableToPromise() {
        return availableToPromise;
    }

    public void setAvailableToPromise(BigDecimal availableToPromise) {
        this.availableToPromise = availableToPromise;
    }

    public BigDecimal getOnHand() {
        return onHand;
    }

    public void setOnHand(BigDecimal onHand) {
        this.onHand = onHand;
    }

    public BigDecimal getMinimumStock() {
        return minimumStock;
    }

    public void setMinimumStock(BigDecimal minimumStock) {
        this.minimumStock = minimumStock;
    }

    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigDecimal getDaysToShip() {
        return daysToShip;
    }

    public void setDaysToShip(BigDecimal daysToShip) {
        this.daysToShip = daysToShip;
    }

    public BigDecimal getInventoryValue() {
        return inventoryValue;
    }

    public void setInventoryValue(BigDecimal inventoryValue) {
        this.inventoryValue = inventoryValue;
    }

    public String getImportStatusId() {
        return importStatusId;
    }

    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportInventory)) {
            return false;
        }
        DataImportInventory other = (DataImportInventory) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportInventory[ itemId=" + itemId + " ]";
    }
    
}
