/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.invoice.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductFeature;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "invoice_item")
public class InvoiceItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItem")
    private List<WorkEffortBilling> workEffortBillingList;
    @OneToMany(mappedBy = "invoiceItem")
    private List<TimeEntry> timeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItem")
    private List<ReturnItemBilling> returnItemBillingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItem")
    private List<ShipmentItemBilling> shipmentItemBillingList;
    @OneToMany(mappedBy = "invoiceItem")
    private List<InvoiceItemAssoc> invoiceItemAssocList;
    @OneToMany(mappedBy = "invoiceItem1")
    private List<InvoiceItemAssoc> invoiceItemAssocList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceItem")
    private List<InvoiceItemAttribute> invoiceItemAttributeList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvoiceItemPK invoiceItemPK;
    @Column(name = "TAXABLE_FLAG")
    private Character taxableFlag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
    /*@OneToMany(mappedBy = "invoiceItem")
    private List<AgreementTermBilling> agreementTermBillingList;
    @OneToMany(mappedBy = "invoiceItem1")
    private List<AgreementTermBilling> agreementTermBillingList1;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId9;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId8;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId7;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId6;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId5;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId4;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId3;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId2;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId10;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;
    @JoinColumn(name = "TAX_AUTHORITY_RATE_SEQ_ID", referencedColumnName = "TAX_AUTHORITY_RATE_SEQ_ID")
    @ManyToOne
    private TaxAuthorityRateProduct taxAuthorityRateSeqId;*/
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Invoice invoice;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    /*@JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;
    @JoinColumn(name = "OVERRIDE_ORG_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party overrideOrgPartyId;
    @OneToMany(mappedBy = "invoiceItem")
    private List<InvoiceItem> invoiceItemList;*/
    @JoinColumns({
        @JoinColumn(name = "PARENT_INVOICE_ID", referencedColumnName = "INVOICE_ID"),
        @JoinColumn(name = "PARENT_INVOICE_ITEM_SEQ_ID", referencedColumnName = "INVOICE_ITEM_SEQ_ID")})
    @ManyToOne
    private InvoiceItem invoiceItem;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID")
    @ManyToOne
    private ProductFeature productFeatureId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    /*@JoinColumn(name = "SALES_OPPORTUNITY_ID", referencedColumnName = "SALES_OPPORTUNITY_ID")
    @ManyToOne
    private SalesOpportunity salesOpportunityId;
    @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo taxAuthGeoId;
    @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party taxAuthPartyId;*/
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "INVOICE_ITEM_TYPE_ID", referencedColumnName = "INVOICE_ITEM_TYPE_ID")
    @ManyToOne
    private InvoiceItemType invoiceItemTypeId;

    public InvoiceItem() {
    }

    public InvoiceItem(InvoiceItemPK invoiceItemPK) {
        this.invoiceItemPK = invoiceItemPK;
    }

    public InvoiceItem(String invoiceId, String invoiceItemSeqId) {
        this.invoiceItemPK = new InvoiceItemPK(invoiceId, invoiceItemSeqId);
    }

    public InvoiceItemPK getInvoiceItemPK() {
        return invoiceItemPK;
    }

    public void setInvoiceItemPK(InvoiceItemPK invoiceItemPK) {
        this.invoiceItemPK = invoiceItemPK;
    }

    public Character getTaxableFlag() {
        return taxableFlag;
    }

    public void setTaxableFlag(Character taxableFlag) {
        this.taxableFlag = taxableFlag;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    public List<AgreementTermBilling> getAgreementTermBillingList() {
        return agreementTermBillingList;
    }

    public void setAgreementTermBillingList(List<AgreementTermBilling> agreementTermBillingList) {
        this.agreementTermBillingList = agreementTermBillingList;
    }

    public List<AgreementTermBilling> getAgreementTermBillingList1() {
        return agreementTermBillingList1;
    }

    public void setAgreementTermBillingList1(List<AgreementTermBilling> agreementTermBillingList1) {
        this.agreementTermBillingList1 = agreementTermBillingList1;
    }

    public Enumeration getAcctgTagEnumId9() {
        return acctgTagEnumId9;
    }

    public void setAcctgTagEnumId9(Enumeration acctgTagEnumId9) {
        this.acctgTagEnumId9 = acctgTagEnumId9;
    }

    public Enumeration getAcctgTagEnumId8() {
        return acctgTagEnumId8;
    }

    public void setAcctgTagEnumId8(Enumeration acctgTagEnumId8) {
        this.acctgTagEnumId8 = acctgTagEnumId8;
    }

    public Enumeration getAcctgTagEnumId7() {
        return acctgTagEnumId7;
    }

    public void setAcctgTagEnumId7(Enumeration acctgTagEnumId7) {
        this.acctgTagEnumId7 = acctgTagEnumId7;
    }

    public Enumeration getAcctgTagEnumId6() {
        return acctgTagEnumId6;
    }

    public void setAcctgTagEnumId6(Enumeration acctgTagEnumId6) {
        this.acctgTagEnumId6 = acctgTagEnumId6;
    }

    public Enumeration getAcctgTagEnumId5() {
        return acctgTagEnumId5;
    }

    public void setAcctgTagEnumId5(Enumeration acctgTagEnumId5) {
        this.acctgTagEnumId5 = acctgTagEnumId5;
    }

    public Enumeration getAcctgTagEnumId4() {
        return acctgTagEnumId4;
    }

    public void setAcctgTagEnumId4(Enumeration acctgTagEnumId4) {
        this.acctgTagEnumId4 = acctgTagEnumId4;
    }

    public Enumeration getAcctgTagEnumId3() {
        return acctgTagEnumId3;
    }

    public void setAcctgTagEnumId3(Enumeration acctgTagEnumId3) {
        this.acctgTagEnumId3 = acctgTagEnumId3;
    }

    public Enumeration getAcctgTagEnumId2() {
        return acctgTagEnumId2;
    }

    public void setAcctgTagEnumId2(Enumeration acctgTagEnumId2) {
        this.acctgTagEnumId2 = acctgTagEnumId2;
    }

    public Enumeration getAcctgTagEnumId10() {
        return acctgTagEnumId10;
    }

    public void setAcctgTagEnumId10(Enumeration acctgTagEnumId10) {
        this.acctgTagEnumId10 = acctgTagEnumId10;
    }

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public TaxAuthorityRateProduct getTaxAuthorityRateSeqId() {
        return taxAuthorityRateSeqId;
    }

    public void setTaxAuthorityRateSeqId(TaxAuthorityRateProduct taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }*/

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
/*
    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public Party getOverrideOrgPartyId() {
        return overrideOrgPartyId;
    }

    public void setOverrideOrgPartyId(Party overrideOrgPartyId) {
        this.overrideOrgPartyId = overrideOrgPartyId;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }*/

    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    public ProductFeature getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(ProductFeature productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }
/*
    public SalesOpportunity getSalesOpportunityId() {
        return salesOpportunityId;
    }

    public void setSalesOpportunityId(SalesOpportunity salesOpportunityId) {
        this.salesOpportunityId = salesOpportunityId;
    }

    public Geo getTaxAuthGeoId() {
        return taxAuthGeoId;
    }

    public void setTaxAuthGeoId(Geo taxAuthGeoId) {
        this.taxAuthGeoId = taxAuthGeoId;
    }

    public Party getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(Party taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }*/

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public InvoiceItemType getInvoiceItemTypeId() {
        return invoiceItemTypeId;
    }

    public void setInvoiceItemTypeId(InvoiceItemType invoiceItemTypeId) {
        this.invoiceItemTypeId = invoiceItemTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invoiceItemPK != null ? invoiceItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvoiceItem)) {
            return false;
        }
        InvoiceItem other = (InvoiceItem) object;
        if ((this.invoiceItemPK == null && other.invoiceItemPK != null) || (this.invoiceItemPK != null && !this.invoiceItemPK.equals(other.invoiceItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvoiceItem[ invoiceItemPK=" + invoiceItemPK + " ]";
    }
/*
    public List<InvoiceItemAssoc> getInvoiceItemAssocList() {
        return invoiceItemAssocList;
    }

    public void setInvoiceItemAssocList(List<InvoiceItemAssoc> invoiceItemAssocList) {
        this.invoiceItemAssocList = invoiceItemAssocList;
    }

    public List<InvoiceItemAssoc> getInvoiceItemAssocList1() {
        return invoiceItemAssocList1;
    }

    public void setInvoiceItemAssocList1(List<InvoiceItemAssoc> invoiceItemAssocList1) {
        this.invoiceItemAssocList1 = invoiceItemAssocList1;
    }

    public List<InvoiceItemAttribute> getInvoiceItemAttributeList() {
        return invoiceItemAttributeList;
    }

    public void setInvoiceItemAttributeList(List<InvoiceItemAttribute> invoiceItemAttributeList) {
        this.invoiceItemAttributeList = invoiceItemAttributeList;
    }

    public List<WorkEffortBilling> getWorkEffortBillingList() {
        return workEffortBillingList;
    }

    public void setWorkEffortBillingList(List<WorkEffortBilling> workEffortBillingList) {
        this.workEffortBillingList = workEffortBillingList;
    }

    public List<TimeEntry> getTimeEntryList() {
        return timeEntryList;
    }

    public void setTimeEntryList(List<TimeEntry> timeEntryList) {
        this.timeEntryList = timeEntryList;
    }

    public List<ReturnItemBilling> getReturnItemBillingList() {
        return returnItemBillingList;
    }

    public void setReturnItemBillingList(List<ReturnItemBilling> returnItemBillingList) {
        this.returnItemBillingList = returnItemBillingList;
    }

    public List<ShipmentItemBilling> getShipmentItemBillingList() {
        return shipmentItemBillingList;
    }

    public void setShipmentItemBillingList(List<ShipmentItemBilling> shipmentItemBillingList) {
        this.shipmentItemBillingList = shipmentItemBillingList;
    }
    */
}
