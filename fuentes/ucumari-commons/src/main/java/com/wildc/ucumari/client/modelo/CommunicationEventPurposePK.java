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
public class CommunicationEventPurposePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_PRP_TYP_ID")
    private String communicationEventPrpTypId;
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;

    public CommunicationEventPurposePK() {
    }

    public CommunicationEventPurposePK(String communicationEventPrpTypId, String communicationEventId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
        this.communicationEventId = communicationEventId;
    }

    public String getCommunicationEventPrpTypId() {
        return communicationEventPrpTypId;
    }

    public void setCommunicationEventPrpTypId(String communicationEventPrpTypId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventPrpTypId != null ? communicationEventPrpTypId.hashCode() : 0);
        hash += (communicationEventId != null ? communicationEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventPurposePK)) {
            return false;
        }
        CommunicationEventPurposePK other = (CommunicationEventPurposePK) object;
        if ((this.communicationEventPrpTypId == null && other.communicationEventPrpTypId != null) || (this.communicationEventPrpTypId != null && !this.communicationEventPrpTypId.equals(other.communicationEventPrpTypId))) {
            return false;
        }
        if ((this.communicationEventId == null && other.communicationEventId != null) || (this.communicationEventId != null && !this.communicationEventId.equals(other.communicationEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventPurposePK[ communicationEventPrpTypId=" + communicationEventPrpTypId + ", communicationEventId=" + communicationEventId + " ]";
    }
    
}
