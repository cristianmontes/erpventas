/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.ProdCatalog;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "cart_abandoned_line")
@NamedQueries({
    @NamedQuery(name = "CartAbandonedLine.findAll", query = "SELECT c FROM CartAbandonedLine c")})
public class CartAbandonedLine implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CartAbandonedLinePK cartAbandonedLinePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "RESERV_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reservStart;
    @Column(name = "RESERV_LENGTH")
    private BigDecimal reservLength;
    @Column(name = "RESERV_PERSONS")
    private BigDecimal reservPersons;
    @Column(name = "UNIT_PRICE")
    private BigDecimal unitPrice;
    @Column(name = "RESERV2ND_P_P_PERC")
    private BigDecimal reserv2ndPPPerc;
    @Column(name = "RESERV_NTH_P_P_PERC")
    private BigDecimal reservNthPPPerc;
    @Column(name = "CONFIG_ID")
    private String configId;
    @Column(name = "TOTAL_WITH_ADJUSTMENTS")
    private BigDecimal totalWithAdjustments;
    @Column(name = "WAS_RESERVED")
    private Character wasReserved;
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
    @JoinColumn(name = "VISIT_ID", referencedColumnName = "VISIT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Visit visit;
    @JoinColumn(name = "PROD_CATALOG_ID", referencedColumnName = "PROD_CATALOG_ID")
    @ManyToOne
    private ProdCatalog prodCatalogId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;

    public CartAbandonedLine() {
    }

    public CartAbandonedLine(CartAbandonedLinePK cartAbandonedLinePK) {
        this.cartAbandonedLinePK = cartAbandonedLinePK;
    }

    public CartAbandonedLine(String visitId, String cartAbandonedLineSeqId) {
        this.cartAbandonedLinePK = new CartAbandonedLinePK(visitId, cartAbandonedLineSeqId);
    }

    public CartAbandonedLinePK getCartAbandonedLinePK() {
        return cartAbandonedLinePK;
    }

    public void setCartAbandonedLinePK(CartAbandonedLinePK cartAbandonedLinePK) {
        this.cartAbandonedLinePK = cartAbandonedLinePK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public Date getReservStart() {
        return reservStart;
    }

    public void setReservStart(Date reservStart) {
        this.reservStart = reservStart;
    }

    public BigDecimal getReservLength() {
        return reservLength;
    }

    public void setReservLength(BigDecimal reservLength) {
        this.reservLength = reservLength;
    }

    public BigDecimal getReservPersons() {
        return reservPersons;
    }

    public void setReservPersons(BigDecimal reservPersons) {
        this.reservPersons = reservPersons;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public BigDecimal getTotalWithAdjustments() {
        return totalWithAdjustments;
    }

    public void setTotalWithAdjustments(BigDecimal totalWithAdjustments) {
        this.totalWithAdjustments = totalWithAdjustments;
    }

    public Character getWasReserved() {
        return wasReserved;
    }

    public void setWasReserved(Character wasReserved) {
        this.wasReserved = wasReserved;
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

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public ProdCatalog getProdCatalogId() {
        return prodCatalogId;
    }

    public void setProdCatalogId(ProdCatalog prodCatalogId) {
        this.prodCatalogId = prodCatalogId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartAbandonedLinePK != null ? cartAbandonedLinePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartAbandonedLine)) {
            return false;
        }
        CartAbandonedLine other = (CartAbandonedLine) object;
        if ((this.cartAbandonedLinePK == null && other.cartAbandonedLinePK != null) || (this.cartAbandonedLinePK != null && !this.cartAbandonedLinePK.equals(other.cartAbandonedLinePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CartAbandonedLine[ cartAbandonedLinePK=" + cartAbandonedLinePK + " ]";
    }
    
}
