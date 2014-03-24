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
@Table(name = "telecom_number")
public class TelecomNumber implements Serializable {
    /*@OneToMany(mappedBy = "destTelecomNumberId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(mappedBy = "originTelecomNumberId")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList1;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;
    @Column(name = "COUNTRY_CODE")
    private String countryCode;
    @Column(name = "AREA_CODE")
    private String areaCode;
    @Column(name = "CONTACT_NUMBER")
    private String contactNumber;
    @Column(name = "ASK_FOR_NAME")
    private String askForName;
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
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ContactMech contactMech;
    /*
    @OneToMany(mappedBy = "destinationTelecomNumberId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "originTelecomNumberId")
    private List<Shipment> shipmentList1;    
    @OneToMany(mappedBy = "telecomContactMechId")
    private List<OrderItemShipGroup> orderItemShipGroupList;*/

    public TelecomNumber() {
    }

    public TelecomNumber(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAskForName() {
        return askForName;
    }

    public void setAskForName(String askForName) {
        this.askForName = askForName;
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
    }*/

    public ContactMech getContactMech() {
        return contactMech;
    }

    public void setContactMech(ContactMech contactMech) {
        this.contactMech = contactMech;
    }
/*
    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
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
        if (!(object instanceof TelecomNumber)) {
            return false;
        }
        TelecomNumber other = (TelecomNumber) object;
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TelecomNumber[ contactMechId=" + contactMechId + " ]";
    }
/*
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
    }*/
    
}
