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
public class StatusValidChangePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "STATUS_ID_TO")
    private String statusIdTo;

    public StatusValidChangePK() {
    }

    public StatusValidChangePK(String statusId, String statusIdTo) {
        this.statusId = statusId;
        this.statusIdTo = statusIdTo;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
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
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (statusIdTo != null ? statusIdTo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StatusValidChangePK)) {
            return false;
        }
        StatusValidChangePK other = (StatusValidChangePK) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.statusIdTo == null && other.statusIdTo != null) || (this.statusIdTo != null && !this.statusIdTo.equals(other.statusIdTo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.StatusValidChangePK[ statusId=" + statusId + ", statusIdTo=" + statusIdTo + " ]";
    }
    
}
