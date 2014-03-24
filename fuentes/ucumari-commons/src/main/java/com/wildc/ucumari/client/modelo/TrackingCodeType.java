/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tracking_code_type")
@NamedQueries({
    @NamedQuery(name = "TrackingCodeType.findAll", query = "SELECT t FROM TrackingCodeType t")})
public class TrackingCodeType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRACKING_CODE_TYPE_ID")
    private String trackingCodeTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trackingCodeType")
    private List<TrackingCodeOrderReturn> trackingCodeOrderReturnList;
    @OneToMany(mappedBy = "trackingCodeTypeId")
    private List<TrackingCode> trackingCodeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trackingCodeType")
    private List<TrackingCodeOrder> trackingCodeOrderList;

    public TrackingCodeType() {
    }

    public TrackingCodeType(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
    }

    public String getTrackingCodeTypeId() {
        return trackingCodeTypeId;
    }

    public void setTrackingCodeTypeId(String trackingCodeTypeId) {
        this.trackingCodeTypeId = trackingCodeTypeId;
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

    public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturnList() {
        return trackingCodeOrderReturnList;
    }

    public void setTrackingCodeOrderReturnList(List<TrackingCodeOrderReturn> trackingCodeOrderReturnList) {
        this.trackingCodeOrderReturnList = trackingCodeOrderReturnList;
    }

    public List<TrackingCode> getTrackingCodeList() {
        return trackingCodeList;
    }

    public void setTrackingCodeList(List<TrackingCode> trackingCodeList) {
        this.trackingCodeList = trackingCodeList;
    }

    public List<TrackingCodeOrder> getTrackingCodeOrderList() {
        return trackingCodeOrderList;
    }

    public void setTrackingCodeOrderList(List<TrackingCodeOrder> trackingCodeOrderList) {
        this.trackingCodeOrderList = trackingCodeOrderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trackingCodeTypeId != null ? trackingCodeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrackingCodeType)) {
            return false;
        }
        TrackingCodeType other = (TrackingCodeType) object;
        if ((this.trackingCodeTypeId == null && other.trackingCodeTypeId != null) || (this.trackingCodeTypeId != null && !this.trackingCodeTypeId.equals(other.trackingCodeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TrackingCodeType[ trackingCodeTypeId=" + trackingCodeTypeId + " ]";
    }
    
}
