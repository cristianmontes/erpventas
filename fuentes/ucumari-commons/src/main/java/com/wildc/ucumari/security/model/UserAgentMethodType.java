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
@Table(name = "user_agent_method_type")
@NamedQueries({
    @NamedQuery(name = "UserAgentMethodType.findAll", query = "SELECT u FROM UserAgentMethodType u")})
public class UserAgentMethodType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_AGENT_METHOD_TYPE_ID")
    private String userAgentMethodTypeId;
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
    @OneToMany(mappedBy = "userAgentMethodTypeId")
    private List<UserAgent> userAgentList;

    public UserAgentMethodType() {
    }

    public UserAgentMethodType(String userAgentMethodTypeId) {
        this.userAgentMethodTypeId = userAgentMethodTypeId;
    }

    public String getUserAgentMethodTypeId() {
        return userAgentMethodTypeId;
    }

    public void setUserAgentMethodTypeId(String userAgentMethodTypeId) {
        this.userAgentMethodTypeId = userAgentMethodTypeId;
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
        hash += (userAgentMethodTypeId != null ? userAgentMethodTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAgentMethodType)) {
            return false;
        }
        UserAgentMethodType other = (UserAgentMethodType) object;
        if ((this.userAgentMethodTypeId == null && other.userAgentMethodTypeId != null) || (this.userAgentMethodTypeId != null && !this.userAgentMethodTypeId.equals(other.userAgentMethodTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserAgentMethodType[ userAgentMethodTypeId=" + userAgentMethodTypeId + " ]";
    }
    
}
