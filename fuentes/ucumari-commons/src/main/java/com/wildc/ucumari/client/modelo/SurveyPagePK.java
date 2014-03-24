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
public class SurveyPagePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_ID")
    private String surveyId;
    @Basic(optional = false)
    @Column(name = "SURVEY_PAGE_SEQ_ID")
    private String surveyPageSeqId;

    public SurveyPagePK() {
    }

    public SurveyPagePK(String surveyId, String surveyPageSeqId) {
        this.surveyId = surveyId;
        this.surveyPageSeqId = surveyPageSeqId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyPageSeqId() {
        return surveyPageSeqId;
    }

    public void setSurveyPageSeqId(String surveyPageSeqId) {
        this.surveyPageSeqId = surveyPageSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyId != null ? surveyId.hashCode() : 0);
        hash += (surveyPageSeqId != null ? surveyPageSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyPagePK)) {
            return false;
        }
        SurveyPagePK other = (SurveyPagePK) object;
        if ((this.surveyId == null && other.surveyId != null) || (this.surveyId != null && !this.surveyId.equals(other.surveyId))) {
            return false;
        }
        if ((this.surveyPageSeqId == null && other.surveyPageSeqId != null) || (this.surveyPageSeqId != null && !this.surveyPageSeqId.equals(other.surveyPageSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyPagePK[ surveyId=" + surveyId + ", surveyPageSeqId=" + surveyPageSeqId + " ]";
    }
    
}
