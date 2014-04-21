/**
 * 
 */
package com.wildc.ucumari.security.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author cmontes
 *
 */
@Embeddable
public class UserLoginPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4186100368622399565L;
	@Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)    
    @Column(name = "PARTY_COMPANY_ID")
    private String partyCompanyId;
    

    public UserLoginPK() {
    }
    
    public UserLoginPK(String userLoginId, String partyCompanyId) {
        this.userLoginId = userLoginId;
        this.partyCompanyId = partyCompanyId;
    }

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
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
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (partyCompanyId != null ? partyCompanyId.hashCode() : 0);
        return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof UserLoginPK)) {
			return false;
        }
		UserLoginPK other = (UserLoginPK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.partyCompanyId == null && other.partyCompanyId != null) || (this.partyCompanyId != null && !this.partyCompanyId.equals(other.partyCompanyId))) {
            return false;
        }
        return true;
	}
    
	@Override
    public String toString() {
        return "com.wildc.ucumari.security.model.UserLoginPK[ userLoginId=" + userLoginId + ", partyCompanyId=" + partyCompanyId + " ]";
    }
	

}
