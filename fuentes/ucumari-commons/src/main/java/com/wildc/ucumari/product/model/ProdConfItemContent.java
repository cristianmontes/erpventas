/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.client.modelo.Content;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "prod_conf_item_content")
@NamedQueries({
    @NamedQuery(name = "ProdConfItemContent.findAll", query = "SELECT p FROM ProdConfItemContent p")})
public class ProdConfItemContent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProdConfItemContentPK prodConfItemContentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "CONF_ITEM_CONTENT_TYPE_ID", referencedColumnName = "CONF_ITEM_CONTENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProdConfItemContentType prodConfItemContentType;
    @JoinColumn(name = "CONFIG_ITEM_ID", referencedColumnName = "CONFIG_ITEM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ProductConfigItem productConfigItem;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;

    public ProdConfItemContent() {
    }

    public ProdConfItemContent(ProdConfItemContentPK prodConfItemContentPK) {
        this.prodConfItemContentPK = prodConfItemContentPK;
    }

    public ProdConfItemContent(String configItemId, String contentId, String confItemContentTypeId, Date fromDate) {
        this.prodConfItemContentPK = new ProdConfItemContentPK(configItemId, contentId, confItemContentTypeId, fromDate);
    }

    public ProdConfItemContentPK getProdConfItemContentPK() {
        return prodConfItemContentPK;
    }

    public void setProdConfItemContentPK(ProdConfItemContentPK prodConfItemContentPK) {
        this.prodConfItemContentPK = prodConfItemContentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public ProdConfItemContentType getProdConfItemContentType() {
        return prodConfItemContentType;
    }

    public void setProdConfItemContentType(ProdConfItemContentType prodConfItemContentType) {
        this.prodConfItemContentType = prodConfItemContentType;
    }

    public ProductConfigItem getProductConfigItem() {
        return productConfigItem;
    }

    public void setProductConfigItem(ProductConfigItem productConfigItem) {
        this.productConfigItem = productConfigItem;
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
        hash += (prodConfItemContentPK != null ? prodConfItemContentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdConfItemContent)) {
            return false;
        }
        ProdConfItemContent other = (ProdConfItemContent) object;
        if ((this.prodConfItemContentPK == null && other.prodConfItemContentPK != null) || (this.prodConfItemContentPK != null && !this.prodConfItemContentPK.equals(other.prodConfItemContentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdConfItemContent[ prodConfItemContentPK=" + prodConfItemContentPK + " ]";
    }
    
}
