/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.tax.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.invoice.model.InvoiceItem;
import com.wildc.ucumari.order.model.OrderAdjustment;
import com.wildc.ucumari.product.model.ProductCategory;
import com.wildc.ucumari.product.model.ProductStore;
import com.wildc.ucumari.returns.model.ReturnAdjustment;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "tax_authority_rate_product")
@NamedQueries({
    @NamedQuery(name = "TaxAuthorityRateProduct.findAll", query = "SELECT t FROM TaxAuthorityRateProduct t")})
public class TaxAuthorityRateProduct implements Serializable {
    @OneToMany(mappedBy = "taxAuthorityRateSeqId")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(mappedBy = "taxAuthorityRateSeqId")
    private List<OrderAdjustment> orderAdjustmentList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TAX_AUTHORITY_RATE_SEQ_ID")
    private String taxAuthorityRateSeqId;
    @Column(name = "TITLE_TRANSFER_ENUM_ID")
    private String titleTransferEnumId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MIN_ITEM_PRICE")
    private BigDecimal minItemPrice;
    @Column(name = "MIN_PURCHASE")
    private BigDecimal minPurchase;
    @Column(name = "TAX_SHIPPING")
    private Character taxShipping;
    @Column(name = "TAX_PERCENTAGE")
    private BigDecimal taxPercentage;
    @Column(name = "TAX_PROMOTIONS")
    private Character taxPromotions;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumns({
        @JoinColumn(name = "TAX_AUTH_GEO_ID", referencedColumnName = "TAX_AUTH_GEO_ID"),
        @JoinColumn(name = "TAX_AUTH_PARTY_ID", referencedColumnName = "TAX_AUTH_PARTY_ID")})
    @ManyToOne
    private TaxAuthority taxAuthority;
    @JoinColumn(name = "TAX_AUTHORITY_RATE_TYPE_ID", referencedColumnName = "TAX_AUTHORITY_RATE_TYPE_ID")
    @ManyToOne
    private TaxAuthorityRateType taxAuthorityRateTypeId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory productCategoryId;
    @OneToMany(mappedBy = "taxAuthorityRateSeqId")
    private List<InvoiceItem> invoiceItemList;

    public TaxAuthorityRateProduct() {
    }

    public TaxAuthorityRateProduct(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }

    public String getTaxAuthorityRateSeqId() {
        return taxAuthorityRateSeqId;
    }

    public void setTaxAuthorityRateSeqId(String taxAuthorityRateSeqId) {
        this.taxAuthorityRateSeqId = taxAuthorityRateSeqId;
    }

    public String getTitleTransferEnumId() {
        return titleTransferEnumId;
    }

    public void setTitleTransferEnumId(String titleTransferEnumId) {
        this.titleTransferEnumId = titleTransferEnumId;
    }

    public BigDecimal getMinItemPrice() {
        return minItemPrice;
    }

    public void setMinItemPrice(BigDecimal minItemPrice) {
        this.minItemPrice = minItemPrice;
    }

    public BigDecimal getMinPurchase() {
        return minPurchase;
    }

    public void setMinPurchase(BigDecimal minPurchase) {
        this.minPurchase = minPurchase;
    }

    public Character getTaxShipping() {
        return taxShipping;
    }

    public void setTaxShipping(Character taxShipping) {
        this.taxShipping = taxShipping;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Character getTaxPromotions() {
        return taxPromotions;
    }

    public void setTaxPromotions(Character taxPromotions) {
        this.taxPromotions = taxPromotions;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public TaxAuthority getTaxAuthority() {
        return taxAuthority;
    }

    public void setTaxAuthority(TaxAuthority taxAuthority) {
        this.taxAuthority = taxAuthority;
    }

    public TaxAuthorityRateType getTaxAuthorityRateTypeId() {
        return taxAuthorityRateTypeId;
    }

    public void setTaxAuthorityRateTypeId(TaxAuthorityRateType taxAuthorityRateTypeId) {
        this.taxAuthorityRateTypeId = taxAuthorityRateTypeId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public ProductCategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(ProductCategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public List<InvoiceItem> getInvoiceItemList() {
        return invoiceItemList;
    }

    public void setInvoiceItemList(List<InvoiceItem> invoiceItemList) {
        this.invoiceItemList = invoiceItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taxAuthorityRateSeqId != null ? taxAuthorityRateSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaxAuthorityRateProduct)) {
            return false;
        }
        TaxAuthorityRateProduct other = (TaxAuthorityRateProduct) object;
        if ((this.taxAuthorityRateSeqId == null && other.taxAuthorityRateSeqId != null) || (this.taxAuthorityRateSeqId != null && !this.taxAuthorityRateSeqId.equals(other.taxAuthorityRateSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TaxAuthorityRateProduct[ taxAuthorityRateSeqId=" + taxAuthorityRateSeqId + " ]";
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<OrderAdjustment> getOrderAdjustmentList() {
        return orderAdjustmentList;
    }

    public void setOrderAdjustmentList(List<OrderAdjustment> orderAdjustmentList) {
        this.orderAdjustmentList = orderAdjustmentList;
    }
    
}
