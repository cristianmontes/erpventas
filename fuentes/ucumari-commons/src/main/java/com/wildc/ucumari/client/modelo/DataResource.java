/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.product.model.ProductFeatureDataResource;
import com.wildc.ucumari.security.model.UserLogin;
import java.io.Serializable;
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
@Table(name = "data_resource")
@NamedQueries({
    @NamedQuery(name = "DataResource.findAll", query = "SELECT d FROM DataResource d")})
public class DataResource implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private VideoDataResource videoDataResource;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private List<ProductFeatureDataResource> productFeatureDataResourceList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private OtherDataResource otherDataResource;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private ImageDataResource imageDataResource;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private List<DataResourcePurpose> dataResourcePurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private List<DataResourceAttribute> dataResourceAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private List<DataResourceRole> dataResourceRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private List<DataResourceMetaData> dataResourceMetaDataList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private ElectronicText electronicText;
    @OneToMany(mappedBy = "dataResourceId")
    private List<Content> contentList;
    @OneToMany(mappedBy = "templateDataResourceId")
    private List<Content> contentList1;
    @OneToMany(mappedBy = "oldDataResourceId")
    private List<ContentRevisionItem> contentRevisionItemList;
    @OneToMany(mappedBy = "newDataResourceId")
    private List<ContentRevisionItem> contentRevisionItemList1;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_ID")
    private String dataResourceId;
    @Column(name = "DATA_RESOURCE_NAME")
    private String dataResourceName;
    @Column(name = "LOCALE_STRING")
    private String localeString;
    @Column(name = "MIME_TYPE_ID")
    private String mimeTypeId;
    @Column(name = "OBJECT_INFO")
    private String objectInfo;
    @Column(name = "RELATED_DETAIL_ID")
    private String relatedDetailId;
    @Column(name = "IS_PUBLIC")
    private Character isPublic;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "DATA_RESOURCE_TYPE_ID", referencedColumnName = "DATA_RESOURCE_TYPE_ID")
    @ManyToOne
    private DataResourceType dataResourceTypeId;
    @JoinColumn(name = "DATA_TEMPLATE_TYPE_ID", referencedColumnName = "DATA_TEMPLATE_TYPE_ID")
    @ManyToOne
    private DataTemplateType dataTemplateTypeId;
    @JoinColumn(name = "DATA_CATEGORY_ID", referencedColumnName = "DATA_CATEGORY_ID")
    @ManyToOne
    private DataCategory dataCategoryId;
    @JoinColumn(name = "SURVEY_RESPONSE_ID", referencedColumnName = "SURVEY_RESPONSE_ID")
    @ManyToOne
    private SurveyResponse surveyResponseId;
    @JoinColumn(name = "SURVEY_ID", referencedColumnName = "SURVEY_ID")
    @ManyToOne
    private Survey surveyId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @JoinColumn(name = "CHARACTER_SET_ID", referencedColumnName = "CHARACTER_SET_ID")
    @ManyToOne
    private CharacterSet characterSetId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "dataResource")
    private AudioDataResource audioDataResource;

    public DataResource() {
    }

    public DataResource(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getDataResourceName() {
        return dataResourceName;
    }

    public void setDataResourceName(String dataResourceName) {
        this.dataResourceName = dataResourceName;
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

    public String getObjectInfo() {
        return objectInfo;
    }

    public void setObjectInfo(String objectInfo) {
        this.objectInfo = objectInfo;
    }

    public String getRelatedDetailId() {
        return relatedDetailId;
    }

    public void setRelatedDetailId(String relatedDetailId) {
        this.relatedDetailId = relatedDetailId;
    }

    public Character getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Character isPublic) {
        this.isPublic = isPublic;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public DataResourceType getDataResourceTypeId() {
        return dataResourceTypeId;
    }

    public void setDataResourceTypeId(DataResourceType dataResourceTypeId) {
        this.dataResourceTypeId = dataResourceTypeId;
    }

    public DataTemplateType getDataTemplateTypeId() {
        return dataTemplateTypeId;
    }

    public void setDataTemplateTypeId(DataTemplateType dataTemplateTypeId) {
        this.dataTemplateTypeId = dataTemplateTypeId;
    }

    public DataCategory getDataCategoryId() {
        return dataCategoryId;
    }

    public void setDataCategoryId(DataCategory dataCategoryId) {
        this.dataCategoryId = dataCategoryId;
    }

    public SurveyResponse getSurveyResponseId() {
        return surveyResponseId;
    }

    public void setSurveyResponseId(SurveyResponse surveyResponseId) {
        this.surveyResponseId = surveyResponseId;
    }

    public Survey getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Survey surveyId) {
        this.surveyId = surveyId;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public CharacterSet getCharacterSetId() {
        return characterSetId;
    }

    public void setCharacterSetId(CharacterSet characterSetId) {
        this.characterSetId = characterSetId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public AudioDataResource getAudioDataResource() {
        return audioDataResource;
    }

    public void setAudioDataResource(AudioDataResource audioDataResource) {
        this.audioDataResource = audioDataResource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceId != null ? dataResourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataResource)) {
            return false;
        }
        DataResource other = (DataResource) object;
        if ((this.dataResourceId == null && other.dataResourceId != null) || (this.dataResourceId != null && !this.dataResourceId.equals(other.dataResourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataResource[ dataResourceId=" + dataResourceId + " ]";
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    public List<Content> getContentList1() {
        return contentList1;
    }

    public void setContentList1(List<Content> contentList1) {
        this.contentList1 = contentList1;
    }

    public List<ContentRevisionItem> getContentRevisionItemList() {
        return contentRevisionItemList;
    }

    public void setContentRevisionItemList(List<ContentRevisionItem> contentRevisionItemList) {
        this.contentRevisionItemList = contentRevisionItemList;
    }

    public List<ContentRevisionItem> getContentRevisionItemList1() {
        return contentRevisionItemList1;
    }

    public void setContentRevisionItemList1(List<ContentRevisionItem> contentRevisionItemList1) {
        this.contentRevisionItemList1 = contentRevisionItemList1;
    }

    public List<DataResourcePurpose> getDataResourcePurposeList() {
        return dataResourcePurposeList;
    }

    public void setDataResourcePurposeList(List<DataResourcePurpose> dataResourcePurposeList) {
        this.dataResourcePurposeList = dataResourcePurposeList;
    }

    public List<DataResourceAttribute> getDataResourceAttributeList() {
        return dataResourceAttributeList;
    }

    public void setDataResourceAttributeList(List<DataResourceAttribute> dataResourceAttributeList) {
        this.dataResourceAttributeList = dataResourceAttributeList;
    }

    public List<DataResourceRole> getDataResourceRoleList() {
        return dataResourceRoleList;
    }

    public void setDataResourceRoleList(List<DataResourceRole> dataResourceRoleList) {
        this.dataResourceRoleList = dataResourceRoleList;
    }

    public List<DataResourceMetaData> getDataResourceMetaDataList() {
        return dataResourceMetaDataList;
    }

    public void setDataResourceMetaDataList(List<DataResourceMetaData> dataResourceMetaDataList) {
        this.dataResourceMetaDataList = dataResourceMetaDataList;
    }

    public ElectronicText getElectronicText() {
        return electronicText;
    }

    public void setElectronicText(ElectronicText electronicText) {
        this.electronicText = electronicText;
    }

    public ImageDataResource getImageDataResource() {
        return imageDataResource;
    }

    public void setImageDataResource(ImageDataResource imageDataResource) {
        this.imageDataResource = imageDataResource;
    }

    public OtherDataResource getOtherDataResource() {
        return otherDataResource;
    }

    public void setOtherDataResource(OtherDataResource otherDataResource) {
        this.otherDataResource = otherDataResource;
    }

    public List<ProductFeatureDataResource> getProductFeatureDataResourceList() {
        return productFeatureDataResourceList;
    }

    public void setProductFeatureDataResourceList(List<ProductFeatureDataResource> productFeatureDataResourceList) {
        this.productFeatureDataResourceList = productFeatureDataResourceList;
    }

    public VideoDataResource getVideoDataResource() {
        return videoDataResource;
    }

    public void setVideoDataResource(VideoDataResource videoDataResource) {
        this.videoDataResource = videoDataResource;
    }
    
}
