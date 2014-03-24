/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.PartyClassificationGroup;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement")
public class Agreement implements Serializable {
    /*@OneToMany(mappedBy = "agreementId")
    private List<InvoiceItemAssoc> invoiceItemAssocList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGREEMENT_ID")
    private String agreementId;
    @Column(name = "AGREEMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agreementDate;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "TEXT_DATA")
    private String textData;
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
    @Column(name = "DEFAULT_CURRENCY_UOM_ID")
    private String defaultCurrencyUomId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreement")
    private List<AgreementGeographicalApplic> agreementGeographicalApplicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreement")
    private List<AgreementItem> agreementItemList;
    @OneToMany(mappedBy = "agreementId")
    private List<AgreementTermBilling> agreementTermBillingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreement")
    private List<AgreementAttribute> agreementAttributeList;
    @OneToMany(mappedBy = "agreementId")
    private List<Addendum> addendumList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agreement")
    private List<AgreementPartyApplic> agreementPartyApplicList;
    @OneToMany(mappedBy = "agreementId")
    private List<AgreementTerm> agreementTermList;*/
    @JoinColumn(name = "TO_PARTY_CLASS_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID")
    @ManyToOne
    private PartyClassificationGroup toPartyClassGroupId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "FROM_PARTY_CLASS_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID")
    @ManyToOne
    private PartyClassificationGroup fromPartyClassGroupId;
    @JoinColumn(name = "AGREEMENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID")
    @ManyToOne
    private AgreementType agreementTypeId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "ROLE_TYPE_ID_TO", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private PartyRole partyRole;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "ROLE_TYPE_ID_FROM", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private PartyRole partyRole1;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreement")
    private List<AgreementRole> agreementRoleList;*/

    public Agreement() {
    }

    public Agreement(String agreementId) {
        this.agreementId = agreementId;
    }

    public String getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(String agreementId) {
        this.agreementId = agreementId;
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTextData() {
        return textData;
    }

    public void setTextData(String textData) {
        this.textData = textData;
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

    public String getDefaultCurrencyUomId() {
        return defaultCurrencyUomId;
    }

    public void setDefaultCurrencyUomId(String defaultCurrencyUomId) {
        this.defaultCurrencyUomId = defaultCurrencyUomId;
    }
/*
    public List<AgreementGeographicalApplic> getAgreementGeographicalApplicList() {
        return agreementGeographicalApplicList;
    }

    public void setAgreementGeographicalApplicList(List<AgreementGeographicalApplic> agreementGeographicalApplicList) {
        this.agreementGeographicalApplicList = agreementGeographicalApplicList;
    }

    public List<AgreementItem> getAgreementItemList() {
        return agreementItemList;
    }

    public void setAgreementItemList(List<AgreementItem> agreementItemList) {
        this.agreementItemList = agreementItemList;
    }

    public List<AgreementTermBilling> getAgreementTermBillingList() {
        return agreementTermBillingList;
    }

    public void setAgreementTermBillingList(List<AgreementTermBilling> agreementTermBillingList) {
        this.agreementTermBillingList = agreementTermBillingList;
    }

    public List<AgreementAttribute> getAgreementAttributeList() {
        return agreementAttributeList;
    }

    public void setAgreementAttributeList(List<AgreementAttribute> agreementAttributeList) {
        this.agreementAttributeList = agreementAttributeList;
    }

    public List<Addendum> getAddendumList() {
        return addendumList;
    }

    public void setAddendumList(List<Addendum> addendumList) {
        this.addendumList = addendumList;
    }

    public List<AgreementPartyApplic> getAgreementPartyApplicList() {
        return agreementPartyApplicList;
    }

    public void setAgreementPartyApplicList(List<AgreementPartyApplic> agreementPartyApplicList) {
        this.agreementPartyApplicList = agreementPartyApplicList;
    }

    public List<AgreementTerm> getAgreementTermList() {
        return agreementTermList;
    }

    public void setAgreementTermList(List<AgreementTerm> agreementTermList) {
        this.agreementTermList = agreementTermList;
    }*/

    public PartyClassificationGroup getToPartyClassGroupId() {
        return toPartyClassGroupId;
    }

    public void setToPartyClassGroupId(PartyClassificationGroup toPartyClassGroupId) {
        this.toPartyClassGroupId = toPartyClassGroupId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public PartyClassificationGroup getFromPartyClassGroupId() {
        return fromPartyClassGroupId;
    }

    public void setFromPartyClassGroupId(PartyClassificationGroup fromPartyClassGroupId) {
        this.fromPartyClassGroupId = fromPartyClassGroupId;
    }

    public AgreementType getAgreementTypeId() {
        return agreementTypeId;
    }

    public void setAgreementTypeId(AgreementType agreementTypeId) {
        this.agreementTypeId = agreementTypeId;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public PartyRole getPartyRole1() {
        return partyRole1;
    }

    public void setPartyRole1(PartyRole partyRole1) {
        this.partyRole1 = partyRole1;
    }
/*
    public List<AgreementRole> getAgreementRoleList() {
        return agreementRoleList;
    }

    public void setAgreementRoleList(List<AgreementRole> agreementRoleList) {
        this.agreementRoleList = agreementRoleList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementId != null ? agreementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agreement)) {
            return false;
        }
        Agreement other = (Agreement) object;
        if ((this.agreementId == null && other.agreementId != null) || (this.agreementId != null && !this.agreementId.equals(other.agreementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Agreement[ agreementId=" + agreementId + " ]";
    }
/*
    public List<InvoiceItemAssoc> getInvoiceItemAssocList() {
        return invoiceItemAssocList;
    }

    public void setInvoiceItemAssocList(List<InvoiceItemAssoc> invoiceItemAssocList) {
        this.invoiceItemAssocList = invoiceItemAssocList;
    }*/
    
}
