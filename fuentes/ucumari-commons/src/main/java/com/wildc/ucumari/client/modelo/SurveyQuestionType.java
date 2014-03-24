/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "survey_question_type")
@NamedQueries({
    @NamedQuery(name = "SurveyQuestionType.findAll", query = "SELECT s FROM SurveyQuestionType s")})
public class SurveyQuestionType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEY_QUESTION_TYPE_ID")
    private String surveyQuestionTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "surveyQuestionTypeId")
    private List<SurveyQuestion> surveyQuestionList;

    public SurveyQuestionType() {
    }

    public SurveyQuestionType(String surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
    }

    public String getSurveyQuestionTypeId() {
        return surveyQuestionTypeId;
    }

    public void setSurveyQuestionTypeId(String surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<SurveyQuestion> getSurveyQuestionList() {
        return surveyQuestionList;
    }

    public void setSurveyQuestionList(List<SurveyQuestion> surveyQuestionList) {
        this.surveyQuestionList = surveyQuestionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyQuestionTypeId != null ? surveyQuestionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestionType)) {
            return false;
        }
        SurveyQuestionType other = (SurveyQuestionType) object;
        if ((this.surveyQuestionTypeId == null && other.surveyQuestionTypeId != null) || (this.surveyQuestionTypeId != null && !this.surveyQuestionTypeId.equals(other.surveyQuestionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestionType[ surveyQuestionTypeId=" + surveyQuestionTypeId + " ]";
    }
    
}
