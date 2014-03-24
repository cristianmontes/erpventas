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
@Table(name = "content_assoc_predicate")
@NamedQueries({
    @NamedQuery(name = "ContentAssocPredicate.findAll", query = "SELECT c FROM ContentAssocPredicate c")})
public class ContentAssocPredicate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTENT_ASSOC_PREDICATE_ID")
    private String contentAssocPredicateId;
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
    @OneToMany(mappedBy = "contentAssocPredicateId")
    private List<ContentAssoc> contentAssocList;

    public ContentAssocPredicate() {
    }

    public ContentAssocPredicate(String contentAssocPredicateId) {
        this.contentAssocPredicateId = contentAssocPredicateId;
    }

    public String getContentAssocPredicateId() {
        return contentAssocPredicateId;
    }

    public void setContentAssocPredicateId(String contentAssocPredicateId) {
        this.contentAssocPredicateId = contentAssocPredicateId;
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

    public List<ContentAssoc> getContentAssocList() {
        return contentAssocList;
    }

    public void setContentAssocList(List<ContentAssoc> contentAssocList) {
        this.contentAssocList = contentAssocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentAssocPredicateId != null ? contentAssocPredicateId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentAssocPredicate)) {
            return false;
        }
        ContentAssocPredicate other = (ContentAssocPredicate) object;
        if ((this.contentAssocPredicateId == null && other.contentAssocPredicateId != null) || (this.contentAssocPredicateId != null && !this.contentAssocPredicateId.equals(other.contentAssocPredicateId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentAssocPredicate[ contentAssocPredicateId=" + contentAssocPredicateId + " ]";
    }
    
}
