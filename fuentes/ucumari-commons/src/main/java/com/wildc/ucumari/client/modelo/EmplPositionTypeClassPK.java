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
public class EmplPositionTypeClassPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_TYPE_ID")
    private String emplPositionTypeId;
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_CLASS_TYPE_ID")
    private String emplPositionClassTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public EmplPositionTypeClassPK() {
    }

    public EmplPositionTypeClassPK(String emplPositionTypeId, String emplPositionClassTypeId, Date fromDate) {
        this.emplPositionTypeId = emplPositionTypeId;
        this.emplPositionClassTypeId = emplPositionClassTypeId;
        this.fromDate = fromDate;
    }

    public String getEmplPositionTypeId() {
        return emplPositionTypeId;
    }

    public void setEmplPositionTypeId(String emplPositionTypeId) {
        this.emplPositionTypeId = emplPositionTypeId;
    }

    public String getEmplPositionClassTypeId() {
        return emplPositionClassTypeId;
    }

    public void setEmplPositionClassTypeId(String emplPositionClassTypeId) {
        this.emplPositionClassTypeId = emplPositionClassTypeId;
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
        hash += (emplPositionClassTypeId != null ? emplPositionClassTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionTypeClassPK)) {
            return false;
        }
        EmplPositionTypeClassPK other = (EmplPositionTypeClassPK) object;
        if ((this.emplPositionTypeId == null && other.emplPositionTypeId != null) || (this.emplPositionTypeId != null && !this.emplPositionTypeId.equals(other.emplPositionTypeId))) {
            return false;
        }
        if ((this.emplPositionClassTypeId == null && other.emplPositionClassTypeId != null) || (this.emplPositionClassTypeId != null && !this.emplPositionClassTypeId.equals(other.emplPositionClassTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionTypeClassPK[ emplPositionTypeId=" + emplPositionTypeId + ", emplPositionClassTypeId=" + emplPositionClassTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
