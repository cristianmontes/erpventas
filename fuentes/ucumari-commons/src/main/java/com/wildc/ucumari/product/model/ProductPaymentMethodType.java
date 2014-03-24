/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.payment.model.PaymentMethodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_payment_method_type")
@NamedQueries({
    @NamedQuery(name = "ProductPaymentMethodType.findAll", query = "SELECT p FROM ProductPaymentMethodType p")})
public class ProductPaymentMethodType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductPaymentMethodTypePK productPaymentMethodTypePK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_PRICE_PURPOSE_ID", referencedColumnName = "PRODUCT_PRICE_PURPOSE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductPricePurpose productPricePurpose;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentMethodType paymentMethodType;

    public ProductPaymentMethodType() {
    }

    public ProductPaymentMethodType(ProductPaymentMethodTypePK productPaymentMethodTypePK) {
        this.productPaymentMethodTypePK = productPaymentMethodTypePK;
    }

    public ProductPaymentMethodType(String productId, String paymentMethodTypeId, String productPricePurposeId, Date fromDate) {
        this.productPaymentMethodTypePK = new ProductPaymentMethodTypePK(productId, paymentMethodTypeId, productPricePurposeId, fromDate);
    }

    public ProductPaymentMethodTypePK getProductPaymentMethodTypePK() {
        return productPaymentMethodTypePK;
    }

    public void setProductPaymentMethodTypePK(ProductPaymentMethodTypePK productPaymentMethodTypePK) {
        this.productPaymentMethodTypePK = productPaymentMethodTypePK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductPricePurpose getProductPricePurpose() {
        return productPricePurpose;
    }

    public void setProductPricePurpose(ProductPricePurpose productPricePurpose) {
        this.productPricePurpose = productPricePurpose;
    }

    public PaymentMethodType getPaymentMethodType() {
        return paymentMethodType;
    }

    public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
        this.paymentMethodType = paymentMethodType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPaymentMethodTypePK != null ? productPaymentMethodTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPaymentMethodType)) {
            return false;
        }
        ProductPaymentMethodType other = (ProductPaymentMethodType) object;
        if ((this.productPaymentMethodTypePK == null && other.productPaymentMethodTypePK != null) || (this.productPaymentMethodTypePK != null && !this.productPaymentMethodTypePK.equals(other.productPaymentMethodTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPaymentMethodType[ productPaymentMethodTypePK=" + productPaymentMethodTypePK + " ]";
    }
    
}
