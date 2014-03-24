/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.Uom;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "party_supplemental_data")
@NamedQueries({
    @NamedQuery(name = "PartySupplementalData.findAll", query = "SELECT p FROM PartySupplementalData p")})
public class PartySupplementalData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;
    @Column(name = "GENERAL_PROF_TITLE")
    private String generalProfTitle;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "COMPANY_NAME_LOCAL")
    private String companyNameLocal;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ANNUAL_REVENUE")
    private BigDecimal annualRevenue;
    @Column(name = "NUMBER_EMPLOYEES")
    private BigInteger numberEmployees;
    @Column(name = "SIC_CODE")
    private String sicCode;
    @Column(name = "TICKER_SYMBOL")
    private String tickerSymbol;
    @Lob
    @Column(name = "IMPORTANT_NOTE")
    private String importantNote;
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
    @JoinColumn(name = "PRIMARY_TELECOM_NUMBER_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech primaryTelecomNumberId;
    @JoinColumn(name = "PRIMARY_POSTAL_ADDRESS_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech primaryPostalAddressId;
    @JoinColumn(name = "PRIMARY_EMAIL_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech primaryEmailId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PARENT_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party parentPartyId;
    @JoinColumn(name = "OWNERSHIP_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration ownershipEnumId;
    @JoinColumn(name = "INDUSTRY_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration industryEnumId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;

    public PartySupplementalData() {
    }

    public PartySupplementalData(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGeneralProfTitle() {
        return generalProfTitle;
    }

    public void setGeneralProfTitle(String generalProfTitle) {
        this.generalProfTitle = generalProfTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyNameLocal() {
        return companyNameLocal;
    }

    public void setCompanyNameLocal(String companyNameLocal) {
        this.companyNameLocal = companyNameLocal;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public BigInteger getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(BigInteger numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getImportantNote() {
        return importantNote;
    }

    public void setImportantNote(String importantNote) {
        this.importantNote = importantNote;
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

    public ContactMech getPrimaryTelecomNumberId() {
        return primaryTelecomNumberId;
    }

    public void setPrimaryTelecomNumberId(ContactMech primaryTelecomNumberId) {
        this.primaryTelecomNumberId = primaryTelecomNumberId;
    }

    public ContactMech getPrimaryPostalAddressId() {
        return primaryPostalAddressId;
    }

    public void setPrimaryPostalAddressId(ContactMech primaryPostalAddressId) {
        this.primaryPostalAddressId = primaryPostalAddressId;
    }

    public ContactMech getPrimaryEmailId() {
        return primaryEmailId;
    }

    public void setPrimaryEmailId(ContactMech primaryEmailId) {
        this.primaryEmailId = primaryEmailId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Party getParentPartyId() {
        return parentPartyId;
    }

    public void setParentPartyId(Party parentPartyId) {
        this.parentPartyId = parentPartyId;
    }

    public Enumeration getOwnershipEnumId() {
        return ownershipEnumId;
    }

    public void setOwnershipEnumId(Enumeration ownershipEnumId) {
        this.ownershipEnumId = ownershipEnumId;
    }

    public Enumeration getIndustryEnumId() {
        return industryEnumId;
    }

    public void setIndustryEnumId(Enumeration industryEnumId) {
        this.industryEnumId = industryEnumId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartySupplementalData)) {
            return false;
        }
        PartySupplementalData other = (PartySupplementalData) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartySupplementalData[ partyId=" + partyId + " ]";
    }
    
}
