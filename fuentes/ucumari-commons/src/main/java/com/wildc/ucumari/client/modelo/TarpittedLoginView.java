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
@Table(name = "tarpitted_login_view")
@NamedQueries({
    @NamedQuery(name = "TarpittedLoginView.findAll", query = "SELECT t FROM TarpittedLoginView t")})
public class TarpittedLoginView implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TarpittedLoginViewPK tarpittedLoginViewPK;
    @Column(name = "TARPIT_RELEASE_DATE_TIME")
    private BigInteger tarpitReleaseDateTime;
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

    public TarpittedLoginView() {
    }

    public TarpittedLoginView(TarpittedLoginViewPK tarpittedLoginViewPK) {
        this.tarpittedLoginViewPK = tarpittedLoginViewPK;
    }

    public TarpittedLoginView(String viewNameId, String userLoginId) {
        this.tarpittedLoginViewPK = new TarpittedLoginViewPK(viewNameId, userLoginId);
    }

    public TarpittedLoginViewPK getTarpittedLoginViewPK() {
        return tarpittedLoginViewPK;
    }

    public void setTarpittedLoginViewPK(TarpittedLoginViewPK tarpittedLoginViewPK) {
        this.tarpittedLoginViewPK = tarpittedLoginViewPK;
    }

    public BigInteger getTarpitReleaseDateTime() {
        return tarpitReleaseDateTime;
    }

    public void setTarpitReleaseDateTime(BigInteger tarpitReleaseDateTime) {
        this.tarpitReleaseDateTime = tarpitReleaseDateTime;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarpittedLoginViewPK != null ? tarpittedLoginViewPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TarpittedLoginView)) {
            return false;
        }
        TarpittedLoginView other = (TarpittedLoginView) object;
        if ((this.tarpittedLoginViewPK == null && other.tarpittedLoginViewPK != null) || (this.tarpittedLoginViewPK != null && !this.tarpittedLoginViewPK.equals(other.tarpittedLoginViewPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TarpittedLoginView[ tarpittedLoginViewPK=" + tarpittedLoginViewPK + " ]";
    }
    
}
