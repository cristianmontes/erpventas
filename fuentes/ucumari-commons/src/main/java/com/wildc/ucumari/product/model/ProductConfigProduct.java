/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "product_config_product")
@NamedQueries({
    @NamedQuery(name = "ProductConfigProduct.findAll", query = "SELECT p FROM ProductConfigProduct p")})
public class ProductConfigProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigProductPK productConfigProductPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
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
    @JoinColumns({
        @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false),
        @JoinColumn(name = "CONFIG_OPTION_ID", referencedColumnName = "CONFIG_OPTION_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ProductConfigOption productConfigOption;
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productConfigProduct")
    private List<ConfigOptionProductOption> configOptionProductOptionList;

    public ProductConfigProduct() {
    }

    public ProductConfigProduct(ProductConfigProductPK productConfigProductPK) {
        this.productConfigProductPK = productConfigProductPK;
    }

    public ProductConfigProduct(String configItemId, String configOptionId, String productId) {
        this.productConfigProductPK = new ProductConfigProductPK(configItemId, configOptionId, productId);
    }

    public ProductConfigProductPK getProductConfigProductPK() {
        return productConfigProductPK;
    }

    public void setProductConfigProductPK(ProductConfigProductPK productConfigProductPK) {
        this.productConfigProductPK = productConfigProductPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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
        hash += (productConfigProductPK != null ? productConfigProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigProduct)) {
            return false;
        }
        ProductConfigProduct other = (ProductConfigProduct) object;
        if ((this.productConfigProductPK == null && other.productConfigProductPK != null) || (this.productConfigProductPK != null && !this.productConfigProductPK.equals(other.productConfigProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigProduct[ productConfigProductPK=" + productConfigProductPK + " ]";
    }
    
}
