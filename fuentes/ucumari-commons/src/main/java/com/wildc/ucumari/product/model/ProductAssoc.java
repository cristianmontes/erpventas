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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_assoc")

public class ProductAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductAssocPK productAssocPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "REASON")
    private String reason;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "SCRAP_FACTOR")
    private BigDecimal scrapFactor;
    @Column(name = "INSTRUCTION")
    private String instruction;
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
    @JoinColumn(name = "PRODUCT_ASSOC_TYPE_ID", referencedColumnName = "PRODUCT_ASSOC_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductAssocType productAssocType;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PRODUCT_ID_TO", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product1;
    /*
    @JoinColumn(name = "ROUTING_WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort routingWorkEffortId;
    @JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID")
    @ManyToOne
    private RecurrenceInfo recurrenceInfoId;    
    @JoinColumn(name = "ESTIMATE_CALC_METHOD", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod estimateCalcMethod;    
    @JoinColumn(name = "SPEC_ROU_WEFF_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort specRouWeffId;*/

    public ProductAssoc() {
    }

    public ProductAssoc(ProductAssocPK productAssocPK) {
        this.productAssocPK = productAssocPK;
    }

    public ProductAssoc(String productId, String productIdTo, String productAssocTypeId, Date fromDate) {
        this.productAssocPK = new ProductAssocPK(productId, productIdTo, productAssocTypeId, fromDate);
    }

    public ProductAssocPK getProductAssocPK() {
        return productAssocPK;
    }

    public void setProductAssocPK(ProductAssocPK productAssocPK) {
        this.productAssocPK = productAssocPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getScrapFactor() {
        return scrapFactor;
    }

    public void setScrapFactor(BigDecimal scrapFactor) {
        this.scrapFactor = scrapFactor;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
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

    public ProductAssocType getProductAssocType() {
        return productAssocType;
    }

    public void setProductAssocType(ProductAssocType productAssocType) {
        this.productAssocType = productAssocType;
    }
/*
    public WorkEffort getRoutingWorkEffortId() {
        return routingWorkEffortId;
    }

    public void setRoutingWorkEffortId(WorkEffort routingWorkEffortId) {
        this.routingWorkEffortId = routingWorkEffortId;
    }

    public RecurrenceInfo getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(RecurrenceInfo recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }*/

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct1() {
        return product1;
    }

    public void setProduct1(Product product1) {
        this.product1 = product1;
    }
/*
    public CustomMethod getEstimateCalcMethod() {
        return estimateCalcMethod;
    }

    public void setEstimateCalcMethod(CustomMethod estimateCalcMethod) {
        this.estimateCalcMethod = estimateCalcMethod;
    }

    public WorkEffort getSpecRouWeffId() {
        return specRouWeffId;
    }

    public void setSpecRouWeffId(WorkEffort specRouWeffId) {
        this.specRouWeffId = specRouWeffId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productAssocPK != null ? productAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductAssoc)) {
            return false;
        }
        ProductAssoc other = (ProductAssoc) object;
        if ((this.productAssocPK == null && other.productAssocPK != null) || (this.productAssocPK != null && !this.productAssocPK.equals(other.productAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductAssoc[ productAssocPK=" + productAssocPK + " ]";
    }
    
}
