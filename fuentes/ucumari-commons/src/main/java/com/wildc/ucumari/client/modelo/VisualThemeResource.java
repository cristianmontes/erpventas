/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "visual_theme_resource")
@NamedQueries({
    @NamedQuery(name = "VisualThemeResource.findAll", query = "SELECT v FROM VisualThemeResource v")})
public class VisualThemeResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VisualThemeResourcePK visualThemeResourcePK;
    @Column(name = "RESOURCE_VALUE")
    private String resourceValue;
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
    @JoinColumn(name = "RESOURCE_TYPE_ENUM_ID", referencedColumnName = "ENUM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Enumeration enumeration;
    @JoinColumn(name = "VISUAL_THEME_ID", referencedColumnName = "VISUAL_THEME_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private VisualTheme visualTheme;

    public VisualThemeResource() {
    }

    public VisualThemeResource(VisualThemeResourcePK visualThemeResourcePK) {
        this.visualThemeResourcePK = visualThemeResourcePK;
    }

    public VisualThemeResource(String visualThemeId, String resourceTypeEnumId, String sequenceId) {
        this.visualThemeResourcePK = new VisualThemeResourcePK(visualThemeId, resourceTypeEnumId, sequenceId);
    }

    public VisualThemeResourcePK getVisualThemeResourcePK() {
        return visualThemeResourcePK;
    }

    public void setVisualThemeResourcePK(VisualThemeResourcePK visualThemeResourcePK) {
        this.visualThemeResourcePK = visualThemeResourcePK;
    }

    public String getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
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

    public Enumeration getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public VisualTheme getVisualTheme() {
        return visualTheme;
    }

    public void setVisualTheme(VisualTheme visualTheme) {
        this.visualTheme = visualTheme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visualThemeResourcePK != null ? visualThemeResourcePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisualThemeResource)) {
            return false;
        }
        VisualThemeResource other = (VisualThemeResource) object;
        if ((this.visualThemeResourcePK == null && other.visualThemeResourcePK != null) || (this.visualThemeResourcePK != null && !this.visualThemeResourcePK.equals(other.visualThemeResourcePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VisualThemeResource[ visualThemeResourcePK=" + visualThemeResourcePK + " ]";
    }
    
}
