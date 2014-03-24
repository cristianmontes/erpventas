/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "postal_address")

public class PostalAddress implements Serializable {
    /*@OneToMany(mappedBy = "destContactMechId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(mappedBy = "originContactMechId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList1;
    @OneToMany(mappedBy = "contactMechId")
    private List<UspsContactListSort> uspsContactListSortList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postalAddress")
    private List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "postalAddress")
    private List<PostalAddressBoundary> postalAddressBoundaryList;
    @OneToMany(mappedBy = "contactMechId")
    private List<GiftCard> giftCardList;
    @OneToMany(mappedBy = "contactMechId")
    private List<EftAccount> eftAccountList;
    @OneToMany(mappedBy = "contactMechId")
    private List<CreditCard> creditCardList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;
    @Column(name = "TO_NAME")
    private String toName;
    @Column(name = "ATTN_NAME")
    private String attnName;
    @Column(name = "ADDRESS1")
    private String address1;
    @Column(name = "ADDRESS2")
    private String address2;
    @Column(name = "DIRECTIONS")
    private String directions;
    @Column(name = "CITY")
    private String city;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "POSTAL_CODE_EXT")
    private String postalCodeExt;
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
    /*
    @OneToMany(mappedBy = "destinationContactMechId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "originContactMechId")
    private List<Shipment> shipmentList1;*/
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ContactMech contactMech;
    /*
    @JoinColumn(name = "STATE_PROVINCE_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo stateProvinceGeoId;
    @JoinColumn(name = "POSTAL_CODE_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo postalCodeGeoId;
    @JoinColumn(name = "GEO_POINT_ID", referencedColumnName = "GEO_POINT_ID")
    @ManyToOne
    private GeoPoint geoPointId;
    @JoinColumn(name = "COUNTY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo countyGeoId;    
    @JoinColumn(name = "COUNTRY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo countryGeoId;
    @OneToMany(mappedBy = "contactMechId1")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @OneToMany(mappedBy = "contactMechId")
    private List<BillingAccount> billingAccountList;*/

    public PostalAddress() {
    }

    public PostalAddress(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getAttnName() {
        return attnName;
    }

    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
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
/*
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public List<Shipment> getShipmentList1() {
        return shipmentList1;
    }

    public void setShipmentList1(List<Shipment> shipmentList1) {
        this.shipmentList1 = shipmentList1;
    }
    
    public Geo getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(Geo stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }

    public Geo getPostalCodeGeoId() {
        return postalCodeGeoId;
    }

    public void setPostalCodeGeoId(Geo postalCodeGeoId) {
        this.postalCodeGeoId = postalCodeGeoId;
    }

    public GeoPoint getGeoPointId() {
        return geoPointId;
    }

    public void setGeoPointId(GeoPoint geoPointId) {
        this.geoPointId = geoPointId;
    }

    public Geo getCountyGeoId() {
        return countyGeoId;
    }

    public void setCountyGeoId(Geo countyGeoId) {
        this.countyGeoId = countyGeoId;
    }*/

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
/*
    public Geo getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(Geo countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public List<BillingAccount> getBillingAccountList() {
        return billingAccountList;
    }

    public void setBillingAccountList(List<BillingAccount> billingAccountList) {
        this.billingAccountList = billingAccountList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostalAddress)) {
            return false;
        }
        PostalAddress other = (PostalAddress) object;
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PostalAddress[ contactMechId=" + contactMechId + " ]";
    }
/*
    public List<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void setCreditCardList(List<CreditCard> creditCardList) {
        this.creditCardList = creditCardList;
    }

    public List<EftAccount> getEftAccountList() {
        return eftAccountList;
    }

    public void setEftAccountList(List<EftAccount> eftAccountList) {
        this.eftAccountList = eftAccountList;
    }

    public List<GiftCard> getGiftCardList() {
        return giftCardList;
    }

    public void setGiftCardList(List<GiftCard> giftCardList) {
        this.giftCardList = giftCardList;
    }

    public List<ProdStoreFacilityByAddr> getProdStoreFacilityByAddrList() {
        return prodStoreFacilityByAddrList;
    }

    public void setProdStoreFacilityByAddrList(List<ProdStoreFacilityByAddr> prodStoreFacilityByAddrList) {
        this.prodStoreFacilityByAddrList = prodStoreFacilityByAddrList;
    }

    public List<PostalAddressBoundary> getPostalAddressBoundaryList() {
        return postalAddressBoundaryList;
    }

    public void setPostalAddressBoundaryList(List<PostalAddressBoundary> postalAddressBoundaryList) {
        this.postalAddressBoundaryList = postalAddressBoundaryList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList1() {
        return shipmentRouteSegmentList1;
    }

    public void setShipmentRouteSegmentList1(List<ShipmentRouteSegment> shipmentRouteSegmentList1) {
        this.shipmentRouteSegmentList1 = shipmentRouteSegmentList1;
    }

    public List<UspsContactListSort> getUspsContactListSortList() {
        return uspsContactListSortList;
    }

    public void setUspsContactListSortList(List<UspsContactListSort> uspsContactListSortList) {
        this.uspsContactListSortList = uspsContactListSortList;
    }*/
    
}
