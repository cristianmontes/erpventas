/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.client.modelo.FinAccountTrans;
import com.wildc.ucumari.client.modelo.FixedAsset;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.Payment;
import com.wildc.ucumari.payment.model.PaymentApplication;
import com.wildc.ucumari.shipment.model.Shipment;
import com.wildc.ucumari.shipment.model.ShipmentReceipt;
import com.wildc.ucumari.client.modelo.WorkEffort;
import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.inventory.model.InventoryItemVariance;
import com.wildc.ucumari.inventory.model.PhysicalInventory;
import com.wildc.ucumari.invoice.model.Invoice;
import com.wildc.ucumari.invoice.model.InvoiceAdjustment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "acctg_trans")
@NamedQueries({
    @NamedQuery(name = "AcctgTrans.findAll", query = "SELECT a FROM AcctgTrans a")})
public class AcctgTrans implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACCTG_TRANS_ID")
    private String acctgTransId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "TRANSACTION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transactionDate;
    @Column(name = "IS_POSTED")
    private Character isPosted;
    @Column(name = "POSTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedDate;
    @Column(name = "SCHEDULED_POSTING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date scheduledPostingDate;
    @Column(name = "VOUCHER_REF")
    private String voucherRef;
    @Column(name = "VOUCHER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date voucherDate;
    @Column(name = "THEIR_ACCTG_TRANS_ID")
    private String theirAcctgTransId;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POSTED_AMOUNT")
    private BigDecimal postedAmount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acctgTrans")
    private List<AcctgTransEntry> acctgTransEntryList;
    @JoinColumn(name = "PAYMENT_APPLICATION_ID", referencedColumnName = "PAYMENT_APPLICATION_ID")
    @ManyToOne
    private PaymentApplication paymentApplicationId;
    @JoinColumn(name = "INVOICE_ADJUSTMENT_ID", referencedColumnName = "INVOICE_ADJUSTMENT_ID")
    @ManyToOne
    private InvoiceAdjustment invoiceAdjustmentId;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortId;
    @JoinColumn(name = "ACCTG_TRANS_TYPE_ID", referencedColumnName = "ACCTG_TRANS_TYPE_ID")
    @ManyToOne
    private AcctgTransType acctgTransTypeId;
    @JoinColumn(name = "RECEIPT_ID", referencedColumnName = "RECEIPT_ID")
    @ManyToOne
    private ShipmentReceipt receiptId;
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID")
    @ManyToOne
    private Shipment shipmentId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "FIN_ACCOUNT_TRANS_ID", referencedColumnName = "FIN_ACCOUNT_TRANS_ID")
    @ManyToOne
    private FinAccountTrans finAccountTransId;
    @JoinColumn(name = "GL_FISCAL_TYPE_ID", referencedColumnName = "GL_FISCAL_TYPE_ID")
    @ManyToOne
    private GlFiscalType glFiscalTypeId;
    @JoinColumn(name = "GL_JOURNAL_ID", referencedColumnName = "GL_JOURNAL_ID")
    @ManyToOne
    private GlJournal glJournalId;
    @JoinColumn(name = "GROUP_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem groupStatusId;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    @JoinColumns({
        @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID"),
        @JoinColumn(name = "PHYSICAL_INVENTORY_ID", referencedColumnName = "PHYSICAL_INVENTORY_ID")})
    @ManyToOne
    private InventoryItemVariance inventoryItemVariance;
    @JoinColumn(name = "INVOICE_ID", referencedColumnName = "INVOICE_ID")
    @ManyToOne
    private Invoice invoiceId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PAYMENT_ID", referencedColumnName = "PAYMENT_ID")
    @ManyToOne
    private Payment paymentId;
    @JoinColumn(name = "PHYSICAL_INVENTORY_ID", referencedColumnName = "PHYSICAL_INVENTORY_ID")
    @ManyToOne
    private PhysicalInventory physicalInventoryId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acctgTrans")
    private List<AcctgTransAttribute> acctgTransAttributeList;

    public AcctgTrans() {
    }

    public AcctgTrans(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getAcctgTransId() {
        return acctgTransId;
    }

    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Character getIsPosted() {
        return isPosted;
    }

    public void setIsPosted(Character isPosted) {
        this.isPosted = isPosted;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Date getScheduledPostingDate() {
        return scheduledPostingDate;
    }

    public void setScheduledPostingDate(Date scheduledPostingDate) {
        this.scheduledPostingDate = scheduledPostingDate;
    }

    public String getVoucherRef() {
        return voucherRef;
    }

    public void setVoucherRef(String voucherRef) {
        this.voucherRef = voucherRef;
    }

    public Date getVoucherDate() {
        return voucherDate;
    }

    public void setVoucherDate(Date voucherDate) {
        this.voucherDate = voucherDate;
    }

    public String getTheirAcctgTransId() {
        return theirAcctgTransId;
    }

    public void setTheirAcctgTransId(String theirAcctgTransId) {
        this.theirAcctgTransId = theirAcctgTransId;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public BigDecimal getPostedAmount() {
        return postedAmount;
    }

    public void setPostedAmount(BigDecimal postedAmount) {
        this.postedAmount = postedAmount;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    public PaymentApplication getPaymentApplicationId() {
        return paymentApplicationId;
    }

    public void setPaymentApplicationId(PaymentApplication paymentApplicationId) {
        this.paymentApplicationId = paymentApplicationId;
    }

    public InvoiceAdjustment getInvoiceAdjustmentId() {
        return invoiceAdjustmentId;
    }

    public void setInvoiceAdjustmentId(InvoiceAdjustment invoiceAdjustmentId) {
        this.invoiceAdjustmentId = invoiceAdjustmentId;
    }

    public WorkEffort getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(WorkEffort workEffortId) {
        this.workEffortId = workEffortId;
    }

    public AcctgTransType getAcctgTransTypeId() {
        return acctgTransTypeId;
    }

    public void setAcctgTransTypeId(AcctgTransType acctgTransTypeId) {
        this.acctgTransTypeId = acctgTransTypeId;
    }

    public ShipmentReceipt getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(ShipmentReceipt receiptId) {
        this.receiptId = receiptId;
    }

    public Shipment getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(Shipment shipmentId) {
        this.shipmentId = shipmentId;
    }

    public FixedAsset getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(FixedAsset fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public FinAccountTrans getFinAccountTransId() {
        return finAccountTransId;
    }

    public void setFinAccountTransId(FinAccountTrans finAccountTransId) {
        this.finAccountTransId = finAccountTransId;
    }

    public GlFiscalType getGlFiscalTypeId() {
        return glFiscalTypeId;
    }

    public void setGlFiscalTypeId(GlFiscalType glFiscalTypeId) {
        this.glFiscalTypeId = glFiscalTypeId;
    }

    public GlJournal getGlJournalId() {
        return glJournalId;
    }

    public void setGlJournalId(GlJournal glJournalId) {
        this.glJournalId = glJournalId;
    }

    public StatusItem getGroupStatusId() {
        return groupStatusId;
    }

    public void setGroupStatusId(StatusItem groupStatusId) {
        this.groupStatusId = groupStatusId;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public InventoryItemVariance getInventoryItemVariance() {
        return inventoryItemVariance;
    }

    public void setInventoryItemVariance(InventoryItemVariance inventoryItemVariance) {
        this.inventoryItemVariance = inventoryItemVariance;
    }

    public Invoice getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Invoice invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Payment getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Payment paymentId) {
        this.paymentId = paymentId;
    }

    public PhysicalInventory getPhysicalInventoryId() {
        return physicalInventoryId;
    }

    public void setPhysicalInventoryId(PhysicalInventory physicalInventoryId) {
        this.physicalInventoryId = physicalInventoryId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public List<AcctgTransAttribute> getAcctgTransAttributeList() {
        return acctgTransAttributeList;
    }

    public void setAcctgTransAttributeList(List<AcctgTransAttribute> acctgTransAttributeList) {
        this.acctgTransAttributeList = acctgTransAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransId != null ? acctgTransId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTrans)) {
            return false;
        }
        AcctgTrans other = (AcctgTrans) object;
        if ((this.acctgTransId == null && other.acctgTransId != null) || (this.acctgTransId != null && !this.acctgTransId.equals(other.acctgTransId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTrans[ acctgTransId=" + acctgTransId + " ]";
    }
    
}
