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
public class FixedAssetMaintPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FIXED_ASSET_ID")
    private String fixedAssetId;
    @Basic(optional = false)
    @Column(name = "MAINT_HIST_SEQ_ID")
    private String maintHistSeqId;

    public FixedAssetMaintPK() {
    }

    public FixedAssetMaintPK(String fixedAssetId, String maintHistSeqId) {
        this.fixedAssetId = fixedAssetId;
        this.maintHistSeqId = maintHistSeqId;
    }

    public String getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(String fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public String getMaintHistSeqId() {
        return maintHistSeqId;
    }

    public void setMaintHistSeqId(String maintHistSeqId) {
        this.maintHistSeqId = maintHistSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fixedAssetId != null ? fixedAssetId.hashCode() : 0);
        hash += (maintHistSeqId != null ? maintHistSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FixedAssetMaintPK)) {
            return false;
        }
        FixedAssetMaintPK other = (FixedAssetMaintPK) object;
        if ((this.fixedAssetId == null && other.fixedAssetId != null) || (this.fixedAssetId != null && !this.fixedAssetId.equals(other.fixedAssetId))) {
            return false;
        }
        if ((this.maintHistSeqId == null && other.maintHistSeqId != null) || (this.maintHistSeqId != null && !this.maintHistSeqId.equals(other.maintHistSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FixedAssetMaintPK[ fixedAssetId=" + fixedAssetId + ", maintHistSeqId=" + maintHistSeqId + " ]";
    }
    
}
