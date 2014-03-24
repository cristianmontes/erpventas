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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProductStoreSurveyAppl;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "survey_appl_type")
@NamedQueries({
    @NamedQuery(name = "SurveyApplType.findAll", query = "SELECT s FROM SurveyApplType s")})
public class SurveyApplType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyApplType")
    private List<SurveyTrigger> surveyTriggerList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEY_APPL_TYPE_ID")
    private String surveyApplTypeId;
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
    @OneToMany(mappedBy = "surveyApplTypeId")
    private List<ProductStoreSurveyAppl> productStoreSurveyApplList;

    public SurveyApplType() {
    }

    public SurveyApplType(String surveyApplTypeId) {
        this.surveyApplTypeId = surveyApplTypeId;
    }

    public String getSurveyApplTypeId() {
        return surveyApplTypeId;
    }

    public void setSurveyApplTypeId(String surveyApplTypeId) {
        this.surveyApplTypeId = surveyApplTypeId;
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

    public List<ProductStoreSurveyAppl> getProductStoreSurveyApplList() {
        return productStoreSurveyApplList;
    }

    public void setProductStoreSurveyApplList(List<ProductStoreSurveyAppl> productStoreSurveyApplList) {
        this.productStoreSurveyApplList = productStoreSurveyApplList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyApplTypeId != null ? surveyApplTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyApplType)) {
            return false;
        }
        SurveyApplType other = (SurveyApplType) object;
        if ((this.surveyApplTypeId == null && other.surveyApplTypeId != null) || (this.surveyApplTypeId != null && !this.surveyApplTypeId.equals(other.surveyApplTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyApplType[ surveyApplTypeId=" + surveyApplTypeId + " ]";
    }

    public List<SurveyTrigger> getSurveyTriggerList() {
        return surveyTriggerList;
    }

    public void setSurveyTriggerList(List<SurveyTrigger> surveyTriggerList) {
        this.surveyTriggerList = surveyTriggerList;
    }
    
}
