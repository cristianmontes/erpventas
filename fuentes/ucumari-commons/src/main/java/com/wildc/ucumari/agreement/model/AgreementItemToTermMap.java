/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

import com.wildc.ucumari.parameters.model.TermType;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "agreement_item_to_term_map")
@NamedQueries({
    @NamedQuery(name = "AgreementItemToTermMap.findAll", query = "SELECT a FROM AgreementItemToTermMap a")})
public class AgreementItemToTermMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementItemToTermMapPK agreementItemToTermMapPK;
    @Column(name = "AUTO_CREATE")
    private Character autoCreate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "DEFAULT_DESCRIPTION")
    private String defaultDescription;
    @Column(name = "MAX_ALLOWED")
    private BigInteger maxAllowed;
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
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TermType termType;
    @JoinColumn(name = "AGREEMENT_ITEM_TYPE_ID", referencedColumnName = "AGREEMENT_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementItemType agreementItemType;

    public AgreementItemToTermMap() {
    }

    public AgreementItemToTermMap(AgreementItemToTermMapPK agreementItemToTermMapPK) {
        this.agreementItemToTermMapPK = agreementItemToTermMapPK;
    }

    public AgreementItemToTermMap(String agreementItemTypeId, String termTypeId) {
        this.agreementItemToTermMapPK = new AgreementItemToTermMapPK(agreementItemTypeId, termTypeId);
    }

    public AgreementItemToTermMapPK getAgreementItemToTermMapPK() {
        return agreementItemToTermMapPK;
    }

    public void setAgreementItemToTermMapPK(AgreementItemToTermMapPK agreementItemToTermMapPK) {
        this.agreementItemToTermMapPK = agreementItemToTermMapPK;
    }

    public Character getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(Character autoCreate) {
        this.autoCreate = autoCreate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getDefaultDescription() {
        return defaultDescription;
    }

    public void setDefaultDescription(String defaultDescription) {
        this.defaultDescription = defaultDescription;
    }

    public BigInteger getMaxAllowed() {
        return maxAllowed;
    }

    public void setMaxAllowed(BigInteger maxAllowed) {
        this.maxAllowed = maxAllowed;
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

    public TermType getTermType() {
        return termType;
    }

    public void setTermType(TermType termType) {
        this.termType = termType;
    }

    public AgreementItemType getAgreementItemType() {
        return agreementItemType;
    }

    public void setAgreementItemType(AgreementItemType agreementItemType) {
        this.agreementItemType = agreementItemType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementItemToTermMapPK != null ? agreementItemToTermMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementItemToTermMap)) {
            return false;
        }
        AgreementItemToTermMap other = (AgreementItemToTermMap) object;
        if ((this.agreementItemToTermMapPK == null && other.agreementItemToTermMapPK != null) || (this.agreementItemToTermMapPK != null && !this.agreementItemToTermMapPK.equals(other.agreementItemToTermMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementItemToTermMap[ agreementItemToTermMapPK=" + agreementItemToTermMapPK + " ]";
    }
    
}
