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

import com.wildc.ucumari.parameters.model.EnumerationType;
import com.wildc.ucumari.parameters.model.TermType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "term_type_to_enum_type_map")
@NamedQueries({
    @NamedQuery(name = "TermTypeToEnumTypeMap.findAll", query = "SELECT t FROM TermTypeToEnumTypeMap t")})
public class TermTypeToEnumTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TermTypeToEnumTypeMapPK termTypeToEnumTypeMapPK;
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
    @JoinColumn(name = "ENUM_TYPE_ID", referencedColumnName = "ENUM_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EnumerationType enumerationType;

    public TermTypeToEnumTypeMap() {
    }

    public TermTypeToEnumTypeMap(TermTypeToEnumTypeMapPK termTypeToEnumTypeMapPK) {
        this.termTypeToEnumTypeMapPK = termTypeToEnumTypeMapPK;
    }

    public TermTypeToEnumTypeMap(String termTypeId, String enumTypeId) {
        this.termTypeToEnumTypeMapPK = new TermTypeToEnumTypeMapPK(termTypeId, enumTypeId);
    }

    public TermTypeToEnumTypeMapPK getTermTypeToEnumTypeMapPK() {
        return termTypeToEnumTypeMapPK;
    }

    public void setTermTypeToEnumTypeMapPK(TermTypeToEnumTypeMapPK termTypeToEnumTypeMapPK) {
        this.termTypeToEnumTypeMapPK = termTypeToEnumTypeMapPK;
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

    public EnumerationType getEnumerationType() {
        return enumerationType;
    }

    public void setEnumerationType(EnumerationType enumerationType) {
        this.enumerationType = enumerationType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (termTypeToEnumTypeMapPK != null ? termTypeToEnumTypeMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TermTypeToEnumTypeMap)) {
            return false;
        }
        TermTypeToEnumTypeMap other = (TermTypeToEnumTypeMap) object;
        if ((this.termTypeToEnumTypeMapPK == null && other.termTypeToEnumTypeMapPK != null) || (this.termTypeToEnumTypeMapPK != null && !this.termTypeToEnumTypeMapPK.equals(other.termTypeToEnumTypeMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TermTypeToEnumTypeMap[ termTypeToEnumTypeMapPK=" + termTypeToEnumTypeMapPK + " ]";
    }
    
}
