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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "portlet_attribute")
@NamedQueries({
    @NamedQuery(name = "PortletAttribute.findAll", query = "SELECT p FROM PortletAttribute p")})
public class PortletAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PortletAttributePK portletAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
    @Column(name = "ATTR_TYPE")
    private String attrType;
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
    @JoinColumn(name = "PORTAL_PORTLET_ID", referencedColumnName = "PORTAL_PORTLET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PortalPortlet portalPortlet;

    public PortletAttribute() {
    }

    public PortletAttribute(PortletAttributePK portletAttributePK) {
        this.portletAttributePK = portletAttributePK;
    }

    public PortletAttribute(String portalPageId, String portalPortletId, String portletSeqId, String attrName) {
        this.portletAttributePK = new PortletAttributePK(portalPageId, portalPortletId, portletSeqId, attrName);
    }

    public PortletAttributePK getPortletAttributePK() {
        return portletAttributePK;
    }

    public void setPortletAttributePK(PortletAttributePK portletAttributePK) {
        this.portletAttributePK = portletAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
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

    public PortalPortlet getPortalPortlet() {
        return portalPortlet;
    }

    public void setPortalPortlet(PortalPortlet portalPortlet) {
        this.portalPortlet = portalPortlet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portletAttributePK != null ? portletAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortletAttribute)) {
            return false;
        }
        PortletAttribute other = (PortletAttribute) object;
        if ((this.portletAttributePK == null && other.portletAttributePK != null) || (this.portletAttributePK != null && !this.portletAttributePK.equals(other.portletAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortletAttribute[ portletAttributePK=" + portletAttributePK + " ]";
    }
    
}
