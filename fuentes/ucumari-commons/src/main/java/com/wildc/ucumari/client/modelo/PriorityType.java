/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyRelationship;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "priority_type")
@NamedQueries({
    @NamedQuery(name = "PriorityType.findAll", query = "SELECT p FROM PriorityType p")})
public class PriorityType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRIORITY_TYPE_ID")
    private String priorityTypeId;
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
    @OneToMany(mappedBy = "priorityTypeId")
    private List<PartyRelationship> partyRelationshipList;

    public PriorityType() {
    }

    public PriorityType(String priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
    }

    public String getPriorityTypeId() {
        return priorityTypeId;
    }

    public void setPriorityTypeId(String priorityTypeId) {
        this.priorityTypeId = priorityTypeId;
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

    public List<PartyRelationship> getPartyRelationshipList() {
        return partyRelationshipList;
    }

    public void setPartyRelationshipList(List<PartyRelationship> partyRelationshipList) {
        this.partyRelationshipList = partyRelationshipList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (priorityTypeId != null ? priorityTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PriorityType)) {
            return false;
        }
        PriorityType other = (PriorityType) object;
        if ((this.priorityTypeId == null && other.priorityTypeId != null) || (this.priorityTypeId != null && !this.priorityTypeId.equals(other.priorityTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PriorityType[ priorityTypeId=" + priorityTypeId + " ]";
    }
    
}
