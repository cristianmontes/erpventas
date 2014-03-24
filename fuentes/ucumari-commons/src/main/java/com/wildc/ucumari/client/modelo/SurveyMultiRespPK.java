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
public class SurveyMultiRespPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_ID")
    private String surveyId;
    @Basic(optional = false)
    @Column(name = "SURVEY_MULTI_RESP_ID")
    private String surveyMultiRespId;

    public SurveyMultiRespPK() {
    }

    public SurveyMultiRespPK(String surveyId, String surveyMultiRespId) {
        this.surveyId = surveyId;
        this.surveyMultiRespId = surveyMultiRespId;
    }

    public String getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(String surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyMultiRespId() {
        return surveyMultiRespId;
    }

    public void setSurveyMultiRespId(String surveyMultiRespId) {
        this.surveyMultiRespId = surveyMultiRespId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyId != null ? surveyId.hashCode() : 0);
        hash += (surveyMultiRespId != null ? surveyMultiRespId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyMultiRespPK)) {
            return false;
        }
        SurveyMultiRespPK other = (SurveyMultiRespPK) object;
        if ((this.surveyId == null && other.surveyId != null) || (this.surveyId != null && !this.surveyId.equals(other.surveyId))) {
            return false;
        }
        if ((this.surveyMultiRespId == null && other.surveyMultiRespId != null) || (this.surveyMultiRespId != null && !this.surveyMultiRespId.equals(other.surveyMultiRespId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyMultiRespPK[ surveyId=" + surveyId + ", surveyMultiRespId=" + surveyMultiRespId + " ]";
    }
    
}
