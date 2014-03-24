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
public class PortletPortletCategoryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PORTAL_PORTLET_ID")
    private String portalPortletId;
    @Basic(optional = false)
    @Column(name = "PORTLET_CATEGORY_ID")
    private String portletCategoryId;

    public PortletPortletCategoryPK() {
    }

    public PortletPortletCategoryPK(String portalPortletId, String portletCategoryId) {
        this.portalPortletId = portalPortletId;
        this.portletCategoryId = portletCategoryId;
    }

    public String getPortalPortletId() {
        return portalPortletId;
    }

    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortletCategoryId() {
        return portletCategoryId;
    }

    public void setPortletCategoryId(String portletCategoryId) {
        this.portletCategoryId = portletCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPortletId != null ? portalPortletId.hashCode() : 0);
        hash += (portletCategoryId != null ? portletCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortletPortletCategoryPK)) {
            return false;
        }
        PortletPortletCategoryPK other = (PortletPortletCategoryPK) object;
        if ((this.portalPortletId == null && other.portalPortletId != null) || (this.portalPortletId != null && !this.portalPortletId.equals(other.portalPortletId))) {
            return false;
        }
        if ((this.portletCategoryId == null && other.portletCategoryId != null) || (this.portletCategoryId != null && !this.portletCategoryId.equals(other.portletCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortletPortletCategoryPK[ portalPortletId=" + portalPortletId + ", portletCategoryId=" + portletCategoryId + " ]";
    }
    
}
