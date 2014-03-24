/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_search_constraint")
@NamedQueries({
    @NamedQuery(name = "ProductSearchConstraint.findAll", query = "SELECT p FROM ProductSearchConstraint p")})
public class ProductSearchConstraint implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductSearchConstraintPK productSearchConstraintPK;
    @Column(name = "CONSTRAINT_NAME")
    private String constraintName;
    @Column(name = "INFO_STRING")
    private String infoString;
    @Column(name = "INCLUDE_SUB_CATEGORIES")
    private Character includeSubCategories;
    @Column(name = "IS_AND")
    private Character isAnd;
    @Column(name = "ANY_PREFIX")
    private Character anyPrefix;
    @Column(name = "ANY_SUFFIX")
    private Character anySuffix;
    @Column(name = "REMOVE_STEMS")
    private Character removeStems;
    @Column(name = "LOW_VALUE")
    private String lowValue;
    @Column(name = "HIGH_VALUE")
    private String highValue;
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
    @JoinColumn(name = "PRODUCT_SEARCH_RESULT_ID", referencedColumnName = "PRODUCT_SEARCH_RESULT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductSearchResult productSearchResult;

    public ProductSearchConstraint() {
    }

    public ProductSearchConstraint(ProductSearchConstraintPK productSearchConstraintPK) {
        this.productSearchConstraintPK = productSearchConstraintPK;
    }

    public ProductSearchConstraint(String productSearchResultId, String constraintSeqId) {
        this.productSearchConstraintPK = new ProductSearchConstraintPK(productSearchResultId, constraintSeqId);
    }

    public ProductSearchConstraintPK getProductSearchConstraintPK() {
        return productSearchConstraintPK;
    }

    public void setProductSearchConstraintPK(ProductSearchConstraintPK productSearchConstraintPK) {
        this.productSearchConstraintPK = productSearchConstraintPK;
    }

    public String getConstraintName() {
        return constraintName;
    }

    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }

    public String getInfoString() {
        return infoString;
    }

    public void setInfoString(String infoString) {
        this.infoString = infoString;
    }

    public Character getIncludeSubCategories() {
        return includeSubCategories;
    }

    public void setIncludeSubCategories(Character includeSubCategories) {
        this.includeSubCategories = includeSubCategories;
    }

    public Character getIsAnd() {
        return isAnd;
    }

    public void setIsAnd(Character isAnd) {
        this.isAnd = isAnd;
    }

    public Character getAnyPrefix() {
        return anyPrefix;
    }

    public void setAnyPrefix(Character anyPrefix) {
        this.anyPrefix = anyPrefix;
    }

    public Character getAnySuffix() {
        return anySuffix;
    }

    public void setAnySuffix(Character anySuffix) {
        this.anySuffix = anySuffix;
    }

    public Character getRemoveStems() {
        return removeStems;
    }

    public void setRemoveStems(Character removeStems) {
        this.removeStems = removeStems;
    }

    public String getLowValue() {
        return lowValue;
    }

    public void setLowValue(String lowValue) {
        this.lowValue = lowValue;
    }

    public String getHighValue() {
        return highValue;
    }

    public void setHighValue(String highValue) {
        this.highValue = highValue;
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

    public ProductSearchResult getProductSearchResult() {
        return productSearchResult;
    }

    public void setProductSearchResult(ProductSearchResult productSearchResult) {
        this.productSearchResult = productSearchResult;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productSearchConstraintPK != null ? productSearchConstraintPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductSearchConstraint)) {
            return false;
        }
        ProductSearchConstraint other = (ProductSearchConstraint) object;
        if ((this.productSearchConstraintPK == null && other.productSearchConstraintPK != null) || (this.productSearchConstraintPK != null && !this.productSearchConstraintPK.equals(other.productSearchConstraintPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductSearchConstraint[ productSearchConstraintPK=" + productSearchConstraintPK + " ]";
    }
    
}
