/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "party_type_attr")
@NamedQueries({
    @NamedQuery(name = "PartyTypeAttr.findAll", query = "SELECT p FROM PartyTypeAttr p")})
public class PartyTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyTypeAttrPK partyTypeAttrPK;
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
    @JoinColumn(name = "PARTY_TYPE_ID", referencedColumnName = "PARTY_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PartyType partyType;

    public PartyTypeAttr() {
    }

    public PartyTypeAttr(PartyTypeAttrPK partyTypeAttrPK) {
        this.partyTypeAttrPK = partyTypeAttrPK;
    }

    public PartyTypeAttr(String partyTypeId, String attrName) {
        this.partyTypeAttrPK = new PartyTypeAttrPK(partyTypeId, attrName);
    }

    public PartyTypeAttrPK getPartyTypeAttrPK() {
        return partyTypeAttrPK;
    }

    public void setPartyTypeAttrPK(PartyTypeAttrPK partyTypeAttrPK) {
        this.partyTypeAttrPK = partyTypeAttrPK;
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

    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyTypeAttrPK != null ? partyTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyTypeAttr)) {
            return false;
        }
        PartyTypeAttr other = (PartyTypeAttr) object;
        if ((this.partyTypeAttrPK == null && other.partyTypeAttrPK != null) || (this.partyTypeAttrPK != null && !this.partyTypeAttrPK.equals(other.partyTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyTypeAttr[ partyTypeAttrPK=" + partyTypeAttrPK + " ]";
    }
    
}
