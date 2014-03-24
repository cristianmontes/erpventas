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
public class ServerHitPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Basic(optional = false)
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Basic(optional = false)
    @Column(name = "HIT_START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hitStartDateTime;
    @Basic(optional = false)
    @Column(name = "HIT_TYPE_ID")
    private String hitTypeId;

    public ServerHitPK() {
    }

    public ServerHitPK(String visitId, String contentId, Date hitStartDateTime, String hitTypeId) {
        this.visitId = visitId;
        this.contentId = contentId;
        this.hitStartDateTime = hitStartDateTime;
        this.hitTypeId = hitTypeId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public Date getHitStartDateTime() {
        return hitStartDateTime;
    }

    public void setHitStartDateTime(Date hitStartDateTime) {
        this.hitStartDateTime = hitStartDateTime;
    }

    public String getHitTypeId() {
        return hitTypeId;
    }

    public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitId != null ? visitId.hashCode() : 0);
        hash += (contentId != null ? contentId.hashCode() : 0);
        hash += (hitStartDateTime != null ? hitStartDateTime.hashCode() : 0);
        hash += (hitTypeId != null ? hitTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServerHitPK)) {
            return false;
        }
        ServerHitPK other = (ServerHitPK) object;
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        if ((this.contentId == null && other.contentId != null) || (this.contentId != null && !this.contentId.equals(other.contentId))) {
            return false;
        }
        if ((this.hitStartDateTime == null && other.hitStartDateTime != null) || (this.hitStartDateTime != null && !this.hitStartDateTime.equals(other.hitStartDateTime))) {
            return false;
        }
        if ((this.hitTypeId == null && other.hitTypeId != null) || (this.hitTypeId != null && !this.hitTypeId.equals(other.hitTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ServerHitPK[ visitId=" + visitId + ", contentId=" + contentId + ", hitStartDateTime=" + hitStartDateTime + ", hitTypeId=" + hitTypeId + " ]";
    }
    
}
