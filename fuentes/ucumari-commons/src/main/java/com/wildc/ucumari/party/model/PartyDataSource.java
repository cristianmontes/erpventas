/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.DataSource;
import com.wildc.ucumari.client.modelo.Visit;
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
@Table(name = "party_data_source")
@NamedQueries({
    @NamedQuery(name = "PartyDataSource.findAll", query = "SELECT p FROM PartyDataSource p")})
public class PartyDataSource implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyDataSourcePK partyDataSourcePK;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "IS_CREATE")
    private Character isCreate;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID")
    @ManyToOne
    private Visit visitId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private DataSource dataSource;

    public PartyDataSource() {
    }

    public PartyDataSource(PartyDataSourcePK partyDataSourcePK) {
        this.partyDataSourcePK = partyDataSourcePK;
    }

    public PartyDataSource(String partyId, String dataSourceId, Date fromDate) {
        this.partyDataSourcePK = new PartyDataSourcePK(partyId, dataSourceId, fromDate);
    }

    public PartyDataSourcePK getPartyDataSourcePK() {
        return partyDataSourcePK;
    }

    public void setPartyDataSourcePK(PartyDataSourcePK partyDataSourcePK) {
        this.partyDataSourcePK = partyDataSourcePK;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Character getIsCreate() {
        return isCreate;
    }

    public void setIsCreate(Character isCreate) {
        this.isCreate = isCreate;
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

    public Visit getVisitId() {
        return visitId;
    }

    public void setVisitId(Visit visitId) {
        this.visitId = visitId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyDataSourcePK != null ? partyDataSourcePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyDataSource)) {
            return false;
        }
        PartyDataSource other = (PartyDataSource) object;
        if ((this.partyDataSourcePK == null && other.partyDataSourcePK != null) || (this.partyDataSourcePK != null && !this.partyDataSourcePK.equals(other.partyDataSourcePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyDataSource[ partyDataSourcePK=" + partyDataSourcePK + " ]";
    }
    
}
