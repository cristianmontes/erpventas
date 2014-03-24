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
@Table(name = "character_set")
@NamedQueries({
    @NamedQuery(name = "CharacterSet.findAll", query = "SELECT c FROM CharacterSet c")})
public class CharacterSet implements Serializable {
    @OneToMany(mappedBy = "characterSetId")
    private List<Content> contentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHARACTER_SET_ID")
    private String characterSetId;
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
    @OneToMany(mappedBy = "characterSetId")
    private List<DataResource> dataResourceList;

    public CharacterSet() {
    }

    public CharacterSet(String characterSetId) {
        this.characterSetId = characterSetId;
    }

    public String getCharacterSetId() {
        return characterSetId;
    }

    public void setCharacterSetId(String characterSetId) {
        this.characterSetId = characterSetId;
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

    public List<DataResource> getDataResourceList() {
        return dataResourceList;
    }

    public void setDataResourceList(List<DataResource> dataResourceList) {
        this.dataResourceList = dataResourceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (characterSetId != null ? characterSetId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CharacterSet)) {
            return false;
        }
        CharacterSet other = (CharacterSet) object;
        if ((this.characterSetId == null && other.characterSetId != null) || (this.characterSetId != null && !this.characterSetId.equals(other.characterSetId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CharacterSet[ characterSetId=" + characterSetId + " ]";
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }
    
}
