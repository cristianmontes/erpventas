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
public class ProductConfigConfigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONFIG_ID")
    private String configId;
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Basic(optional = false)
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Basic(optional = false)
    @Column(name = "CONFIG_OPTION_ID")
    private String configOptionId;

    public ProductConfigConfigPK() {
    }

    public ProductConfigConfigPK(String configId, String configItemId, BigInteger sequenceNum, String configOptionId) {
        this.configId = configId;
        this.configItemId = configItemId;
        this.sequenceNum = sequenceNum;
        this.configOptionId = configOptionId;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public String getConfigItemId() {
        return configItemId;
    }

    public void setConfigItemId(String configItemId) {
        this.configItemId = configItemId;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public String getConfigOptionId() {
        return configOptionId;
    }

    public void setConfigOptionId(String configOptionId) {
        this.configOptionId = configOptionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (configId != null ? configId.hashCode() : 0);
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        hash += (sequenceNum != null ? sequenceNum.hashCode() : 0);
        hash += (configOptionId != null ? configOptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigConfigPK)) {
            return false;
        }
        ProductConfigConfigPK other = (ProductConfigConfigPK) object;
        if ((this.configId == null && other.configId != null) || (this.configId != null && !this.configId.equals(other.configId))) {
            return false;
        }
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        if ((this.sequenceNum == null && other.sequenceNum != null) || (this.sequenceNum != null && !this.sequenceNum.equals(other.sequenceNum))) {
            return false;
        }
        if ((this.configOptionId == null && other.configOptionId != null) || (this.configOptionId != null && !this.configOptionId.equals(other.configOptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigConfigPK[ configId=" + configId + ", configItemId=" + configItemId + ", sequenceNum=" + sequenceNum + ", configOptionId=" + configOptionId + " ]";
    }
    
}
