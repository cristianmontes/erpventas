/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

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
@Table(name = "acctg_trans_type_attr")
@NamedQueries({
    @NamedQuery(name = "AcctgTransTypeAttr.findAll", query = "SELECT a FROM AcctgTransTypeAttr a")})
public class AcctgTransTypeAttr implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctgTransTypeAttrPK acctgTransTypeAttrPK;
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
    @JoinColumn(name = "ACCTG_TRANS_TYPE_ID", referencedColumnName = "ACCTG_TRANS_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AcctgTransType acctgTransType;

    public AcctgTransTypeAttr() {
    }

    public AcctgTransTypeAttr(AcctgTransTypeAttrPK acctgTransTypeAttrPK) {
        this.acctgTransTypeAttrPK = acctgTransTypeAttrPK;
    }

    public AcctgTransTypeAttr(String acctgTransTypeId, String attrName) {
        this.acctgTransTypeAttrPK = new AcctgTransTypeAttrPK(acctgTransTypeId, attrName);
    }

    public AcctgTransTypeAttrPK getAcctgTransTypeAttrPK() {
        return acctgTransTypeAttrPK;
    }

    public void setAcctgTransTypeAttrPK(AcctgTransTypeAttrPK acctgTransTypeAttrPK) {
        this.acctgTransTypeAttrPK = acctgTransTypeAttrPK;
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

    public AcctgTransType getAcctgTransType() {
        return acctgTransType;
    }

    public void setAcctgTransType(AcctgTransType acctgTransType) {
        this.acctgTransType = acctgTransType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransTypeAttrPK != null ? acctgTransTypeAttrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransTypeAttr)) {
            return false;
        }
        AcctgTransTypeAttr other = (AcctgTransTypeAttr) object;
        if ((this.acctgTransTypeAttrPK == null && other.acctgTransTypeAttrPK != null) || (this.acctgTransTypeAttrPK != null && !this.acctgTransTypeAttrPK.equals(other.acctgTransTypeAttrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransTypeAttr[ acctgTransTypeAttrPK=" + acctgTransTypeAttrPK + " ]";
    }
    
}
