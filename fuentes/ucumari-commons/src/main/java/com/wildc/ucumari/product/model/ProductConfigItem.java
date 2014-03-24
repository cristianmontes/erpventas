/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "product_config_item")
@NamedQueries({
    @NamedQuery(name = "ProductConfigItem.findAll", query = "SELECT p FROM ProductConfigItem p")})
public class ProductConfigItem implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProductConfig> productConfigList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProdConfItemContent> prodConfItemContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProductConfigOptionIactn> productConfigOptionIactnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem1")
    private List<ProductConfigOptionIactn> productConfigOptionIactnList1;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Column(name = "CONFIG_ITEM_TYPE_ID")
    private String configItemTypeId;
    @Column(name = "CONFIG_ITEM_NAME")
    private String configItemName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "IMAGE_URL")
    private String imageUrl;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProductConfigConfig> productConfigConfigList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProductConfigOption> productConfigOptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigItem")
    private List<ProductConfigProduct> productConfigProductList;

    public ProductConfigItem() {
    }

    public ProductConfigItem(String configItemId) {
        this.configItemId = configItemId;
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }

    public String getConfigItemTypeId() {
        return configItemTypeId;
    }

    public void setConfigItemTypeId(String configItemTypeId) {
        this.configItemTypeId = configItemTypeId;
    }

    public String getConfigItemName() {
        return configItemName;
    }

    public void setConfigItemName(String configItemName) {
        this.configItemName = configItemName;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public List<ProductConfigOption> getProductConfigOptionList() {
        return productConfigOptionList;
    }

    public void setProductConfigOptionList(List<ProductConfigOption> productConfigOptionList) {
        this.productConfigOptionList = productConfigOptionList;
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
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigItem)) {
            return false;
        }
        ProductConfigItem other = (ProductConfigItem) object;
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigItem[ configItemId=" + configItemId + " ]";
    }

    public List<ProductConfig> getProductConfigList() {
        return productConfigList;
    }

    public void setProductConfigList(List<ProductConfig> productConfigList) {
        this.productConfigList = productConfigList;
    }

    public List<ProdConfItemContent> getProdConfItemContentList() {
        return prodConfItemContentList;
    }

    public void setProdConfItemContentList(List<ProdConfItemContent> prodConfItemContentList) {
        this.prodConfItemContentList = prodConfItemContentList;
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
