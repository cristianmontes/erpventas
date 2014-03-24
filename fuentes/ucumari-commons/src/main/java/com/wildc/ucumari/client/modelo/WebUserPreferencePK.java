/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WebUserPreferencePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Basic(optional = false)
    @Column(name = "WEB_PREFERENCE_TYPE_ID")
    private String webPreferenceTypeId;

    public WebUserPreferencePK() {
    }

    public WebUserPreferencePK(String userLoginId, String partyId, String visitId, String webPreferenceTypeId) {
        this.userLoginId = userLoginId;
        this.partyId = partyId;
        this.visitId = visitId;
        this.webPreferenceTypeId = webPreferenceTypeId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getWebPreferenceTypeId() {
        return webPreferenceTypeId;
    }

    public void setWebPreferenceTypeId(String webPreferenceTypeId) {
        this.webPreferenceTypeId = webPreferenceTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLoginId != null ? userLoginId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (visitId != null ? visitId.hashCode() : 0);
        hash += (webPreferenceTypeId != null ? webPreferenceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebUserPreferencePK)) {
            return false;
        }
        WebUserPreferencePK other = (WebUserPreferencePK) object;
        if ((this.userLoginId == null && other.userLoginId != null) || (this.userLoginId != null && !this.userLoginId.equals(other.userLoginId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        if ((this.webPreferenceTypeId == null && other.webPreferenceTypeId != null) || (this.webPreferenceTypeId != null && !this.webPreferenceTypeId.equals(other.webPreferenceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebUserPreferencePK[ userLoginId=" + userLoginId + ", partyId=" + partyId + ", visitId=" + visitId + ", webPreferenceTypeId=" + webPreferenceTypeId + " ]";
    }
    
}
