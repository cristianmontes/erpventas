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

import com.wildc.ucumari.quote.model.QuoteItem;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "deliverable_type")
@NamedQueries({
    @NamedQuery(name = "DeliverableType.findAll", query = "SELECT d FROM DeliverableType d")})
public class DeliverableType implements Serializable {
    @OneToMany(mappedBy = "deliverableTypeId")
    private List<Deliverable> deliverableList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DELIVERABLE_TYPE_ID")
    private String deliverableTypeId;
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
    @OneToMany(mappedBy = "deliverableTypeId")
    private List<QuoteItem> quoteItemList;

    public DeliverableType() {
    }

    public DeliverableType(String deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
    }

    public String getDeliverableTypeId() {
        return deliverableTypeId;
    }

    public void setDeliverableTypeId(String deliverableTypeId) {
        this.deliverableTypeId = deliverableTypeId;
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

    public List<QuoteItem> getQuoteItemList() {
        return quoteItemList;
    }

    public void setQuoteItemList(List<QuoteItem> quoteItemList) {
        this.quoteItemList = quoteItemList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deliverableTypeId != null ? deliverableTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeliverableType)) {
            return false;
        }
        DeliverableType other = (DeliverableType) object;
        if ((this.deliverableTypeId == null && other.deliverableTypeId != null) || (this.deliverableTypeId != null && !this.deliverableTypeId.equals(other.deliverableTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DeliverableType[ deliverableTypeId=" + deliverableTypeId + " ]";
    }

    public List<Deliverable> getDeliverableList() {
        return deliverableList;
    }

    public void setDeliverableList(List<Deliverable> deliverableList) {
        this.deliverableList = deliverableList;
    }
    
}
