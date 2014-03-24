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
import javax.persistence.Lob;
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
@Table(name = "product_config")
@NamedQueries({
    @NamedQuery(name = "ProductConfig.findAll", query = "SELECT p FROM ProductConfig p")})
public class ProductConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigPK productConfigPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "CONFIG_TYPE_ID")
    private String configTypeId;
    @Column(name = "DEFAULT_CONFIG_OPTION_ID")
    private String defaultConfigOptionId;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "IS_MANDATORY")
    private Character isMandatory;
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
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;

    public ProductConfig() {
    }

    public ProductConfig(ProductConfigPK productConfigPK) {
        this.productConfigPK = productConfigPK;
    }

    public ProductConfig(String productId, String configItemId, BigInteger sequenceNum, Date fromDate) {
        this.productConfigPK = new ProductConfigPK(productId, configItemId, sequenceNum, fromDate);
    }

    public ProductConfigPK getProductConfigPK() {
        return productConfigPK;
    }

    public void setProductConfigPK(ProductConfigPK productConfigPK) {
        this.productConfigPK = productConfigPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(String configTypeId) {
        this.configTypeId = configTypeId;
    }

    public String getDefaultConfigOptionId() {
        return defaultConfigOptionId;
    }

    public void setDefaultConfigOptionId(String defaultConfigOptionId) {
        this.defaultConfigOptionId = defaultConfigOptionId;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Character getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Character isMandatory) {
        this.isMandatory = isMandatory;
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

    public ProductConfigItem getProductConfigItem() {
        return productConfigItem;
    }

    public void setProductConfigItem(ProductConfigItem productConfigItem) {
        this.productConfigItem = productConfigItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productConfigPK != null ? productConfigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfig)) {
            return false;
        }
        ProductConfig other = (ProductConfig) object;
        if ((this.productConfigPK == null && other.productConfigPK != null) || (this.productConfigPK != null && !this.productConfigPK.equals(other.productConfigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfig[ productConfigPK=" + productConfigPK + " ]";
    }
    
}
