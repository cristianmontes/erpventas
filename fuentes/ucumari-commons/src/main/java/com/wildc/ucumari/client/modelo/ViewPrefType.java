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
import javax.persistence.CascadeType;
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
@Table(name = "view_pref_type")
@NamedQueries({
    @NamedQuery(name = "ViewPrefType.findAll", query = "SELECT v FROM ViewPrefType v")})
public class ViewPrefType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VIEW_PREF_TYPE_ID")
    private String viewPrefTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "APPLICATION")
    private String application;
    @Column(name = "APPLICATION_SECTION")
    private String applicationSection;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "FORM_NAME")
    private String formName;
    @Column(name = "DOM_ID")
    private String domId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "viewPrefType")
    private List<ViewPreference> viewPreferenceList;

    public ViewPrefType() {
    }

    public ViewPrefType(String viewPrefTypeId) {
        this.viewPrefTypeId = viewPrefTypeId;
    }

    public String getViewPrefTypeId() {
        return viewPrefTypeId;
    }

    public void setViewPrefTypeId(String viewPrefTypeId) {
        this.viewPrefTypeId = viewPrefTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getApplicationSection() {
        return applicationSection;
    }

    public void setApplicationSection(String applicationSection) {
        this.applicationSection = applicationSection;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getDomId() {
        return domId;
    }

    public void setDomId(String domId) {
        this.domId = domId;
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
        hash += (viewPrefTypeId != null ? viewPrefTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ViewPrefType)) {
            return false;
        }
        ViewPrefType other = (ViewPrefType) object;
        if ((this.viewPrefTypeId == null && other.viewPrefTypeId != null) || (this.viewPrefTypeId != null && !this.viewPrefTypeId.equals(other.viewPrefTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ViewPrefType[ viewPrefTypeId=" + viewPrefTypeId + " ]";
    }
    
}
