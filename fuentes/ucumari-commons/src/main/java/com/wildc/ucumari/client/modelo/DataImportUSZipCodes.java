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
@Table(name = "data_import_u_s_zip_codes")
@NamedQueries({
    @NamedQuery(name = "DataImportUSZipCodes.findAll", query = "SELECT d FROM DataImportUSZipCodes d")})
public class DataImportUSZipCodes implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImportUSZipCodesPK dataImportUSZipCodesPK;
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

    public DataImportUSZipCodes() {
    }

    public DataImportUSZipCodes(DataImportUSZipCodesPK dataImportUSZipCodesPK) {
        this.dataImportUSZipCodesPK = dataImportUSZipCodesPK;
    }

    public DataImportUSZipCodes(String zipCode, String county, String stateCode) {
        this.dataImportUSZipCodesPK = new DataImportUSZipCodesPK(zipCode, county, stateCode);
    }

    public DataImportUSZipCodesPK getDataImportUSZipCodesPK() {
        return dataImportUSZipCodesPK;
    }

    public void setDataImportUSZipCodesPK(DataImportUSZipCodesPK dataImportUSZipCodesPK) {
        this.dataImportUSZipCodesPK = dataImportUSZipCodesPK;
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
        hash += (dataImportUSZipCodesPK != null ? dataImportUSZipCodesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportUSZipCodes)) {
            return false;
        }
        DataImportUSZipCodes other = (DataImportUSZipCodes) object;
        if ((this.dataImportUSZipCodesPK == null && other.dataImportUSZipCodesPK != null) || (this.dataImportUSZipCodesPK != null && !this.dataImportUSZipCodesPK.equals(other.dataImportUSZipCodesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportUSZipCodes[ dataImportUSZipCodesPK=" + dataImportUSZipCodesPK + " ]";
    }
    
}
