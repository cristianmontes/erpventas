/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

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
public class UomConversionDatedPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8022559796846068054L;
	@Basic(optional = false)
    @Column(name = "UOM_ID")
    private String uomId;
    @Basic(optional = false)
    @Column(name = "UOM_ID_TO")
    private String uomIdTo;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public UomConversionDatedPK() {
    }

    public UomConversionDatedPK(String uomId, String uomIdTo, Date fromDate) {
        this.uomId = uomId;
        this.uomIdTo = uomIdTo;
        this.fromDate = fromDate;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
    }

    public String getUomIdTo() {
        return uomIdTo;
    }

    public void setUomIdTo(String uomIdTo) {
        this.uomIdTo = uomIdTo;
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
        hash += (uomId != null ? uomId.hashCode() : 0);
        hash += (uomIdTo != null ? uomIdTo.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UomConversionDatedPK)) {
            return false;
        }
        UomConversionDatedPK other = (UomConversionDatedPK) object;
        if ((this.uomId == null && other.uomId != null) || (this.uomId != null && !this.uomId.equals(other.uomId))) {
            return false;
        }
        if ((this.uomIdTo == null && other.uomIdTo != null) || (this.uomIdTo != null && !this.uomIdTo.equals(other.uomIdTo))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UomConversionDatedPK[ uomId=" + uomId + ", uomIdTo=" + uomIdTo + ", fromDate=" + fromDate + " ]";
    }
    
}
