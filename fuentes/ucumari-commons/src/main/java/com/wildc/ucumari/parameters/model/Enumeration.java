/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "enumeration")

public class Enumeration implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENUM_ID")
    private String enumId;
    @Column(name = "ENUM_CODE")
    private String enumCode;
    @Column(name = "SEQUENCE_ID")
    private String sequenceId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @Column(name = "DISABLED")
    private Character disabled;
    @OneToMany(mappedBy = "parentEnumId")
    private List<Enumeration> enumerationList;
    @JoinColumn(name = "PARENT_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration parentEnumId;
    @JoinColumn(name = "ENUM_TYPE_ID", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId;
    
    public Enumeration() {
    }

    public Enumeration(String enumId) {
        this.enumId = enumId;
    }

    public String getEnumId() {
        return enumId;
    }

    public void setEnumId(String enumId) {
        this.enumId = enumId;
    }

    public String getEnumCode() {
        return enumCode;
    }

    public void setEnumCode(String enumCode) {
        this.enumCode = enumCode;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Character getDisabled() {
        return disabled;
    }

    public void setDisabled(Character disabled) {
        this.disabled = disabled;
    }    

    public List<Enumeration> getEnumerationList() {
        return enumerationList;
    }

    public void setEnumerationList(List<Enumeration> enumerationList) {
        this.enumerationList = enumerationList;
    }

    public Enumeration getParentEnumId() {
        return parentEnumId;
    }

    public void setParentEnumId(Enumeration parentEnumId) {
        this.parentEnumId = parentEnumId;
    }

    public EnumerationType getEnumTypeId() {
        return enumTypeId;
    }

    public void setEnumTypeId(EnumerationType enumTypeId) {
        this.enumTypeId = enumTypeId;
    }

    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enumId != null ? enumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enumeration)) {
            return false;
        }
        Enumeration other = (Enumeration) object;
        if ((this.enumId == null && other.enumId != null) || (this.enumId != null && !this.enumId.equals(other.enumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Enumeration[ enumId=" + enumId + " ]";
    }    
    
}
