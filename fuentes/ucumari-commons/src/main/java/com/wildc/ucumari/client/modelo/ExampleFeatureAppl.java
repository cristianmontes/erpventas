/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "example_feature_appl")
@NamedQueries({
    @NamedQuery(name = "ExampleFeatureAppl.findAll", query = "SELECT e FROM ExampleFeatureAppl e")})
public class ExampleFeatureAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExampleFeatureApplPK exampleFeatureApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "EXAMPLE_FEATURE_APPL_TYPE_ID", referencedColumnName = "EXAMPLE_FEATURE_APPL_TYPE_ID")
    @ManyToOne
    private ExampleFeatureApplType exampleFeatureApplTypeId;
    @JoinColumn(name = "EXAMPLE_ID", referencedColumnName = "EXAMPLE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Example example;
    @JoinColumn(name = "EXAMPLE_FEATURE_ID", referencedColumnName = "EXAMPLE_FEATURE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ExampleFeature exampleFeature;

    public ExampleFeatureAppl() {
    }

    public ExampleFeatureAppl(ExampleFeatureApplPK exampleFeatureApplPK) {
        this.exampleFeatureApplPK = exampleFeatureApplPK;
    }

    public ExampleFeatureAppl(String exampleId, String exampleFeatureId, Date fromDate) {
        this.exampleFeatureApplPK = new ExampleFeatureApplPK(exampleId, exampleFeatureId, fromDate);
    }

    public ExampleFeatureApplPK getExampleFeatureApplPK() {
        return exampleFeatureApplPK;
    }

    public void setExampleFeatureApplPK(ExampleFeatureApplPK exampleFeatureApplPK) {
        this.exampleFeatureApplPK = exampleFeatureApplPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public ExampleFeatureApplType getExampleFeatureApplTypeId() {
        return exampleFeatureApplTypeId;
    }

    public void setExampleFeatureApplTypeId(ExampleFeatureApplType exampleFeatureApplTypeId) {
        this.exampleFeatureApplTypeId = exampleFeatureApplTypeId;
    }

    public Example getExample() {
        return example;
    }

    public void setExample(Example example) {
        this.example = example;
    }

    public ExampleFeature getExampleFeature() {
        return exampleFeature;
    }

    public void setExampleFeature(ExampleFeature exampleFeature) {
        this.exampleFeature = exampleFeature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleFeatureApplPK != null ? exampleFeatureApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleFeatureAppl)) {
            return false;
        }
        ExampleFeatureAppl other = (ExampleFeatureAppl) object;
        if ((this.exampleFeatureApplPK == null && other.exampleFeatureApplPK != null) || (this.exampleFeatureApplPK != null && !this.exampleFeatureApplPK.equals(other.exampleFeatureApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleFeatureAppl[ exampleFeatureApplPK=" + exampleFeatureApplPK + " ]";
    }
    
}
