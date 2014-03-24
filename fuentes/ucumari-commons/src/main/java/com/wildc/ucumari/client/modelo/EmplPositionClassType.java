/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "empl_position_class_type")
@NamedQueries({
    @NamedQuery(name = "EmplPositionClassType.findAll", query = "SELECT e FROM EmplPositionClassType e")})
public class EmplPositionClassType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMPL_POSITION_CLASS_TYPE_ID")
    private String emplPositionClassTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<EmplPositionClassType> emplPositionClassTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "EMPL_POSITION_CLASS_TYPE_ID")
    @ManyToOne
    private EmplPositionClassType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emplPositionClassType")
    private List<EmplPositionTypeClass> emplPositionTypeClassList;

    public EmplPositionClassType() {
    }

    public EmplPositionClassType(String emplPositionClassTypeId) {
        this.emplPositionClassTypeId = emplPositionClassTypeId;
    }

    public String getEmplPositionClassTypeId() {
        return emplPositionClassTypeId;
    }

    public void setEmplPositionClassTypeId(String emplPositionClassTypeId) {
        this.emplPositionClassTypeId = emplPositionClassTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public List<EmplPositionClassType> getEmplPositionClassTypeList() {
        return emplPositionClassTypeList;
    }

    public void setEmplPositionClassTypeList(List<EmplPositionClassType> emplPositionClassTypeList) {
        this.emplPositionClassTypeList = emplPositionClassTypeList;
    }

    public EmplPositionClassType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(EmplPositionClassType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<EmplPositionTypeClass> getEmplPositionTypeClassList() {
        return emplPositionTypeClassList;
    }

    public void setEmplPositionTypeClassList(List<EmplPositionTypeClass> emplPositionTypeClassList) {
        this.emplPositionTypeClassList = emplPositionTypeClassList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionClassTypeId != null ? emplPositionClassTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionClassType)) {
            return false;
        }
        EmplPositionClassType other = (EmplPositionClassType) object;
        if ((this.emplPositionClassTypeId == null && other.emplPositionClassTypeId != null) || (this.emplPositionClassTypeId != null && !this.emplPositionClassTypeId.equals(other.emplPositionClassTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionClassType[ emplPositionClassTypeId=" + emplPositionClassTypeId + " ]";
    }
    
}
