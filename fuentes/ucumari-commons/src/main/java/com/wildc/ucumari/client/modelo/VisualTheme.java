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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "visual_theme")
@NamedQueries({
    @NamedQuery(name = "VisualTheme.findAll", query = "SELECT v FROM VisualTheme v")})
public class VisualTheme implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VISUAL_THEME_ID")
    private String visualThemeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visualTheme")
    private List<VisualThemeResource> visualThemeResourceList;
    @JoinColumn(name = "VISUAL_THEME_SET_ID", referencedColumnName = "VISUAL_THEME_SET_ID")
    @ManyToOne
    private VisualThemeSet visualThemeSetId;

    public VisualTheme() {
    }

    public VisualTheme(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }

    public String getVisualThemeId() {
        return visualThemeId;
    }

    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
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

    public List<VisualThemeResource> getVisualThemeResourceList() {
        return visualThemeResourceList;
    }

    public void setVisualThemeResourceList(List<VisualThemeResource> visualThemeResourceList) {
        this.visualThemeResourceList = visualThemeResourceList;
    }

    public VisualThemeSet getVisualThemeSetId() {
        return visualThemeSetId;
    }

    public void setVisualThemeSetId(VisualThemeSet visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visualThemeId != null ? visualThemeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisualTheme)) {
            return false;
        }
        VisualTheme other = (VisualTheme) object;
        if ((this.visualThemeId == null && other.visualThemeId != null) || (this.visualThemeId != null && !this.visualThemeId.equals(other.visualThemeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VisualTheme[ visualThemeId=" + visualThemeId + " ]";
    }
    
}
