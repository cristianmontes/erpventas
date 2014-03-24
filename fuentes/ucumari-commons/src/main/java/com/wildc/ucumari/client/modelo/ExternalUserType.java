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
@Table(name = "external_user_type")
@NamedQueries({
    @NamedQuery(name = "ExternalUserType.findAll", query = "SELECT e FROM ExternalUserType e")})
public class ExternalUserType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EXTERNAL_USER_TYPE_ID")
    private String externalUserTypeId;
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
    @OneToMany(mappedBy = "externalUserTypeId")
    private List<ExternalUser> externalUserList;

    public ExternalUserType() {
    }

    public ExternalUserType(String externalUserTypeId) {
        this.externalUserTypeId = externalUserTypeId;
    }

    public String getExternalUserTypeId() {
        return externalUserTypeId;
    }

    public void setExternalUserTypeId(String externalUserTypeId) {
        this.externalUserTypeId = externalUserTypeId;
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

    public List<ExternalUser> getExternalUserList() {
        return externalUserList;
    }

    public void setExternalUserList(List<ExternalUser> externalUserList) {
        this.externalUserList = externalUserList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (externalUserTypeId != null ? externalUserTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExternalUserType)) {
            return false;
        }
        ExternalUserType other = (ExternalUserType) object;
        if ((this.externalUserTypeId == null && other.externalUserTypeId != null) || (this.externalUserTypeId != null && !this.externalUserTypeId.equals(other.externalUserTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExternalUserType[ externalUserTypeId=" + externalUserTypeId + " ]";
    }
    
}
