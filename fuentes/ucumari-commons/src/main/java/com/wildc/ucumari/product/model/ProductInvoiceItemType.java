/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

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
@Table(name = "product_invoice_item_type")
@NamedQueries({
    @NamedQuery(name = "ProductInvoiceItemType.findAll", query = "SELECT p FROM ProductInvoiceItemType p")})
public class ProductInvoiceItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductInvoiceItemTypePK productInvoiceItemTypePK;
    @Column(name = "INVOICE_ITEM_TYPE_ID")
    private String invoiceItemTypeId;
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

    public ProductInvoiceItemType() {
    }

    public ProductInvoiceItemType(ProductInvoiceItemTypePK productInvoiceItemTypePK) {
        this.productInvoiceItemTypePK = productInvoiceItemTypePK;
    }

    public ProductInvoiceItemType(String productTypeId, String invoiceTypeId) {
        this.productInvoiceItemTypePK = new ProductInvoiceItemTypePK(productTypeId, invoiceTypeId);
    }

    public ProductInvoiceItemTypePK getProductInvoiceItemTypePK() {
        return productInvoiceItemTypePK;
    }

    public void setProductInvoiceItemTypePK(ProductInvoiceItemTypePK productInvoiceItemTypePK) {
        this.productInvoiceItemTypePK = productInvoiceItemTypePK;
    }

    public String getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(String invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
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
        hash += (productInvoiceItemTypePK != null ? productInvoiceItemTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductInvoiceItemType)) {
            return false;
        }
        ProductInvoiceItemType other = (ProductInvoiceItemType) object;
        if ((this.productInvoiceItemTypePK == null && other.productInvoiceItemTypePK != null) || (this.productInvoiceItemTypePK != null && !this.productInvoiceItemTypePK.equals(other.productInvoiceItemTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductInvoiceItemType[ productInvoiceItemTypePK=" + productInvoiceItemTypePK + " ]";
    }
    
}
