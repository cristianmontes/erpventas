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
@Table(name = "portal_page_column")
@NamedQueries({
    @NamedQuery(name = "PortalPageColumn.findAll", query = "SELECT p FROM PortalPageColumn p")})
public class PortalPageColumn implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PortalPageColumnPK portalPageColumnPK;
    @Column(name = "COLUMN_WIDTH_PIXELS")
    private BigInteger columnWidthPixels;
    @Column(name = "COLUMN_WIDTH_PERCENTAGE")
    private BigInteger columnWidthPercentage;
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
    @JoinColumn(name = "PORTAL_PAGE_ID", referencedColumnName = "PORTAL_PAGE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PortalPage portalPage;

    public PortalPageColumn() {
    }

    public PortalPageColumn(PortalPageColumnPK portalPageColumnPK) {
        this.portalPageColumnPK = portalPageColumnPK;
    }

    public PortalPageColumn(String portalPageId, String columnSeqId) {
        this.portalPageColumnPK = new PortalPageColumnPK(portalPageId, columnSeqId);
    }

    public PortalPageColumnPK getPortalPageColumnPK() {
        return portalPageColumnPK;
    }

    public void setPortalPageColumnPK(PortalPageColumnPK portalPageColumnPK) {
        this.portalPageColumnPK = portalPageColumnPK;
    }

    public BigInteger getColumnWidthPixels() {
        return columnWidthPixels;
    }

    public void setColumnWidthPixels(BigInteger columnWidthPixels) {
        this.columnWidthPixels = columnWidthPixels;
    }

    public BigInteger getColumnWidthPercentage() {
        return columnWidthPercentage;
    }

    public void setColumnWidthPercentage(BigInteger columnWidthPercentage) {
        this.columnWidthPercentage = columnWidthPercentage;
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

    public PortalPage getPortalPage() {
        return portalPage;
    }

    public void setPortalPage(PortalPage portalPage) {
        this.portalPage = portalPage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPageColumnPK != null ? portalPageColumnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortalPageColumn)) {
            return false;
        }
        PortalPageColumn other = (PortalPageColumn) object;
        if ((this.portalPageColumnPK == null && other.portalPageColumnPK != null) || (this.portalPageColumnPK != null && !this.portalPageColumnPK.equals(other.portalPageColumnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortalPageColumn[ portalPageColumnPK=" + portalPageColumnPK + " ]";
    }
    
}
