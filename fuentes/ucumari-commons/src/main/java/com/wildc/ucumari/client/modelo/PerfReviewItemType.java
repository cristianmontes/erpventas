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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "perf_review_item_type")
@NamedQueries({
    @NamedQuery(name = "PerfReviewItemType.findAll", query = "SELECT p FROM PerfReviewItemType p")})
public class PerfReviewItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PERF_REVIEW_ITEM_TYPE_ID")
    private String perfReviewItemTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<PerfReviewItemType> perfReviewItemTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PERF_REVIEW_ITEM_TYPE_ID")
    @ManyToOne
    private PerfReviewItemType parentTypeId;

    public PerfReviewItemType() {
    }

    public PerfReviewItemType(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
    }

    public String getPerfReviewItemTypeId() {
        return perfReviewItemTypeId;
    }

    public void setPerfReviewItemTypeId(String perfReviewItemTypeId) {
        this.perfReviewItemTypeId = perfReviewItemTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<PerfReviewItemType> getPerfReviewItemTypeList() {
        return perfReviewItemTypeList;
    }

    public void setPerfReviewItemTypeList(List<PerfReviewItemType> perfReviewItemTypeList) {
        this.perfReviewItemTypeList = perfReviewItemTypeList;
    }

    public PerfReviewItemType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PerfReviewItemType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfReviewItemTypeId != null ? perfReviewItemTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerfReviewItemType)) {
            return false;
        }
        PerfReviewItemType other = (PerfReviewItemType) object;
        if ((this.perfReviewItemTypeId == null && other.perfReviewItemTypeId != null) || (this.perfReviewItemTypeId != null && !this.perfReviewItemTypeId.equals(other.perfReviewItemTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PerfReviewItemType[ perfReviewItemTypeId=" + perfReviewItemTypeId + " ]";
    }
    
}
