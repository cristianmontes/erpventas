/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class SupplierProductPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Basic(optional = false)
    @Column(name = "AVAILABLE_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date availableFromDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MINIMUM_ORDER_QUANTITY")
    private BigDecimal minimumOrderQuantity;
    @Basic(optional = false)
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;

    public SupplierProductPK() {
    }

    public SupplierProductPK(String productId, String partyId, Date availableFromDate, BigDecimal minimumOrderQuantity, String currencyUomId) {
        this.productId = productId;
        this.partyId = partyId;
        this.availableFromDate = availableFromDate;
        this.minimumOrderQuantity = minimumOrderQuantity;
        this.currencyUomId = currencyUomId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public Date getAvailableFromDate() {
        return availableFromDate;
    }

    public void setAvailableFromDate(Date availableFromDate) {
        this.availableFromDate = availableFromDate;
    }

    public BigDecimal getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    public void setMinimumOrderQuantity(BigDecimal minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productId != null ? productId.hashCode() : 0);
        hash += (partyId != null ? partyId.hashCode() : 0);
        hash += (availableFromDate != null ? availableFromDate.hashCode() : 0);
        hash += (minimumOrderQuantity != null ? minimumOrderQuantity.hashCode() : 0);
        hash += (currencyUomId != null ? currencyUomId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierProductPK)) {
            return false;
        }
        SupplierProductPK other = (SupplierProductPK) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        if ((this.availableFromDate == null && other.availableFromDate != null) || (this.availableFromDate != null && !this.availableFromDate.equals(other.availableFromDate))) {
            return false;
        }
        if ((this.minimumOrderQuantity == null && other.minimumOrderQuantity != null) || (this.minimumOrderQuantity != null && !this.minimumOrderQuantity.equals(other.minimumOrderQuantity))) {
            return false;
        }
        if ((this.currencyUomId == null && other.currencyUomId != null) || (this.currencyUomId != null && !this.currencyUomId.equals(other.currencyUomId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SupplierProductPK[ productId=" + productId + ", partyId=" + partyId + ", availableFromDate=" + availableFromDate + ", minimumOrderQuantity=" + minimumOrderQuantity + ", currencyUomId=" + currencyUomId + " ]";
    }
    
}
