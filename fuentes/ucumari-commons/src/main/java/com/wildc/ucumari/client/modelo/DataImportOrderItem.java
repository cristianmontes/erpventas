/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "data_import_order_item")
@NamedQueries({
    @NamedQuery(name = "DataImportOrderItem.findAll", query = "SELECT d FROM DataImportOrderItem d")})
public class DataImportOrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImportOrderItemPK dataImportOrderItemPK;
    @Column(name = "GOOD_IDENTIFICATION_TYPE_ID")
    private String goodIdentificationTypeId;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "PRODUCT_SKU")
    private String productSku;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY_SHIPPED")
    private BigDecimal quantityShipped;
    @Column(name = "ITEM_TAX")
    private BigDecimal itemTax;
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Column(name = "ITEM_ADJUSTMENTS_TOTAL")
    private BigDecimal itemAdjustmentsTotal;
    @Column(name = "CUSTOMER_PO")
    private String customerPo;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
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

    public DataImportOrderItem() {
    }

    public DataImportOrderItem(DataImportOrderItemPK dataImportOrderItemPK) {
        this.dataImportOrderItemPK = dataImportOrderItemPK;
    }

    public DataImportOrderItem(String orderId, String productId, BigDecimal quantity, BigDecimal price) {
        this.dataImportOrderItemPK = new DataImportOrderItemPK(orderId, productId, quantity, price);
    }

    public DataImportOrderItemPK getDataImportOrderItemPK() {
        return dataImportOrderItemPK;
    }

    public void setDataImportOrderItemPK(DataImportOrderItemPK dataImportOrderItemPK) {
        this.dataImportOrderItemPK = dataImportOrderItemPK;
    }

    public String getGoodIdentificationTypeId() {
        return goodIdentificationTypeId;
    }

    public void setGoodIdentificationTypeId(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSku() {
        return productSku;
    }

    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }

    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    }

    public void setQuantityShipped(BigDecimal quantityShipped) {
        this.quantityShipped = quantityShipped;
    }

    public BigDecimal getItemTax() {
        return itemTax;
    }

    public void setItemTax(BigDecimal itemTax) {
        this.itemTax = itemTax;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }

    public BigDecimal getItemAdjustmentsTotal() {
        return itemAdjustmentsTotal;
    }

    public void setItemAdjustmentsTotal(BigDecimal itemAdjustmentsTotal) {
        this.itemAdjustmentsTotal = itemAdjustmentsTotal;
    }

    public String getCustomerPo() {
        return customerPo;
    }

    public void setCustomerPo(String customerPo) {
        this.customerPo = customerPo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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
        hash += (dataImportOrderItemPK != null ? dataImportOrderItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportOrderItem)) {
            return false;
        }
        DataImportOrderItem other = (DataImportOrderItem) object;
        if ((this.dataImportOrderItemPK == null && other.dataImportOrderItemPK != null) || (this.dataImportOrderItemPK != null && !this.dataImportOrderItemPK.equals(other.dataImportOrderItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportOrderItem[ dataImportOrderItemPK=" + dataImportOrderItemPK + " ]";
    }
    
}
