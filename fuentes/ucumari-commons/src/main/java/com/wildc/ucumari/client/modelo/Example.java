/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "example")
@NamedQueries({
    @NamedQuery(name = "Example.findAll", query = "SELECT e FROM Example e")})
public class Example implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXAMPLE_ID")
    private String exampleId;
    @Column(name = "EXAMPLE_NAME")
    private String exampleName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "LONG_DESCRIPTION")
    private String longDescription;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "EXAMPLE_SIZE")
    private BigInteger exampleSize;
    @Column(name = "EXAMPLE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date exampleDate;
    @Column(name = "ANOTHER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anotherDate;
    @Column(name = "ANOTHER_TEXT")
    private String anotherText;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "example")
    private List<ExampleFeatureAppl> exampleFeatureApplList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "example")
    private List<ExampleItem> exampleItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "example")
    private List<ExampleStatus> exampleStatusList;
    @JoinColumn(name = "EXAMPLE_TYPE_ID", referencedColumnName = "EXAMPLE_TYPE_ID")
    @ManyToOne
    private ExampleType exampleTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;

    public Example() {
    }

    public Example(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigInteger getExampleSize() {
        return exampleSize;
    }

    public void setExampleSize(BigInteger exampleSize) {
        this.exampleSize = exampleSize;
    }

    public Date getExampleDate() {
        return exampleDate;
    }

    public void setExampleDate(Date exampleDate) {
        this.exampleDate = exampleDate;
    }

    public Date getAnotherDate() {
        return anotherDate;
    }

    public void setAnotherDate(Date anotherDate) {
        this.anotherDate = anotherDate;
    }

    public String getAnotherText() {
        return anotherText;
    }

    public void setAnotherText(String anotherText) {
        this.anotherText = anotherText;
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

    public List<ExampleItem> getExampleItemList() {
        return exampleItemList;
    }

    public void setExampleItemList(List<ExampleItem> exampleItemList) {
        this.exampleItemList = exampleItemList;
    }

    public List<ExampleStatus> getExampleStatusList() {
        return exampleStatusList;
    }

    public void setExampleStatusList(List<ExampleStatus> exampleStatusList) {
        this.exampleStatusList = exampleStatusList;
    }

    public ExampleType getExampleTypeId() {
        return exampleTypeId;
    }

    public void setExampleTypeId(ExampleType exampleTypeId) {
        this.exampleTypeId = exampleTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleId != null ? exampleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Example)) {
            return false;
        }
        Example other = (Example) object;
        if ((this.exampleId == null && other.exampleId != null) || (this.exampleId != null && !this.exampleId.equals(other.exampleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Example[ exampleId=" + exampleId + " ]";
    }
    
}
