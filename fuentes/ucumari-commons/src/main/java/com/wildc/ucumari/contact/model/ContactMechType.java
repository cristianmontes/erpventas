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
@Table(name = "contact_mech_type")
public class ContactMechType implements Serializable {
	/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechType")
    private List<ValidContactMechRole> validContactMechRoleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechType")
    private List<ContactMechTypePurpose> contactMechTypePurposeList;
    @OneToMany(mappedBy = "contactMechTypeId")
    private List<ContactList> contactListList;
    @OneToMany(mappedBy = "contactMechTypeId")
    private List<CommunicationEvent> communicationEventList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contactMechType")
    private List<ContactMechTypeAttr> contactMechTypeAttrList;*/
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MECH_TYPE_ID")
    private String contactMechTypeId;
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
    /*
    @OneToMany(mappedBy = "contactMechTypeId")
    private List<ContactMech> contactMechList;
    @OneToMany(mappedBy = "parentTypeId")
    private List<ContactMechType> contactMechTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "CONTACT_MECH_TYPE_ID")
    @ManyToOne
    private ContactMechType parentTypeId;*/

    public ContactMechType() {
    }

    public ContactMechType(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
    }

    public String getContactMechTypeId() {
        return contactMechTypeId;
    }

    public void setContactMechTypeId(String contactMechTypeId) {
        this.contactMechTypeId = contactMechTypeId;
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
/*
    public List<ContactMech> getContactMechList() {
        return contactMechList;
    }

    public void setContactMechList(List<ContactMech> contactMechList) {
        this.contactMechList = contactMechList;
    }

    public List<ContactMechType> getContactMechTypeList() {
        return contactMechTypeList;
    }

    public void setContactMechTypeList(List<ContactMechType> contactMechTypeList) {
        this.contactMechTypeList = contactMechTypeList;
    }

    public ContactMechType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ContactMechType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMechTypeId != null ? contactMechTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContactMechType)) {
            return false;
        }
        ContactMechType other = (ContactMechType) object;
        if ((this.contactMechTypeId == null && other.contactMechTypeId != null) || (this.contactMechTypeId != null && !this.contactMechTypeId.equals(other.contactMechTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContactMechType[ contactMechTypeId=" + contactMechTypeId + " ]";
    }
/*
    public List<ContactMechTypePurpose> getContactMechTypePurposeList() {
        return contactMechTypePurposeList;
    }

    public void setContactMechTypePurposeList(List<ContactMechTypePurpose> contactMechTypePurposeList) {
        this.contactMechTypePurposeList = contactMechTypePurposeList;
    }

    public List<ContactList> getContactListList() {
        return contactListList;
    }

    public void setContactListList(List<ContactList> contactListList) {
        this.contactListList = contactListList;
    }

    public List<CommunicationEvent> getCommunicationEventList() {
        return communicationEventList;
    }

    public void setCommunicationEventList(List<CommunicationEvent> communicationEventList) {
        this.communicationEventList = communicationEventList;
    }

    public List<ContactMechTypeAttr> getContactMechTypeAttrList() {
        return contactMechTypeAttrList;
    }

    public void setContactMechTypeAttrList(List<ContactMechTypeAttr> contactMechTypeAttrList) {
        this.contactMechTypeAttrList = contactMechTypeAttrList;
    }

    public List<ValidContactMechRole> getValidContactMechRoleList() {
        return validContactMechRoleList;
    }

    public void setValidContactMechRoleList(List<ValidContactMechRole> validContactMechRoleList) {
        this.validContactMechRoleList = validContactMechRoleList;
    }*/
    
}
