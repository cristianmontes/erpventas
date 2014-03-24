/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "gl_account_class")
@NamedQueries({
    @NamedQuery(name = "GlAccountClass.findAll", query = "SELECT g FROM GlAccountClass g")})
public class GlAccountClass implements Serializable {
    @OneToMany(mappedBy = "glAccountClassId")
    private List<GlAccountClassTypeMap> glAccountClassTypeMapList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_CLASS_ID")
    private String glAccountClassId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IS_ASSET_CLASS")
    private Character isAssetClass;
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
    @OneToMany(mappedBy = "parentClassId")
    private List<GlAccountClass> glAccountClassList;
    @JoinColumn(name = "PARENT_CLASS_ID", referencedColumnName = "GL_ACCOUNT_CLASS_ID")
    @ManyToOne
    private GlAccountClass parentClassId;
    @OneToMany(mappedBy = "glAccountClassId")
    private List<GlAccount> glAccountList;

    public GlAccountClass() {
    }

    public GlAccountClass(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }

    public String getGlAccountClassId() {
        return glAccountClassId;
    }

    public void setGlAccountClassId(String glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getIsAssetClass() {
        return isAssetClass;
    }

    public void setIsAssetClass(Character isAssetClass) {
        this.isAssetClass = isAssetClass;
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

    public List<GlAccountClass> getGlAccountClassList() {
        return glAccountClassList;
    }

    public void setGlAccountClassList(List<GlAccountClass> glAccountClassList) {
        this.glAccountClassList = glAccountClassList;
    }

    public GlAccountClass getParentClassId() {
        return parentClassId;
    }

    public void setParentClassId(GlAccountClass parentClassId) {
        this.parentClassId = parentClassId;
    }

    public List<GlAccount> getGlAccountList() {
        return glAccountList;
    }

    public void setGlAccountList(List<GlAccount> glAccountList) {
        this.glAccountList = glAccountList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountClassId != null ? glAccountClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountClass)) {
            return false;
        }
        GlAccountClass other = (GlAccountClass) object;
        if ((this.glAccountClassId == null && other.glAccountClassId != null) || (this.glAccountClassId != null && !this.glAccountClassId.equals(other.glAccountClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountClass[ glAccountClassId=" + glAccountClassId + " ]";
    }

    public List<GlAccountClassTypeMap> getGlAccountClassTypeMapList() {
        return glAccountClassTypeMapList;
    }

    public void setGlAccountClassTypeMapList(List<GlAccountClassTypeMap> glAccountClassTypeMapList) {
        this.glAccountClassTypeMapList = glAccountClassTypeMapList;
    }
    
}
