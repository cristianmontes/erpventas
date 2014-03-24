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
public class SurveyQuestionOptionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_QUESTION_ID")
    private String surveyQuestionId;
    @Basic(optional = false)
    @Column(name = "SURVEY_OPTION_SEQ_ID")
    private String surveyOptionSeqId;

    public SurveyQuestionOptionPK() {
    }

    public SurveyQuestionOptionPK(String surveyQuestionId, String surveyOptionSeqId) {
        this.surveyQuestionId = surveyQuestionId;
        this.surveyOptionSeqId = surveyOptionSeqId;
    }

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getSurveyOptionSeqId() {
        return surveyOptionSeqId;
    }

    public void setSurveyOptionSeqId(String surveyOptionSeqId) {
        this.surveyOptionSeqId = surveyOptionSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyQuestionId != null ? surveyQuestionId.hashCode() : 0);
        hash += (surveyOptionSeqId != null ? surveyOptionSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestionOptionPK)) {
            return false;
        }
        SurveyQuestionOptionPK other = (SurveyQuestionOptionPK) object;
        if ((this.surveyQuestionId == null && other.surveyQuestionId != null) || (this.surveyQuestionId != null && !this.surveyQuestionId.equals(other.surveyQuestionId))) {
            return false;
        }
        if ((this.surveyOptionSeqId == null && other.surveyOptionSeqId != null) || (this.surveyOptionSeqId != null && !this.surveyOptionSeqId.equals(other.surveyOptionSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestionOptionPK[ surveyQuestionId=" + surveyQuestionId + ", surveyOptionSeqId=" + surveyOptionSeqId + " ]";
    }
    
}
