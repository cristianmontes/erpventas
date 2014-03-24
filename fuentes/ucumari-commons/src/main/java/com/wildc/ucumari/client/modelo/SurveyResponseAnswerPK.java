/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class SurveyResponseAnswerPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_RESPONSE_ID")
    private String surveyResponseId;
    @Basic(optional = false)
    @Column(name = "SURVEY_QUESTION_ID")
    private String surveyQuestionId;
    @Basic(optional = false)
    @Column(name = "SURVEY_MULTI_RESP_COL_ID")
    private String surveyMultiRespColId;

    public SurveyResponseAnswerPK() {
    }

    public SurveyResponseAnswerPK(String surveyResponseId, String surveyQuestionId, String surveyMultiRespColId) {
        this.surveyResponseId = surveyResponseId;
        this.surveyQuestionId = surveyQuestionId;
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    public String getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getSurveyMultiRespColId() {
        return surveyMultiRespColId;
    }

    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyResponseId != null ? surveyResponseId.hashCode() : 0);
        hash += (surveyQuestionId != null ? surveyQuestionId.hashCode() : 0);
        hash += (surveyMultiRespColId != null ? surveyMultiRespColId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyResponseAnswerPK)) {
            return false;
        }
        SurveyResponseAnswerPK other = (SurveyResponseAnswerPK) object;
        if ((this.surveyResponseId == null && other.surveyResponseId != null) || (this.surveyResponseId != null && !this.surveyResponseId.equals(other.surveyResponseId))) {
            return false;
        }
        if ((this.surveyQuestionId == null && other.surveyQuestionId != null) || (this.surveyQuestionId != null && !this.surveyQuestionId.equals(other.surveyQuestionId))) {
            return false;
        }
        if ((this.surveyMultiRespColId == null && other.surveyMultiRespColId != null) || (this.surveyMultiRespColId != null && !this.surveyMultiRespColId.equals(other.surveyMultiRespColId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyResponseAnswerPK[ surveyResponseId=" + surveyResponseId + ", surveyQuestionId=" + surveyQuestionId + ", surveyMultiRespColId=" + surveyMultiRespColId + " ]";
    }
    
}
