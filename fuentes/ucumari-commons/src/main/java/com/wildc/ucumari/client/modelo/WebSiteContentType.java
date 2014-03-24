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
@Table(name = "web_site_content_type")
@NamedQueries({
    @NamedQuery(name = "WebSiteContentType.findAll", query = "SELECT w FROM WebSiteContentType w")})
public class WebSiteContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_SITE_CONTENT_TYPE_ID")
    private String webSiteContentTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webSiteContentType")
    private List<WebSiteContent> webSiteContentList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<WebSiteContentType> webSiteContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "WEB_SITE_CONTENT_TYPE_ID")
    @ManyToOne
    private WebSiteContentType parentTypeId;

    public WebSiteContentType() {
    }

    public WebSiteContentType(String webSiteContentTypeId) {
        this.webSiteContentTypeId = webSiteContentTypeId;
    }

    public String getWebSiteContentTypeId() {
        return webSiteContentTypeId;
    }

    public void setWebSiteContentTypeId(String webSiteContentTypeId) {
        this.webSiteContentTypeId = webSiteContentTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<WebSiteContent> getWebSiteContentList() {
        return webSiteContentList;
    }

    public void setWebSiteContentList(List<WebSiteContent> webSiteContentList) {
        this.webSiteContentList = webSiteContentList;
    }

    public List<WebSiteContentType> getWebSiteContentTypeList() {
        return webSiteContentTypeList;
    }

    public void setWebSiteContentTypeList(List<WebSiteContentType> webSiteContentTypeList) {
        this.webSiteContentTypeList = webSiteContentTypeList;
    }

    public WebSiteContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(WebSiteContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSiteContentTypeId != null ? webSiteContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSiteContentType)) {
            return false;
        }
        WebSiteContentType other = (WebSiteContentType) object;
        if ((this.webSiteContentTypeId == null && other.webSiteContentTypeId != null) || (this.webSiteContentTypeId != null && !this.webSiteContentTypeId.equals(other.webSiteContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSiteContentType[ webSiteContentTypeId=" + webSiteContentTypeId + " ]";
    }
    
}
