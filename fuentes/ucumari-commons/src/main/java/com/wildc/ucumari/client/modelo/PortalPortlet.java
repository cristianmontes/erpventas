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
@Table(name = "portal_portlet")
@NamedQueries({
    @NamedQuery(name = "PortalPortlet.findAll", query = "SELECT p FROM PortalPortlet p")})
public class PortalPortlet implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PORTAL_PORTLET_ID")
    private String portalPortletId;
    @Column(name = "PORTLET_NAME")
    private String portletName;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "SCREEN_LOCATION")
    private String screenLocation;
    @Column(name = "EDIT_FORM_NAME")
    private String editFormName;
    @Column(name = "EDIT_FORM_LOCATION")
    private String editFormLocation;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SCREENSHOT")
    private String screenshot;
    @Column(name = "SECURITY_SERVICE_NAME")
    private String securityServiceName;
    @Column(name = "SECURITY_MAIN_ACTION")
    private String securityMainAction;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portalPortlet")
    private List<PortletPortletCategory> portletPortletCategoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portalPortlet")
    private List<PortalPagePortlet> portalPagePortletList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portalPortlet")
    private List<PortletAttribute> portletAttributeList;

    public PortalPortlet() {
    }

    public PortalPortlet(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortalPortletId() {
        return portalPortletId;
    }

    public void setPortalPortletId(String portalPortletId) {
        this.portalPortletId = portalPortletId;
    }

    public String getPortletName() {
        return portletName;
    }

    public void setPortletName(String portletName) {
        this.portletName = portletName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getScreenLocation() {
        return screenLocation;
    }

    public void setScreenLocation(String screenLocation) {
        this.screenLocation = screenLocation;
    }

    public String getEditFormName() {
        return editFormName;
    }

    public void setEditFormName(String editFormName) {
        this.editFormName = editFormName;
    }

    public String getEditFormLocation() {
        return editFormLocation;
    }

    public void setEditFormLocation(String editFormLocation) {
        this.editFormLocation = editFormLocation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScreenshot() {
        return screenshot;
    }

    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }

    public String getSecurityServiceName() {
        return securityServiceName;
    }

    public void setSecurityServiceName(String securityServiceName) {
        this.securityServiceName = securityServiceName;
    }

    public String getSecurityMainAction() {
        return securityMainAction;
    }

    public void setSecurityMainAction(String securityMainAction) {
        this.securityMainAction = securityMainAction;
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

    public List<PortletPortletCategory> getPortletPortletCategoryList() {
        return portletPortletCategoryList;
    }

    public void setPortletPortletCategoryList(List<PortletPortletCategory> portletPortletCategoryList) {
        this.portletPortletCategoryList = portletPortletCategoryList;
    }

    public List<PortalPagePortlet> getPortalPagePortletList() {
        return portalPagePortletList;
    }

    public void setPortalPagePortletList(List<PortalPagePortlet> portalPagePortletList) {
        this.portalPagePortletList = portalPagePortletList;
    }

    public List<PortletAttribute> getPortletAttributeList() {
        return portletAttributeList;
    }

    public void setPortletAttributeList(List<PortletAttribute> portletAttributeList) {
        this.portletAttributeList = portletAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPortletId != null ? portalPortletId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortalPortlet)) {
            return false;
        }
        PortalPortlet other = (PortalPortlet) object;
        if ((this.portalPortletId == null && other.portalPortletId != null) || (this.portalPortletId != null && !this.portalPortletId.equals(other.portalPortletId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortalPortlet[ portalPortletId=" + portalPortletId + " ]";
    }
    
}
