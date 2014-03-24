/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

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
@Table(name = "agreement_to_item_map")
@NamedQueries({
    @NamedQuery(name = "AgreementToItemMap.findAll", query = "SELECT a FROM AgreementToItemMap a")})
public class AgreementToItemMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementToItemMapPK agreementToItemMapPK;
    @Column(name = "AUTO_CREATE")
    private Character autoCreate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "AGREEMENT_ITEM_TYPE_ID", referencedColumnName = "AGREEMENT_ITEM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementItemType agreementItemType;
    @JoinColumn(name = "AGREEMENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementType agreementType;

    public AgreementToItemMap() {
    }

    public AgreementToItemMap(AgreementToItemMapPK agreementToItemMapPK) {
        this.agreementToItemMapPK = agreementToItemMapPK;
    }

    public AgreementToItemMap(String agreementTypeId, String agreementItemTypeId) {
        this.agreementToItemMapPK = new AgreementToItemMapPK(agreementTypeId, agreementItemTypeId);
    }

    public AgreementToItemMapPK getAgreementToItemMapPK() {
        return agreementToItemMapPK;
    }

    public void setAgreementToItemMapPK(AgreementToItemMapPK agreementToItemMapPK) {
        this.agreementToItemMapPK = agreementToItemMapPK;
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

    public AgreementItemType getAgreementItemType() {
        return agreementItemType;
    }

    public void setAgreementItemType(AgreementItemType agreementItemType) {
        this.agreementItemType = agreementItemType;
    }

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementToItemMapPK != null ? agreementToItemMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementToItemMap)) {
            return false;
        }
        AgreementToItemMap other = (AgreementToItemMap) object;
        if ((this.agreementToItemMapPK == null && other.agreementToItemMapPK != null) || (this.agreementToItemMapPK != null && !this.agreementToItemMapPK.equals(other.agreementToItemMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementToItemMap[ agreementToItemMapPK=" + agreementToItemMapPK + " ]";
    }
    
}
