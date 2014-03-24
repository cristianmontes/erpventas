/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
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
@Table(name = "empl_position_fulfillment")
@NamedQueries({
    @NamedQuery(name = "EmplPositionFulfillment.findAll", query = "SELECT e FROM EmplPositionFulfillment e")})
public class EmplPositionFulfillment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplPositionFulfillmentPK emplPositionFulfillmentPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "EMPL_POSITION_ID", referencedColumnName = "EMPL_POSITION_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPosition emplPosition;

    public EmplPositionFulfillment() {
    }

    public EmplPositionFulfillment(EmplPositionFulfillmentPK emplPositionFulfillmentPK) {
        this.emplPositionFulfillmentPK = emplPositionFulfillmentPK;
    }

    public EmplPositionFulfillment(String emplPositionId, String partyId, Date fromDate) {
        this.emplPositionFulfillmentPK = new EmplPositionFulfillmentPK(emplPositionId, partyId, fromDate);
    }

    public EmplPositionFulfillmentPK getEmplPositionFulfillmentPK() {
        return emplPositionFulfillmentPK;
    }

    public void setEmplPositionFulfillmentPK(EmplPositionFulfillmentPK emplPositionFulfillmentPK) {
        this.emplPositionFulfillmentPK = emplPositionFulfillmentPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public EmplPosition getEmplPosition() {
        return emplPosition;
    }

    public void setEmplPosition(EmplPosition emplPosition) {
        this.emplPosition = emplPosition;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionFulfillmentPK != null ? emplPositionFulfillmentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionFulfillment)) {
            return false;
        }
        EmplPositionFulfillment other = (EmplPositionFulfillment) object;
        if ((this.emplPositionFulfillmentPK == null && other.emplPositionFulfillmentPK != null) || (this.emplPositionFulfillmentPK != null && !this.emplPositionFulfillmentPK.equals(other.emplPositionFulfillmentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionFulfillment[ emplPositionFulfillmentPK=" + emplPositionFulfillmentPK + " ]";
    }
    
}
