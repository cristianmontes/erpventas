/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "data_warehouse_transform")
@NamedQueries({
    @NamedQuery(name = "DataWarehouseTransform.findAll", query = "SELECT d FROM DataWarehouseTransform d")})
public class DataWarehouseTransform implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRANSFORM_ID")
    private String transformId;
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;
    @Column(name = "TRANSFORM_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transformTimestamp;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin userLoginId;
    @JoinColumn(name = "TRANSFORM_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration transformEnumId;

    public DataWarehouseTransform() {
    }

    public DataWarehouseTransform(String transformId) {
        this.transformId = transformId;
    }

    public String getTransformId() {
        return transformId;
    }

    public void setTransformId(String transformId) {
        this.transformId = transformId;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    public Date getTransformTimestamp() {
        return transformTimestamp;
    }

    public void setTransformTimestamp(Date transformTimestamp) {
        this.transformTimestamp = transformTimestamp;
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

    public UserLogin getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(UserLogin userLoginId) {
        this.userLoginId = userLoginId;
    }

    public Enumeration getTransformEnumId() {
        return transformEnumId;
    }

    public void setTransformEnumId(Enumeration transformEnumId) {
        this.transformEnumId = transformEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transformId != null ? transformId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataWarehouseTransform)) {
            return false;
        }
        DataWarehouseTransform other = (DataWarehouseTransform) object;
        if ((this.transformId == null && other.transformId != null) || (this.transformId != null && !this.transformId.equals(other.transformId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataWarehouseTransform[ transformId=" + transformId + " ]";
    }
    
}
