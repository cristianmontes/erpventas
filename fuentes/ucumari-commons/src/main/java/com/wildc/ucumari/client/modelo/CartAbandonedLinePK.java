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
public class CartAbandonedLinePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Basic(optional = false)
    @Column(name = "CART_ABANDONED_LINE_SEQ_ID")
    private String cartAbandonedLineSeqId;

    public CartAbandonedLinePK() {
    }

    public CartAbandonedLinePK(String visitId, String cartAbandonedLineSeqId) {
        this.visitId = visitId;
        this.cartAbandonedLineSeqId = cartAbandonedLineSeqId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getCartAbandonedLineSeqId() {
        return cartAbandonedLineSeqId;
    }

    public void setCartAbandonedLineSeqId(String cartAbandonedLineSeqId) {
        this.cartAbandonedLineSeqId = cartAbandonedLineSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitId != null ? visitId.hashCode() : 0);
        hash += (cartAbandonedLineSeqId != null ? cartAbandonedLineSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartAbandonedLinePK)) {
            return false;
        }
        CartAbandonedLinePK other = (CartAbandonedLinePK) object;
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        if ((this.cartAbandonedLineSeqId == null && other.cartAbandonedLineSeqId != null) || (this.cartAbandonedLineSeqId != null && !this.cartAbandonedLineSeqId.equals(other.cartAbandonedLineSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CartAbandonedLinePK[ visitId=" + visitId + ", cartAbandonedLineSeqId=" + cartAbandonedLineSeqId + " ]";
    }
    
}
