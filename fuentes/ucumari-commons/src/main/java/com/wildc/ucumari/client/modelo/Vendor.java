/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.party.model.Party;
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
@Table(name = "vendor")
@NamedQueries({
    @NamedQuery(name = "Vendor.findAll", query = "SELECT v FROM Vendor v")})
public class Vendor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "MANIFEST_COMPANY_NAME")
    private String manifestCompanyName;
    @Column(name = "MANIFEST_COMPANY_TITLE")
    private String manifestCompanyTitle;
    @Column(name = "MANIFEST_LOGO_URL")
    private String manifestLogoUrl;
    @Lob
    @Column(name = "MANIFEST_POLICIES")
    private String manifestPolicies;
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
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;

    public Vendor() {
    }

    public Vendor(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getManifestCompanyName() {
        return manifestCompanyName;
    }

    public void setManifestCompanyName(String manifestCompanyName) {
        this.manifestCompanyName = manifestCompanyName;
    }

    public String getManifestCompanyTitle() {
        return manifestCompanyTitle;
    }

    public void setManifestCompanyTitle(String manifestCompanyTitle) {
        this.manifestCompanyTitle = manifestCompanyTitle;
    }

    public String getManifestLogoUrl() {
        return manifestLogoUrl;
    }

    public void setManifestLogoUrl(String manifestLogoUrl) {
        this.manifestLogoUrl = manifestLogoUrl;
    }

    public String getManifestPolicies() {
        return manifestPolicies;
    }

    public void setManifestPolicies(String manifestPolicies) {
        this.manifestPolicies = manifestPolicies;
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

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendor)) {
            return false;
        }
        Vendor other = (Vendor) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Vendor[ partyId=" + partyId + " ]";
    }
    
}
