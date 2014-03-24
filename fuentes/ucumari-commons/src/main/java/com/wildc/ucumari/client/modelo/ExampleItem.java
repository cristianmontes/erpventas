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

import com.wildc.ucumari.parameters.model.Uom;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "example_item")
@NamedQueries({
    @NamedQuery(name = "ExampleItem.findAll", query = "SELECT e FROM ExampleItem e")})
public class ExampleItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExampleItemPK exampleItemPK;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "AMOUNT")
    private BigDecimal amount;
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
    @JoinColumn(name = "AMOUNT_UOM_ID", referencedColumnName = "UOM_ID")
    @ManyToOne
    private Uom amountUomId;
    @JoinColumn(name = "EXAMPLE_ID", referencedColumnName = "EXAMPLE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Example example;

    public ExampleItem() {
    }

    public ExampleItem(ExampleItemPK exampleItemPK) {
        this.exampleItemPK = exampleItemPK;
    }

    public ExampleItem(String exampleId, String exampleItemSeqId) {
        this.exampleItemPK = new ExampleItemPK(exampleId, exampleItemSeqId);
    }

    public ExampleItemPK getExampleItemPK() {
        return exampleItemPK;
    }

    public void setExampleItemPK(ExampleItemPK exampleItemPK) {
        this.exampleItemPK = exampleItemPK;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public Uom getAmountUomId() {
        return amountUomId;
    }

    public void setAmountUomId(Uom amountUomId) {
        this.amountUomId = amountUomId;
    }

    public Example getExample() {
        return example;
    }

    public void setExample(Example example) {
        this.example = example;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exampleItemPK != null ? exampleItemPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExampleItem)) {
            return false;
        }
        ExampleItem other = (ExampleItem) object;
        if ((this.exampleItemPK == null && other.exampleItemPK != null) || (this.exampleItemPK != null && !this.exampleItemPK.equals(other.exampleItemPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ExampleItem[ exampleItemPK=" + exampleItemPK + " ]";
    }
    
}
