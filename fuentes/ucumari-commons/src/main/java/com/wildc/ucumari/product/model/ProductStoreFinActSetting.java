/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

import com.wildc.ucumari.client.modelo.FinAccountType;
import com.wildc.ucumari.client.modelo.Survey;
import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_fin_act_setting")
@NamedQueries({
    @NamedQuery(name = "ProductStoreFinActSetting.findAll", query = "SELECT p FROM ProductStoreFinActSetting p")})
public class ProductStoreFinActSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductStoreFinActSettingPK productStoreFinActSettingPK;
    @Column(name = "REQUIRE_PIN_CODE")
    private Character requirePinCode;
    @Column(name = "VALIDATE_G_C_FIN_ACCT")
    private Character validateGCFinAcct;
    @Column(name = "ACCOUNT_CODE_LENGTH")
    private BigInteger accountCodeLength;
    @Column(name = "PIN_CODE_LENGTH")
    private BigInteger pinCodeLength;
    @Column(name = "ACCOUNT_VALID_DAYS")
    private BigInteger accountValidDays;
    @Column(name = "AUTH_VALID_DAYS")
    private BigInteger authValidDays;
    @Column(name = "PURCH_SURVEY_SEND_TO")
    private String purchSurveySendTo;
    @Column(name = "PURCH_SURVEY_COPY_ME")
    private String purchSurveyCopyMe;
    @Column(name = "ALLOW_AUTH_TO_NEGATIVE")
    private Character allowAuthToNegative;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MIN_BALANCE")
    private BigDecimal minBalance;
    @Column(name = "REPLENISH_THRESHOLD")
    private BigDecimal replenishThreshold;
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
    @JoinColumn(name = "PURCHASE_SURVEY_ID", referencedColumnName = "SURVEY_ID")
    @ManyToOne
    private Survey purchaseSurveyId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductStore productStore;
    @JoinColumn(name = "FIN_ACCOUNT_TYPE_ID", referencedColumnName = "FIN_ACCOUNT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FinAccountType finAccountType;
    @JoinColumn(name = "REPLENISH_METHOD_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration replenishMethodEnumId;

    public ProductStoreFinActSetting() {
    }

    public ProductStoreFinActSetting(ProductStoreFinActSettingPK productStoreFinActSettingPK) {
        this.productStoreFinActSettingPK = productStoreFinActSettingPK;
    }

    public ProductStoreFinActSetting(String productStoreId, String finAccountTypeId) {
        this.productStoreFinActSettingPK = new ProductStoreFinActSettingPK(productStoreId, finAccountTypeId);
    }

    public ProductStoreFinActSettingPK getProductStoreFinActSettingPK() {
        return productStoreFinActSettingPK;
    }

    public void setProductStoreFinActSettingPK(ProductStoreFinActSettingPK productStoreFinActSettingPK) {
        this.productStoreFinActSettingPK = productStoreFinActSettingPK;
    }

    public Character getRequirePinCode() {
        return requirePinCode;
    }

    public void setRequirePinCode(Character requirePinCode) {
        this.requirePinCode = requirePinCode;
    }

    public Character getValidateGCFinAcct() {
        return validateGCFinAcct;
    }

    public void setValidateGCFinAcct(Character validateGCFinAcct) {
        this.validateGCFinAcct = validateGCFinAcct;
    }

    public BigInteger getAccountCodeLength() {
        return accountCodeLength;
    }

    public void setAccountCodeLength(BigInteger accountCodeLength) {
        this.accountCodeLength = accountCodeLength;
    }

    public BigInteger getPinCodeLength() {
        return pinCodeLength;
    }

    public void setPinCodeLength(BigInteger pinCodeLength) {
        this.pinCodeLength = pinCodeLength;
    }

    public BigInteger getAccountValidDays() {
        return accountValidDays;
    }

    public void setAccountValidDays(BigInteger accountValidDays) {
        this.accountValidDays = accountValidDays;
    }

    public BigInteger getAuthValidDays() {
        return authValidDays;
    }

    public void setAuthValidDays(BigInteger authValidDays) {
        this.authValidDays = authValidDays;
    }

    public String getPurchSurveySendTo() {
        return purchSurveySendTo;
    }

    public void setPurchSurveySendTo(String purchSurveySendTo) {
        this.purchSurveySendTo = purchSurveySendTo;
    }

    public String getPurchSurveyCopyMe() {
        return purchSurveyCopyMe;
    }

    public void setPurchSurveyCopyMe(String purchSurveyCopyMe) {
        this.purchSurveyCopyMe = purchSurveyCopyMe;
    }

    public Character getAllowAuthToNegative() {
        return allowAuthToNegative;
    }

    public void setAllowAuthToNegative(Character allowAuthToNegative) {
        this.allowAuthToNegative = allowAuthToNegative;
    }

    public BigDecimal getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(BigDecimal minBalance) {
        this.minBalance = minBalance;
    }

    public BigDecimal getReplenishThreshold() {
        return replenishThreshold;
    }

    public void setReplenishThreshold(BigDecimal replenishThreshold) {
        this.replenishThreshold = replenishThreshold;
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

    public Survey getPurchaseSurveyId() {
        return purchaseSurveyId;
    }

    public void setPurchaseSurveyId(Survey purchaseSurveyId) {
        this.purchaseSurveyId = purchaseSurveyId;
    }

    public ProductStore getProductStore() {
        return productStore;
    }

    public void setProductStore(ProductStore productStore) {
        this.productStore = productStore;
    }

    public FinAccountType getFinAccountType() {
        return finAccountType;
    }

    public void setFinAccountType(FinAccountType finAccountType) {
        this.finAccountType = finAccountType;
    }

    public Enumeration getReplenishMethodEnumId() {
        return replenishMethodEnumId;
    }

    public void setReplenishMethodEnumId(Enumeration replenishMethodEnumId) {
        this.replenishMethodEnumId = replenishMethodEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreFinActSettingPK != null ? productStoreFinActSettingPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreFinActSetting)) {
            return false;
        }
        ProductStoreFinActSetting other = (ProductStoreFinActSetting) object;
        if ((this.productStoreFinActSettingPK == null && other.productStoreFinActSettingPK != null) || (this.productStoreFinActSettingPK != null && !this.productStoreFinActSettingPK.equals(other.productStoreFinActSettingPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreFinActSetting[ productStoreFinActSettingPK=" + productStoreFinActSettingPK + " ]";
    }
    
}
