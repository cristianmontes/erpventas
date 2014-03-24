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
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "survey_question_option")
@NamedQueries({
    @NamedQuery(name = "SurveyQuestionOption.findAll", query = "SELECT s FROM SurveyQuestionOption s")})
public class SurveyQuestionOption implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyQuestionOptionPK surveyQuestionOptionPK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyQuestionOption")
    private List<SurveyResponseAnswer> surveyResponseAnswerList;
    @JoinColumn(name = "SURVEY_QUESTION_ID", referencedColumnName = "SURVEY_QUESTION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyQuestion surveyQuestion;
    @OneToMany(mappedBy = "surveyQuestionOption")
    private List<SurveyQuestionAppl> surveyQuestionApplList;

    public SurveyQuestionOption() {
    }

    public SurveyQuestionOption(SurveyQuestionOptionPK surveyQuestionOptionPK) {
        this.surveyQuestionOptionPK = surveyQuestionOptionPK;
    }

    public SurveyQuestionOption(String surveyQuestionId, String surveyOptionSeqId) {
        this.surveyQuestionOptionPK = new SurveyQuestionOptionPK(surveyQuestionId, surveyOptionSeqId);
    }

    public SurveyQuestionOptionPK getSurveyQuestionOptionPK() {
        return surveyQuestionOptionPK;
    }

    public void setSurveyQuestionOptionPK(SurveyQuestionOptionPK surveyQuestionOptionPK) {
        this.surveyQuestionOptionPK = surveyQuestionOptionPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public List<SurveyResponseAnswer> getSurveyResponseAnswerList() {
        return surveyResponseAnswerList;
    }

    public void setSurveyResponseAnswerList(List<SurveyResponseAnswer> surveyResponseAnswerList) {
        this.surveyResponseAnswerList = surveyResponseAnswerList;
    }

    public SurveyQuestion getSurveyQuestion() {
        return surveyQuestion;
    }

    public void setSurveyQuestion(SurveyQuestion surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }

    public List<SurveyQuestionAppl> getSurveyQuestionApplList() {
        return surveyQuestionApplList;
    }

    public void setSurveyQuestionApplList(List<SurveyQuestionAppl> surveyQuestionApplList) {
        this.surveyQuestionApplList = surveyQuestionApplList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyQuestionOptionPK != null ? surveyQuestionOptionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestionOption)) {
            return false;
        }
        SurveyQuestionOption other = (SurveyQuestionOption) object;
        if ((this.surveyQuestionOptionPK == null && other.surveyQuestionOptionPK != null) || (this.surveyQuestionOptionPK != null && !this.surveyQuestionOptionPK.equals(other.surveyQuestionOptionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestionOption[ surveyQuestionOptionPK=" + surveyQuestionOptionPK + " ]";
    }
    
}
