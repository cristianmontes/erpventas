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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_type")

public class ShipmentType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentType")
    private List<ShipmentTypeAttr> shipmentTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_TYPE_ID")
    private String shipmentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    /*@OneToMany(mappedBy = "shipmentTypeId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ShipmentType> shipmentTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "SHIPMENT_TYPE_ID")
    @ManyToOne
    private ShipmentType parentTypeId;

    public ShipmentType() {
    }

    public ShipmentType(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }

    public String getShipmentTypeId() {
        return shipmentTypeId;
    }

    public void setShipmentTypeId(String shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public List<ShipmentType> getShipmentTypeList() {
        return shipmentTypeList;
    }

    public void setShipmentTypeList(List<ShipmentType> shipmentTypeList) {
        this.shipmentTypeList = shipmentTypeList;
    }*/

    public ShipmentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ShipmentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentTypeId != null ? shipmentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentType)) {
            return false;
        }
        ShipmentType other = (ShipmentType) object;
        if ((this.shipmentTypeId == null && other.shipmentTypeId != null) || (this.shipmentTypeId != null && !this.shipmentTypeId.equals(other.shipmentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentType[ shipmentTypeId=" + shipmentTypeId + " ]";
    }
/*
    public List<ShipmentTypeAttr> getShipmentTypeAttrList() {
        return shipmentTypeAttrList;
    }

    public void setShipmentTypeAttrList(List<ShipmentTypeAttr> shipmentTypeAttrList) {
        this.shipmentTypeAttrList = shipmentTypeAttrList;
    }*/
    
}
