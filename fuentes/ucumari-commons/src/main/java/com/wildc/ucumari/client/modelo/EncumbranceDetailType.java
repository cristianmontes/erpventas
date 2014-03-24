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
@Table(name = "encumbrance_detail_type")
@NamedQueries({
    @NamedQuery(name = "EncumbranceDetailType.findAll", query = "SELECT e FROM EncumbranceDetailType e")})
public class EncumbranceDetailType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENCUMBRANCE_DETAIL_TYPE_ID")
    private String encumbranceDetailTypeId;
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
    @OneToMany(mappedBy = "encumbranceDetailTypeId")
    private List<EncumbranceDetail> encumbranceDetailList;

    public EncumbranceDetailType() {
    }

    public EncumbranceDetailType(String encumbranceDetailTypeId) {
        this.encumbranceDetailTypeId = encumbranceDetailTypeId;
    }

    public String getEncumbranceDetailTypeId() {
        return encumbranceDetailTypeId;
    }

    public void setEncumbranceDetailTypeId(String encumbranceDetailTypeId) {
        this.encumbranceDetailTypeId = encumbranceDetailTypeId;
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

    public List<EncumbranceDetail> getEncumbranceDetailList() {
        return encumbranceDetailList;
    }

    public void setEncumbranceDetailList(List<EncumbranceDetail> encumbranceDetailList) {
        this.encumbranceDetailList = encumbranceDetailList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encumbranceDetailTypeId != null ? encumbranceDetailTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncumbranceDetailType)) {
            return false;
        }
        EncumbranceDetailType other = (EncumbranceDetailType) object;
        if ((this.encumbranceDetailTypeId == null && other.encumbranceDetailTypeId != null) || (this.encumbranceDetailTypeId != null && !this.encumbranceDetailTypeId.equals(other.encumbranceDetailTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EncumbranceDetailType[ encumbranceDetailTypeId=" + encumbranceDetailTypeId + " ]";
    }
    
}
