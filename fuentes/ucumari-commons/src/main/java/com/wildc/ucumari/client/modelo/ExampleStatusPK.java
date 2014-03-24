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
public class ExampleStatusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXAMPLE_ID")
    private String exampleId;
    @Basic(optional = false)
    @Column(name = "STATUS_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusDate;

    public ExampleStatusPK() {
    }

    public ExampleStatusPK(String exampleId, Date statusDate) {
        this.exampleId = exampleId;
        this.statusDate = statusDate;
    }

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public Date getStatusDate() {
        return statusDate;
    }

    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleId != null ? exampleId.hashCode() : 0);
        hash += (statusDate != null ? statusDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleStatusPK)) {
            return false;
        }
        ExampleStatusPK other = (ExampleStatusPK) object;
        if ((this.exampleId == null && other.exampleId != null) || (this.exampleId != null && !this.exampleId.equals(other.exampleId))) {
            return false;
        }
        if ((this.statusDate == null && other.statusDate != null) || (this.statusDate != null && !this.statusDate.equals(other.statusDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleStatusPK[ exampleId=" + exampleId + ", statusDate=" + statusDate + " ]";
    }
    
}
