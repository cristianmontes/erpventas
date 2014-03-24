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
@Table(name = "visual_theme_set")
@NamedQueries({
    @NamedQuery(name = "VisualThemeSet.findAll", query = "SELECT v FROM VisualThemeSet v")})
public class VisualThemeSet implements Serializable {
    @OneToMany(mappedBy = "visualThemeSetId")
    private List<VisualTheme> visualThemeList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VISUAL_THEME_SET_ID")
    private String visualThemeSetId;
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
    @OneToMany(mappedBy = "visualThemeSetId")
    private List<WebSite> webSiteList;

    public VisualThemeSet() {
    }

    public VisualThemeSet(String visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
    }

    public String getVisualThemeSetId() {
        return visualThemeSetId;
    }

    public void setVisualThemeSetId(String visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
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

    public List<WebSite> getWebSiteList() {
        return webSiteList;
    }

    public void setWebSiteList(List<WebSite> webSiteList) {
        this.webSiteList = webSiteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visualThemeSetId != null ? visualThemeSetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisualThemeSet)) {
            return false;
        }
        VisualThemeSet other = (VisualThemeSet) object;
        if ((this.visualThemeSetId == null && other.visualThemeSetId != null) || (this.visualThemeSetId != null && !this.visualThemeSetId.equals(other.visualThemeSetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VisualThemeSet[ visualThemeSetId=" + visualThemeSetId + " ]";
    }

    public List<VisualTheme> getVisualThemeList() {
        return visualThemeList;
    }

    public void setVisualThemeList(List<VisualTheme> visualThemeList) {
        this.visualThemeList = visualThemeList;
    }
    
}
