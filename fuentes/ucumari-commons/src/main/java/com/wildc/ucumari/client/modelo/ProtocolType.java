/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserAgent;
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
@Table(name = "protocol_type")
@NamedQueries({
    @NamedQuery(name = "ProtocolType.findAll", query = "SELECT p FROM ProtocolType p")})
public class ProtocolType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROTOCOL_TYPE_ID")
    private String protocolTypeId;
    @Column(name = "PROTOCOL_NAME")
    private String protocolName;
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
    @OneToMany(mappedBy = "protocolTypeId")
    private List<UserAgent> userAgentList;

    public ProtocolType() {
    }

    public ProtocolType(String protocolTypeId) {
        this.protocolTypeId = protocolTypeId;
    }

    public String getProtocolTypeId() {
        return protocolTypeId;
    }

    public void setProtocolTypeId(String protocolTypeId) {
        this.protocolTypeId = protocolTypeId;
    }

    public String getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
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

    public List<UserAgent> getUserAgentList() {
        return userAgentList;
    }

    public void setUserAgentList(List<UserAgent> userAgentList) {
        this.userAgentList = userAgentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (protocolTypeId != null ? protocolTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProtocolType)) {
            return false;
        }
        ProtocolType other = (ProtocolType) object;
        if ((this.protocolTypeId == null && other.protocolTypeId != null) || (this.protocolTypeId != null && !this.protocolTypeId.equals(other.protocolTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProtocolType[ protocolTypeId=" + protocolTypeId + " ]";
    }
    
}
