/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.inventory.model.InventoryItemDetail;
import com.wildc.ucumari.inventory.model.InventoryTransfer;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.security.model.UserLogin;
import com.wildc.ucumari.shipment.model.ShipmentItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "item_issuance")
@NamedQueries({
    @NamedQuery(name = "ItemIssuance.findAll", query = "SELECT i FROM ItemIssuance i")})
public class ItemIssuance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ITEM_ISSUANCE_ID")
    private String itemIssuanceId;
    @Column(name = "SHIP_GROUP_SEQ_ID")
    private String shipGroupSeqId;
    @Column(name = "ISSUED_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issuedDateTime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Column(name = "CANCEL_QUANTITY")
    private BigDecimal cancelQuantity;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "itemIssuance")
    private List<ItemIssuanceRole> itemIssuanceRoleList;
    @OneToMany(mappedBy = "itemIssuanceId")
    private List<InventoryItemDetail> inventoryItemDetailList;
    @OneToMany(mappedBy = "itemIssuanceId")
    private List<InventoryTransfer> inventoryTransferList;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_ID", referencedColumnName = "SHIPMENT_ID"),
        @JoinColumn(name = "SHIPMENT_ITEM_SEQ_ID", referencedColumnName = "SHIPMENT_ITEM_SEQ_ID")})
    @ManyToOne
    private ShipmentItem shipmentItem;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    @JoinColumn(name = "ISSUED_BY_USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin issuedByUserLoginId;
    @JoinColumns({
        @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID"),
        @JoinColumn(name = "MAINT_HIST_SEQ_ID", referencedColumnName = "MAINT_HIST_SEQ_ID")})
    @ManyToOne
    private FixedAssetMaint fixedAssetMaint;

    public ItemIssuance() {
    }

    public ItemIssuance(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getItemIssuanceId() {
        return itemIssuanceId;
    }

    public void setItemIssuanceId(String itemIssuanceId) {
        this.itemIssuanceId = itemIssuanceId;
    }

    public String getShipGroupSeqId() {
        return shipGroupSeqId;
    }

    public void setShipGroupSeqId(String shipGroupSeqId) {
        this.shipGroupSeqId = shipGroupSeqId;
    }

    public Date getIssuedDateTime() {
        return issuedDateTime;
    }

    public void setIssuedDateTime(Date issuedDateTime) {
        this.issuedDateTime = issuedDateTime;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCancelQuantity() {
        return cancelQuantity;
    }

    public void setCancelQuantity(BigDecimal cancelQuantity) {
        this.cancelQuantity = cancelQuantity;
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

    public List<ItemIssuanceRole> getItemIssuanceRoleList() {
        return itemIssuanceRoleList;
    }

    public void setItemIssuanceRoleList(List<ItemIssuanceRole> itemIssuanceRoleList) {
        this.itemIssuanceRoleList = itemIssuanceRoleList;
    }

    public List<InventoryItemDetail> getInventoryItemDetailList() {
        return inventoryItemDetailList;
    }

    public void setInventoryItemDetailList(List<InventoryItemDetail> inventoryItemDetailList) {
        this.inventoryItemDetailList = inventoryItemDetailList;
    }

    public List<InventoryTransfer> getInventoryTransferList() {
        return inventoryTransferList;
    }

    public void setInventoryTransferList(List<InventoryTransfer> inventoryTransferList) {
        this.inventoryTransferList = inventoryTransferList;
    }

    public ShipmentItem getShipmentItem() {
        return shipmentItem;
    }

    public void setShipmentItem(ShipmentItem shipmentItem) {
        this.shipmentItem = shipmentItem;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public UserLogin getIssuedByUserLoginId() {
        return issuedByUserLoginId;
    }

    public void setIssuedByUserLoginId(UserLogin issuedByUserLoginId) {
        this.issuedByUserLoginId = issuedByUserLoginId;
    }

    public FixedAssetMaint getFixedAssetMaint() {
        return fixedAssetMaint;
    }

    public void setFixedAssetMaint(FixedAssetMaint fixedAssetMaint) {
        this.fixedAssetMaint = fixedAssetMaint;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemIssuanceId != null ? itemIssuanceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemIssuance)) {
            return false;
        }
        ItemIssuance other = (ItemIssuance) object;
        if ((this.itemIssuanceId == null && other.itemIssuanceId != null) || (this.itemIssuanceId != null && !this.itemIssuanceId.equals(other.itemIssuanceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ItemIssuance[ itemIssuanceId=" + itemIssuanceId + " ]";
    }
    
}
