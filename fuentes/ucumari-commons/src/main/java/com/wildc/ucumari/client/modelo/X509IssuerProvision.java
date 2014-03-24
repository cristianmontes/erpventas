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
@Table(name = "x509_issuer_provision")
@NamedQueries({
    @NamedQuery(name = "X509IssuerProvision.findAll", query = "SELECT x FROM X509IssuerProvision x")})
public class X509IssuerProvision implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CERT_PROVISION_ID")
    private String certProvisionId;
    @Column(name = "COMMON_NAME")
    private String commonName;
    @Column(name = "ORGANIZATIONAL_UNIT")
    private String organizationalUnit;
    @Column(name = "ORGANIZATION_NAME")
    private String organizationName;
    @Column(name = "CITY_LOCALITY")
    private String cityLocality;
    @Column(name = "STATE_PROVINCE")
    private String stateProvince;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "SERIAL_NUMBER")
    private String serialNumber;
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

    public X509IssuerProvision() {
    }

    public X509IssuerProvision(String certProvisionId) {
        this.certProvisionId = certProvisionId;
    }

    public String getCertProvisionId() {
        return certProvisionId;
    }

    public void setCertProvisionId(String certProvisionId) {
        this.certProvisionId = certProvisionId;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getCityLocality() {
        return cityLocality;
    }

    public void setCityLocality(String cityLocality) {
        this.cityLocality = cityLocality;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
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
        hash += (certProvisionId != null ? certProvisionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof X509IssuerProvision)) {
            return false;
        }
        X509IssuerProvision other = (X509IssuerProvision) object;
        if ((this.certProvisionId == null && other.certProvisionId != null) || (this.certProvisionId != null && !this.certProvisionId.equals(other.certProvisionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.X509IssuerProvision[ certProvisionId=" + certProvisionId + " ]";
    }
    
}
