/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.parameters.model.Geo;

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
@Table(name = "agreement_geographical_applic")
@NamedQueries({
    @NamedQuery(name = "AgreementGeographicalApplic.findAll", query = "SELECT a FROM AgreementGeographicalApplic a")})
public class AgreementGeographicalApplic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementGeographicalApplicPK agreementGeographicalApplicPK;
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
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Agreement agreement;
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID", insertable = false, updatable = false),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private AgreementItem agreementItem;

    public AgreementGeographicalApplic() {
    }

    public AgreementGeographicalApplic(AgreementGeographicalApplicPK agreementGeographicalApplicPK) {
        this.agreementGeographicalApplicPK = agreementGeographicalApplicPK;
    }

    public AgreementGeographicalApplic(String agreementId, String agreementItemSeqId, String geoId) {
        this.agreementGeographicalApplicPK = new AgreementGeographicalApplicPK(agreementId, agreementItemSeqId, geoId);
    }

    public AgreementGeographicalApplicPK getAgreementGeographicalApplicPK() {
        return agreementGeographicalApplicPK;
    }

    public void setAgreementGeographicalApplicPK(AgreementGeographicalApplicPK agreementGeographicalApplicPK) {
        this.agreementGeographicalApplicPK = agreementGeographicalApplicPK;
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

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementGeographicalApplicPK != null ? agreementGeographicalApplicPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementGeographicalApplic)) {
            return false;
        }
        AgreementGeographicalApplic other = (AgreementGeographicalApplic) object;
        if ((this.agreementGeographicalApplicPK == null && other.agreementGeographicalApplicPK != null) || (this.agreementGeographicalApplicPK != null && !this.agreementGeographicalApplicPK.equals(other.agreementGeographicalApplicPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementGeographicalApplic[ agreementGeographicalApplicPK=" + agreementGeographicalApplicPK + " ]";
    }
    
}
