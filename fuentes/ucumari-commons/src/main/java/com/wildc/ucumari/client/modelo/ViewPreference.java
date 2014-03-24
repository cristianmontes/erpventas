/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.Enumeration;
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
@Table(name = "view_preference")
@NamedQueries({
    @NamedQuery(name = "ViewPreference.findAll", query = "SELECT v FROM ViewPreference v")})
public class ViewPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ViewPreferencePK viewPreferencePK;
    @Column(name = "VIEW_PREF_STRING")
    private String viewPrefString;
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
    @JoinColumn(name = "VIEW_PREF_VALUE_TYPE_ID", referencedColumnName = "VIEW_PREF_VALUE_TYPE_ID")
    @ManyToOne
    private ViewPrefValueType viewPrefValueTypeId;
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UserLogin userLogin;
    @JoinColumn(name = "VIEW_PREF_TYPE_ID", referencedColumnName = "VIEW_PREF_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ViewPrefType viewPrefType;
    @JoinColumn(name = "VIEW_PREF_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration viewPrefEnumId;

    public ViewPreference() {
    }

    public ViewPreference(ViewPreferencePK viewPreferencePK) {
        this.viewPreferencePK = viewPreferencePK;
    }

    public ViewPreference(String viewPrefTypeId, String userLoginId) {
        this.viewPreferencePK = new ViewPreferencePK(viewPrefTypeId, userLoginId);
    }

    public ViewPreferencePK getViewPreferencePK() {
        return viewPreferencePK;
    }

    public void setViewPreferencePK(ViewPreferencePK viewPreferencePK) {
        this.viewPreferencePK = viewPreferencePK;
    }

    public String getViewPrefString() {
        return viewPrefString;
    }

    public void setViewPrefString(String viewPrefString) {
        this.viewPrefString = viewPrefString;
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

    public ViewPrefValueType getViewPrefValueTypeId() {
        return viewPrefValueTypeId;
    }

    public void setViewPrefValueTypeId(ViewPrefValueType viewPrefValueTypeId) {
        this.viewPrefValueTypeId = viewPrefValueTypeId;
    }

    public UserLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(UserLogin userLogin) {
        this.userLogin = userLogin;
    }

    public ViewPrefType getViewPrefType() {
        return viewPrefType;
    }

    public void setViewPrefType(ViewPrefType viewPrefType) {
        this.viewPrefType = viewPrefType;
    }

    public Enumeration getViewPrefEnumId() {
        return viewPrefEnumId;
    }

    public void setViewPrefEnumId(Enumeration viewPrefEnumId) {
        this.viewPrefEnumId = viewPrefEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viewPreferencePK != null ? viewPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewPreference)) {
            return false;
        }
        ViewPreference other = (ViewPreference) object;
        if ((this.viewPreferencePK == null && other.viewPreferencePK != null) || (this.viewPreferencePK != null && !this.viewPreferencePK.equals(other.viewPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ViewPreference[ viewPreferencePK=" + viewPreferencePK + " ]";
    }
    
}
