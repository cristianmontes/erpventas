/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import com.wildc.ucumari.client.modelo.Delivery;
import com.wildc.ucumari.contact.model.PostalAddress;
import com.wildc.ucumari.contact.model.TelecomNumber;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "shipment_route_segment")
@NamedQueries({
    @NamedQuery(name = "ShipmentRouteSegment.findAll", query = "SELECT s FROM ShipmentRouteSegment s")})
public class ShipmentRouteSegment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentRouteSegmentPK shipmentRouteSegmentPK;
    @Column(name = "CARRIER_DELIVERY_ZONE")
    private String carrierDeliveryZone;
    @Column(name = "CARRIER_RESTRICTION_CODES")
    private String carrierRestrictionCodes;
    @Lob
    @Column(name = "CARRIER_RESTRICTION_DESC")
    private String carrierRestrictionDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BILLING_WEIGHT")
    private BigDecimal billingWeight;
    @Column(name = "ACTUAL_TRANSPORT_COST")
    private BigDecimal actualTransportCost;
    @Column(name = "ACTUAL_SERVICE_COST")
    private BigDecimal actualServiceCost;
    @Column(name = "ACTUAL_OTHER_COST")
    private BigDecimal actualOtherCost;
    @Column(name = "ACTUAL_COST")
    private BigDecimal actualCost;
    @Column(name = "ACTUAL_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualStartDate;
    @Column(name = "ACTUAL_ARRIVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualArrivalDate;
    @Column(name = "ESTIMATED_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedStartDate;
    @Column(name = "ESTIMATED_ARRIVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedArrivalDate;
    @Column(name = "TRACKING_ID_NUMBER")
    private String trackingIdNumber;
    @Lob
    @Column(name = "TRACKING_DIGEST")
    private String trackingDigest;
    @Column(name = "UPDATED_BY_USER_LOGIN_ID")
    private String updatedByUserLoginId;
    @Column(name = "LAST_UPDATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;
    @Column(name = "HOME_DELIVERY_TYPE")
    private String homeDeliveryType;
    @Column(name = "HOME_DELIVERY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date homeDeliveryDate;
    @Column(name = "THIRD_PARTY_ACCOUNT_NUMBER")
    private String thirdPartyAccountNumber;
    @Column(name = "THIRD_PARTY_POSTAL_CODE")
    private String thirdPartyPostalCode;
    @Column(name = "THIRD_PARTY_COUNTRY_GEO_CODE")
    private String thirdPartyCountryGeoCode;
    @Lob
    @Column(name = "UPS_HIGH_VALUE_REPORT")
    private byte[] upsHighValueReport;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentRouteSegment")
    private List<ShipmentPackageRouteSeg> shipmentPackageRouteSegList;
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;
    @JoinColumn(name = "BILLING_WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom billingWeightUomId;
    @JoinColumn(name = "CARRIER_SERVICE_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem carrierServiceStatusId;
    @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party carrierPartyId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "DELIVERY_ID", referencedColumnName = "DELIVERY_ID")
    @ManyToOne
    private Delivery deliveryId;
    @JoinColumn(name = "DEST_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility destFacilityId;
    @JoinColumn(name = "DEST_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress destContactMechId;
    @JoinColumn(name = "DEST_TELECOM_NUMBER_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private TelecomNumber destTelecomNumberId;
    @JoinColumn(name = "ORIGIN_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility originFacilityId;
    @JoinColumn(name = "ORIGIN_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress originContactMechId;
    @JoinColumn(name = "ORIGIN_TELECOM_NUMBER_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private TelecomNumber originTelecomNumberId;
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID")
    @ManyToOne
    private ShipmentMethodType shipmentMethodTypeId;

    public ShipmentRouteSegment() {
    }

    public ShipmentRouteSegment(ShipmentRouteSegmentPK shipmentRouteSegmentPK) {
        this.shipmentRouteSegmentPK = shipmentRouteSegmentPK;
    }

    public ShipmentRouteSegment(String shipmentId, String shipmentRouteSegmentId) {
        this.shipmentRouteSegmentPK = new ShipmentRouteSegmentPK(shipmentId, shipmentRouteSegmentId);
    }

    public ShipmentRouteSegmentPK getShipmentRouteSegmentPK() {
        return shipmentRouteSegmentPK;
    }

    public void setShipmentRouteSegmentPK(ShipmentRouteSegmentPK shipmentRouteSegmentPK) {
        this.shipmentRouteSegmentPK = shipmentRouteSegmentPK;
    }

    public String getCarrierDeliveryZone() {
        return carrierDeliveryZone;
    }

    public void setCarrierDeliveryZone(String carrierDeliveryZone) {
        this.carrierDeliveryZone = carrierDeliveryZone;
    }

    public String getCarrierRestrictionCodes() {
        return carrierRestrictionCodes;
    }

    public void setCarrierRestrictionCodes(String carrierRestrictionCodes) {
        this.carrierRestrictionCodes = carrierRestrictionCodes;
    }

    public String getCarrierRestrictionDesc() {
        return carrierRestrictionDesc;
    }

    public void setCarrierRestrictionDesc(String carrierRestrictionDesc) {
        this.carrierRestrictionDesc = carrierRestrictionDesc;
    }

    public BigDecimal getBillingWeight() {
        return billingWeight;
    }

    public void setBillingWeight(BigDecimal billingWeight) {
        this.billingWeight = billingWeight;
    }

    public BigDecimal getActualTransportCost() {
        return actualTransportCost;
    }

    public void setActualTransportCost(BigDecimal actualTransportCost) {
        this.actualTransportCost = actualTransportCost;
    }

    public BigDecimal getActualServiceCost() {
        return actualServiceCost;
    }

    public void setActualServiceCost(BigDecimal actualServiceCost) {
        this.actualServiceCost = actualServiceCost;
    }

    public BigDecimal getActualOtherCost() {
        return actualOtherCost;
    }

    public void setActualOtherCost(BigDecimal actualOtherCost) {
        this.actualOtherCost = actualOtherCost;
    }

    public BigDecimal getActualCost() {
        return actualCost;
    }

    public void setActualCost(BigDecimal actualCost) {
        this.actualCost = actualCost;
    }

    public Date getActualStartDate() {
        return actualStartDate;
    }

    public void setActualStartDate(Date actualStartDate) {
        this.actualStartDate = actualStartDate;
    }

    public Date getActualArrivalDate() {
        return actualArrivalDate;
    }

    public void setActualArrivalDate(Date actualArrivalDate) {
        this.actualArrivalDate = actualArrivalDate;
    }

    public Date getEstimatedStartDate() {
        return estimatedStartDate;
    }

    public void setEstimatedStartDate(Date estimatedStartDate) {
        this.estimatedStartDate = estimatedStartDate;
    }

    public Date getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public String getTrackingIdNumber() {
        return trackingIdNumber;
    }

    public void setTrackingIdNumber(String trackingIdNumber) {
        this.trackingIdNumber = trackingIdNumber;
    }

    public String getTrackingDigest() {
        return trackingDigest;
    }

    public void setTrackingDigest(String trackingDigest) {
        this.trackingDigest = trackingDigest;
    }

    public String getUpdatedByUserLoginId() {
        return updatedByUserLoginId;
    }

    public void setUpdatedByUserLoginId(String updatedByUserLoginId) {
        this.updatedByUserLoginId = updatedByUserLoginId;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getHomeDeliveryType() {
        return homeDeliveryType;
    }

    public void setHomeDeliveryType(String homeDeliveryType) {
        this.homeDeliveryType = homeDeliveryType;
    }

    public Date getHomeDeliveryDate() {
        return homeDeliveryDate;
    }

    public void setHomeDeliveryDate(Date homeDeliveryDate) {
        this.homeDeliveryDate = homeDeliveryDate;
    }

    public String getThirdPartyAccountNumber() {
        return thirdPartyAccountNumber;
    }

    public void setThirdPartyAccountNumber(String thirdPartyAccountNumber) {
        this.thirdPartyAccountNumber = thirdPartyAccountNumber;
    }

    public String getThirdPartyPostalCode() {
        return thirdPartyPostalCode;
    }

    public void setThirdPartyPostalCode(String thirdPartyPostalCode) {
        this.thirdPartyPostalCode = thirdPartyPostalCode;
    }

    public String getThirdPartyCountryGeoCode() {
        return thirdPartyCountryGeoCode;
    }

    public void setThirdPartyCountryGeoCode(String thirdPartyCountryGeoCode) {
        this.thirdPartyCountryGeoCode = thirdPartyCountryGeoCode;
    }

    public byte[] getUpsHighValueReport() {
        return upsHighValueReport;
    }

    public void setUpsHighValueReport(byte[] upsHighValueReport) {
        this.upsHighValueReport = upsHighValueReport;
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

    public List<ShipmentPackageRouteSeg> getShipmentPackageRouteSegList() {
        return shipmentPackageRouteSegList;
    }

    public void setShipmentPackageRouteSegList(List<ShipmentPackageRouteSeg> shipmentPackageRouteSegList) {
        this.shipmentPackageRouteSegList = shipmentPackageRouteSegList;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public Uom getBillingWeightUomId() {
        return billingWeightUomId;
    }

    public void setBillingWeightUomId(Uom billingWeightUomId) {
        this.billingWeightUomId = billingWeightUomId;
    }

    public StatusItem getCarrierServiceStatusId() {
        return carrierServiceStatusId;
    }

    public void setCarrierServiceStatusId(StatusItem carrierServiceStatusId) {
        this.carrierServiceStatusId = carrierServiceStatusId;
    }

    public Party getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(Party carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Delivery getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Delivery deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Facility getDestFacilityId() {
        return destFacilityId;
    }

    public void setDestFacilityId(Facility destFacilityId) {
        this.destFacilityId = destFacilityId;
    }

    public PostalAddress getDestContactMechId() {
        return destContactMechId;
    }

    public void setDestContactMechId(PostalAddress destContactMechId) {
        this.destContactMechId = destContactMechId;
    }

    public TelecomNumber getDestTelecomNumberId() {
        return destTelecomNumberId;
    }

    public void setDestTelecomNumberId(TelecomNumber destTelecomNumberId) {
        this.destTelecomNumberId = destTelecomNumberId;
    }

    public Facility getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(Facility originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public PostalAddress getOriginContactMechId() {
        return originContactMechId;
    }

    public void setOriginContactMechId(PostalAddress originContactMechId) {
        this.originContactMechId = originContactMechId;
    }

    public TelecomNumber getOriginTelecomNumberId() {
        return originTelecomNumberId;
    }

    public void setOriginTelecomNumberId(TelecomNumber originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }

    public ShipmentMethodType getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(ShipmentMethodType shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentRouteSegmentPK != null ? shipmentRouteSegmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentRouteSegment)) {
            return false;
        }
        ShipmentRouteSegment other = (ShipmentRouteSegment) object;
        if ((this.shipmentRouteSegmentPK == null && other.shipmentRouteSegmentPK != null) || (this.shipmentRouteSegmentPK != null && !this.shipmentRouteSegmentPK.equals(other.shipmentRouteSegmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentRouteSegment[ shipmentRouteSegmentPK=" + shipmentRouteSegmentPK + " ]";
    }
    
}
