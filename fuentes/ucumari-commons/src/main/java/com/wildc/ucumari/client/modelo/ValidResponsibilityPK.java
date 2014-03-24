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
public class ValidResponsibilityPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_TYPE_ID")
    private String emplPositionTypeId;
    @Basic(optional = false)
    @Column(name = "RESPONSIBILITY_TYPE_ID")
    private String responsibilityTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ValidResponsibilityPK() {
    }

    public ValidResponsibilityPK(String emplPositionTypeId, String responsibilityTypeId, Date fromDate) {
        this.emplPositionTypeId = emplPositionTypeId;
        this.responsibilityTypeId = responsibilityTypeId;
        this.fromDate = fromDate;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public String getResponsibilityTypeId() {
        return responsibilityTypeId;
    }

    public void setResponsibilityTypeId(String responsibilityTypeId) {
        this.responsibilityTypeId = responsibilityTypeId;
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
        hash += (emplPositionTypeId != null ? emplPositionTypeId.hashCode() : 0);
        hash += (responsibilityTypeId != null ? responsibilityTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValidResponsibilityPK)) {
            return false;
        }
        ValidResponsibilityPK other = (ValidResponsibilityPK) object;
        if ((this.emplPositionTypeId == null && other.emplPositionTypeId != null) || (this.emplPositionTypeId != null && !this.emplPositionTypeId.equals(other.emplPositionTypeId))) {
            return false;
        }
        if ((this.responsibilityTypeId == null && other.responsibilityTypeId != null) || (this.responsibilityTypeId != null && !this.responsibilityTypeId.equals(other.responsibilityTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ValidResponsibilityPK[ emplPositionTypeId=" + emplPositionTypeId + ", responsibilityTypeId=" + responsibilityTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
