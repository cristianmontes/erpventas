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
@Table(name = "standard_language")
@NamedQueries({
    @NamedQuery(name = "StandardLanguage.findAll", query = "SELECT s FROM StandardLanguage s")})
public class StandardLanguage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STANDARD_LANGUAGE_ID")
    private String standardLanguageId;
    @Column(name = "LANG_CODE3T")
    private String langCode3t;
    @Column(name = "LANG_CODE3B")
    private String langCode3b;
    @Column(name = "LANG_CODE2")
    private String langCode2;
    @Column(name = "LANG_NAME")
    private String langName;
    @Column(name = "LANG_FAMILY")
    private String langFamily;
    @Column(name = "LANG_CHARSET")
    private String langCharset;
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

    public StandardLanguage() {
    }

    public StandardLanguage(String standardLanguageId) {
        this.standardLanguageId = standardLanguageId;
    }

    public String getStandardLanguageId() {
        return standardLanguageId;
    }

    public void setStandardLanguageId(String standardLanguageId) {
        this.standardLanguageId = standardLanguageId;
    }

    public String getLangCode3t() {
        return langCode3t;
    }

    public void setLangCode3t(String langCode3t) {
        this.langCode3t = langCode3t;
    }

    public String getLangCode3b() {
        return langCode3b;
    }

    public void setLangCode3b(String langCode3b) {
        this.langCode3b = langCode3b;
    }

    public String getLangCode2() {
        return langCode2;
    }

    public void setLangCode2(String langCode2) {
        this.langCode2 = langCode2;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String getLangFamily() {
        return langFamily;
    }

    public void setLangFamily(String langFamily) {
        this.langFamily = langFamily;
    }

    public String getLangCharset() {
        return langCharset;
    }

    public void setLangCharset(String langCharset) {
        this.langCharset = langCharset;
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
        hash += (standardLanguageId != null ? standardLanguageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StandardLanguage)) {
            return false;
        }
        StandardLanguage other = (StandardLanguage) object;
        if ((this.standardLanguageId == null && other.standardLanguageId != null) || (this.standardLanguageId != null && !this.standardLanguageId.equals(other.standardLanguageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.StandardLanguage[ standardLanguageId=" + standardLanguageId + " ]";
    }
    
}
