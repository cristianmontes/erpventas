/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_import_customer")
@NamedQueries({
    @NamedQuery(name = "DataImportCustomer.findAll", query = "SELECT d FROM DataImportCustomer d")})
public class DataImportCustomer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DISCOUNT")
    private BigDecimal discount;
    @Column(name = "PARTY_CLASSIFICATION_TYPE_ID")
    private String partyClassificationTypeId;
    @Column(name = "CREDIT_CARD_NUMBER")
    private String creditCardNumber;
    @Column(name = "CREDIT_CARD_EXP_DATE")
    private String creditCardExpDate;
    @Column(name = "OUTSTANDING_BALANCE")
    private BigDecimal outstandingBalance;
    @Column(name = "CREDIT_LIMIT")
    private BigDecimal creditLimit;
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Column(name = "DISABLE_SHIPPING")
    private Character disableShipping;
    @Column(name = "NET_PAYMENT_DAYS")
    private BigInteger netPaymentDays;
    @Column(name = "SHIP_TO_COMPANY_NAME")
    private String shipToCompanyName;
    @Column(name = "SHIP_TO_FIRST_NAME")
    private String shipToFirstName;
    @Column(name = "SHIP_TO_LAST_NAME")
    private String shipToLastName;
    @Column(name = "SHIP_TO_ATTN_NAME")
    private String shipToAttnName;
    @Column(name = "SHIP_TO_ADDRESS1")
    private String shipToAddress1;
    @Column(name = "SHIP_TO_ADDRESS2")
    private String shipToAddress2;
    @Column(name = "SHIP_TO_CITY")
    private String shipToCity;
    @Column(name = "SHIP_TO_STATE_PROVINCE_GEO_ID")
    private String shipToStateProvinceGeoId;
    @Column(name = "SHIP_TO_POSTAL_CODE")
    private String shipToPostalCode;
    @Column(name = "SHIP_TO_POSTAL_CODE_EXT")
    private String shipToPostalCodeExt;
    @Column(name = "SHIP_TO_STATE_PROV_GEO_NAME")
    private String shipToStateProvGeoName;
    @Column(name = "SHIP_TO_COUNTRY_GEO_ID")
    private String shipToCountryGeoId;
    @Lob
    @Column(name = "NOTE")
    private String note;
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
    @Column(name = "COMPANY_PARTY_ID")
    private String companyPartyId;
    @Column(name = "PERSON_PARTY_ID")
    private String personPartyId;
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
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataImportCustomer")
    private DataImpCommRates dataImpCommRates;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataImportCustomer")
    private List<DataImpCommCustomers> dataImpCommCustomersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataImportCustomer1")
    private List<DataImpCommCustomers> dataImpCommCustomersList1;

    public DataImportCustomer() {
    }

    public DataImportCustomer(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getPartyClassificationTypeId() {
        return partyClassificationTypeId;
    }

    public void setPartyClassificationTypeId(String partyClassificationTypeId) {
        this.partyClassificationTypeId = partyClassificationTypeId;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardExpDate() {
        return creditCardExpDate;
    }

    public void setCreditCardExpDate(String creditCardExpDate) {
        this.creditCardExpDate = creditCardExpDate;
    }

    public BigDecimal getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(BigDecimal outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Character getDisableShipping() {
        return disableShipping;
    }

    public void setDisableShipping(Character disableShipping) {
        this.disableShipping = disableShipping;
    }

    public BigInteger getNetPaymentDays() {
        return netPaymentDays;
    }

    public void setNetPaymentDays(BigInteger netPaymentDays) {
        this.netPaymentDays = netPaymentDays;
    }

    public String getShipToCompanyName() {
        return shipToCompanyName;
    }

    public void setShipToCompanyName(String shipToCompanyName) {
        this.shipToCompanyName = shipToCompanyName;
    }

    public String getShipToFirstName() {
        return shipToFirstName;
    }

    public void setShipToFirstName(String shipToFirstName) {
        this.shipToFirstName = shipToFirstName;
    }

    public String getShipToLastName() {
        return shipToLastName;
    }

    public void setShipToLastName(String shipToLastName) {
        this.shipToLastName = shipToLastName;
    }

    public String getShipToAttnName() {
        return shipToAttnName;
    }

    public void setShipToAttnName(String shipToAttnName) {
        this.shipToAttnName = shipToAttnName;
    }

    public String getShipToAddress1() {
        return shipToAddress1;
    }

    public void setShipToAddress1(String shipToAddress1) {
        this.shipToAddress1 = shipToAddress1;
    }

    public String getShipToAddress2() {
        return shipToAddress2;
    }

    public void setShipToAddress2(String shipToAddress2) {
        this.shipToAddress2 = shipToAddress2;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToStateProvinceGeoId() {
        return shipToStateProvinceGeoId;
    }

    public void setShipToStateProvinceGeoId(String shipToStateProvinceGeoId) {
        this.shipToStateProvinceGeoId = shipToStateProvinceGeoId;
    }

    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    public void setShipToPostalCode(String shipToPostalCode) {
        this.shipToPostalCode = shipToPostalCode;
    }

    public String getShipToPostalCodeExt() {
        return shipToPostalCodeExt;
    }

    public void setShipToPostalCodeExt(String shipToPostalCodeExt) {
        this.shipToPostalCodeExt = shipToPostalCodeExt;
    }

    public String getShipToStateProvGeoName() {
        return shipToStateProvGeoName;
    }

    public void setShipToStateProvGeoName(String shipToStateProvGeoName) {
        this.shipToStateProvGeoName = shipToStateProvGeoName;
    }

    public String getShipToCountryGeoId() {
        return shipToCountryGeoId;
    }

    public void setShipToCountryGeoId(String shipToCountryGeoId) {
        this.shipToCountryGeoId = shipToCountryGeoId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public String getCompanyPartyId() {
        return companyPartyId;
    }

    public void setCompanyPartyId(String companyPartyId) {
        this.companyPartyId = companyPartyId;
    }

    public String getPersonPartyId() {
        return personPartyId;
    }

    public void setPersonPartyId(String personPartyId) {
        this.personPartyId = personPartyId;
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

    public DataImpCommRates getDataImpCommRates() {
        return dataImpCommRates;
    }

    public void setDataImpCommRates(DataImpCommRates dataImpCommRates) {
        this.dataImpCommRates = dataImpCommRates;
    }

    public List<DataImpCommCustomers> getDataImpCommCustomersList() {
        return dataImpCommCustomersList;
    }

    public void setDataImpCommCustomersList(List<DataImpCommCustomers> dataImpCommCustomersList) {
        this.dataImpCommCustomersList = dataImpCommCustomersList;
    }

    public List<DataImpCommCustomers> getDataImpCommCustomersList1() {
        return dataImpCommCustomersList1;
    }

    public void setDataImpCommCustomersList1(List<DataImpCommCustomers> dataImpCommCustomersList1) {
        this.dataImpCommCustomersList1 = dataImpCommCustomersList1;
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
        if (!(object instanceof DataImportCustomer)) {
            return false;
        }
        DataImportCustomer other = (DataImportCustomer) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportCustomer[ customerId=" + customerId + " ]";
    }
    
}
