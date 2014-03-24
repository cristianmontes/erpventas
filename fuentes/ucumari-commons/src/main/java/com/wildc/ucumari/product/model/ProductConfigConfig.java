/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.ConfigOptionProductOption;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_config_config")
@NamedQueries({
    @NamedQuery(name = "ProductConfigConfig.findAll", query = "SELECT p FROM ProductConfigConfig p")})
public class ProductConfigConfig implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigConfigPK productConfigConfigPK;
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
        @JoinColumn(name = "CONFIG_OPTION_ID", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigOption productConfigOption;
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigConfig")
    private List<ConfigOptionProductOption> configOptionProductOptionList;

    public ProductConfigConfig() {
    }

    public ProductConfigConfig(ProductConfigConfigPK productConfigConfigPK) {
        this.productConfigConfigPK = productConfigConfigPK;
    }

    public ProductConfigConfig(String configId, String configItemId, BigInteger sequenceNum, String configOptionId) {
        this.productConfigConfigPK = new ProductConfigConfigPK(configId, configItemId, sequenceNum, configOptionId);
    }

    public ProductConfigConfigPK getProductConfigConfigPK() {
        return productConfigConfigPK;
    }

    public void setProductConfigConfigPK(ProductConfigConfigPK productConfigConfigPK) {
        this.productConfigConfigPK = productConfigConfigPK;
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

    public ProductConfigItem getProductConfigItem() {
        return productConfigItem;
    }

    public void setProductConfigItem(ProductConfigItem productConfigItem) {
        this.productConfigItem = productConfigItem;
    }

    public List<ConfigOptionProductOption> getConfigOptionProductOptionList() {
        return configOptionProductOptionList;
    }

    public void setConfigOptionProductOptionList(List<ConfigOptionProductOption> configOptionProductOptionList) {
        this.configOptionProductOptionList = configOptionProductOptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productConfigConfigPK != null ? productConfigConfigPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigConfig)) {
            return false;
        }
        ProductConfigConfig other = (ProductConfigConfig) object;
        if ((this.productConfigConfigPK == null && other.productConfigConfigPK != null) || (this.productConfigConfigPK != null && !this.productConfigConfigPK.equals(other.productConfigConfigPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigConfig[ productConfigConfigPK=" + productConfigConfigPK + " ]";
    }
    
}
