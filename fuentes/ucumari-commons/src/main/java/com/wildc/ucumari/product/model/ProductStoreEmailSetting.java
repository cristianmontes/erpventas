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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_email_setting")
@NamedQueries({
    @NamedQuery(name = "ProductStoreEmailSetting.findAll", query = "SELECT p FROM ProductStoreEmailSetting p")})
public class ProductStoreEmailSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreEmailSettingPK productStoreEmailSettingPK;
    @Column(name = "BODY_SCREEN_LOCATION")
    private String bodyScreenLocation;
    @Column(name = "XSLFO_ATTACH_SCREEN_LOCATION")
    private String xslfoAttachScreenLocation;
    @Column(name = "FROM_ADDRESS")
    private String fromAddress;
    @Column(name = "CC_ADDRESS")
    private String ccAddress;
    @Column(name = "BCC_ADDRESS")
    private String bccAddress;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "CONTENT_TYPE")
    private String contentType;
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
    @Column(name = "WITH_ATTACHMENT")
    private Character withAttachment;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "EMAIL_TYPE", referencedColumnName = "ENUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enumeration enumeration;

    public ProductStoreEmailSetting() {
    }

    public ProductStoreEmailSetting(ProductStoreEmailSettingPK productStoreEmailSettingPK) {
        this.productStoreEmailSettingPK = productStoreEmailSettingPK;
    }

    public ProductStoreEmailSetting(String productStoreId, String emailType) {
        this.productStoreEmailSettingPK = new ProductStoreEmailSettingPK(productStoreId, emailType);
    }

    public ProductStoreEmailSettingPK getProductStoreEmailSettingPK() {
        return productStoreEmailSettingPK;
    }

    public void setProductStoreEmailSettingPK(ProductStoreEmailSettingPK productStoreEmailSettingPK) {
        this.productStoreEmailSettingPK = productStoreEmailSettingPK;
    }

    public String getBodyScreenLocation() {
        return bodyScreenLocation;
    }

    public void setBodyScreenLocation(String bodyScreenLocation) {
        this.bodyScreenLocation = bodyScreenLocation;
    }

    public String getXslfoAttachScreenLocation() {
        return xslfoAttachScreenLocation;
    }

    public void setXslfoAttachScreenLocation(String xslfoAttachScreenLocation) {
        this.xslfoAttachScreenLocation = xslfoAttachScreenLocation;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    public String getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
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

    public Character getWithAttachment() {
        return withAttachment;
    }

    public void setWithAttachment(Character withAttachment) {
        this.withAttachment = withAttachment;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
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
        hash += (productStoreEmailSettingPK != null ? productStoreEmailSettingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreEmailSetting)) {
            return false;
        }
        ProductStoreEmailSetting other = (ProductStoreEmailSetting) object;
        if ((this.productStoreEmailSettingPK == null && other.productStoreEmailSettingPK != null) || (this.productStoreEmailSettingPK != null && !this.productStoreEmailSettingPK.equals(other.productStoreEmailSettingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreEmailSetting[ productStoreEmailSettingPK=" + productStoreEmailSettingPK + " ]";
    }
    
}
