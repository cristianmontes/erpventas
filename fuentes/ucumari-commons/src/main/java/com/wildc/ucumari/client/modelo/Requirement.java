/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.order.model.OrderItemType;
import com.wildc.ucumari.parameters.model.StatusItem;
import com.wildc.ucumari.product.model.Product;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "requirement")
@NamedQueries({
    @NamedQuery(name = "Requirement.findAll", query = "SELECT r FROM Requirement r")})
public class Requirement implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<RequirementBudgetAllocation> requirementBudgetAllocationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<RequirementAttribute> requirementAttributeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<WorkRequirementFulfillment> workRequirementFulfillmentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<RequirementCustRequest> requirementCustRequestList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<RequirementStatus> requirementStatusList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<RequirementRole> requirementRoleList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQUIREMENT_ID")
    private String requirementId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "REQUIREMENT_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requirementStartDate;
    @Column(name = "REQUIRED_BY_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredByDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ESTIMATED_BUDGET")
    private BigDecimal estimatedBudget;
    @Column(name = "QUANTITY")
    private BigDecimal quantity;
    @Lob
    @Column(name = "USE_CASE")
    private String useCase;
    @Column(name = "REASON")
    private String reason;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "requirement")
    private List<DesiredFeature> desiredFeatureList;
    @JoinColumn(name = "REQUIREMENT_TYPE_ID", referencedColumnName = "REQUIREMENT_TYPE_ID")
    @ManyToOne
    private RequirementType requirementTypeId;
    @JoinColumn(name = "FACILITY_ID_TO", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityIdTo;
    @JoinColumn(name = "STATUS_ID", referencedColumnName = "STATUS_ID")
    @ManyToOne
    private StatusItem statusId;
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "ORDER_ITEM_TYPE_ID", referencedColumnName = "ORDER_ITEM_TYPE_ID")
    @ManyToOne
    private OrderItemType orderItemTypeId;
    @JoinColumn(name = "FIXED_ASSET_ID", referencedColumnName = "FIXED_ASSET_ID")
    @ManyToOne
    private FixedAsset fixedAssetId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;
    @JoinColumn(name = "DELIVERABLE_ID", referencedColumnName = "DELIVERABLE_ID")
    @ManyToOne
    private Deliverable deliverableId;

    public Requirement() {
    }

    public Requirement(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(String requirementId) {
        this.requirementId = requirementId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRequirementStartDate() {
        return requirementStartDate;
    }

    public void setRequirementStartDate(Date requirementStartDate) {
        this.requirementStartDate = requirementStartDate;
    }

    public Date getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(Date requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public BigDecimal getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(BigDecimal estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public List<DesiredFeature> getDesiredFeatureList() {
        return desiredFeatureList;
    }

    public void setDesiredFeatureList(List<DesiredFeature> desiredFeatureList) {
        this.desiredFeatureList = desiredFeatureList;
    }

    public RequirementType getRequirementTypeId() {
        return requirementTypeId;
    }

    public void setRequirementTypeId(RequirementType requirementTypeId) {
        this.requirementTypeId = requirementTypeId;
    }

    public Facility getFacilityIdTo() {
        return facilityIdTo;
    }

    public void setFacilityIdTo(Facility facilityIdTo) {
        this.facilityIdTo = facilityIdTo;
    }

    public StatusItem getStatusId() {
        return statusId;
    }

    public void setStatusId(StatusItem statusId) {
        this.statusId = statusId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public OrderItemType getOrderItemTypeId() {
        return orderItemTypeId;
    }

    public void setOrderItemTypeId(OrderItemType orderItemTypeId) {
        this.orderItemTypeId = orderItemTypeId;
    }

    public FixedAsset getFixedAssetId() {
        return fixedAssetId;
    }

    public void setFixedAssetId(FixedAsset fixedAssetId) {
        this.fixedAssetId = fixedAssetId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    public Deliverable getDeliverableId() {
        return deliverableId;
    }

    public void setDeliverableId(Deliverable deliverableId) {
        this.deliverableId = deliverableId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (requirementId != null ? requirementId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requirement)) {
            return false;
        }
        Requirement other = (Requirement) object;
        if ((this.requirementId == null && other.requirementId != null) || (this.requirementId != null && !this.requirementId.equals(other.requirementId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Requirement[ requirementId=" + requirementId + " ]";
    }

    public List<RequirementBudgetAllocation> getRequirementBudgetAllocationList() {
        return requirementBudgetAllocationList;
    }

    public void setRequirementBudgetAllocationList(List<RequirementBudgetAllocation> requirementBudgetAllocationList) {
        this.requirementBudgetAllocationList = requirementBudgetAllocationList;
    }

    public List<RequirementAttribute> getRequirementAttributeList() {
        return requirementAttributeList;
    }

    public void setRequirementAttributeList(List<RequirementAttribute> requirementAttributeList) {
        this.requirementAttributeList = requirementAttributeList;
    }

    public List<WorkRequirementFulfillment> getWorkRequirementFulfillmentList() {
        return workRequirementFulfillmentList;
    }

    public void setWorkRequirementFulfillmentList(List<WorkRequirementFulfillment> workRequirementFulfillmentList) {
        this.workRequirementFulfillmentList = workRequirementFulfillmentList;
    }

    public List<RequirementCustRequest> getRequirementCustRequestList() {
        return requirementCustRequestList;
    }

    public void setRequirementCustRequestList(List<RequirementCustRequest> requirementCustRequestList) {
        this.requirementCustRequestList = requirementCustRequestList;
    }

    public List<RequirementStatus> getRequirementStatusList() {
        return requirementStatusList;
    }

    public void setRequirementStatusList(List<RequirementStatus> requirementStatusList) {
        this.requirementStatusList = requirementStatusList;
    }

    public List<RequirementRole> getRequirementRoleList() {
        return requirementRoleList;
    }

    public void setRequirementRoleList(List<RequirementRole> requirementRoleList) {
        this.requirementRoleList = requirementRoleList;
    }
    
}
