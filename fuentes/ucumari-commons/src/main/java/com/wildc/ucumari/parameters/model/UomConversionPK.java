/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class UomConversionPK implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8043361409196689662L;
	@Basic(optional = false)
    @Column(name = "UOM_ID")
    private String uomId;
    @Basic(optional = false)
    @Column(name = "UOM_ID_TO")
    private String uomIdTo;

    public UomConversionPK() {
    }

    public UomConversionPK(String uomId, String uomIdTo) {
        this.uomId = uomId;
        this.uomIdTo = uomIdTo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uomId != null ? uomId.hashCode() : 0);
        hash += (uomIdTo != null ? uomIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UomConversionPK)) {
            return false;
        }
        UomConversionPK other = (UomConversionPK) object;
        if ((this.uomId == null && other.uomId != null) || (this.uomId != null && !this.uomId.equals(other.uomId))) {
            return false;
        }
        if ((this.uomIdTo == null && other.uomIdTo != null) || (this.uomIdTo != null && !this.uomIdTo.equals(other.uomIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UomConversionPK[ uomId=" + uomId + ", uomIdTo=" + uomIdTo + " ]";
    }
    
}
