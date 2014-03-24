/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.security.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "user_login_history")
/*@NamedQueries({
    @NamedQuery(name = "UserLoginHistory.findAll", query = "SELECT u FROM UserLoginHistory u")})*/
public class UserLoginHistory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLoginHistoryPK userLoginHistoryPK;
    @Column(name = "VISIT_ID")
    private String visitId;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PASSWORD_USED")
    private String passwordUsed;
    @Column(name = "SUCCESSFUL_LOGIN")
    private Character successfulLogin;
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
    /*
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;*/
    /*@JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;*/
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "PARTY_COMPANY_ID")
    private String partyCompanyId;

    public UserLoginHistory() {
    }

    public UserLoginHistory(UserLoginHistoryPK userLoginHistoryPK) {
        this.userLoginHistoryPK = userLoginHistoryPK;
    }

    public UserLoginHistory(String userLoginId, Date fromDate) {
        this.userLoginHistoryPK = new UserLoginHistoryPK(userLoginId, fromDate);
    }

    public UserLoginHistoryPK getUserLoginHistoryPK() {
        return userLoginHistoryPK;
    }

    public void setUserLoginHistoryPK(UserLoginHistoryPK userLoginHistoryPK) {
        this.userLoginHistoryPK = userLoginHistoryPK;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getPasswordUsed() {
        return passwordUsed;
    }

    public void setPasswordUsed(String passwordUsed) {
        this.passwordUsed = passwordUsed;
    }

    public Character getSuccessfulLogin() {
        return successfulLogin;
    }

    public void setSuccessfulLogin(Character successfulLogin) {
        this.successfulLogin = successfulLogin;
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

    /*
    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }*/
/*
    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }*/
    
    public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
    
    public String getPartyCompanyId() {
		return partyCompanyId;
	}

	public void setPartyCompanyId(String partyCompanyId) {
		this.partyCompanyId = partyCompanyId;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginHistoryPK != null ? userLoginHistoryPK.hashCode() : 0);
        return hash;
    }    

	@Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginHistory)) {
            return false;
        }
        UserLoginHistory other = (UserLoginHistory) object;
        if ((this.userLoginHistoryPK == null && other.userLoginHistoryPK != null) || (this.userLoginHistoryPK != null && !this.userLoginHistoryPK.equals(other.userLoginHistoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UserLoginHistory[ userLoginHistoryPK=" + userLoginHistoryPK + " ]";
    }
    
}
