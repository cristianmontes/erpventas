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
@Table(name = "deliverable")
@NamedQueries({
    @NamedQuery(name = "Deliverable.findAll", query = "SELECT d FROM Deliverable d")})
public class Deliverable implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deliverable")
    private List<WorkEffortDeliverableProd> workEffortDeliverableProdList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DELIVERABLE_ID")
    private String deliverableId;
    @Column(name = "DELIVERABLE_NAME")
    private String deliverableName;
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
    @JoinColumn(name = "DELIVERABLE_TYPE_ID", referencedColumnName = "DELIVERABLE_TYPE_ID")
    @ManyToOne
    private DeliverableType deliverableTypeId;
    @OneToMany(mappedBy = "deliverableId")
    private List<Requirement> requirementList;

    public Deliverable() {
    }

    public Deliverable(String deliverableId) {
        this.deliverableId = deliverableId;
    }

    public String getDeliverableId() {
        return deliverableId;
    }

    public void setDeliverableId(String deliverableId) {
        this.deliverableId = deliverableId;
    }

    public String getDeliverableName() {
        return deliverableName;
    }

    public void setDeliverableName(String deliverableName) {
        this.deliverableName = deliverableName;
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

    public DeliverableType getDeliverableTypeId() {
        return deliverableTypeId;
    }

    public void setDeliverableTypeId(DeliverableType deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
    }

    public List<Requirement> getRequirementList() {
        return requirementList;
    }

    public void setRequirementList(List<Requirement> requirementList) {
        this.requirementList = requirementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliverableId != null ? deliverableId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deliverable)) {
            return false;
        }
        Deliverable other = (Deliverable) object;
        if ((this.deliverableId == null && other.deliverableId != null) || (this.deliverableId != null && !this.deliverableId.equals(other.deliverableId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Deliverable[ deliverableId=" + deliverableId + " ]";
    }

    public List<WorkEffortDeliverableProd> getWorkEffortDeliverableProdList() {
        return workEffortDeliverableProdList;
    }

    public void setWorkEffortDeliverableProdList(List<WorkEffortDeliverableProd> workEffortDeliverableProdList) {
        this.workEffortDeliverableProdList = workEffortDeliverableProdList;
    }
    
}
