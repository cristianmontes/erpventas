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
@Table(name = "employment_app_source_type")
@NamedQueries({
    @NamedQuery(name = "EmploymentAppSourceType.findAll", query = "SELECT e FROM EmploymentAppSourceType e")})
public class EmploymentAppSourceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPLOYMENT_APP_SOURCE_TYPE_ID")
    private String employmentAppSourceTypeId;
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
    private List<EmploymentAppSourceType> employmentAppSourceTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "EMPLOYMENT_APP_SOURCE_TYPE_ID")
    @ManyToOne
    private EmploymentAppSourceType parentTypeId;

    public EmploymentAppSourceType() {
    }

    public EmploymentAppSourceType(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
    }

    public String getEmploymentAppSourceTypeId() {
        return employmentAppSourceTypeId;
    }

    public void setEmploymentAppSourceTypeId(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
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

    public List<EmploymentAppSourceType> getEmploymentAppSourceTypeList() {
        return employmentAppSourceTypeList;
    }

    public void setEmploymentAppSourceTypeList(List<EmploymentAppSourceType> employmentAppSourceTypeList) {
        this.employmentAppSourceTypeList = employmentAppSourceTypeList;
    }

    public EmploymentAppSourceType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(EmploymentAppSourceType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employmentAppSourceTypeId != null ? employmentAppSourceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmploymentAppSourceType)) {
            return false;
        }
        EmploymentAppSourceType other = (EmploymentAppSourceType) object;
        if ((this.employmentAppSourceTypeId == null && other.employmentAppSourceTypeId != null) || (this.employmentAppSourceTypeId != null && !this.employmentAppSourceTypeId.equals(other.employmentAppSourceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmploymentAppSourceType[ employmentAppSourceTypeId=" + employmentAppSourceTypeId + " ]";
    }
    
}
