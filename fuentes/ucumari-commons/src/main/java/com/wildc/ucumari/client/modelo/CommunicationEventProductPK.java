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
public class CommunicationEventProductPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;

    public CommunicationEventProductPK() {
    }

    public CommunicationEventProductPK(String productId, String communicationEventId) {
        this.productId = productId;
        this.communicationEventId = communicationEventId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (communicationEventId != null ? communicationEventId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunicationEventProductPK)) {
            return false;
        }
        CommunicationEventProductPK other = (CommunicationEventProductPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.communicationEventId == null && other.communicationEventId != null) || (this.communicationEventId != null && !this.communicationEventId.equals(other.communicationEventId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommunicationEventProductPK[ productId=" + productId + ", communicationEventId=" + communicationEventId + " ]";
    }
    
}
