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

import com.wildc.ucumari.parameters.model.TermType;
import com.wildc.ucumari.parameters.model.UomType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "term_type_to_uom_type_map")
@NamedQueries({
    @NamedQuery(name = "TermTypeToUomTypeMap.findAll", query = "SELECT t FROM TermTypeToUomTypeMap t")})
public class TermTypeToUomTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TermTypeToUomTypeMapPK termTypeToUomTypeMapPK;
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
    @JoinColumn(name = "UOM_TYPE_ID", referencedColumnName = "UOM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private UomType uomType;
    @JoinColumn(name = "TERM_TYPE_ID", referencedColumnName = "TERM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TermType termType;

    public TermTypeToUomTypeMap() {
    }

    public TermTypeToUomTypeMap(TermTypeToUomTypeMapPK termTypeToUomTypeMapPK) {
        this.termTypeToUomTypeMapPK = termTypeToUomTypeMapPK;
    }

    public TermTypeToUomTypeMap(String termTypeId, String uomTypeId) {
        this.termTypeToUomTypeMapPK = new TermTypeToUomTypeMapPK(termTypeId, uomTypeId);
    }

    public TermTypeToUomTypeMapPK getTermTypeToUomTypeMapPK() {
        return termTypeToUomTypeMapPK;
    }

    public void setTermTypeToUomTypeMapPK(TermTypeToUomTypeMapPK termTypeToUomTypeMapPK) {
        this.termTypeToUomTypeMapPK = termTypeToUomTypeMapPK;
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

    public UomType getUomType() {
        return uomType;
    }

    public void setUomType(UomType uomType) {
        this.uomType = uomType;
    }

    public TermType getTermType() {
        return termType;
    }

    public void setTermType(TermType termType) {
        this.termType = termType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeToUomTypeMapPK != null ? termTypeToUomTypeMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermTypeToUomTypeMap)) {
            return false;
        }
        TermTypeToUomTypeMap other = (TermTypeToUomTypeMap) object;
        if ((this.termTypeToUomTypeMapPK == null && other.termTypeToUomTypeMapPK != null) || (this.termTypeToUomTypeMapPK != null && !this.termTypeToUomTypeMapPK.equals(other.termTypeToUomTypeMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermTypeToUomTypeMap[ termTypeToUomTypeMapPK=" + termTypeToUomTypeMapPK + " ]";
    }
    
}
