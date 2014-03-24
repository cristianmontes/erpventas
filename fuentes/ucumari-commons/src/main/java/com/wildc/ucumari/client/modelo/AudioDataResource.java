/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "audio_data_resource")
@NamedQueries({
    @NamedQuery(name = "AudioDataResource.findAll", query = "SELECT a FROM AudioDataResource a")})
public class AudioDataResource implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DATA_RESOURCE_ID")
    private String dataResourceId;
    @Lob
    @Column(name = "AUDIO_DATA")
    private byte[] audioData;
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
    @JoinColumn(name = "DATA_RESOURCE_ID", referencedColumnName = "DATA_RESOURCE_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private DataResource dataResource;

    public AudioDataResource() {
    }

    public AudioDataResource(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public String getDataResourceId() {
        return dataResourceId;
    }

    public void setDataResourceId(String dataResourceId) {
        this.dataResourceId = dataResourceId;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public void setAudioData(byte[] audioData) {
        this.audioData = audioData;
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

    public DataResource getDataResource() {
        return dataResource;
    }

    public void setDataResource(DataResource dataResource) {
        this.dataResource = dataResource;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dataResourceId != null ? dataResourceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AudioDataResource)) {
            return false;
        }
        AudioDataResource other = (AudioDataResource) object;
        if ((this.dataResourceId == null && other.dataResourceId != null) || (this.dataResourceId != null && !this.dataResourceId.equals(other.dataResourceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AudioDataResource[ dataResourceId=" + dataResourceId + " ]";
    }
    
}
