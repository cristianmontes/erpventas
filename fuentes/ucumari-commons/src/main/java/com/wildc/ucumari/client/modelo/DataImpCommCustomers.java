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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_imp_comm_customers")
@NamedQueries({
    @NamedQuery(name = "DataImpCommCustomers.findAll", query = "SELECT d FROM DataImpCommCustomers d")})
public class DataImpCommCustomers implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImpCommCustomersPK dataImpCommCustomersPK;
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
    @JoinColumn(name = "TO_CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataImportCustomer dataImportCustomer;
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "CUSTOMER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataImportCustomer dataImportCustomer1;

    public DataImpCommCustomers() {
    }

    public DataImpCommCustomers(DataImpCommCustomersPK dataImpCommCustomersPK) {
        this.dataImpCommCustomersPK = dataImpCommCustomersPK;
    }

    public DataImpCommCustomers(String customerId, String toCustomerId) {
        this.dataImpCommCustomersPK = new DataImpCommCustomersPK(customerId, toCustomerId);
    }

    public DataImpCommCustomersPK getDataImpCommCustomersPK() {
        return dataImpCommCustomersPK;
    }

    public void setDataImpCommCustomersPK(DataImpCommCustomersPK dataImpCommCustomersPK) {
        this.dataImpCommCustomersPK = dataImpCommCustomersPK;
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

    public DataImportCustomer getDataImportCustomer1() {
        return dataImportCustomer1;
    }

    public void setDataImportCustomer1(DataImportCustomer dataImportCustomer1) {
        this.dataImportCustomer1 = dataImportCustomer1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataImpCommCustomersPK != null ? dataImpCommCustomersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImpCommCustomers)) {
            return false;
        }
        DataImpCommCustomers other = (DataImpCommCustomers) object;
        if ((this.dataImpCommCustomersPK == null && other.dataImpCommCustomersPK != null) || (this.dataImpCommCustomersPK != null && !this.dataImpCommCustomersPK.equals(other.dataImpCommCustomersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImpCommCustomers[ dataImpCommCustomersPK=" + dataImpCommCustomersPK + " ]";
    }

}
