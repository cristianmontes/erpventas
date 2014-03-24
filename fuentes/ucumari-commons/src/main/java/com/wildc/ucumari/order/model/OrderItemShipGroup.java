/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import com.wildc.ucumari.client.modelo.CarrierShipmentMethod;
import com.wildc.ucumari.client.modelo.PicklistBin;
import com.wildc.ucumari.client.modelo.PicklistItem;
import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.contact.model.PostalAddress;
import com.wildc.ucumari.contact.model.TelecomNumber;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;

import java.io.Serializable;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_item_ship_group")
@NamedQueries({
    @NamedQuery(name = "OrderItemShipGroup.findAll", query = "SELECT o FROM OrderItemShipGroup o")})
public class OrderItemShipGroup implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderItemShipGroup")
    private List<PicklistItem> picklistItemList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrderItemShipGroupPK orderItemShipGroupPK;
    @Column(name = "TRACKING_NUMBER")
    private String trackingNumber;
    @Column(name = "SHIPPING_INSTRUCTIONS")
    private String shippingInstructions;
    @Column(name = "MAY_SPLIT")
    private Character maySplit;
    @Column(name = "GIFT_MESSAGE")
    private String giftMessage;
    @Column(name = "IS_GIFT")
    private Character isGift;
    @Column(name = "SHIP_AFTER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipAfterDate;
    @Column(name = "SHIP_BY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shipByDate;
    @Column(name = "ESTIMATED_SHIP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedShipDate;
    @Column(name = "ESTIMATED_DELIVERY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedDeliveryDate;
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
    @Column(name = "THIRD_PARTY_ACCOUNT_NUMBER")
    private String thirdPartyAccountNumber;
    @Column(name = "THIRD_PARTY_POSTAL_CODE")
    private String thirdPartyPostalCode;
    @Column(name = "THIRD_PARTY_COUNTRY_GEO_CODE")
    private String thirdPartyCountryGeoCode;
    @JoinColumn(name = "VENDOR_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party vendorPartyId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    @JoinColumns({
        @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "CARRIER_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private PartyRole partyRole;
    @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party carrierPartyId;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID"),
        @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "CARRIER_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private CarrierShipmentMethod carrierShipmentMethod;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress contactMechId1;
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID")
    @ManyToOne
    private ShipmentMethodType shipmentMethodTypeId;
    @JoinColumn(name = "SUPPLIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party supplierPartyId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "TELECOM_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private TelecomNumber telecomContactMechId;
    @JoinColumn(name = "TELECOM_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech telecomContactMechId1;
    @OneToMany(mappedBy = "orderItemShipGroup")
    private List<PicklistBin> picklistBinList;

    public OrderItemShipGroup() {
    }

    public OrderItemShipGroup(OrderItemShipGroupPK orderItemShipGroupPK) {
        this.orderItemShipGroupPK = orderItemShipGroupPK;
    }

    public OrderItemShipGroup(String orderId, String shipGroupSeqId) {
        this.orderItemShipGroupPK = new OrderItemShipGroupPK(orderId, shipGroupSeqId);
    }

    public OrderItemShipGroupPK getOrderItemShipGroupPK() {
        return orderItemShipGroupPK;
    }

    public void setOrderItemShipGroupPK(OrderItemShipGroupPK orderItemShipGroupPK) {
        this.orderItemShipGroupPK = orderItemShipGroupPK;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;
    }

    public Character getMaySplit() {
        return maySplit;
    }

    public void setMaySplit(Character maySplit) {
        this.maySplit = maySplit;
    }

    public String getGiftMessage() {
        return giftMessage;
    }

    public void setGiftMessage(String giftMessage) {
        this.giftMessage = giftMessage;
    }

    public Character getIsGift() {
        return isGift;
    }

    public void setIsGift(Character isGift) {
        this.isGift = isGift;
    }

    public Date getShipAfterDate() {
        return shipAfterDate;
    }

    public void setShipAfterDate(Date shipAfterDate) {
        this.shipAfterDate = shipAfterDate;
    }

    public Date getShipByDate() {
        return shipByDate;
    }

    public void setShipByDate(Date shipByDate) {
        this.shipByDate = shipByDate;
    }

    public Date getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(Date estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
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

    public Party getVendorPartyId() {
        return vendorPartyId;
    }

    public void setVendorPartyId(Party vendorPartyId) {
        this.vendorPartyId = vendorPartyId;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(Party carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    public CarrierShipmentMethod getCarrierShipmentMethod() {
        return carrierShipmentMethod;
    }

    public void setCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
        this.carrierShipmentMethod = carrierShipmentMethod;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    public PostalAddress getContactMechId1() {
        return contactMechId1;
    }

    public void setContactMechId1(PostalAddress contactMechId1) {
        this.contactMechId1 = contactMechId1;
    }

    public ShipmentMethodType getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(ShipmentMethodType shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public Party getSupplierPartyId() {
        return supplierPartyId;
    }

    public void setSupplierPartyId(Party supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public TelecomNumber getTelecomContactMechId() {
        return telecomContactMechId;
    }

    public void setTelecomContactMechId(TelecomNumber telecomContactMechId) {
        this.telecomContactMechId = telecomContactMechId;
    }

    public ContactMech getTelecomContactMechId1() {
        return telecomContactMechId1;
    }

    public void setTelecomContactMechId1(ContactMech telecomContactMechId1) {
        this.telecomContactMechId1 = telecomContactMechId1;
    }

    public List<PicklistBin> getPicklistBinList() {
        return picklistBinList;
    }

    public void setPicklistBinList(List<PicklistBin> picklistBinList) {
        this.picklistBinList = picklistBinList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderItemShipGroupPK != null ? orderItemShipGroupPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderItemShipGroup)) {
            return false;
        }
        OrderItemShipGroup other = (OrderItemShipGroup) object;
        if ((this.orderItemShipGroupPK == null && other.orderItemShipGroupPK != null) || (this.orderItemShipGroupPK != null && !this.orderItemShipGroupPK.equals(other.orderItemShipGroupPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderItemShipGroup[ orderItemShipGroupPK=" + orderItemShipGroupPK + " ]";
    }

    public List<PicklistItem> getPicklistItemList() {
        return picklistItemList;
    }

    public void setPicklistItemList(List<PicklistItem> picklistItemList) {
        this.picklistItemList = picklistItemList;
    }
    
}
