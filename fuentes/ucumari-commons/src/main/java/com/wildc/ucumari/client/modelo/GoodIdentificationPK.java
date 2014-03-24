/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class GoodIdentificationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GOOD_IDENTIFICATION_TYPE_ID")
    private String goodIdentificationTypeId;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;

    public GoodIdentificationPK() {
    }

    public GoodIdentificationPK(String goodIdentificationTypeId, String productId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
        this.productId = productId;
    }

    public String getGoodIdentificationTypeId() {
        return goodIdentificationTypeId;
    }

    public void setGoodIdentificationTypeId(String goodIdentificationTypeId) {
        this.goodIdentificationTypeId = goodIdentificationTypeId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (goodIdentificationTypeId != null ? goodIdentificationTypeId.hashCode() : 0);
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GoodIdentificationPK)) {
            return false;
        }
        GoodIdentificationPK other = (GoodIdentificationPK) object;
        if ((this.goodIdentificationTypeId == null && other.goodIdentificationTypeId != null) || (this.goodIdentificationTypeId != null && !this.goodIdentificationTypeId.equals(other.goodIdentificationTypeId))) {
            return false;
        }
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GoodIdentificationPK[ goodIdentificationTypeId=" + goodIdentificationTypeId + ", productId=" + productId + " ]";
    }
    
}
