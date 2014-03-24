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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_config_option")
@NamedQueries({
    @NamedQuery(name = "ProductConfigOption.findAll", query = "SELECT p FROM ProductConfigOption p")})
public class ProductConfigOption implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigOption")
    private List<ProductConfigOptionIactn> productConfigOptionIactnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigOption1")
    private List<ProductConfigOptionIactn> productConfigOptionIactnList1;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigOptionPK productConfigOptionPK;
    @Column(name = "CONFIG_OPTION_NAME")
    private String configOptionName;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigOption")
    private List<ProductConfigConfig> productConfigConfigList;
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigOption")
    private List<ProductConfigProduct> productConfigProductList;

    public ProductConfigOption() {
    }

    public ProductConfigOption(ProductConfigOptionPK productConfigOptionPK) {
        this.productConfigOptionPK = productConfigOptionPK;
    }

    public ProductConfigOption(String configItemId, String configOptionId) {
        this.productConfigOptionPK = new ProductConfigOptionPK(configItemId, configOptionId);
    }

    public ProductConfigOptionPK getProductConfigOptionPK() {
        return productConfigOptionPK;
    }

    public void setProductConfigOptionPK(ProductConfigOptionPK productConfigOptionPK) {
        this.productConfigOptionPK = productConfigOptionPK;
    }

    public String getConfigOptionName() {
        return configOptionName;
    }

    public void setConfigOptionName(String configOptionName) {
        this.configOptionName = configOptionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<ProductConfigConfig> getProductConfigConfigList() {
        return productConfigConfigList;
    }

    public void setProductConfigConfigList(List<ProductConfigConfig> productConfigConfigList) {
        this.productConfigConfigList = productConfigConfigList;
    }

    public ProductConfigItem getProductConfigItem() {
        return productConfigItem;
    }

    public void setProductConfigItem(ProductConfigItem productConfigItem) {
        this.productConfigItem = productConfigItem;
    }

    public List<ProductConfigProduct> getProductConfigProductList() {
        return productConfigProductList;
    }

    public void setProductConfigProductList(List<ProductConfigProduct> productConfigProductList) {
        this.productConfigProductList = productConfigProductList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productConfigOptionPK != null ? productConfigOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigOption)) {
            return false;
        }
        ProductConfigOption other = (ProductConfigOption) object;
        if ((this.productConfigOptionPK == null && other.productConfigOptionPK != null) || (this.productConfigOptionPK != null && !this.productConfigOptionPK.equals(other.productConfigOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigOption[ productConfigOptionPK=" + productConfigOptionPK + " ]";
    }

    public List<ProductConfigOptionIactn> getProductConfigOptionIactnList() {
        return productConfigOptionIactnList;
    }

    public void setProductConfigOptionIactnList(List<ProductConfigOptionIactn> productConfigOptionIactnList) {
        this.productConfigOptionIactnList = productConfigOptionIactnList;
    }

    public List<ProductConfigOptionIactn> getProductConfigOptionIactnList1() {
        return productConfigOptionIactnList1;
    }

    public void setProductConfigOptionIactnList1(List<ProductConfigOptionIactn> productConfigOptionIactnList1) {
        this.productConfigOptionIactnList1 = productConfigOptionIactnList1;
    }
    
}
