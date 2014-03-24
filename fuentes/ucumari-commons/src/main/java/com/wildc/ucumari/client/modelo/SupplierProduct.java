/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.agreement.model.AgreementItem;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "supplier_product")
@NamedQueries({
    @NamedQuery(name = "SupplierProduct.findAll", query = "SELECT s FROM SupplierProduct s")})
public class SupplierProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SupplierProductPK supplierProductPK;
    @Column(name = "AVAILABLE_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date availableThruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STANDARD_LEAD_TIME_DAYS")
    private BigDecimal standardLeadTimeDays;
    @Column(name = "ORDER_QTY_INCREMENTS")
    private BigDecimal orderQtyIncrements;
    @Column(name = "UNITS_INCLUDED")
    private BigDecimal unitsIncluded;
    @Column(name = "LAST_PRICE")
    private BigDecimal lastPrice;
    @Column(name = "SUPPLIER_PRODUCT_NAME")
    private String supplierProductName;
    @Column(name = "SUPPLIER_PRODUCT_ID")
    private String supplierProductId;
    @Column(name = "CAN_DROP_SHIP")
    private Character canDropShip;
    @Column(name = "SUPPLIER_COMMISSION_PERC")
    private BigDecimal supplierCommissionPerc;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "SUPPLIER_RATING_TYPE_ID", referencedColumnName = "SUPPLIER_RATING_TYPE_ID")
    @ManyToOne
    private SupplierRatingType supplierRatingTypeId;
    @JoinColumn(name = "SUPPLIER_PREF_ORDER_ID", referencedColumnName = "SUPPLIER_PREF_ORDER_ID")
    @ManyToOne
    private SupplierPrefOrder supplierPrefOrderId;
    @JoinColumn(name = "QUANTITY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom quantityUomId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Uom uom;
    @JoinColumns({
        @JoinColumn(name = "AGREEMENT_ID", referencedColumnName = "AGREEMENT_ID"),
        @JoinColumn(name = "AGREEMENT_ITEM_SEQ_ID", referencedColumnName = "AGREEMENT_ITEM_SEQ_ID")})
    @ManyToOne
    private AgreementItem agreementItem;

    public SupplierProduct() {
    }

    public SupplierProduct(SupplierProductPK supplierProductPK) {
        this.supplierProductPK = supplierProductPK;
    }

    public SupplierProduct(String productId, String partyId, Date availableFromDate, BigDecimal minimumOrderQuantity, String currencyUomId) {
        this.supplierProductPK = new SupplierProductPK(productId, partyId, availableFromDate, minimumOrderQuantity, currencyUomId);
    }

    public SupplierProductPK getSupplierProductPK() {
        return supplierProductPK;
    }

    public void setSupplierProductPK(SupplierProductPK supplierProductPK) {
        this.supplierProductPK = supplierProductPK;
    }

    public Date getAvailableThruDate() {
        return availableThruDate;
    }

    public void setAvailableThruDate(Date availableThruDate) {
        this.availableThruDate = availableThruDate;
    }

    public BigDecimal getStandardLeadTimeDays() {
        return standardLeadTimeDays;
    }

    public void setStandardLeadTimeDays(BigDecimal standardLeadTimeDays) {
        this.standardLeadTimeDays = standardLeadTimeDays;
    }

    public BigDecimal getOrderQtyIncrements() {
        return orderQtyIncrements;
    }

    public void setOrderQtyIncrements(BigDecimal orderQtyIncrements) {
        this.orderQtyIncrements = orderQtyIncrements;
    }

    public BigDecimal getUnitsIncluded() {
        return unitsIncluded;
    }

    public void setUnitsIncluded(BigDecimal unitsIncluded) {
        this.unitsIncluded = unitsIncluded;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getSupplierProductName() {
        return supplierProductName;
    }

    public void setSupplierProductName(String supplierProductName) {
        this.supplierProductName = supplierProductName;
    }

    public String getSupplierProductId() {
        return supplierProductId;
    }

    public void setSupplierProductId(String supplierProductId) {
        this.supplierProductId = supplierProductId;
    }

    public Character getCanDropShip() {
        return canDropShip;
    }

    public void setCanDropShip(Character canDropShip) {
        this.canDropShip = canDropShip;
    }

    public BigDecimal getSupplierCommissionPerc() {
        return supplierCommissionPerc;
    }

    public void setSupplierCommissionPerc(BigDecimal supplierCommissionPerc) {
        this.supplierCommissionPerc = supplierCommissionPerc;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public SupplierRatingType getSupplierRatingTypeId() {
        return supplierRatingTypeId;
    }

    public void setSupplierRatingTypeId(SupplierRatingType supplierRatingTypeId) {
        this.supplierRatingTypeId = supplierRatingTypeId;
    }

    public SupplierPrefOrder getSupplierPrefOrderId() {
        return supplierPrefOrderId;
    }

    public void setSupplierPrefOrderId(SupplierPrefOrder supplierPrefOrderId) {
        this.supplierPrefOrderId = supplierPrefOrderId;
    }

    public Uom getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(Uom quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Uom getUom() {
        return uom;
    }

    public void setUom(Uom uom) {
        this.uom = uom;
    }

    public AgreementItem getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(AgreementItem agreementItem) {
        this.agreementItem = agreementItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (supplierProductPK != null ? supplierProductPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SupplierProduct)) {
            return false;
        }
        SupplierProduct other = (SupplierProduct) object;
        if ((this.supplierProductPK == null && other.supplierProductPK != null) || (this.supplierProductPK != null && !this.supplierProductPK.equals(other.supplierProductPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SupplierProduct[ supplierProductPK=" + supplierProductPK + " ]";
    }
    
}
