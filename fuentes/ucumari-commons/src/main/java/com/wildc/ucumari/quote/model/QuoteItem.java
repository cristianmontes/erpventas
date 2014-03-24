/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.quote.model;

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

import com.wildc.ucumari.custrequest.model.CustRequest;
import com.wildc.ucumari.custrequest.model.CustRequestItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.SkillType;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductFeature;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quote_item")
public class QuoteItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "quoteItem")
    private List<QuoteItemOption> quoteItemOptionList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected QuoteItemPK quoteItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "SELECTED_AMOUNT")
    private BigDecimal selectedAmount;
    @Column(name = "QUOTE_UNIT_PRICE")
    private BigDecimal quoteUnitPrice;
    @Column(name = "RESERV_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservStart;
    @Column(name = "RESERV_LENGTH")
    private BigDecimal reservLength;
    @Column(name = "RESERV_PERSONS")
    private BigDecimal reservPersons;
    @Column(name = "CONFIG_ID")
    private String configId;
    @Column(name = "ESTIMATED_DELIVERY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedDeliveryDate;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "IS_PROMO")
    private Character isPromo;
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
    @Column(name = "DESCRIPTION")
    private String description;
    /*@JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortId;*/
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom uomId;
    @JoinColumn(name = "SKILL_TYPE_ID", referencedColumnName = "SKILL_TYPE_ID")
    @ManyToOne
    private SkillType skillTypeId;
    @JoinColumn(name = "QUOTE_ID", referencedColumnName = "QUOTE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Quote quote;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID")
    @ManyToOne
    private ProductFeature productFeatureId;
    /*@JoinColumn(name = "DELIVERABLE_TYPE_ID", referencedColumnName = "DELIVERABLE_TYPE_ID")
    @ManyToOne
    private DeliverableType deliverableTypeId;*/
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne
    private CustRequest custRequestId;
    @JoinColumns({
        @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID"),
        @JoinColumn(name = "CUST_REQUEST_ITEM_SEQ_ID", referencedColumnName = "CUST_REQUEST_ITEM_SEQ_ID")})
    @ManyToOne
    private CustRequestItem custRequestItem;
    /*@OneToMany(mappedBy = "quoteItem")
    private List<OrderItem> orderItemList;*/

    public QuoteItem() {
    }

    public QuoteItem(QuoteItemPK quoteItemPK) {
        this.quoteItemPK = quoteItemPK;
    }

    public QuoteItem(String quoteId, String quoteItemSeqId) {
        this.quoteItemPK = new QuoteItemPK(quoteId, quoteItemSeqId);
    }

    public QuoteItemPK getQuoteItemPK() {
        return quoteItemPK;
    }

    public void setQuoteItemPK(QuoteItemPK quoteItemPK) {
        this.quoteItemPK = quoteItemPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSelectedAmount() {
        return selectedAmount;
    }

    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }

    public BigDecimal getQuoteUnitPrice() {
        return quoteUnitPrice;
    }

    public void setQuoteUnitPrice(BigDecimal quoteUnitPrice) {
        this.quoteUnitPrice = quoteUnitPrice;
    }

    public Date getReservStart() {
        return reservStart;
    }

    public void setReservStart(Date reservStart) {
        this.reservStart = reservStart;
    }

    public BigDecimal getReservLength() {
        return reservLength;
    }

    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getIsPromo() {
        return isPromo;
    }

    public void setIsPromo(Character isPromo) {
        this.isPromo = isPromo;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
/*
    public WorkEffort getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(WorkEffort workEffortId) {
        this.workEffortId = workEffortId;
    }*/

    public Uom getUomId() {
        return uomId;
    }

    public void setUomId(Uom uomId) {
        this.uomId = uomId;
    }

    public SkillType getSkillTypeId() {
        return skillTypeId;
    }

    public void setSkillTypeId(SkillType skillTypeId) {
        this.skillTypeId = skillTypeId;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductFeature getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(ProductFeature productFeatureId) {
        this.productFeatureId = productFeatureId;
    }
/*
    public DeliverableType getDeliverableTypeId() {
        return deliverableTypeId;
    }

    public void setDeliverableTypeId(DeliverableType deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
    }*/

    public CustRequest getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(CustRequest custRequestId) {
        this.custRequestId = custRequestId;
    }

    public CustRequestItem getCustRequestItem() {
        return custRequestItem;
    }

    public void setCustRequestItem(CustRequestItem custRequestItem) {
        this.custRequestItem = custRequestItem;
    }
/*
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quoteItemPK != null ? quoteItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuoteItem)) {
            return false;
        }
        QuoteItem other = (QuoteItem) object;
        if ((this.quoteItemPK == null && other.quoteItemPK != null) || (this.quoteItemPK != null && !this.quoteItemPK.equals(other.quoteItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuoteItem[ quoteItemPK=" + quoteItemPK + " ]";
    }
/*
    public List<QuoteItemOption> getQuoteItemOptionList() {
        return quoteItemOptionList;
    }

    public void setQuoteItemOptionList(List<QuoteItemOption> quoteItemOptionList) {
        this.quoteItemOptionList = quoteItemOptionList;
    }*/
    
}
