/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.PartyBenefit;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "benefit_type")
@NamedQueries({
    @NamedQuery(name = "BenefitType.findAll", query = "SELECT b FROM BenefitType b")})
public class BenefitType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "benefitType")
    private List<PartyBenefit> partyBenefitList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BENEFIT_TYPE_ID")
    private String benefitTypeId;
    @Column(name = "BENEFIT_NAME")
    private String benefitName;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EMPLOYER_PAID_PERCENTAGE")
    private BigDecimal employerPaidPercentage;
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
    private List<BenefitType> benefitTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "BENEFIT_TYPE_ID")
    @ManyToOne
    private BenefitType parentTypeId;

    public BenefitType() {
    }

    public BenefitType(String benefitTypeId) {
        this.benefitTypeId = benefitTypeId;
    }

    public String getBenefitTypeId() {
        return benefitTypeId;
    }

    public void setBenefitTypeId(String benefitTypeId) {
        this.benefitTypeId = benefitTypeId;
    }

    public String getBenefitName() {
        return benefitName;
    }

    public void setBenefitName(String benefitName) {
        this.benefitName = benefitName;
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

    public BigDecimal getEmployerPaidPercentage() {
        return employerPaidPercentage;
    }

    public void setEmployerPaidPercentage(BigDecimal employerPaidPercentage) {
        this.employerPaidPercentage = employerPaidPercentage;
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

    public List<BenefitType> getBenefitTypeList() {
        return benefitTypeList;
    }

    public void setBenefitTypeList(List<BenefitType> benefitTypeList) {
        this.benefitTypeList = benefitTypeList;
    }

    public BenefitType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(BenefitType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (benefitTypeId != null ? benefitTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BenefitType)) {
            return false;
        }
        BenefitType other = (BenefitType) object;
        if ((this.benefitTypeId == null && other.benefitTypeId != null) || (this.benefitTypeId != null && !this.benefitTypeId.equals(other.benefitTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.BenefitType[ benefitTypeId=" + benefitTypeId + " ]";
    }

    public List<PartyBenefit> getPartyBenefitList() {
        return partyBenefitList;
    }

    public void setPartyBenefitList(List<PartyBenefit> partyBenefitList) {
        this.partyBenefitList = partyBenefitList;
    }
    
}
