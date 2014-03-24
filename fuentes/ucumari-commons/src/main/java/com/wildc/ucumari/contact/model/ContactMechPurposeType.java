/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.contact.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "contact_mech_purpose_type")

public class ContactMechPurposeType implements Serializable {
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechPurposeType")
    private List<PartyContactMechPurpose> partyContactMechPurposeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechPurposeType")
    private List<OrderItemContactMech> orderItemContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechPurposeType")
    private List<OrderContactMech> orderContactMechList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechPurposeType")
    private List<InvoiceContactMech> invoiceContactMechList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_PURPOSE_TYPE_ID")
    private String contactMechPurposeTypeId;
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
    /*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechPurposeType")
    private List<ContactMechTypePurpose> contactMechTypePurposeList;*/

    public ContactMechPurposeType() {
    }

    public ContactMechPurposeType(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
    }

    public String getContactMechPurposeTypeId() {
        return contactMechPurposeTypeId;
    }

    public void setContactMechPurposeTypeId(String contactMechPurposeTypeId) {
        this.contactMechPurposeTypeId = contactMechPurposeTypeId;
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
/*
    public List<ContactMechTypePurpose> getContactMechTypePurposeList() {
        return contactMechTypePurposeList;
    }

    public void setContactMechTypePurposeList(List<ContactMechTypePurpose> contactMechTypePurposeList) {
        this.contactMechTypePurposeList = contactMechTypePurposeList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechPurposeTypeId != null ? contactMechPurposeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechPurposeType)) {
            return false;
        }
        ContactMechPurposeType other = (ContactMechPurposeType) object;
        if ((this.contactMechPurposeTypeId == null && other.contactMechPurposeTypeId != null) || (this.contactMechPurposeTypeId != null && !this.contactMechPurposeTypeId.equals(other.contactMechPurposeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechPurposeType[ contactMechPurposeTypeId=" + contactMechPurposeTypeId + " ]";
    }
/*
    public List<InvoiceContactMech> getInvoiceContactMechList() {
        return invoiceContactMechList;
    }

    public void setInvoiceContactMechList(List<InvoiceContactMech> invoiceContactMechList) {
        this.invoiceContactMechList = invoiceContactMechList;
    }

    public List<OrderItemContactMech> getOrderItemContactMechList() {
        return orderItemContactMechList;
    }

    public void setOrderItemContactMechList(List<OrderItemContactMech> orderItemContactMechList) {
        this.orderItemContactMechList = orderItemContactMechList;
    }

    public List<OrderContactMech> getOrderContactMechList() {
        return orderContactMechList;
    }

    public void setOrderContactMechList(List<OrderContactMech> orderContactMechList) {
        this.orderContactMechList = orderContactMechList;
    }

    public List<PartyContactMechPurpose> getPartyContactMechPurposeList() {
        return partyContactMechPurposeList;
    }

    public void setPartyContactMechPurposeList(List<PartyContactMechPurpose> partyContactMechPurposeList) {
        this.partyContactMechPurposeList = partyContactMechPurposeList;
    }*/
    
}
