/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "segment_group_role")
@NamedQueries({
    @NamedQuery(name = "SegmentGroupRole.findAll", query = "SELECT s FROM SegmentGroupRole s")})
public class SegmentGroupRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SegmentGroupRolePK segmentGroupRolePK;
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
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;

    public SegmentGroupRole() {
    }

    public SegmentGroupRole(SegmentGroupRolePK segmentGroupRolePK) {
        this.segmentGroupRolePK = segmentGroupRolePK;
    }

    public SegmentGroupRole(String segmentGroupId, String partyId, String roleTypeId) {
        this.segmentGroupRolePK = new SegmentGroupRolePK(segmentGroupId, partyId, roleTypeId);
    }

    public SegmentGroupRolePK getSegmentGroupRolePK() {
        return segmentGroupRolePK;
    }

    public void setSegmentGroupRolePK(SegmentGroupRolePK segmentGroupRolePK) {
        this.segmentGroupRolePK = segmentGroupRolePK;
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

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupRolePK != null ? segmentGroupRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroupRole)) {
            return false;
        }
        SegmentGroupRole other = (SegmentGroupRole) object;
        if ((this.segmentGroupRolePK == null && other.segmentGroupRolePK != null) || (this.segmentGroupRolePK != null && !this.segmentGroupRolePK.equals(other.segmentGroupRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroupRole[ segmentGroupRolePK=" + segmentGroupRolePK + " ]";
    }
    
}
