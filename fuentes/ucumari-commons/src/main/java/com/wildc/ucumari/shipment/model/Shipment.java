/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.contact.model.PostalAddress;
import com.wildc.ucumari.contact.model.TelecomNumber;
import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.order.model.OrderHeader;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.parameters.model.Uom;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.returns.model.ReturnHeader;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "shipment")
public class Shipment implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentAttribute> shipmentAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentStatus> shipmentStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ReturnItemShipment> returnItemShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentRouteSegment> shipmentRouteSegmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentContactMech> shipmentContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<OrderShipment> orderShipmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentItem> shipmentItemList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHIPMENT_ID")
    private String shipmentId;
    @Column(name = "PRIMARY_SHIP_GROUP_SEQ_ID")
    private String primaryShipGroupSeqId;
    @Column(name = "ESTIMATED_READY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedReadyDate;
    @Column(name = "ESTIMATED_SHIP_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedShipDate;
    @Column(name = "ESTIMATED_ARRIVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date estimatedArrivalDate;
    @Column(name = "LATEST_CANCEL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date latestCancelDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_SHIP_COST")
    private BigDecimal estimatedShipCost;
    @Column(name = "HANDLING_INSTRUCTIONS")
    private String handlingInstructions;
    @Column(name = "ADDITIONAL_SHIPPING_CHARGE")
    private BigDecimal additionalShippingCharge;
    @Column(name = "ADDTL_SHIPPING_CHARGE_DESC")
    private String addtlShippingChargeDesc;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
    @Column(name = "LAST_MODIFIED_BY_USER_LOGIN")
    private String lastModifiedByUserLogin;
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
    @JoinColumn(name = "SHIPMENT_TYPE_ID", referencedColumnName = "SHIPMENT_TYPE_ID")
    @ManyToOne
    private ShipmentType shipmentTypeId;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PARTY_ID_TO", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdTo;
    @JoinColumn(name = "PARTY_ID_FROM", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyIdFrom;
    @JoinColumn(name = "PRIMARY_RETURN_ID", referencedColumnName = "RETURN_ID")
    @ManyToOne
    private ReturnHeader primaryReturnId;
    /*
    @JoinColumn(name = "PICKLIST_BIN_ID", referencedColumnName = "PICKLIST_BIN_ID")
    @ManyToOne
    private PicklistBin picklistBinId;*/
    @JoinColumn(name = "RETURN_ID", referencedColumnName = "RETURN_ID")
    @ManyToOne
    private ReturnHeader returnId;
    @JoinColumn(name = "CURRENCY_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom currencyUomId;
    @JoinColumn(name = "DESTINATION_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility destinationFacilityId;
    @JoinColumn(name = "DESTINATION_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress destinationContactMechId;
    @JoinColumn(name = "DESTINATION_TELECOM_NUMBER_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private TelecomNumber destinationTelecomNumberId;
    /*@JoinColumn(name = "ESTIMATED_ARRIVAL_WORK_EFF_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort estimatedArrivalWorkEffId;
    @JoinColumn(name = "ESTIMATED_SHIP_WORK_EFF_ID", referencedColumnName = "WORK_EFFORT_ID")
    @ManyToOne
    private WorkEffort estimatedShipWorkEffId;*/
    @JoinColumn(name = "ORIGIN_FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility originFacilityId;
    @JoinColumn(name = "ORIGIN_CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress originContactMechId;
    @JoinColumn(name = "ORIGIN_TELECOM_NUMBER_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private TelecomNumber originTelecomNumberId;
    @JoinColumn(name = "PRIMARY_ORDER_ID", referencedColumnName = "ORDER_ID")
    @ManyToOne
    private OrderHeader primaryOrderId;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "shipment")
    private List<ShipmentPackage> shipmentPackageList;
    @OneToMany(mappedBy = "shipmentId")
    private List<AcctgTrans> acctgTransList;*/

    public Shipment() {
    }

    public Shipment(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getPrimaryShipGroupSeqId() {
        return primaryShipGroupSeqId;
    }

    public void setPrimaryShipGroupSeqId(String primaryShipGroupSeqId) {
        this.primaryShipGroupSeqId = primaryShipGroupSeqId;
    }

    public Date getEstimatedReadyDate() {
        return estimatedReadyDate;
    }

    public void setEstimatedReadyDate(Date estimatedReadyDate) {
        this.estimatedReadyDate = estimatedReadyDate;
    }

    public Date getEstimatedShipDate() {
        return estimatedShipDate;
    }

    public void setEstimatedShipDate(Date estimatedShipDate) {
        this.estimatedShipDate = estimatedShipDate;
    }

    public Date getEstimatedArrivalDate() {
        return estimatedArrivalDate;
    }

    public void setEstimatedArrivalDate(Date estimatedArrivalDate) {
        this.estimatedArrivalDate = estimatedArrivalDate;
    }

    public Date getLatestCancelDate() {
        return latestCancelDate;
    }

    public void setLatestCancelDate(Date latestCancelDate) {
        this.latestCancelDate = latestCancelDate;
    }

    public BigDecimal getEstimatedShipCost() {
        return estimatedShipCost;
    }

    public void setEstimatedShipCost(BigDecimal estimatedShipCost) {
        this.estimatedShipCost = estimatedShipCost;
    }

    public String getHandlingInstructions() {
        return handlingInstructions;
    }

    public void setHandlingInstructions(String handlingInstructions) {
        this.handlingInstructions = handlingInstructions;
    }

    public BigDecimal getAdditionalShippingCharge() {
        return additionalShippingCharge;
    }

    public void setAdditionalShippingCharge(BigDecimal additionalShippingCharge) {
        this.additionalShippingCharge = additionalShippingCharge;
    }

    public String getAddtlShippingChargeDesc() {
        return addtlShippingChargeDesc;
    }

    public void setAddtlShippingChargeDesc(String addtlShippingChargeDesc) {
        this.addtlShippingChargeDesc = addtlShippingChargeDesc;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
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

    public ShipmentType getShipmentTypeId() {
        return shipmentTypeId;
    }

    public void setShipmentTypeId(ShipmentType shipmentTypeId) {
        this.shipmentTypeId = shipmentTypeId;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Party getPartyIdTo() {
        return partyIdTo;
    }

    public void setPartyIdTo(Party partyIdTo) {
        this.partyIdTo = partyIdTo;
    }

    public Party getPartyIdFrom() {
        return partyIdFrom;
    }

    public void setPartyIdFrom(Party partyIdFrom) {
        this.partyIdFrom = partyIdFrom;
    }

    public ReturnHeader getPrimaryReturnId() {
        return primaryReturnId;
    }

    public void setPrimaryReturnId(ReturnHeader primaryReturnId) {
        this.primaryReturnId = primaryReturnId;
    }
/*
    public PicklistBin getPicklistBinId() {
        return picklistBinId;
    }

    public void setPicklistBinId(PicklistBin picklistBinId) {
        this.picklistBinId = picklistBinId;
    }*/

    public ReturnHeader getReturnId() {
        return returnId;
    }

    public void setReturnId(ReturnHeader returnId) {
        this.returnId = returnId;
    }

    public Uom getCurrencyUomId() {
        return currencyUomId;
    }

    public void setCurrencyUomId(Uom currencyUomId) {
        this.currencyUomId = currencyUomId;
    }

    public Facility getDestinationFacilityId() {
        return destinationFacilityId;
    }

    public void setDestinationFacilityId(Facility destinationFacilityId) {
        this.destinationFacilityId = destinationFacilityId;
    }

    public PostalAddress getDestinationContactMechId() {
        return destinationContactMechId;
    }

    public void setDestinationContactMechId(PostalAddress destinationContactMechId) {
        this.destinationContactMechId = destinationContactMechId;
    }

    public TelecomNumber getDestinationTelecomNumberId() {
        return destinationTelecomNumberId;
    }

    public void setDestinationTelecomNumberId(TelecomNumber destinationTelecomNumberId) {
        this.destinationTelecomNumberId = destinationTelecomNumberId;
    }
/*
    public WorkEffort getEstimatedArrivalWorkEffId() {
        return estimatedArrivalWorkEffId;
    }

    public void setEstimatedArrivalWorkEffId(WorkEffort estimatedArrivalWorkEffId) {
        this.estimatedArrivalWorkEffId = estimatedArrivalWorkEffId;
    }

    public WorkEffort getEstimatedShipWorkEffId() {
        return estimatedShipWorkEffId;
    }

    public void setEstimatedShipWorkEffId(WorkEffort estimatedShipWorkEffId) {
        this.estimatedShipWorkEffId = estimatedShipWorkEffId;
    }*/

    public Facility getOriginFacilityId() {
        return originFacilityId;
    }

    public void setOriginFacilityId(Facility originFacilityId) {
        this.originFacilityId = originFacilityId;
    }

    public PostalAddress getOriginContactMechId() {
        return originContactMechId;
    }

    public void setOriginContactMechId(PostalAddress originContactMechId) {
        this.originContactMechId = originContactMechId;
    }

    public TelecomNumber getOriginTelecomNumberId() {
        return originTelecomNumberId;
    }

    public void setOriginTelecomNumberId(TelecomNumber originTelecomNumberId) {
        this.originTelecomNumberId = originTelecomNumberId;
    }

    public OrderHeader getPrimaryOrderId() {
        return primaryOrderId;
    }

    public void setPrimaryOrderId(OrderHeader primaryOrderId) {
        this.primaryOrderId = primaryOrderId;
    }
/*
    public List<ShipmentPackage> getShipmentPackageList() {
        return shipmentPackageList;
    }

    public void setShipmentPackageList(List<ShipmentPackage> shipmentPackageList) {
        this.shipmentPackageList = shipmentPackageList;
    }

    public List<AcctgTrans> getAcctgTransList() {
        return acctgTransList;
    }

    public void setAcctgTransList(List<AcctgTrans> acctgTransList) {
        this.acctgTransList = acctgTransList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shipmentId != null ? shipmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shipment)) {
            return false;
        }
        Shipment other = (Shipment) object;
        if ((this.shipmentId == null && other.shipmentId != null) || (this.shipmentId != null && !this.shipmentId.equals(other.shipmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Shipment[ shipmentId=" + shipmentId + " ]";
    }
/*
    public List<ShipmentItem> getShipmentItemList() {
        return shipmentItemList;
    }

    public void setShipmentItemList(List<ShipmentItem> shipmentItemList) {
        this.shipmentItemList = shipmentItemList;
    }

    public List<OrderShipment> getOrderShipmentList() {
        return orderShipmentList;
    }

    public void setOrderShipmentList(List<OrderShipment> orderShipmentList) {
        this.orderShipmentList = orderShipmentList;
    }

    public List<ShipmentAttribute> getShipmentAttributeList() {
        return shipmentAttributeList;
    }

    public void setShipmentAttributeList(List<ShipmentAttribute> shipmentAttributeList) {
        this.shipmentAttributeList = shipmentAttributeList;
    }

    public List<ShipmentStatus> getShipmentStatusList() {
        return shipmentStatusList;
    }

    public void setShipmentStatusList(List<ShipmentStatus> shipmentStatusList) {
        this.shipmentStatusList = shipmentStatusList;
    }

    public List<ReturnItemShipment> getReturnItemShipmentList() {
        return returnItemShipmentList;
    }

    public void setReturnItemShipmentList(List<ReturnItemShipment> returnItemShipmentList) {
        this.returnItemShipmentList = returnItemShipmentList;
    }

    public List<ShipmentRouteSegment> getShipmentRouteSegmentList() {
        return shipmentRouteSegmentList;
    }

    public void setShipmentRouteSegmentList(List<ShipmentRouteSegment> shipmentRouteSegmentList) {
        this.shipmentRouteSegmentList = shipmentRouteSegmentList;
    }

    public List<ShipmentContactMech> getShipmentContactMechList() {
        return shipmentContactMechList;
    }

    public void setShipmentContactMechList(List<ShipmentContactMech> shipmentContactMechList) {
        this.shipmentContactMechList = shipmentContactMechList;
    }*/
    
}
