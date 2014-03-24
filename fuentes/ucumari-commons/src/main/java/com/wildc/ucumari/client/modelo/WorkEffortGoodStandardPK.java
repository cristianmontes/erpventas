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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class WorkEffortGoodStandardPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_ID")
    private String workEffortId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "WORK_EFFORT_GOOD_STD_TYPE_ID")
    private String workEffortGoodStdTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public WorkEffortGoodStandardPK() {
    }

    public WorkEffortGoodStandardPK(String workEffortId, String productId, String workEffortGoodStdTypeId, Date fromDate) {
        this.workEffortId = workEffortId;
        this.productId = productId;
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
        this.fromDate = fromDate;
    }

    public String getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getWorkEffortGoodStdTypeId() {
        return workEffortGoodStdTypeId;
    }

    public void setWorkEffortGoodStdTypeId(String workEffortGoodStdTypeId) {
        this.workEffortGoodStdTypeId = workEffortGoodStdTypeId;
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
        hash += (workEffortId != null ? workEffortId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (workEffortGoodStdTypeId != null ? workEffortGoodStdTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortGoodStandardPK)) {
            return false;
        }
        WorkEffortGoodStandardPK other = (WorkEffortGoodStandardPK) object;
        if ((this.workEffortId == null && other.workEffortId != null) || (this.workEffortId != null && !this.workEffortId.equals(other.workEffortId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.workEffortGoodStdTypeId == null && other.workEffortGoodStdTypeId != null) || (this.workEffortGoodStdTypeId != null && !this.workEffortGoodStdTypeId.equals(other.workEffortGoodStdTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortGoodStandardPK[ workEffortId=" + workEffortId + ", productId=" + productId + ", workEffortGoodStdTypeId=" + workEffortGoodStdTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
