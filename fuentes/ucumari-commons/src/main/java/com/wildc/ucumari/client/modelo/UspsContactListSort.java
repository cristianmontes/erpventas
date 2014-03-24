/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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

import com.wildc.ucumari.contact.model.PostalAddress;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "usps_contact_list_sort")
@NamedQueries({
    @NamedQuery(name = "UspsContactListSort.findAll", query = "SELECT u FROM UspsContactListSort u")})
public class UspsContactListSort implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USPS_CONTACT_LIST_SORT_ID")
    private String uspsContactListSortId;
    @Column(name = "CONTACT_LIST_ID")
    private String contactListId;
    @Column(name = "ZIP5")
    private String zip5;
    @Column(name = "ZIP3")
    private String zip3;
    @Column(name = "BMC_CODE")
    private String bmcCode;
    @Column(name = "SORT_RESULT")
    private String sortResult;
    @Column(name = "PROCESSED_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date processedTimestamp;
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
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private PostalAddress contactMechId;

    public UspsContactListSort() {
    }

    public UspsContactListSort(String uspsContactListSortId) {
        this.uspsContactListSortId = uspsContactListSortId;
    }

    public String getUspsContactListSortId() {
        return uspsContactListSortId;
    }

    public void setUspsContactListSortId(String uspsContactListSortId) {
        this.uspsContactListSortId = uspsContactListSortId;
    }

    public String getContactListId() {
        return contactListId;
    }

    public void setContactListId(String contactListId) {
        this.contactListId = contactListId;
    }

    public String getZip5() {
        return zip5;
    }

    public void setZip5(String zip5) {
        this.zip5 = zip5;
    }

    public String getZip3() {
        return zip3;
    }

    public void setZip3(String zip3) {
        this.zip3 = zip3;
    }

    public String getBmcCode() {
        return bmcCode;
    }

    public void setBmcCode(String bmcCode) {
        this.bmcCode = bmcCode;
    }

    public String getSortResult() {
        return sortResult;
    }

    public void setSortResult(String sortResult) {
        this.sortResult = sortResult;
    }

    public Date getProcessedTimestamp() {
        return processedTimestamp;
    }

    public void setProcessedTimestamp(Date processedTimestamp) {
        this.processedTimestamp = processedTimestamp;
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

    public PostalAddress getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(PostalAddress contactMechId) {
        this.contactMechId = contactMechId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uspsContactListSortId != null ? uspsContactListSortId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UspsContactListSort)) {
            return false;
        }
        UspsContactListSort other = (UspsContactListSort) object;
        if ((this.uspsContactListSortId == null && other.uspsContactListSortId != null) || (this.uspsContactListSortId != null && !this.uspsContactListSortId.equals(other.uspsContactListSortId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.UspsContactListSort[ uspsContactListSortId=" + uspsContactListSortId + " ]";
    }
    
}
