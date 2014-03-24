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
public class PortalPageColumnPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PORTAL_PAGE_ID")
    private String portalPageId;
    @Basic(optional = false)
    @Column(name = "COLUMN_SEQ_ID")
    private String columnSeqId;

    public PortalPageColumnPK() {
    }

    public PortalPageColumnPK(String portalPageId, String columnSeqId) {
        this.portalPageId = portalPageId;
        this.columnSeqId = columnSeqId;
    }

    public String getPortalPageId() {
        return portalPageId;
    }

    public void setPortalPageId(String portalPageId) {
        this.portalPageId = portalPageId;
    }

    public String getColumnSeqId() {
        return columnSeqId;
    }

    public void setColumnSeqId(String columnSeqId) {
        this.columnSeqId = columnSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (portalPageId != null ? portalPageId.hashCode() : 0);
        hash += (columnSeqId != null ? columnSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PortalPageColumnPK)) {
            return false;
        }
        PortalPageColumnPK other = (PortalPageColumnPK) object;
        if ((this.portalPageId == null && other.portalPageId != null) || (this.portalPageId != null && !this.portalPageId.equals(other.portalPageId))) {
            return false;
        }
        if ((this.columnSeqId == null && other.columnSeqId != null) || (this.columnSeqId != null && !this.columnSeqId.equals(other.columnSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PortalPageColumnPK[ portalPageId=" + portalPageId + ", columnSeqId=" + columnSeqId + " ]";
    }
    
}
