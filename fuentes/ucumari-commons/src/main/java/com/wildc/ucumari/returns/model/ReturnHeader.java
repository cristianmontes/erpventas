/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.returns.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.payment.model.PaymentMethod;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "return_header")

public class ReturnHeader implements Serializable {
    /*@OneToMany(mappedBy = "returnId")
    private List<ReturnStatus> returnStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "returnHeader")
    private List<TrackingCodeOrderReturn> trackingCodeOrderReturnList;
    @OneToMany(mappedBy = "returnId")
    private List<ReturnAdjustment> returnAdjustmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "returnHeader")
    private List<ReturnItemBilling> returnItemBillingList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "returnHeader")
    private List<ReturnItemShipment> returnItemShipmentList;
    @OneToMany(mappedBy = "returnId")
    private List<PosTerminalLog> posTerminalLogList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RETURN_ID")
    private String returnId;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Column(name = "ENTRY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date entryDate;
    @Column(name = "NEEDS_INVENTORY_RECEIVE")
    private Character needsInventoryReceive;
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
    @Column(name = "PRIMARY_ORDER_ID")
    private String primaryOrderId;
    @Lob
    @Column(name = "COMMENTS")
    private String comments;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_WEIGHT")
    private BigDecimal estimatedWeight;
    @Column(name = "ESTIMATED_WEIGHT_UOM_ID")
    private String estimatedWeightUomId;
    /*@OneToMany(mappedBy = "primaryReturnId")
    private List<Shipment> shipmentList;
    @OneToMany(mappedBy = "returnId")
    private List<Shipment> shipmentList1;*/
    @JoinColumn(name = "PAYMENT_METHOD_ID", referencedColumnName = "PAYMENT_METHOD_ID")
    @ManyToOne
    private PaymentMethod paymentMethodId;
    @JoinColumn(name = "TO_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party toPartyId;
    /*@JoinColumn(name = "FIN_ACCOUNT_ID", referencedColumnName = "FIN_ACCOUNT_ID")
    @ManyToOne
    private FinAccount finAccountId;*/
    @JoinColumn(name = "DESTINATION_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility destinationFacilityId;
    /*@JoinColumn(name = "BILLING_ACCOUNT_ID", referencedColumnName = "BILLING_ACCOUNT_ID")
    @ManyToOne
    private BillingAccount billingAccountId;*/
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "RETURN_HEADER_TYPE_ID", referencedColumnName = "RETURN_HEADER_TYPE_ID")
    @ManyToOne
    private ReturnHeaderType returnHeaderTypeId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "FROM_PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party fromPartyId;
    @JoinColumn(name = "ORIGIN_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech originContactMechId;
    @JoinColumn(name = "ORIGIN_PHONE_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech originPhoneContactMechId;
    @JoinColumn(name = "CARRIER_RETURN_SERVICE_ID", referencedColumnName = "CARRIER_RETURN_SERVICE_ID")
    @ManyToOne
    private CarrierReturnService carrierReturnServiceId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "returnHeader")
    private List<ReturnItem> returnItemList;*/

    public ReturnHeader() {
    }

    public ReturnHeader(String returnId) {
        this.returnId = returnId;
    }

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Character getNeedsInventoryReceive() {
        return needsInventoryReceive;
    }

    public void setNeedsInventoryReceive(Character needsInventoryReceive) {
        this.needsInventoryReceive = needsInventoryReceive;
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

    public String getPrimaryOrderId() {
        return primaryOrderId;
    }

    public void setPrimaryOrderId(String primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public BigDecimal getEstimatedWeight() {
        return estimatedWeight;
    }

    public void setEstimatedWeight(BigDecimal estimatedWeight) {
        this.estimatedWeight = estimatedWeight;
    }

    public String getEstimatedWeightUomId() {
        return estimatedWeightUomId;
    }

    public void setEstimatedWeightUomId(String estimatedWeightUomId) {
        this.estimatedWeightUomId = estimatedWeightUomId;
    }
/*
    public List<Shipment> getShipmentList() {
        return shipmentList;
    }

    public void setShipmentList(List<Shipment> shipmentList) {
        this.shipmentList = shipmentList;
    }

    public List<Shipment> getShipmentList1() {
        return shipmentList1;
    }

    public void setShipmentList1(List<Shipment> shipmentList1) {
        this.shipmentList1 = shipmentList1;
    }*/

    public PaymentMethod getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(PaymentMethod paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public Party getToPartyId() {
        return toPartyId;
    }

    public void setToPartyId(Party toPartyId) {
        this.toPartyId = toPartyId;
    }
/*
    public FinAccount getFinAccountId() {
        return finAccountId;
    }

    public void setFinAccountId(FinAccount finAccountId) {
        this.finAccountId = finAccountId;
    }*/

    public Facility getDestinationFacilityId() {
        return destinationFacilityId;
    }

    public void setDestinationFacilityId(Facility destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }
/*
    public BillingAccount getBillingAccountId() {
        return billingAccountId;
    }

    public void setBillingAccountId(BillingAccount billingAccountId) {
        this.billingAccountId = billingAccountId;
    }*/

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ReturnHeaderType getReturnHeaderTypeId() {
        return returnHeaderTypeId;
    }

    public void setReturnHeaderTypeId(ReturnHeaderType returnHeaderTypeId) {
        this.returnHeaderTypeId = returnHeaderTypeId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Party getFromPartyId() {
        return fromPartyId;
    }

    public void setFromPartyId(Party fromPartyId) {
        this.fromPartyId = fromPartyId;
    }

    public ContactMech getOriginContactMechId() {
        return originContactMechId;
    }

    public void setOriginContactMechId(ContactMech originContactMechId) {
        this.originContactMechId = originContactMechId;
    }

    public ContactMech getOriginPhoneContactMechId() {
        return originPhoneContactMechId;
    }

    public void setOriginPhoneContactMechId(ContactMech originPhoneContactMechId) {
        this.originPhoneContactMechId = originPhoneContactMechId;
    }

    public CarrierReturnService getCarrierReturnServiceId() {
        return carrierReturnServiceId;
    }

    public void setCarrierReturnServiceId(CarrierReturnService carrierReturnServiceId) {
        this.carrierReturnServiceId = carrierReturnServiceId;
    }
/*
    public List<ReturnItem> getReturnItemList() {
        return returnItemList;
    }

    public void setReturnItemList(List<ReturnItem> returnItemList) {
        this.returnItemList = returnItemList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (returnId != null ? returnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReturnHeader)) {
            return false;
        }
        ReturnHeader other = (ReturnHeader) object;
        if ((this.returnId == null && other.returnId != null) || (this.returnId != null && !this.returnId.equals(other.returnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReturnHeader[ returnId=" + returnId + " ]";
    }
/*
    public List<PosTerminalLog> getPosTerminalLogList() {
        return posTerminalLogList;
    }

    public void setPosTerminalLogList(List<PosTerminalLog> posTerminalLogList) {
        this.posTerminalLogList = posTerminalLogList;
    }

    public List<ReturnStatus> getReturnStatusList() {
        return returnStatusList;
    }

    public void setReturnStatusList(List<ReturnStatus> returnStatusList) {
        this.returnStatusList = returnStatusList;
    }

    public List<TrackingCodeOrderReturn> getTrackingCodeOrderReturnList() {
        return trackingCodeOrderReturnList;
    }

    public void setTrackingCodeOrderReturnList(List<TrackingCodeOrderReturn> trackingCodeOrderReturnList) {
        this.trackingCodeOrderReturnList = trackingCodeOrderReturnList;
    }

    public List<ReturnAdjustment> getReturnAdjustmentList() {
        return returnAdjustmentList;
    }

    public void setReturnAdjustmentList(List<ReturnAdjustment> returnAdjustmentList) {
        this.returnAdjustmentList = returnAdjustmentList;
    }

    public List<ReturnItemBilling> getReturnItemBillingList() {
        return returnItemBillingList;
    }

    public void setReturnItemBillingList(List<ReturnItemBilling> returnItemBillingList) {
        this.returnItemBillingList = returnItemBillingList;
    }

    public List<ReturnItemShipment> getReturnItemShipmentList() {
        return returnItemShipmentList;
    }

    public void setReturnItemShipmentList(List<ReturnItemShipment> returnItemShipmentList) {
        this.returnItemShipmentList = returnItemShipmentList;
    }*/
    
}
