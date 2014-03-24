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
@Table(name = "encumbrance_snapshot")
@NamedQueries({
    @NamedQuery(name = "EncumbranceSnapshot.findAll", query = "SELECT e FROM EncumbranceSnapshot e")})
public class EncumbranceSnapshot implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENCUMBRANCE_SNAPSHOT_ID")
    private String encumbranceSnapshotId;
    @Column(name = "SNAPSHOT_DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date snapshotDatetime;
    @Column(name = "CREATED_BY_USER_LOGIN_ID")
    private String createdByUserLoginId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMENTS")
    private String comments;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "encumbranceSnapshot")
    private List<EncumbranceDetail> encumbranceDetailList;

    public EncumbranceSnapshot() {
    }

    public EncumbranceSnapshot(String encumbranceSnapshotId) {
        this.encumbranceSnapshotId = encumbranceSnapshotId;
    }

    public String getEncumbranceSnapshotId() {
        return encumbranceSnapshotId;
    }

    public void setEncumbranceSnapshotId(String encumbranceSnapshotId) {
        this.encumbranceSnapshotId = encumbranceSnapshotId;
    }

    public Date getSnapshotDatetime() {
        return snapshotDatetime;
    }

    public void setSnapshotDatetime(Date snapshotDatetime) {
        this.snapshotDatetime = snapshotDatetime;
    }

    public String getCreatedByUserLoginId() {
        return createdByUserLoginId;
    }

    public void setCreatedByUserLoginId(String createdByUserLoginId) {
        this.createdByUserLoginId = createdByUserLoginId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public List<EncumbranceDetail> getEncumbranceDetailList() {
        return encumbranceDetailList;
    }

    public void setEncumbranceDetailList(List<EncumbranceDetail> encumbranceDetailList) {
        this.encumbranceDetailList = encumbranceDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encumbranceSnapshotId != null ? encumbranceSnapshotId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncumbranceSnapshot)) {
            return false;
        }
        EncumbranceSnapshot other = (EncumbranceSnapshot) object;
        if ((this.encumbranceSnapshotId == null && other.encumbranceSnapshotId != null) || (this.encumbranceSnapshotId != null && !this.encumbranceSnapshotId.equals(other.encumbranceSnapshotId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EncumbranceSnapshot[ encumbranceSnapshotId=" + encumbranceSnapshotId + " ]";
    }
    
}
