/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
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
@Table(name = "party_content_type")
@NamedQueries({
    @NamedQuery(name = "PartyContentType.findAll", query = "SELECT p FROM PartyContentType p")})
public class PartyContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_CONTENT_TYPE_ID")
    private String partyContentTypeId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<PartyContentType> partyContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "PARTY_CONTENT_TYPE_ID")
    @ManyToOne
    private PartyContentType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "partyContentType")
    private List<PartyContent> partyContentList;

    public PartyContentType() {
    }

    public PartyContentType(String partyContentTypeId) {
        this.partyContentTypeId = partyContentTypeId;
    }

    public String getPartyContentTypeId() {
        return partyContentTypeId;
    }

    public void setPartyContentTypeId(String partyContentTypeId) {
        this.partyContentTypeId = partyContentTypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<PartyContentType> getPartyContentTypeList() {
        return partyContentTypeList;
    }

    public void setPartyContentTypeList(List<PartyContentType> partyContentTypeList) {
        this.partyContentTypeList = partyContentTypeList;
    }

    public PartyContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(PartyContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<PartyContent> getPartyContentList() {
        return partyContentList;
    }

    public void setPartyContentList(List<PartyContent> partyContentList) {
        this.partyContentList = partyContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyContentTypeId != null ? partyContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyContentType)) {
            return false;
        }
        PartyContentType other = (PartyContentType) object;
        if ((this.partyContentTypeId == null && other.partyContentTypeId != null) || (this.partyContentTypeId != null && !this.partyContentTypeId.equals(other.partyContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyContentType[ partyContentTypeId=" + partyContentTypeId + " ]";
    }
    
}
