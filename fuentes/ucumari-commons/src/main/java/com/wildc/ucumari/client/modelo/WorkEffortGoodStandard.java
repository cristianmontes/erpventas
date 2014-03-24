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

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_good_standard")
@NamedQueries({
    @NamedQuery(name = "WorkEffortGoodStandard.findAll", query = "SELECT w FROM WorkEffortGoodStandard w")})
public class WorkEffortGoodStandard implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortGoodStandardPK workEffortGoodStandardPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_QUANTITY")
    private BigDecimal estimatedQuantity;
    @Column(name = "ESTIMATED_COST")
    private BigDecimal estimatedCost;
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
    @Column(name = "MIN_QUANTITY")
    private BigDecimal minQuantity;
    @Column(name = "MAX_QUANTITY")
    private BigDecimal maxQuantity;
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "WORK_EFFORT_GOOD_STD_TYPE_ID", referencedColumnName = "WORK_EFFORT_GOOD_STD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffortGoodStandardType workEffortGoodStandardType;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public WorkEffortGoodStandard() {
    }

    public WorkEffortGoodStandard(WorkEffortGoodStandardPK workEffortGoodStandardPK) {
        this.workEffortGoodStandardPK = workEffortGoodStandardPK;
    }

    public WorkEffortGoodStandard(String workEffortId, String productId, String workEffortGoodStdTypeId, Date fromDate) {
        this.workEffortGoodStandardPK = new WorkEffortGoodStandardPK(workEffortId, productId, workEffortGoodStdTypeId, fromDate);
    }

    public WorkEffortGoodStandardPK getWorkEffortGoodStandardPK() {
        return workEffortGoodStandardPK;
    }

    public void setWorkEffortGoodStandardPK(WorkEffortGoodStandardPK workEffortGoodStandardPK) {
        this.workEffortGoodStandardPK = workEffortGoodStandardPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getEstimatedQuantity() {
        return estimatedQuantity;
    }

    public void setEstimatedQuantity(BigDecimal estimatedQuantity) {
        this.estimatedQuantity = estimatedQuantity;
    }

    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
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

    public BigDecimal getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(BigDecimal minQuantity) {
        this.minQuantity = minQuantity;
    }

    public BigDecimal getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(BigDecimal maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public WorkEffortGoodStandardType getWorkEffortGoodStandardType() {
        return workEffortGoodStandardType;
    }

    public void setWorkEffortGoodStandardType(WorkEffortGoodStandardType workEffortGoodStandardType) {
        this.workEffortGoodStandardType = workEffortGoodStandardType;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortGoodStandardPK != null ? workEffortGoodStandardPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortGoodStandard)) {
            return false;
        }
        WorkEffortGoodStandard other = (WorkEffortGoodStandard) object;
        if ((this.workEffortGoodStandardPK == null && other.workEffortGoodStandardPK != null) || (this.workEffortGoodStandardPK != null && !this.workEffortGoodStandardPK.equals(other.workEffortGoodStandardPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortGoodStandard[ workEffortGoodStandardPK=" + workEffortGoodStandardPK + " ]";
    }
    
}
