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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "quantity_break_type")
@NamedQueries({
    @NamedQuery(name = "QuantityBreakType.findAll", query = "SELECT q FROM QuantityBreakType q")})
public class QuantityBreakType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUANTITY_BREAK_TYPE_ID")
    private String quantityBreakTypeId;
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
    @OneToMany(mappedBy = "quantityBreakTypeId")
    private List<QuantityBreak> quantityBreakList;

    public QuantityBreakType() {
    }

    public QuantityBreakType(String quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId;
    }

    public String getQuantityBreakTypeId() {
        return quantityBreakTypeId;
    }

    public void setQuantityBreakTypeId(String quantityBreakTypeId) {
        this.quantityBreakTypeId = quantityBreakTypeId;
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

    public List<QuantityBreak> getQuantityBreakList() {
        return quantityBreakList;
    }

    public void setQuantityBreakList(List<QuantityBreak> quantityBreakList) {
        this.quantityBreakList = quantityBreakList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (quantityBreakTypeId != null ? quantityBreakTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof QuantityBreakType)) {
            return false;
        }
        QuantityBreakType other = (QuantityBreakType) object;
        if ((this.quantityBreakTypeId == null && other.quantityBreakTypeId != null) || (this.quantityBreakTypeId != null && !this.quantityBreakTypeId.equals(other.quantityBreakTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.QuantityBreakType[ quantityBreakTypeId=" + quantityBreakTypeId + " ]";
    }
    
}
