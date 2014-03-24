/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductStoreFinActSetting;
import com.wildc.ucumari.product.model.ProductStoreSurveyAppl;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "survey")
@NamedQueries({
    @NamedQuery(name = "Survey.findAll", query = "SELECT s FROM Survey s")})
public class Survey implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<SurveyPage> surveyPageList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<SurveyTrigger> surveyTriggerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<SurveyMultiResp> surveyMultiRespList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "survey")
    private List<SurveyQuestionAppl> surveyQuestionApplList;
    @OneToMany(mappedBy = "purchaseSurveyId")
    private List<ProductStoreFinActSetting> productStoreFinActSettingList;
    @OneToMany(mappedBy = "surveyId")
    private List<ProductStoreSurveyAppl> productStoreSurveyApplList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEY_ID")
    private String surveyId;
    @Column(name = "SURVEY_NAME")
    private String surveyName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "SUBMIT_CAPTION")
    private String submitCaption;
    @Column(name = "RESPONSE_SERVICE")
    private String responseService;
    @Column(name = "IS_ANONYMOUS")
    private Character isAnonymous;
    @Column(name = "ALLOW_MULTIPLE")
    private Character allowMultiple;
    @Column(name = "ALLOW_UPDATE")
    private Character allowUpdate;
    @Column(name = "ACRO_FORM_CONTENT_ID")
    private String acroFormContentId;
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
    @OneToMany(mappedBy = "surveyId")
    private List<DataResource> dataResourceList;
    @OneToMany(mappedBy = "surveyId")
    private List<SurveyResponse> surveyResponseList;

    public Survey() {
    }

    public Survey(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyName() {
        return surveyName;
    }

    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSubmitCaption() {
        return submitCaption;
    }

    public void setSubmitCaption(String submitCaption) {
        this.submitCaption = submitCaption;
    }

    public String getResponseService() {
        return responseService;
    }

    public void setResponseService(String responseService) {
        this.responseService = responseService;
    }

    public Character getIsAnonymous() {
        return isAnonymous;
    }

    public void setIsAnonymous(Character isAnonymous) {
        this.isAnonymous = isAnonymous;
    }

    public Character getAllowMultiple() {
        return allowMultiple;
    }

    public void setAllowMultiple(Character allowMultiple) {
        this.allowMultiple = allowMultiple;
    }

    public Character getAllowUpdate() {
        return allowUpdate;
    }

    public void setAllowUpdate(Character allowUpdate) {
        this.allowUpdate = allowUpdate;
    }

    public String getAcroFormContentId() {
        return acroFormContentId;
    }

    public void setAcroFormContentId(String acroFormContentId) {
        this.acroFormContentId = acroFormContentId;
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

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public List<SurveyResponse> getSurveyResponseList() {
        return surveyResponseList;
    }

    public void setSurveyResponseList(List<SurveyResponse> surveyResponseList) {
        this.surveyResponseList = surveyResponseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyId != null ? surveyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Survey)) {
            return false;
        }
        Survey other = (Survey) object;
        if ((this.surveyId == null && other.surveyId != null) || (this.surveyId != null && !this.surveyId.equals(other.surveyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Survey[ surveyId=" + surveyId + " ]";
    }

    public List<ProductStoreFinActSetting> getProductStoreFinActSettingList() {
        return productStoreFinActSettingList;
    }

    public void setProductStoreFinActSettingList(List<ProductStoreFinActSetting> productStoreFinActSettingList) {
        this.productStoreFinActSettingList = productStoreFinActSettingList;
    }

    public List<ProductStoreSurveyAppl> getProductStoreSurveyApplList() {
        return productStoreSurveyApplList;
    }

    public void setProductStoreSurveyApplList(List<ProductStoreSurveyAppl> productStoreSurveyApplList) {
        this.productStoreSurveyApplList = productStoreSurveyApplList;
    }

    public List<SurveyPage> getSurveyPageList() {
        return surveyPageList;
    }

    public void setSurveyPageList(List<SurveyPage> surveyPageList) {
        this.surveyPageList = surveyPageList;
    }

    public List<SurveyTrigger> getSurveyTriggerList() {
        return surveyTriggerList;
    }

    public void setSurveyTriggerList(List<SurveyTrigger> surveyTriggerList) {
        this.surveyTriggerList = surveyTriggerList;
    }

    public List<SurveyMultiResp> getSurveyMultiRespList() {
        return surveyMultiRespList;
    }

    public void setSurveyMultiRespList(List<SurveyMultiResp> surveyMultiRespList) {
        this.surveyMultiRespList = surveyMultiRespList;
    }

    public List<SurveyQuestionAppl> getSurveyQuestionApplList() {
        return surveyQuestionApplList;
    }

    public void setSurveyQuestionApplList(List<SurveyQuestionAppl> surveyQuestionApplList) {
        this.surveyQuestionApplList = surveyQuestionApplList;
    }
    
}
