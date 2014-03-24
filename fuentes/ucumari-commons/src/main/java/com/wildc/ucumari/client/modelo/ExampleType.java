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
@Table(name = "example_type")
@NamedQueries({
    @NamedQuery(name = "ExampleType.findAll", query = "SELECT e FROM ExampleType e")})
public class ExampleType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXAMPLE_TYPE_ID")
    private String exampleTypeId;
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
    @OneToMany(mappedBy = "exampleTypeId")
    private List<Example> exampleList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ExampleType> exampleTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "EXAMPLE_TYPE_ID")
    @ManyToOne
    private ExampleType parentTypeId;

    public ExampleType() {
    }

    public ExampleType(String exampleTypeId) {
        this.exampleTypeId = exampleTypeId;
    }

    public String getExampleTypeId() {
        return exampleTypeId;
    }

    public void setExampleTypeId(String exampleTypeId) {
        this.exampleTypeId = exampleTypeId;
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

    public List<Example> getExampleList() {
        return exampleList;
    }

    public void setExampleList(List<Example> exampleList) {
        this.exampleList = exampleList;
    }

    public List<ExampleType> getExampleTypeList() {
        return exampleTypeList;
    }

    public void setExampleTypeList(List<ExampleType> exampleTypeList) {
        this.exampleTypeList = exampleTypeList;
    }

    public ExampleType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ExampleType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleTypeId != null ? exampleTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleType)) {
            return false;
        }
        ExampleType other = (ExampleType) object;
        if ((this.exampleTypeId == null && other.exampleTypeId != null) || (this.exampleTypeId != null && !this.exampleTypeId.equals(other.exampleTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleType[ exampleTypeId=" + exampleTypeId + " ]";
    }
    
}
