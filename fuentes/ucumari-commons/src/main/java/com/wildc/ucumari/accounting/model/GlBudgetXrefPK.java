/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Embeddable
public class GlBudgetXrefPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "GL_ACCOUNT_ID")
    private String glAccountId;
    @Basic(optional = false)
    @Column(name = "BUDGET_ITEM_TYPE_ID")
    private String budgetItemTypeId;
    @Basic(optional = false)
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;

    public GlBudgetXrefPK() {
    }

    public GlBudgetXrefPK(String glAccountId, String budgetItemTypeId, Date fromDate) {
        this.glAccountId = glAccountId;
        this.budgetItemTypeId = budgetItemTypeId;
        this.fromDate = fromDate;
    }

    public String getGlAccountId() {
        return glAccountId;
    }

    public void setGlAccountId(String glAccountId) {
        this.glAccountId = glAccountId;
    }

    public String getBudgetItemTypeId() {
        return budgetItemTypeId;
    }

    public void setBudgetItemTypeId(String budgetItemTypeId) {
        this.budgetItemTypeId = budgetItemTypeId;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (glAccountId != null ? glAccountId.hashCode() : 0);
        hash += (budgetItemTypeId != null ? budgetItemTypeId.hashCode() : 0);
        hash += (fromDate != null ? fromDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GlBudgetXrefPK)) {
            return false;
        }
        GlBudgetXrefPK other = (GlBudgetXrefPK) object;
        if ((this.glAccountId == null && other.glAccountId != null) || (this.glAccountId != null && !this.glAccountId.equals(other.glAccountId))) {
            return false;
        }
        if ((this.budgetItemTypeId == null && other.budgetItemTypeId != null) || (this.budgetItemTypeId != null && !this.budgetItemTypeId.equals(other.budgetItemTypeId))) {
            return false;
        }
        if ((this.fromDate == null && other.fromDate != null) || (this.fromDate != null && !this.fromDate.equals(other.fromDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.GlBudgetXrefPK[ glAccountId=" + glAccountId + ", budgetItemTypeId=" + budgetItemTypeId + ", fromDate=" + fromDate + " ]";
    }
    
}
