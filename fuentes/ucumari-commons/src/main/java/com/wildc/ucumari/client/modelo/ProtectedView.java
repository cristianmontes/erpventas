/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.security.model.SecurityGroup;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "protected_view")
@NamedQueries({
    @NamedQuery(name = "ProtectedView.findAll", query = "SELECT p FROM ProtectedView p")})
public class ProtectedView implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProtectedViewPK protectedViewPK;
    @Column(name = "MAX_HITS")
    private BigInteger maxHits;
    @Column(name = "MAX_HITS_DURATION")
    private BigInteger maxHitsDuration;
    @Column(name = "TARPIT_DURATION")
    private BigInteger tarpitDuration;
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
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SecurityGroup securityGroup;

    public ProtectedView() {
    }

    public ProtectedView(ProtectedViewPK protectedViewPK) {
        this.protectedViewPK = protectedViewPK;
    }

    public ProtectedView(String groupId, String viewNameId) {
        this.protectedViewPK = new ProtectedViewPK(groupId, viewNameId);
    }

    public ProtectedViewPK getProtectedViewPK() {
        return protectedViewPK;
    }

    public void setProtectedViewPK(ProtectedViewPK protectedViewPK) {
        this.protectedViewPK = protectedViewPK;
    }

    public BigInteger getMaxHits() {
        return maxHits;
    }

    public void setMaxHits(BigInteger maxHits) {
        this.maxHits = maxHits;
    }

    public BigInteger getMaxHitsDuration() {
        return maxHitsDuration;
    }

    public void setMaxHitsDuration(BigInteger maxHitsDuration) {
        this.maxHitsDuration = maxHitsDuration;
    }

    public BigInteger getTarpitDuration() {
        return tarpitDuration;
    }

    public void setTarpitDuration(BigInteger tarpitDuration) {
        this.tarpitDuration = tarpitDuration;
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

    public SecurityGroup getSecurityGroup() {
        return securityGroup;
    }

    public void setSecurityGroup(SecurityGroup securityGroup) {
        this.securityGroup = securityGroup;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (protectedViewPK != null ? protectedViewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProtectedView)) {
            return false;
        }
        ProtectedView other = (ProtectedView) object;
        if ((this.protectedViewPK == null && other.protectedViewPK != null) || (this.protectedViewPK != null && !this.protectedViewPK.equals(other.protectedViewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProtectedView[ protectedViewPK=" + protectedViewPK + " ]";
    }
    
}
