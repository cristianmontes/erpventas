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
public class VisualThemeResourcePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VISUAL_THEME_ID")
    private String visualThemeId;
    @Basic(optional = false)
    @Column(name = "RESOURCE_TYPE_ENUM_ID")
    private String resourceTypeEnumId;
    @Basic(optional = false)
    @Column(name = "SEQUENCE_ID")
    private String sequenceId;

    public VisualThemeResourcePK() {
    }

    public VisualThemeResourcePK(String visualThemeId, String resourceTypeEnumId, String sequenceId) {
        this.visualThemeId = visualThemeId;
        this.resourceTypeEnumId = resourceTypeEnumId;
        this.sequenceId = sequenceId;
    }

    public String getVisualThemeId() {
        return visualThemeId;
    }

    public void setVisualThemeId(String visualThemeId) {
        this.visualThemeId = visualThemeId;
    }

    public String getResourceTypeEnumId() {
        return resourceTypeEnumId;
    }

    public void setResourceTypeEnumId(String resourceTypeEnumId) {
        this.resourceTypeEnumId = resourceTypeEnumId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visualThemeId != null ? visualThemeId.hashCode() : 0);
        hash += (resourceTypeEnumId != null ? resourceTypeEnumId.hashCode() : 0);
        hash += (sequenceId != null ? sequenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VisualThemeResourcePK)) {
            return false;
        }
        VisualThemeResourcePK other = (VisualThemeResourcePK) object;
        if ((this.visualThemeId == null && other.visualThemeId != null) || (this.visualThemeId != null && !this.visualThemeId.equals(other.visualThemeId))) {
            return false;
        }
        if ((this.resourceTypeEnumId == null && other.resourceTypeEnumId != null) || (this.resourceTypeEnumId != null && !this.resourceTypeEnumId.equals(other.resourceTypeEnumId))) {
            return false;
        }
        if ((this.sequenceId == null && other.sequenceId != null) || (this.sequenceId != null && !this.sequenceId.equals(other.sequenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.VisualThemeResourcePK[ visualThemeId=" + visualThemeId + ", resourceTypeEnumId=" + resourceTypeEnumId + ", sequenceId=" + sequenceId + " ]";
    }
    
}
