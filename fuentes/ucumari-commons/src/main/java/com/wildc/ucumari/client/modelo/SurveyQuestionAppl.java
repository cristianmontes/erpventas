/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "survey_question_appl")
@NamedQueries({
    @NamedQuery(name = "SurveyQuestionAppl.findAll", query = "SELECT s FROM SurveyQuestionAppl s")})
public class SurveyQuestionAppl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyQuestionApplPK surveyQuestionApplPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SURVEY_PAGE_SEQ_ID")
    private String surveyPageSeqId;
    @Column(name = "SURVEY_MULTI_RESP_ID")
    private String surveyMultiRespId;
    @Column(name = "SURVEY_MULTI_RESP_COL_ID")
    private String surveyMultiRespColId;
    @Column(name = "REQUIRED_FIELD")
    private Character requiredField;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "EXTERNAL_FIELD_REF")
    private String externalFieldRef;
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
    @JoinColumns({
        @JoinColumn(name = "WITH_SURVEY_QUESTION_ID", referencedColumnName = "SURVEY_QUESTION_ID"),
        @JoinColumn(name = "WITH_SURVEY_OPTION_SEQ_ID", referencedColumnName = "SURVEY_OPTION_SEQ_ID")})
    @ManyToOne
    private SurveyQuestionOption surveyQuestionOption;
    @JoinColumn(name = "SURVEY_QUESTION_ID", referencedColumnName = "SURVEY_QUESTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyQuestion surveyQuestion;
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Survey survey;

    public SurveyQuestionAppl() {
    }

    public SurveyQuestionAppl(SurveyQuestionApplPK surveyQuestionApplPK) {
        this.surveyQuestionApplPK = surveyQuestionApplPK;
    }

    public SurveyQuestionAppl(String surveyId, String surveyQuestionId, Date fromDate) {
        this.surveyQuestionApplPK = new SurveyQuestionApplPK(surveyId, surveyQuestionId, fromDate);
    }

    public SurveyQuestionApplPK getSurveyQuestionApplPK() {
        return surveyQuestionApplPK;
    }

    public void setSurveyQuestionApplPK(SurveyQuestionApplPK surveyQuestionApplPK) {
        this.surveyQuestionApplPK = surveyQuestionApplPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getSurveyPageSeqId() {
        return surveyPageSeqId;
    }

    public void setSurveyPageSeqId(String surveyPageSeqId) {
        this.surveyPageSeqId = surveyPageSeqId;
    }

    public String getSurveyMultiRespId() {
        return surveyMultiRespId;
    }

    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }

    public String getSurveyMultiRespColId() {
        return surveyMultiRespColId;
    }

    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    public Character getRequiredField() {
        return requiredField;
    }

    public void setRequiredField(Character requiredField) {
        this.requiredField = requiredField;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getExternalFieldRef() {
        return externalFieldRef;
    }

    public void setExternalFieldRef(String externalFieldRef) {
        this.externalFieldRef = externalFieldRef;
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

    public SurveyQuestionOption getSurveyQuestionOption() {
        return surveyQuestionOption;
    }

    public void setSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        this.surveyQuestionOption = surveyQuestionOption;
    }

    public SurveyQuestion getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyQuestionApplPK != null ? surveyQuestionApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestionAppl)) {
            return false;
        }
        SurveyQuestionAppl other = (SurveyQuestionAppl) object;
        if ((this.surveyQuestionApplPK == null && other.surveyQuestionApplPK != null) || (this.surveyQuestionApplPK != null && !this.surveyQuestionApplPK.equals(other.surveyQuestionApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestionAppl[ surveyQuestionApplPK=" + surveyQuestionApplPK + " ]";
    }
    
}
