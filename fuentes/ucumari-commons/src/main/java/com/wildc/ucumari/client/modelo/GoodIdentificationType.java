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
@Table(name = "good_identification_type")
@NamedQueries({
    @NamedQuery(name = "GoodIdentificationType.findAll", query = "SELECT g FROM GoodIdentificationType g")})
public class GoodIdentificationType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GOOD_IDENTIFICATION_TYPE_ID")
    private String goodIdentificationTypeId;
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
    private List<GoodIdentificationType> goodIdentificationTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "GOOD_IDENTIFICATION_TYPE_ID")
    @ManyToOne
    private GoodIdentificationType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "goodIdentificationType")
    private List<GoodIdentification> goodIdentificationList;

    public GoodIdentificationType() {
    }

    public GoodIdentificationType(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
    }

    public String getGoodIdentificationTypeId() {
        return goodIdentificationTypeId;
    }

    public void setGoodIdentificationTypeId(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
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

    public List<GoodIdentificationType> getGoodIdentificationTypeList() {
        return goodIdentificationTypeList;
    }

    public void setGoodIdentificationTypeList(List<GoodIdentificationType> goodIdentificationTypeList) {
        this.goodIdentificationTypeList = goodIdentificationTypeList;
    }

    public GoodIdentificationType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(GoodIdentificationType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<GoodIdentification> getGoodIdentificationList() {
        return goodIdentificationList;
    }

    public void setGoodIdentificationList(List<GoodIdentification> goodIdentificationList) {
        this.goodIdentificationList = goodIdentificationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goodIdentificationTypeId != null ? goodIdentificationTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GoodIdentificationType)) {
            return false;
        }
        GoodIdentificationType other = (GoodIdentificationType) object;
        if ((this.goodIdentificationTypeId == null && other.goodIdentificationTypeId != null) || (this.goodIdentificationTypeId != null && !this.goodIdentificationTypeId.equals(other.goodIdentificationTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GoodIdentificationType[ goodIdentificationTypeId=" + goodIdentificationTypeId + " ]";
    }
    
}
