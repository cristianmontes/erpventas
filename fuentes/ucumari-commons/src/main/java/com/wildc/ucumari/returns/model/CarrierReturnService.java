/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "carrier_return_service")
public class CarrierReturnService implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CARRIER_RETURN_SERVICE_ID")
    private String carrierReturnServiceId;
    @Column(name = "CARRIER_SERVICE_CODE")
    private String carrierServiceCode;
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
    /*@OneToMany(mappedBy = "carrierReturnServiceId")
    private List<ReturnHeader> returnHeaderList;*/
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID")
    @ManyToOne
    private ShipmentMethodType shipmentMethodTypeId;
    @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party carrierPartyId;

    public CarrierReturnService() {
    }

    public CarrierReturnService(String carrierReturnServiceId) {
        this.carrierReturnServiceId = carrierReturnServiceId;
    }

    public String getCarrierReturnServiceId() {
        return carrierReturnServiceId;
    }

    public void setCarrierReturnServiceId(String carrierReturnServiceId) {
        this.carrierReturnServiceId = carrierReturnServiceId;
    }

    public String getCarrierServiceCode() {
        return carrierServiceCode;
    }

    public void setCarrierServiceCode(String carrierServiceCode) {
        this.carrierServiceCode = carrierServiceCode;
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
/*
    public List<ReturnHeader> getReturnHeaderList() {
        return returnHeaderList;
    }

    public void setReturnHeaderList(List<ReturnHeader> returnHeaderList) {
        this.returnHeaderList = returnHeaderList;
    }*/

    public ShipmentMethodType getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(ShipmentMethodType shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public Party getCarrierPartyId() {
        return carrierPartyId;
    }

    public void setCarrierPartyId(Party carrierPartyId) {
        this.carrierPartyId = carrierPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carrierReturnServiceId != null ? carrierReturnServiceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrierReturnService)) {
            return false;
        }
        CarrierReturnService other = (CarrierReturnService) object;
        if ((this.carrierReturnServiceId == null && other.carrierReturnServiceId != null) || (this.carrierReturnServiceId != null && !this.carrierReturnServiceId.equals(other.carrierReturnServiceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CarrierReturnService[ carrierReturnServiceId=" + carrierReturnServiceId + " ]";
    }
    
}
