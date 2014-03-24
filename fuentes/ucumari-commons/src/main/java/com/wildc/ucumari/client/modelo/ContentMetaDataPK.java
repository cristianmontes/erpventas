/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ContentMetaDataPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "META_DATA_PREDICATE_ID")
    private String metaDataPredicateId;
    @Basic(optional = false)
    @Column(name = "META_DATA_VALUE")
    private String metaDataValue;

    public ContentMetaDataPK() {
    }

    public ContentMetaDataPK(String contentId, String metaDataPredicateId, String metaDataValue) {
        this.contentId = contentId;
        this.metaDataPredicateId = metaDataPredicateId;
        this.metaDataValue = metaDataValue;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getMetaDataPredicateId() {
        return metaDataPredicateId;
    }

    public void setMetaDataPredicateId(String metaDataPredicateId) {
        this.metaDataPredicateId = metaDataPredicateId;
    }

    public String getMetaDataValue() {
        return metaDataValue;
    }

    public void setMetaDataValue(String metaDataValue) {
        this.metaDataValue = metaDataValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (metaDataPredicateId != null ? metaDataPredicateId.hashCode() : 0);
        hash += (metaDataValue != null ? metaDataValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentMetaDataPK)) {
            return false;
        }
        ContentMetaDataPK other = (ContentMetaDataPK) object;
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.metaDataPredicateId == null && other.metaDataPredicateId != null) || (this.metaDataPredicateId != null && !this.metaDataPredicateId.equals(other.metaDataPredicateId))) {
            return false;
        }
        if ((this.metaDataValue == null && other.metaDataValue != null) || (this.metaDataValue != null && !this.metaDataValue.equals(other.metaDataValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentMetaDataPK[ contentId=" + contentId + ", metaDataPredicateId=" + metaDataPredicateId + ", metaDataValue=" + metaDataValue + " ]";
    }
    
}
