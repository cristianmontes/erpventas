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
import javax.persistence.Lob;
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
@Table(name = "view_history")
@NamedQueries({
    @NamedQuery(name = "ViewHistory.findAll", query = "SELECT v FROM ViewHistory v")})
public class ViewHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VIEW_HISTORY_ID")
    private String viewHistoryId;
    @Lob
    @Column(name = "URI")
    private String uri;
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Column(name = "APPLICATION_NAME")
    private String applicationName;
    @Column(name = "WEB_APP_NAME")
    private String webAppName;
    @Column(name = "CONTEXT_INFO")
    private String contextInfo;
    @Column(name = "EXPIRE_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expireAt;
    @Column(name = "DIGEST")
    private String digest;
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

    public ViewHistory() {
    }

    public ViewHistory(String viewHistoryId) {
        this.viewHistoryId = viewHistoryId;
    }

    public String getViewHistoryId() {
        return viewHistoryId;
    }

    public void setViewHistoryId(String viewHistoryId) {
        this.viewHistoryId = viewHistoryId;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getWebAppName() {
        return webAppName;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public String getContextInfo() {
        return contextInfo;
    }

    public void setContextInfo(String contextInfo) {
        this.contextInfo = contextInfo;
    }

    public Date getExpireAt() {
        return expireAt;
    }

    public void setExpireAt(Date expireAt) {
        this.expireAt = expireAt;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
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
        hash += (viewHistoryId != null ? viewHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewHistory)) {
            return false;
        }
        ViewHistory other = (ViewHistory) object;
        if ((this.viewHistoryId == null && other.viewHistoryId != null) || (this.viewHistoryId != null && !this.viewHistoryId.equals(other.viewHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ViewHistory[ viewHistoryId=" + viewHistoryId + " ]";
    }
    
}
