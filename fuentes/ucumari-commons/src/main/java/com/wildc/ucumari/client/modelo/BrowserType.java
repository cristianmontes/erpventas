/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserAgent;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "browser_type")
@NamedQueries({
    @NamedQuery(name = "BrowserType.findAll", query = "SELECT b FROM BrowserType b")})
public class BrowserType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BROWSER_TYPE_ID")
    private String browserTypeId;
    @Column(name = "BROWSER_NAME")
    private String browserName;
    @Column(name = "BROWSER_VERSION")
    private String browserVersion;
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
    @OneToMany(mappedBy = "browserTypeId")
    private List<UserAgent> userAgentList;

    public BrowserType() {
    }

    public BrowserType(String browserTypeId) {
        this.browserTypeId = browserTypeId;
    }

    public String getBrowserTypeId() {
        return browserTypeId;
    }

    public void setBrowserTypeId(String browserTypeId) {
        this.browserTypeId = browserTypeId;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
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

    public List<UserAgent> getUserAgentList() {
        return userAgentList;
    }

    public void setUserAgentList(List<UserAgent> userAgentList) {
        this.userAgentList = userAgentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (browserTypeId != null ? browserTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BrowserType)) {
            return false;
        }
        BrowserType other = (BrowserType) object;
        if ((this.browserTypeId == null && other.browserTypeId != null) || (this.browserTypeId != null && !this.browserTypeId.equals(other.browserTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BrowserType[ browserTypeId=" + browserTypeId + " ]";
    }
    
}
