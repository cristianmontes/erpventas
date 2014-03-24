/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.invoice.model.InvoiceItemType;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.TermType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyClassificationGroup;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductCategory;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "agreement_term")
public class AgreementTerm implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "AGREEMENT_TERM_ID")
    private String agreementTermId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TERM_VALUE")
    private BigDecimal termValue;
    @Column(name = "TERM_DAYS")
    private BigInteger termDays;
    @Column(name = "TEXT_VALUE")
    private String textValue;
    @Column(name = "MIN_QUANTITY")
    private BigDecimal minQuantity;
    @Column(name = "MAX_QUANTITY")
    private BigDecimal maxQuantity;
    @Column(name = "DESCRIPTION")
    private String description;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "agreementTerm")
    private List<AgreementTermAttribute> agreementTermAttributeList;
    @OneToMany(mappedBy = "agreementTermId")
    private List<AgreementTermBilling> agreementTermBillingList;*/
    @JoinColumn(name = "VALUE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration valueEnumId;
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "PARTY_CLASSIFICATION_GROUP_ID", referencedColumnName = "PARTY_CLASSIFICATION_GROUP_ID")
    @ManyToOne
    private PartyClassificationGroup partyClassificationGroupId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory productCategoryId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID")
    @ManyToOne
    private TermType termTypeId;
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID")
    @ManyToOne
    private InvoiceItemType invoiceItemTypeId;
    /*@JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID"),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID")})
    @ManyToOne
    private AgreementItem agreementItem;*/
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID")
    @ManyToOne
    private Agreement agreementId;

    public AgreementTerm() {
    }

    public AgreementTerm(String agreementTermId) {
        this.agreementTermId = agreementTermId;
    }

    public String getAgreementTermId() {
        return agreementTermId;
    }

    public void setAgreementTermId(String agreementTermId) {
        this.agreementTermId = agreementTermId;
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

    public BigDecimal getTermValue() {
        return termValue;
    }

    public void setTermValue(BigDecimal termValue) {
        this.termValue = termValue;
    }

    public BigInteger getTermDays() {
        return termDays;
    }

    public void setTermDays(BigInteger termDays) {
        this.termDays = termDays;
    }

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }

    public BigDecimal getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
/*
    public List<AgreementTermAttribute> getAgreementTermAttributeList() {
        return agreementTermAttributeList;
    }

    public void setAgreementTermAttributeList(List<AgreementTermAttribute> agreementTermAttributeList) {
        this.agreementTermAttributeList = agreementTermAttributeList;
    }

    public List<AgreementTermBilling> getAgreementTermBillingList() {
        return agreementTermBillingList;
    }

    public void setAgreementTermBillingList(List<AgreementTermBilling> agreementTermBillingList) {
        this.agreementTermBillingList = agreementTermBillingList;
    }*/

    public Enumeration getValueEnumId() {
        return valueEnumId;
    }

    public void setValueEnumId(Enumeration valueEnumId) {
        this.valueEnumId = valueEnumId;
    }

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public PartyClassificationGroup getPartyClassificationGroupId() {
        return partyClassificationGroupId;
    }

    public void setPartyClassificationGroupId(PartyClassificationGroup partyClassificationGroupId) {
        this.partyClassificationGroupId = partyClassificationGroupId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(ProductCategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public TermType getTermTypeId() {
        return termTypeId;
    }

    public void setTermTypeId(TermType termTypeId) {
        this.termTypeId = termTypeId;
    }

    public InvoiceItemType getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(InvoiceItemType invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }
/*
    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }*/

    public Agreement getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Agreement agreementId) {
        this.agreementId = agreementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTermId != null ? agreementTermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTerm)) {
            return false;
        }
        AgreementTerm other = (AgreementTerm) object;
        if ((this.agreementTermId == null && other.agreementTermId != null) || (this.agreementTermId != null && !this.agreementTermId.equals(other.agreementTermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTerm[ agreementTermId=" + agreementTermId + " ]";
    }
    
}
