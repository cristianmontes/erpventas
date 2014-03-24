/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
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
@Table(name = "survey_response_answer")
@NamedQueries({
    @NamedQuery(name = "SurveyResponseAnswer.findAll", query = "SELECT s FROM SurveyResponseAnswer s")})
public class SurveyResponseAnswer implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyResponseAnswerPK surveyResponseAnswerPK;
    @Column(name = "SURVEY_MULTI_RESP_ID")
    private String surveyMultiRespId;
    @Column(name = "BOOLEAN_RESPONSE")
    private Character booleanResponse;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CURRENCY_RESPONSE")
    private BigDecimal currencyResponse;
    @Column(name = "FLOAT_RESPONSE")
    private BigDecimal floatResponse;
    @Column(name = "NUMERIC_RESPONSE")
    private BigInteger numericResponse;
    @Lob
    @Column(name = "TEXT_RESPONSE")
    private String textResponse;
    @Column(name = "ANSWERED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date answeredDate;
    @Column(name = "AMOUNT_BASE")
    private BigDecimal amountBase;
    @Column(name = "AMOUNT_BASE_UOM_ID")
    private String amountBaseUomId;
    @Column(name = "WEIGHT_FACTOR")
    private BigDecimal weightFactor;
    @Column(name = "DURATION")
    private BigInteger duration;
    @Column(name = "DURATION_UOM_ID")
    private String durationUomId;
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
    @JoinColumn(name = "SURVEY_RESPONSE_ID", referencedColumnName = "SURVEY_RESPONSE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyResponse surveyResponse;
    @JoinColumn(name = "SURVEY_QUESTION_ID", referencedColumnName = "SURVEY_QUESTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyQuestion surveyQuestion;
    @JoinColumns({
        @JoinColumn(name = "SURVEY_QUESTION_ID", referencedColumnName = "SURVEY_QUESTION_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SURVEY_OPTION_SEQ_ID", referencedColumnName = "SURVEY_OPTION_SEQ_ID")})
    @ManyToOne(optional = false)
    private SurveyQuestionOption surveyQuestionOption;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content contentId;

    public SurveyResponseAnswer() {
    }

    public SurveyResponseAnswer(SurveyResponseAnswerPK surveyResponseAnswerPK) {
        this.surveyResponseAnswerPK = surveyResponseAnswerPK;
    }

    public SurveyResponseAnswer(String surveyResponseId, String surveyQuestionId, String surveyMultiRespColId) {
        this.surveyResponseAnswerPK = new SurveyResponseAnswerPK(surveyResponseId, surveyQuestionId, surveyMultiRespColId);
    }

    public SurveyResponseAnswerPK getSurveyResponseAnswerPK() {
        return surveyResponseAnswerPK;
    }

    public void setSurveyResponseAnswerPK(SurveyResponseAnswerPK surveyResponseAnswerPK) {
        this.surveyResponseAnswerPK = surveyResponseAnswerPK;
    }

    public String getSurveyMultiRespId() {
        return surveyMultiRespId;
    }

    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }

    public Character getBooleanResponse() {
        return booleanResponse;
    }

    public void setBooleanResponse(Character booleanResponse) {
        this.booleanResponse = booleanResponse;
    }

    public BigDecimal getCurrencyResponse() {
        return currencyResponse;
    }

    public void setCurrencyResponse(BigDecimal currencyResponse) {
        this.currencyResponse = currencyResponse;
    }

    public BigDecimal getFloatResponse() {
        return floatResponse;
    }

    public void setFloatResponse(BigDecimal floatResponse) {
        this.floatResponse = floatResponse;
    }

    public BigInteger getNumericResponse() {
        return numericResponse;
    }

    public void setNumericResponse(BigInteger numericResponse) {
        this.numericResponse = numericResponse;
    }

    public String getTextResponse() {
        return textResponse;
    }

    public void setTextResponse(String textResponse) {
        this.textResponse = textResponse;
    }

    public Date getAnsweredDate() {
        return answeredDate;
    }

    public void setAnsweredDate(Date answeredDate) {
        this.answeredDate = answeredDate;
    }

    public BigDecimal getAmountBase() {
        return amountBase;
    }

    public void setAmountBase(BigDecimal amountBase) {
        this.amountBase = amountBase;
    }

    public String getAmountBaseUomId() {
        return amountBaseUomId;
    }

    public void setAmountBaseUomId(String amountBaseUomId) {
        this.amountBaseUomId = amountBaseUomId;
    }

    public BigDecimal getWeightFactor() {
        return weightFactor;
    }

    public void setWeightFactor(BigDecimal weightFactor) {
        this.weightFactor = weightFactor;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public String getDurationUomId() {
        return durationUomId;
    }

    public void setDurationUomId(String durationUomId) {
        this.durationUomId = durationUomId;
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

    public SurveyResponse getSurveyResponse() {
        return surveyResponse;
    }

    public void setSurveyResponse(SurveyResponse surveyResponse) {
        this.surveyResponse = surveyResponse;
    }

    public SurveyQuestion getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public SurveyQuestionOption getSurveyQuestionOption() {
        return surveyQuestionOption;
    }

    public void setSurveyQuestionOption(SurveyQuestionOption surveyQuestionOption) {
        this.surveyQuestionOption = surveyQuestionOption;
    }

    public Content getContentId() {
        return contentId;
    }

    public void setContentId(Content contentId) {
        this.contentId = contentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyResponseAnswerPK != null ? surveyResponseAnswerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyResponseAnswer)) {
            return false;
        }
        SurveyResponseAnswer other = (SurveyResponseAnswer) object;
        if ((this.surveyResponseAnswerPK == null && other.surveyResponseAnswerPK != null) || (this.surveyResponseAnswerPK != null && !this.surveyResponseAnswerPK.equals(other.surveyResponseAnswerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyResponseAnswer[ surveyResponseAnswerPK=" + surveyResponseAnswerPK + " ]";
    }
    
}
