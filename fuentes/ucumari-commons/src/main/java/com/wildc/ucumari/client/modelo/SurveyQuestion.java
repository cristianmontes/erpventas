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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Geo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "survey_question")
@NamedQueries({
    @NamedQuery(name = "SurveyQuestion.findAll", query = "SELECT s FROM SurveyQuestion s")})
public class SurveyQuestion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEY_QUESTION_ID")
    private String surveyQuestionId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "QUESTION")
    private String question;
    @Lob
    @Column(name = "HINT")
    private String hint;
    @Column(name = "ENUM_TYPE_ID")
    private String enumTypeId;
    @Column(name = "FORMAT_STRING")
    private String formatString;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyQuestion")
    private List<SurveyResponseAnswer> surveyResponseAnswerList;
    @JoinColumn(name = "SURVEY_QUESTION_TYPE_ID", referencedColumnName = "SURVEY_QUESTION_TYPE_ID")
    @ManyToOne
    private SurveyQuestionType surveyQuestionTypeId;
    @JoinColumn(name = "SURVEY_QUESTION_CATEGORY_ID", referencedColumnName = "SURVEY_QUESTION_CATEGORY_ID")
    @ManyToOne
    private SurveyQuestionCategory surveyQuestionCategoryId;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo geoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyQuestion")
    private List<SurveyQuestionOption> surveyQuestionOptionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyQuestion")
    private List<SurveyQuestionAppl> surveyQuestionApplList;

    public SurveyQuestion() {
    }

    public SurveyQuestion(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getSurveyQuestionId() {
        return surveyQuestionId;
    }

    public void setSurveyQuestionId(String surveyQuestionId) {
        this.surveyQuestionId = surveyQuestionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public String getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(String enumTypeId) {
        this.enumTypeId = enumTypeId;
    }

    public String getFormatString() {
        return formatString;
    }

    public void setFormatString(String formatString) {
        this.formatString = formatString;
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

    public SurveyQuestionType getSurveyQuestionTypeId() {
        return surveyQuestionTypeId;
    }

    public void setSurveyQuestionTypeId(SurveyQuestionType surveyQuestionTypeId) {
        this.surveyQuestionTypeId = surveyQuestionTypeId;
    }

    public SurveyQuestionCategory getSurveyQuestionCategoryId() {
        return surveyQuestionCategoryId;
    }

    public void setSurveyQuestionCategoryId(SurveyQuestionCategory surveyQuestionCategoryId) {
        this.surveyQuestionCategoryId = surveyQuestionCategoryId;
    }

    public Geo getGeoId() {
        return geoId;
    }

    public void setGeoId(Geo geoId) {
        this.geoId = geoId;
    }

    public List<SurveyQuestionOption> getSurveyQuestionOptionList() {
        return surveyQuestionOptionList;
    }

    public void setSurveyQuestionOptionList(List<SurveyQuestionOption> surveyQuestionOptionList) {
        this.surveyQuestionOptionList = surveyQuestionOptionList;
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
        hash += (surveyQuestionId != null ? surveyQuestionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyQuestion)) {
            return false;
        }
        SurveyQuestion other = (SurveyQuestion) object;
        if ((this.surveyQuestionId == null && other.surveyQuestionId != null) || (this.surveyQuestionId != null && !this.surveyQuestionId.equals(other.surveyQuestionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyQuestion[ surveyQuestionId=" + surveyQuestionId + " ]";
    }
    
}
