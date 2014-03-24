/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductPromoCodeEmailPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_PROMO_CODE_ID")
    private String productPromoCodeId;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    public ProductPromoCodeEmailPK() {
    }

    public ProductPromoCodeEmailPK(String productPromoCodeId, String emailAddress) {
        this.productPromoCodeId = productPromoCodeId;
        this.emailAddress = emailAddress;
    }

    public String getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(String productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productPromoCodeId != null ? productPromoCodeId.hashCode() : 0);
        hash += (emailAddress != null ? emailAddress.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoCodeEmailPK)) {
            return false;
        }
        ProductPromoCodeEmailPK other = (ProductPromoCodeEmailPK) object;
        if ((this.productPromoCodeId == null && other.productPromoCodeId != null) || (this.productPromoCodeId != null && !this.productPromoCodeId.equals(other.productPromoCodeId))) {
            return false;
        }
        if ((this.emailAddress == null && other.emailAddress != null) || (this.emailAddress != null && !this.emailAddress.equals(other.emailAddress))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoCodeEmailPK[ productPromoCodeId=" + productPromoCodeId + ", emailAddress=" + emailAddress + " ]";
    }
    
}
