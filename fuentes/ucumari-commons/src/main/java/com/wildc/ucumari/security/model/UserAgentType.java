/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

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
@Table(name = "user_agent_type")
@NamedQueries({
    @NamedQuery(name = "UserAgentType.findAll", query = "SELECT u FROM UserAgentType u")})
public class UserAgentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_AGENT_TYPE_ID")
    private String userAgentTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "userAgentTypeId")
    private List<UserAgent> userAgentList;

    public UserAgentType() {
    }

    public UserAgentType(String userAgentTypeId) {
        this.userAgentTypeId = userAgentTypeId;
    }

    public String getUserAgentTypeId() {
        return userAgentTypeId;
    }

    public void setUserAgentTypeId(String userAgentTypeId) {
        this.userAgentTypeId = userAgentTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (userAgentTypeId != null ? userAgentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAgentType)) {
            return false;
        }
        UserAgentType other = (UserAgentType) object;
        if ((this.userAgentTypeId == null && other.userAgentTypeId != null) || (this.userAgentTypeId != null && !this.userAgentTypeId.equals(other.userAgentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserAgentType[ userAgentTypeId=" + userAgentTypeId + " ]";
    }
    
}
