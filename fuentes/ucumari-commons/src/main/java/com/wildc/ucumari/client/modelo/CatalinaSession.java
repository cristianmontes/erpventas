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
import javax.persistence.Lob;
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
@Table(name = "catalina_session")
@NamedQueries({
    @NamedQuery(name = "CatalinaSession.findAll", query = "SELECT c FROM CatalinaSession c")})
public class CatalinaSession implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Column(name = "SESSION_SIZE")
    private BigInteger sessionSize;
    @Lob
    @Column(name = "SESSION_INFO")
    private byte[] sessionInfo;
    @Column(name = "IS_VALID")
    private Character isValid;
    @Column(name = "MAX_IDLE")
    private BigInteger maxIdle;
    @Column(name = "LAST_ACCESSED")
    private BigInteger lastAccessed;
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

    public CatalinaSession() {
    }

    public CatalinaSession(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public BigInteger getSessionSize() {
        return sessionSize;
    }

    public void setSessionSize(BigInteger sessionSize) {
        this.sessionSize = sessionSize;
    }

    public byte[] getSessionInfo() {
        return sessionInfo;
    }

    public void setSessionInfo(byte[] sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    public Character getIsValid() {
        return isValid;
    }

    public void setIsValid(Character isValid) {
        this.isValid = isValid;
    }

    public BigInteger getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(BigInteger maxIdle) {
        this.maxIdle = maxIdle;
    }

    public BigInteger getLastAccessed() {
        return lastAccessed;
    }

    public void setLastAccessed(BigInteger lastAccessed) {
        this.lastAccessed = lastAccessed;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sessionId != null ? sessionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CatalinaSession)) {
            return false;
        }
        CatalinaSession other = (CatalinaSession) object;
        if ((this.sessionId == null && other.sessionId != null) || (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CatalinaSession[ sessionId=" + sessionId + " ]";
    }
    
}
