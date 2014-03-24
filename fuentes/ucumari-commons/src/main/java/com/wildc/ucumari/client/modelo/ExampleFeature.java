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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "example_feature")
@NamedQueries({
    @NamedQuery(name = "ExampleFeature.findAll", query = "SELECT e FROM ExampleFeature e")})
public class ExampleFeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXAMPLE_FEATURE_ID")
    private String exampleFeatureId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exampleFeature")
    private List<ExampleFeatureAppl> exampleFeatureApplList;
    @JoinColumn(name = "FEATURE_SOURCE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration featureSourceEnumId;

    public ExampleFeature() {
    }

    public ExampleFeature(String exampleFeatureId) {
        this.exampleFeatureId = exampleFeatureId;
    }

    public String getExampleFeatureId() {
        return exampleFeatureId;
    }

    public void setExampleFeatureId(String exampleFeatureId) {
        this.exampleFeatureId = exampleFeatureId;
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

    public Enumeration getFeatureSourceEnumId() {
        return featureSourceEnumId;
    }

    public void setFeatureSourceEnumId(Enumeration featureSourceEnumId) {
        this.featureSourceEnumId = featureSourceEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleFeatureId != null ? exampleFeatureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleFeature)) {
            return false;
        }
        ExampleFeature other = (ExampleFeature) object;
        if ((this.exampleFeatureId == null && other.exampleFeatureId != null) || (this.exampleFeatureId != null && !this.exampleFeatureId.equals(other.exampleFeatureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleFeature[ exampleFeatureId=" + exampleFeatureId + " ]";
    }
    
}
