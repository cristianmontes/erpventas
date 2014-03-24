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
public class UserLoginPasswordHistoryPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4353195633400080570L;
	@Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public UserLoginPasswordHistoryPK() {
    }

    public UserLoginPasswordHistoryPK(String userLoginId, Date fromDate) {
        this.userLoginId = userLoginId;
        this.fromDate = fromDate;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
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
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginPasswordHistoryPK)) {
            return false;
        }
        UserLoginPasswordHistoryPK other = (UserLoginPasswordHistoryPK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginPasswordHistoryPK[ userLoginId=" + userLoginId + ", fromDate=" + fromDate + " ]";
    }
    
}
