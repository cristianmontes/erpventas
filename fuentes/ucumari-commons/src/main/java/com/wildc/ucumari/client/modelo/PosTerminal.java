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
import javax.persistence.CascadeType;
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
@Table(name = "pos_terminal")
@NamedQueries({
    @NamedQuery(name = "PosTerminal.findAll", query = "SELECT p FROM PosTerminal p")})
public class PosTerminal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "POS_TERMINAL_ID")
    private String posTerminalId;
    @Column(name = "FACILITY_ID")
    private String facilityId;
    @Column(name = "PUSH_ENTITY_SYNC_ID")
    private String pushEntitySyncId;
    @Column(name = "TERMINAL_NAME")
    private String terminalName;
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
    @OneToMany(mappedBy = "posTerminalId")
    private List<PosTerminalLog> posTerminalLogList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "posTerminal")
    private List<PosTerminalState> posTerminalStateList;

    public PosTerminal() {
    }

    public PosTerminal(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }

    public String getPosTerminalId() {
        return posTerminalId;
    }

    public void setPosTerminalId(String posTerminalId) {
        this.posTerminalId = posTerminalId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getPushEntitySyncId() {
        return pushEntitySyncId;
    }

    public void setPushEntitySyncId(String pushEntitySyncId) {
        this.pushEntitySyncId = pushEntitySyncId;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
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

    public List<PosTerminalLog> getPosTerminalLogList() {
        return posTerminalLogList;
    }

    public void setPosTerminalLogList(List<PosTerminalLog> posTerminalLogList) {
        this.posTerminalLogList = posTerminalLogList;
    }

    public List<PosTerminalState> getPosTerminalStateList() {
        return posTerminalStateList;
    }

    public void setPosTerminalStateList(List<PosTerminalState> posTerminalStateList) {
        this.posTerminalStateList = posTerminalStateList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (posTerminalId != null ? posTerminalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PosTerminal)) {
            return false;
        }
        PosTerminal other = (PosTerminal) object;
        if ((this.posTerminalId == null && other.posTerminalId != null) || (this.posTerminalId != null && !this.posTerminalId.equals(other.posTerminalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PosTerminal[ posTerminalId=" + posTerminalId + " ]";
    }
    
}
