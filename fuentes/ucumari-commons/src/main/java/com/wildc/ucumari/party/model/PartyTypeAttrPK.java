/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class PartyTypeAttrPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PARTY_TYPE_ID")
    private String partyTypeId;
    @Basic(optional = false)
    @Column(name = "ATTR_NAME")
    private String attrName;

    public PartyTypeAttrPK() {
    }

    public PartyTypeAttrPK(String partyTypeId, String attrName) {
        this.partyTypeId = partyTypeId;
        this.attrName = attrName;
    }

    public String getPartyTypeId() {
        return partyTypeId;
    }

    public void setPartyTypeId(String partyTypeId) {
        this.partyTypeId = partyTypeId;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyTypeId != null ? partyTypeId.hashCode() : 0);
        hash += (attrName != null ? attrName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartyTypeAttrPK)) {
            return false;
        }
        PartyTypeAttrPK other = (PartyTypeAttrPK) object;
        if ((this.partyTypeId == null && other.partyTypeId != null) || (this.partyTypeId != null && !this.partyTypeId.equals(other.partyTypeId))) {
            return false;
        }
        if ((this.attrName == null && other.attrName != null) || (this.attrName != null && !this.attrName.equals(other.attrName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PartyTypeAttrPK[ partyTypeId=" + partyTypeId + ", attrName=" + attrName + " ]";
    }
    
}
