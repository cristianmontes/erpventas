/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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

import com.wildc.ucumari.security.model.SecurityGroup;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "portal_page")
@NamedQueries({
    @NamedQuery(name = "PortalPage.findAll", query = "SELECT p FROM PortalPage p")})
public class PortalPage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PORTAL_PAGE_ID")
    private String portalPageId;
    @Column(name = "PORTAL_PAGE_NAME")
    private String portalPageName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "OWNER_USER_LOGIN_ID")
    private String ownerUserLoginId;
    @Column(name = "ORIGINAL_PORTAL_PAGE_ID")
    private String originalPortalPageId;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portalPage")
    private List<PortalPageColumn> portalPageColumnList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "portalPage")
    private List<PortalPagePortlet> portalPagePortletList;
    @JoinColumn(name = "SECURITY_GROUP_ID", referencedColumnName = "GROUP_ID")
    @ManyToOne
    private SecurityGroup securityGroupId;
    @OneToMany(mappedBy = "parentPortalPageId")
    private List<PortalPage> portalPageList;
    @JoinColumn(name = "PARENT_PORTAL_PAGE_ID", referencedColumnName = "PORTAL_PAGE_ID")
    @ManyToOne
    private PortalPage parentPortalPageId;

    public PortalPage() {
    }

    public PortalPage(String portalPageId) {
        this.portalPageId = portalPageId;
    }

    public String getPortalPageId() {
        return portalPageId;
    }

    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }

    public String getPortalPageName() {
        return portalPageName;
    }

    public void setPortalPageName(String portalPageName) {
        this.portalPageName = portalPageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwnerUserLoginId() {
        return ownerUserLoginId;
    }

    public void setOwnerUserLoginId(String ownerUserLoginId) {
        this.ownerUserLoginId = ownerUserLoginId;
    }

    public String getOriginalPortalPageId() {
        return originalPortalPageId;
    }

    public void setOriginalPortalPageId(String originalPortalPageId) {
        this.originalPortalPageId = originalPortalPageId;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public List<PortalPageColumn> getPortalPageColumnList() {
        return portalPageColumnList;
    }

    public void setPortalPageColumnList(List<PortalPageColumn> portalPageColumnList) {
        this.portalPageColumnList = portalPageColumnList;
    }

    public List<PortalPagePortlet> getPortalPagePortletList() {
        return portalPagePortletList;
    }

    public void setPortalPagePortletList(List<PortalPagePortlet> portalPagePortletList) {
        this.portalPagePortletList = portalPagePortletList;
    }

    public SecurityGroup getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(SecurityGroup securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public List<PortalPage> getPortalPageList() {
        return portalPageList;
    }

    public void setPortalPageList(List<PortalPage> portalPageList) {
        this.portalPageList = portalPageList;
    }

    public PortalPage getParentPortalPageId() {
        return parentPortalPageId;
    }

    public void setParentPortalPageId(PortalPage parentPortalPageId) {
        this.parentPortalPageId = parentPortalPageId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPageId != null ? portalPageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortalPage)) {
            return false;
        }
        PortalPage other = (PortalPage) object;
        if ((this.portalPageId == null && other.portalPageId != null) || (this.portalPageId != null && !this.portalPageId.equals(other.portalPageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortalPage[ portalPageId=" + portalPageId + " ]";
    }
    
}
