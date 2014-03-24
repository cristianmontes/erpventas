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
@Table(name = "agreement_type_attr")
@NamedQueries({
    @NamedQuery(name = "AgreementTypeAttr.findAll", query = "SELECT a FROM AgreementTypeAttr a")})
public class AgreementTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AgreementTypeAttrPK agreementTypeAttrPK;
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
    @JoinColumn(name = "AGREEMENT_TYPE_ID", referencedColumnName = "AGREEMENT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AgreementType agreementType;

    public AgreementTypeAttr() {
    }

    public AgreementTypeAttr(AgreementTypeAttrPK agreementTypeAttrPK) {
        this.agreementTypeAttrPK = agreementTypeAttrPK;
    }

    public AgreementTypeAttr(String agreementTypeId, String attrName) {
        this.agreementTypeAttrPK = new AgreementTypeAttrPK(agreementTypeId, attrName);
    }

    public AgreementTypeAttrPK getAgreementTypeAttrPK() {
        return agreementTypeAttrPK;
    }

    public void setAgreementTypeAttrPK(AgreementTypeAttrPK agreementTypeAttrPK) {
        this.agreementTypeAttrPK = agreementTypeAttrPK;
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

    public AgreementType getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(AgreementType agreementType) {
        this.agreementType = agreementType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (agreementTypeAttrPK != null ? agreementTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgreementTypeAttr)) {
            return false;
        }
        AgreementTypeAttr other = (AgreementTypeAttr) object;
        if ((this.agreementTypeAttrPK == null && other.agreementTypeAttrPK != null) || (this.agreementTypeAttrPK != null && !this.agreementTypeAttrPK.equals(other.agreementTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AgreementTypeAttr[ agreementTypeAttrPK=" + agreementTypeAttrPK + " ]";
    }
    
}
