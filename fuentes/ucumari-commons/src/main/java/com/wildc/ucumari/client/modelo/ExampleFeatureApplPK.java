/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ExampleFeatureApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXAMPLE_ID")
    private String exampleId;
    @Basic(optional = false)
    @Column(name = "EXAMPLE_FEATURE_ID")
    private String exampleFeatureId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ExampleFeatureApplPK() {
    }

    public ExampleFeatureApplPK(String exampleId, String exampleFeatureId, Date fromDate) {
        this.exampleId = exampleId;
        this.exampleFeatureId = exampleFeatureId;
        this.fromDate = fromDate;
    }

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getExampleFeatureId() {
        return exampleFeatureId;
    }

    public void setExampleFeatureId(String exampleFeatureId) {
        this.exampleFeatureId = exampleFeatureId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleId != null ? exampleId.hashCode() : 0);
        hash += (exampleFeatureId != null ? exampleFeatureId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleFeatureApplPK)) {
            return false;
        }
        ExampleFeatureApplPK other = (ExampleFeatureApplPK) object;
        if ((this.exampleId == null && other.exampleId != null) || (this.exampleId != null && !this.exampleId.equals(other.exampleId))) {
            return false;
        }
        if ((this.exampleFeatureId == null && other.exampleFeatureId != null) || (this.exampleFeatureId != null && !this.exampleFeatureId.equals(other.exampleFeatureId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleFeatureApplPK[ exampleId=" + exampleId + ", exampleFeatureId=" + exampleFeatureId + ", fromDate=" + fromDate + " ]";
    }
    
}
