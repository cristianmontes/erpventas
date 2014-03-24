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

import com.wildc.ucumari.product.model.ProductFeature;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "desired_feature")
@NamedQueries({
    @NamedQuery(name = "DesiredFeature.findAll", query = "SELECT d FROM DesiredFeature d")})
public class DesiredFeature implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DesiredFeaturePK desiredFeaturePK;
    @Column(name = "OPTIONAL_IND")
    private Character optionalInd;
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
    @JoinColumn(name = "REQUIREMENT_ID", referencedColumnName = "REQUIREMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Requirement requirement;
    @JoinColumn(name = "PRODUCT_FEATURE_ID", referencedColumnName = "PRODUCT_FEATURE_ID")
    @ManyToOne
    private ProductFeature productFeatureId;

    public DesiredFeature() {
    }

    public DesiredFeature(DesiredFeaturePK desiredFeaturePK) {
        this.desiredFeaturePK = desiredFeaturePK;
    }

    public DesiredFeature(String desiredFeatureId, String requirementId) {
        this.desiredFeaturePK = new DesiredFeaturePK(desiredFeatureId, requirementId);
    }

    public DesiredFeaturePK getDesiredFeaturePK() {
        return desiredFeaturePK;
    }

    public void setDesiredFeaturePK(DesiredFeaturePK desiredFeaturePK) {
        this.desiredFeaturePK = desiredFeaturePK;
    }

    public Character getOptionalInd() {
        return optionalInd;
    }

    public void setOptionalInd(Character optionalInd) {
        this.optionalInd = optionalInd;
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

    public Requirement getRequirement() {
        return requirement;
    }

    public void setRequirement(Requirement requirement) {
        this.requirement = requirement;
    }

    public ProductFeature getProductFeatureId() {
        return productFeatureId;
    }

    public void setProductFeatureId(ProductFeature productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (desiredFeaturePK != null ? desiredFeaturePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DesiredFeature)) {
            return false;
        }
        DesiredFeature other = (DesiredFeature) object;
        if ((this.desiredFeaturePK == null && other.desiredFeaturePK != null) || (this.desiredFeaturePK != null && !this.desiredFeaturePK.equals(other.desiredFeaturePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DesiredFeature[ desiredFeaturePK=" + desiredFeaturePK + " ]";
    }
    
}
