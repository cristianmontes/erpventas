/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.returns.model.ReturnHeader;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tracking_code_order_return")
@NamedQueries({
    @NamedQuery(name = "TrackingCodeOrderReturn.findAll", query = "SELECT t FROM TrackingCodeOrderReturn t")})
public class TrackingCodeOrderReturn implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TrackingCodeOrderReturnPK trackingCodeOrderReturnPK;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "IS_BILLABLE")
    private Character isBillable;
    @Column(name = "SITE_ID")
    private String siteId;
    @Column(name = "HAS_EXPORTED")
    private Character hasExported;
    @Column(name = "AFFILIATE_REFERRED_TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date affiliateReferredTimeStamp;
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
    @JoinColumn(name = "TRACKING_CODE_TYPE_ID", referencedColumnName = "TRACKING_CODE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TrackingCodeType trackingCodeType;
    @JoinColumn(name = "TRACKING_CODE_ID", referencedColumnName = "TRACKING_CODE_ID")
    @ManyToOne
    private TrackingCode trackingCodeId;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ReturnHeader returnHeader;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private OrderHeader orderHeader;

    public TrackingCodeOrderReturn() {
    }

    public TrackingCodeOrderReturn(TrackingCodeOrderReturnPK trackingCodeOrderReturnPK) {
        this.trackingCodeOrderReturnPK = trackingCodeOrderReturnPK;
    }

    public TrackingCodeOrderReturn(String returnId, String orderId, String trackingCodeTypeId) {
        this.trackingCodeOrderReturnPK = new TrackingCodeOrderReturnPK(returnId, orderId, trackingCodeTypeId);
    }

    public TrackingCodeOrderReturnPK getTrackingCodeOrderReturnPK() {
        return trackingCodeOrderReturnPK;
    }

    public void setTrackingCodeOrderReturnPK(TrackingCodeOrderReturnPK trackingCodeOrderReturnPK) {
        this.trackingCodeOrderReturnPK = trackingCodeOrderReturnPK;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public Character getIsBillable() {
        return isBillable;
    }

    public void setIsBillable(Character isBillable) {
        this.isBillable = isBillable;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Character getHasExported() {
        return hasExported;
    }

    public void setHasExported(Character hasExported) {
        this.hasExported = hasExported;
    }

    public Date getAffiliateReferredTimeStamp() {
        return affiliateReferredTimeStamp;
    }

    public void setAffiliateReferredTimeStamp(Date affiliateReferredTimeStamp) {
        this.affiliateReferredTimeStamp = affiliateReferredTimeStamp;
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

    public TrackingCodeType getTrackingCodeType() {
        return trackingCodeType;
    }

    public void setTrackingCodeType(TrackingCodeType trackingCodeType) {
        this.trackingCodeType = trackingCodeType;
    }

    public TrackingCode getTrackingCodeId() {
        return trackingCodeId;
    }

    public void setTrackingCodeId(TrackingCode trackingCodeId) {
        this.trackingCodeId = trackingCodeId;
    }

    public ReturnHeader getReturnHeader() {
        return returnHeader;
    }

    public void setReturnHeader(ReturnHeader returnHeader) {
        this.returnHeader = returnHeader;
    }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public void setOrderHeader(OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackingCodeOrderReturnPK != null ? trackingCodeOrderReturnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCodeOrderReturn)) {
            return false;
        }
        TrackingCodeOrderReturn other = (TrackingCodeOrderReturn) object;
        if ((this.trackingCodeOrderReturnPK == null && other.trackingCodeOrderReturnPK != null) || (this.trackingCodeOrderReturnPK != null && !this.trackingCodeOrderReturnPK.equals(other.trackingCodeOrderReturnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCodeOrderReturn[ trackingCodeOrderReturnPK=" + trackingCodeOrderReturnPK + " ]";
    }
    
}
