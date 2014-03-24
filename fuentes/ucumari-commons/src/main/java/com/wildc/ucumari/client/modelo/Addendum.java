/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.agreement.model.AgreementItem;
import com.wildc.ucumari.agreement.model.Agreement;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "addendum")
@NamedQueries({
    @NamedQuery(name = "Addendum.findAll", query = "SELECT a FROM Addendum a")})
public class Addendum implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADDENDUM_ID")
    private String addendumId;
    @Column(name = "ADDENDUM_CREATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addendumCreationDate;
    @Column(name = "ADDENDUM_EFFECTIVE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date addendumEffectiveDate;
    @Column(name = "ADDENDUM_TEXT")
    private String addendumText;
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
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID"),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID")})
    @ManyToOne
    private AgreementItem agreementItem;
    @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID")
    @ManyToOne
    private Agreement agreementId;

    public Addendum() {
    }

    public Addendum(String addendumId) {
        this.addendumId = addendumId;
    }

    public String getAddendumId() {
        return addendumId;
    }

    public void setAddendumId(String addendumId) {
        this.addendumId = addendumId;
    }

    public Date getAddendumCreationDate() {
        return addendumCreationDate;
    }

    public void setAddendumCreationDate(Date addendumCreationDate) {
        this.addendumCreationDate = addendumCreationDate;
    }

    public Date getAddendumEffectiveDate() {
        return addendumEffectiveDate;
    }

    public void setAddendumEffectiveDate(Date addendumEffectiveDate) {
        this.addendumEffectiveDate = addendumEffectiveDate;
    }

    public String getAddendumText() {
        return addendumText;
    }

    public void setAddendumText(String addendumText) {
        this.addendumText = addendumText;
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

    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }

    public Agreement getAgreementId() {
        return agreementId;
    }

    public void setAgreementId(Agreement agreementId) {
        this.agreementId = agreementId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addendumId != null ? addendumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addendum)) {
            return false;
        }
        Addendum other = (Addendum) object;
        if ((this.addendumId == null && other.addendumId != null) || (this.addendumId != null && !this.addendumId.equals(other.addendumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Addendum[ addendumId=" + addendumId + " ]";
    }
    
}
