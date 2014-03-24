/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "portal_page_portlet")
@NamedQueries({
    @NamedQuery(name = "PortalPagePortlet.findAll", query = "SELECT p FROM PortalPagePortlet p")})
public class PortalPagePortlet implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PortalPagePortletPK portalPagePortletPK;
    @Column(name = "COLUMN_SEQ_ID")
    private String columnSeqId;
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
    @JoinColumn(name = "PORTAL_PORTLET_ID", referencedColumnName = "PORTAL_PORTLET_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PortalPortlet portalPortlet;
    @JoinColumn(name = "PORTAL_PAGE_ID", referencedColumnName = "PORTAL_PAGE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PortalPage portalPage;

    public PortalPagePortlet() {
    }

    public PortalPagePortlet(PortalPagePortletPK portalPagePortletPK) {
        this.portalPagePortletPK = portalPagePortletPK;
    }

    public PortalPagePortlet(String portalPageId, String portalPortletId, String portletSeqId) {
        this.portalPagePortletPK = new PortalPagePortletPK(portalPageId, portalPortletId, portletSeqId);
    }

    public PortalPagePortletPK getPortalPagePortletPK() {
        return portalPagePortletPK;
    }

    public void setPortalPagePortletPK(PortalPagePortletPK portalPagePortletPK) {
        this.portalPagePortletPK = portalPagePortletPK;
    }

    public String getColumnSeqId() {
        return columnSeqId;
    }

    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
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

    public PortalPortlet getPortalPortlet() {
        return portalPortlet;
    }

    public void setPortalPortlet(PortalPortlet portalPortlet) {
        this.portalPortlet = portalPortlet;
    }

    public PortalPage getPortalPage() {
        return portalPage;
    }

    public void setPortalPage(PortalPage portalPage) {
        this.portalPage = portalPage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPagePortletPK != null ? portalPagePortletPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortalPagePortlet)) {
            return false;
        }
        PortalPagePortlet other = (PortalPagePortlet) object;
        if ((this.portalPagePortletPK == null && other.portalPagePortletPK != null) || (this.portalPagePortletPK != null && !this.portalPagePortletPK.equals(other.portalPagePortletPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortalPagePortlet[ portalPagePortletPK=" + portalPagePortletPK + " ]";
    }
    
}
