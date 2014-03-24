/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "address_label_specification")
@NamedQueries({
    @NamedQuery(name = "AddressLabelSpecification.findAll", query = "SELECT a FROM AddressLabelSpecification a")})
public class AddressLabelSpecification implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADDRESS_LABEL_ID")
    private String addressLabelId;
    @Column(name = "DESCRIPTION")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOP_MARGIN")
    private BigDecimal topMargin;
    @Column(name = "BOTTOM_MARGIN")
    private BigDecimal bottomMargin;
    @Column(name = "LEFT_MARGIN")
    private BigDecimal leftMargin;
    @Column(name = "RIGHT_MARGIN")
    private BigDecimal rightMargin;
    @Column(name = "PAGE_COLUMNS")
    private BigDecimal pageColumns;
    @Column(name = "PAGE_ROWS")
    private BigDecimal pageRows;
    @Column(name = "LABEL_HEIGHT")
    private BigDecimal labelHeight;
    @Column(name = "LABEL_WIDTH")
    private BigDecimal labelWidth;
    @Column(name = "HEIGHT_BTW_LABEL")
    private BigDecimal heightBtwLabel;
    @Column(name = "WIDTH_BTW_LABEL")
    private BigDecimal widthBtwLabel;
    @Column(name = "PAGE_WIDTH")
    private BigDecimal pageWidth;
    @Column(name = "PAGE_HEIGHT")
    private BigDecimal pageHeight;
    @Column(name = "CONTINUOUS_FEED")
    private Character continuousFeed;
    @Column(name = "UOM_ID")
    private String uomId;
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

    public AddressLabelSpecification() {
    }

    public AddressLabelSpecification(String addressLabelId) {
        this.addressLabelId = addressLabelId;
    }

    public String getAddressLabelId() {
        return addressLabelId;
    }

    public void setAddressLabelId(String addressLabelId) {
        this.addressLabelId = addressLabelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTopMargin() {
        return topMargin;
    }

    public void setTopMargin(BigDecimal topMargin) {
        this.topMargin = topMargin;
    }

    public BigDecimal getBottomMargin() {
        return bottomMargin;
    }

    public void setBottomMargin(BigDecimal bottomMargin) {
        this.bottomMargin = bottomMargin;
    }

    public BigDecimal getLeftMargin() {
        return leftMargin;
    }

    public void setLeftMargin(BigDecimal leftMargin) {
        this.leftMargin = leftMargin;
    }

    public BigDecimal getRightMargin() {
        return rightMargin;
    }

    public void setRightMargin(BigDecimal rightMargin) {
        this.rightMargin = rightMargin;
    }

    public BigDecimal getPageColumns() {
        return pageColumns;
    }

    public void setPageColumns(BigDecimal pageColumns) {
        this.pageColumns = pageColumns;
    }

    public BigDecimal getPageRows() {
        return pageRows;
    }

    public void setPageRows(BigDecimal pageRows) {
        this.pageRows = pageRows;
    }

    public BigDecimal getLabelHeight() {
        return labelHeight;
    }

    public void setLabelHeight(BigDecimal labelHeight) {
        this.labelHeight = labelHeight;
    }

    public BigDecimal getLabelWidth() {
        return labelWidth;
    }

    public void setLabelWidth(BigDecimal labelWidth) {
        this.labelWidth = labelWidth;
    }

    public BigDecimal getHeightBtwLabel() {
        return heightBtwLabel;
    }

    public void setHeightBtwLabel(BigDecimal heightBtwLabel) {
        this.heightBtwLabel = heightBtwLabel;
    }

    public BigDecimal getWidthBtwLabel() {
        return widthBtwLabel;
    }

    public void setWidthBtwLabel(BigDecimal widthBtwLabel) {
        this.widthBtwLabel = widthBtwLabel;
    }

    public BigDecimal getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(BigDecimal pageWidth) {
        this.pageWidth = pageWidth;
    }

    public BigDecimal getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(BigDecimal pageHeight) {
        this.pageHeight = pageHeight;
    }

    public Character getContinuousFeed() {
        return continuousFeed;
    }

    public void setContinuousFeed(Character continuousFeed) {
        this.continuousFeed = continuousFeed;
    }

    public String getUomId() {
        return uomId;
    }

    public void setUomId(String uomId) {
        this.uomId = uomId;
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
        hash += (addressLabelId != null ? addressLabelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AddressLabelSpecification)) {
            return false;
        }
        AddressLabelSpecification other = (AddressLabelSpecification) object;
        if ((this.addressLabelId == null && other.addressLabelId != null) || (this.addressLabelId != null && !this.addressLabelId.equals(other.addressLabelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AddressLabelSpecification[ addressLabelId=" + addressLabelId + " ]";
    }
    
}
