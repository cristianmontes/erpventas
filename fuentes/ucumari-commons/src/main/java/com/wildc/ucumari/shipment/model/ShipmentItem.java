/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment_item")
public class ShipmentItem implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentItem")
    private List<ShipmentPackageContent> shipmentPackageContentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentItem")
    private List<ReturnItemShipment> returnItemShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentItem")
    private List<ShipmentItemFeature> shipmentItemFeatureList;
    @OneToMany(mappedBy = "shipmentItem")
    private List<ShippingDocument> shippingDocumentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipmentItem")
    private List<ShipmentItemBilling> shipmentItemBillingList;*/
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShipmentItemPK shipmentItemPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "SHIPMENT_CONTENT_DESCRIPTION")
    private String shipmentContentDescription;
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
    /*@OneToMany(mappedBy = "shipmentItem")
    private List<ItemIssuance> itemIssuanceList;*/
    @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Shipment shipment;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;

    public ShipmentItem() {
    }

    public ShipmentItem(ShipmentItemPK shipmentItemPK) {
        this.shipmentItemPK = shipmentItemPK;
    }

    public ShipmentItem(String shipmentId, String shipmentItemSeqId) {
        this.shipmentItemPK = new ShipmentItemPK(shipmentId, shipmentItemSeqId);
    }

    public ShipmentItemPK getShipmentItemPK() {
        return shipmentItemPK;
    }

    public void setShipmentItemPK(ShipmentItemPK shipmentItemPK) {
        this.shipmentItemPK = shipmentItemPK;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getShipmentContentDescription() {
        return shipmentContentDescription;
    }

    public void setShipmentContentDescription(String shipmentContentDescription) {
        this.shipmentContentDescription = shipmentContentDescription;
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
/*
    public List<ItemIssuance> getItemIssuanceList() {
        return itemIssuanceList;
    }

    public void setItemIssuanceList(List<ItemIssuance> itemIssuanceList) {
        this.itemIssuanceList = itemIssuanceList;
    }*/

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
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
        hash += (shipmentItemPK != null ? shipmentItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShipmentItem)) {
            return false;
        }
        ShipmentItem other = (ShipmentItem) object;
        if ((this.shipmentItemPK == null && other.shipmentItemPK != null) || (this.shipmentItemPK != null && !this.shipmentItemPK.equals(other.shipmentItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShipmentItem[ shipmentItemPK=" + shipmentItemPK + " ]";
    }
/*
    public List<ShipmentPackageContent> getShipmentPackageContentList() {
        return shipmentPackageContentList;
    }

    public void setShipmentPackageContentList(List<ShipmentPackageContent> shipmentPackageContentList) {
        this.shipmentPackageContentList = shipmentPackageContentList;
    }

    public List<ReturnItemShipment> getReturnItemShipmentList() {
        return returnItemShipmentList;
    }

    public void setReturnItemShipmentList(List<ReturnItemShipment> returnItemShipmentList) {
        this.returnItemShipmentList = returnItemShipmentList;
    }

    public List<ShipmentItemFeature> getShipmentItemFeatureList() {
        return shipmentItemFeatureList;
    }

    public void setShipmentItemFeatureList(List<ShipmentItemFeature> shipmentItemFeatureList) {
        this.shipmentItemFeatureList = shipmentItemFeatureList;
    }

    public List<ShippingDocument> getShippingDocumentList() {
        return shippingDocumentList;
    }

    public void setShippingDocumentList(List<ShippingDocument> shippingDocumentList) {
        this.shippingDocumentList = shippingDocumentList;
    }

    public List<ShipmentItemBilling> getShipmentItemBillingList() {
        return shipmentItemBillingList;
    }

    public void setShipmentItemBillingList(List<ShipmentItemBilling> shipmentItemBillingList) {
        this.shipmentItemBillingList = shipmentItemBillingList;
    }
    */
}
