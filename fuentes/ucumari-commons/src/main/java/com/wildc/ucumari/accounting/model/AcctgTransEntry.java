/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.client.modelo.SettlementTerm;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "acctg_trans_entry")
@NamedQueries({
    @NamedQuery(name = "AcctgTransEntry.findAll", query = "SELECT a FROM AcctgTransEntry a")})
public class AcctgTransEntry implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acctgTransEntry")
    private List<GlReconciliationEntry> glReconciliationEntryList;
    @OneToMany(mappedBy = "acctgTransEntry")
    private List<GlAccountTransEntryFact> glAccountTransEntryFactList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctgTransEntryPK acctgTransEntryPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "VOUCHER_REF")
    private String voucherRef;
    @Column(name = "THEIR_PARTY_ID")
    private String theirPartyId;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "THEIR_PRODUCT_ID")
    private String theirProductId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "ORIG_AMOUNT")
    private BigDecimal origAmount;
    @Column(name = "DEBIT_CREDIT_FLAG")
    private Character debitCreditFlag;
    @Column(name = "DUE_DATE")
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    @Column(name = "GROUP_ID")
    private String groupId;
    @Column(name = "TAX_ID")
    private String taxId;
    @Column(name = "IS_SUMMARY")
    private Character isSummary;
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
    @JoinColumn(name = "ACCTG_TRANS_ID", referencedColumnName = "ACCTG_TRANS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AcctgTrans acctgTrans;
    @JoinColumn(name = "ACCTG_TRANS_ENTRY_TYPE_ID", referencedColumnName = "ACCTG_TRANS_ENTRY_TYPE_ID")
    @ManyToOne
    private AcctgTransEntryType acctgTransEntryTypeId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumns({
        @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID"),
        @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "ORGANIZATION_PARTY_ID")})
    @ManyToOne
    private GlAccountOrganization glAccountOrganization;
    @JoinColumn(name = "GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount glAccountId;
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType glAccountTypeId;
    @JoinColumn(name = "ORIG_CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom origCurrencyUomId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "RECONCILE_STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem reconcileStatusId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "SETTLEMENT_TERM_ID", referencedColumnName = "SETTLEMENT_TERM_ID")
    @ManyToOne
    private SettlementTerm settlementTermId;
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "acctgTransEntry")
    private List<AcctgTransEntryRole> acctgTransEntryRoleList;

    public AcctgTransEntry() {
    }

    public AcctgTransEntry(AcctgTransEntryPK acctgTransEntryPK) {
        this.acctgTransEntryPK = acctgTransEntryPK;
    }

    public AcctgTransEntry(String acctgTransId, String acctgTransEntrySeqId) {
        this.acctgTransEntryPK = new AcctgTransEntryPK(acctgTransId, acctgTransEntrySeqId);
    }

    public AcctgTransEntryPK getAcctgTransEntryPK() {
        return acctgTransEntryPK;
    }

    public void setAcctgTransEntryPK(AcctgTransEntryPK acctgTransEntryPK) {
        this.acctgTransEntryPK = acctgTransEntryPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVoucherRef() {
        return voucherRef;
    }

    public void setVoucherRef(String voucherRef) {
        this.voucherRef = voucherRef;
    }

    public String getTheirPartyId() {
        return theirPartyId;
    }

    public void setTheirPartyId(String theirPartyId) {
        this.theirPartyId = theirPartyId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getTheirProductId() {
        return theirProductId;
    }

    public void setTheirProductId(String theirProductId) {
        this.theirProductId = theirProductId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getOrigAmount() {
        return origAmount;
    }

    public void setOrigAmount(BigDecimal origAmount) {
        this.origAmount = origAmount;
    }

    public Character getDebitCreditFlag() {
        return debitCreditFlag;
    }

    public void setDebitCreditFlag(Character debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public Character getIsSummary() {
        return isSummary;
    }

    public void setIsSummary(Character isSummary) {
        this.isSummary = isSummary;
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

    public AcctgTrans getAcctgTrans() {
        return acctgTrans;
    }

    public void setAcctgTrans(AcctgTrans acctgTrans) {
        this.acctgTrans = acctgTrans;
    }

    public AcctgTransEntryType getAcctgTransEntryTypeId() {
        return acctgTransEntryTypeId;
    }

    public void setAcctgTransEntryTypeId(AcctgTransEntryType acctgTransEntryTypeId) {
        this.acctgTransEntryTypeId = acctgTransEntryTypeId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public GlAccountOrganization getGlAccountOrganization() {
        return glAccountOrganization;
    }

    public void setGlAccountOrganization(GlAccountOrganization glAccountOrganization) {
        this.glAccountOrganization = glAccountOrganization;
    }

    public GlAccount getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(GlAccount glAccountId) {
        this.glAccountId = glAccountId;
    }

    public GlAccountType getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(GlAccountType glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    public Uom getOrigCurrencyUomId() {
        return origCurrencyUomId;
    }

    public void setOrigCurrencyUomId(Uom origCurrencyUomId) {
        this.origCurrencyUomId = origCurrencyUomId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public StatusItem getReconcileStatusId() {
        return reconcileStatusId;
    }

    public void setReconcileStatusId(StatusItem reconcileStatusId) {
        this.reconcileStatusId = reconcileStatusId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public SettlementTerm getSettlementTermId() {
        return settlementTermId;
    }

    public void setSettlementTermId(SettlementTerm settlementTermId) {
        this.settlementTermId = settlementTermId;
    }

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public List<AcctgTransEntryRole> getAcctgTransEntryRoleList() {
        return acctgTransEntryRoleList;
    }

    public void setAcctgTransEntryRoleList(List<AcctgTransEntryRole> acctgTransEntryRoleList) {
        this.acctgTransEntryRoleList = acctgTransEntryRoleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransEntryPK != null ? acctgTransEntryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransEntry)) {
            return false;
        }
        AcctgTransEntry other = (AcctgTransEntry) object;
        if ((this.acctgTransEntryPK == null && other.acctgTransEntryPK != null) || (this.acctgTransEntryPK != null && !this.acctgTransEntryPK.equals(other.acctgTransEntryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransEntry[ acctgTransEntryPK=" + acctgTransEntryPK + " ]";
    }

    public List<GlReconciliationEntry> getGlReconciliationEntryList() {
        return glReconciliationEntryList;
    }

    public void setGlReconciliationEntryList(List<GlReconciliationEntry> glReconciliationEntryList) {
        this.glReconciliationEntryList = glReconciliationEntryList;
    }

    public List<GlAccountTransEntryFact> getGlAccountTransEntryFactList() {
        return glAccountTransEntryFactList;
    }

    public void setGlAccountTransEntryFactList(List<GlAccountTransEntryFact> glAccountTransEntryFactList) {
        this.glAccountTransEntryFactList = glAccountTransEntryFactList;
    }
    
}
