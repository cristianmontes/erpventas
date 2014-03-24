/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.facility.model.Facility;
import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.product.model.Product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "reorder_guideline")
@NamedQueries({
    @NamedQuery(name = "ReorderGuideline.findAll", query = "SELECT r FROM ReorderGuideline r")})
public class ReorderGuideline implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REORDER_GUIDELINE_ID")
    private String reorderGuidelineId;
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REORDER_QUANTITY")
    private BigDecimal reorderQuantity;
    @Column(name = "REORDER_LEVEL")
    private BigDecimal reorderLevel;
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
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID")
    @ManyToOne
    private Product productId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo geoId;
    @JoinColumn(name = "FACILITY_ID", referencedColumnName = "FACILITY_ID")
    @ManyToOne
    private Facility facilityId;

    public ReorderGuideline() {
    }

    public ReorderGuideline(String reorderGuidelineId) {
        this.reorderGuidelineId = reorderGuidelineId;
    }

    public String getReorderGuidelineId() {
        return reorderGuidelineId;
    }

    public void setReorderGuidelineId(String reorderGuidelineId) {
        this.reorderGuidelineId = reorderGuidelineId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
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

    public BigDecimal getReorderQuantity() {
        return reorderQuantity;
    }

    public void setReorderQuantity(BigDecimal reorderQuantity) {
        this.reorderQuantity = reorderQuantity;
    }

    public BigDecimal getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(BigDecimal reorderLevel) {
        this.reorderLevel = reorderLevel;
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

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public Geo getGeoId() {
        return geoId;
    }

    public void setGeoId(Geo geoId) {
        this.geoId = geoId;
    }

    public Facility getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Facility facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reorderGuidelineId != null ? reorderGuidelineId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReorderGuideline)) {
            return false;
        }
        ReorderGuideline other = (ReorderGuideline) object;
        if ((this.reorderGuidelineId == null && other.reorderGuidelineId != null) || (this.reorderGuidelineId != null && !this.reorderGuidelineId.equals(other.reorderGuidelineId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ReorderGuideline[ reorderGuidelineId=" + reorderGuidelineId + " ]";
    }
    
}
