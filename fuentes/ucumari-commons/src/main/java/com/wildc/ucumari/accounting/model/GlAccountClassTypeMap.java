/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "gl_account_class_type_map")
@NamedQueries({
    @NamedQuery(name = "GlAccountClassTypeMap.findAll", query = "SELECT g FROM GlAccountClassTypeMap g")})
public class GlAccountClassTypeMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_CLASS_TYPE_KEY")
    private String glAccountClassTypeKey;
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
    @JoinColumn(name = "GL_ACCOUNT_TYPE_ID", referencedColumnName = "GL_ACCOUNT_TYPE_ID")
    @ManyToOne
    private GlAccountType glAccountTypeId;
    @JoinColumn(name = "GL_ACCOUNT_CLASS_ID", referencedColumnName = "GL_ACCOUNT_CLASS_ID")
    @ManyToOne
    private GlAccountClass glAccountClassId;

    public GlAccountClassTypeMap() {
    }

    public GlAccountClassTypeMap(String glAccountClassTypeKey) {
        this.glAccountClassTypeKey = glAccountClassTypeKey;
    }

    public String getGlAccountClassTypeKey() {
        return glAccountClassTypeKey;
    }

    public void setGlAccountClassTypeKey(String glAccountClassTypeKey) {
        this.glAccountClassTypeKey = glAccountClassTypeKey;
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

    public GlAccountType getGlAccountTypeId() {
        return glAccountTypeId;
    }

    public void setGlAccountTypeId(GlAccountType glAccountTypeId) {
        this.glAccountTypeId = glAccountTypeId;
    }

    public GlAccountClass getGlAccountClassId() {
        return glAccountClassId;
    }

    public void setGlAccountClassId(GlAccountClass glAccountClassId) {
        this.glAccountClassId = glAccountClassId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountClassTypeKey != null ? glAccountClassTypeKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlAccountClassTypeMap)) {
            return false;
        }
        GlAccountClassTypeMap other = (GlAccountClassTypeMap) object;
        if ((this.glAccountClassTypeKey == null && other.glAccountClassTypeKey != null) || (this.glAccountClassTypeKey != null && !this.glAccountClassTypeKey.equals(other.glAccountClassTypeKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlAccountClassTypeMap[ glAccountClassTypeKey=" + glAccountClassTypeKey + " ]";
    }
    
}
