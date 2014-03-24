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
public class SurveyMultiRespColumnPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "SURVEY_ID")
    private String surveyId;
    @Basic(optional = false)
    @Column(name = "SURVEY_MULTI_RESP_ID")
    private String surveyMultiRespId;
    @Basic(optional = false)
    @Column(name = "SURVEY_MULTI_RESP_COL_ID")
    private String surveyMultiRespColId;

    public SurveyMultiRespColumnPK() {
    }

    public SurveyMultiRespColumnPK(String surveyId, String surveyMultiRespId, String surveyMultiRespColId) {
        this.surveyId = surveyId;
        this.surveyMultiRespId = surveyMultiRespId;
        this.surveyMultiRespColId = surveyMultiRespColId;
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

    public String getSurveyMultiRespColId() {
        return surveyMultiRespColId;
    }

    public void setSurveyMultiRespColId(String surveyMultiRespColId) {
        this.surveyMultiRespColId = surveyMultiRespColId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyId != null ? surveyId.hashCode() : 0);
        hash += (surveyMultiRespId != null ? surveyMultiRespId.hashCode() : 0);
        hash += (surveyMultiRespColId != null ? surveyMultiRespColId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyMultiRespColumnPK)) {
            return false;
        }
        SurveyMultiRespColumnPK other = (SurveyMultiRespColumnPK) object;
        if ((this.surveyId == null && other.surveyId != null) || (this.surveyId != null && !this.surveyId.equals(other.surveyId))) {
            return false;
        }
        if ((this.surveyMultiRespId == null && other.surveyMultiRespId != null) || (this.surveyMultiRespId != null && !this.surveyMultiRespId.equals(other.surveyMultiRespId))) {
            return false;
        }
        if ((this.surveyMultiRespColId == null && other.surveyMultiRespColId != null) || (this.surveyMultiRespColId != null && !this.surveyMultiRespColId.equals(other.surveyMultiRespColId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyMultiRespColumnPK[ surveyId=" + surveyId + ", surveyMultiRespId=" + surveyMultiRespId + ", surveyMultiRespColId=" + surveyMultiRespColId + " ]";
    }
    
}
