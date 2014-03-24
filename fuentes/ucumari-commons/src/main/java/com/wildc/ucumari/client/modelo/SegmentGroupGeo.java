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

import com.wildc.ucumari.parameters.model.Geo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "segment_group_geo")
@NamedQueries({
    @NamedQuery(name = "SegmentGroupGeo.findAll", query = "SELECT s FROM SegmentGroupGeo s")})
public class SegmentGroupGeo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegmentGroupGeoPK segmentGroupGeoPK;
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
    @JoinColumn(name = "SEGMENT_GROUP_ID", referencedColumnName = "SEGMENT_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SegmentGroup segmentGroup;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;

    public SegmentGroupGeo() {
    }

    public SegmentGroupGeo(SegmentGroupGeoPK segmentGroupGeoPK) {
        this.segmentGroupGeoPK = segmentGroupGeoPK;
    }

    public SegmentGroupGeo(String segmentGroupId, String geoId) {
        this.segmentGroupGeoPK = new SegmentGroupGeoPK(segmentGroupId, geoId);
    }

    public SegmentGroupGeoPK getSegmentGroupGeoPK() {
        return segmentGroupGeoPK;
    }

    public void setSegmentGroupGeoPK(SegmentGroupGeoPK segmentGroupGeoPK) {
        this.segmentGroupGeoPK = segmentGroupGeoPK;
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

    public SegmentGroup getSegmentGroup() {
        return segmentGroup;
    }

    public void setSegmentGroup(SegmentGroup segmentGroup) {
        this.segmentGroup = segmentGroup;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupGeoPK != null ? segmentGroupGeoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupGeo)) {
            return false;
        }
        SegmentGroupGeo other = (SegmentGroupGeo) object;
        if ((this.segmentGroupGeoPK == null && other.segmentGroupGeoPK != null) || (this.segmentGroupGeoPK != null && !this.segmentGroupGeoPK.equals(other.segmentGroupGeoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupGeo[ segmentGroupGeoPK=" + segmentGroupGeoPK + " ]";
    }
    
}
