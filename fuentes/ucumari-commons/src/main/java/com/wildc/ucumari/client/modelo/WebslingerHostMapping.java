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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "webslinger_host_mapping")
@NamedQueries({
    @NamedQuery(name = "WebslingerHostMapping.findAll", query = "SELECT w FROM WebslingerHostMapping w")})
public class WebslingerHostMapping implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebslingerHostMappingPK webslingerHostMappingPK;
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
    @JoinColumn(name = "WEBSLINGER_SERVER_ID", referencedColumnName = "WEBSLINGER_SERVER_ID")
    @ManyToOne
    private WebslingerServer webslingerServerId;

    public WebslingerHostMapping() {
    }

    public WebslingerHostMapping(WebslingerHostMappingPK webslingerHostMappingPK) {
        this.webslingerHostMappingPK = webslingerHostMappingPK;
    }

    public WebslingerHostMapping(String hostName, String contextPath) {
        this.webslingerHostMappingPK = new WebslingerHostMappingPK(hostName, contextPath);
    }

    public WebslingerHostMappingPK getWebslingerHostMappingPK() {
        return webslingerHostMappingPK;
    }

    public void setWebslingerHostMappingPK(WebslingerHostMappingPK webslingerHostMappingPK) {
        this.webslingerHostMappingPK = webslingerHostMappingPK;
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

    public WebslingerServer getWebslingerServerId() {
        return webslingerServerId;
    }

    public void setWebslingerServerId(WebslingerServer webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webslingerHostMappingPK != null ? webslingerHostMappingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerHostMapping)) {
            return false;
        }
        WebslingerHostMapping other = (WebslingerHostMapping) object;
        if ((this.webslingerHostMappingPK == null && other.webslingerHostMappingPK != null) || (this.webslingerHostMappingPK != null && !this.webslingerHostMappingPK.equals(other.webslingerHostMappingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerHostMapping[ webslingerHostMappingPK=" + webslingerHostMappingPK + " ]";
    }
    
}
