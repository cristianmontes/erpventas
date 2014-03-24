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
@Table(name = "address_match_map")
@NamedQueries({
    @NamedQuery(name = "AddressMatchMap.findAll", query = "SELECT a FROM AddressMatchMap a")})
public class AddressMatchMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AddressMatchMapPK addressMatchMapPK;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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

    public AddressMatchMap() {
    }

    public AddressMatchMap(AddressMatchMapPK addressMatchMapPK) {
        this.addressMatchMapPK = addressMatchMapPK;
    }

    public AddressMatchMap(String mapKey, String mapValue) {
        this.addressMatchMapPK = new AddressMatchMapPK(mapKey, mapValue);
    }

    public AddressMatchMapPK getAddressMatchMapPK() {
        return addressMatchMapPK;
    }

    public void setAddressMatchMapPK(AddressMatchMapPK addressMatchMapPK) {
        this.addressMatchMapPK = addressMatchMapPK;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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
        hash += (addressMatchMapPK != null ? addressMatchMapPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressMatchMap)) {
            return false;
        }
        AddressMatchMap other = (AddressMatchMap) object;
        if ((this.addressMatchMapPK == null && other.addressMatchMapPK != null) || (this.addressMatchMapPK != null && !this.addressMatchMapPK.equals(other.addressMatchMapPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AddressMatchMap[ addressMatchMapPK=" + addressMatchMapPK + " ]";
    }
    
}
