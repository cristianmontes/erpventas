/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "communication_event_type")
@NamedQueries({
    @NamedQuery(name = "CommunicationEventType.findAll", query = "SELECT c FROM CommunicationEventType c")})
public class CommunicationEventType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_TYPE_ID")
    private String communicationEventTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "communicationEventTypeId")
    private List<CommunicationEvent> communicationEventList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<CommunicationEventType> communicationEventTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "COMMUNICATION_EVENT_TYPE_ID")
    @ManyToOne
    private CommunicationEventType parentTypeId;

    public CommunicationEventType() {
    }

    public CommunicationEventType(String communicationEventTypeId) {
        this.communicationEventTypeId = communicationEventTypeId;
    }

    public String getCommunicationEventTypeId() {
        return communicationEventTypeId;
    }

    public void setCommunicationEventTypeId(String communicationEventTypeId) {
        this.communicationEventTypeId = communicationEventTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<CommunicationEvent> getCommunicationEventList() {
        return communicationEventList;
    }

    public void setCommunicationEventList(List<CommunicationEvent> communicationEventList) {
        this.communicationEventList = communicationEventList;
    }

    public List<CommunicationEventType> getCommunicationEventTypeList() {
        return communicationEventTypeList;
    }

    public void setCommunicationEventTypeList(List<CommunicationEventType> communicationEventTypeList) {
        this.communicationEventTypeList = communicationEventTypeList;
    }

    public CommunicationEventType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(CommunicationEventType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventTypeId != null ? communicationEventTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventType)) {
            return false;
        }
        CommunicationEventType other = (CommunicationEventType) object;
        if ((this.communicationEventTypeId == null && other.communicationEventTypeId != null) || (this.communicationEventTypeId != null && !this.communicationEventTypeId.equals(other.communicationEventTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventType[ communicationEventTypeId=" + communicationEventTypeId + " ]";
    }
    
}
