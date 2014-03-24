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
public class SegmentGroupClassificationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SEGMENT_GROUP_ID")
    private String segmentGroupId;
    @Basic(optional = false)
    @Column(name = "PARTY_CLASSIFICATION_GROUP_ID")
    private String partyClassificationGroupId;

    public SegmentGroupClassificationPK() {
    }

    public SegmentGroupClassificationPK(String segmentGroupId, String partyClassificationGroupId) {
        this.segmentGroupId = segmentGroupId;
        this.partyClassificationGroupId = partyClassificationGroupId;
    }

    public String getSegmentGroupId() {
        return segmentGroupId;
    }

    public void setSegmentGroupId(String segmentGroupId) {
        this.segmentGroupId = segmentGroupId;
    }

    public String getPartyClassificationGroupId() {
        return partyClassificationGroupId;
    }

    public void setPartyClassificationGroupId(String partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupId != null ? segmentGroupId.hashCode() : 0);
        hash += (partyClassificationGroupId != null ? partyClassificationGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupClassificationPK)) {
            return false;
        }
        SegmentGroupClassificationPK other = (SegmentGroupClassificationPK) object;
        if ((this.segmentGroupId == null && other.segmentGroupId != null) || (this.segmentGroupId != null && !this.segmentGroupId.equals(other.segmentGroupId))) {
            return false;
        }
        if ((this.partyClassificationGroupId == null && other.partyClassificationGroupId != null) || (this.partyClassificationGroupId != null && !this.partyClassificationGroupId.equals(other.partyClassificationGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupClassificationPK[ segmentGroupId=" + segmentGroupId + ", partyClassificationGroupId=" + partyClassificationGroupId + " ]";
    }
    
}
