/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.FixedAsset;
import com.wildc.ucumari.parameters.model.StatusItem;

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
@Table(name = "party_fixed_asset_assignment")
@NamedQueries({
    @NamedQuery(name = "PartyFixedAssetAssignment.findAll", query = "SELECT p FROM PartyFixedAssetAssignment p")})
public class PartyFixedAssetAssignment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyFixedAssetAssignmentPK partyFixedAssetAssignmentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "ALLOCATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date allocatedDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FixedAsset fixedAsset;

    public PartyFixedAssetAssignment() {
    }

    public PartyFixedAssetAssignment(PartyFixedAssetAssignmentPK partyFixedAssetAssignmentPK) {
        this.partyFixedAssetAssignmentPK = partyFixedAssetAssignmentPK;
    }

    public PartyFixedAssetAssignment(String partyId, String roleTypeId, String fixedAssetId, Date fromDate) {
        this.partyFixedAssetAssignmentPK = new PartyFixedAssetAssignmentPK(partyId, roleTypeId, fixedAssetId, fromDate);
    }

    public PartyFixedAssetAssignmentPK getPartyFixedAssetAssignmentPK() {
        return partyFixedAssetAssignmentPK;
    }

    public void setPartyFixedAssetAssignmentPK(PartyFixedAssetAssignmentPK partyFixedAssetAssignmentPK) {
        this.partyFixedAssetAssignmentPK = partyFixedAssetAssignmentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public Date getAllocatedDate() {
        return allocatedDate;
    }

    public void setAllocatedDate(Date allocatedDate) {
        this.allocatedDate = allocatedDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public FixedAsset getFixedAsset() {
        return fixedAsset;
    }

    public void setFixedAsset(FixedAsset fixedAsset) {
        this.fixedAsset = fixedAsset;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyFixedAssetAssignmentPK != null ? partyFixedAssetAssignmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyFixedAssetAssignment)) {
            return false;
        }
        PartyFixedAssetAssignment other = (PartyFixedAssetAssignment) object;
        if ((this.partyFixedAssetAssignmentPK == null && other.partyFixedAssetAssignmentPK != null) || (this.partyFixedAssetAssignmentPK != null && !this.partyFixedAssetAssignmentPK.equals(other.partyFixedAssetAssignmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyFixedAssetAssignment[ partyFixedAssetAssignmentPK=" + partyFixedAssetAssignmentPK + " ]";
    }
    
}
