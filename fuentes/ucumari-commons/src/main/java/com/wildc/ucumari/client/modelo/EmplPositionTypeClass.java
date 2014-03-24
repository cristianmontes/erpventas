/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "empl_position_type_class")
@NamedQueries({
    @NamedQuery(name = "EmplPositionTypeClass.findAll", query = "SELECT e FROM EmplPositionTypeClass e")})
public class EmplPositionTypeClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EmplPositionTypeClassPK emplPositionTypeClassPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "STANDARD_HOURS_PER_WEEK")
    private BigDecimal standardHoursPerWeek;
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
    @JoinColumn(name = "EMPL_POSITION_TYPE_ID", referencedColumnName = "EMPL_POSITION_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionType emplPositionType;
    @JoinColumn(name = "EMPL_POSITION_CLASS_TYPE_ID", referencedColumnName = "EMPL_POSITION_CLASS_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EmplPositionClassType emplPositionClassType;

    public EmplPositionTypeClass() {
    }

    public EmplPositionTypeClass(EmplPositionTypeClassPK emplPositionTypeClassPK) {
        this.emplPositionTypeClassPK = emplPositionTypeClassPK;
    }

    public EmplPositionTypeClass(String emplPositionTypeId, String emplPositionClassTypeId, Date fromDate) {
        this.emplPositionTypeClassPK = new EmplPositionTypeClassPK(emplPositionTypeId, emplPositionClassTypeId, fromDate);
    }

    public EmplPositionTypeClassPK getEmplPositionTypeClassPK() {
        return emplPositionTypeClassPK;
    }

    public void setEmplPositionTypeClassPK(EmplPositionTypeClassPK emplPositionTypeClassPK) {
        this.emplPositionTypeClassPK = emplPositionTypeClassPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigDecimal getStandardHoursPerWeek() {
        return standardHoursPerWeek;
    }

    public void setStandardHoursPerWeek(BigDecimal standardHoursPerWeek) {
        this.standardHoursPerWeek = standardHoursPerWeek;
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

    public EmplPositionType getEmplPositionType() {
        return emplPositionType;
    }

    public void setEmplPositionType(EmplPositionType emplPositionType) {
        this.emplPositionType = emplPositionType;
    }

    public EmplPositionClassType getEmplPositionClassType() {
        return emplPositionClassType;
    }

    public void setEmplPositionClassType(EmplPositionClassType emplPositionClassType) {
        this.emplPositionClassType = emplPositionClassType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emplPositionTypeClassPK != null ? emplPositionTypeClassPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmplPositionTypeClass)) {
            return false;
        }
        EmplPositionTypeClass other = (EmplPositionTypeClass) object;
        if ((this.emplPositionTypeClassPK == null && other.emplPositionTypeClassPK != null) || (this.emplPositionTypeClassPK != null && !this.emplPositionTypeClassPK.equals(other.emplPositionTypeClassPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmplPositionTypeClass[ emplPositionTypeClassPK=" + emplPositionTypeClassPK + " ]";
    }
    
}
