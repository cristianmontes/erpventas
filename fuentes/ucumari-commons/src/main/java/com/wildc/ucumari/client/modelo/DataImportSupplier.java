/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "data_import_supplier")
@NamedQueries({
    @NamedQuery(name = "DataImportSupplier.findAll", query = "SELECT d FROM DataImportSupplier d")})
public class DataImportSupplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUPPLIER_ID")
    private String supplierId;
    @Column(name = "SUPPLIER_NAME")
    private String supplierName;
    @Column(name = "ATTN_NAME")
    private String attnName;
    @Column(name = "ADDRESS1")
    private String address1;
    @Column(name = "ADDRESS2")
    private String address2;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE_PROVINCE_GEO_ID")
    private String stateProvinceGeoId;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "POSTAL_CODE_EXT")
    private String postalCodeExt;
    @Column(name = "STATE_PROVINCE_GEO_NAME")
    private String stateProvinceGeoName;
    @Column(name = "COUNTRY_GEO_ID")
    private String countryGeoId;
    @Column(name = "PRIMARY_PHONE_COUNTRY_CODE")
    private String primaryPhoneCountryCode;
    @Column(name = "PRIMARY_PHONE_AREA_CODE")
    private String primaryPhoneAreaCode;
    @Column(name = "PRIMARY_PHONE_NUMBER")
    private String primaryPhoneNumber;
    @Column(name = "PRIMARY_PHONE_EXTENSION")
    private String primaryPhoneExtension;
    @Column(name = "SECONDARY_PHONE_COUNTRY_CODE")
    private String secondaryPhoneCountryCode;
    @Column(name = "SECONDARY_PHONE_AREA_CODE")
    private String secondaryPhoneAreaCode;
    @Column(name = "SECONDARY_PHONE_NUMBER")
    private String secondaryPhoneNumber;
    @Column(name = "SECONDARY_PHONE_EXTENSION")
    private String secondaryPhoneExtension;
    @Column(name = "FAX_COUNTRY_CODE")
    private String faxCountryCode;
    @Column(name = "FAX_AREA_CODE")
    private String faxAreaCode;
    @Column(name = "FAX_NUMBER")
    private String faxNumber;
    @Column(name = "DID_COUNTRY_CODE")
    private String didCountryCode;
    @Column(name = "DID_AREA_CODE")
    private String didAreaCode;
    @Column(name = "DID_NUMBER")
    private String didNumber;
    @Column(name = "DID_EXTENSION")
    private String didExtension;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "WEB_ADDRESS")
    private String webAddress;
    @Lob
    @Column(name = "NOTE")
    private String note;
    @Column(name = "NET_PAYMENT_DAYS")
    private BigInteger netPaymentDays;
    @Column(name = "IS_INCORPORATED")
    private Character isIncorporated;
    @Column(name = "FEDERAL_TAX_ID")
    private String federalTaxId;
    @Column(name = "REQUIRES1099")
    private Character requires1099;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
    @Column(name = "PRIMARY_PARTY_ID")
    private String primaryPartyId;
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

    public DataImportSupplier() {
    }

    public DataImportSupplier(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAttnName() {
        return attnName;
    }

    public void setAttnName(String attnName) {
        this.attnName = attnName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateProvinceGeoId() {
        return stateProvinceGeoId;
    }

    public void setStateProvinceGeoId(String stateProvinceGeoId) {
        this.stateProvinceGeoId = stateProvinceGeoId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalCodeExt() {
        return postalCodeExt;
    }

    public void setPostalCodeExt(String postalCodeExt) {
        this.postalCodeExt = postalCodeExt;
    }

    public String getStateProvinceGeoName() {
        return stateProvinceGeoName;
    }

    public void setStateProvinceGeoName(String stateProvinceGeoName) {
        this.stateProvinceGeoName = stateProvinceGeoName;
    }

    public String getCountryGeoId() {
        return countryGeoId;
    }

    public void setCountryGeoId(String countryGeoId) {
        this.countryGeoId = countryGeoId;
    }

    public String getPrimaryPhoneCountryCode() {
        return primaryPhoneCountryCode;
    }

    public void setPrimaryPhoneCountryCode(String primaryPhoneCountryCode) {
        this.primaryPhoneCountryCode = primaryPhoneCountryCode;
    }

    public String getPrimaryPhoneAreaCode() {
        return primaryPhoneAreaCode;
    }

    public void setPrimaryPhoneAreaCode(String primaryPhoneAreaCode) {
        this.primaryPhoneAreaCode = primaryPhoneAreaCode;
    }

    public String getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    public void setPrimaryPhoneNumber(String primaryPhoneNumber) {
        this.primaryPhoneNumber = primaryPhoneNumber;
    }

    public String getPrimaryPhoneExtension() {
        return primaryPhoneExtension;
    }

    public void setPrimaryPhoneExtension(String primaryPhoneExtension) {
        this.primaryPhoneExtension = primaryPhoneExtension;
    }

    public String getSecondaryPhoneCountryCode() {
        return secondaryPhoneCountryCode;
    }

    public void setSecondaryPhoneCountryCode(String secondaryPhoneCountryCode) {
        this.secondaryPhoneCountryCode = secondaryPhoneCountryCode;
    }

    public String getSecondaryPhoneAreaCode() {
        return secondaryPhoneAreaCode;
    }

    public void setSecondaryPhoneAreaCode(String secondaryPhoneAreaCode) {
        this.secondaryPhoneAreaCode = secondaryPhoneAreaCode;
    }

    public String getSecondaryPhoneNumber() {
        return secondaryPhoneNumber;
    }

    public void setSecondaryPhoneNumber(String secondaryPhoneNumber) {
        this.secondaryPhoneNumber = secondaryPhoneNumber;
    }

    public String getSecondaryPhoneExtension() {
        return secondaryPhoneExtension;
    }

    public void setSecondaryPhoneExtension(String secondaryPhoneExtension) {
        this.secondaryPhoneExtension = secondaryPhoneExtension;
    }

    public String getFaxCountryCode() {
        return faxCountryCode;
    }

    public void setFaxCountryCode(String faxCountryCode) {
        this.faxCountryCode = faxCountryCode;
    }

    public String getFaxAreaCode() {
        return faxAreaCode;
    }

    public void setFaxAreaCode(String faxAreaCode) {
        this.faxAreaCode = faxAreaCode;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getDidCountryCode() {
        return didCountryCode;
    }

    public void setDidCountryCode(String didCountryCode) {
        this.didCountryCode = didCountryCode;
    }

    public String getDidAreaCode() {
        return didAreaCode;
    }

    public void setDidAreaCode(String didAreaCode) {
        this.didAreaCode = didAreaCode;
    }

    public String getDidNumber() {
        return didNumber;
    }

    public void setDidNumber(String didNumber) {
        this.didNumber = didNumber;
    }

    public String getDidExtension() {
        return didExtension;
    }

    public void setDidExtension(String didExtension) {
        this.didExtension = didExtension;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getWebAddress() {
        return webAddress;
    }

    public void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigInteger getNetPaymentDays() {
        return netPaymentDays;
    }

    public void setNetPaymentDays(BigInteger netPaymentDays) {
        this.netPaymentDays = netPaymentDays;
    }

    public Character getIsIncorporated() {
        return isIncorporated;
    }

    public void setIsIncorporated(Character isIncorporated) {
        this.isIncorporated = isIncorporated;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        this.federalTaxId = federalTaxId;
    }

    public Character getRequires1099() {
        return requires1099;
    }

    public void setRequires1099(Character requires1099) {
        this.requires1099 = requires1099;
    }

    public String getImportStatusId() {
        return importStatusId;
    }

    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
    }

    public String getPrimaryPartyId() {
        return primaryPartyId;
    }

    public void setPrimaryPartyId(String primaryPartyId) {
        this.primaryPartyId = primaryPartyId;
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
        hash += (supplierId != null ? supplierId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportSupplier)) {
            return false;
        }
        DataImportSupplier other = (DataImportSupplier) object;
        if ((this.supplierId == null && other.supplierId != null) || (this.supplierId != null && !this.supplierId.equals(other.supplierId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportSupplier[ supplierId=" + supplierId + " ]";
    }
    
}
