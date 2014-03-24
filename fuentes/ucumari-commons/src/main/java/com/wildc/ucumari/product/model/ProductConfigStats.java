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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_config_stats")
@NamedQueries({
    @NamedQuery(name = "ProductConfigStats.findAll", query = "SELECT p FROM ProductConfigStats p")})
public class ProductConfigStats implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductConfigStatsPK productConfigStatsPK;
    @Column(name = "NUM_OF_CONFS")
    private BigInteger numOfConfs;
    @Column(name = "CONFIG_TYPE_ID")
    private String configTypeId;
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

    public ProductConfigStats() {
    }

    public ProductConfigStats(ProductConfigStatsPK productConfigStatsPK) {
        this.productConfigStatsPK = productConfigStatsPK;
    }

    public ProductConfigStats(String configId, String productId) {
        this.productConfigStatsPK = new ProductConfigStatsPK(configId, productId);
    }

    public ProductConfigStatsPK getProductConfigStatsPK() {
        return productConfigStatsPK;
    }

    public void setProductConfigStatsPK(ProductConfigStatsPK productConfigStatsPK) {
        this.productConfigStatsPK = productConfigStatsPK;
    }

    public BigInteger getNumOfConfs() {
        return numOfConfs;
    }

    public void setNumOfConfs(BigInteger numOfConfs) {
        this.numOfConfs = numOfConfs;
    }

    public String getConfigTypeId() {
        return configTypeId;
    }

    public void setConfigTypeId(String configTypeId) {
        this.configTypeId = configTypeId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productConfigStatsPK != null ? productConfigStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigStats)) {
            return false;
        }
        ProductConfigStats other = (ProductConfigStats) object;
        if ((this.productConfigStatsPK == null && other.productConfigStatsPK != null) || (this.productConfigStatsPK != null && !this.productConfigStatsPK.equals(other.productConfigStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigStats[ productConfigStatsPK=" + productConfigStatsPK + " ]";
    }
    
}
