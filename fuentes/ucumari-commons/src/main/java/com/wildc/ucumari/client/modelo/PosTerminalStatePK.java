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
public class PosTerminalStatePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "POS_TERMINAL_ID")
    private String posTerminalId;
    @Basic(optional = false)
    @Column(name = "OPENED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date openedDate;

    public PosTerminalStatePK() {
    }

    public PosTerminalStatePK(String posTerminalId, Date openedDate) {
        this.posTerminalId = posTerminalId;
        this.openedDate = openedDate;
    }

    public String getPosTerminalId() {
        return posTerminalId;
    }

    public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public void setOpenedDate(Date openedDate) {
        this.openedDate = openedDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posTerminalId != null ? posTerminalId.hashCode() : 0);
        hash += (openedDate != null ? openedDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosTerminalStatePK)) {
            return false;
        }
        PosTerminalStatePK other = (PosTerminalStatePK) object;
        if ((this.posTerminalId == null && other.posTerminalId != null) || (this.posTerminalId != null && !this.posTerminalId.equals(other.posTerminalId))) {
            return false;
        }
        if ((this.openedDate == null && other.openedDate != null) || (this.openedDate != null && !this.openedDate.equals(other.openedDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PosTerminalStatePK[ posTerminalId=" + posTerminalId + ", openedDate=" + openedDate + " ]";
    }
    
}
