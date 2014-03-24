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
@Table(name = "context_help_resource")
@NamedQueries({
    @NamedQuery(name = "ContextHelpResource.findAll", query = "SELECT c FROM ContextHelpResource c")})
public class ContextHelpResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTEXT_HELP_RESOURCE_ID")
    private String contextHelpResourceId;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "APPLICATION_NAME")
    private String applicationName;
    @Column(name = "SCREEN_STATE")
    private String screenState;
    @Column(name = "REMOTE_PAGE_NAME")
    private String remotePageName;
    @Column(name = "REMOTE_PAGE_VERSION")
    private String remotePageVersion;
    @Column(name = "OVERRIDE_URL_PATTERN")
    private String overrideUrlPattern;
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

    public ContextHelpResource() {
    }

    public ContextHelpResource(String contextHelpResourceId) {
        this.contextHelpResourceId = contextHelpResourceId;
    }

    public String getContextHelpResourceId() {
        return contextHelpResourceId;
    }

    public void setContextHelpResourceId(String contextHelpResourceId) {
        this.contextHelpResourceId = contextHelpResourceId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getScreenState() {
        return screenState;
    }

    public void setScreenState(String screenState) {
        this.screenState = screenState;
    }

    public String getRemotePageName() {
        return remotePageName;
    }

    public void setRemotePageName(String remotePageName) {
        this.remotePageName = remotePageName;
    }

    public String getRemotePageVersion() {
        return remotePageVersion;
    }

    public void setRemotePageVersion(String remotePageVersion) {
        this.remotePageVersion = remotePageVersion;
    }

    public String getOverrideUrlPattern() {
        return overrideUrlPattern;
    }

    public void setOverrideUrlPattern(String overrideUrlPattern) {
        this.overrideUrlPattern = overrideUrlPattern;
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
        hash += (contextHelpResourceId != null ? contextHelpResourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContextHelpResource)) {
            return false;
        }
        ContextHelpResource other = (ContextHelpResource) object;
        if ((this.contextHelpResourceId == null && other.contextHelpResourceId != null) || (this.contextHelpResourceId != null && !this.contextHelpResourceId.equals(other.contextHelpResourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContextHelpResource[ contextHelpResourceId=" + contextHelpResourceId + " ]";
    }
    
}
