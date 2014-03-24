/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cust_request_item")
public class CustRequestItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequestItem")
    private List<RequirementCustRequest> requirementCustRequestList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequestItem")
    private List<CustRequestItemNote> custRequestItemNoteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custRequestItem")
    private List<CustRequestItemWorkEffort> custRequestItemWorkEffortList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustRequestItemPK custRequestItemPK;
    @Column(name = "PRIORITY")
    private BigInteger priority;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "REQUIRED_BY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredByDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "SELECTED_AMOUNT")
    private BigDecimal selectedAmount;
    @Column(name = "MAXIMUM_AMOUNT")
    private BigDecimal maximumAmount;
    @Column(name = "RESERV_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservStart;
    @Column(name = "RESERV_LENGTH")
    private BigDecimal reservLength;
    @Column(name = "RESERV_PERSONS")
    private BigDecimal reservPersons;
    @Column(name = "CONFIG_ID")
    private String configId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Lob
    @Column(name = "STORY")
    private String story;
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
    /*@OneToMany(mappedBy = "custRequestItem")
    private List<QuoteItem> quoteItemList;*/
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "CUST_REQUEST_RESOLUTION_ID", referencedColumnName = "CUST_REQUEST_RESOLUTION_ID")
    @ManyToOne
    private CustRequestResolution custRequestResolutionId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "CUST_REQUEST_ID", referencedColumnName = "CUST_REQUEST_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CustRequest custRequest;

    public CustRequestItem() {
    }

    public CustRequestItem(CustRequestItemPK custRequestItemPK) {
        this.custRequestItemPK = custRequestItemPK;
    }

    public CustRequestItem(String custRequestId, String custRequestItemSeqId) {
        this.custRequestItemPK = new CustRequestItemPK(custRequestId, custRequestItemSeqId);
    }

    public CustRequestItemPK getCustRequestItemPK() {
        return custRequestItemPK;
    }

    public void setCustRequestItemPK(CustRequestItemPK custRequestItemPK) {
        this.custRequestItemPK = custRequestItemPK;
    }

    public BigInteger getPriority() {
        return priority;
    }

    public void setPriority(BigInteger priority) {
        this.priority = priority;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public Date getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(Date requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSelectedAmount() {
        return selectedAmount;
    }

    public void setSelectedAmount(BigDecimal selectedAmount) {
        this.selectedAmount = selectedAmount;
    }

    public BigDecimal getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public Date getReservStart() {
        return reservStart;
    }

    public void setReservStart(Date reservStart) {
        this.reservStart = reservStart;
    }

    public BigDecimal getReservLength() {
        return reservLength;
    }

    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
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
/*
    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }*/

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public CustRequestResolution getCustRequestResolutionId() {
        return custRequestResolutionId;
    }

    public void setCustRequestResolutionId(CustRequestResolution custRequestResolutionId) {
        this.custRequestResolutionId = custRequestResolutionId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public CustRequest getCustRequest() {
        return custRequest;
    }

    public void setCustRequest(CustRequest custRequest) {
        this.custRequest = custRequest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custRequestItemPK != null ? custRequestItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestItem)) {
            return false;
        }
        CustRequestItem other = (CustRequestItem) object;
        if ((this.custRequestItemPK == null && other.custRequestItemPK != null) || (this.custRequestItemPK != null && !this.custRequestItemPK.equals(other.custRequestItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestItem[ custRequestItemPK=" + custRequestItemPK + " ]";
    }
/*
    public List<CustRequestItemNote> getCustRequestItemNoteList() {
        return custRequestItemNoteList;
    }

    public void setCustRequestItemNoteList(List<CustRequestItemNote> custRequestItemNoteList) {
        this.custRequestItemNoteList = custRequestItemNoteList;
    }

    public List<CustRequestItemWorkEffort> getCustRequestItemWorkEffortList() {
        return custRequestItemWorkEffortList;
    }

    public void setCustRequestItemWorkEffortList(List<CustRequestItemWorkEffort> custRequestItemWorkEffortList) {
        this.custRequestItemWorkEffortList = custRequestItemWorkEffortList;
    }

    public List<RequirementCustRequest> getRequirementCustRequestList() {
        return requirementCustRequestList;
    }

    public void setRequirementCustRequestList(List<RequirementCustRequest> requirementCustRequestList) {
        this.requirementCustRequestList = requirementCustRequestList;
    }*/
    
}
