/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_imp_comm_rates")
@NamedQueries({
    @NamedQuery(name = "DataImpCommRates.findAll", query = "SELECT d FROM DataImpCommRates d")})
public class DataImpCommRates implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMMISSION_RATE")
    private BigDecimal commissionRate;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
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
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private DataImportCustomer dataImportCustomer;

    public DataImpCommRates() {
    }

    public DataImpCommRates(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    public String getImportStatusId() {
        return importStatusId;
    }

    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
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

    public DataImportCustomer getDataImportCustomer() {
        return dataImportCustomer;
    }

    public void setDataImportCustomer(DataImportCustomer dataImportCustomer) {
        this.dataImportCustomer = dataImportCustomer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImpCommRates)) {
            return false;
        }
        DataImpCommRates other = (DataImpCommRates) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImpCommRates[ customerId=" + customerId + " ]";
    }
    
}
