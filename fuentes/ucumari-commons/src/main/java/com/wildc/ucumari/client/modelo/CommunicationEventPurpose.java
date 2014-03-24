/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "communication_event_purpose")
@NamedQueries({
    @NamedQuery(name = "CommunicationEventPurpose.findAll", query = "SELECT c FROM CommunicationEventPurpose c")})
public class CommunicationEventPurpose implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommunicationEventPurposePK communicationEventPurposePK;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "COMMUNICATION_EVENT_PRP_TYP_ID", referencedColumnName = "COMMUNICATION_EVENT_PRP_TYP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEventPrpTyp communicationEventPrpTyp;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public CommunicationEventPurpose() {
    }

    public CommunicationEventPurpose(CommunicationEventPurposePK communicationEventPurposePK) {
        this.communicationEventPurposePK = communicationEventPurposePK;
    }

    public CommunicationEventPurpose(String communicationEventPrpTypId, String communicationEventId) {
        this.communicationEventPurposePK = new CommunicationEventPurposePK(communicationEventPrpTypId, communicationEventId);
    }

    public CommunicationEventPurposePK getCommunicationEventPurposePK() {
        return communicationEventPurposePK;
    }

    public void setCommunicationEventPurposePK(CommunicationEventPurposePK communicationEventPurposePK) {
        this.communicationEventPurposePK = communicationEventPurposePK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public CommunicationEventPrpTyp getCommunicationEventPrpTyp() {
        return communicationEventPrpTyp;
    }

    public void setCommunicationEventPrpTyp(CommunicationEventPrpTyp communicationEventPrpTyp) {
        this.communicationEventPrpTyp = communicationEventPrpTyp;
    }

    public CommunicationEvent getCommunicationEvent() {
        return communicationEvent;
    }

    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventPurposePK != null ? communicationEventPurposePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventPurpose)) {
            return false;
        }
        CommunicationEventPurpose other = (CommunicationEventPurpose) object;
        if ((this.communicationEventPurposePK == null && other.communicationEventPurposePK != null) || (this.communicationEventPurposePK != null && !this.communicationEventPurposePK.equals(other.communicationEventPurposePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventPurpose[ communicationEventPurposePK=" + communicationEventPurposePK + " ]";
    }
    
}
