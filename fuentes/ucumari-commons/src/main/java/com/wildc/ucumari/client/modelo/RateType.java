/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyRate;
import com.wildc.ucumari.party.model.PartyRateNew;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "rate_type")
@NamedQueries({
    @NamedQuery(name = "RateType.findAll", query = "SELECT r FROM RateType r")})
public class RateType implements Serializable {
    @OneToMany(mappedBy = "rateTypeId")
    private List<TimeEntry> timeEntryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rateType")
    private List<WorkEffortAssignmentRate> workEffortAssignmentRateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rateType")
    private List<RateAmount> rateAmountList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RATE_TYPE_ID")
    private String rateTypeId;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rateType")
    private List<PartyRate> partyRateList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rateType")
    private List<PartyRateNew> partyRateNewList;

    public RateType() {
    }

    public RateType(String rateTypeId) {
        this.rateTypeId = rateTypeId;
    }

    public String getRateTypeId() {
        return rateTypeId;
    }

    public void setRateTypeId(String rateTypeId) {
        this.rateTypeId = rateTypeId;
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

    public List<PartyRate> getPartyRateList() {
        return partyRateList;
    }

    public void setPartyRateList(List<PartyRate> partyRateList) {
        this.partyRateList = partyRateList;
    }

    public List<PartyRateNew> getPartyRateNewList() {
        return partyRateNewList;
    }

    public void setPartyRateNewList(List<PartyRateNew> partyRateNewList) {
        this.partyRateNewList = partyRateNewList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rateTypeId != null ? rateTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RateType)) {
            return false;
        }
        RateType other = (RateType) object;
        if ((this.rateTypeId == null && other.rateTypeId != null) || (this.rateTypeId != null && !this.rateTypeId.equals(other.rateTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RateType[ rateTypeId=" + rateTypeId + " ]";
    }

    public List<TimeEntry> getTimeEntryList() {
        return timeEntryList;
    }

    public void setTimeEntryList(List<TimeEntry> timeEntryList) {
        this.timeEntryList = timeEntryList;
    }

    public List<WorkEffortAssignmentRate> getWorkEffortAssignmentRateList() {
        return workEffortAssignmentRateList;
    }

    public void setWorkEffortAssignmentRateList(List<WorkEffortAssignmentRate> workEffortAssignmentRateList) {
        this.workEffortAssignmentRateList = workEffortAssignmentRateList;
    }

    public List<RateAmount> getRateAmountList() {
        return rateAmountList;
    }

    public void setRateAmountList(List<RateAmount> rateAmountList) {
        this.rateAmountList = rateAmountList;
    }
    
}
