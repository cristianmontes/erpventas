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

import com.wildc.ucumari.client.modelo.WorkEffort;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_maint")
@NamedQueries({
    @NamedQuery(name = "ProductMaint.findAll", query = "SELECT p FROM ProductMaint p")})
public class ProductMaint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductMaintPK productMaintPK;
    @Column(name = "MAINT_NAME")
    private String maintName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "INTERVAL_QUANTITY")
    private BigDecimal intervalQuantity;
    @Column(name = "REPEAT_COUNT")
    private BigInteger repeatCount;
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
    @JoinColumn(name = "MAINT_TEMPLATE_WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort maintTemplateWorkEffortId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "INTERVAL_METER_TYPE_ID", referencedColumnName = "PRODUCT_METER_TYPE_ID")
    @ManyToOne
    private ProductMeterType intervalMeterTypeId;
    @JoinColumn(name = "PRODUCT_MAINT_TYPE_ID", referencedColumnName = "PRODUCT_MAINT_TYPE_ID")
    @ManyToOne
    private ProductMaintType productMaintTypeId;
    @JoinColumn(name = "INTERVAL_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom intervalUomId;

    public ProductMaint() {
    }

    public ProductMaint(ProductMaintPK productMaintPK) {
        this.productMaintPK = productMaintPK;
    }

    public ProductMaint(String productId, String productMaintSeqId) {
        this.productMaintPK = new ProductMaintPK(productId, productMaintSeqId);
    }

    public ProductMaintPK getProductMaintPK() {
        return productMaintPK;
    }

    public void setProductMaintPK(ProductMaintPK productMaintPK) {
        this.productMaintPK = productMaintPK;
    }

    public String getMaintName() {
        return maintName;
    }

    public void setMaintName(String maintName) {
        this.maintName = maintName;
    }

    public BigDecimal getIntervalQuantity() {
        return intervalQuantity;
    }

    public void setIntervalQuantity(BigDecimal intervalQuantity) {
        this.intervalQuantity = intervalQuantity;
    }

    public BigInteger getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(BigInteger repeatCount) {
        this.repeatCount = repeatCount;
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

    public WorkEffort getMaintTemplateWorkEffortId() {
        return maintTemplateWorkEffortId;
    }

    public void setMaintTemplateWorkEffortId(WorkEffort maintTemplateWorkEffortId) {
        this.maintTemplateWorkEffortId = maintTemplateWorkEffortId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductMeterType getIntervalMeterTypeId() {
        return intervalMeterTypeId;
    }

    public void setIntervalMeterTypeId(ProductMeterType intervalMeterTypeId) {
        this.intervalMeterTypeId = intervalMeterTypeId;
    }

    public ProductMaintType getProductMaintTypeId() {
        return productMaintTypeId;
    }

    public void setProductMaintTypeId(ProductMaintType productMaintTypeId) {
        this.productMaintTypeId = productMaintTypeId;
    }

    public Uom getIntervalUomId() {
        return intervalUomId;
    }

    public void setIntervalUomId(Uom intervalUomId) {
        this.intervalUomId = intervalUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productMaintPK != null ? productMaintPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductMaint)) {
            return false;
        }
        ProductMaint other = (ProductMaint) object;
        if ((this.productMaintPK == null && other.productMaintPK != null) || (this.productMaintPK != null && !this.productMaintPK.equals(other.productMaintPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductMaint[ productMaintPK=" + productMaintPK + " ]";
    }
    
}
