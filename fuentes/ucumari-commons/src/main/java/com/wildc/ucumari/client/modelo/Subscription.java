/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.inventory.model.InventoryItem;
import com.wildc.ucumari.order.model.OrderItem;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;
import com.wildc.ucumari.product.model.ProductCategory;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "subscription")
@NamedQueries({
    @NamedQuery(name = "Subscription.findAll", query = "SELECT s FROM Subscription s")})
public class Subscription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUBSCRIPTION_ID")
    private String subscriptionId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "COMMUNICATION_EVENT_ID")
    private String communicationEventId;
    @Column(name = "PARTY_NEED_ID")
    private String partyNeedId;
    @Column(name = "EXTERNAL_SUBSCRIPTION_ID")
    private String externalSubscriptionId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "PURCHASE_FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseFromDate;
    @Column(name = "PURCHASE_THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date purchaseThruDate;
    @Column(name = "MAX_LIFE_TIME")
    private BigInteger maxLifeTime;
    @Column(name = "AVAILABLE_TIME")
    private BigInteger availableTime;
    @Column(name = "USE_COUNT_LIMIT")
    private BigInteger useCountLimit;
    @Column(name = "USE_TIME")
    private BigInteger useTime;
    @Column(name = "AUTOMATIC_EXTEND")
    private Character automaticExtend;
    @Column(name = "CANCL_AUTM_EXT_TIME")
    private BigInteger canclAutmExtTime;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscription")
    private List<SubscriptionAttribute> subscriptionAttributeList;
    @JoinColumn(name = "USE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom useTimeUomId;
    @JoinColumn(name = "SUBSCRIPTION_TYPE_ID", referencedColumnName = "SUBSCRIPTION_TYPE_ID")
    @ManyToOne
    private SubscriptionType subscriptionTypeId;
    @JoinColumn(name = "SUBSCRIPTION_RESOURCE_ID", referencedColumnName = "SUBSCRIPTION_RESOURCE_ID")
    @ManyToOne
    private SubscriptionResource subscriptionResourceId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumn(name = "AVAILABLE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom availableTimeUomId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    @JoinColumn(name = "CANCL_AUTM_EXT_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom canclAutmExtTimeUomId;
    @JoinColumn(name = "INVENTORY_ITEM_ID", referencedColumnName = "INVENTORY_ITEM_ID")
    @ManyToOne
    private InventoryItem inventoryItemId;
    @JoinColumn(name = "MAX_LIFE_TIME_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom maxLifeTimeUomId;
    @JoinColumn(name = "NEED_TYPE_ID", referencedColumnName = "NEED_TYPE_ID")
    @ManyToOne
    private NeedType needTypeId;
    @JoinColumn(name = "ORIGINATED_FROM_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party originatedFromPartyId;
    @JoinColumns({
        @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID"),
        @JoinColumn(name = "ORDER_ITEM_SEQ_ID", referencedColumnName = "ORDER_ITEM_SEQ_ID")})
    @ManyToOne
    private OrderItem orderItem;
    @JoinColumn(name = "ORIGINATED_FROM_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType originatedFromRoleTypeId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PRODUCT_CATEGORY_ID", referencedColumnName = "PRODUCT_CATEGORY_ID")
    @ManyToOne
    private ProductCategory productCategoryId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscription")
    private List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subscription")
    private List<SubscriptionCommEvent> subscriptionCommEventList;

    public Subscription() {
    }

    public Subscription(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommunicationEventId() {
        return communicationEventId;
    }

    public void setCommunicationEventId(String communicationEventId) {
        this.communicationEventId = communicationEventId;
    }

    public String getPartyNeedId() {
        return partyNeedId;
    }

    public void setPartyNeedId(String partyNeedId) {
        this.partyNeedId = partyNeedId;
    }

    public String getExternalSubscriptionId() {
        return externalSubscriptionId;
    }

    public void setExternalSubscriptionId(String externalSubscriptionId) {
        this.externalSubscriptionId = externalSubscriptionId;
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

    public Date getPurchaseFromDate() {
        return purchaseFromDate;
    }

    public void setPurchaseFromDate(Date purchaseFromDate) {
        this.purchaseFromDate = purchaseFromDate;
    }

    public Date getPurchaseThruDate() {
        return purchaseThruDate;
    }

    public void setPurchaseThruDate(Date purchaseThruDate) {
        this.purchaseThruDate = purchaseThruDate;
    }

    public BigInteger getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(BigInteger maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public BigInteger getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(BigInteger availableTime) {
        this.availableTime = availableTime;
    }

    public BigInteger getUseCountLimit() {
        return useCountLimit;
    }

    public void setUseCountLimit(BigInteger useCountLimit) {
        this.useCountLimit = useCountLimit;
    }

    public BigInteger getUseTime() {
        return useTime;
    }

    public void setUseTime(BigInteger useTime) {
        this.useTime = useTime;
    }

    public Character getAutomaticExtend() {
        return automaticExtend;
    }

    public void setAutomaticExtend(Character automaticExtend) {
        this.automaticExtend = automaticExtend;
    }

    public BigInteger getCanclAutmExtTime() {
        return canclAutmExtTime;
    }

    public void setCanclAutmExtTime(BigInteger canclAutmExtTime) {
        this.canclAutmExtTime = canclAutmExtTime;
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

    public List<SubscriptionAttribute> getSubscriptionAttributeList() {
        return subscriptionAttributeList;
    }

    public void setSubscriptionAttributeList(List<SubscriptionAttribute> subscriptionAttributeList) {
        this.subscriptionAttributeList = subscriptionAttributeList;
    }

    public Uom getUseTimeUomId() {
        return useTimeUomId;
    }

    public void setUseTimeUomId(Uom useTimeUomId) {
        this.useTimeUomId = useTimeUomId;
    }

    public SubscriptionType getSubscriptionTypeId() {
        return subscriptionTypeId;
    }

    public void setSubscriptionTypeId(SubscriptionType subscriptionTypeId) {
        this.subscriptionTypeId = subscriptionTypeId;
    }

    public SubscriptionResource getSubscriptionResourceId() {
        return subscriptionResourceId;
    }

    public void setSubscriptionResourceId(SubscriptionResource subscriptionResourceId) {
        this.subscriptionResourceId = subscriptionResourceId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public Uom getAvailableTimeUomId() {
        return availableTimeUomId;
    }

    public void setAvailableTimeUomId(Uom availableTimeUomId) {
        this.availableTimeUomId = availableTimeUomId;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    public Uom getCanclAutmExtTimeUomId() {
        return canclAutmExtTimeUomId;
    }

    public void setCanclAutmExtTimeUomId(Uom canclAutmExtTimeUomId) {
        this.canclAutmExtTimeUomId = canclAutmExtTimeUomId;
    }

    public InventoryItem getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(InventoryItem inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public Uom getMaxLifeTimeUomId() {
        return maxLifeTimeUomId;
    }

    public void setMaxLifeTimeUomId(Uom maxLifeTimeUomId) {
        this.maxLifeTimeUomId = maxLifeTimeUomId;
    }

    public NeedType getNeedTypeId() {
        return needTypeId;
    }

    public void setNeedTypeId(NeedType needTypeId) {
        this.needTypeId = needTypeId;
    }

    public Party getOriginatedFromPartyId() {
        return originatedFromPartyId;
    }

    public void setOriginatedFromPartyId(Party originatedFromPartyId) {
        this.originatedFromPartyId = originatedFromPartyId;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public RoleType getOriginatedFromRoleTypeId() {
        return originatedFromRoleTypeId;
    }

    public void setOriginatedFromRoleTypeId(RoleType originatedFromRoleTypeId) {
        this.originatedFromRoleTypeId = originatedFromRoleTypeId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public ProductCategory getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(ProductCategory productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public List<SubscriptionFulfillmentPiece> getSubscriptionFulfillmentPieceList() {
        return subscriptionFulfillmentPieceList;
    }

    public void setSubscriptionFulfillmentPieceList(List<SubscriptionFulfillmentPiece> subscriptionFulfillmentPieceList) {
        this.subscriptionFulfillmentPieceList = subscriptionFulfillmentPieceList;
    }

    public List<SubscriptionCommEvent> getSubscriptionCommEventList() {
        return subscriptionCommEventList;
    }

    public void setSubscriptionCommEventList(List<SubscriptionCommEvent> subscriptionCommEventList) {
        this.subscriptionCommEventList = subscriptionCommEventList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionId != null ? subscriptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subscription)) {
            return false;
        }
        Subscription other = (Subscription) object;
        if ((this.subscriptionId == null && other.subscriptionId != null) || (this.subscriptionId != null && !this.subscriptionId.equals(other.subscriptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Subscription[ subscriptionId=" + subscriptionId + " ]";
    }
    
}
