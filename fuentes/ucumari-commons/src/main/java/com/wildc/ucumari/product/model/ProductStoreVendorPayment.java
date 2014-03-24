/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentMethodType;

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
@Table(name = "product_store_vendor_payment")
@NamedQueries({
    @NamedQuery(name = "ProductStoreVendorPayment.findAll", query = "SELECT p FROM ProductStoreVendorPayment p")})
public class ProductStoreVendorPayment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreVendorPaymentPK productStoreVendorPaymentPK;
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
    @JoinColumn(name = "VENDOR_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentMethodType paymentMethodType;
    @JoinColumn(name = "CREDIT_CARD_ENUM_ID", referencedColumnName = "ENUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enumeration enumeration;

    public ProductStoreVendorPayment() {
    }

    public ProductStoreVendorPayment(ProductStoreVendorPaymentPK productStoreVendorPaymentPK) {
        this.productStoreVendorPaymentPK = productStoreVendorPaymentPK;
    }

    public ProductStoreVendorPayment(String productStoreId, String vendorPartyId, String paymentMethodTypeId, String creditCardEnumId) {
        this.productStoreVendorPaymentPK = new ProductStoreVendorPaymentPK(productStoreId, vendorPartyId, paymentMethodTypeId, creditCardEnumId);
    }

    public ProductStoreVendorPaymentPK getProductStoreVendorPaymentPK() {
        return productStoreVendorPaymentPK;
    }

    public void setProductStoreVendorPaymentPK(ProductStoreVendorPaymentPK productStoreVendorPaymentPK) {
        this.productStoreVendorPaymentPK = productStoreVendorPaymentPK;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreVendorPaymentPK != null ? productStoreVendorPaymentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreVendorPayment)) {
            return false;
        }
        ProductStoreVendorPayment other = (ProductStoreVendorPayment) object;
        if ((this.productStoreVendorPaymentPK == null && other.productStoreVendorPaymentPK != null) || (this.productStoreVendorPaymentPK != null && !this.productStoreVendorPaymentPK.equals(other.productStoreVendorPaymentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreVendorPayment[ productStoreVendorPaymentPK=" + productStoreVendorPaymentPK + " ]";
    }
    
}
