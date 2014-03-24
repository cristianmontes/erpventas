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
public class EncumbranceDetailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENCUMBRANCE_SNAPSHOT_ID")
    private String encumbranceSnapshotId;
    @Basic(optional = false)
    @Column(name = "ENCUMBRANCE_DETAIL_SEQ_ID")
    private String encumbranceDetailSeqId;

    public EncumbranceDetailPK() {
    }

    public EncumbranceDetailPK(String encumbranceSnapshotId, String encumbranceDetailSeqId) {
        this.encumbranceSnapshotId = encumbranceSnapshotId;
        this.encumbranceDetailSeqId = encumbranceDetailSeqId;
    }

    public String getEncumbranceSnapshotId() {
        return encumbranceSnapshotId;
    }

    public void setEncumbranceSnapshotId(String encumbranceSnapshotId) {
        this.encumbranceSnapshotId = encumbranceSnapshotId;
    }

    public String getEncumbranceDetailSeqId() {
        return encumbranceDetailSeqId;
    }

    public void setEncumbranceDetailSeqId(String encumbranceDetailSeqId) {
        this.encumbranceDetailSeqId = encumbranceDetailSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encumbranceSnapshotId != null ? encumbranceSnapshotId.hashCode() : 0);
        hash += (encumbranceDetailSeqId != null ? encumbranceDetailSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncumbranceDetailPK)) {
            return false;
        }
        EncumbranceDetailPK other = (EncumbranceDetailPK) object;
        if ((this.encumbranceSnapshotId == null && other.encumbranceSnapshotId != null) || (this.encumbranceSnapshotId != null && !this.encumbranceSnapshotId.equals(other.encumbranceSnapshotId))) {
            return false;
        }
        if ((this.encumbranceDetailSeqId == null && other.encumbranceDetailSeqId != null) || (this.encumbranceDetailSeqId != null && !this.encumbranceDetailSeqId.equals(other.encumbranceDetailSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EncumbranceDetailPK[ encumbranceSnapshotId=" + encumbranceSnapshotId + ", encumbranceDetailSeqId=" + encumbranceDetailSeqId + " ]";
    }
    
}
