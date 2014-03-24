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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.CustomMethod;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.payment.model.PaymentGatewayConfig;
import com.wildc.ucumari.payment.model.PaymentMethodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_payment_setting")
@NamedQueries({
    @NamedQuery(name = "ProductStorePaymentSetting.findAll", query = "SELECT p FROM ProductStorePaymentSetting p")})
public class ProductStorePaymentSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStorePaymentSettingPK productStorePaymentSettingPK;
    @Column(name = "PAYMENT_SERVICE")
    private String paymentService;
    @Column(name = "PAYMENT_PROPERTIES_PATH")
    private String paymentPropertiesPath;
    @Column(name = "APPLY_TO_ALL_PRODUCTS")
    private Character applyToAllProducts;
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
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "PAYMENT_METHOD_TYPE_ID", referencedColumnName = "PAYMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PaymentMethodType paymentMethodType;
    @JoinColumn(name = "PAYMENT_GATEWAY_CONFIG_ID", referencedColumnName = "PAYMENT_GATEWAY_CONFIG_ID")
    @ManyToOne
    private PaymentGatewayConfig paymentGatewayConfigId;
    @JoinColumn(name = "PAYMENT_SERVICE_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enumeration enumeration;
    @JoinColumn(name = "PAYMENT_CUSTOM_METHOD_ID", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod paymentCustomMethodId;

    public ProductStorePaymentSetting() {
    }

    public ProductStorePaymentSetting(ProductStorePaymentSettingPK productStorePaymentSettingPK) {
        this.productStorePaymentSettingPK = productStorePaymentSettingPK;
    }

    public ProductStorePaymentSetting(String productStoreId, String paymentMethodTypeId, String paymentServiceTypeEnumId) {
        this.productStorePaymentSettingPK = new ProductStorePaymentSettingPK(productStoreId, paymentMethodTypeId, paymentServiceTypeEnumId);
    }

    public ProductStorePaymentSettingPK getProductStorePaymentSettingPK() {
        return productStorePaymentSettingPK;
    }

    public void setProductStorePaymentSettingPK(ProductStorePaymentSettingPK productStorePaymentSettingPK) {
        this.productStorePaymentSettingPK = productStorePaymentSettingPK;
    }

    public String getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(String paymentService) {
        this.paymentService = paymentService;
    }

    public String getPaymentPropertiesPath() {
        return paymentPropertiesPath;
    }

    public void setPaymentPropertiesPath(String paymentPropertiesPath) {
        this.paymentPropertiesPath = paymentPropertiesPath;
    }

    public Character getApplyToAllProducts() {
        return applyToAllProducts;
    }

    public void setApplyToAllProducts(Character applyToAllProducts) {
        this.applyToAllProducts = applyToAllProducts;
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

    public PaymentGatewayConfig getPaymentGatewayConfigId() {
        return paymentGatewayConfigId;
    }

    public void setPaymentGatewayConfigId(PaymentGatewayConfig paymentGatewayConfigId) {
        this.paymentGatewayConfigId = paymentGatewayConfigId;
    }

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public CustomMethod getPaymentCustomMethodId() {
        return paymentCustomMethodId;
    }

    public void setPaymentCustomMethodId(CustomMethod paymentCustomMethodId) {
        this.paymentCustomMethodId = paymentCustomMethodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStorePaymentSettingPK != null ? productStorePaymentSettingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStorePaymentSetting)) {
            return false;
        }
        ProductStorePaymentSetting other = (ProductStorePaymentSetting) object;
        if ((this.productStorePaymentSettingPK == null && other.productStorePaymentSettingPK != null) || (this.productStorePaymentSettingPK != null && !this.productStorePaymentSettingPK.equals(other.productStorePaymentSettingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStorePaymentSetting[ productStorePaymentSettingPK=" + productStorePaymentSettingPK + " ]";
    }
    
}
