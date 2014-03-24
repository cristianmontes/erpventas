/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "survey_multi_resp_column")
@NamedQueries({
    @NamedQuery(name = "SurveyMultiRespColumn.findAll", query = "SELECT s FROM SurveyMultiRespColumn s")})
public class SurveyMultiRespColumn implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SurveyMultiRespColumnPK surveyMultiRespColumnPK;
    @Column(name = "COLUMN_TITLE")
    private String columnTitle;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumns({
        @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "SURVEY_MULTI_RESP_ID", referencedColumnName = "SURVEY_MULTI_RESP_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private SurveyMultiResp surveyMultiResp;

    public SurveyMultiRespColumn() {
    }

    public SurveyMultiRespColumn(SurveyMultiRespColumnPK surveyMultiRespColumnPK) {
        this.surveyMultiRespColumnPK = surveyMultiRespColumnPK;
    }

    public SurveyMultiRespColumn(String surveyId, String surveyMultiRespId, String surveyMultiRespColId) {
        this.surveyMultiRespColumnPK = new SurveyMultiRespColumnPK(surveyId, surveyMultiRespId, surveyMultiRespColId);
    }

    public SurveyMultiRespColumnPK getSurveyMultiRespColumnPK() {
        return surveyMultiRespColumnPK;
    }

    public void setSurveyMultiRespColumnPK(SurveyMultiRespColumnPK surveyMultiRespColumnPK) {
        this.surveyMultiRespColumnPK = surveyMultiRespColumnPK;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public SurveyMultiResp getSurveyMultiResp() {
        return surveyMultiResp;
    }

    public void setSurveyMultiResp(SurveyMultiResp surveyMultiResp) {
        this.surveyMultiResp = surveyMultiResp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyMultiRespColumnPK != null ? surveyMultiRespColumnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyMultiRespColumn)) {
            return false;
        }
        SurveyMultiRespColumn other = (SurveyMultiRespColumn) object;
        if ((this.surveyMultiRespColumnPK == null && other.surveyMultiRespColumnPK != null) || (this.surveyMultiRespColumnPK != null && !this.surveyMultiRespColumnPK.equals(other.surveyMultiRespColumnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyMultiRespColumn[ surveyMultiRespColumnPK=" + surveyMultiRespColumnPK + " ]";
    }
    
}
