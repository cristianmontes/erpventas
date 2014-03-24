/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "server_hit")
@NamedQueries({
    @NamedQuery(name = "ServerHit.findAll", query = "SELECT s FROM ServerHit s")})
public class ServerHit implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServerHitPK serverHitPK;
    @Column(name = "NUM_OF_BYTES")
    private BigInteger numOfBytes;
    @Column(name = "RUNNING_TIME_MILLIS")
    private BigInteger runningTimeMillis;
    @Column(name = "REQUEST_URL")
    private String requestUrl;
    @Column(name = "REFERRER_URL")
    private String referrerUrl;
    @Column(name = "SERVER_IP_ADDRESS")
    private String serverIpAddress;
    @Column(name = "SERVER_HOST_NAME")
    private String serverHostName;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Visit visit;
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin userLoginId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "HIT_TYPE_ID", referencedColumnName = "HIT_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ServerHitType serverHitType;
    @JoinColumn(name = "REF_BY_WEB_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech refByWebContactMechId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "ID_BY_IP_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech idByIpContactMechId;
    @JoinColumn(name = "INTERNAL_CONTENT_ID", referencedColumnName = "CONTENT_ID")
    @ManyToOne
    private Content internalContentId;

    public ServerHit() {
    }

    public ServerHit(ServerHitPK serverHitPK) {
        this.serverHitPK = serverHitPK;
    }

    public ServerHit(String visitId, String contentId, Date hitStartDateTime, String hitTypeId) {
        this.serverHitPK = new ServerHitPK(visitId, contentId, hitStartDateTime, hitTypeId);
    }

    public ServerHitPK getServerHitPK() {
        return serverHitPK;
    }

    public void setServerHitPK(ServerHitPK serverHitPK) {
        this.serverHitPK = serverHitPK;
    }

    public BigInteger getNumOfBytes() {
        return numOfBytes;
    }

    public void setNumOfBytes(BigInteger numOfBytes) {
        this.numOfBytes = numOfBytes;
    }

    public BigInteger getRunningTimeMillis() {
        return runningTimeMillis;
    }

    public void setRunningTimeMillis(BigInteger runningTimeMillis) {
        this.runningTimeMillis = runningTimeMillis;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getReferrerUrl() {
        return referrerUrl;
    }

    public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public UserLogin getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(UserLogin userLoginId) {
        this.userLoginId = userLoginId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ServerHitType getServerHitType() {
        return serverHitType;
    }

    public void setServerHitType(ServerHitType serverHitType) {
        this.serverHitType = serverHitType;
    }

    public ContactMech getRefByWebContactMechId() {
        return refByWebContactMechId;
    }

    public void setRefByWebContactMechId(ContactMech refByWebContactMechId) {
        this.refByWebContactMechId = refByWebContactMechId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public ContactMech getIdByIpContactMechId() {
        return idByIpContactMechId;
    }

    public void setIdByIpContactMechId(ContactMech idByIpContactMechId) {
        this.idByIpContactMechId = idByIpContactMechId;
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
        hash += (serverHitPK != null ? serverHitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServerHit)) {
            return false;
        }
        ServerHit other = (ServerHit) object;
        if ((this.serverHitPK == null && other.serverHitPK != null) || (this.serverHitPK != null && !this.serverHitPK.equals(other.serverHitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ServerHit[ serverHitPK=" + serverHitPK + " ]";
    }
    
}
