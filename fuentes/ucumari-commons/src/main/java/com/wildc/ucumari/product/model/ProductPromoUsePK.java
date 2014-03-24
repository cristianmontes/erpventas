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
public class ProductPromoUsePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Basic(optional = false)
    @Column(name = "PROMO_SEQUENCE_ID")
    private String promoSequenceId;

    public ProductPromoUsePK() {
    }

    public ProductPromoUsePK(String orderId, String promoSequenceId) {
        this.orderId = orderId;
        this.promoSequenceId = promoSequenceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPromoSequenceId() {
        return promoSequenceId;
    }

    public void setPromoSequenceId(String promoSequenceId) {
        this.promoSequenceId = promoSequenceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        hash += (promoSequenceId != null ? promoSequenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductPromoUsePK)) {
            return false;
        }
        ProductPromoUsePK other = (ProductPromoUsePK) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        if ((this.promoSequenceId == null && other.promoSequenceId != null) || (this.promoSequenceId != null && !this.promoSequenceId.equals(other.promoSequenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductPromoUsePK[ orderId=" + orderId + ", promoSequenceId=" + promoSequenceId + " ]";
    }
    
}
