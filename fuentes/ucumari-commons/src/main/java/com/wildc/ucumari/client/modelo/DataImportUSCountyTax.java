/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
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
@Table(name = "data_import_u_s_county_tax")
@NamedQueries({
    @NamedQuery(name = "DataImportUSCountyTax.findAll", query = "SELECT d FROM DataImportUSCountyTax d")})
public class DataImportUSCountyTax implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImportUSCountyTaxPK dataImportUSCountyTaxPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAX_RATE")
    private BigDecimal taxRate;
    @Column(name = "INHERIT_EXEMPTIONS")
    private Character inheritExemptions;
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

    public DataImportUSCountyTax() {
    }

    public DataImportUSCountyTax(DataImportUSCountyTaxPK dataImportUSCountyTaxPK) {
        this.dataImportUSCountyTaxPK = dataImportUSCountyTaxPK;
    }

    public DataImportUSCountyTax(String county, String stateCode) {
        this.dataImportUSCountyTaxPK = new DataImportUSCountyTaxPK(county, stateCode);
    }

    public DataImportUSCountyTaxPK getDataImportUSCountyTaxPK() {
        return dataImportUSCountyTaxPK;
    }

    public void setDataImportUSCountyTaxPK(DataImportUSCountyTaxPK dataImportUSCountyTaxPK) {
        this.dataImportUSCountyTaxPK = dataImportUSCountyTaxPK;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public Character getInheritExemptions() {
        return inheritExemptions;
    }

    public void setInheritExemptions(Character inheritExemptions) {
        this.inheritExemptions = inheritExemptions;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataImportUSCountyTaxPK != null ? dataImportUSCountyTaxPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportUSCountyTax)) {
            return false;
        }
        DataImportUSCountyTax other = (DataImportUSCountyTax) object;
        if ((this.dataImportUSCountyTaxPK == null && other.dataImportUSCountyTaxPK != null) || (this.dataImportUSCountyTaxPK != null && !this.dataImportUSCountyTaxPK.equals(other.dataImportUSCountyTaxPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportUSCountyTax[ dataImportUSCountyTaxPK=" + dataImportUSCountyTaxPK + " ]";
    }
    
}
