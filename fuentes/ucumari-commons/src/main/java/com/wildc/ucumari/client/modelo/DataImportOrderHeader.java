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
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "data_import_order_header")
@NamedQueries({
    @NamedQuery(name = "DataImportOrderHeader.findAll", query = "SELECT d FROM DataImportOrderHeader d")})
public class DataImportOrderHeader implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;
    @Column(name = "ORDER_TYPE_ID")
    private String orderTypeId;
    @Column(name = "CUSTOMER_PARTY_ID")
    private String customerPartyId;
    @Column(name = "SUPPLIER_PARTY_ID")
    private String supplierPartyId;
    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "CURRENCY_UOM_ID")
    private String currencyUomId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SHIPPING_TOTAL")
    private BigDecimal shippingTotal;
    @Column(name = "ORDER_TAX")
    private BigDecimal orderTax;
    @Column(name = "TAX_AUTH_PARTY_ID")
    private String taxAuthPartyId;
    @Column(name = "ADJUSTMENTS_TOTAL")
    private BigDecimal adjustmentsTotal;
    @Column(name = "GRAND_TOTAL")
    private BigDecimal grandTotal;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "PRODUCT_STORE_ID")
    private String productStoreId;
    @Column(name = "SALES_CHANNEL_ENUM_ID")
    private String salesChannelEnumId;
    @Column(name = "PRODUCT_STORE_SHIP_METH_ID")
    private String productStoreShipMethId;
    @Column(name = "ORDER_CLOSED")
    private Character orderClosed;
    @Column(name = "SHIPPING_FIRST_NAME")
    private String shippingFirstName;
    @Column(name = "SHIPPING_LAST_NAME")
    private String shippingLastName;
    @Column(name = "SHIPPING_COMPANY_NAME")
    private String shippingCompanyName;
    @Column(name = "SHIPPING_STREET")
    private String shippingStreet;
    @Column(name = "SHIPPING_CITY")
    private String shippingCity;
    @Column(name = "SHIPPING_REGION")
    private String shippingRegion;
    @Column(name = "SHIPPING_POSTCODE")
    private String shippingPostcode;
    @Column(name = "SHIPPING_COUNTRY")
    private String shippingCountry;
    @Column(name = "SHIPPING_PHONE")
    private String shippingPhone;
    @Column(name = "SHIPPING_FAX")
    private String shippingFax;
    @Column(name = "BILLING_FIRST_NAME")
    private String billingFirstName;
    @Column(name = "BILLING_LAST_NAME")
    private String billingLastName;
    @Column(name = "BILLING_COMPANY_NAME")
    private String billingCompanyName;
    @Column(name = "BILLING_STREET")
    private String billingStreet;
    @Column(name = "BILLING_CITY")
    private String billingCity;
    @Column(name = "BILLING_REGION")
    private String billingRegion;
    @Column(name = "BILLING_POSTCODE")
    private String billingPostcode;
    @Column(name = "BILLING_COUNTRY")
    private String billingCountry;
    @Column(name = "BILLING_PHONE")
    private String billingPhone;
    @Column(name = "BILLING_FAX")
    private String billingFax;
    @Column(name = "IMPORT_STATUS_ID")
    private String importStatusId;
    @Lob
    @Column(name = "IMPORT_ERROR")
    private String importError;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
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

    public DataImportOrderHeader() {
    }

    public DataImportOrderHeader(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderTypeId() {
        return orderTypeId;
    }

    public void setOrderTypeId(String orderTypeId) {
        this.orderTypeId = orderTypeId;
    }

    public String getCustomerPartyId() {
        return customerPartyId;
    }

    public void setCustomerPartyId(String customerPartyId) {
        this.customerPartyId = customerPartyId;
    }

    public String getSupplierPartyId() {
        return supplierPartyId;
    }

    public void setSupplierPartyId(String supplierPartyId) {
        this.supplierPartyId = supplierPartyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(String currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public BigDecimal getShippingTotal() {
        return shippingTotal;
    }

    public void setShippingTotal(BigDecimal shippingTotal) {
        this.shippingTotal = shippingTotal;
    }

    public BigDecimal getOrderTax() {
        return orderTax;
    }

    public void setOrderTax(BigDecimal orderTax) {
        this.orderTax = orderTax;
    }

    public String getTaxAuthPartyId() {
        return taxAuthPartyId;
    }

    public void setTaxAuthPartyId(String taxAuthPartyId) {
        this.taxAuthPartyId = taxAuthPartyId;
    }

    public BigDecimal getAdjustmentsTotal() {
        return adjustmentsTotal;
    }

    public void setAdjustmentsTotal(BigDecimal adjustmentsTotal) {
        this.adjustmentsTotal = adjustmentsTotal;
    }

    public BigDecimal getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(BigDecimal grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }

    public String getSalesChannelEnumId() {
        return salesChannelEnumId;
    }

    public void setSalesChannelEnumId(String salesChannelEnumId) {
        this.salesChannelEnumId = salesChannelEnumId;
    }

    public String getProductStoreShipMethId() {
        return productStoreShipMethId;
    }

    public void setProductStoreShipMethId(String productStoreShipMethId) {
        this.productStoreShipMethId = productStoreShipMethId;
    }

    public Character getOrderClosed() {
        return orderClosed;
    }

    public void setOrderClosed(Character orderClosed) {
        this.orderClosed = orderClosed;
    }

    public String getShippingFirstName() {
        return shippingFirstName;
    }

    public void setShippingFirstName(String shippingFirstName) {
        this.shippingFirstName = shippingFirstName;
    }

    public String getShippingLastName() {
        return shippingLastName;
    }

    public void setShippingLastName(String shippingLastName) {
        this.shippingLastName = shippingLastName;
    }

    public String getShippingCompanyName() {
        return shippingCompanyName;
    }

    public void setShippingCompanyName(String shippingCompanyName) {
        this.shippingCompanyName = shippingCompanyName;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingRegion() {
        return shippingRegion;
    }

    public void setShippingRegion(String shippingRegion) {
        this.shippingRegion = shippingRegion;
    }

    public String getShippingPostcode() {
        return shippingPostcode;
    }

    public void setShippingPostcode(String shippingPostcode) {
        this.shippingPostcode = shippingPostcode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getShippingPhone() {
        return shippingPhone;
    }

    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone;
    }

    public String getShippingFax() {
        return shippingFax;
    }

    public void setShippingFax(String shippingFax) {
        this.shippingFax = shippingFax;
    }

    public String getBillingFirstName() {
        return billingFirstName;
    }

    public void setBillingFirstName(String billingFirstName) {
        this.billingFirstName = billingFirstName;
    }

    public String getBillingLastName() {
        return billingLastName;
    }

    public void setBillingLastName(String billingLastName) {
        this.billingLastName = billingLastName;
    }

    public String getBillingCompanyName() {
        return billingCompanyName;
    }

    public void setBillingCompanyName(String billingCompanyName) {
        this.billingCompanyName = billingCompanyName;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingRegion() {
        return billingRegion;
    }

    public void setBillingRegion(String billingRegion) {
        this.billingRegion = billingRegion;
    }

    public String getBillingPostcode() {
        return billingPostcode;
    }

    public void setBillingPostcode(String billingPostcode) {
        this.billingPostcode = billingPostcode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingPhone() {
        return billingPhone;
    }

    public void setBillingPhone(String billingPhone) {
        this.billingPhone = billingPhone;
    }

    public String getBillingFax() {
        return billingFax;
    }

    public void setBillingFax(String billingFax) {
        this.billingFax = billingFax;
    }

    public String getImportStatusId() {
        return importStatusId;
    }

    public void setImportStatusId(String importStatusId) {
        this.importStatusId = importStatusId;
    }

    public String getImportError() {
        return importError;
    }

    public void setImportError(String importError) {
        this.importError = importError;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportOrderHeader)) {
            return false;
        }
        DataImportOrderHeader other = (DataImportOrderHeader) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportOrderHeader[ orderId=" + orderId + " ]";
    }
    
}
