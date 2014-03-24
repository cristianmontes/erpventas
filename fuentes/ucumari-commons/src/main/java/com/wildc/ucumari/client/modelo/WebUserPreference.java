/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "web_user_preference")
@NamedQueries({
    @NamedQuery(name = "WebUserPreference.findAll", query = "SELECT w FROM WebUserPreference w")})
public class WebUserPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebUserPreferencePK webUserPreferencePK;
    @Column(name = "WEB_PREFERENCE_VALUE")
    private String webPreferenceValue;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;
    @JoinColumn(name = "WEB_PREFERENCE_TYPE_ID", referencedColumnName = "WEB_PREFERENCE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WebPreferenceType webPreferenceType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public WebUserPreference() {
    }

    public WebUserPreference(WebUserPreferencePK webUserPreferencePK) {
        this.webUserPreferencePK = webUserPreferencePK;
    }

    public WebUserPreference(String userLoginId, String partyId, String visitId, String webPreferenceTypeId) {
        this.webUserPreferencePK = new WebUserPreferencePK(userLoginId, partyId, visitId, webPreferenceTypeId);
    }

    public WebUserPreferencePK getWebUserPreferencePK() {
        return webUserPreferencePK;
    }

    public void setWebUserPreferencePK(WebUserPreferencePK webUserPreferencePK) {
        this.webUserPreferencePK = webUserPreferencePK;
    }

    public String getWebPreferenceValue() {
        return webPreferenceValue;
    }

    public void setWebPreferenceValue(String webPreferenceValue) {
        this.webPreferenceValue = webPreferenceValue;
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

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public WebPreferenceType getWebPreferenceType() {
        return webPreferenceType;
    }

    public void setWebPreferenceType(WebPreferenceType webPreferenceType) {
        this.webPreferenceType = webPreferenceType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webUserPreferencePK != null ? webUserPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebUserPreference)) {
            return false;
        }
        WebUserPreference other = (WebUserPreference) object;
        if ((this.webUserPreferencePK == null && other.webUserPreferencePK != null) || (this.webUserPreferencePK != null && !this.webUserPreferencePK.equals(other.webUserPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebUserPreference[ webUserPreferencePK=" + webUserPreferencePK + " ]";
    }
    
}
