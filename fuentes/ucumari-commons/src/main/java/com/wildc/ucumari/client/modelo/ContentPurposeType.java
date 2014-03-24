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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "content_purpose_type")
@NamedQueries({
    @NamedQuery(name = "ContentPurposeType.findAll", query = "SELECT c FROM ContentPurposeType c")})
public class ContentPurposeType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contentPurposeType")
    private List<DataResourcePurpose> dataResourcePurposeList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_PURPOSE_TYPE_ID")
    private String contentPurposeTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contentPurposeType")
    private List<ContentPurpose> contentPurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contentPurposeType")
    private List<ContentPurposeOperation> contentPurposeOperationList;

    public ContentPurposeType() {
    }

    public ContentPurposeType(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    public String getContentPurposeTypeId() {
        return contentPurposeTypeId;
    }

    public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
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

    public List<ContentPurpose> getContentPurposeList() {
        return contentPurposeList;
    }

    public void setContentPurposeList(List<ContentPurpose> contentPurposeList) {
        this.contentPurposeList = contentPurposeList;
    }

    public List<ContentPurposeOperation> getContentPurposeOperationList() {
        return contentPurposeOperationList;
    }

    public void setContentPurposeOperationList(List<ContentPurposeOperation> contentPurposeOperationList) {
        this.contentPurposeOperationList = contentPurposeOperationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentPurposeTypeId != null ? contentPurposeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentPurposeType)) {
            return false;
        }
        ContentPurposeType other = (ContentPurposeType) object;
        if ((this.contentPurposeTypeId == null && other.contentPurposeTypeId != null) || (this.contentPurposeTypeId != null && !this.contentPurposeTypeId.equals(other.contentPurposeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentPurposeType[ contentPurposeTypeId=" + contentPurposeTypeId + " ]";
    }

    public List<DataResourcePurpose> getDataResourcePurposeList() {
        return dataResourcePurposeList;
    }

    public void setDataResourcePurposeList(List<DataResourcePurpose> dataResourcePurposeList) {
        this.dataResourcePurposeList = dataResourcePurposeList;
    }
    
}
