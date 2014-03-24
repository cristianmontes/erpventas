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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "encumbrance_detail")
@NamedQueries({
    @NamedQuery(name = "EncumbranceDetail.findAll", query = "SELECT e FROM EncumbranceDetail e")})
public class EncumbranceDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EncumbranceDetailPK encumbranceDetailPK;
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ORIGINAL_QUANTITY")
    private BigDecimal originalQuantity;
    @Column(name = "CANCEL_QUANTITY")
    private BigDecimal cancelQuantity;
    @Column(name = "INVOICED_QUANTITY")
    private BigDecimal invoicedQuantity;
    @Column(name = "ENCUMBERED_QUANTITY")
    private BigDecimal encumberedQuantity;
    @Column(name = "UNIT_AMOUNT")
    private BigDecimal unitAmount;
    @Column(name = "ACCTG_TRANS_ID")
    private String acctgTransId;
    @Column(name = "ACCTG_TRANS_ENTRY_ID")
    private String acctgTransEntryId;
    @Column(name = "DEBIT_CREDIT_FLAG")
    private Character debitCreditFlag;
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Column(name = "ENCUMBERED_AMOUNT")
    private BigDecimal encumberedAmount;
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
    @JoinColumn(name = "ACCTG_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration acctgTagEnumId1;
    @JoinColumn(name = "ENCUMBRANCE_SNAPSHOT_ID", referencedColumnName = "ENCUMBRANCE_SNAPSHOT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EncumbranceSnapshot encumbranceSnapshot;
    @JoinColumn(name = "ENCUMBRANCE_DETAIL_TYPE_ID", referencedColumnName = "ENCUMBRANCE_DETAIL_TYPE_ID")
    @ManyToOne
    private EncumbranceDetailType encumbranceDetailTypeId;

    public EncumbranceDetail() {
    }

    public EncumbranceDetail(EncumbranceDetailPK encumbranceDetailPK) {
        this.encumbranceDetailPK = encumbranceDetailPK;
    }

    public EncumbranceDetail(String encumbranceSnapshotId, String encumbranceDetailSeqId) {
        this.encumbranceDetailPK = new EncumbranceDetailPK(encumbranceSnapshotId, encumbranceDetailSeqId);
    }

    public EncumbranceDetailPK getEncumbranceDetailPK() {
        return encumbranceDetailPK;
    }

    public void setEncumbranceDetailPK(EncumbranceDetailPK encumbranceDetailPK) {
        this.encumbranceDetailPK = encumbranceDetailPK;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }

    public BigDecimal getOriginalQuantity() {
        return originalQuantity;
    }

    public void setOriginalQuantity(BigDecimal originalQuantity) {
        this.originalQuantity = originalQuantity;
    }

    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
    }

    public BigDecimal getInvoicedQuantity() {
        return invoicedQuantity;
    }

    public void setInvoicedQuantity(BigDecimal invoicedQuantity) {
        this.invoicedQuantity = invoicedQuantity;
    }

    public BigDecimal getEncumberedQuantity() {
        return encumberedQuantity;
    }

    public void setEncumberedQuantity(BigDecimal encumberedQuantity) {
        this.encumberedQuantity = encumberedQuantity;
    }

    public BigDecimal getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(BigDecimal unitAmount) {
        this.unitAmount = unitAmount;
    }

    public String getAcctgTransId() {
        return acctgTransId;
    }

    public void setAcctgTransId(String acctgTransId) {
        this.acctgTransId = acctgTransId;
    }

    public String getAcctgTransEntryId() {
        return acctgTransEntryId;
    }

    public void setAcctgTransEntryId(String acctgTransEntryId) {
        this.acctgTransEntryId = acctgTransEntryId;
    }

    public Character getDebitCreditFlag() {
        return debitCreditFlag;
    }

    public void setDebitCreditFlag(Character debitCreditFlag) {
        this.debitCreditFlag = debitCreditFlag;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public BigDecimal getEncumberedAmount() {
        return encumberedAmount;
    }

    public void setEncumberedAmount(BigDecimal encumberedAmount) {
        this.encumberedAmount = encumberedAmount;
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

    public Enumeration getAcctgTagEnumId1() {
        return acctgTagEnumId1;
    }

    public void setAcctgTagEnumId1(Enumeration acctgTagEnumId1) {
        this.acctgTagEnumId1 = acctgTagEnumId1;
    }

    public EncumbranceSnapshot getEncumbranceSnapshot() {
        return encumbranceSnapshot;
    }

    public void setEncumbranceSnapshot(EncumbranceSnapshot encumbranceSnapshot) {
        this.encumbranceSnapshot = encumbranceSnapshot;
    }

    public EncumbranceDetailType getEncumbranceDetailTypeId() {
        return encumbranceDetailTypeId;
    }

    public void setEncumbranceDetailTypeId(EncumbranceDetailType encumbranceDetailTypeId) {
        this.encumbranceDetailTypeId = encumbranceDetailTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (encumbranceDetailPK != null ? encumbranceDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EncumbranceDetail)) {
            return false;
        }
        EncumbranceDetail other = (EncumbranceDetail) object;
        if ((this.encumbranceDetailPK == null && other.encumbranceDetailPK != null) || (this.encumbranceDetailPK != null && !this.encumbranceDetailPK.equals(other.encumbranceDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EncumbranceDetail[ encumbranceDetailPK=" + encumbranceDetailPK + " ]";
    }
    
}
