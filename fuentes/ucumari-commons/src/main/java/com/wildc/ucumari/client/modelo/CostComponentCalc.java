/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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

import com.wildc.ucumari.accounting.model.GlAccountType;
import com.wildc.ucumari.parameters.model.CustomMethod;
import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cost_component_calc")
@NamedQueries({
    @NamedQuery(name = "CostComponentCalc.findAll", query = "SELECT c FROM CostComponentCalc c")})
public class CostComponentCalc implements Serializable {
    @OneToMany(mappedBy = "costComponentCalcId")
    private List<WorkEffortCostCalc> workEffortCostCalcList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_CALC_ID")
    private String costComponentCalcId;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FIXED_COST")
    private BigDecimal fixedCost;
    @Column(name = "VARIABLE_COST")
    private BigDecimal variableCost;
    @Column(name = "PER_MILLI_SECOND")
    private BigInteger perMilliSecond;
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
    @OneToMany(mappedBy = "costComponentCalcId")
    private List<CostComponent> costComponentList;
    @JoinColumn(name = "OFFSETTING_GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType offsettingGlAccountTypeId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "COST_CUSTOM_METHOD_ID", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod costCustomMethodId;
    @JoinColumn(name = "COST_GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType costGlAccountTypeId;

    public CostComponentCalc() {
    }

    public CostComponentCalc(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }

    public String getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(String costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(BigDecimal fixedCost) {
        this.fixedCost = fixedCost;
    }

    public BigDecimal getVariableCost() {
        return variableCost;
    }

    public void setVariableCost(BigDecimal variableCost) {
        this.variableCost = variableCost;
    }

    public BigInteger getPerMilliSecond() {
        return perMilliSecond;
    }

    public void setPerMilliSecond(BigInteger perMilliSecond) {
        this.perMilliSecond = perMilliSecond;
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

    public List<CostComponent> getCostComponentList() {
        return costComponentList;
    }

    public void setCostComponentList(List<CostComponent> costComponentList) {
        this.costComponentList = costComponentList;
    }

    public GlAccountType getOffsettingGlAccountTypeId() {
        return offsettingGlAccountTypeId;
    }

    public void setOffsettingGlAccountTypeId(GlAccountType offsettingGlAccountTypeId) {
        this.offsettingGlAccountTypeId = offsettingGlAccountTypeId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public CustomMethod getCostCustomMethodId() {
        return costCustomMethodId;
    }

    public void setCostCustomMethodId(CustomMethod costCustomMethodId) {
        this.costCustomMethodId = costCustomMethodId;
    }

    public GlAccountType getCostGlAccountTypeId() {
        return costGlAccountTypeId;
    }

    public void setCostGlAccountTypeId(GlAccountType costGlAccountTypeId) {
        this.costGlAccountTypeId = costGlAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costComponentCalcId != null ? costComponentCalcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponentCalc)) {
            return false;
        }
        CostComponentCalc other = (CostComponentCalc) object;
        if ((this.costComponentCalcId == null && other.costComponentCalcId != null) || (this.costComponentCalcId != null && !this.costComponentCalcId.equals(other.costComponentCalcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponentCalc[ costComponentCalcId=" + costComponentCalcId + " ]";
    }

    public List<WorkEffortCostCalc> getWorkEffortCostCalcList() {
        return workEffortCostCalcList;
    }

    public void setWorkEffortCostCalcList(List<WorkEffortCostCalc> workEffortCostCalcList) {
        this.workEffortCostCalcList = workEffortCostCalcList;
    }
    
}
