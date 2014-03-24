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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "webslinger_server")
@NamedQueries({
    @NamedQuery(name = "WebslingerServer.findAll", query = "SELECT w FROM WebslingerServer w")})
public class WebslingerServer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEBSLINGER_SERVER_ID")
    private String webslingerServerId;
    @Column(name = "DELEGATOR_NAME")
    private String delegatorName;
    @Column(name = "DISPATCHER_NAME")
    private String dispatcherName;
    @Column(name = "SERVER_NAME")
    private String serverName;
    @Column(name = "TARGET")
    private String target;
    @Column(name = "LOAD_AT_START")
    private Character loadAtStart;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webslingerServer")
    private List<WebslingerServerBase> webslingerServerBaseList;
    @OneToMany(mappedBy = "webslingerServerId")
    private List<WebslingerHostMapping> webslingerHostMappingList;
    @JoinColumn(name = "WEB_SITE_ID", referencedColumnName = "WEB_SITE_ID")
    @ManyToOne
    private WebSite webSiteId;

    public WebslingerServer() {
    }

    public WebslingerServer(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }

    public String getWebslingerServerId() {
        return webslingerServerId;
    }

    public void setWebslingerServerId(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }

    public String getDelegatorName() {
        return delegatorName;
    }

    public void setDelegatorName(String delegatorName) {
        this.delegatorName = delegatorName;
    }

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Character getLoadAtStart() {
        return loadAtStart;
    }

    public void setLoadAtStart(Character loadAtStart) {
        this.loadAtStart = loadAtStart;
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

    public List<WebslingerServerBase> getWebslingerServerBaseList() {
        return webslingerServerBaseList;
    }

    public void setWebslingerServerBaseList(List<WebslingerServerBase> webslingerServerBaseList) {
        this.webslingerServerBaseList = webslingerServerBaseList;
    }

    public List<WebslingerHostMapping> getWebslingerHostMappingList() {
        return webslingerHostMappingList;
    }

    public void setWebslingerHostMappingList(List<WebslingerHostMapping> webslingerHostMappingList) {
        this.webslingerHostMappingList = webslingerHostMappingList;
    }

    public WebSite getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(WebSite webSiteId) {
        this.webSiteId = webSiteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webslingerServerId != null ? webslingerServerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerServer)) {
            return false;
        }
        WebslingerServer other = (WebslingerServer) object;
        if ((this.webslingerServerId == null && other.webslingerServerId != null) || (this.webslingerServerId != null && !this.webslingerServerId.equals(other.webslingerServerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerServer[ webslingerServerId=" + webslingerServerId + " ]";
    }
    
}
