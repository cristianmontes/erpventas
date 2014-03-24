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
@Table(name = "platform_type")
@NamedQueries({
    @NamedQuery(name = "PlatformType.findAll", query = "SELECT p FROM PlatformType p")})
public class PlatformType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PLATFORM_TYPE_ID")
    private String platformTypeId;
    @Column(name = "PLATFORM_NAME")
    private String platformName;
    @Column(name = "PLATFORM_VERSION")
    private String platformVersion;
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
    @OneToMany(mappedBy = "platformTypeId")
    private List<UserAgent> userAgentList;

    public PlatformType() {
    }

    public PlatformType(String platformTypeId) {
        this.platformTypeId = platformTypeId;
    }

    public String getPlatformTypeId() {
        return platformTypeId;
    }

    public void setPlatformTypeId(String platformTypeId) {
        this.platformTypeId = platformTypeId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
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
        hash += (platformTypeId != null ? platformTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlatformType)) {
            return false;
        }
        PlatformType other = (PlatformType) object;
        if ((this.platformTypeId == null && other.platformTypeId != null) || (this.platformTypeId != null && !this.platformTypeId.equals(other.platformTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PlatformType[ platformTypeId=" + platformTypeId + " ]";
    }
    
}
