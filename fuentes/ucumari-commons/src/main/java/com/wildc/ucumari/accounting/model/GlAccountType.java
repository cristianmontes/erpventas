/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.invoice.model.InvoiceGlAccountType;
import com.wildc.ucumari.party.model.PartyGlAccount;
import com.wildc.ucumari.payment.model.PaymentGlAccountTypeMap;
import com.wildc.ucumari.product.model.ProductCategoryGlAccount;
import com.wildc.ucumari.product.model.ProductGlAccount;
import com.wildc.ucumari.client.modelo.CostComponentCalc;
import com.wildc.ucumari.client.modelo.InvSttsGlacctType;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "gl_account_type")
@NamedQueries({
    @NamedQuery(name = "GlAccountType.findAll", query = "SELECT g FROM GlAccountType g")})
public class GlAccountType implements Serializable {
    @OneToMany(mappedBy = "glAccountTypeId")
    private List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccountType")
    private List<ProductCategoryGlAccount> productCategoryGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccountType")
    private List<ProductGlAccount> productGlAccountList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccountType")
    private List<PartyGlAccount> partyGlAccountList;
    @OneToMany(mappedBy = "glAccountTypeId")
    private List<GlAccountClassTypeMap> glAccountClassTypeMapList;
    @OneToMany(mappedBy = "invoiceGlAccountTypeId")
    private List<InvoiceGlAccountType> invoiceGlAccountTypeList;
    @OneToMany(mappedBy = "debitGlAccountTypeId")
    private List<InvSttsGlacctType> invSttsGlacctTypeList;
    @OneToMany(mappedBy = "creditGlAccountTypeId")
    private List<InvSttsGlacctType> invSttsGlacctTypeList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "glAccountType")
    private List<GlAccountTypeDefault> glAccountTypeDefaultList;
    @OneToMany(mappedBy = "offsettingGlAccountTypeId")
    private List<CostComponentCalc> costComponentCalcList;
    @OneToMany(mappedBy = "costGlAccountTypeId")
    private List<CostComponentCalc> costComponentCalcList1;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_TYPE_ID")
    private String glAccountTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @Column(name = "NEEDS_CONFIGURATION")
    private Character needsConfiguration;
    @OneToMany(mappedBy = "parentTypeId")
    private List<GlAccountType> glAccountTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType parentTypeId;
    @OneToMany(mappedBy = "glAccountTypeId")
    private List<AcctgTransEntry> acctgTransEntryList;
    @OneToMany(mappedBy = "glAccountTypeId")
    private List<GlAccount> glAccountList;

    public GlAccountType() {
    }

    public GlAccountType(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    public String getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(String glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public Character getNeedsConfiguration() {
        return needsConfiguration;
    }

    public void setNeedsConfiguration(Character needsConfiguration) {
        this.needsConfiguration = needsConfiguration;
    }

    public List<GlAccountType> getGlAccountTypeList() {
        return glAccountTypeList;
    }

    public void setGlAccountTypeList(List<GlAccountType> glAccountTypeList) {
        this.glAccountTypeList = glAccountTypeList;
    }

    public GlAccountType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(GlAccountType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<AcctgTransEntry> getAcctgTransEntryList() {
        return acctgTransEntryList;
    }

    public void setAcctgTransEntryList(List<AcctgTransEntry> acctgTransEntryList) {
        this.acctgTransEntryList = acctgTransEntryList;
    }

    public List<GlAccount> getGlAccountList() {
        return glAccountList;
    }

    public void setGlAccountList(List<GlAccount> glAccountList) {
        this.glAccountList = glAccountList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountTypeId != null ? glAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountType)) {
            return false;
        }
        GlAccountType other = (GlAccountType) object;
        if ((this.glAccountTypeId == null && other.glAccountTypeId != null) || (this.glAccountTypeId != null && !this.glAccountTypeId.equals(other.glAccountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountType[ glAccountTypeId=" + glAccountTypeId + " ]";
    }

    public List<CostComponentCalc> getCostComponentCalcList() {
        return costComponentCalcList;
    }

    public void setCostComponentCalcList(List<CostComponentCalc> costComponentCalcList) {
        this.costComponentCalcList = costComponentCalcList;
    }

    public List<CostComponentCalc> getCostComponentCalcList1() {
        return costComponentCalcList1;
    }

    public void setCostComponentCalcList1(List<CostComponentCalc> costComponentCalcList1) {
        this.costComponentCalcList1 = costComponentCalcList1;
    }

    public List<GlAccountClassTypeMap> getGlAccountClassTypeMapList() {
        return glAccountClassTypeMapList;
    }

    public void setGlAccountClassTypeMapList(List<GlAccountClassTypeMap> glAccountClassTypeMapList) {
        this.glAccountClassTypeMapList = glAccountClassTypeMapList;
    }

    public List<InvoiceGlAccountType> getInvoiceGlAccountTypeList() {
        return invoiceGlAccountTypeList;
    }

    public void setInvoiceGlAccountTypeList(List<InvoiceGlAccountType> invoiceGlAccountTypeList) {
        this.invoiceGlAccountTypeList = invoiceGlAccountTypeList;
    }

    public List<InvSttsGlacctType> getInvSttsGlacctTypeList() {
        return invSttsGlacctTypeList;
    }

    public void setInvSttsGlacctTypeList(List<InvSttsGlacctType> invSttsGlacctTypeList) {
        this.invSttsGlacctTypeList = invSttsGlacctTypeList;
    }

    public List<InvSttsGlacctType> getInvSttsGlacctTypeList1() {
        return invSttsGlacctTypeList1;
    }

    public void setInvSttsGlacctTypeList1(List<InvSttsGlacctType> invSttsGlacctTypeList1) {
        this.invSttsGlacctTypeList1 = invSttsGlacctTypeList1;
    }

    public List<GlAccountTypeDefault> getGlAccountTypeDefaultList() {
        return glAccountTypeDefaultList;
    }

    public void setGlAccountTypeDefaultList(List<GlAccountTypeDefault> glAccountTypeDefaultList) {
        this.glAccountTypeDefaultList = glAccountTypeDefaultList;
    }

    public List<PaymentGlAccountTypeMap> getPaymentGlAccountTypeMapList() {
        return paymentGlAccountTypeMapList;
    }

    public void setPaymentGlAccountTypeMapList(List<PaymentGlAccountTypeMap> paymentGlAccountTypeMapList) {
        this.paymentGlAccountTypeMapList = paymentGlAccountTypeMapList;
    }

    public List<ProductCategoryGlAccount> getProductCategoryGlAccountList() {
        return productCategoryGlAccountList;
    }

    public void setProductCategoryGlAccountList(List<ProductCategoryGlAccount> productCategoryGlAccountList) {
        this.productCategoryGlAccountList = productCategoryGlAccountList;
    }

    public List<ProductGlAccount> getProductGlAccountList() {
        return productGlAccountList;
    }

    public void setProductGlAccountList(List<ProductGlAccount> productGlAccountList) {
        this.productGlAccountList = productGlAccountList;
    }

    public List<PartyGlAccount> getPartyGlAccountList() {
        return partyGlAccountList;
    }

    public void setPartyGlAccountList(List<PartyGlAccount> partyGlAccountList) {
        this.partyGlAccountList = partyGlAccountList;
    }
    
}
