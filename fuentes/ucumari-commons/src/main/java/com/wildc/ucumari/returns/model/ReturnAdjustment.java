/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import com.wildc.ucumari.accounting.model.GlAccount;
import com.wildc.ucumari.order.model.OrderAdjustment;
import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.product.model.ProductPromo;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.tax.model.TaxAuthority;
import com.wildc.ucumari.tax.model.TaxAuthorityRateProduct;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "return_adjustment")
@NamedQueries({
    @NamedQuery(name = "ReturnAdjustment.findAll", query = "SELECT r FROM ReturnAdjustment r")})
public class ReturnAdjustment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_ADJUSTMENT_ID")
    private String returnAdjustmentId;
    @Column(name = "RETURN_ITEM_SEQ_ID")
    private String returnItemSeqId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "PRODUCT_PROMO_RULE_ID")
    private String productPromoRuleId;
    @Column(name = "PRODUCT_PROMO_ACTION_SEQ_ID")
    private String productPromoActionSeqId;
    @Column(name = "PRODUCT_FEATURE_ID")
    private String productFeatureId;
    @Column(name = "CORRESPONDING_PRODUCT_ID")
    private String correspondingProductId;
    @Column(name = "SOURCE_REFERENCE_ID")
    private String sourceReferenceId;
    @Column(name = "SOURCE_PERCENTAGE")
    private BigDecimal sourcePercentage;
    @Column(name = "CUSTOMER_REFERENCE_ID")
    private String customerReferenceId;
    @Column(name = "EXEMPT_AMOUNT")
    private BigDecimal exemptAmount;
    @Column(name = "INCLUDE_IN_TAX")
    private Character includeInTax;
    @Column(name = "INCLUDE_IN_SHIPPING")
    private Character includeInShipping;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
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
    @JoinColumn(name = "RETURN_TYPE_ID", referencedColumnName = "RETURN_TYPE_ID")
    @ManyToOne
    private ReturnType returnTypeId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @JoinColumn(name = "RETURN_ADJUSTMENT_TYPE_ID", referencedColumnName = "RETURN_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private ReturnAdjustmentType returnAdjustmentTypeId;
    @JoinColumns({
        @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID"),
        @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID")})
    @ManyToOne
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "TAX_AUTHORITY_RATE_SEQ_ID", referencedColumnName = "TAX_AUTHORITY_RATE_SEQ_ID")
    @ManyToOne
    private TaxAuthorityRateProduct taxAuthorityRateSeqId;
    @JoinColumn(name = "SECONDARY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo secondaryGeoId;
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID")
    @ManyToOne
    private ReturnHeader returnId;
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID")
    @ManyToOne
    private ProductPromo productPromoId;
    @JoinColumn(name = "PRIMARY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo primaryGeoId;
    @JoinColumn(name = "ORDER_ADJUSTMENT_ID", referencedColumnName = "ORDER_ADJUSTMENT_ID")
    @ManyToOne
    private OrderAdjustment orderAdjustmentId;
    @JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;

    public ReturnAdjustment() {
    }

    public ReturnAdjustment(String returnAdjustmentId) {
        this.returnAdjustmentId = returnAdjustmentId;
    }

    public String getReturnAdjustmentId() {
        return returnAdjustmentId;
    }

    public void setReturnAdjustmentId(String returnAdjustmentId) {
        this.returnAdjustmentId = returnAdjustmentId;
    }

    public String getReturnItemSeqId() {
        return returnItemSeqId;
    }

    public void setReturnItemSeqId(String returnItemSeqId) {
        this.returnItemSeqId = returnItemSeqId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getProductPromoRuleId() {
        return productPromoRuleId;
    }

    public void setProductPromoRuleId(String productPromoRuleId) {
        this.productPromoRuleId = productPromoRuleId;
    }

    public String getProductPromoActionSeqId() {
        return productPromoActionSeqId;
    }

    public void setProductPromoActionSeqId(String productPromoActionSeqId) {
        this.productPromoActionSeqId = productPromoActionSeqId;
    }

    public String getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public String getCorrespondingProductId() {
        return correspondingProductId;
    }

    public void setCorrespondingProductId(String correspondingProductId) {
        this.correspondingProductId = correspondingProductId;
    }

    public String getSourceReferenceId() {
        return sourceReferenceId;
    }

    public void setSourceReferenceId(String sourceReferenceId) {
        this.sourceReferenceId = sourceReferenceId;
    }

    public BigDecimal getSourcePercentage() {
        return sourcePercentage;
    }

    public void setSourcePercentage(BigDecimal sourcePercentage) {
        this.sourcePercentage = sourcePercentage;
    }

    public String getCustomerReferenceId() {
        return customerReferenceId;
    }

    public void setCustomerReferenceId(String customerReferenceId) {
        this.customerReferenceId = customerReferenceId;
    }

    public BigDecimal getExemptAmount() {
        return exemptAmount;
    }

    public void setExemptAmount(BigDecimal exemptAmount) {
        this.exemptAmount = exemptAmount;
    }

    public Character getIncludeInTax() {
        return includeInTax;
    }

    public void setIncludeInTax(Character includeInTax) {
        this.includeInTax = includeInTax;
    }

    public Character getIncludeInShipping() {
        return includeInShipping;
    }

    public void setIncludeInShipping(Character includeInShipping) {
        this.includeInShipping = includeInShipping;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
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

    public ReturnType getReturnTypeId() {
        return returnTypeId;
    }

    public void setReturnTypeId(ReturnType returnTypeId) {
        this.returnTypeId = returnTypeId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public ReturnAdjustmentType getReturnAdjustmentTypeId() {
        return returnAdjustmentTypeId;
    }

    public void setReturnAdjustmentTypeId(ReturnAdjustmentType returnAdjustmentTypeId) {
        this.returnAdjustmentTypeId = returnAdjustmentTypeId;
    }

    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public TaxAuthorityRateProduct getTaxAuthorityRateSeqId() {
        return taxAuthorityRateSeqId;
    }

    public void setTaxAuthorityRateSeqId(TaxAuthorityRateProduct taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }

    public Geo getSecondaryGeoId() {
        return secondaryGeoId;
    }

    public void setSecondaryGeoId(Geo secondaryGeoId) {
        this.secondaryGeoId = secondaryGeoId;
    }

    public ReturnHeader getReturnId() {
        return returnId;
    }

    public void setReturnId(ReturnHeader returnId) {
        this.returnId = returnId;
    }

    public ProductPromo getProductPromoId() {
        return productPromoId;
    }

    public void setProductPromoId(ProductPromo productPromoId) {
        this.productPromoId = productPromoId;
    }

    public Geo getPrimaryGeoId() {
        return primaryGeoId;
    }

    public void setPrimaryGeoId(Geo primaryGeoId) {
        this.primaryGeoId = primaryGeoId;
    }

    public OrderAdjustment getOrderAdjustmentId() {
        return orderAdjustmentId;
    }

    public void setOrderAdjustmentId(OrderAdjustment orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }

    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnAdjustmentId != null ? returnAdjustmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnAdjustment)) {
            return false;
        }
        ReturnAdjustment other = (ReturnAdjustment) object;
        if ((this.returnAdjustmentId == null && other.returnAdjustmentId != null) || (this.returnAdjustmentId != null && !this.returnAdjustmentId.equals(other.returnAdjustmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnAdjustment[ returnAdjustmentId=" + returnAdjustmentId + " ]";
    }
    
}
