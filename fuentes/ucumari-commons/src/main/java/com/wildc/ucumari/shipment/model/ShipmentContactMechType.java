/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_contact_mech_type")
public class ShipmentContactMechType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_CONTACT_MECH_TYPE_ID")
    private String shipmentContactMechTypeId;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentContactMechType")
    private List<ShipmentContactMech> shipmentContactMechList;*/

    public ShipmentContactMechType() {
    }

    public ShipmentContactMechType(String shipmentContactMechTypeId) {
        this.shipmentContactMechTypeId = shipmentContactMechTypeId;
    }

    public String getShipmentContactMechTypeId() {
        return shipmentContactMechTypeId;
    }

    public void setShipmentContactMechTypeId(String shipmentContactMechTypeId) {
        this.shipmentContactMechTypeId = shipmentContactMechTypeId;
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
    public List<ShipmentContactMech> getShipmentContactMechList() {
        return shipmentContactMechList;
    }

    public void setShipmentContactMechList(List<ShipmentContactMech> shipmentContactMechList) {
        this.shipmentContactMechList = shipmentContactMechList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentContactMechTypeId != null ? shipmentContactMechTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentContactMechType)) {
            return false;
        }
        ShipmentContactMechType other = (ShipmentContactMechType) object;
        if ((this.shipmentContactMechTypeId == null && other.shipmentContactMechTypeId != null) || (this.shipmentContactMechTypeId != null && !this.shipmentContactMechTypeId.equals(other.shipmentContactMechTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentContactMechType[ shipmentContactMechTypeId=" + shipmentContactMechTypeId + " ]";
    }
    
}
