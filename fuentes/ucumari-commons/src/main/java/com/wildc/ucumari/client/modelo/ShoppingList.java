/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentMethod;
import com.wildc.ucumari.product.model.ProductPromoCode;
import com.wildc.ucumari.product.model.ProductStore;

import java.io.Serializable;
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
@Table(name = "shopping_list")
@NamedQueries({
    @NamedQuery(name = "ShoppingList.findAll", query = "SELECT s FROM ShoppingList s")})
public class ShoppingList implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingList")
    private List<ShoppingListItemSurvey> shoppingListItemSurveyList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingList")
    private List<ShoppingListItem> shoppingListItemList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shoppingList")
    private List<ShoppingListWorkEffort> shoppingListWorkEffortList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHOPPING_LIST_ID")
    private String shoppingListId;
    @Column(name = "LIST_NAME")
    private String listName;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "IS_PUBLIC")
    private Character isPublic;
    @Column(name = "IS_ACTIVE")
    private Character isActive;
    @Column(name = "CURRENCY_UOM")
    private String currencyUom;
    @Column(name = "LAST_ORDERED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastOrderedDate;
    @Column(name = "LAST_ADMIN_MODIFIED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastAdminModified;
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
    @JoinColumn(name = "VISITOR_ID", referencedColumnName = "VISITOR_ID")
    @ManyToOne
    private Visitor visitorId;
    @JoinColumn(name = "SHOPPING_LIST_TYPE_ID", referencedColumnName = "SHOPPING_LIST_TYPE_ID")
    @ManyToOne
    private ShoppingListType shoppingListTypeId;
    @JoinColumn(name = "RECURRENCE_INFO_ID", referencedColumnName = "RECURRENCE_INFO_ID")
    @ManyToOne
    private RecurrenceInfo recurrenceInfoId;
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "PRODUCT_PROMO_CODE_ID", referencedColumnName = "PRODUCT_PROMO_CODE_ID")
    @ManyToOne
    private ProductPromoCode productPromoCodeId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @OneToMany(mappedBy = "parentShoppingListId")
    private List<ShoppingList> shoppingListList;
    @JoinColumn(name = "PARENT_SHOPPING_LIST_ID", referencedColumnName = "SHOPPING_LIST_ID")
    @ManyToOne
    private ShoppingList parentShoppingListId;
    @JoinColumns({
        @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID"),
        @JoinColumn(name = "CARRIER_PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "CARRIER_ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private CarrierShipmentMethod carrierShipmentMethod;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    @OneToMany(mappedBy = "autoOrderShoppingListId")
    private List<OrderHeader> orderHeaderList;

    public ShoppingList() {
    }

    public ShoppingList(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getShoppingListId() {
        return shoppingListId;
    }

    public void setShoppingListId(String shoppingListId) {
        this.shoppingListId = shoppingListId;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Character isPublic) {
        this.isPublic = isPublic;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }

    public String getCurrencyUom() {
        return currencyUom;
    }

    public void setCurrencyUom(String currencyUom) {
        this.currencyUom = currencyUom;
    }

    public Date getLastOrderedDate() {
        return lastOrderedDate;
    }

    public void setLastOrderedDate(Date lastOrderedDate) {
        this.lastOrderedDate = lastOrderedDate;
    }

    public Date getLastAdminModified() {
        return lastAdminModified;
    }

    public void setLastAdminModified(Date lastAdminModified) {
        this.lastAdminModified = lastAdminModified;
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

    public Visitor getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Visitor visitorId) {
        this.visitorId = visitorId;
    }

    public ShoppingListType getShoppingListTypeId() {
        return shoppingListTypeId;
    }

    public void setShoppingListTypeId(ShoppingListType shoppingListTypeId) {
        this.shoppingListTypeId = shoppingListTypeId;
    }

    public RecurrenceInfo getRecurrenceInfoId() {
        return recurrenceInfoId;
    }

    public void setRecurrenceInfoId(RecurrenceInfo recurrenceInfoId) {
        this.recurrenceInfoId = recurrenceInfoId;
    }

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public ProductPromoCode getProductPromoCodeId() {
        return productPromoCodeId;
    }

    public void setProductPromoCodeId(ProductPromoCode productPromoCodeId) {
        this.productPromoCodeId = productPromoCodeId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public List<ShoppingList> getShoppingListList() {
        return shoppingListList;
    }

    public void setShoppingListList(List<ShoppingList> shoppingListList) {
        this.shoppingListList = shoppingListList;
    }

    public ShoppingList getParentShoppingListId() {
        return parentShoppingListId;
    }

    public void setParentShoppingListId(ShoppingList parentShoppingListId) {
        this.parentShoppingListId = parentShoppingListId;
    }

    public CarrierShipmentMethod getCarrierShipmentMethod() {
        return carrierShipmentMethod;
    }

    public void setCarrierShipmentMethod(CarrierShipmentMethod carrierShipmentMethod) {
        this.carrierShipmentMethod = carrierShipmentMethod;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    public List<OrderHeader> getOrderHeaderList() {
        return orderHeaderList;
    }

    public void setOrderHeaderList(List<OrderHeader> orderHeaderList) {
        this.orderHeaderList = orderHeaderList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shoppingListId != null ? shoppingListId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShoppingList)) {
            return false;
        }
        ShoppingList other = (ShoppingList) object;
        if ((this.shoppingListId == null && other.shoppingListId != null) || (this.shoppingListId != null && !this.shoppingListId.equals(other.shoppingListId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ShoppingList[ shoppingListId=" + shoppingListId + " ]";
    }

    public List<ShoppingListItemSurvey> getShoppingListItemSurveyList() {
        return shoppingListItemSurveyList;
    }

    public void setShoppingListItemSurveyList(List<ShoppingListItemSurvey> shoppingListItemSurveyList) {
        this.shoppingListItemSurveyList = shoppingListItemSurveyList;
    }

    public List<ShoppingListItem> getShoppingListItemList() {
        return shoppingListItemList;
    }

    public void setShoppingListItemList(List<ShoppingListItem> shoppingListItemList) {
        this.shoppingListItemList = shoppingListItemList;
    }

    public List<ShoppingListWorkEffort> getShoppingListWorkEffortList() {
        return shoppingListWorkEffortList;
    }

    public void setShoppingListWorkEffortList(List<ShoppingListWorkEffort> shoppingListWorkEffortList) {
        this.shoppingListWorkEffortList = shoppingListWorkEffortList;
    }
    
}
