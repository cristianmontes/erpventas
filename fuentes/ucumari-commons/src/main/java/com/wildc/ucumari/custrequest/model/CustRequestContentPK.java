/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.custrequest.model;

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
public class CustRequestContentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUST_REQUEST_ID")
    private String custRequestId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public CustRequestContentPK() {
    }

    public CustRequestContentPK(String custRequestId, String contentId, Date fromDate) {
        this.custRequestId = custRequestId;
        this.contentId = contentId;
        this.fromDate = fromDate;
    }

    public String getCustRequestId() {
        return custRequestId;
    }

    public void setCustRequestId(String custRequestId) {
        this.custRequestId = custRequestId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
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
        hash += (custRequestId != null ? custRequestId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustRequestContentPK)) {
            return false;
        }
        CustRequestContentPK other = (CustRequestContentPK) object;
        if ((this.custRequestId == null && other.custRequestId != null) || (this.custRequestId != null && !this.custRequestId.equals(other.custRequestId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CustRequestContentPK[ custRequestId=" + custRequestId + ", contentId=" + contentId + ", fromDate=" + fromDate + " ]";
    }
    
}
