/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "keyword_thesaurus")
@NamedQueries({
    @NamedQuery(name = "KeywordThesaurus.findAll", query = "SELECT k FROM KeywordThesaurus k")})
public class KeywordThesaurus implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected KeywordThesaurusPK keywordThesaurusPK;
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
    @JoinColumn(name = "RELATIONSHIP_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration relationshipEnumId;

    public KeywordThesaurus() {
    }

    public KeywordThesaurus(KeywordThesaurusPK keywordThesaurusPK) {
        this.keywordThesaurusPK = keywordThesaurusPK;
    }

    public KeywordThesaurus(String enteredKeyword, String alternateKeyword) {
        this.keywordThesaurusPK = new KeywordThesaurusPK(enteredKeyword, alternateKeyword);
    }

    public KeywordThesaurusPK getKeywordThesaurusPK() {
        return keywordThesaurusPK;
    }

    public void setKeywordThesaurusPK(KeywordThesaurusPK keywordThesaurusPK) {
        this.keywordThesaurusPK = keywordThesaurusPK;
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

    public Enumeration getRelationshipEnumId() {
        return relationshipEnumId;
    }

    public void setRelationshipEnumId(Enumeration relationshipEnumId) {
        this.relationshipEnumId = relationshipEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keywordThesaurusPK != null ? keywordThesaurusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeywordThesaurus)) {
            return false;
        }
        KeywordThesaurus other = (KeywordThesaurus) object;
        if ((this.keywordThesaurusPK == null && other.keywordThesaurusPK != null) || (this.keywordThesaurusPK != null && !this.keywordThesaurusPK.equals(other.keywordThesaurusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.KeywordThesaurus[ keywordThesaurusPK=" + keywordThesaurusPK + " ]";
    }
    
}
