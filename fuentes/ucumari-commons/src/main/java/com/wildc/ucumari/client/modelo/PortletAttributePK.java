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
public class PortletAttributePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PORTAL_PAGE_ID")
    private String portalPageId;
    @Basic(optional = false)
    @Column(name = "PORTAL_PORTLET_ID")
    private String portalPortletId;
    @Basic(optional = false)
    @Column(name = "PORTLET_SEQ_ID")
    private String portletSeqId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public PortletAttributePK() {
    }

    public PortletAttributePK(String portalPageId, String portalPortletId, String portletSeqId, String attrName) {
        this.portalPageId = portalPageId;
        this.portalPortletId = portalPortletId;
        this.portletSeqId = portletSeqId;
        this.attrName = attrName;
    }

    public String getPortalPageId() {
        return portalPageId;
    }

    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }

    public String getPortalPortletId() {
        return portalPortletId;
    }

    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortletSeqId() {
        return portletSeqId;
    }

    public void setPortletSeqId(String portletSeqId) {
        this.portletSeqId = portletSeqId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPageId != null ? portalPageId.hashCode() : 0);
        hash += (portalPortletId != null ? portalPortletId.hashCode() : 0);
        hash += (portletSeqId != null ? portletSeqId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortletAttributePK)) {
            return false;
        }
        PortletAttributePK other = (PortletAttributePK) object;
        if ((this.portalPageId == null && other.portalPageId != null) || (this.portalPageId != null && !this.portalPageId.equals(other.portalPageId))) {
            return false;
        }
        if ((this.portalPortletId == null && other.portalPortletId != null) || (this.portalPortletId != null && !this.portalPortletId.equals(other.portalPortletId))) {
            return false;
        }
        if ((this.portletSeqId == null && other.portletSeqId != null) || (this.portletSeqId != null && !this.portletSeqId.equals(other.portletSeqId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortletAttributePK[ portalPageId=" + portalPageId + ", portalPortletId=" + portalPortletId + ", portletSeqId=" + portletSeqId + ", attrName=" + attrName + " ]";
    }
    
}
