/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class ProductConfigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "CONFIG_ITEM_ID")
    private String configItemId;
    @Basic(optional = false)
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public ProductConfigPK() {
    }

    public ProductConfigPK(String productId, String configItemId, BigInteger sequenceNum, Date fromDate) {
        this.productId = productId;
        this.configItemId = configItemId;
        this.sequenceNum = sequenceNum;
        this.fromDate = fromDate;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
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

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (configItemId != null ? configItemId.hashCode() : 0);
        hash += (sequenceNum != null ? sequenceNum.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductConfigPK)) {
            return false;
        }
        ProductConfigPK other = (ProductConfigPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.configItemId == null && other.configItemId != null) || (this.configItemId != null && !this.configItemId.equals(other.configItemId))) {
            return false;
        }
        if ((this.sequenceNum == null && other.sequenceNum != null) || (this.sequenceNum != null && !this.sequenceNum.equals(other.sequenceNum))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProductConfigPK[ productId=" + productId + ", configItemId=" + configItemId + ", sequenceNum=" + sequenceNum + ", fromDate=" + fromDate + " ]";
    }
    
}
