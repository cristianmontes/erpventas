/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PostalAddressBoundaryPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_ID")
    private String contactMechId;
    @Basic(optional = false)
    @Column(name = "GEO_ID")
    private String geoId;

    public PostalAddressBoundaryPK() {
    }

    public PostalAddressBoundaryPK(String contactMechId, String geoId) {
        this.contactMechId = contactMechId;
        this.geoId = geoId;
    }

    public String getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(String contactMechId) {
        this.contactMechId = contactMechId;
    }

    public String getGeoId() {
        return geoId;
    }

    public void setGeoId(String geoId) {
        this.geoId = geoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechId != null ? contactMechId.hashCode() : 0);
        hash += (geoId != null ? geoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostalAddressBoundaryPK)) {
            return false;
        }
        PostalAddressBoundaryPK other = (PostalAddressBoundaryPK) object;
        if ((this.contactMechId == null && other.contactMechId != null) || (this.contactMechId != null && !this.contactMechId.equals(other.contactMechId))) {
            return false;
        }
        if ((this.geoId == null && other.geoId != null) || (this.geoId != null && !this.geoId.equals(other.geoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PostalAddressBoundaryPK[ contactMechId=" + contactMechId + ", geoId=" + geoId + " ]";
    }
    
}
