/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProdConfItemContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "CONF_ITEM_CONTENT_TYPE_ID")
    private String confItemContentTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProdConfItemContentPK() {
    }

    public ProdConfItemContentPK(String configItemId, String contentId, String confItemContentTypeId, Date fromDate) {
        this.configItemId = configItemId;
        this.contentId = contentId;
        this.confItemContentTypeId = confItemContentTypeId;
        this.fromDate = fromDate;
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getConfItemContentTypeId() {
        return confItemContentTypeId;
    }

    public void setConfItemContentTypeId(String confItemContentTypeId) {
        this.confItemContentTypeId = confItemContentTypeId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (confItemContentTypeId != null ? confItemContentTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdConfItemContentPK)) {
            return false;
        }
        ProdConfItemContentPK other = (ProdConfItemContentPK) object;
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.confItemContentTypeId == null && other.confItemContentTypeId != null) || (this.confItemContentTypeId != null && !this.confItemContentTypeId.equals(other.confItemContentTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdConfItemContentPK[ configItemId=" + configItemId + ", contentId=" + contentId + ", confItemContentTypeId=" + confItemContentTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
