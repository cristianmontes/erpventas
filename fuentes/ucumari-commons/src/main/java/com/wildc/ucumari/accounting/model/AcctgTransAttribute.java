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
@Table(name = "acctg_trans_attribute")
@NamedQueries({
    @NamedQuery(name = "AcctgTransAttribute.findAll", query = "SELECT a FROM AcctgTransAttribute a")})
public class AcctgTransAttribute implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctgTransAttributePK acctgTransAttributePK;
    @Column(name = "ATTR_VALUE")
    private String attrValue;
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
    @JoinColumn(name = "ACCTG_TRANS_ID", referencedColumnName = "ACCTG_TRANS_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AcctgTrans acctgTrans;

    public AcctgTransAttribute() {
    }

    public AcctgTransAttribute(AcctgTransAttributePK acctgTransAttributePK) {
        this.acctgTransAttributePK = acctgTransAttributePK;
    }

    public AcctgTransAttribute(String acctgTransId, String attrName) {
        this.acctgTransAttributePK = new AcctgTransAttributePK(acctgTransId, attrName);
    }

    public AcctgTransAttributePK getAcctgTransAttributePK() {
        return acctgTransAttributePK;
    }

    public void setAcctgTransAttributePK(AcctgTransAttributePK acctgTransAttributePK) {
        this.acctgTransAttributePK = acctgTransAttributePK;
    }

    public String getAttrValue() {
        return attrValue;
    }

    public void setAttrValue(String attrValue) {
        this.attrValue = attrValue;
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

    public AcctgTrans getAcctgTrans() {
        return acctgTrans;
    }

    public void setAcctgTrans(AcctgTrans acctgTrans) {
        this.acctgTrans = acctgTrans;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTransAttributePK != null ? acctgTransAttributePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTransAttribute)) {
            return false;
        }
        AcctgTransAttribute other = (AcctgTransAttribute) object;
        if ((this.acctgTransAttributePK == null && other.acctgTransAttributePK != null) || (this.acctgTransAttributePK != null && !this.acctgTransAttributePK.equals(other.acctgTransAttributePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTransAttribute[ acctgTransAttributePK=" + acctgTransAttributePK + " ]";
    }
    
}
