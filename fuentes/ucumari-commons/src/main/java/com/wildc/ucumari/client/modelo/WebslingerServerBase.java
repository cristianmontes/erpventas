/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "webslinger_server_base")
@NamedQueries({
    @NamedQuery(name = "WebslingerServerBase.findAll", query = "SELECT w FROM WebslingerServerBase w")})
public class WebslingerServerBase implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WebslingerServerBasePK webslingerServerBasePK;
    @Column(name = "SEQ_NUM")
    private BigInteger seqNum;
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
    @JoinColumn(name = "WEBSLINGER_SERVER_ID", referencedColumnName = "WEBSLINGER_SERVER_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private WebslingerServer webslingerServer;

    public WebslingerServerBase() {
    }

    public WebslingerServerBase(WebslingerServerBasePK webslingerServerBasePK) {
        this.webslingerServerBasePK = webslingerServerBasePK;
    }

    public WebslingerServerBase(String webslingerServerId, String baseName) {
        this.webslingerServerBasePK = new WebslingerServerBasePK(webslingerServerId, baseName);
    }

    public WebslingerServerBasePK getWebslingerServerBasePK() {
        return webslingerServerBasePK;
    }

    public void setWebslingerServerBasePK(WebslingerServerBasePK webslingerServerBasePK) {
        this.webslingerServerBasePK = webslingerServerBasePK;
    }

    public BigInteger getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(BigInteger seqNum) {
        this.seqNum = seqNum;
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

    public WebslingerServer getWebslingerServer() {
        return webslingerServer;
    }

    public void setWebslingerServer(WebslingerServer webslingerServer) {
        this.webslingerServer = webslingerServer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webslingerServerBasePK != null ? webslingerServerBasePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerServerBase)) {
            return false;
        }
        WebslingerServerBase other = (WebslingerServerBase) object;
        if ((this.webslingerServerBasePK == null && other.webslingerServerBasePK != null) || (this.webslingerServerBasePK != null && !this.webslingerServerBasePK.equals(other.webslingerServerBasePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerServerBase[ webslingerServerBasePK=" + webslingerServerBasePK + " ]";
    }
    
}
