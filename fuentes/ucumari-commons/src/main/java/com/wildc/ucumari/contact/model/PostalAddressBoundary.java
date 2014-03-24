/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

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

import com.wildc.ucumari.parameters.model.Geo;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "postal_address_boundary")
@NamedQueries({
    @NamedQuery(name = "PostalAddressBoundary.findAll", query = "SELECT p FROM PostalAddressBoundary p")})
public class PostalAddressBoundary implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PostalAddressBoundaryPK postalAddressBoundaryPK;
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
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Geo geo;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private PostalAddress postalAddress;

    public PostalAddressBoundary() {
    }

    public PostalAddressBoundary(PostalAddressBoundaryPK postalAddressBoundaryPK) {
        this.postalAddressBoundaryPK = postalAddressBoundaryPK;
    }

    public PostalAddressBoundary(String contactMechId, String geoId) {
        this.postalAddressBoundaryPK = new PostalAddressBoundaryPK(contactMechId, geoId);
    }

    public PostalAddressBoundaryPK getPostalAddressBoundaryPK() {
        return postalAddressBoundaryPK;
    }

    public void setPostalAddressBoundaryPK(PostalAddressBoundaryPK postalAddressBoundaryPK) {
        this.postalAddressBoundaryPK = postalAddressBoundaryPK;
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

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (postalAddressBoundaryPK != null ? postalAddressBoundaryPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PostalAddressBoundary)) {
            return false;
        }
        PostalAddressBoundary other = (PostalAddressBoundary) object;
        if ((this.postalAddressBoundaryPK == null && other.postalAddressBoundaryPK != null) || (this.postalAddressBoundaryPK != null && !this.postalAddressBoundaryPK.equals(other.postalAddressBoundaryPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PostalAddressBoundary[ postalAddressBoundaryPK=" + postalAddressBoundaryPK + " ]";
    }
    
}
