/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import com.wildc.ucumari.client.modelo.BrowserType;
import com.wildc.ucumari.client.modelo.PlatformType;
import com.wildc.ucumari.client.modelo.ProtocolType;
import com.wildc.ucumari.client.modelo.Visit;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "user_agent")
@NamedQueries({
    @NamedQuery(name = "UserAgent.findAll", query = "SELECT u FROM UserAgent u")})
public class UserAgent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_AGENT_ID")
    private String userAgentId;
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
    @OneToMany(mappedBy = "userAgentId")
    private List<Visit> visitList;
    @JoinColumn(name = "USER_AGENT_TYPE_ID", referencedColumnName = "USER_AGENT_TYPE_ID")
    @ManyToOne
    private UserAgentType userAgentTypeId;
    @JoinColumn(name = "PROTOCOL_TYPE_ID", referencedColumnName = "PROTOCOL_TYPE_ID")
    @ManyToOne
    private ProtocolType protocolTypeId;
    @JoinColumn(name = "PLATFORM_TYPE_ID", referencedColumnName = "PLATFORM_TYPE_ID")
    @ManyToOne
    private PlatformType platformTypeId;
    @JoinColumn(name = "USER_AGENT_METHOD_TYPE_ID", referencedColumnName = "USER_AGENT_METHOD_TYPE_ID")
    @ManyToOne
    private UserAgentMethodType userAgentMethodTypeId;
    @JoinColumn(name = "BROWSER_TYPE_ID", referencedColumnName = "BROWSER_TYPE_ID")
    @ManyToOne
    private BrowserType browserTypeId;

    public UserAgent() {
    }

    public UserAgent(String userAgentId) {
        this.userAgentId = userAgentId;
    }

    public String getUserAgentId() {
        return userAgentId;
    }

    public void setUserAgentId(String userAgentId) {
        this.userAgentId = userAgentId;
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

    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }

    public UserAgentType getUserAgentTypeId() {
        return userAgentTypeId;
    }

    public void setUserAgentTypeId(UserAgentType userAgentTypeId) {
        this.userAgentTypeId = userAgentTypeId;
    }

    public ProtocolType getProtocolTypeId() {
        return protocolTypeId;
    }

    public void setProtocolTypeId(ProtocolType protocolTypeId) {
        this.protocolTypeId = protocolTypeId;
    }

    public PlatformType getPlatformTypeId() {
        return platformTypeId;
    }

    public void setPlatformTypeId(PlatformType platformTypeId) {
        this.platformTypeId = platformTypeId;
    }

    public UserAgentMethodType getUserAgentMethodTypeId() {
        return userAgentMethodTypeId;
    }

    public void setUserAgentMethodTypeId(UserAgentMethodType userAgentMethodTypeId) {
        this.userAgentMethodTypeId = userAgentMethodTypeId;
    }

    public BrowserType getBrowserTypeId() {
        return browserTypeId;
    }

    public void setBrowserTypeId(BrowserType browserTypeId) {
        this.browserTypeId = browserTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userAgentId != null ? userAgentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAgent)) {
            return false;
        }
        UserAgent other = (UserAgent) object;
        if ((this.userAgentId == null && other.userAgentId != null) || (this.userAgentId != null && !this.userAgentId.equals(other.userAgentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserAgent[ userAgentId=" + userAgentId + " ]";
    }
    
}
