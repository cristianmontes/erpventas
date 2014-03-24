/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductConfigOptionIactnPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Basic(optional = false)
    @Column(name = "CONFIG_OPTION_ID")
    private String configOptionId;
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID_TO")
    private String configItemIdTo;
    @Basic(optional = false)
    @Column(name = "CONFIG_OPTION_ID_TO")
    private String configOptionIdTo;
    @Basic(optional = false)
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;

    public ProductConfigOptionIactnPK() {
    }

    public ProductConfigOptionIactnPK(String configItemId, String configOptionId, String configItemIdTo, String configOptionIdTo, BigInteger sequenceNum) {
        this.configItemId = configItemId;
        this.configOptionId = configOptionId;
        this.configItemIdTo = configItemIdTo;
        this.configOptionIdTo = configOptionIdTo;
        this.sequenceNum = sequenceNum;
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }

    public String getConfigOptionId() {
        return configOptionId;
    }

    public void setConfigOptionId(String configOptionId) {
        this.configOptionId = configOptionId;
    }

    public String getConfigItemIdTo() {
        return configItemIdTo;
    }

    public void setConfigItemIdTo(String configItemIdTo) {
        this.configItemIdTo = configItemIdTo;
    }

    public String getConfigOptionIdTo() {
        return configOptionIdTo;
    }

    public void setConfigOptionIdTo(String configOptionIdTo) {
        this.configOptionIdTo = configOptionIdTo;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        hash += (configOptionId != null ? configOptionId.hashCode() : 0);
        hash += (configItemIdTo != null ? configItemIdTo.hashCode() : 0);
        hash += (configOptionIdTo != null ? configOptionIdTo.hashCode() : 0);
        hash += (sequenceNum != null ? sequenceNum.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigOptionIactnPK)) {
            return false;
        }
        ProductConfigOptionIactnPK other = (ProductConfigOptionIactnPK) object;
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        if ((this.configOptionId == null && other.configOptionId != null) || (this.configOptionId != null && !this.configOptionId.equals(other.configOptionId))) {
            return false;
        }
        if ((this.configItemIdTo == null && other.configItemIdTo != null) || (this.configItemIdTo != null && !this.configItemIdTo.equals(other.configItemIdTo))) {
            return false;
        }
        if ((this.configOptionIdTo == null && other.configOptionIdTo != null) || (this.configOptionIdTo != null && !this.configOptionIdTo.equals(other.configOptionIdTo))) {
            return false;
        }
        if ((this.sequenceNum == null && other.sequenceNum != null) || (this.sequenceNum != null && !this.sequenceNum.equals(other.sequenceNum))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigOptionIactnPK[ configItemId=" + configItemId + ", configOptionId=" + configOptionId + ", configItemIdTo=" + configItemIdTo + ", configOptionIdTo=" + configOptionIdTo + ", sequenceNum=" + sequenceNum + " ]";
    }
    
}
