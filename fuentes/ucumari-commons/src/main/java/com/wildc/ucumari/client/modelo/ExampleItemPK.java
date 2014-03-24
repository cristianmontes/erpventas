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
public class ExampleItemPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "EXAMPLE_ID")
    private String exampleId;
    @Basic(optional = false)
    @Column(name = "EXAMPLE_ITEM_SEQ_ID")
    private String exampleItemSeqId;

    public ExampleItemPK() {
    }

    public ExampleItemPK(String exampleId, String exampleItemSeqId) {
        this.exampleId = exampleId;
        this.exampleItemSeqId = exampleItemSeqId;
    }

    public String getExampleId() {
        return exampleId;
    }

    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }

    public String getExampleItemSeqId() {
        return exampleItemSeqId;
    }

    public void setExampleItemSeqId(String exampleItemSeqId) {
        this.exampleItemSeqId = exampleItemSeqId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleId != null ? exampleId.hashCode() : 0);
        hash += (exampleItemSeqId != null ? exampleItemSeqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleItemPK)) {
            return false;
        }
        ExampleItemPK other = (ExampleItemPK) object;
        if ((this.exampleId == null && other.exampleId != null) || (this.exampleId != null && !this.exampleId.equals(other.exampleId))) {
            return false;
        }
        if ((this.exampleItemSeqId == null && other.exampleItemSeqId != null) || (this.exampleItemSeqId != null && !this.exampleItemSeqId.equals(other.exampleItemSeqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleItemPK[ exampleId=" + exampleId + ", exampleItemSeqId=" + exampleItemSeqId + " ]";
    }
    
}
