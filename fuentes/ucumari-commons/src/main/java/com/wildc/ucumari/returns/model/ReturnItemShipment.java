/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.shipment.model.Shipment;
import com.wildc.ucumari.shipment.model.ShipmentItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_item_shipment")
@NamedQueries({
    @NamedQuery(name = "ReturnItemShipment.findAll", query = "SELECT r FROM ReturnItemShipment r")})
public class ReturnItemShipment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReturnItemShipmentPK returnItemShipmentPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
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
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ShipmentItem shipmentItem;
    @JoinColumns({
        @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false),
        @JoinColumn(name = "RETURN_ITEM_SEQ_ID", referencedColumnName = "RETURN_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ReturnItem returnItem;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReturnHeader returnHeader;

    public ReturnItemShipment() {
    }

    public ReturnItemShipment(ReturnItemShipmentPK returnItemShipmentPK) {
        this.returnItemShipmentPK = returnItemShipmentPK;
    }

    public ReturnItemShipment(String returnId, String returnItemSeqId, String shipmentId, String shipmentItemSeqId) {
        this.returnItemShipmentPK = new ReturnItemShipmentPK(returnId, returnItemSeqId, shipmentId, shipmentItemSeqId);
    }

    public ReturnItemShipmentPK getReturnItemShipmentPK() {
        return returnItemShipmentPK;
    }

    public void setReturnItemShipmentPK(ReturnItemShipmentPK returnItemShipmentPK) {
        this.returnItemShipmentPK = returnItemShipmentPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
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

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public ReturnItem getReturnItem() {
        return returnItem;
    }

    public void setReturnItem(ReturnItem returnItem) {
        this.returnItem = returnItem;
    }

    public ReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnItemShipmentPK != null ? returnItemShipmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemShipment)) {
            return false;
        }
        ReturnItemShipment other = (ReturnItemShipment) object;
        if ((this.returnItemShipmentPK == null && other.returnItemShipmentPK != null) || (this.returnItemShipmentPK != null && !this.returnItemShipmentPK.equals(other.returnItemShipmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemShipment[ returnItemShipmentPK=" + returnItemShipmentPK + " ]";
    }
    
}
