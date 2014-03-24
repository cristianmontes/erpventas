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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.FixedAssetMaint;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_meter_type")
@NamedQueries({
    @NamedQuery(name = "ProductMeterType.findAll", query = "SELECT p FROM ProductMeterType p")})
public class ProductMeterType implements Serializable {
    @OneToMany(mappedBy = "intervalMeterTypeId")
    private List<ProductMaint> productMaintList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productMeterType")
    private List<ProductMeter> productMeterList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_METER_TYPE_ID")
    private String productMeterTypeId;
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
    @JoinColumn(name = "DEFAULT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom defaultUomId;
    @OneToMany(mappedBy = "intervalMeterTypeId")
    private List<FixedAssetMaint> fixedAssetMaintList;

    public ProductMeterType() {
    }

    public ProductMeterType(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId;
    }

    public String getProductMeterTypeId() {
        return productMeterTypeId;
    }

    public void setProductMeterTypeId(String productMeterTypeId) {
        this.productMeterTypeId = productMeterTypeId;
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

    public Uom getDefaultUomId() {
        return defaultUomId;
    }

    public void setDefaultUomId(Uom defaultUomId) {
        this.defaultUomId = defaultUomId;
    }

    public List<FixedAssetMaint> getFixedAssetMaintList() {
        return fixedAssetMaintList;
    }

    public void setFixedAssetMaintList(List<FixedAssetMaint> fixedAssetMaintList) {
        this.fixedAssetMaintList = fixedAssetMaintList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMeterTypeId != null ? productMeterTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMeterType)) {
            return false;
        }
        ProductMeterType other = (ProductMeterType) object;
        if ((this.productMeterTypeId == null && other.productMeterTypeId != null) || (this.productMeterTypeId != null && !this.productMeterTypeId.equals(other.productMeterTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMeterType[ productMeterTypeId=" + productMeterTypeId + " ]";
    }

    public List<ProductMaint> getProductMaintList() {
        return productMaintList;
    }

    public void setProductMaintList(List<ProductMaint> productMaintList) {
        this.productMaintList = productMaintList;
    }

    public List<ProductMeter> getProductMeterList() {
        return productMeterList;
    }

    public void setProductMeterList(List<ProductMeter> productMeterList) {
        this.productMeterList = productMeterList;
    }
    
}
