/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.order.model.OrderItemShipGroup;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.shipment.model.ShipmentCostEstimate;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "carrier_shipment_method")
@NamedQueries({
    @NamedQuery(name = "CarrierShipmentMethod.findAll", query = "SELECT c FROM CarrierShipmentMethod c")})
public class CarrierShipmentMethod implements Serializable {
    @OneToMany(mappedBy = "carrierShipmentMethod")
    private List<ShipmentCostEstimate> shipmentCostEstimateList;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CarrierShipmentMethodPK carrierShipmentMethodPK;
    @Column(name = "SEQUENCE_NUMBER")
    private BigInteger sequenceNumber;
    @Column(name = "CARRIER_SERVICE_CODE")
    private String carrierServiceCode;
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
    @OneToMany(mappedBy = "carrierShipmentMethod")
    private List<ShoppingList> shoppingListList;
    @OneToMany(mappedBy = "carrierShipmentMethod")
    private List<OrderItemShipGroup> orderItemShipGroupList;
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentMethodType shipmentMethodType;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;

    public CarrierShipmentMethod() {
    }

    public CarrierShipmentMethod(CarrierShipmentMethodPK carrierShipmentMethodPK) {
        this.carrierShipmentMethodPK = carrierShipmentMethodPK;
    }

    public CarrierShipmentMethod(String shipmentMethodTypeId, String partyId, String roleTypeId) {
        this.carrierShipmentMethodPK = new CarrierShipmentMethodPK(shipmentMethodTypeId, partyId, roleTypeId);
    }

    public CarrierShipmentMethodPK getCarrierShipmentMethodPK() {
        return carrierShipmentMethodPK;
    }

    public void setCarrierShipmentMethodPK(CarrierShipmentMethodPK carrierShipmentMethodPK) {
        this.carrierShipmentMethodPK = carrierShipmentMethodPK;
    }

    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(BigInteger sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getCarrierServiceCode() {
        return carrierServiceCode;
    }

    public void setCarrierServiceCode(String carrierServiceCode) {
        this.carrierServiceCode = carrierServiceCode;
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

    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public List<OrderItemShipGroup> getOrderItemShipGroupList() {
        return orderItemShipGroupList;
    }

    public void setOrderItemShipGroupList(List<OrderItemShipGroup> orderItemShipGroupList) {
        this.orderItemShipGroupList = orderItemShipGroupList;
    }

    public ShipmentMethodType getShipmentMethodType() {
        return shipmentMethodType;
    }

    public void setShipmentMethodType(ShipmentMethodType shipmentMethodType) {
        this.shipmentMethodType = shipmentMethodType;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carrierShipmentMethodPK != null ? carrierShipmentMethodPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarrierShipmentMethod)) {
            return false;
        }
        CarrierShipmentMethod other = (CarrierShipmentMethod) object;
        if ((this.carrierShipmentMethodPK == null && other.carrierShipmentMethodPK != null) || (this.carrierShipmentMethodPK != null && !this.carrierShipmentMethodPK.equals(other.carrierShipmentMethodPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CarrierShipmentMethod[ carrierShipmentMethodPK=" + carrierShipmentMethodPK + " ]";
    }

    public List<ShipmentCostEstimate> getShipmentCostEstimateList() {
        return shipmentCostEstimateList;
    }

    public void setShipmentCostEstimateList(List<ShipmentCostEstimate> shipmentCostEstimateList) {
        this.shipmentCostEstimateList = shipmentCostEstimateList;
    }
    
}
