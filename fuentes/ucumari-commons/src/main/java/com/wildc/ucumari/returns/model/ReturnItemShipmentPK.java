/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ReturnItemShipmentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "RETURN_ID")
    private String returnId;
    @Basic(optional = false)
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;

    public ReturnItemShipmentPK() {
    }

    public ReturnItemShipmentPK(String returnId, String returnItemSeqId, String shipmentId, String shipmentItemSeqId) {
        this.returnId = returnId;
        this.returnItemSeqId = returnItemSeqId;
        this.shipmentId = shipmentId;
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentItemSeqId() {
        return shipmentItemSeqId;
    }

    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnId != null ? returnId.hashCode() : 0);
        hash += (returnItemSeqId != null ? returnItemSeqId.hashCode() : 0);
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        hash += (shipmentItemSeqId != null ? shipmentItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnItemShipmentPK)) {
            return false;
        }
        ReturnItemShipmentPK other = (ReturnItemShipmentPK) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        if ((this.returnItemSeqId == null && other.returnItemSeqId != null) || (this.returnItemSeqId != null && !this.returnItemSeqId.equals(other.returnItemSeqId))) {
            return false;
        }
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        if ((this.shipmentItemSeqId == null && other.shipmentItemSeqId != null) || (this.shipmentItemSeqId != null && !this.shipmentItemSeqId.equals(other.shipmentItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnItemShipmentPK[ returnId=" + returnId + ", returnItemSeqId=" + returnItemSeqId + ", shipmentId=" + shipmentId + ", shipmentItemSeqId=" + shipmentItemSeqId + " ]";
    }
    
}
