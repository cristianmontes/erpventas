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

import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "survey_response")
@NamedQueries({
    @NamedQuery(name = "SurveyResponse.findAll", query = "SELECT s FROM SurveyResponse s")})
public class SurveyResponse implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyResponse")
    private List<ShoppingListItemSurvey> shoppingListItemSurveyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "surveyResponse")
    private List<SurveyResponseAnswer> surveyResponseAnswerList;
    @OneToMany(mappedBy = "surveyResponseId")
    private List<ValueLinkFulfillment> valueLinkFulfillmentList;
    @OneToMany(mappedBy = "surveyResponseId")
    private List<GiftCardFulfillment> giftCardFulfillmentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SURVEY_RESPONSE_ID")
    private String surveyResponseId;
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "RESPONSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "REFERENCE_ID")
    private String referenceId;
    @Lob
    @Column(name = "GENERAL_FEEDBACK")
    private String generalFeedback;
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_ITEM_SEQ_ID")
    private String orderItemSeqId;
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
    @OneToMany(mappedBy = "surveyResponseId")
    private List<DataResource> dataResourceList;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID")
    @ManyToOne
    private Survey surveyId;

    public SurveyResponse() {
    }

    public SurveyResponse(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public String getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(String surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getGeneralFeedback() {
        return generalFeedback;
    }

    public void setGeneralFeedback(String generalFeedback) {
        this.generalFeedback = generalFeedback;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderItemSeqId() {
        return orderItemSeqId;
    }

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
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

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Survey getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Survey surveyId) {
        this.surveyId = surveyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (surveyResponseId != null ? surveyResponseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SurveyResponse)) {
            return false;
        }
        SurveyResponse other = (SurveyResponse) object;
        if ((this.surveyResponseId == null && other.surveyResponseId != null) || (this.surveyResponseId != null && !this.surveyResponseId.equals(other.surveyResponseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SurveyResponse[ surveyResponseId=" + surveyResponseId + " ]";
    }

    public List<GiftCardFulfillment> getGiftCardFulfillmentList() {
        return giftCardFulfillmentList;
    }

    public void setGiftCardFulfillmentList(List<GiftCardFulfillment> giftCardFulfillmentList) {
        this.giftCardFulfillmentList = giftCardFulfillmentList;
    }

    public List<ShoppingListItemSurvey> getShoppingListItemSurveyList() {
        return shoppingListItemSurveyList;
    }

    public void setShoppingListItemSurveyList(List<ShoppingListItemSurvey> shoppingListItemSurveyList) {
        this.shoppingListItemSurveyList = shoppingListItemSurveyList;
    }

    public List<SurveyResponseAnswer> getSurveyResponseAnswerList() {
        return surveyResponseAnswerList;
    }

    public void setSurveyResponseAnswerList(List<SurveyResponseAnswer> surveyResponseAnswerList) {
        this.surveyResponseAnswerList = surveyResponseAnswerList;
    }

    public List<ValueLinkFulfillment> getValueLinkFulfillmentList() {
        return valueLinkFulfillmentList;
    }

    public void setValueLinkFulfillmentList(List<ValueLinkFulfillment> valueLinkFulfillmentList) {
        this.valueLinkFulfillmentList = valueLinkFulfillmentList;
    }
    
}
