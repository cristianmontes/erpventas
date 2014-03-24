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
@Table(name = "survey_page")
@NamedQueries({
    @NamedQuery(name = "SurveyPage.findAll", query = "SELECT s FROM SurveyPage s")})
public class SurveyPage implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyPagePK surveyPagePK;
    @Column(name = "PAGE_NAME")
    private String pageName;
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
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Survey survey;

    public SurveyPage() {
    }

    public SurveyPage(SurveyPagePK surveyPagePK) {
        this.surveyPagePK = surveyPagePK;
    }

    public SurveyPage(String surveyId, String surveyPageSeqId) {
        this.surveyPagePK = new SurveyPagePK(surveyId, surveyPageSeqId);
    }

    public SurveyPagePK getSurveyPagePK() {
        return surveyPagePK;
    }

    public void setSurveyPagePK(SurveyPagePK surveyPagePK) {
        this.surveyPagePK = surveyPagePK;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
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

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyPagePK != null ? surveyPagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyPage)) {
            return false;
        }
        SurveyPage other = (SurveyPage) object;
        if ((this.surveyPagePK == null && other.surveyPagePK != null) || (this.surveyPagePK != null && !this.surveyPagePK.equals(other.surveyPagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyPage[ surveyPagePK=" + surveyPagePK + " ]";
    }
    
}
