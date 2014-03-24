/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.party.model.SkillType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "work_effort_skill_standard")
@NamedQueries({
    @NamedQuery(name = "WorkEffortSkillStandard.findAll", query = "SELECT w FROM WorkEffortSkillStandard w")})
public class WorkEffortSkillStandard implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WorkEffortSkillStandardPK workEffortSkillStandardPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_NUM_PEOPLE")
    private BigDecimal estimatedNumPeople;
    @Column(name = "ESTIMATED_DURATION")
    private BigDecimal estimatedDuration;
    @Column(name = "ESTIMATED_COST")
    private BigDecimal estimatedCost;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WorkEffort workEffort;
    @JoinColumn(name = "SKILL_TYPE_ID", referencedColumnName = "SKILL_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private SkillType skillType;

    public WorkEffortSkillStandard() {
    }

    public WorkEffortSkillStandard(WorkEffortSkillStandardPK workEffortSkillStandardPK) {
        this.workEffortSkillStandardPK = workEffortSkillStandardPK;
    }

    public WorkEffortSkillStandard(String workEffortId, String skillTypeId) {
        this.workEffortSkillStandardPK = new WorkEffortSkillStandardPK(workEffortId, skillTypeId);
    }

    public WorkEffortSkillStandardPK getWorkEffortSkillStandardPK() {
        return workEffortSkillStandardPK;
    }

    public void setWorkEffortSkillStandardPK(WorkEffortSkillStandardPK workEffortSkillStandardPK) {
        this.workEffortSkillStandardPK = workEffortSkillStandardPK;
    }

    public BigDecimal getEstimatedNumPeople() {
        return estimatedNumPeople;
    }

    public void setEstimatedNumPeople(BigDecimal estimatedNumPeople) {
        this.estimatedNumPeople = estimatedNumPeople;
    }

    public BigDecimal getEstimatedDuration() {
        return estimatedDuration;
    }

    public void setEstimatedDuration(BigDecimal estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }

    public BigDecimal getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(BigDecimal estimatedCost) {
        this.estimatedCost = estimatedCost;
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

    public WorkEffort getWorkEffort() {
        return workEffort;
    }

    public void setWorkEffort(WorkEffort workEffort) {
        this.workEffort = workEffort;
    }

    public SkillType getSkillType() {
        return skillType;
    }

    public void setSkillType(SkillType skillType) {
        this.skillType = skillType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (workEffortSkillStandardPK != null ? workEffortSkillStandardPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkEffortSkillStandard)) {
            return false;
        }
        WorkEffortSkillStandard other = (WorkEffortSkillStandard) object;
        if ((this.workEffortSkillStandardPK == null && other.workEffortSkillStandardPK != null) || (this.workEffortSkillStandardPK != null && !this.workEffortSkillStandardPK.equals(other.workEffortSkillStandardPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WorkEffortSkillStandard[ workEffortSkillStandardPK=" + workEffortSkillStandardPK + " ]";
    }
    
}
