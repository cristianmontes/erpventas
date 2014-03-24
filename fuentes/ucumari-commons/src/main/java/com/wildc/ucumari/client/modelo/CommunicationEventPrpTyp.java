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
import javax.persistence.CascadeType;
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
@Table(name = "communication_event_prp_typ")
@NamedQueries({
    @NamedQuery(name = "CommunicationEventPrpTyp.findAll", query = "SELECT c FROM CommunicationEventPrpTyp c")})
public class CommunicationEventPrpTyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_PRP_TYP_ID")
    private String communicationEventPrpTypId;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<CommunicationEventPrpTyp> communicationEventPrpTypList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "COMMUNICATION_EVENT_PRP_TYP_ID")
    @ManyToOne
    private CommunicationEventPrpTyp parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "communicationEventPrpTyp")
    private List<CommunicationEventPurpose> communicationEventPurposeList;

    public CommunicationEventPrpTyp() {
    }

    public CommunicationEventPrpTyp(String communicationEventPrpTypId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
    }

    public String getCommunicationEventPrpTypId() {
        return communicationEventPrpTypId;
    }

    public void setCommunicationEventPrpTypId(String communicationEventPrpTypId) {
        this.communicationEventPrpTypId = communicationEventPrpTypId;
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

    public List<CommunicationEventPrpTyp> getCommunicationEventPrpTypList() {
        return communicationEventPrpTypList;
    }

    public void setCommunicationEventPrpTypList(List<CommunicationEventPrpTyp> communicationEventPrpTypList) {
        this.communicationEventPrpTypList = communicationEventPrpTypList;
    }

    public CommunicationEventPrpTyp getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(CommunicationEventPrpTyp parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<CommunicationEventPurpose> getCommunicationEventPurposeList() {
        return communicationEventPurposeList;
    }

    public void setCommunicationEventPurposeList(List<CommunicationEventPurpose> communicationEventPurposeList) {
        this.communicationEventPurposeList = communicationEventPurposeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communicationEventPrpTypId != null ? communicationEventPrpTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventPrpTyp)) {
            return false;
        }
        CommunicationEventPrpTyp other = (CommunicationEventPrpTyp) object;
        if ((this.communicationEventPrpTypId == null && other.communicationEventPrpTypId != null) || (this.communicationEventPrpTypId != null && !this.communicationEventPrpTypId.equals(other.communicationEventPrpTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventPrpTyp[ communicationEventPrpTypId=" + communicationEventPrpTypId + " ]";
    }
    
}
