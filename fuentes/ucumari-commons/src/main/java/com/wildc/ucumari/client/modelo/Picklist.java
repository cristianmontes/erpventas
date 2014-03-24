/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.shipment.model.ShipmentMethodType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "picklist")
@NamedQueries({
    @NamedQuery(name = "Picklist.findAll", query = "SELECT p FROM Picklist p")})
public class Picklist implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "picklist")
    private List<PicklistStatusHistory> picklistStatusHistoryList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "picklist")
    private List<PicklistRole> picklistRoleList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PICKLIST_ID")
    private String picklistId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PICKLIST_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date picklistDate;
    @Column(name = "CREATED_BY_USER_LOGIN")
    private String createdByUserLogin;
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
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "SHIPMENT_METHOD_TYPE_ID", referencedColumnName = "SHIPMENT_METHOD_TYPE_ID")
    @ManyToOne
    private ShipmentMethodType shipmentMethodTypeId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @OneToMany(mappedBy = "picklistId")
    private List<PicklistBin> picklistBinList;

    public Picklist() {
    }

    public Picklist(String picklistId) {
        this.picklistId = picklistId;
    }

    public String getPicklistId() {
        return picklistId;
    }

    public void setPicklistId(String picklistId) {
        this.picklistId = picklistId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPicklistDate() {
        return picklistDate;
    }

    public void setPicklistDate(Date picklistDate) {
        this.picklistDate = picklistDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
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

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public ShipmentMethodType getShipmentMethodTypeId() {
        return shipmentMethodTypeId;
    }

    public void setShipmentMethodTypeId(ShipmentMethodType shipmentMethodTypeId) {
        this.shipmentMethodTypeId = shipmentMethodTypeId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public List<PicklistBin> getPicklistBinList() {
        return picklistBinList;
    }

    public void setPicklistBinList(List<PicklistBin> picklistBinList) {
        this.picklistBinList = picklistBinList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (picklistId != null ? picklistId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Picklist)) {
            return false;
        }
        Picklist other = (Picklist) object;
        if ((this.picklistId == null && other.picklistId != null) || (this.picklistId != null && !this.picklistId.equals(other.picklistId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Picklist[ picklistId=" + picklistId + " ]";
    }

    public List<PicklistStatusHistory> getPicklistStatusHistoryList() {
        return picklistStatusHistoryList;
    }

    public void setPicklistStatusHistoryList(List<PicklistStatusHistory> picklistStatusHistoryList) {
        this.picklistStatusHistoryList = picklistStatusHistoryList;
    }

    public List<PicklistRole> getPicklistRoleList() {
        return picklistRoleList;
    }

    public void setPicklistRoleList(List<PicklistRole> picklistRoleList) {
        this.picklistRoleList = picklistRoleList;
    }
    
}
