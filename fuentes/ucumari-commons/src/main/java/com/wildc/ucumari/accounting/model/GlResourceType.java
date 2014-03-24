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
@Table(name = "gl_resource_type")
@NamedQueries({
    @NamedQuery(name = "GlResourceType.findAll", query = "SELECT g FROM GlResourceType g")})
public class GlResourceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "GL_RESOURCE_TYPE_ID")
    private String glResourceTypeId;
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
    @OneToMany(mappedBy = "glResourceTypeId")
    private List<GlAccount> glAccountList;

    public GlResourceType() {
    }

    public GlResourceType(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
    }

    public String getGlResourceTypeId() {
        return glResourceTypeId;
    }

    public void setGlResourceTypeId(String glResourceTypeId) {
        this.glResourceTypeId = glResourceTypeId;
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
        hash += (glResourceTypeId != null ? glResourceTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlResourceType)) {
            return false;
        }
        GlResourceType other = (GlResourceType) object;
        if ((this.glResourceTypeId == null && other.glResourceTypeId != null) || (this.glResourceTypeId != null && !this.glResourceTypeId.equals(other.glResourceTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlResourceType[ glResourceTypeId=" + glResourceTypeId + " ]";
    }
    
}
