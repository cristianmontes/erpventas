/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class TrackingCodeOrderPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "TRACKING_CODE_TYPE_ID")
    private String trackingCodeTypeId;

    public TrackingCodeOrderPK() {
    }

    public TrackingCodeOrderPK(String orderId, String trackingCodeTypeId) {
        this.orderId = orderId;
        this.trackingCodeTypeId = trackingCodeTypeId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getTrackingCodeTypeId() {
        return trackingCodeTypeId;
    }

    public void setTrackingCodeTypeId(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (trackingCodeTypeId != null ? trackingCodeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCodeOrderPK)) {
            return false;
        }
        TrackingCodeOrderPK other = (TrackingCodeOrderPK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.trackingCodeTypeId == null && other.trackingCodeTypeId != null) || (this.trackingCodeTypeId != null && !this.trackingCodeTypeId.equals(other.trackingCodeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCodeOrderPK[ orderId=" + orderId + ", trackingCodeTypeId=" + trackingCodeTypeId + " ]";
    }
    
}
