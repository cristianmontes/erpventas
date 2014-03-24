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
@Table(name = "employment_app")
@NamedQueries({
    @NamedQuery(name = "EmploymentApp.findAll", query = "SELECT e FROM EmploymentApp e")})
public class EmploymentApp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPLICATION_ID")
    private String applicationId;
    @Column(name = "EMPL_POSITION_ID")
    private String emplPositionId;
    @Column(name = "STATUS_ID")
    private String statusId;
    @Column(name = "EMPLOYMENT_APP_SOURCE_TYPE_ID")
    private String employmentAppSourceTypeId;
    @Column(name = "APPLYING_PARTY_ID")
    private String applyingPartyId;
    @Column(name = "REFERRED_BY_PARTY_ID")
    private String referredByPartyId;
    @Column(name = "APPLICATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date applicationDate;
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

    public EmploymentApp() {
    }

    public EmploymentApp(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getEmplPositionId() {
        return emplPositionId;
    }

    public void setEmplPositionId(String emplPositionId) {
        this.emplPositionId = emplPositionId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getEmploymentAppSourceTypeId() {
        return employmentAppSourceTypeId;
    }

    public void setEmploymentAppSourceTypeId(String employmentAppSourceTypeId) {
        this.employmentAppSourceTypeId = employmentAppSourceTypeId;
    }

    public String getApplyingPartyId() {
        return applyingPartyId;
    }

    public void setApplyingPartyId(String applyingPartyId) {
        this.applyingPartyId = applyingPartyId;
    }

    public String getReferredByPartyId() {
        return referredByPartyId;
    }

    public void setReferredByPartyId(String referredByPartyId) {
        this.referredByPartyId = referredByPartyId;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicationId != null ? applicationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmploymentApp)) {
            return false;
        }
        EmploymentApp other = (EmploymentApp) object;
        if ((this.applicationId == null && other.applicationId != null) || (this.applicationId != null && !this.applicationId.equals(other.applicationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmploymentApp[ applicationId=" + applicationId + " ]";
    }
    
}
