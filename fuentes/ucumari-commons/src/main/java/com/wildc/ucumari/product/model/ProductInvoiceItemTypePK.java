/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductInvoiceItemTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_TYPE_ID")
    private String productTypeId;
    @Basic(optional = false)
    @Column(name = "INVOICE_TYPE_ID")
    private String invoiceTypeId;

    public ProductInvoiceItemTypePK() {
    }

    public ProductInvoiceItemTypePK(String productTypeId, String invoiceTypeId) {
        this.productTypeId = productTypeId;
        this.invoiceTypeId = invoiceTypeId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getInvoiceTypeId() {
        return invoiceTypeId;
    }

    public void setInvoiceTypeId(String invoiceTypeId) {
        this.invoiceTypeId = invoiceTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeId != null ? productTypeId.hashCode() : 0);
        hash += (invoiceTypeId != null ? invoiceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductInvoiceItemTypePK)) {
            return false;
        }
        ProductInvoiceItemTypePK other = (ProductInvoiceItemTypePK) object;
        if ((this.productTypeId == null && other.productTypeId != null) || (this.productTypeId != null && !this.productTypeId.equals(other.productTypeId))) {
            return false;
        }
        if ((this.invoiceTypeId == null && other.invoiceTypeId != null) || (this.invoiceTypeId != null && !this.invoiceTypeId.equals(other.invoiceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductInvoiceItemTypePK[ productTypeId=" + productTypeId + ", invoiceTypeId=" + invoiceTypeId + " ]";
    }
    
}
