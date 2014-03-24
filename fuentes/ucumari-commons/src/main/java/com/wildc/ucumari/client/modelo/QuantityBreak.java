/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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

import com.wildc.ucumari.shipment.model.ShipmentCostEstimate;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "quantity_break")
@NamedQueries({
    @NamedQuery(name = "QuantityBreak.findAll", query = "SELECT q FROM QuantityBreak q")})
public class QuantityBreak implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUANTITY_BREAK_ID")
    private String quantityBreakId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FROM_QUANTITY")
    private BigDecimal fromQuantity;
    @Column(name = "THRU_QUANTITY")
    private BigDecimal thruQuantity;
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
    @OneToMany(mappedBy = "weightBreakId")
    private List<ShipmentCostEstimate> shipmentCostEstimateList;
    @OneToMany(mappedBy = "quantityBreakId")
    private List<ShipmentCostEstimate> shipmentCostEstimateList1;
    @OneToMany(mappedBy = "priceBreakId")
    private List<ShipmentCostEstimate> shipmentCostEstimateList2;
    @JoinColumn(name = "QUANTITY_BREAK_TYPE_ID", referencedColumnName = "QUANTITY_BREAK_TYPE_ID")
    @ManyToOne
    private QuantityBreakType quantityBreakTypeId;

    public QuantityBreak() {
    }

    public QuantityBreak(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }

    public String getQuantityBreakId() {
        return quantityBreakId;
    }

    public void setQuantityBreakId(String quantityBreakId) {
        this.quantityBreakId = quantityBreakId;
    }

    public BigDecimal getFromQuantity() {
        return fromQuantity;
    }

    public void setFromQuantity(BigDecimal fromQuantity) {
        this.fromQuantity = fromQuantity;
    }

    public BigDecimal getThruQuantity() {
        return thruQuantity;
    }

    public void setThruQuantity(BigDecimal thruQuantity) {
        this.thruQuantity = thruQuantity;
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

    public List<ShipmentCostEstimate> getShipmentCostEstimateList() {
        return shipmentCostEstimateList;
    }

    public void setShipmentCostEstimateList(List<ShipmentCostEstimate> shipmentCostEstimateList) {
        this.shipmentCostEstimateList = shipmentCostEstimateList;
    }

    public List<ShipmentCostEstimate> getShipmentCostEstimateList1() {
        return shipmentCostEstimateList1;
    }

    public void setShipmentCostEstimateList1(List<ShipmentCostEstimate> shipmentCostEstimateList1) {
        this.shipmentCostEstimateList1 = shipmentCostEstimateList1;
    }

    public List<ShipmentCostEstimate> getShipmentCostEstimateList2() {
        return shipmentCostEstimateList2;
    }

    public void setShipmentCostEstimateList2(List<ShipmentCostEstimate> shipmentCostEstimateList2) {
        this.shipmentCostEstimateList2 = shipmentCostEstimateList2;
    }

    public QuantityBreakType getQuantityBreakTypeId() {
        return quantityBreakTypeId;
    }

    public void setQuantityBreakTypeId(QuantityBreakType quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quantityBreakId != null ? quantityBreakId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuantityBreak)) {
            return false;
        }
        QuantityBreak other = (QuantityBreak) object;
        if ((this.quantityBreakId == null && other.quantityBreakId != null) || (this.quantityBreakId != null && !this.quantityBreakId.equals(other.quantityBreakId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuantityBreak[ quantityBreakId=" + quantityBreakId + " ]";
    }
    
}
