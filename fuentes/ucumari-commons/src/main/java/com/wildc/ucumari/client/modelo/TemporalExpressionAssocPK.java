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
public class TemporalExpressionAssocPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "FROM_TEMP_EXPR_ID")
    private String fromTempExprId;
    @Basic(optional = false)
    @Column(name = "TO_TEMP_EXPR_ID")
    private String toTempExprId;

    public TemporalExpressionAssocPK() {
    }

    public TemporalExpressionAssocPK(String fromTempExprId, String toTempExprId) {
        this.fromTempExprId = fromTempExprId;
        this.toTempExprId = toTempExprId;
    }

    public String getFromTempExprId() {
        return fromTempExprId;
    }

    public void setFromTempExprId(String fromTempExprId) {
        this.fromTempExprId = fromTempExprId;
    }

    public String getToTempExprId() {
        return toTempExprId;
    }

    public void setToTempExprId(String toTempExprId) {
        this.toTempExprId = toTempExprId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fromTempExprId != null ? fromTempExprId.hashCode() : 0);
        hash += (toTempExprId != null ? toTempExprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemporalExpressionAssocPK)) {
            return false;
        }
        TemporalExpressionAssocPK other = (TemporalExpressionAssocPK) object;
        if ((this.fromTempExprId == null && other.fromTempExprId != null) || (this.fromTempExprId != null && !this.fromTempExprId.equals(other.fromTempExprId))) {
            return false;
        }
        if ((this.toTempExprId == null && other.toTempExprId != null) || (this.toTempExprId != null && !this.toTempExprId.equals(other.toTempExprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TemporalExpressionAssocPK[ fromTempExprId=" + fromTempExprId + ", toTempExprId=" + toTempExprId + " ]";
    }
    
}
