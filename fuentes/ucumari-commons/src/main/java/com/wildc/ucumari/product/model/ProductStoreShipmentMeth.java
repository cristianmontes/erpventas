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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "product_store_shipment_meth")
@NamedQueries({
    @NamedQuery(name = "ProductStoreShipmentMeth.findAll", query = "SELECT p FROM ProductStoreShipmentMeth p")})
public class ProductStoreShipmentMeth implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_SHIP_METH_ID")
    private String productStoreShipMethId;
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Column(name = "SHIPMENT_METHOD_TYPE_ID")
    private String shipmentMethodTypeId;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name = "COMPANY_PARTY_ID")
    private String companyPartyId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MIN_WEIGHT")
    private BigDecimal minWeight;
    @Column(name = "MAX_WEIGHT")
    private BigDecimal maxWeight;
    @Column(name = "MIN_SIZE")
    private BigDecimal minSize;
    @Column(name = "MAX_SIZE")
    private BigDecimal maxSize;
    @Column(name = "MIN_TOTAL")
    private BigDecimal minTotal;
    @Column(name = "MAX_TOTAL")
    private BigDecimal maxTotal;
    @Column(name = "ALLOW_USPS_ADDR")
    private Character allowUspsAddr;
    @Column(name = "REQUIRE_USPS_ADDR")
    private Character requireUspsAddr;
    @Column(name = "ALLOW_COMPANY_ADDR")
    private Character allowCompanyAddr;
    @Column(name = "REQUIRE_COMPANY_ADDR")
    private Character requireCompanyAddr;
    @Column(name = "INCLUDE_NO_CHARGE_ITEMS")
    private Character includeNoChargeItems;
    @Column(name = "INCLUDE_FEATURE_GROUP")
    private String includeFeatureGroup;
    @Column(name = "EXCLUDE_FEATURE_GROUP")
    private String excludeFeatureGroup;
    @Column(name = "INCLUDE_GEO_ID")
    private String includeGeoId;
    @Column(name = "EXCLUDE_GEO_ID")
    private String excludeGeoId;
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @Column(name = "CONFIG_PROPS")
    private String configProps;
    @Column(name = "SEQUENCE_NUMBER")
    private BigInteger sequenceNumber;
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
    @Column(name = "COD_SURCHARGE")
    private BigDecimal codSurcharge;
    @Column(name = "USER_DESCRIPTION")
    private String userDescription;
    @Column(name = "MINIMUM_RATE")
    private BigDecimal minimumRate;

    public ProductStoreShipmentMeth() {
    }

    public ProductStoreShipmentMeth(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
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

    public String getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(String shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getCompanyPartyId() {
        return companyPartyId;
    }

    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }

    public BigDecimal getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(BigDecimal minWeight) {
        this.minWeight = minWeight;
    }

    public BigDecimal getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(BigDecimal maxWeight) {
        this.maxWeight = maxWeight;
    }

    public BigDecimal getMinSize() {
        return minSize;
    }

    public void setMinSize(BigDecimal minSize) {
        this.minSize = minSize;
    }

    public BigDecimal getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(BigDecimal maxSize) {
        this.maxSize = maxSize;
    }

    public BigDecimal getMinTotal() {
        return minTotal;
    }

    public void setMinTotal(BigDecimal minTotal) {
        this.minTotal = minTotal;
    }

    public BigDecimal getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(BigDecimal maxTotal) {
        this.maxTotal = maxTotal;
    }

    public Character getAllowUspsAddr() {
        return allowUspsAddr;
    }

    public void setAllowUspsAddr(Character allowUspsAddr) {
        this.allowUspsAddr = allowUspsAddr;
    }

    public Character getRequireUspsAddr() {
        return requireUspsAddr;
    }

    public void setRequireUspsAddr(Character requireUspsAddr) {
        this.requireUspsAddr = requireUspsAddr;
    }

    public Character getAllowCompanyAddr() {
        return allowCompanyAddr;
    }

    public void setAllowCompanyAddr(Character allowCompanyAddr) {
        this.allowCompanyAddr = allowCompanyAddr;
    }

    public Character getRequireCompanyAddr() {
        return requireCompanyAddr;
    }

    public void setRequireCompanyAddr(Character requireCompanyAddr) {
        this.requireCompanyAddr = requireCompanyAddr;
    }

    public Character getIncludeNoChargeItems() {
        return includeNoChargeItems;
    }

    public void setIncludeNoChargeItems(Character includeNoChargeItems) {
        this.includeNoChargeItems = includeNoChargeItems;
    }

    public String getIncludeFeatureGroup() {
        return includeFeatureGroup;
    }

    public void setIncludeFeatureGroup(String includeFeatureGroup) {
        this.includeFeatureGroup = includeFeatureGroup;
    }

    public String getExcludeFeatureGroup() {
        return excludeFeatureGroup;
    }

    public void setExcludeFeatureGroup(String excludeFeatureGroup) {
        this.excludeFeatureGroup = excludeFeatureGroup;
    }

    public String getIncludeGeoId() {
        return includeGeoId;
    }

    public void setIncludeGeoId(String includeGeoId) {
        this.includeGeoId = includeGeoId;
    }

    public String getExcludeGeoId() {
        return excludeGeoId;
    }

    public void setExcludeGeoId(String excludeGeoId) {
        this.excludeGeoId = excludeGeoId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getConfigProps() {
        return configProps;
    }

    public void setConfigProps(String configProps) {
        this.configProps = configProps;
    }

    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(BigInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
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

    public BigDecimal getCodSurcharge() {
        return codSurcharge;
    }

    public void setCodSurcharge(BigDecimal codSurcharge) {
        this.codSurcharge = codSurcharge;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public BigDecimal getMinimumRate() {
        return minimumRate;
    }

    public void setMinimumRate(BigDecimal minimumRate) {
        this.minimumRate = minimumRate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreShipMethId != null ? productStoreShipMethId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreShipmentMeth)) {
            return false;
        }
        ProductStoreShipmentMeth other = (ProductStoreShipmentMeth) object;
        if ((this.productStoreShipMethId == null && other.productStoreShipMethId != null) || (this.productStoreShipMethId != null && !this.productStoreShipMethId.equals(other.productStoreShipMethId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreShipmentMeth[ productStoreShipMethId=" + productStoreShipMethId + " ]";
    }
    
}
