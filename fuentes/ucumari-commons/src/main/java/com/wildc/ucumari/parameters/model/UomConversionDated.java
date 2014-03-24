/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.parameters.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "uom_conversion_dated")

public class UomConversionDated implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UomConversionDatedPK uomConversionDatedPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CONVERSION_FACTOR")
    private BigDecimal conversionFactor;
    @Column(name = "DECIMAL_SCALE")
    private BigInteger decimalScale;
    @Column(name = "ROUNDING_MODE")
    private String roundingMode;
    @Column(name = "LAST_UPDATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedStamp;
    @Column(name = "LAST_UPDATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTxStamp;
    @Column(name = "CREATED_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdStamp;
    @Column(name = "CREATED_TX_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTxStamp;
    @JoinColumn(name = "PURPOSE_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration purposeEnumId;
    @JoinColumn(name = "CUSTOM_METHOD_ID", referencedColumnName = "CUSTOM_METHOD_ID")
    @ManyToOne
    private CustomMethod customMethodId;
    @JoinColumn(name = "UOM_ID_TO", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom;
    @JoinColumn(name = "UOM_ID", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom1;

    public UomConversionDated() {
    }

    public UomConversionDated(UomConversionDatedPK uomConversionDatedPK) {
        this.uomConversionDatedPK = uomConversionDatedPK;
    }

    public UomConversionDated(String uomId, String uomIdTo, Date fromDate) {
        this.uomConversionDatedPK = new UomConversionDatedPK(uomId, uomIdTo, fromDate);
    }

    public UomConversionDatedPK getUomConversionDatedPK() {
        return uomConversionDatedPK;
    }

    public void setUomConversionDatedPK(UomConversionDatedPK uomConversionDatedPK) {
        this.uomConversionDatedPK = uomConversionDatedPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigInteger getDecimalScale() {
        return decimalScale;
    }

    public void setDecimalScale(BigInteger decimalScale) {
        this.decimalScale = decimalScale;
    }

    public String getRoundingMode() {
        return roundingMode;
    }

    public void setRoundingMode(String roundingMode) {
        this.roundingMode = roundingMode;
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public Enumeration getPurposeEnumId() {
        return purposeEnumId;
    }

    public void setPurposeEnumId(Enumeration purposeEnumId) {
        this.purposeEnumId = purposeEnumId;
    }

    public CustomMethod getCustomMethodId() {
        return customMethodId;
    }

    public void setCustomMethodId(CustomMethod customMethodId) {
        this.customMethodId = customMethodId;
    }

    public Uom getUom() {
        return uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    public Uom getUom1() {
        return uom1;
    }

    public void setUom1(Uom uom1) {
        this.uom1 = uom1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uomConversionDatedPK != null ? uomConversionDatedPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UomConversionDated)) {
            return false;
        }
        UomConversionDated other = (UomConversionDated) object;
        if ((this.uomConversionDatedPK == null && other.uomConversionDatedPK != null) || (this.uomConversionDatedPK != null && !this.uomConversionDatedPK.equals(other.uomConversionDatedPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UomConversionDated[ uomConversionDatedPK=" + uomConversionDatedPK + " ]";
    }
    
}
