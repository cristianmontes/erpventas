/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import com.wildc.ucumari.client.modelo.CarrierShipmentMethod;
import com.wildc.ucumari.client.modelo.QuantityBreak;
import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "shipment_cost_estimate")
@NamedQueries({
    @NamedQuery(name = "ShipmentCostEstimate.findAll", query = "SELECT s FROM ShipmentCostEstimate s")})
public class ShipmentCostEstimate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_COST_ESTIMATE_ID")
    private String shipmentCostEstimateId;
    @Column(name = "PRODUCT_STORE_SHIP_METH_ID")
    private String productStoreShipMethId;
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WEIGHT_UNIT_PRICE")
    private BigDecimal weightUnitPrice;
    @Column(name = "QUANTITY_UNIT_PRICE")
    private BigDecimal quantityUnitPrice;
    @Column(name = "PRICE_UNIT_PRICE")
    private BigDecimal priceUnitPrice;
    @Column(name = "ORDER_FLAT_PRICE")
    private BigDecimal orderFlatPrice;
    @Column(name = "ORDER_PRICE_PERCENT")
    private BigDecimal orderPricePercent;
    @Column(name = "ORDER_ITEM_FLAT_PRICE")
    private BigDecimal orderItemFlatPrice;
    @Column(name = "SHIPPING_PRICE_PERCENT")
    private BigDecimal shippingPricePercent;
    @Column(name = "PRODUCT_FEATURE_GROUP_ID")
    private String productFeatureGroupId;
    @Column(name = "OVERSIZE_UNIT")
    private BigDecimal oversizeUnit;
    @Column(name = "OVERSIZE_PRICE")
    private BigDecimal oversizePrice;
    @Column(name = "FEATURE_PERCENT")
    private BigDecimal featurePercent;
    @Column(name = "FEATURE_PRICE")
    private BigDecimal featurePrice;
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
    @JoinColumn(name = "WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom weightUomId;
    @JoinColumn(name = "WEIGHT_BREAK_ID", referencedColumnName = "QUANTITY_BREAK_ID")
    @ManyToOne
    private QuantityBreak weightBreakId;
    @JoinColumn(name = "GEO_ID_TO", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo geoIdTo;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "QUANTITY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom quantityUomId;
    @JoinColumn(name = "QUANTITY_BREAK_ID", referencedColumnName = "QUANTITY_BREAK_ID")
    @ManyToOne
    private QuantityBreak quantityBreakId;
    @JoinColumn(name = "PRICE_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom priceUomId;
    @JoinColumn(name = "PRICE_BREAK_ID", referencedColumnName = "QUANTITY_BREAK_ID")
    @ManyToOne
    private QuantityBreak priceBreakId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "GEO_ID_FROM", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo geoIdFrom;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID"),
        @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "CARRIER_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private CarrierShipmentMethod carrierShipmentMethod;

    public ShipmentCostEstimate() {
    }

    public ShipmentCostEstimate(String shipmentCostEstimateId) {
        this.shipmentCostEstimateId = shipmentCostEstimateId;
    }

    public String getShipmentCostEstimateId() {
        return shipmentCostEstimateId;
    }

    public void setShipmentCostEstimateId(String shipmentCostEstimateId) {
        this.shipmentCostEstimateId = shipmentCostEstimateId;
    }

    public String getProductStoreShipMethId() {
        return productStoreShipMethId;
    }

    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public BigDecimal getWeightUnitPrice() {
        return weightUnitPrice;
    }

    public void setWeightUnitPrice(BigDecimal weightUnitPrice) {
        this.weightUnitPrice = weightUnitPrice;
    }

    public BigDecimal getQuantityUnitPrice() {
        return quantityUnitPrice;
    }

    public void setQuantityUnitPrice(BigDecimal quantityUnitPrice) {
        this.quantityUnitPrice = quantityUnitPrice;
    }

    public BigDecimal getPriceUnitPrice() {
        return priceUnitPrice;
    }

    public void setPriceUnitPrice(BigDecimal priceUnitPrice) {
        this.priceUnitPrice = priceUnitPrice;
    }

    public BigDecimal getOrderFlatPrice() {
        return orderFlatPrice;
    }

    public void setOrderFlatPrice(BigDecimal orderFlatPrice) {
        this.orderFlatPrice = orderFlatPrice;
    }

    public BigDecimal getOrderPricePercent() {
        return orderPricePercent;
    }

    public void setOrderPricePercent(BigDecimal orderPricePercent) {
        this.orderPricePercent = orderPricePercent;
    }

    public BigDecimal getOrderItemFlatPrice() {
        return orderItemFlatPrice;
    }

    public void setOrderItemFlatPrice(BigDecimal orderItemFlatPrice) {
        this.orderItemFlatPrice = orderItemFlatPrice;
    }

    public BigDecimal getShippingPricePercent() {
        return shippingPricePercent;
    }

    public void setShippingPricePercent(BigDecimal shippingPricePercent) {
        this.shippingPricePercent = shippingPricePercent;
    }

    public String getProductFeatureGroupId() {
        return productFeatureGroupId;
    }

    public void setProductFeatureGroupId(String productFeatureGroupId) {
        this.productFeatureGroupId = productFeatureGroupId;
    }

    public BigDecimal getOversizeUnit() {
        return oversizeUnit;
    }

    public void setOversizeUnit(BigDecimal oversizeUnit) {
        this.oversizeUnit = oversizeUnit;
    }

    public BigDecimal getOversizePrice() {
        return oversizePrice;
    }

    public void setOversizePrice(BigDecimal oversizePrice) {
        this.oversizePrice = oversizePrice;
    }

    public BigDecimal getFeaturePercent() {
        return featurePercent;
    }

    public void setFeaturePercent(BigDecimal featurePercent) {
        this.featurePercent = featurePercent;
    }

    public BigDecimal getFeaturePrice() {
        return featurePrice;
    }

    public void setFeaturePrice(BigDecimal featurePrice) {
        this.featurePrice = featurePrice;
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

    public Uom getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(Uom weightUomId) {
        this.weightUomId = weightUomId;
    }

    public QuantityBreak getWeightBreakId() {
        return weightBreakId;
    }

    public void setWeightBreakId(QuantityBreak weightBreakId) {
        this.weightBreakId = weightBreakId;
    }

    public Geo getGeoIdTo() {
        return geoIdTo;
    }

    public void setGeoIdTo(Geo geoIdTo) {
        this.geoIdTo = geoIdTo;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Uom getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(Uom quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public QuantityBreak getQuantityBreakId() {
        return quantityBreakId;
    }

    public void setQuantityBreakId(QuantityBreak quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }

    public Uom getPriceUomId() {
        return priceUomId;
    }

    public void setPriceUomId(Uom priceUomId) {
        this.priceUomId = priceUomId;
    }

    public QuantityBreak getPriceBreakId() {
        return priceBreakId;
    }

    public void setPriceBreakId(QuantityBreak priceBreakId) {
        this.priceBreakId = priceBreakId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Geo getGeoIdFrom() {
        return geoIdFrom;
    }

    public void setGeoIdFrom(Geo geoIdFrom) {
        this.geoIdFrom = geoIdFrom;
    }

    public CarrierShipmentMethod getCarrierShipmentMethod() {
        return carrierShipmentMethod;
    }

    public void setCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
        this.carrierShipmentMethod = carrierShipmentMethod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentCostEstimateId != null ? shipmentCostEstimateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentCostEstimate)) {
            return false;
        }
        ShipmentCostEstimate other = (ShipmentCostEstimate) object;
        if ((this.shipmentCostEstimateId == null && other.shipmentCostEstimateId != null) || (this.shipmentCostEstimateId != null && !this.shipmentCostEstimateId.equals(other.shipmentCostEstimateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentCostEstimate[ shipmentCostEstimateId=" + shipmentCostEstimateId + " ]";
    }
    
}
