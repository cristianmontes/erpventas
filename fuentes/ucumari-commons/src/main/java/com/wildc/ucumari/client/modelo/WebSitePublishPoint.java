/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "web_site_publish_point")
@NamedQueries({
    @NamedQuery(name = "WebSitePublishPoint.findAll", query = "SELECT w FROM WebSitePublishPoint w")})
public class WebSitePublishPoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Column(name = "TEMPLATE_TITLE")
    private String templateTitle;
    @Column(name = "STYLE_SHEET_FILE")
    private String styleSheetFile;
    @Column(name = "LOGO")
    private String logo;
    @Column(name = "MEDALLION_LOGO")
    private String medallionLogo;
    @Column(name = "LINE_LOGO")
    private String lineLogo;
    @Column(name = "LEFT_BAR_ID")
    private String leftBarId;
    @Column(name = "RIGHT_BAR_ID")
    private String rightBarId;
    @Column(name = "CONTENT_DEPT")
    private String contentDept;
    @Column(name = "ABOUT_CONTENT_ID")
    private String aboutContentId;
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
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Content content;

    public WebSitePublishPoint() {
    }

    public WebSitePublishPoint(String contentId) {
        this.contentId = contentId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }

    public String getStyleSheetFile() {
        return styleSheetFile;
    }

    public void setStyleSheetFile(String styleSheetFile) {
        this.styleSheetFile = styleSheetFile;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getMedallionLogo() {
        return medallionLogo;
    }

    public void setMedallionLogo(String medallionLogo) {
        this.medallionLogo = medallionLogo;
    }

    public String getLineLogo() {
        return lineLogo;
    }

    public void setLineLogo(String lineLogo) {
        this.lineLogo = lineLogo;
    }

    public String getLeftBarId() {
        return leftBarId;
    }

    public void setLeftBarId(String leftBarId) {
        this.leftBarId = leftBarId;
    }

    public String getRightBarId() {
        return rightBarId;
    }

    public void setRightBarId(String rightBarId) {
        this.rightBarId = rightBarId;
    }

    public String getContentDept() {
        return contentDept;
    }

    public void setContentDept(String contentDept) {
        this.contentDept = contentDept;
    }

    public String getAboutContentId() {
        return aboutContentId;
    }

    public void setAboutContentId(String aboutContentId) {
        this.aboutContentId = aboutContentId;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
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
        if (!(object instanceof WebSitePublishPoint)) {
            return false;
        }
        WebSitePublishPoint other = (WebSitePublishPoint) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSitePublishPoint[ contentId=" + contentId + " ]";
    }
    
}
