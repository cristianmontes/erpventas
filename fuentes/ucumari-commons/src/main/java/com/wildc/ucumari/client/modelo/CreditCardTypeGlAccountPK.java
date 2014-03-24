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
public class CreditCardTypeGlAccountPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CARD_TYPE")
    private String cardType;
    @Basic(optional = false)
    @Column(name = "ORGANIZATION_PARTY_ID")
    private String organizationPartyId;

    public CreditCardTypeGlAccountPK() {
    }

    public CreditCardTypeGlAccountPK(String cardType, String organizationPartyId) {
        this.cardType = cardType;
        this.organizationPartyId = organizationPartyId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getOrganizationPartyId() {
        return organizationPartyId;
    }

    public void setOrganizationPartyId(String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardType != null ? cardType.hashCode() : 0);
        hash += (organizationPartyId != null ? organizationPartyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditCardTypeGlAccountPK)) {
            return false;
        }
        CreditCardTypeGlAccountPK other = (CreditCardTypeGlAccountPK) object;
        if ((this.cardType == null && other.cardType != null) || (this.cardType != null && !this.cardType.equals(other.cardType))) {
            return false;
        }
        if ((this.organizationPartyId == null && other.organizationPartyId != null) || (this.organizationPartyId != null && !this.organizationPartyId.equals(other.organizationPartyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CreditCardTypeGlAccountPK[ cardType=" + cardType + ", organizationPartyId=" + organizationPartyId + " ]";
    }
    
}
