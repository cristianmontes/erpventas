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
@Table(name = "data_category")
@NamedQueries({
    @NamedQuery(name = "DataCategory.findAll", query = "SELECT d FROM DataCategory d")})
public class DataCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_CATEGORY_ID")
    private String dataCategoryId;
    @Column(name = "CATEGORY_NAME")
    private String categoryName;
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
    @OneToMany(mappedBy = "dataCategoryId")
    private List<DataResource> dataResourceList;
    @OneToMany(mappedBy = "parentCategoryId")
    private List<DataCategory> dataCategoryList;
    @JoinColumn(name = "PARENT_CATEGORY_ID", referencedColumnName = "DATA_CATEGORY_ID")
    @ManyToOne
    private DataCategory parentCategoryId;

    public DataCategory() {
    }

    public DataCategory(String dataCategoryId) {
        this.dataCategoryId = dataCategoryId;
    }

    public String getDataCategoryId() {
        return dataCategoryId;
    }

    public void setDataCategoryId(String dataCategoryId) {
        this.dataCategoryId = dataCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public List<DataCategory> getDataCategoryList() {
        return dataCategoryList;
    }

    public void setDataCategoryList(List<DataCategory> dataCategoryList) {
        this.dataCategoryList = dataCategoryList;
    }

    public DataCategory getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(DataCategory parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataCategoryId != null ? dataCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataCategory)) {
            return false;
        }
        DataCategory other = (DataCategory) object;
        if ((this.dataCategoryId == null && other.dataCategoryId != null) || (this.dataCategoryId != null && !this.dataCategoryId.equals(other.dataCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataCategory[ dataCategoryId=" + dataCategoryId + " ]";
    }
    
}
