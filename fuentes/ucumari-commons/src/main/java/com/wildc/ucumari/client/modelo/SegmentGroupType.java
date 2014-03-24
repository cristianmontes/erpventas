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
@Table(name = "segment_group_type")
@NamedQueries({
    @NamedQuery(name = "SegmentGroupType.findAll", query = "SELECT s FROM SegmentGroupType s")})
public class SegmentGroupType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEGMENT_GROUP_TYPE_ID")
    private String segmentGroupTypeId;
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
    @OneToMany(mappedBy = "segmentGroupTypeId")
    private List<SegmentGroup> segmentGroupList;

    public SegmentGroupType() {
    }

    public SegmentGroupType(String segmentGroupTypeId) {
        this.segmentGroupTypeId = segmentGroupTypeId;
    }

    public String getSegmentGroupTypeId() {
        return segmentGroupTypeId;
    }

    public void setSegmentGroupTypeId(String segmentGroupTypeId) {
        this.segmentGroupTypeId = segmentGroupTypeId;
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

    public List<SegmentGroup> getSegmentGroupList() {
        return segmentGroupList;
    }

    public void setSegmentGroupList(List<SegmentGroup> segmentGroupList) {
        this.segmentGroupList = segmentGroupList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupTypeId != null ? segmentGroupTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupType)) {
            return false;
        }
        SegmentGroupType other = (SegmentGroupType) object;
        if ((this.segmentGroupTypeId == null && other.segmentGroupTypeId != null) || (this.segmentGroupTypeId != null && !this.segmentGroupTypeId.equals(other.segmentGroupTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupType[ segmentGroupTypeId=" + segmentGroupTypeId + " ]";
    }
    
}
