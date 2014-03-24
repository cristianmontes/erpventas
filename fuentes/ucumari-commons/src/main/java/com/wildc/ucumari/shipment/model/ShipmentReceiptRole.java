/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_receipt_role")
public class ShipmentReceiptRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentReceiptRolePK shipmentReceiptRolePK;
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
    @JoinColumn(name = "RECEIPT_ID", referencedColumnName = "RECEIPT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ShipmentReceipt shipmentReceipt;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;

    public ShipmentReceiptRole() {
    }

    public ShipmentReceiptRole(ShipmentReceiptRolePK shipmentReceiptRolePK) {
        this.shipmentReceiptRolePK = shipmentReceiptRolePK;
    }

    public ShipmentReceiptRole(String receiptId, String partyId, String roleTypeId) {
        this.shipmentReceiptRolePK = new ShipmentReceiptRolePK(receiptId, partyId, roleTypeId);
    }

    public ShipmentReceiptRolePK getShipmentReceiptRolePK() {
        return shipmentReceiptRolePK;
    }

    public void setShipmentReceiptRolePK(ShipmentReceiptRolePK shipmentReceiptRolePK) {
        this.shipmentReceiptRolePK = shipmentReceiptRolePK;
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

    public ShipmentReceipt getShipmentReceipt() {
        return shipmentReceipt;
    }

    public void setShipmentReceipt(ShipmentReceipt shipmentReceipt) {
        this.shipmentReceipt = shipmentReceipt;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentReceiptRolePK != null ? shipmentReceiptRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentReceiptRole)) {
            return false;
        }
        ShipmentReceiptRole other = (ShipmentReceiptRole) object;
        if ((this.shipmentReceiptRolePK == null && other.shipmentReceiptRolePK != null) || (this.shipmentReceiptRolePK != null && !this.shipmentReceiptRolePK.equals(other.shipmentReceiptRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentReceiptRole[ shipmentReceiptRolePK=" + shipmentReceiptRolePK + " ]";
    }
    
}
