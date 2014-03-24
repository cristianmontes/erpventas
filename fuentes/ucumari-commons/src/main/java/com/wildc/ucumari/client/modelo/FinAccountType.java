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

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.product.model.ProductStoreFinActSetting;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "fin_account_type")
@NamedQueries({
    @NamedQuery(name = "FinAccountType.findAll", query = "SELECT f FROM FinAccountType f")})
public class FinAccountType implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "finAccountType")
    private List<ProductStoreFinActSetting> productStoreFinActSettingList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FIN_ACCOUNT_TYPE_ID")
    private String finAccountTypeId;
    @Column(name = "IS_REFUNDABLE")
    private Character isRefundable;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
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
    @JoinColumn(name = "REPLENISH_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration replenishEnumId;
    @OneToMany(mappedBy = "parentTypeId")
    private List<FinAccountType> finAccountTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "FIN_ACCOUNT_TYPE_ID")
    @ManyToOne
    private FinAccountType parentTypeId;
    @OneToMany(mappedBy = "finAccountTypeId")
    private List<FinAccount> finAccountList;

    public FinAccountType() {
    }

    public FinAccountType(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    public String getFinAccountTypeId() {
        return finAccountTypeId;
    }

    public void setFinAccountTypeId(String finAccountTypeId) {
        this.finAccountTypeId = finAccountTypeId;
    }

    public Character getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(Character isRefundable) {
        this.isRefundable = isRefundable;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
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

    public Enumeration getReplenishEnumId() {
        return replenishEnumId;
    }

    public void setReplenishEnumId(Enumeration replenishEnumId) {
        this.replenishEnumId = replenishEnumId;
    }

    public List<FinAccountType> getFinAccountTypeList() {
        return finAccountTypeList;
    }

    public void setFinAccountTypeList(List<FinAccountType> finAccountTypeList) {
        this.finAccountTypeList = finAccountTypeList;
    }

    public FinAccountType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(FinAccountType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<FinAccount> getFinAccountList() {
        return finAccountList;
    }

    public void setFinAccountList(List<FinAccount> finAccountList) {
        this.finAccountList = finAccountList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (finAccountTypeId != null ? finAccountTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FinAccountType)) {
            return false;
        }
        FinAccountType other = (FinAccountType) object;
        if ((this.finAccountTypeId == null && other.finAccountTypeId != null) || (this.finAccountTypeId != null && !this.finAccountTypeId.equals(other.finAccountTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.FinAccountType[ finAccountTypeId=" + finAccountTypeId + " ]";
    }

    public List<ProductStoreFinActSetting> getProductStoreFinActSettingList() {
        return productStoreFinActSettingList;
    }

    public void setProductStoreFinActSettingList(List<ProductStoreFinActSetting> productStoreFinActSettingList) {
        this.productStoreFinActSettingList = productStoreFinActSettingList;
    }
    
}
