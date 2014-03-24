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
@Table(name = "portlet_portlet_category")
@NamedQueries({
    @NamedQuery(name = "PortletPortletCategory.findAll", query = "SELECT p FROM PortletPortletCategory p")})
public class PortletPortletCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PortletPortletCategoryPK portletPortletCategoryPK;
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
    @JoinColumn(name = "PORTLET_CATEGORY_ID", referencedColumnName = "PORTLET_CATEGORY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PortletCategory portletCategory;

    public PortletPortletCategory() {
    }

    public PortletPortletCategory(PortletPortletCategoryPK portletPortletCategoryPK) {
        this.portletPortletCategoryPK = portletPortletCategoryPK;
    }

    public PortletPortletCategory(String portalPortletId, String portletCategoryId) {
        this.portletPortletCategoryPK = new PortletPortletCategoryPK(portalPortletId, portletCategoryId);
    }

    public PortletPortletCategoryPK getPortletPortletCategoryPK() {
        return portletPortletCategoryPK;
    }

    public void setPortletPortletCategoryPK(PortletPortletCategoryPK portletPortletCategoryPK) {
        this.portletPortletCategoryPK = portletPortletCategoryPK;
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

    public PortletCategory getPortletCategory() {
        return portletCategory;
    }

    public void setPortletCategory(PortletCategory portletCategory) {
        this.portletCategory = portletCategory;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portletPortletCategoryPK != null ? portletPortletCategoryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortletPortletCategory)) {
            return false;
        }
        PortletPortletCategory other = (PortletPortletCategory) object;
        if ((this.portletPortletCategoryPK == null && other.portletPortletCategoryPK != null) || (this.portletPortletCategoryPK != null && !this.portletPortletCategoryPK.equals(other.portletPortletCategoryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortletPortletCategory[ portletPortletCategoryPK=" + portletPortletCategoryPK + " ]";
    }
    
}
