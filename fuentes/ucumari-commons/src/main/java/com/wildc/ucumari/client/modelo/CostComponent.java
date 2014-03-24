/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductFeature;

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
@Table(name = "cost_component")
@NamedQueries({
    @NamedQuery(name = "CostComponent.findAll", query = "SELECT c FROM CostComponent c")})
public class CostComponent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COST_COMPONENT_ID")
    private String costComponentId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COST")
    private BigDecimal cost;
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
    @JoinColumn(name = "WORK_EFFORT_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort workEffortId;
    @JoinColumn(name = "COST_COMPONENT_TYPE_ID", referencedColumnName = "COST_COMPONENT_TYPE_ID")
    @ManyToOne
    private CostComponentType costComponentTypeId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID")
    @ManyToOne
    private ProductFeature productFeatureId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo geoId;
    @JoinColumn(name = "COST_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom costUomId;
    @JoinColumn(name = "COST_COMPONENT_CALC_ID", referencedColumnName = "COST_COMPONENT_CALC_ID")
    @ManyToOne
    private CostComponentCalc costComponentCalcId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "costComponent")
    private List<CostComponentAttribute> costComponentAttributeList;

    public CostComponent() {
    }

    public CostComponent(String costComponentId) {
        this.costComponentId = costComponentId;
    }

    public String getCostComponentId() {
        return costComponentId;
    }

    public void setCostComponentId(String costComponentId) {
        this.costComponentId = costComponentId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
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

    public WorkEffort getWorkEffortId() {
        return workEffortId;
    }

    public void setWorkEffortId(WorkEffort workEffortId) {
        this.workEffortId = workEffortId;
    }

    public CostComponentType getCostComponentTypeId() {
        return costComponentTypeId;
    }

    public void setCostComponentTypeId(CostComponentType costComponentTypeId) {
        this.costComponentTypeId = costComponentTypeId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductFeature getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(ProductFeature productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Geo getGeoId() {
        return geoId;
    }

    public void setGeoId(Geo geoId) {
        this.geoId = geoId;
    }

    public Uom getCostUomId() {
        return costUomId;
    }

    public void setCostUomId(Uom costUomId) {
        this.costUomId = costUomId;
    }

    public CostComponentCalc getCostComponentCalcId() {
        return costComponentCalcId;
    }

    public void setCostComponentCalcId(CostComponentCalc costComponentCalcId) {
        this.costComponentCalcId = costComponentCalcId;
    }

    public List<CostComponentAttribute> getCostComponentAttributeList() {
        return costComponentAttributeList;
    }

    public void setCostComponentAttributeList(List<CostComponentAttribute> costComponentAttributeList) {
        this.costComponentAttributeList = costComponentAttributeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costComponentId != null ? costComponentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostComponent)) {
            return false;
        }
        CostComponent other = (CostComponent) object;
        if ((this.costComponentId == null && other.costComponentId != null) || (this.costComponentId != null && !this.costComponentId.equals(other.costComponentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CostComponent[ costComponentId=" + costComponentId + " ]";
    }
    
}
