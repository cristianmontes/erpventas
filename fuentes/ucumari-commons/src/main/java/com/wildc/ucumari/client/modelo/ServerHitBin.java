/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "server_hit_bin")
@NamedQueries({
    @NamedQuery(name = "ServerHitBin.findAll", query = "SELECT s FROM ServerHitBin s")})
public class ServerHitBin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SERVER_HIT_BIN_ID")
    private String serverHitBinId;
    @Column(name = "CONTENT_ID")
    private String contentId;
    @Column(name = "SERVER_IP_ADDRESS")
    private String serverIpAddress;
    @Column(name = "SERVER_HOST_NAME")
    private String serverHostName;
    @Column(name = "BIN_START_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date binStartDateTime;
    @Column(name = "BIN_END_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date binEndDateTime;
    @Column(name = "NUMBER_HITS")
    private BigInteger numberHits;
    @Column(name = "TOTAL_TIME_MILLIS")
    private BigInteger totalTimeMillis;
    @Column(name = "MIN_TIME_MILLIS")
    private BigInteger minTimeMillis;
    @Column(name = "MAX_TIME_MILLIS")
    private BigInteger maxTimeMillis;
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
    @JoinColumn(name = "HIT_TYPE_ID", referencedColumnName = "HIT_TYPE_ID")
    @ManyToOne
    private ServerHitType hitTypeId;
    @JoinColumn(name = "INTERNAL_CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content internalContentId;

    public ServerHitBin() {
    }

    public ServerHitBin(String serverHitBinId) {
        this.serverHitBinId = serverHitBinId;
    }

    public String getServerHitBinId() {
        return serverHitBinId;
    }

    public void setServerHitBinId(String serverHitBinId) {
        this.serverHitBinId = serverHitBinId;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerHostName() {
        return serverHostName;
    }

    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
    }

    public Date getBinStartDateTime() {
        return binStartDateTime;
    }

    public void setBinStartDateTime(Date binStartDateTime) {
        this.binStartDateTime = binStartDateTime;
    }

    public Date getBinEndDateTime() {
        return binEndDateTime;
    }

    public void setBinEndDateTime(Date binEndDateTime) {
        this.binEndDateTime = binEndDateTime;
    }

    public BigInteger getNumberHits() {
        return numberHits;
    }

    public void setNumberHits(BigInteger numberHits) {
        this.numberHits = numberHits;
    }

    public BigInteger getTotalTimeMillis() {
        return totalTimeMillis;
    }

    public void setTotalTimeMillis(BigInteger totalTimeMillis) {
        this.totalTimeMillis = totalTimeMillis;
    }

    public BigInteger getMinTimeMillis() {
        return minTimeMillis;
    }

    public void setMinTimeMillis(BigInteger minTimeMillis) {
        this.minTimeMillis = minTimeMillis;
    }

    public BigInteger getMaxTimeMillis() {
        return maxTimeMillis;
    }

    public void setMaxTimeMillis(BigInteger maxTimeMillis) {
        this.maxTimeMillis = maxTimeMillis;
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

    public ServerHitType getHitTypeId() {
        return hitTypeId;
    }

    public void setHitTypeId(ServerHitType hitTypeId) {
        this.hitTypeId = hitTypeId;
    }

    public Content getInternalContentId() {
        return internalContentId;
    }

    public void setInternalContentId(Content internalContentId) {
        this.internalContentId = internalContentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serverHitBinId != null ? serverHitBinId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServerHitBin)) {
            return false;
        }
        ServerHitBin other = (ServerHitBin) object;
        if ((this.serverHitBinId == null && other.serverHitBinId != null) || (this.serverHitBinId != null && !this.serverHitBinId.equals(other.serverHitBinId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ServerHitBin[ serverHitBinId=" + serverHitBinId + " ]";
    }
    
}
