/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "acctg_tag_posting_check")
@NamedQueries({
    @NamedQuery(name = "AcctgTagPostingCheck.findAll", query = "SELECT a FROM AcctgTagPostingCheck a")})
public class AcctgTagPostingCheck implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Column(name = "TAG_ENUM1_MUST_BALANCE")
    private Character tagEnum1MustBalance;
    @Column(name = "TAG_ENUM2_MUST_BALANCE")
    private Character tagEnum2MustBalance;
    @Column(name = "TAG_ENUM3_MUST_BALANCE")
    private Character tagEnum3MustBalance;
    @Column(name = "TAG_ENUM4_MUST_BALANCE")
    private Character tagEnum4MustBalance;
    @Column(name = "TAG_ENUM5_MUST_BALANCE")
    private Character tagEnum5MustBalance;
    @Column(name = "TAG_ENUM6_MUST_BALANCE")
    private Character tagEnum6MustBalance;
    @Column(name = "TAG_ENUM7_MUST_BALANCE")
    private Character tagEnum7MustBalance;
    @Column(name = "TAG_ENUM8_MUST_BALANCE")
    private Character tagEnum8MustBalance;
    @Column(name = "TAG_ENUM9_MUST_BALANCE")
    private Character tagEnum9MustBalance;
    @Column(name = "TAG_ENUM10_MUST_BALANCE")
    private Character tagEnum10MustBalance;
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
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;

    public AcctgTagPostingCheck() {
    }

    public AcctgTagPostingCheck(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public Character getTagEnum1MustBalance() {
        return tagEnum1MustBalance;
    }

    public void setTagEnum1MustBalance(Character tagEnum1MustBalance) {
        this.tagEnum1MustBalance = tagEnum1MustBalance;
    }

    public Character getTagEnum2MustBalance() {
        return tagEnum2MustBalance;
    }

    public void setTagEnum2MustBalance(Character tagEnum2MustBalance) {
        this.tagEnum2MustBalance = tagEnum2MustBalance;
    }

    public Character getTagEnum3MustBalance() {
        return tagEnum3MustBalance;
    }

    public void setTagEnum3MustBalance(Character tagEnum3MustBalance) {
        this.tagEnum3MustBalance = tagEnum3MustBalance;
    }

    public Character getTagEnum4MustBalance() {
        return tagEnum4MustBalance;
    }

    public void setTagEnum4MustBalance(Character tagEnum4MustBalance) {
        this.tagEnum4MustBalance = tagEnum4MustBalance;
    }

    public Character getTagEnum5MustBalance() {
        return tagEnum5MustBalance;
    }

    public void setTagEnum5MustBalance(Character tagEnum5MustBalance) {
        this.tagEnum5MustBalance = tagEnum5MustBalance;
    }

    public Character getTagEnum6MustBalance() {
        return tagEnum6MustBalance;
    }

    public void setTagEnum6MustBalance(Character tagEnum6MustBalance) {
        this.tagEnum6MustBalance = tagEnum6MustBalance;
    }

    public Character getTagEnum7MustBalance() {
        return tagEnum7MustBalance;
    }

    public void setTagEnum7MustBalance(Character tagEnum7MustBalance) {
        this.tagEnum7MustBalance = tagEnum7MustBalance;
    }

    public Character getTagEnum8MustBalance() {
        return tagEnum8MustBalance;
    }

    public void setTagEnum8MustBalance(Character tagEnum8MustBalance) {
        this.tagEnum8MustBalance = tagEnum8MustBalance;
    }

    public Character getTagEnum9MustBalance() {
        return tagEnum9MustBalance;
    }

    public void setTagEnum9MustBalance(Character tagEnum9MustBalance) {
        this.tagEnum9MustBalance = tagEnum9MustBalance;
    }

    public Character getTagEnum10MustBalance() {
        return tagEnum10MustBalance;
    }

    public void setTagEnum10MustBalance(Character tagEnum10MustBalance) {
        this.tagEnum10MustBalance = tagEnum10MustBalance;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTagPostingCheck)) {
            return false;
        }
        AcctgTagPostingCheck other = (AcctgTagPostingCheck) object;
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTagPostingCheck[ organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
