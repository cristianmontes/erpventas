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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "data_import_order_payment")
@NamedQueries({
    @NamedQuery(name = "DataImportOrderPayment.findAll", query = "SELECT d FROM DataImportOrderPayment d")})
public class DataImportOrderPayment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DataImportOrderPaymentPK dataImportOrderPaymentPK;
    @Column(name = "PAYMENT_METHOD_TYPE_ID")
    private String paymentMethodTypeId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MAX_AMOUNT")
    private BigDecimal maxAmount;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "PAYMENT_TYPE_ID")
    private String paymentTypeId;
    @Column(name = "EFFECTIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    @Column(name = "PAYMENT_REF_NUM")
    private String paymentRefNum;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
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

    public DataImportOrderPayment() {
    }

    public DataImportOrderPayment(DataImportOrderPaymentPK dataImportOrderPaymentPK) {
        this.dataImportOrderPaymentPK = dataImportOrderPaymentPK;
    }

    public DataImportOrderPayment(String orderPaymentPreferenceId, String orderId) {
        this.dataImportOrderPaymentPK = new DataImportOrderPaymentPK(orderPaymentPreferenceId, orderId);
    }

    public DataImportOrderPaymentPK getDataImportOrderPaymentPK() {
        return dataImportOrderPaymentPK;
    }

    public void setDataImportOrderPaymentPK(DataImportOrderPaymentPK dataImportOrderPaymentPK) {
        this.dataImportOrderPaymentPK = dataImportOrderPaymentPK;
    }

    public String getPaymentMethodTypeId() {
        return paymentMethodTypeId;
    }

    public void setPaymentMethodTypeId(String paymentMethodTypeId) {
        this.paymentMethodTypeId = paymentMethodTypeId;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getPaymentRefNum() {
        return paymentRefNum;
    }

    public void setPaymentRefNum(String paymentRefNum) {
        this.paymentRefNum = paymentRefNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataImportOrderPaymentPK != null ? dataImportOrderPaymentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportOrderPayment)) {
            return false;
        }
        DataImportOrderPayment other = (DataImportOrderPayment) object;
        if ((this.dataImportOrderPaymentPK == null && other.dataImportOrderPaymentPK != null) || (this.dataImportOrderPaymentPK != null && !this.dataImportOrderPaymentPK.equals(other.dataImportOrderPaymentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportOrderPayment[ dataImportOrderPaymentPK=" + dataImportOrderPaymentPK + " ]";
    }
    
}
