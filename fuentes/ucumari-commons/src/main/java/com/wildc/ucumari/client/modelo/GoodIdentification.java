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

import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "good_identification")
@NamedQueries({
    @NamedQuery(name = "GoodIdentification.findAll", query = "SELECT g FROM GoodIdentification g")})
public class GoodIdentification implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GoodIdentificationPK goodIdentificationPK;
    @Column(name = "ID_VALUE")
    private String idValue;
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
    @JoinColumn(name = "GOOD_IDENTIFICATION_TYPE_ID", referencedColumnName = "GOOD_IDENTIFICATION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GoodIdentificationType goodIdentificationType;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public GoodIdentification() {
    }

    public GoodIdentification(GoodIdentificationPK goodIdentificationPK) {
        this.goodIdentificationPK = goodIdentificationPK;
    }

    public GoodIdentification(String goodIdentificationTypeId, String productId) {
        this.goodIdentificationPK = new GoodIdentificationPK(goodIdentificationTypeId, productId);
    }

    public GoodIdentificationPK getGoodIdentificationPK() {
        return goodIdentificationPK;
    }

    public void setGoodIdentificationPK(GoodIdentificationPK goodIdentificationPK) {
        this.goodIdentificationPK = goodIdentificationPK;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
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

    public GoodIdentificationType getGoodIdentificationType() {
        return goodIdentificationType;
    }

    public void setGoodIdentificationType(GoodIdentificationType goodIdentificationType) {
        this.goodIdentificationType = goodIdentificationType;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goodIdentificationPK != null ? goodIdentificationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GoodIdentification)) {
            return false;
        }
        GoodIdentification other = (GoodIdentification) object;
        if ((this.goodIdentificationPK == null && other.goodIdentificationPK != null) || (this.goodIdentificationPK != null && !this.goodIdentificationPK.equals(other.goodIdentificationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GoodIdentification[ goodIdentificationPK=" + goodIdentificationPK + " ]";
    }
    
}
