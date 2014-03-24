/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "survey_multi_resp")
@NamedQueries({
    @NamedQuery(name = "SurveyMultiResp.findAll", query = "SELECT s FROM SurveyMultiResp s")})
public class SurveyMultiResp implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyMultiRespPK surveyMultiRespPK;
    @Column(name = "MULTI_RESP_TITLE")
    private String multiRespTitle;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyMultiResp")
    private List<SurveyMultiRespColumn> surveyMultiRespColumnList;

    public SurveyMultiResp() {
    }

    public SurveyMultiResp(SurveyMultiRespPK surveyMultiRespPK) {
        this.surveyMultiRespPK = surveyMultiRespPK;
    }

    public SurveyMultiResp(String surveyId, String surveyMultiRespId) {
        this.surveyMultiRespPK = new SurveyMultiRespPK(surveyId, surveyMultiRespId);
    }

    public SurveyMultiRespPK getSurveyMultiRespPK() {
        return surveyMultiRespPK;
    }

    public void setSurveyMultiRespPK(SurveyMultiRespPK surveyMultiRespPK) {
        this.surveyMultiRespPK = surveyMultiRespPK;
    }

    public String getMultiRespTitle() {
        return multiRespTitle;
    }

    public void setMultiRespTitle(String multiRespTitle) {
        this.multiRespTitle = multiRespTitle;
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

    public List<SurveyMultiRespColumn> getSurveyMultiRespColumnList() {
        return surveyMultiRespColumnList;
    }

    public void setSurveyMultiRespColumnList(List<SurveyMultiRespColumn> surveyMultiRespColumnList) {
        this.surveyMultiRespColumnList = surveyMultiRespColumnList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyMultiRespPK != null ? surveyMultiRespPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyMultiResp)) {
            return false;
        }
        SurveyMultiResp other = (SurveyMultiResp) object;
        if ((this.surveyMultiRespPK == null && other.surveyMultiRespPK != null) || (this.surveyMultiRespPK != null && !this.surveyMultiRespPK.equals(other.surveyMultiRespPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyMultiResp[ surveyMultiRespPK=" + surveyMultiRespPK + " ]";
    }
    
}
