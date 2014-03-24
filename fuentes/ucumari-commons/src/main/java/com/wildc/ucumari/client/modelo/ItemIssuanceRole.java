/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "item_issuance_role")
@NamedQueries({
    @NamedQuery(name = "ItemIssuanceRole.findAll", query = "SELECT i FROM ItemIssuanceRole i")})
public class ItemIssuanceRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemIssuanceRolePK itemIssuanceRolePK;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private PartyRole partyRole;
    @JoinColumn(name = "ITEM_ISSUANCE_ID", referencedColumnName = "ITEM_ISSUANCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ItemIssuance itemIssuance;

    public ItemIssuanceRole() {
    }

    public ItemIssuanceRole(ItemIssuanceRolePK itemIssuanceRolePK) {
        this.itemIssuanceRolePK = itemIssuanceRolePK;
    }

    public ItemIssuanceRole(String itemIssuanceId, String partyId, String roleTypeId) {
        this.itemIssuanceRolePK = new ItemIssuanceRolePK(itemIssuanceId, partyId, roleTypeId);
    }

    public ItemIssuanceRolePK getItemIssuanceRolePK() {
        return itemIssuanceRolePK;
    }

    public void setItemIssuanceRolePK(ItemIssuanceRolePK itemIssuanceRolePK) {
        this.itemIssuanceRolePK = itemIssuanceRolePK;
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

    public ItemIssuance getItemIssuance() {
        return itemIssuance;
    }

    public void setItemIssuance(ItemIssuance itemIssuance) {
        this.itemIssuance = itemIssuance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemIssuanceRolePK != null ? itemIssuanceRolePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemIssuanceRole)) {
            return false;
        }
        ItemIssuanceRole other = (ItemIssuanceRole) object;
        if ((this.itemIssuanceRolePK == null && other.itemIssuanceRolePK != null) || (this.itemIssuanceRolePK != null && !this.itemIssuanceRolePK.equals(other.itemIssuanceRolePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ItemIssuanceRole[ itemIssuanceRolePK=" + itemIssuanceRolePK + " ]";
    }
    
}
