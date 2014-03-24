/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class UserLoginSecurityGroupPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 3624390878683646667L;
	@Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public UserLoginSecurityGroupPK() {
    }

    public UserLoginSecurityGroupPK(String userLoginId, String groupId, Date fromDate) {
        this.userLoginId = userLoginId;
        this.groupId = groupId;
        this.fromDate = fromDate;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (groupId != null ? groupId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginSecurityGroupPK)) {
            return false;
        }
        UserLoginSecurityGroupPK other = (UserLoginSecurityGroupPK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginSecurityGroupPK[ userLoginId=" + userLoginId + ", groupId=" + groupId + ", fromDate=" + fromDate + " ]";
    }
    
}
