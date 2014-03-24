/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.custrequest.model.CustRequestContent;
import com.wildc.ucumari.order.model.OrderContent;
import com.wildc.ucumari.order.model.OrderHeaderContent;
import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.PartyContent;
import com.wildc.ucumari.product.model.ProdConfItemContent;
import com.wildc.ucumari.product.model.ProductCategoryContent;
import com.wildc.ucumari.product.model.ProductContent;
import com.wildc.ucumari.quote.model.QuoteContent;
import com.wildc.ucumari.quote.model.SalesOpportunityContent;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "content")
@NamedQueries({
    @NamedQuery(name = "Content.findAll", query = "SELECT c FROM Content c")})
public class Content implements Serializable {
    @OneToMany(mappedBy = "internalContentId")
    private List<ServerHit> serverHitList;
    @OneToMany(mappedBy = "contentId")
    private List<WebSitePathAlias> webSitePathAliasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<WebSiteContent> webSiteContentList;
    @OneToMany(mappedBy = "contentId")
    private List<SurveyResponseAnswer> surveyResponseAnswerList;
    @OneToMany(mappedBy = "internalContentId")
    private List<ServerHitBin> serverHitBinList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<WorkEffortContent> workEffortContentList;
    @OneToMany(mappedBy = "contentId")
    private List<WebPage> webPageList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "content")
    private WebSitePublishPoint webSitePublishPoint;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<SalesOpportunityContent> salesOpportunityContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<QuoteContent> quoteContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<PartyContent> partyContentList;
    @OneToMany(mappedBy = "contentId")
    private List<SubscriptionResource> subscriptionResourceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ProductContent> productContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ProdConfItemContent> prodConfItemContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ProductCategoryContent> productCategoryContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<OrderContent> orderContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<OrderHeaderContent> orderHeaderContentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Column(name = "SERVICE_NAME")
    private String serviceName;
    @Column(name = "CONTENT_NAME")
    private String contentName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LOCALE_STRING")
    private String localeString;
    @Column(name = "MIME_TYPE_ID")
    private String mimeTypeId;
    @Column(name = "CHILD_LEAF_COUNT")
    private BigInteger childLeafCount;
    @Column(name = "CHILD_BRANCH_COUNT")
    private BigInteger childBranchCount;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentPurpose> contentPurposeList;
    @JoinColumn(name = "CONTENT_TYPE_ID", referencedColumnName = "CONTENT_TYPE_ID")
    @ManyToOne
    private ContentType contentTypeId;
    @JoinColumn(name = "CLASSIFICATION_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration classificationEnumId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @JoinColumn(name = "CHARACTER_SET_ID", referencedColumnName = "CHARACTER_SET_ID")
    @ManyToOne
    private CharacterSet characterSetId;
    @OneToMany(mappedBy = "decoratorContentId")
    private List<Content> contentList;
    @JoinColumn(name = "DECORATOR_CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content decoratorContentId;
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @OneToMany(mappedBy = "instanceOfContentId")
    private List<Content> contentList1;
    @JoinColumn(name = "INSTANCE_OF_CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content instanceOfContentId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @OneToMany(mappedBy = "ownerContentId")
    private List<Content> contentList2;
    @JoinColumn(name = "OWNER_CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content ownerContentId;
    @JoinColumn(name = "PRIVILEGE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration privilegeEnumId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID")
    @ManyToOne
    private DataResource dataResourceId;
    @JoinColumn(name = "TEMPLATE_DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID")
    @ManyToOne
    private DataResource templateDataResourceId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentRevision> contentRevisionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentMetaData> contentMetaDataList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentRole> contentRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<CommEventContentAssoc> commEventContentAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentAssoc> contentAssocList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content1")
    private List<ContentAssoc> contentAssocList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<ContentAttribute> contentAttributeList;
    @OneToMany(mappedBy = "contentId")
    private List<ContentApproval> contentApprovalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "content")
    private List<CustRequestContent> custRequestContentList;

    public Content() {
    }

    public Content(String contentId) {
        this.contentId = contentId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocaleString() {
        return localeString;
    }

    public void setLocaleString(String localeString) {
        this.localeString = localeString;
    }

    public String getMimeTypeId() {
        return mimeTypeId;
    }

    public void setMimeTypeId(String mimeTypeId) {
        this.mimeTypeId = mimeTypeId;
    }

    public BigInteger getChildLeafCount() {
        return childLeafCount;
    }

    public void setChildLeafCount(BigInteger childLeafCount) {
        this.childLeafCount = childLeafCount;
    }

    public BigInteger getChildBranchCount() {
        return childBranchCount;
    }

    public void setChildBranchCount(BigInteger childBranchCount) {
        this.childBranchCount = childBranchCount;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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

    public List<ContentPurpose> getContentPurposeList() {
        return contentPurposeList;
    }

    public void setContentPurposeList(List<ContentPurpose> contentPurposeList) {
        this.contentPurposeList = contentPurposeList;
    }

    public ContentType getContentTypeId() {
        return contentTypeId;
    }

    public void setContentTypeId(ContentType contentTypeId) {
        this.contentTypeId = contentTypeId;
    }

    public Enumeration getClassificationEnumId() {
        return classificationEnumId;
    }

    public void setClassificationEnumId(Enumeration classificationEnumId) {
        this.classificationEnumId = classificationEnumId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public CharacterSet getCharacterSetId() {
        return characterSetId;
    }

    public void setCharacterSetId(CharacterSet characterSetId) {
        this.characterSetId = characterSetId;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public Content getDecoratorContentId() {
        return decoratorContentId;
    }

    public void setDecoratorContentId(Content decoratorContentId) {
        this.decoratorContentId = decoratorContentId;
    }

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public List<Content> getContentList1() {
        return contentList1;
    }

    public void setContentList1(List<Content> contentList1) {
        this.contentList1 = contentList1;
    }

    public Content getInstanceOfContentId() {
        return instanceOfContentId;
    }

    public void setInstanceOfContentId(Content instanceOfContentId) {
        this.instanceOfContentId = instanceOfContentId;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public List<Content> getContentList2() {
        return contentList2;
    }

    public void setContentList2(List<Content> contentList2) {
        this.contentList2 = contentList2;
    }

    public Content getOwnerContentId() {
        return ownerContentId;
    }

    public void setOwnerContentId(Content ownerContentId) {
        this.ownerContentId = ownerContentId;
    }

    public Enumeration getPrivilegeEnumId() {
        return privilegeEnumId;
    }

    public void setPrivilegeEnumId(Enumeration privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public DataResource getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(DataResource dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public DataResource getTemplateDataResourceId() {
        return templateDataResourceId;
    }

    public void setTemplateDataResourceId(DataResource templateDataResourceId) {
        this.templateDataResourceId = templateDataResourceId;
    }

    public List<ContentRevision> getContentRevisionList() {
        return contentRevisionList;
    }

    public void setContentRevisionList(List<ContentRevision> contentRevisionList) {
        this.contentRevisionList = contentRevisionList;
    }

    public List<ContentMetaData> getContentMetaDataList() {
        return contentMetaDataList;
    }

    public void setContentMetaDataList(List<ContentMetaData> contentMetaDataList) {
        this.contentMetaDataList = contentMetaDataList;
    }

    public List<ContentRole> getContentRoleList() {
        return contentRoleList;
    }

    public void setContentRoleList(List<ContentRole> contentRoleList) {
        this.contentRoleList = contentRoleList;
    }

    public List<CommEventContentAssoc> getCommEventContentAssocList() {
        return commEventContentAssocList;
    }

    public void setCommEventContentAssocList(List<CommEventContentAssoc> commEventContentAssocList) {
        this.commEventContentAssocList = commEventContentAssocList;
    }

    public List<ContentAssoc> getContentAssocList() {
        return contentAssocList;
    }

    public void setContentAssocList(List<ContentAssoc> contentAssocList) {
        this.contentAssocList = contentAssocList;
    }

    public List<ContentAssoc> getContentAssocList1() {
        return contentAssocList1;
    }

    public void setContentAssocList1(List<ContentAssoc> contentAssocList1) {
        this.contentAssocList1 = contentAssocList1;
    }

    public List<ContentAttribute> getContentAttributeList() {
        return contentAttributeList;
    }

    public void setContentAttributeList(List<ContentAttribute> contentAttributeList) {
        this.contentAttributeList = contentAttributeList;
    }

    public List<ContentApproval> getContentApprovalList() {
        return contentApprovalList;
    }

    public void setContentApprovalList(List<ContentApproval> contentApprovalList) {
        this.contentApprovalList = contentApprovalList;
    }

    public List<CustRequestContent> getCustRequestContentList() {
        return custRequestContentList;
    }

    public void setCustRequestContentList(List<CustRequestContent> custRequestContentList) {
        this.custRequestContentList = custRequestContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Content)) {
            return false;
        }
        Content other = (Content) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Content[ contentId=" + contentId + " ]";
    }

    public List<OrderContent> getOrderContentList() {
        return orderContentList;
    }

    public void setOrderContentList(List<OrderContent> orderContentList) {
        this.orderContentList = orderContentList;
    }

    public List<OrderHeaderContent> getOrderHeaderContentList() {
        return orderHeaderContentList;
    }

    public void setOrderHeaderContentList(List<OrderHeaderContent> orderHeaderContentList) {
        this.orderHeaderContentList = orderHeaderContentList;
    }

    public List<PartyContent> getPartyContentList() {
        return partyContentList;
    }

    public void setPartyContentList(List<PartyContent> partyContentList) {
        this.partyContentList = partyContentList;
    }

    public List<SubscriptionResource> getSubscriptionResourceList() {
        return subscriptionResourceList;
    }

    public void setSubscriptionResourceList(List<SubscriptionResource> subscriptionResourceList) {
        this.subscriptionResourceList = subscriptionResourceList;
    }

    public List<ProductContent> getProductContentList() {
        return productContentList;
    }

    public void setProductContentList(List<ProductContent> productContentList) {
        this.productContentList = productContentList;
    }

    public List<ProdConfItemContent> getProdConfItemContentList() {
        return prodConfItemContentList;
    }

    public void setProdConfItemContentList(List<ProdConfItemContent> prodConfItemContentList) {
        this.prodConfItemContentList = prodConfItemContentList;
    }

    public List<ProductCategoryContent> getProductCategoryContentList() {
        return productCategoryContentList;
    }

    public void setProductCategoryContentList(List<ProductCategoryContent> productCategoryContentList) {
        this.productCategoryContentList = productCategoryContentList;
    }

    public List<ServerHit> getServerHitList() {
        return serverHitList;
    }

    public void setServerHitList(List<ServerHit> serverHitList) {
        this.serverHitList = serverHitList;
    }

    public List<WebSitePathAlias> getWebSitePathAliasList() {
        return webSitePathAliasList;
    }

    public void setWebSitePathAliasList(List<WebSitePathAlias> webSitePathAliasList) {
        this.webSitePathAliasList = webSitePathAliasList;
    }

    public List<WebSiteContent> getWebSiteContentList() {
        return webSiteContentList;
    }

    public void setWebSiteContentList(List<WebSiteContent> webSiteContentList) {
        this.webSiteContentList = webSiteContentList;
    }

    public List<SurveyResponseAnswer> getSurveyResponseAnswerList() {
        return surveyResponseAnswerList;
    }

    public void setSurveyResponseAnswerList(List<SurveyResponseAnswer> surveyResponseAnswerList) {
        this.surveyResponseAnswerList = surveyResponseAnswerList;
    }

    public List<ServerHitBin> getServerHitBinList() {
        return serverHitBinList;
    }

    public void setServerHitBinList(List<ServerHitBin> serverHitBinList) {
        this.serverHitBinList = serverHitBinList;
    }

    public List<WorkEffortContent> getWorkEffortContentList() {
        return workEffortContentList;
    }

    public void setWorkEffortContentList(List<WorkEffortContent> workEffortContentList) {
        this.workEffortContentList = workEffortContentList;
    }

    public List<WebPage> getWebPageList() {
        return webPageList;
    }

    public void setWebPageList(List<WebPage> webPageList) {
        this.webPageList = webPageList;
    }

    public WebSitePublishPoint getWebSitePublishPoint() {
        return webSitePublishPoint;
    }

    public void setWebSitePublishPoint(WebSitePublishPoint webSitePublishPoint) {
        this.webSitePublishPoint = webSitePublishPoint;
    }

    public List<SalesOpportunityContent> getSalesOpportunityContentList() {
        return salesOpportunityContentList;
    }

    public void setSalesOpportunityContentList(List<SalesOpportunityContent> salesOpportunityContentList) {
        this.salesOpportunityContentList = salesOpportunityContentList;
    }

    public List<QuoteContent> getQuoteContentList() {
        return quoteContentList;
    }

    public void setQuoteContentList(List<QuoteContent> quoteContentList) {
        this.quoteContentList = quoteContentList;
    }
    
}
