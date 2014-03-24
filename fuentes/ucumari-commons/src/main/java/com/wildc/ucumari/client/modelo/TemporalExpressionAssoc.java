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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "temporal_expression_assoc")
@NamedQueries({
    @NamedQuery(name = "TemporalExpressionAssoc.findAll", query = "SELECT t FROM TemporalExpressionAssoc t")})
public class TemporalExpressionAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TemporalExpressionAssocPK temporalExpressionAssocPK;
    @Column(name = "EXPR_ASSOC_TYPE")
    private String exprAssocType;
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
    @JoinColumn(name = "TO_TEMP_EXPR_ID", referencedColumnName = "TEMP_EXPR_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TemporalExpression temporalExpression;
    @JoinColumn(name = "FROM_TEMP_EXPR_ID", referencedColumnName = "TEMP_EXPR_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TemporalExpression temporalExpression1;

    public TemporalExpressionAssoc() {
    }

    public TemporalExpressionAssoc(TemporalExpressionAssocPK temporalExpressionAssocPK) {
        this.temporalExpressionAssocPK = temporalExpressionAssocPK;
    }

    public TemporalExpressionAssoc(String fromTempExprId, String toTempExprId) {
        this.temporalExpressionAssocPK = new TemporalExpressionAssocPK(fromTempExprId, toTempExprId);
    }

    public TemporalExpressionAssocPK getTemporalExpressionAssocPK() {
        return temporalExpressionAssocPK;
    }

    public void setTemporalExpressionAssocPK(TemporalExpressionAssocPK temporalExpressionAssocPK) {
        this.temporalExpressionAssocPK = temporalExpressionAssocPK;
    }

    public String getExprAssocType() {
        return exprAssocType;
    }

    public void setExprAssocType(String exprAssocType) {
        this.exprAssocType = exprAssocType;
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

    public TemporalExpression getTemporalExpression() {
        return temporalExpression;
    }

    public void setTemporalExpression(TemporalExpression temporalExpression) {
        this.temporalExpression = temporalExpression;
    }

    public TemporalExpression getTemporalExpression1() {
        return temporalExpression1;
    }

    public void setTemporalExpression1(TemporalExpression temporalExpression1) {
        this.temporalExpression1 = temporalExpression1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (temporalExpressionAssocPK != null ? temporalExpressionAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TemporalExpressionAssoc)) {
            return false;
        }
        TemporalExpressionAssoc other = (TemporalExpressionAssoc) object;
        if ((this.temporalExpressionAssocPK == null && other.temporalExpressionAssocPK != null) || (this.temporalExpressionAssocPK != null && !this.temporalExpressionAssocPK.equals(other.temporalExpressionAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TemporalExpressionAssoc[ temporalExpressionAssocPK=" + temporalExpressionAssocPK + " ]";
    }
    
}
