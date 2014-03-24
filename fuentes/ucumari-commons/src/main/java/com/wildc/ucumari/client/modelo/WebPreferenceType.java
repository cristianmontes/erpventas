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
@Table(name = "web_preference_type")
@NamedQueries({
    @NamedQuery(name = "WebPreferenceType.findAll", query = "SELECT w FROM WebPreferenceType w")})
public class WebPreferenceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_PREFERENCE_TYPE_ID")
    private String webPreferenceTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webPreferenceType")
    private List<WebUserPreference> webUserPreferenceList;

    public WebPreferenceType() {
    }

    public WebPreferenceType(String webPreferenceTypeId) {
        this.webPreferenceTypeId = webPreferenceTypeId;
    }

    public String getWebPreferenceTypeId() {
        return webPreferenceTypeId;
    }

    public void setWebPreferenceTypeId(String webPreferenceTypeId) {
        this.webPreferenceTypeId = webPreferenceTypeId;
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

    public List<WebUserPreference> getWebUserPreferenceList() {
        return webUserPreferenceList;
    }

    public void setWebUserPreferenceList(List<WebUserPreference> webUserPreferenceList) {
        this.webUserPreferenceList = webUserPreferenceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webPreferenceTypeId != null ? webPreferenceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebPreferenceType)) {
            return false;
        }
        WebPreferenceType other = (WebPreferenceType) object;
        if ((this.webPreferenceTypeId == null && other.webPreferenceTypeId != null) || (this.webPreferenceTypeId != null && !this.webPreferenceTypeId.equals(other.webPreferenceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebPreferenceType[ webPreferenceTypeId=" + webPreferenceTypeId + " ]";
    }
    
}
