/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.agreement.model;

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
@Table(name = "agreement_item_type_attr")
@NamedQueries({
    @NamedQuery(name = "AgreementItemTypeAttr.findAll", query = "SELECT a FROM AgreementItemTypeAttr a")})
public class AgreementItemTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementItemTypeAttrPK agreementItemTypeAttrPK;
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

    public AgreementItemTypeAttr() {
    }

    public AgreementItemTypeAttr(AgreementItemTypeAttrPK agreementItemTypeAttrPK) {
        this.agreementItemTypeAttrPK = agreementItemTypeAttrPK;
    }

    public AgreementItemTypeAttr(String agreementItemTypeId, String attrName) {
        this.agreementItemTypeAttrPK = new AgreementItemTypeAttrPK(agreementItemTypeId, attrName);
    }

    public AgreementItemTypeAttrPK getAgreementItemTypeAttrPK() {
        return agreementItemTypeAttrPK;
    }

    public void setAgreementItemTypeAttrPK(AgreementItemTypeAttrPK agreementItemTypeAttrPK) {
        this.agreementItemTypeAttrPK = agreementItemTypeAttrPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementItemTypeAttrPK != null ? agreementItemTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementItemTypeAttr)) {
            return false;
        }
        AgreementItemTypeAttr other = (AgreementItemTypeAttr) object;
        if ((this.agreementItemTypeAttrPK == null && other.agreementItemTypeAttrPK != null) || (this.agreementItemTypeAttrPK != null && !this.agreementItemTypeAttrPK.equals(other.agreementItemTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementItemTypeAttr[ agreementItemTypeAttrPK=" + agreementItemTypeAttrPK + " ]";
    }
    
}
