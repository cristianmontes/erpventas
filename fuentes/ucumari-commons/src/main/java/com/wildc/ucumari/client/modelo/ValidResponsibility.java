/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "valid_responsibility")
@NamedQueries({
    @NamedQuery(name = "ValidResponsibility.findAll", query = "SELECT v FROM ValidResponsibility v")})
public class ValidResponsibility implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ValidResponsibilityPK validResponsibilityPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "COMMENTS")
    private String comments;
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
    @JoinColumn(name = "RESPONSIBILITY_TYPE_ID", referencedColumnName = "RESPONSIBILITY_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ResponsibilityType responsibilityType;
    @JoinColumn(name = "EMPL_POSITION_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionType emplPositionType;

    public ValidResponsibility() {
    }

    public ValidResponsibility(ValidResponsibilityPK validResponsibilityPK) {
        this.validResponsibilityPK = validResponsibilityPK;
    }

    public ValidResponsibility(String emplPositionTypeId, String responsibilityTypeId, Date fromDate) {
        this.validResponsibilityPK = new ValidResponsibilityPK(emplPositionTypeId, responsibilityTypeId, fromDate);
    }

    public ValidResponsibilityPK getValidResponsibilityPK() {
        return validResponsibilityPK;
    }

    public void setValidResponsibilityPK(ValidResponsibilityPK validResponsibilityPK) {
        this.validResponsibilityPK = validResponsibilityPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    public ResponsibilityType getResponsibilityType() {
        return responsibilityType;
    }

    public void setResponsibilityType(ResponsibilityType responsibilityType) {
        this.responsibilityType = responsibilityType;
    }

    public EmplPositionType getEmplPositionType() {
        return emplPositionType;
    }

    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (validResponsibilityPK != null ? validResponsibilityPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ValidResponsibility)) {
            return false;
        }
        ValidResponsibility other = (ValidResponsibility) object;
        if ((this.validResponsibilityPK == null && other.validResponsibilityPK != null) || (this.validResponsibilityPK != null && !this.validResponsibilityPK.equals(other.validResponsibilityPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ValidResponsibility[ validResponsibilityPK=" + validResponsibilityPK + " ]";
    }
    
}
