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
import com.wildc.ucumari.parameters.model.Geo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_geo")
@NamedQueries({
    @NamedQuery(name = "ProductGeo.findAll", query = "SELECT p FROM ProductGeo p")})
public class ProductGeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductGeoPK productGeoPK;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;
    @JoinColumn(name = "PRODUCT_GEO_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration productGeoEnumId;

    public ProductGeo() {
    }

    public ProductGeo(ProductGeoPK productGeoPK) {
        this.productGeoPK = productGeoPK;
    }

    public ProductGeo(String productId, String geoId) {
        this.productGeoPK = new ProductGeoPK(productId, geoId);
    }

    public ProductGeoPK getProductGeoPK() {
        return productGeoPK;
    }

    public void setProductGeoPK(ProductGeoPK productGeoPK) {
        this.productGeoPK = productGeoPK;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Enumeration getProductGeoEnumId() {
        return productGeoEnumId;
    }

    public void setProductGeoEnumId(Enumeration productGeoEnumId) {
        this.productGeoEnumId = productGeoEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productGeoPK != null ? productGeoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductGeo)) {
            return false;
        }
        ProductGeo other = (ProductGeo) object;
        if ((this.productGeoPK == null && other.productGeoPK != null) || (this.productGeoPK != null && !this.productGeoPK.equals(other.productGeoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductGeo[ productGeoPK=" + productGeoPK + " ]";
    }
    
}
