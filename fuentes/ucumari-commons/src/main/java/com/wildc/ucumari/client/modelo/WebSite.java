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

import com.wildc.ucumari.product.model.ProductStore;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "web_site")
@NamedQueries({
    @NamedQuery(name = "WebSite.findAll", query = "SELECT w FROM WebSite w")})
public class WebSite implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webSite")
    private List<WebSitePathAlias> webSitePathAliasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webSite")
    private List<WebSiteContent> webSiteContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "webSite")
    private List<WebSiteRole> webSiteRoleList;
    @OneToMany(mappedBy = "webSiteId")
    private List<WebslingerServer> webslingerServerList;
    @OneToMany(mappedBy = "webSiteId")
    private List<WebPage> webPageList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_SITE_ID")
    private String webSiteId;
    @Column(name = "SITE_NAME")
    private String siteName;
    @Column(name = "HTTP_HOST")
    private String httpHost;
    @Column(name = "HTTP_PORT")
    private String httpPort;
    @Column(name = "HTTPS_HOST")
    private String httpsHost;
    @Column(name = "HTTPS_PORT")
    private String httpsPort;
    @Column(name = "ENABLE_HTTPS")
    private Character enableHttps;
    @Column(name = "STANDARD_CONTENT_PREFIX")
    private String standardContentPrefix;
    @Column(name = "SECURE_CONTENT_PREFIX")
    private String secureContentPrefix;
    @Column(name = "COOKIE_DOMAIN")
    private String cookieDomain;
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
    @Column(name = "ALLOW_PRODUCT_STORE_CHANGE")
    private Character allowProductStoreChange;
    @JoinColumn(name = "VISUAL_THEME_SET_ID", referencedColumnName = "VISUAL_THEME_SET_ID")
    @ManyToOne
    private VisualThemeSet visualThemeSetId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @OneToMany(mappedBy = "webSiteId")
    private List<SubscriptionResource> subscriptionResourceList;

    public WebSite() {
    }

    public WebSite(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getWebSiteId() {
        return webSiteId;
    }

    public void setWebSiteId(String webSiteId) {
        this.webSiteId = webSiteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getHttpHost() {
        return httpHost;
    }

    public void setHttpHost(String httpHost) {
        this.httpHost = httpHost;
    }

    public String getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(String httpPort) {
        this.httpPort = httpPort;
    }

    public String getHttpsHost() {
        return httpsHost;
    }

    public void setHttpsHost(String httpsHost) {
        this.httpsHost = httpsHost;
    }

    public String getHttpsPort() {
        return httpsPort;
    }

    public void setHttpsPort(String httpsPort) {
        this.httpsPort = httpsPort;
    }

    public Character getEnableHttps() {
        return enableHttps;
    }

    public void setEnableHttps(Character enableHttps) {
        this.enableHttps = enableHttps;
    }

    public String getStandardContentPrefix() {
        return standardContentPrefix;
    }

    public void setStandardContentPrefix(String standardContentPrefix) {
        this.standardContentPrefix = standardContentPrefix;
    }

    public String getSecureContentPrefix() {
        return secureContentPrefix;
    }

    public void setSecureContentPrefix(String secureContentPrefix) {
        this.secureContentPrefix = secureContentPrefix;
    }

    public String getCookieDomain() {
        return cookieDomain;
    }

    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
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

    public Character getAllowProductStoreChange() {
        return allowProductStoreChange;
    }

    public void setAllowProductStoreChange(Character allowProductStoreChange) {
        this.allowProductStoreChange = allowProductStoreChange;
    }

    public VisualThemeSet getVisualThemeSetId() {
        return visualThemeSetId;
    }

    public void setVisualThemeSetId(VisualThemeSet visualThemeSetId) {
        this.visualThemeSetId = visualThemeSetId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public List<SubscriptionResource> getSubscriptionResourceList() {
        return subscriptionResourceList;
    }

    public void setSubscriptionResourceList(List<SubscriptionResource> subscriptionResourceList) {
        this.subscriptionResourceList = subscriptionResourceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webSiteId != null ? webSiteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebSite)) {
            return false;
        }
        WebSite other = (WebSite) object;
        if ((this.webSiteId == null && other.webSiteId != null) || (this.webSiteId != null && !this.webSiteId.equals(other.webSiteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebSite[ webSiteId=" + webSiteId + " ]";
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

    public List<WebSiteRole> getWebSiteRoleList() {
        return webSiteRoleList;
    }

    public void setWebSiteRoleList(List<WebSiteRole> webSiteRoleList) {
        this.webSiteRoleList = webSiteRoleList;
    }

    public List<WebslingerServer> getWebslingerServerList() {
        return webslingerServerList;
    }

    public void setWebslingerServerList(List<WebslingerServer> webslingerServerList) {
        this.webslingerServerList = webslingerServerList;
    }

    public List<WebPage> getWebPageList() {
        return webPageList;
    }

    public void setWebPageList(List<WebPage> webPageList) {
        this.webPageList = webPageList;
    }
    
}
