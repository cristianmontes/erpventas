/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "external_user")
@NamedQueries({
    @NamedQuery(name = "ExternalUser.findAll", query = "SELECT e FROM ExternalUser e")})
public class ExternalUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AUTO_ID")
    private String autoId;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "EXTERNAL_USER_ID")
    private String externalUserId;
    @Column(name = "EXTERNAL_PASSWORD")
    private String externalPassword;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "EXTERNAL_USER_TYPE_ID", referencedColumnName = "EXTERNAL_USER_TYPE_ID")
    @ManyToOne
    private ExternalUserType externalUserTypeId;

    public ExternalUser() {
    }

    public ExternalUser(String autoId) {
        this.autoId = autoId;
    }

    public String getAutoId() {
        return autoId;
    }

    public void setAutoId(String autoId) {
        this.autoId = autoId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    public String getExternalPassword() {
        return externalPassword;
    }

    public void setExternalPassword(String externalPassword) {
        this.externalPassword = externalPassword;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public ExternalUserType getExternalUserTypeId() {
        return externalUserTypeId;
    }

    public void setExternalUserTypeId(ExternalUserType externalUserTypeId) {
        this.externalUserTypeId = externalUserTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (autoId != null ? autoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExternalUser)) {
            return false;
        }
        ExternalUser other = (ExternalUser) object;
        if ((this.autoId == null && other.autoId != null) || (this.autoId != null && !this.autoId.equals(other.autoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExternalUser[ autoId=" + autoId + " ]";
    }
    
}
