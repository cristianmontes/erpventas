/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_package")
public class ShipmentPackage implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentPackage")
    private List<ShipmentPackageRouteSeg> shipmentPackageRouteSegList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentPackage")
    private List<ShipmentPackageContent> shipmentPackageContentList;
    @OneToMany(mappedBy = "shipmentPackage")
    private List<ShippingDocument> shippingDocumentList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentPackagePK shipmentPackagePK;
    @Column(name = "DATE_CREATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "WEIGHT")
    private BigDecimal weight;
    @Column(name = "INSURED_VALUE")
    private BigDecimal insuredValue;
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
    /*@OneToMany(mappedBy = "shipmentPackage")
    private List<ShipmentReceipt> shipmentReceiptList;*/
    @JoinColumn(name = "WEIGHT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom weightUomId;
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;
    /*@JoinColumn(name = "SHIPMENT_BOX_TYPE_ID", referencedColumnName = "SHIPMENT_BOX_TYPE_ID")
    @ManyToOne
    private ShipmentBoxType shipmentBoxTypeId;*/

    public ShipmentPackage() {
    }

    public ShipmentPackage(ShipmentPackagePK shipmentPackagePK) {
        this.shipmentPackagePK = shipmentPackagePK;
    }

    public ShipmentPackage(String shipmentId, String shipmentPackageSeqId) {
        this.shipmentPackagePK = new ShipmentPackagePK(shipmentId, shipmentPackageSeqId);
    }

    public ShipmentPackagePK getShipmentPackagePK() {
        return shipmentPackagePK;
    }

    public void setShipmentPackagePK(ShipmentPackagePK shipmentPackagePK) {
        this.shipmentPackagePK = shipmentPackagePK;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getInsuredValue() {
        return insuredValue;
    }

    public void setInsuredValue(BigDecimal insuredValue) {
        this.insuredValue = insuredValue;
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
    public List<ShipmentReceipt> getShipmentReceiptList() {
        return shipmentReceiptList;
    }

    public void setShipmentReceiptList(List<ShipmentReceipt> shipmentReceiptList) {
        this.shipmentReceiptList = shipmentReceiptList;
    }*/

    public Uom getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(Uom weightUomId) {
        this.weightUomId = weightUomId;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
/*
    public ShipmentBoxType getShipmentBoxTypeId() {
        return shipmentBoxTypeId;
    }

    public void setShipmentBoxTypeId(ShipmentBoxType shipmentBoxTypeId) {
        this.shipmentBoxTypeId = shipmentBoxTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentPackagePK != null ? shipmentPackagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackage)) {
            return false;
        }
        ShipmentPackage other = (ShipmentPackage) object;
        if ((this.shipmentPackagePK == null && other.shipmentPackagePK != null) || (this.shipmentPackagePK != null && !this.shipmentPackagePK.equals(other.shipmentPackagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackage[ shipmentPackagePK=" + shipmentPackagePK + " ]";
    }
/*
    public List<ShipmentPackageRouteSeg> getShipmentPackageRouteSegList() {
        return shipmentPackageRouteSegList;
    }

    public void setShipmentPackageRouteSegList(List<ShipmentPackageRouteSeg> shipmentPackageRouteSegList) {
        this.shipmentPackageRouteSegList = shipmentPackageRouteSegList;
    }

    public List<ShipmentPackageContent> getShipmentPackageContentList() {
        return shipmentPackageContentList;
    }

    public void setShipmentPackageContentList(List<ShipmentPackageContent> shipmentPackageContentList) {
        this.shipmentPackageContentList = shipmentPackageContentList;
    }

    public List<ShippingDocument> getShippingDocumentList() {
        return shippingDocumentList;
    }

    public void setShippingDocumentList(List<ShippingDocument> shippingDocumentList) {
        this.shippingDocumentList = shippingDocumentList;
    }*/
    
}
