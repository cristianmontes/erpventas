/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyClassificationGroup;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "segment_group_classification")
@NamedQueries({
    @NamedQuery(name = "SegmentGroupClassification.findAll", query = "SELECT s FROM SegmentGroupClassification s")})
public class SegmentGroupClassification implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegmentGroupClassificationPK segmentGroupClassificationPK;
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
    @JoinColumn(name = "PARTY_CLASSIFICATION_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyClassificationGroup partyClassificationGroup;

    public SegmentGroupClassification() {
    }

    public SegmentGroupClassification(SegmentGroupClassificationPK segmentGroupClassificationPK) {
        this.segmentGroupClassificationPK = segmentGroupClassificationPK;
    }

    public SegmentGroupClassification(String segmentGroupId, String partyClassificationGroupId) {
        this.segmentGroupClassificationPK = new SegmentGroupClassificationPK(segmentGroupId, partyClassificationGroupId);
    }

    public SegmentGroupClassificationPK getSegmentGroupClassificationPK() {
        return segmentGroupClassificationPK;
    }

    public void setSegmentGroupClassificationPK(SegmentGroupClassificationPK segmentGroupClassificationPK) {
        this.segmentGroupClassificationPK = segmentGroupClassificationPK;
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

    public PartyClassificationGroup getPartyClassificationGroup() {
        return partyClassificationGroup;
    }

    public void setPartyClassificationGroup(PartyClassificationGroup partyClassificationGroup) {
        this.partyClassificationGroup = partyClassificationGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupClassificationPK != null ? segmentGroupClassificationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupClassification)) {
            return false;
        }
        SegmentGroupClassification other = (SegmentGroupClassification) object;
        if ((this.segmentGroupClassificationPK == null && other.segmentGroupClassificationPK != null) || (this.segmentGroupClassificationPK != null && !this.segmentGroupClassificationPK.equals(other.segmentGroupClassificationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupClassification[ segmentGroupClassificationPK=" + segmentGroupClassificationPK + " ]";
    }
    
}
