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

import com.wildc.ucumari.product.model.ProductStore;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "segment_group")
@NamedQueries({
    @NamedQuery(name = "SegmentGroup.findAll", query = "SELECT s FROM SegmentGroup s")})
public class SegmentGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SEGMENT_GROUP_ID")
    private String segmentGroupId;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmentGroup")
    private List<SegmentGroupRole> segmentGroupRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmentGroup")
    private List<SegmentGroupGeo> segmentGroupGeoList;
    @JoinColumn(name = "SEGMENT_GROUP_TYPE_ID", referencedColumnName = "SEGMENT_GROUP_TYPE_ID")
    @ManyToOne
    private SegmentGroupType segmentGroupTypeId;
    @JoinColumn(name = "PRODUCT_STORE_ID", referencedColumnName = "PRODUCT_STORE_ID")
    @ManyToOne
    private ProductStore productStoreId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "segmentGroup")
    private List<SegmentGroupClassification> segmentGroupClassificationList;

    public SegmentGroup() {
    }

    public SegmentGroup(String segmentGroupId) {
        this.segmentGroupId = segmentGroupId;
    }

    public String getSegmentGroupId() {
        return segmentGroupId;
    }

    public void setSegmentGroupId(String segmentGroupId) {
        this.segmentGroupId = segmentGroupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<SegmentGroupRole> getSegmentGroupRoleList() {
        return segmentGroupRoleList;
    }

    public void setSegmentGroupRoleList(List<SegmentGroupRole> segmentGroupRoleList) {
        this.segmentGroupRoleList = segmentGroupRoleList;
    }

    public List<SegmentGroupGeo> getSegmentGroupGeoList() {
        return segmentGroupGeoList;
    }

    public void setSegmentGroupGeoList(List<SegmentGroupGeo> segmentGroupGeoList) {
        this.segmentGroupGeoList = segmentGroupGeoList;
    }

    public SegmentGroupType getSegmentGroupTypeId() {
        return segmentGroupTypeId;
    }

    public void setSegmentGroupTypeId(SegmentGroupType segmentGroupTypeId) {
        this.segmentGroupTypeId = segmentGroupTypeId;
    }

    public ProductStore getProductStoreId() {
        return productStoreId;
    }

    public void setProductStoreId(ProductStore productStoreId) {
        this.productStoreId = productStoreId;
    }

    public List<SegmentGroupClassification> getSegmentGroupClassificationList() {
        return segmentGroupClassificationList;
    }

    public void setSegmentGroupClassificationList(List<SegmentGroupClassification> segmentGroupClassificationList) {
        this.segmentGroupClassificationList = segmentGroupClassificationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (segmentGroupId != null ? segmentGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SegmentGroup)) {
            return false;
        }
        SegmentGroup other = (SegmentGroup) object;
        if ((this.segmentGroupId == null && other.segmentGroupId != null) || (this.segmentGroupId != null && !this.segmentGroupId.equals(other.segmentGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.SegmentGroup[ segmentGroupId=" + segmentGroupId + " ]";
    }
    
}
