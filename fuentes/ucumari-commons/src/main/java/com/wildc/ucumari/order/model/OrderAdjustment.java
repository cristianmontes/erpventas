/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.product.model.ProductPromo;
import com.wildc.ucumari.security.model.UserLogin;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "order_adjustment")
public class OrderAdjustment implements Serializable {
    /*@OneToMany(mappedBy = "orderAdjustmentId")
    private List<ReturnAdjustment> returnAdjustmentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ADJUSTMENT_ID")
    private String orderAdjustmentId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "RECURRING_AMOUNT")
    private BigDecimal recurringAmount;
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
    @Column(name = "ORIGINAL_ADJUSTMENT_ID")
    private String originalAdjustmentId;
    @Column(name = "AMOUNT_PER_QUANTITY")
    private BigDecimal amountPerQuantity;
    @Column(name = "PERCENTAGE")
    private BigDecimal percentage;
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
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderAdjustment")
    private List<OrderAdjustmentAttribute> orderAdjustmentAttributeList;*/
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @JoinColumn(name = "ORDER_ADJUSTMENT_TYPE_ID", referencedColumnName = "ORDER_ADJUSTMENT_TYPE_ID")
    @ManyToOne
    private OrderAdjustmentType orderAdjustmentTypeId;
    /*@JoinColumns({
        @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID"),
        @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID")})
    @ManyToOne
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "TAX_AUTHORITY_RATE_SEQ_ID", referencedColumnName = "TAX_AUTHORITY_RATE_SEQ_ID")
    @ManyToOne
    private TaxAuthorityRateProduct taxAuthorityRateSeqId;*/
    @JoinColumn(name = "SECONDARY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo secondaryGeoId;
    @JoinColumn(name = "PRODUCT_PROMO_ID", referencedColumnName = "PRODUCT_PROMO_ID")
    @ManyToOne
    private ProductPromo productPromoId;
    @JoinColumn(name = "PRIMARY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo primaryGeoId;
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader orderId;
    /*@JoinColumn(name = "OVERRIDE_GL_ACCOUNT_ID", referencedColumnName = "GL_ACCOUNT_ID")
    @ManyToOne
    private GlAccount overrideGlAccountId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderAdjustment")
    private List<OrderAdjustmentBilling> orderAdjustmentBillingList;
*/
    public OrderAdjustment() {
    }

    public OrderAdjustment(String orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }

    public String getOrderAdjustmentId() {
        return orderAdjustmentId;
    }

    public void setOrderAdjustmentId(String orderAdjustmentId) {
        this.orderAdjustmentId = orderAdjustmentId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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

    public BigDecimal getRecurringAmount() {
        return recurringAmount;
    }

    public void setRecurringAmount(BigDecimal recurringAmount) {
        this.recurringAmount = recurringAmount;
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

    public String getOriginalAdjustmentId() {
        return originalAdjustmentId;
    }

    public void setOriginalAdjustmentId(String originalAdjustmentId) {
        this.originalAdjustmentId = originalAdjustmentId;
    }

    public BigDecimal getAmountPerQuantity() {
        return amountPerQuantity;
    }

    public void setAmountPerQuantity(BigDecimal amountPerQuantity) {
        this.amountPerQuantity = amountPerQuantity;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
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
    public List<OrderAdjustmentAttribute> getOrderAdjustmentAttributeList() {
        return orderAdjustmentAttributeList;
    }

    public void setOrderAdjustmentAttributeList(List<OrderAdjustmentAttribute> orderAdjustmentAttributeList) {
        this.orderAdjustmentAttributeList = orderAdjustmentAttributeList;
    }*/

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public OrderAdjustmentType getOrderAdjustmentTypeId() {
        return orderAdjustmentTypeId;
    }

    public void setOrderAdjustmentTypeId(OrderAdjustmentType orderAdjustmentTypeId) {
        this.orderAdjustmentTypeId = orderAdjustmentTypeId;
    }
/*
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
    }*/

    public Geo getSecondaryGeoId() {
        return secondaryGeoId;
    }

    public void setSecondaryGeoId(Geo secondaryGeoId) {
        this.secondaryGeoId = secondaryGeoId;
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

    public OrderHeader getOrderId() {
        return orderId;
    }

    public void setOrderId(OrderHeader orderId) {
        this.orderId = orderId;
    }
/*
    public GlAccount getOverrideGlAccountId() {
        return overrideGlAccountId;
    }

    public void setOverrideGlAccountId(GlAccount overrideGlAccountId) {
        this.overrideGlAccountId = overrideGlAccountId;
    }

    public List<OrderAdjustmentBilling> getOrderAdjustmentBillingList() {
        return orderAdjustmentBillingList;
    }

    public void setOrderAdjustmentBillingList(List<OrderAdjustmentBilling> orderAdjustmentBillingList) {
        this.orderAdjustmentBillingList = orderAdjustmentBillingList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderAdjustmentId != null ? orderAdjustmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderAdjustment)) {
            return false;
        }
        OrderAdjustment other = (OrderAdjustment) object;
        if ((this.orderAdjustmentId == null && other.orderAdjustmentId != null) || (this.orderAdjustmentId != null && !this.orderAdjustmentId.equals(other.orderAdjustmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.OrderAdjustment[ orderAdjustmentId=" + orderAdjustmentId + " ]";
    }
/*
    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }*/
    
}
