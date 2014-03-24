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
@Table(name = "example_feature_appl_type")
@NamedQueries({
    @NamedQuery(name = "ExampleFeatureApplType.findAll", query = "SELECT e FROM ExampleFeatureApplType e")})
public class ExampleFeatureApplType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXAMPLE_FEATURE_APPL_TYPE_ID")
    private String exampleFeatureApplTypeId;
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
    @OneToMany(mappedBy = "exampleFeatureApplTypeId")
    private List<ExampleFeatureAppl> exampleFeatureApplList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ExampleFeatureApplType> exampleFeatureApplTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "EXAMPLE_FEATURE_APPL_TYPE_ID")
    @ManyToOne
    private ExampleFeatureApplType parentTypeId;

    public ExampleFeatureApplType() {
    }

    public ExampleFeatureApplType(String exampleFeatureApplTypeId) {
        this.exampleFeatureApplTypeId = exampleFeatureApplTypeId;
    }

    public String getExampleFeatureApplTypeId() {
        return exampleFeatureApplTypeId;
    }

    public void setExampleFeatureApplTypeId(String exampleFeatureApplTypeId) {
        this.exampleFeatureApplTypeId = exampleFeatureApplTypeId;
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

    public List<ExampleFeatureAppl> getExampleFeatureApplList() {
        return exampleFeatureApplList;
    }

    public void setExampleFeatureApplList(List<ExampleFeatureAppl> exampleFeatureApplList) {
        this.exampleFeatureApplList = exampleFeatureApplList;
    }

    public List<ExampleFeatureApplType> getExampleFeatureApplTypeList() {
        return exampleFeatureApplTypeList;
    }

    public void setExampleFeatureApplTypeList(List<ExampleFeatureApplType> exampleFeatureApplTypeList) {
        this.exampleFeatureApplTypeList = exampleFeatureApplTypeList;
    }

    public ExampleFeatureApplType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ExampleFeatureApplType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleFeatureApplTypeId != null ? exampleFeatureApplTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleFeatureApplType)) {
            return false;
        }
        ExampleFeatureApplType other = (ExampleFeatureApplType) object;
        if ((this.exampleFeatureApplTypeId == null && other.exampleFeatureApplTypeId != null) || (this.exampleFeatureApplTypeId != null && !this.exampleFeatureApplTypeId.equals(other.exampleFeatureApplTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleFeatureApplType[ exampleFeatureApplTypeId=" + exampleFeatureApplTypeId + " ]";
    }
    
}
