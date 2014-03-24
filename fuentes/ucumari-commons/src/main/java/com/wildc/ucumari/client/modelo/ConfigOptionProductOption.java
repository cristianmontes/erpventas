/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductConfigConfig;
import com.wildc.ucumari.product.model.ProductConfigProduct;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "config_option_product_option")
@NamedQueries({
    @NamedQuery(name = "ConfigOptionProductOption.findAll", query = "SELECT c FROM ConfigOptionProductOption c")})
public class ConfigOptionProductOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConfigOptionProductOptionPK configOptionProductOptionPK;
    @Column(name = "PRODUCT_OPTION_ID")
    private String productOptionId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumns({
        @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_OPTION_ID", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false),
        @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigProduct productConfigProduct;
    @JoinColumns({
        @JoinColumn(name = "CONFIG_ID", referencedColumnName = "CONFIG_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_OPTION_ID", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SEQUENCE_NUM", referencedColumnName = "SEQUENCE_NUM", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigConfig productConfigConfig;

    public ConfigOptionProductOption() {
    }

    public ConfigOptionProductOption(ConfigOptionProductOptionPK configOptionProductOptionPK) {
        this.configOptionProductOptionPK = configOptionProductOptionPK;
    }

    public ConfigOptionProductOption(String configId, String configItemId, BigInteger sequenceNum, String configOptionId, String productId) {
        this.configOptionProductOptionPK = new ConfigOptionProductOptionPK(configId, configItemId, sequenceNum, configOptionId, productId);
    }

    public ConfigOptionProductOptionPK getConfigOptionProductOptionPK() {
        return configOptionProductOptionPK;
    }

    public void setConfigOptionProductOptionPK(ConfigOptionProductOptionPK configOptionProductOptionPK) {
        this.configOptionProductOptionPK = configOptionProductOptionPK;
    }

    public String getProductOptionId() {
        return productOptionId;
    }

    public void setProductOptionId(String productOptionId) {
        this.productOptionId = productOptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public ProductConfigProduct getProductConfigProduct() {
        return productConfigProduct;
    }

    public void setProductConfigProduct(ProductConfigProduct productConfigProduct) {
        this.productConfigProduct = productConfigProduct;
    }

    public ProductConfigConfig getProductConfigConfig() {
        return productConfigConfig;
    }

    public void setProductConfigConfig(ProductConfigConfig productConfigConfig) {
        this.productConfigConfig = productConfigConfig;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configOptionProductOptionPK != null ? configOptionProductOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfigOptionProductOption)) {
            return false;
        }
        ConfigOptionProductOption other = (ConfigOptionProductOption) object;
        if ((this.configOptionProductOptionPK == null && other.configOptionProductOptionPK != null) || (this.configOptionProductOptionPK != null && !this.configOptionProductOptionPK.equals(other.configOptionProductOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ConfigOptionProductOption[ configOptionProductOptionPK=" + configOptionProductOptionPK + " ]";
    }
    
}
