/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "example_status")
@NamedQueries({
    @NamedQuery(name = "ExampleStatus.findAll", query = "SELECT e FROM ExampleStatus e")})
public class ExampleStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExampleStatusPK exampleStatusPK;
    @Column(name = "STATUS_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusEndDate;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "EXAMPLE_ID", referencedColumnName = "EXAMPLE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Example example;

    public ExampleStatus() {
    }

    public ExampleStatus(ExampleStatusPK exampleStatusPK) {
        this.exampleStatusPK = exampleStatusPK;
    }

    public ExampleStatus(String exampleId, Date statusDate) {
        this.exampleStatusPK = new ExampleStatusPK(exampleId, statusDate);
    }

    public ExampleStatusPK getExampleStatusPK() {
        return exampleStatusPK;
    }

    public void setExampleStatusPK(ExampleStatusPK exampleStatusPK) {
        this.exampleStatusPK = exampleStatusPK;
    }

    public Date getStatusEndDate() {
        return statusEndDate;
    }

    public void setStatusEndDate(Date statusEndDate) {
        this.statusEndDate = statusEndDate;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Example getExample() {
        return example;
    }

    public void setExample(Example example) {
        this.example = example;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleStatusPK != null ? exampleStatusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleStatus)) {
            return false;
        }
        ExampleStatus other = (ExampleStatus) object;
        if ((this.exampleStatusPK == null && other.exampleStatusPK != null) || (this.exampleStatusPK != null && !this.exampleStatusPK.equals(other.exampleStatusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleStatus[ exampleStatusPK=" + exampleStatusPK + " ]";
    }
    
}
