/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import com.wildc.ucumari.client.modelo.CommunicationEvent;
import com.wildc.ucumari.client.modelo.NeedType;
import com.wildc.ucumari.client.modelo.Visit;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductCategory;

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
@Table(name = "party_need")
@NamedQueries({
    @NamedQuery(name = "PartyNeed.findAll", query = "SELECT p FROM PartyNeed p")})
public class PartyNeed implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PartyNeedPK partyNeedPK;
    @Column(name = "DATETIME_RECORDED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeRecorded;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID")
    @ManyToOne
    private Visit visitId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RoleType roleType;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "PARTY_TYPE_ID", referencedColumnName = "PARTY_TYPE_ID")
    @ManyToOne
    private PartyType partyTypeId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory productCategoryId;
    @JoinColumn(name = "NEED_TYPE_ID", referencedColumnName = "NEED_TYPE_ID")
    @ManyToOne
    private NeedType needTypeId;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID")
    @ManyToOne
    private CommunicationEvent communicationEventId;

    public PartyNeed() {
    }

    public PartyNeed(PartyNeedPK partyNeedPK) {
        this.partyNeedPK = partyNeedPK;
    }

    public PartyNeed(String partyNeedId, String partyId, String roleTypeId) {
        this.partyNeedPK = new PartyNeedPK(partyNeedId, partyId, roleTypeId);
    }

    public PartyNeedPK getPartyNeedPK() {
        return partyNeedPK;
    }

    public void setPartyNeedPK(PartyNeedPK partyNeedPK) {
        this.partyNeedPK = partyNeedPK;
    }

    public Date getDatetimeRecorded() {
        return datetimeRecorded;
    }

    public void setDatetimeRecorded(Date datetimeRecorded) {
        this.datetimeRecorded = datetimeRecorded;
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

    public Visit getVisitId() {
        return visitId;
    }

    public void setVisitId(Visit visitId) {
        this.visitId = visitId;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public PartyType getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(PartyType partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(ProductCategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public NeedType getNeedTypeId() {
        return needTypeId;
    }

    public void setNeedTypeId(NeedType needTypeId) {
        this.needTypeId = needTypeId;
    }

    public CommunicationEvent getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(CommunicationEvent communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyNeedPK != null ? partyNeedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyNeed)) {
            return false;
        }
        PartyNeed other = (PartyNeed) object;
        if ((this.partyNeedPK == null && other.partyNeedPK != null) || (this.partyNeedPK != null && !this.partyNeedPK.equals(other.partyNeedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyNeed[ partyNeedPK=" + partyNeedPK + " ]";
    }
    
}
