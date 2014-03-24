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
@Table(name = "webslinger_host_suffix")
@NamedQueries({
    @NamedQuery(name = "WebslingerHostSuffix.findAll", query = "SELECT w FROM WebslingerHostSuffix w")})
public class WebslingerHostSuffix implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HOST_SUFFIX_ID")
    private String hostSuffixId;
    @Column(name = "HOST_SUFFIX")
    private String hostSuffix;
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

    public WebslingerHostSuffix() {
    }

    public WebslingerHostSuffix(String hostSuffixId) {
        this.hostSuffixId = hostSuffixId;
    }

    public String getHostSuffixId() {
        return hostSuffixId;
    }

    public void setHostSuffixId(String hostSuffixId) {
        this.hostSuffixId = hostSuffixId;
    }

    public String getHostSuffix() {
        return hostSuffix;
    }

    public void setHostSuffix(String hostSuffix) {
        this.hostSuffix = hostSuffix;
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
        hash += (hostSuffixId != null ? hostSuffixId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerHostSuffix)) {
            return false;
        }
        WebslingerHostSuffix other = (WebslingerHostSuffix) object;
        if ((this.hostSuffixId == null && other.hostSuffixId != null) || (this.hostSuffixId != null && !this.hostSuffixId.equals(other.hostSuffixId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerHostSuffix[ hostSuffixId=" + hostSuffixId + " ]";
    }
    
}
