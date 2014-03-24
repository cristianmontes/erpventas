/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Cristian
 */
@Embeddable
public class DataImpCommCustomersPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CUSTOMER_ID")
    private String customerId;
    @Basic(optional = false)
    @Column(name = "TO_CUSTOMER_ID")
    private String toCustomerId;

    public DataImpCommCustomersPK() {
    }

    public DataImpCommCustomersPK(String customerId, String toCustomerId) {
        this.customerId = customerId;
        this.toCustomerId = toCustomerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getToCustomerId() {
        return toCustomerId;
    }

    public void setToCustomerId(String toCustomerId) {
        this.toCustomerId = toCustomerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerId != null ? customerId.hashCode() : 0);
        hash += (toCustomerId != null ? toCustomerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImpCommCustomersPK)) {
            return false;
        }
        DataImpCommCustomersPK other = (DataImpCommCustomersPK) object;
        if ((this.customerId == null && other.customerId != null) || (this.customerId != null && !this.customerId.equals(other.customerId))) {
            return false;
        }
        if ((this.toCustomerId == null && other.toCustomerId != null) || (this.toCustomerId != null && !this.toCustomerId.equals(other.toCustomerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImpCommCustomersPK[ customerId=" + customerId + ", toCustomerId=" + toCustomerId + " ]";
    }
    
}
