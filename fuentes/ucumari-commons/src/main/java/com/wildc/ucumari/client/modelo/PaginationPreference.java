/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "pagination_preference")
@NamedQueries({
    @NamedQuery(name = "PaginationPreference.findAll", query = "SELECT p FROM PaginationPreference p")})
public class PaginationPreference implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaginationPreferencePK paginationPreferencePK;
    @Column(name = "VIEW_SIZE")
    private BigInteger viewSize;
    @Column(name = "CURSOR_INDEX")
    private BigInteger cursorIndex;
    @Column(name = "ORDER_BY")
    private String orderBy;
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

    public PaginationPreference() {
    }

    public PaginationPreference(PaginationPreferencePK paginationPreferencePK) {
        this.paginationPreferencePK = paginationPreferencePK;
    }

    public PaginationPreference(String userLoginId, String paginatorName) {
        this.paginationPreferencePK = new PaginationPreferencePK(userLoginId, paginatorName);
    }

    public PaginationPreferencePK getPaginationPreferencePK() {
        return paginationPreferencePK;
    }

    public void setPaginationPreferencePK(PaginationPreferencePK paginationPreferencePK) {
        this.paginationPreferencePK = paginationPreferencePK;
    }

    public BigInteger getViewSize() {
        return viewSize;
    }

    public void setViewSize(BigInteger viewSize) {
        this.viewSize = viewSize;
    }

    public BigInteger getCursorIndex() {
        return cursorIndex;
    }

    public void setCursorIndex(BigInteger cursorIndex) {
        this.cursorIndex = cursorIndex;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
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
        hash += (paginationPreferencePK != null ? paginationPreferencePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaginationPreference)) {
            return false;
        }
        PaginationPreference other = (PaginationPreference) object;
        if ((this.paginationPreferencePK == null && other.paginationPreferencePK != null) || (this.paginationPreferencePK != null && !this.paginationPreferencePK.equals(other.paginationPreferencePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.PaginationPreference[ paginationPreferencePK=" + paginationPreferencePK + " ]";
    }
    
}
