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
@Table(name = "gl_xbrl_class")
@NamedQueries({
    @NamedQuery(name = "GlXbrlClass.findAll", query = "SELECT g FROM GlXbrlClass g")})
public class GlXbrlClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_XBRL_CLASS_ID")
    private String glXbrlClassId;
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
    @OneToMany(mappedBy = "glXbrlClassId")
    private List<GlAccount> glAccountList;

    public GlXbrlClass() {
    }

    public GlXbrlClass(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
    }

    public String getGlXbrlClassId() {
        return glXbrlClassId;
    }

    public void setGlXbrlClassId(String glXbrlClassId) {
        this.glXbrlClassId = glXbrlClassId;
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

    public List<GlAccount> getGlAccountList() {
        return glAccountList;
    }

    public void setGlAccountList(List<GlAccount> glAccountList) {
        this.glAccountList = glAccountList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glXbrlClassId != null ? glXbrlClassId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlXbrlClass)) {
            return false;
        }
        GlXbrlClass other = (GlXbrlClass) object;
        if ((this.glXbrlClassId == null && other.glXbrlClassId != null) || (this.glXbrlClassId != null && !this.glXbrlClassId.equals(other.glXbrlClassId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlXbrlClass[ glXbrlClassId=" + glXbrlClassId + " ]";
    }
    
}
