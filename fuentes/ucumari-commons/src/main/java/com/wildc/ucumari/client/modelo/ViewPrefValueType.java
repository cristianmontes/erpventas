/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
@Table(name = "view_pref_value_type")
@NamedQueries({
    @NamedQuery(name = "ViewPrefValueType.findAll", query = "SELECT v FROM ViewPrefValueType v")})
public class ViewPrefValueType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VIEW_PREF_VALUE_TYPE_ID")
    private String viewPrefValueTypeId;
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
    @OneToMany(mappedBy = "viewPrefValueTypeId")
    private List<ViewPreference> viewPreferenceList;

    public ViewPrefValueType() {
    }

    public ViewPrefValueType(String viewPrefValueTypeId) {
        this.viewPrefValueTypeId = viewPrefValueTypeId;
    }

    public String getViewPrefValueTypeId() {
        return viewPrefValueTypeId;
    }

    public void setViewPrefValueTypeId(String viewPrefValueTypeId) {
        this.viewPrefValueTypeId = viewPrefValueTypeId;
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

    public List<ViewPreference> getViewPreferenceList() {
        return viewPreferenceList;
    }

    public void setViewPreferenceList(List<ViewPreference> viewPreferenceList) {
        this.viewPreferenceList = viewPreferenceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (viewPrefValueTypeId != null ? viewPrefValueTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewPrefValueType)) {
            return false;
        }
        ViewPrefValueType other = (ViewPrefValueType) object;
        if ((this.viewPrefValueTypeId == null && other.viewPrefValueTypeId != null) || (this.viewPrefValueTypeId != null && !this.viewPrefValueTypeId.equals(other.viewPrefValueTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ViewPrefValueType[ viewPrefValueTypeId=" + viewPrefValueTypeId + " ]";
    }
    
}
