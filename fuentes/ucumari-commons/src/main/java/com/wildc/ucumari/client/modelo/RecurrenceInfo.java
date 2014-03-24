/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.invoice.model.Invoice;
import com.wildc.ucumari.invoice.model.InvoiceRecurrence;
import com.wildc.ucumari.product.model.ProductAssoc;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "recurrence_info")
@NamedQueries({
    @NamedQuery(name = "RecurrenceInfo.findAll", query = "SELECT r FROM RecurrenceInfo r")})
public class RecurrenceInfo implements Serializable {
    @OneToMany(mappedBy = "recurrenceInfoId")
    private List<ProductAssoc> productAssocList;
    @OneToMany(mappedBy = "recurrenceInfoId")
    private List<JobSandbox> jobSandboxList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recurrenceInfo")
    private List<InvoiceRecurrence> invoiceRecurrenceList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RECURRENCE_INFO_ID")
    private String recurrenceInfoId;
    @Column(name = "START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDateTime;
    @Lob
    @Column(name = "EXCEPTION_DATE_TIMES")
    private String exceptionDateTimes;
    @Lob
    @Column(name = "RECURRENCE_DATE_TIMES")
    private String recurrenceDateTimes;
    @Column(name = "RECURRENCE_COUNT")
    private BigInteger recurrenceCount;
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
    @OneToMany(mappedBy = "recurrenceInfoId")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "recurrenceInfoId")
    private List<WorkEffort> workEffortList;
    @OneToMany(mappedBy = "recurrenceInfoId")
    private List<Invoice> invoiceList;
    @JoinColumn(name = "RECURRENCE_RULE_ID", referencedColumnName = "RECURRENCE_RULE_ID")
    @ManyToOne
    private RecurrenceRule recurrenceRuleId;
    @JoinColumn(name = "EXCEPTION_RULE_ID", referencedColumnName = "RECURRENCE_RULE_ID")
    @ManyToOne
    private RecurrenceRule exceptionRuleId;

    public RecurrenceInfo() {
    }

    public RecurrenceInfo(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public String getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(String recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getExceptionDateTimes() {
        return exceptionDateTimes;
    }

    public void setExceptionDateTimes(String exceptionDateTimes) {
        this.exceptionDateTimes = exceptionDateTimes;
    }

    public String getRecurrenceDateTimes() {
        return recurrenceDateTimes;
    }

    public void setRecurrenceDateTimes(String recurrenceDateTimes) {
        this.recurrenceDateTimes = recurrenceDateTimes;
    }

    public BigInteger getRecurrenceCount() {
        return recurrenceCount;
    }

    public void setRecurrenceCount(BigInteger recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
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

    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<WorkEffort> getWorkEffortList() {
        return workEffortList;
    }

    public void setWorkEffortList(List<WorkEffort> workEffortList) {
        this.workEffortList = workEffortList;
    }

    public List<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(List<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public RecurrenceRule getRecurrenceRuleId() {
        return recurrenceRuleId;
    }

    public void setRecurrenceRuleId(RecurrenceRule recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }

    public RecurrenceRule getExceptionRuleId() {
        return exceptionRuleId;
    }

    public void setExceptionRuleId(RecurrenceRule exceptionRuleId) {
        this.exceptionRuleId = exceptionRuleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recurrenceInfoId != null ? recurrenceInfoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecurrenceInfo)) {
            return false;
        }
        RecurrenceInfo other = (RecurrenceInfo) object;
        if ((this.recurrenceInfoId == null && other.recurrenceInfoId != null) || (this.recurrenceInfoId != null && !this.recurrenceInfoId.equals(other.recurrenceInfoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RecurrenceInfo[ recurrenceInfoId=" + recurrenceInfoId + " ]";
    }

    public List<JobSandbox> getJobSandboxList() {
        return jobSandboxList;
    }

    public void setJobSandboxList(List<JobSandbox> jobSandboxList) {
        this.jobSandboxList = jobSandboxList;
    }

    public List<InvoiceRecurrence> getInvoiceRecurrenceList() {
        return invoiceRecurrenceList;
    }

    public void setInvoiceRecurrenceList(List<InvoiceRecurrence> invoiceRecurrenceList) {
        this.invoiceRecurrenceList = invoiceRecurrenceList;
    }

    public List<ProductAssoc> getProductAssocList() {
        return productAssocList;
    }

    public void setProductAssocList(List<ProductAssoc> productAssocList) {
        this.productAssocList = productAssocList;
    }
    
}
