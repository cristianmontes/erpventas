/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.client.modelo.CarrierShipmentBoxType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_box_type")
@NamedQueries({
    @NamedQuery(name = "ShipmentBoxType.findAll", query = "SELECT s FROM ShipmentBoxType s")})
public class ShipmentBoxType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentBoxType")
    private List<CarrierShipmentBoxType> carrierShipmentBoxTypeList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_BOX_TYPE_ID")
    private String shipmentBoxTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BOX_LENGTH")
    private BigDecimal boxLength;
    @Column(name = "BOX_WIDTH")
    private BigDecimal boxWidth;
    @Column(name = "BOX_HEIGHT")
    private BigDecimal boxHeight;
    @Column(name = "BOX_WEIGHT")
    private BigDecimal boxWeight;
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
    @OneToMany(mappedBy = "shipmentBoxTypeId")
    private List<ShipmentPackage> shipmentPackageList;
    @OneToMany(mappedBy = "defaultShipmentBoxTypeId")
    private List<Product> productList;
    @JoinColumn(name = "WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom weightUomId;
    @JoinColumn(name = "DIMENSION_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom dimensionUomId;

    public ShipmentBoxType() {
    }

    public ShipmentBoxType(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }

    public String getShipmentBoxTypeId() {
        return shipmentBoxTypeId;
    }

    public void setShipmentBoxTypeId(String shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getBoxLength() {
        return boxLength;
    }

    public void setBoxLength(BigDecimal boxLength) {
        this.boxLength = boxLength;
    }

    public BigDecimal getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(BigDecimal boxWidth) {
        this.boxWidth = boxWidth;
    }

    public BigDecimal getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(BigDecimal boxHeight) {
        this.boxHeight = boxHeight;
    }

    public BigDecimal getBoxWeight() {
        return boxWeight;
    }

    public void setBoxWeight(BigDecimal boxWeight) {
        this.boxWeight = boxWeight;
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

    public List<ShipmentPackage> getShipmentPackageList() {
        return shipmentPackageList;
    }

    public void setShipmentPackageList(List<ShipmentPackage> shipmentPackageList) {
        this.shipmentPackageList = shipmentPackageList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Uom getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(Uom weightUomId) {
        this.weightUomId = weightUomId;
    }

    public Uom getDimensionUomId() {
        return dimensionUomId;
    }

    public void setDimensionUomId(Uom dimensionUomId) {
        this.dimensionUomId = dimensionUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentBoxTypeId != null ? shipmentBoxTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentBoxType)) {
            return false;
        }
        ShipmentBoxType other = (ShipmentBoxType) object;
        if ((this.shipmentBoxTypeId == null && other.shipmentBoxTypeId != null) || (this.shipmentBoxTypeId != null && !this.shipmentBoxTypeId.equals(other.shipmentBoxTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentBoxType[ shipmentBoxTypeId=" + shipmentBoxTypeId + " ]";
    }

    public List<CarrierShipmentBoxType> getCarrierShipmentBoxTypeList() {
        return carrierShipmentBoxTypeList;
    }

    public void setCarrierShipmentBoxTypeList(List<CarrierShipmentBoxType> carrierShipmentBoxTypeList) {
        this.carrierShipmentBoxTypeList = carrierShipmentBoxTypeList;
    }
    
}
