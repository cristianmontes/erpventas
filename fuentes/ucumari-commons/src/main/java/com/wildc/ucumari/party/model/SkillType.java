/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.quote.model.QuoteItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "skill_type")
public class SkillType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "skillType")
    private List<WorkEffortSkillStandard> workEffortSkillStandardList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "skillType")
    private List<PartySkill> partySkillList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SKILL_TYPE_ID")
    private String skillTypeId;
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
    @OneToMany(mappedBy = "skillTypeId")
    private List<QuoteItem> quoteItemList;
    /*@OneToMany(mappedBy = "parentTypeId")
    private List<SkillType> skillTypeList;*/
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "SKILL_TYPE_ID")
    @ManyToOne
    private SkillType parentTypeId;

    public SkillType() {
    }

    public SkillType(String skillTypeId) {
        this.skillTypeId = skillTypeId;
    }

    public String getSkillTypeId() {
        return skillTypeId;
    }

    public void setSkillTypeId(String skillTypeId) {
        this.skillTypeId = skillTypeId;
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

    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }
/*
    public List<SkillType> getSkillTypeList() {
        return skillTypeList;
    }

    public void setSkillTypeList(List<SkillType> skillTypeList) {
        this.skillTypeList = skillTypeList;
    }*/

    public SkillType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(SkillType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (skillTypeId != null ? skillTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SkillType)) {
            return false;
        }
        SkillType other = (SkillType) object;
        if ((this.skillTypeId == null && other.skillTypeId != null) || (this.skillTypeId != null && !this.skillTypeId.equals(other.skillTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SkillType[ skillTypeId=" + skillTypeId + " ]";
    }
/*
    public List<PartySkill> getPartySkillList() {
        return partySkillList;
    }

    public void setPartySkillList(List<PartySkill> partySkillList) {
        this.partySkillList = partySkillList;
    }

    public List<WorkEffortSkillStandard> getWorkEffortSkillStandardList() {
        return workEffortSkillStandardList;
    }

    public void setWorkEffortSkillStandardList(List<WorkEffortSkillStandard> workEffortSkillStandardList) {
        this.workEffortSkillStandardList = workEffortSkillStandardList;
    }*/
    
}
