/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.Visit;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_keyword_result")
@NamedQueries({
    @NamedQuery(name = "ProductKeywordResult.findAll", query = "SELECT p FROM ProductKeywordResult p")})
public class ProductKeywordResult implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_KEYWORD_RESULT_ID")
    private String productKeywordResultId;
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Column(name = "SEARCH_STRING")
    private String searchString;
    @Column(name = "INTRA_KEYWORD_OPERATOR")
    private String intraKeywordOperator;
    @Column(name = "ANY_PREFIX")
    private Character anyPrefix;
    @Column(name = "ANY_SUFFIX")
    private Character anySuffix;
    @Column(name = "REMOVE_STEMS")
    private Character removeStems;
    @Column(name = "NUM_RESULTS")
    private BigInteger numResults;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID")
    @ManyToOne
    private Visit visitId;

    public ProductKeywordResult() {
    }

    public ProductKeywordResult(String productKeywordResultId) {
        this.productKeywordResultId = productKeywordResultId;
    }

    public String getProductKeywordResultId() {
        return productKeywordResultId;
    }

    public void setProductKeywordResultId(String productKeywordResultId) {
        this.productKeywordResultId = productKeywordResultId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getIntraKeywordOperator() {
        return intraKeywordOperator;
    }

    public void setIntraKeywordOperator(String intraKeywordOperator) {
        this.intraKeywordOperator = intraKeywordOperator;
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

    public BigInteger getNumResults() {
        return numResults;
    }

    public void setNumResults(BigInteger numResults) {
        this.numResults = numResults;
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

    public Visit getVisitId() {
        return visitId;
    }

    public void setVisitId(Visit visitId) {
        this.visitId = visitId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productKeywordResultId != null ? productKeywordResultId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductKeywordResult)) {
            return false;
        }
        ProductKeywordResult other = (ProductKeywordResult) object;
        if ((this.productKeywordResultId == null && other.productKeywordResultId != null) || (this.productKeywordResultId != null && !this.productKeywordResultId.equals(other.productKeywordResultId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductKeywordResult[ productKeywordResultId=" + productKeywordResultId + " ]";
    }
    
}
