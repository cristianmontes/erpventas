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
public class InvSttsGlacctTypePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "STATUS_ID_FROM")
    private String statusIdFrom;
    @Basic(optional = false)
    @Column(name = "STATUS_ID_TO")
    private String statusIdTo;

    public InvSttsGlacctTypePK() {
    }

    public InvSttsGlacctTypePK(String statusIdFrom, String statusIdTo) {
        this.statusIdFrom = statusIdFrom;
        this.statusIdTo = statusIdTo;
    }

    public String getStatusIdFrom() {
        return statusIdFrom;
    }

    public void setStatusIdFrom(String statusIdFrom) {
        this.statusIdFrom = statusIdFrom;
    }

    public String getStatusIdTo() {
        return statusIdTo;
    }

    public void setStatusIdTo(String statusIdTo) {
        this.statusIdTo = statusIdTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (statusIdFrom != null ? statusIdFrom.hashCode() : 0);
        hash += (statusIdTo != null ? statusIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvSttsGlacctTypePK)) {
            return false;
        }
        InvSttsGlacctTypePK other = (InvSttsGlacctTypePK) object;
        if ((this.statusIdFrom == null && other.statusIdFrom != null) || (this.statusIdFrom != null && !this.statusIdFrom.equals(other.statusIdFrom))) {
            return false;
        }
        if ((this.statusIdTo == null && other.statusIdTo != null) || (this.statusIdTo != null && !this.statusIdTo.equals(other.statusIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvSttsGlacctTypePK[ statusIdFrom=" + statusIdFrom + ", statusIdTo=" + statusIdTo + " ]";
    }
    
}
