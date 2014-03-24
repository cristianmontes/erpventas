/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.ProductStore;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request")
public class CustRequest implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<RespondingParty> respondingPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestWorkEffort> custRequestWorkEffortList;
    @OneToMany(mappedBy = "custRequestId")
    private List<CustRequestStatus> custRequestStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestCommEvent> custRequestCommEventList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestRole> custRequestRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestParty> custRequestPartyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestAttribute> custRequestAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestContent> custRequestContentList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Column(name = "PRIORITY")
    private BigInteger priority;
    @Column(name = "CUST_REQUEST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date custRequestDate;
    @Column(name = "RESPONSE_REQUIRED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date responseRequiredDate;
    @Column(name = "CUST_REQUEST_NAME")
    private String custRequestName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "OPEN_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openDateTime;
    @Column(name = "CLOSED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date closedDateTime;
    @Column(name = "INTERNAL_COMMENT")
    private String internalComment;
    @Column(name = "REASON")
    private String reason;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    @Column(name = "FULFILLED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fulfilledDateTime;
    /*@OneToMany(mappedBy = "custRequestId")
    private List<QuoteItem> quoteItemList;*/
    @JoinColumn(name = "CUST_REQUEST_TYPE_ID", referencedColumnName = "CUST_REQUEST_TYPE_ID")
    @ManyToOne
    private CustRequestType custRequestTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @JoinColumn(name = "FULFILL_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech fulfillContactMechId;
    @JoinColumn(name = "FROM_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party fromPartyId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "SALES_CHANNEL_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration salesChannelEnumId;
    @JoinColumn(name = "CUST_REQUEST_CATEGORY_ID", referencedColumnName = "CUST_REQUEST_CATEGORY_ID")
    @ManyToOne
    private CustRequestCategory custRequestCategoryId;
    @JoinColumn(name = "MAXIMUM_AMOUNT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom maximumAmountUomId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequest")
    private List<CustRequestItem> custRequestItemList;*/

    public CustRequest() {
    }

    public CustRequest(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public Date getCustRequestDate() {
        return custRequestDate;
    }

    public void setCustRequestDate(Date custRequestDate) {
        this.custRequestDate = custRequestDate;
    }

    public Date getResponseRequiredDate() {
        return responseRequiredDate;
    }

    public void setResponseRequiredDate(Date responseRequiredDate) {
        this.responseRequiredDate = responseRequiredDate;
    }

    public String getCustRequestName() {
        return custRequestName;
    }

    public void setCustRequestName(String custRequestName) {
        this.custRequestName = custRequestName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOpenDateTime() {
        return openDateTime;
    }

    public void setOpenDateTime(Date openDateTime) {
        this.openDateTime = openDateTime;
    }

    public Date getClosedDateTime() {
        return closedDateTime;
    }

    public void setClosedDateTime(Date closedDateTime) {
        this.closedDateTime = closedDateTime;
    }

    public String getInternalComment() {
        return internalComment;
    }

    public void setInternalComment(String internalComment) {
        this.internalComment = internalComment;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public Date getFulfilledDateTime() {
        return fulfilledDateTime;
    }

    public void setFulfilledDateTime(Date fulfilledDateTime) {
        this.fulfilledDateTime = fulfilledDateTime;
    }
/*
    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }*/

    public CustRequestType getCustRequestTypeId() {
        return custRequestTypeId;
    }

    public void setCustRequestTypeId(CustRequestType custRequestTypeId) {
        this.custRequestTypeId = custRequestTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public ContactMech getFulfillContactMechId() {
        return fulfillContactMechId;
    }

    public void setFulfillContactMechId(ContactMech fulfillContactMechId) {
        this.fulfillContactMechId = fulfillContactMechId;
    }

    public Party getFromPartyId() {
        return fromPartyId;
    }

    public void setFromPartyId(Party fromPartyId) {
        this.fromPartyId = fromPartyId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Enumeration getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(Enumeration salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public CustRequestCategory getCustRequestCategoryId() {
        return custRequestCategoryId;
    }

    public void setCustRequestCategoryId(CustRequestCategory custRequestCategoryId) {
        this.custRequestCategoryId = custRequestCategoryId;
    }

    public Uom getMaximumAmountUomId() {
        return maximumAmountUomId;
    }

    public void setMaximumAmountUomId(Uom maximumAmountUomId) {
        this.maximumAmountUomId = maximumAmountUomId;
    }
/*
    public List<CustRequestItem> getCustRequestItemList() {
        return custRequestItemList;
    }

    public void setCustRequestItemList(List<CustRequestItem> custRequestItemList) {
        this.custRequestItemList = custRequestItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequest)) {
            return false;
        }
        CustRequest other = (CustRequest) object;
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequest[ custRequestId=" + custRequestId + " ]";
    }
/*
    public List<CustRequestWorkEffort> getCustRequestWorkEffortList() {
        return custRequestWorkEffortList;
    }

    public void setCustRequestWorkEffortList(List<CustRequestWorkEffort> custRequestWorkEffortList) {
        this.custRequestWorkEffortList = custRequestWorkEffortList;
    }

    public List<CustRequestStatus> getCustRequestStatusList() {
        return custRequestStatusList;
    }

    public void setCustRequestStatusList(List<CustRequestStatus> custRequestStatusList) {
        this.custRequestStatusList = custRequestStatusList;
    }

    public List<CustRequestCommEvent> getCustRequestCommEventList() {
        return custRequestCommEventList;
    }

    public void setCustRequestCommEventList(List<CustRequestCommEvent> custRequestCommEventList) {
        this.custRequestCommEventList = custRequestCommEventList;
    }

    public List<CustRequestRole> getCustRequestRoleList() {
        return custRequestRoleList;
    }

    public void setCustRequestRoleList(List<CustRequestRole> custRequestRoleList) {
        this.custRequestRoleList = custRequestRoleList;
    }

    public List<CustRequestParty> getCustRequestPartyList() {
        return custRequestPartyList;
    }

    public void setCustRequestPartyList(List<CustRequestParty> custRequestPartyList) {
        this.custRequestPartyList = custRequestPartyList;
    }

    public List<CustRequestAttribute> getCustRequestAttributeList() {
        return custRequestAttributeList;
    }

    public void setCustRequestAttributeList(List<CustRequestAttribute> custRequestAttributeList) {
        this.custRequestAttributeList = custRequestAttributeList;
    }

    public List<CustRequestContent> getCustRequestContentList() {
        return custRequestContentList;
    }

    public void setCustRequestContentList(List<CustRequestContent> custRequestContentList) {
        this.custRequestContentList = custRequestContentList;
    }

    public List<RespondingParty> getRespondingPartyList() {
        return respondingPartyList;
    }

    public void setRespondingPartyList(List<RespondingParty> respondingPartyList) {
        this.respondingPartyList = respondingPartyList;
    }*/
    
}
