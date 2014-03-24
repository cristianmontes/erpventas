/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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

import com.wildc.ucumari.accounting.model.GlAccountType;
import com.wildc.ucumari.parameters.model.StatusItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "inv_stts_glacct_type")
@NamedQueries({
    @NamedQuery(name = "InvSttsGlacctType.findAll", query = "SELECT i FROM InvSttsGlacctType i")})
public class InvSttsGlacctType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvSttsGlacctTypePK invSttsGlacctTypePK;
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
    @JoinColumn(name = "STATUS_ID_TO", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem;
    @JoinColumn(name = "STATUS_ID_FROM", referencedColumnName = "STATUS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private StatusItem statusItem1;
    @JoinColumn(name = "DEBIT_GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType debitGlAccountTypeId;
    @JoinColumn(name = "CREDIT_GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType creditGlAccountTypeId;

    public InvSttsGlacctType() {
    }

    public InvSttsGlacctType(InvSttsGlacctTypePK invSttsGlacctTypePK) {
        this.invSttsGlacctTypePK = invSttsGlacctTypePK;
    }

    public InvSttsGlacctType(String statusIdFrom, String statusIdTo) {
        this.invSttsGlacctTypePK = new InvSttsGlacctTypePK(statusIdFrom, statusIdTo);
    }

    public InvSttsGlacctTypePK getInvSttsGlacctTypePK() {
        return invSttsGlacctTypePK;
    }

    public void setInvSttsGlacctTypePK(InvSttsGlacctTypePK invSttsGlacctTypePK) {
        this.invSttsGlacctTypePK = invSttsGlacctTypePK;
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

    public StatusItem getStatusItem() {
        return statusItem;
    }

    public void setStatusItem(StatusItem statusItem) {
        this.statusItem = statusItem;
    }

    public StatusItem getStatusItem1() {
        return statusItem1;
    }

    public void setStatusItem1(StatusItem statusItem1) {
        this.statusItem1 = statusItem1;
    }

    public GlAccountType getDebitGlAccountTypeId() {
        return debitGlAccountTypeId;
    }

    public void setDebitGlAccountTypeId(GlAccountType debitGlAccountTypeId) {
        this.debitGlAccountTypeId = debitGlAccountTypeId;
    }

    public GlAccountType getCreditGlAccountTypeId() {
        return creditGlAccountTypeId;
    }

    public void setCreditGlAccountTypeId(GlAccountType creditGlAccountTypeId) {
        this.creditGlAccountTypeId = creditGlAccountTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invSttsGlacctTypePK != null ? invSttsGlacctTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvSttsGlacctType)) {
            return false;
        }
        InvSttsGlacctType other = (InvSttsGlacctType) object;
        if ((this.invSttsGlacctTypePK == null && other.invSttsGlacctTypePK != null) || (this.invSttsGlacctTypePK != null && !this.invSttsGlacctTypePK.equals(other.invSttsGlacctTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.InvSttsGlacctType[ invSttsGlacctTypePK=" + invSttsGlacctTypePK + " ]";
    }
    
}
