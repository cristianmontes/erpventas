/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SurveyQuestionApplPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_ID")
    private String surveyId;
    @Basic(optional = false)
    @Column(name = "SURVEY_QUESTION_ID")
    private String surveyQuestionId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public SurveyQuestionApplPK() {
    }

    public SurveyQuestionApplPK(String surveyId, String surveyQuestionId, Date fromDate) {
        this.surveyId = surveyId;
        this.surveyQuestionId = surveyQuestionId;
        this.fromDate = fromDate;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyId != null ? surveyId.hashCode() : 0);
        hash += (surveyQuestionId != null ? surveyQuestionId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestionApplPK)) {
            return false;
        }
        SurveyQuestionApplPK other = (SurveyQuestionApplPK) object;
        if ((this.surveyId == null && other.surveyId != null) || (this.surveyId != null && !this.surveyId.equals(other.surveyId))) {
            return false;
        }
        if ((this.surveyQuestionId == null && other.surveyQuestionId != null) || (this.surveyQuestionId != null && !this.surveyQuestionId.equals(other.surveyQuestionId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestionApplPK[ surveyId=" + surveyId + ", surveyQuestionId=" + surveyQuestionId + ", fromDate=" + fromDate + " ]";
    }
    
}
