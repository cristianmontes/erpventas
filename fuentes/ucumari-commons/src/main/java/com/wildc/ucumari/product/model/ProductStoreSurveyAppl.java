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

import com.wildc.ucumari.client.modelo.Survey;
import com.wildc.ucumari.client.modelo.SurveyApplType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "product_store_survey_appl")
@NamedQueries({
    @NamedQuery(name = "ProductStoreSurveyAppl.findAll", query = "SELECT p FROM ProductStoreSurveyAppl p")})
public class ProductStoreSurveyAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODUCT_STORE_SURVEY_ID")
    private String productStoreSurveyId;
    @Column(name = "GROUP_NAME")
    private String groupName;
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Column(name = "PRODUCT_CATEGORY_ID")
    private String productCategoryId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SURVEY_TEMPLATE")
    private String surveyTemplate;
    @Column(name = "RESULT_TEMPLATE")
    private String resultTemplate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID")
    @ManyToOne
    private Survey surveyId;
    @JoinColumn(name = "SURVEY_APPL_TYPE_ID", referencedColumnName = "SURVEY_APPL_TYPE_ID")
    @ManyToOne
    private SurveyApplType surveyApplTypeId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;

    public ProductStoreSurveyAppl() {
    }

    public ProductStoreSurveyAppl(String productStoreSurveyId) {
        this.productStoreSurveyId = productStoreSurveyId;
    }

    public String getProductStoreSurveyId() {
        return productStoreSurveyId;
    }

    public void setProductStoreSurveyId(String productStoreSurveyId) {
        this.productStoreSurveyId = productStoreSurveyId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getSurveyTemplate() {
        return surveyTemplate;
    }

    public void setSurveyTemplate(String surveyTemplate) {
        this.surveyTemplate = surveyTemplate;
    }

    public String getResultTemplate() {
        return resultTemplate;
    }

    public void setResultTemplate(String resultTemplate) {
        this.resultTemplate = resultTemplate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public Survey getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Survey surveyId) {
        this.surveyId = surveyId;
    }

    public SurveyApplType getSurveyApplTypeId() {
        return surveyApplTypeId;
    }

    public void setSurveyApplTypeId(SurveyApplType surveyApplTypeId) {
        this.surveyApplTypeId = surveyApplTypeId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productStoreSurveyId != null ? productStoreSurveyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductStoreSurveyAppl)) {
            return false;
        }
        ProductStoreSurveyAppl other = (ProductStoreSurveyAppl) object;
        if ((this.productStoreSurveyId == null && other.productStoreSurveyId != null) || (this.productStoreSurveyId != null && !this.productStoreSurveyId.equals(other.productStoreSurveyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductStoreSurveyAppl[ productStoreSurveyId=" + productStoreSurveyId + " ]";
    }
    
}
