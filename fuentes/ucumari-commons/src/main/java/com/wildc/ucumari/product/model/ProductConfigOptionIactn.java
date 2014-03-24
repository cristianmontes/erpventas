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
import javax.persistence.JoinColumns;
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
@Table(name = "product_config_option_iactn")
@NamedQueries({
    @NamedQuery(name = "ProductConfigOptionIactn.findAll", query = "SELECT p FROM ProductConfigOptionIactn p")})
public class ProductConfigOptionIactn implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigOptionIactnPK productConfigOptionIactnPK;
    @Column(name = "CONFIG_IACTN_TYPE_ID")
    private String configIactnTypeId;
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
        @JoinColumn(name = "CONFIG_ITEM_ID_TO", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_OPTION_ID_TO", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigOption productConfigOption;
    @JoinColumns({
        @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_OPTION_ID", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigOption productConfigOption1;
    @JoinColumn(name = "CONFIG_ITEM_ID_TO", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem1;

    public ProductConfigOptionIactn() {
    }

    public ProductConfigOptionIactn(ProductConfigOptionIactnPK productConfigOptionIactnPK) {
        this.productConfigOptionIactnPK = productConfigOptionIactnPK;
    }

    public ProductConfigOptionIactn(String configItemId, String configOptionId, String configItemIdTo, String configOptionIdTo, BigInteger sequenceNum) {
        this.productConfigOptionIactnPK = new ProductConfigOptionIactnPK(configItemId, configOptionId, configItemIdTo, configOptionIdTo, sequenceNum);
    }

    public ProductConfigOptionIactnPK getProductConfigOptionIactnPK() {
        return productConfigOptionIactnPK;
    }

    public void setProductConfigOptionIactnPK(ProductConfigOptionIactnPK productConfigOptionIactnPK) {
        this.productConfigOptionIactnPK = productConfigOptionIactnPK;
    }

    public String getConfigIactnTypeId() {
        return configIactnTypeId;
    }

    public void setConfigIactnTypeId(String configIactnTypeId) {
        this.configIactnTypeId = configIactnTypeId;
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

    public ProductConfigOption getProductConfigOption() {
        return productConfigOption;
    }

    public void setProductConfigOption(ProductConfigOption productConfigOption) {
        this.productConfigOption = productConfigOption;
    }

    public ProductConfigOption getProductConfigOption1() {
        return productConfigOption1;
    }

    public void setProductConfigOption1(ProductConfigOption productConfigOption1) {
        this.productConfigOption1 = productConfigOption1;
    }

    public ProductConfigItem getProductConfigItem() {
        return productConfigItem;
    }

    public void setProductConfigItem(ProductConfigItem productConfigItem) {
        this.productConfigItem = productConfigItem;
    }

    public ProductConfigItem getProductConfigItem1() {
        return productConfigItem1;
    }

    public void setProductConfigItem1(ProductConfigItem productConfigItem1) {
        this.productConfigItem1 = productConfigItem1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productConfigOptionIactnPK != null ? productConfigOptionIactnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigOptionIactn)) {
            return false;
        }
        ProductConfigOptionIactn other = (ProductConfigOptionIactn) object;
        if ((this.productConfigOptionIactnPK == null && other.productConfigOptionIactnPK != null) || (this.productConfigOptionIactnPK != null && !this.productConfigOptionIactnPK.equals(other.productConfigOptionIactnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigOptionIactn[ productConfigOptionIactnPK=" + productConfigOptionIactnPK + " ]";
    }
    
}
