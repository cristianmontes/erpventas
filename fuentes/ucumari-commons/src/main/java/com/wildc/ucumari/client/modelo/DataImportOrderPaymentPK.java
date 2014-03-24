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
public class DataImportOrderPaymentPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ORDER_PAYMENT_PREFERENCE_ID")
    private String orderPaymentPreferenceId;
    @Basic(optional = false)
    @Column(name = "ORDER_ID")
    private String orderId;

    public DataImportOrderPaymentPK() {
    }

    public DataImportOrderPaymentPK(String orderPaymentPreferenceId, String orderId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
        this.orderId = orderId;
    }

    public String getOrderPaymentPreferenceId() {
        return orderPaymentPreferenceId;
    }

    public void setOrderPaymentPreferenceId(String orderPaymentPreferenceId) {
        this.orderPaymentPreferenceId = orderPaymentPreferenceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderPaymentPreferenceId != null ? orderPaymentPreferenceId.hashCode() : 0);
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DataImportOrderPaymentPK)) {
            return false;
        }
        DataImportOrderPaymentPK other = (DataImportOrderPaymentPK) object;
        if ((this.orderPaymentPreferenceId == null && other.orderPaymentPreferenceId != null) || (this.orderPaymentPreferenceId != null && !this.orderPaymentPreferenceId.equals(other.orderPaymentPreferenceId))) {
            return false;
        }
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.DataImportOrderPaymentPK[ orderPaymentPreferenceId=" + orderPaymentPreferenceId + ", orderId=" + orderId + " ]";
    }
    
}
