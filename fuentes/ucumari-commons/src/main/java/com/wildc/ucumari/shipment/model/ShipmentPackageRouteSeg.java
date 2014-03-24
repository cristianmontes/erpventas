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
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_package_route_seg")
@NamedQueries({
    @NamedQuery(name = "ShipmentPackageRouteSeg.findAll", query = "SELECT s FROM ShipmentPackageRouteSeg s")})
public class ShipmentPackageRouteSeg implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentPackageRouteSegPK shipmentPackageRouteSegPK;
    @Column(name = "TRACKING_CODE")
    private String trackingCode;
    @Column(name = "BOX_NUMBER")
    private String boxNumber;
    @Lob
    @Column(name = "LABEL_IMAGE")
    private byte[] labelImage;
    @Lob
    @Column(name = "LABEL_INTL_SIGN_IMAGE")
    private byte[] labelIntlSignImage;
    @Lob
    @Column(name = "LABEL_HTML")
    private String labelHtml;
    @Column(name = "LABEL_PRINTED")
    private Character labelPrinted;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PACKAGE_TRANSPORT_COST")
    private BigDecimal packageTransportCost;
    @Column(name = "PACKAGE_SERVICE_COST")
    private BigDecimal packageServiceCost;
    @Column(name = "PACKAGE_OTHER_COST")
    private BigDecimal packageOtherCost;
    @Column(name = "COD_AMOUNT")
    private BigDecimal codAmount;
    @Column(name = "INSURED_AMOUNT")
    private BigDecimal insuredAmount;
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
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_PACKAGE_SEQ_ID", referencedColumnName = "SHIPMENT_PACKAGE_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentPackage shipmentPackage;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_ROUTE_SEGMENT_ID", referencedColumnName = "SHIPMENT_ROUTE_SEGMENT_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentRouteSegment shipmentRouteSegment;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;

    public ShipmentPackageRouteSeg() {
    }

    public ShipmentPackageRouteSeg(ShipmentPackageRouteSegPK shipmentPackageRouteSegPK) {
        this.shipmentPackageRouteSegPK = shipmentPackageRouteSegPK;
    }

    public ShipmentPackageRouteSeg(String shipmentId, String shipmentPackageSeqId, String shipmentRouteSegmentId) {
        this.shipmentPackageRouteSegPK = new ShipmentPackageRouteSegPK(shipmentId, shipmentPackageSeqId, shipmentRouteSegmentId);
    }

    public ShipmentPackageRouteSegPK getShipmentPackageRouteSegPK() {
        return shipmentPackageRouteSegPK;
    }

    public void setShipmentPackageRouteSegPK(ShipmentPackageRouteSegPK shipmentPackageRouteSegPK) {
        this.shipmentPackageRouteSegPK = shipmentPackageRouteSegPK;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }

    public byte[] getLabelImage() {
        return labelImage;
    }

    public void setLabelImage(byte[] labelImage) {
        this.labelImage = labelImage;
    }

    public byte[] getLabelIntlSignImage() {
        return labelIntlSignImage;
    }

    public void setLabelIntlSignImage(byte[] labelIntlSignImage) {
        this.labelIntlSignImage = labelIntlSignImage;
    }

    public String getLabelHtml() {
        return labelHtml;
    }

    public void setLabelHtml(String labelHtml) {
        this.labelHtml = labelHtml;
    }

    public Character getLabelPrinted() {
        return labelPrinted;
    }

    public void setLabelPrinted(Character labelPrinted) {
        this.labelPrinted = labelPrinted;
    }

    public BigDecimal getPackageTransportCost() {
        return packageTransportCost;
    }

    public void setPackageTransportCost(BigDecimal packageTransportCost) {
        this.packageTransportCost = packageTransportCost;
    }

    public BigDecimal getPackageServiceCost() {
        return packageServiceCost;
    }

    public void setPackageServiceCost(BigDecimal packageServiceCost) {
        this.packageServiceCost = packageServiceCost;
    }

    public BigDecimal getPackageOtherCost() {
        return packageOtherCost;
    }

    public void setPackageOtherCost(BigDecimal packageOtherCost) {
        this.packageOtherCost = packageOtherCost;
    }

    public BigDecimal getCodAmount() {
        return codAmount;
    }

    public void setCodAmount(BigDecimal codAmount) {
        this.codAmount = codAmount;
    }

    public BigDecimal getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(BigDecimal insuredAmount) {
        this.insuredAmount = insuredAmount;
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

    public ShipmentPackage getShipmentPackage() {
        return shipmentPackage;
    }

    public void setShipmentPackage(ShipmentPackage shipmentPackage) {
        this.shipmentPackage = shipmentPackage;
    }

    public ShipmentRouteSegment getShipmentRouteSegment() {
        return shipmentRouteSegment;
    }

    public void setShipmentRouteSegment(ShipmentRouteSegment shipmentRouteSegment) {
        this.shipmentRouteSegment = shipmentRouteSegment;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentPackageRouteSegPK != null ? shipmentPackageRouteSegPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentPackageRouteSeg)) {
            return false;
        }
        ShipmentPackageRouteSeg other = (ShipmentPackageRouteSeg) object;
        if ((this.shipmentPackageRouteSegPK == null && other.shipmentPackageRouteSegPK != null) || (this.shipmentPackageRouteSegPK != null && !this.shipmentPackageRouteSegPK.equals(other.shipmentPackageRouteSegPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentPackageRouteSeg[ shipmentPackageRouteSegPK=" + shipmentPackageRouteSegPK + " ]";
    }
    
}
