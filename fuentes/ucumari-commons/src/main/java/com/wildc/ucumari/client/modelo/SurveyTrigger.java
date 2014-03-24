/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "survey_trigger")
@NamedQueries({
    @NamedQuery(name = "SurveyTrigger.findAll", query = "SELECT s FROM SurveyTrigger s")})
public class SurveyTrigger implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyTriggerPK surveyTriggerPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "SURVEY_APPL_TYPE_ID", referencedColumnName = "SURVEY_APPL_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SurveyApplType surveyApplType;
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Survey survey;

    public SurveyTrigger() {
    }

    public SurveyTrigger(SurveyTriggerPK surveyTriggerPK) {
        this.surveyTriggerPK = surveyTriggerPK;
    }

    public SurveyTrigger(String surveyId, String surveyApplTypeId, Date fromDate) {
        this.surveyTriggerPK = new SurveyTriggerPK(surveyId, surveyApplTypeId, fromDate);
    }

    public SurveyTriggerPK getSurveyTriggerPK() {
        return surveyTriggerPK;
    }

    public void setSurveyTriggerPK(SurveyTriggerPK surveyTriggerPK) {
        this.surveyTriggerPK = surveyTriggerPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public SurveyApplType getSurveyApplType() {
        return surveyApplType;
    }

    public void setSurveyApplType(SurveyApplType surveyApplType) {
        this.surveyApplType = surveyApplType;
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
        hash += (surveyTriggerPK != null ? surveyTriggerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyTrigger)) {
            return false;
        }
        SurveyTrigger other = (SurveyTrigger) object;
        if ((this.surveyTriggerPK == null && other.surveyTriggerPK != null) || (this.surveyTriggerPK != null && !this.surveyTriggerPK.equals(other.surveyTriggerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyTrigger[ surveyTriggerPK=" + surveyTriggerPK + " ]";
    }
    
}
