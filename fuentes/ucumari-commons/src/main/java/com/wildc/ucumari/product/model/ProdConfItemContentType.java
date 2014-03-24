/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.product.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "prod_conf_item_content_type")
@NamedQueries({
    @NamedQuery(name = "ProdConfItemContentType.findAll", query = "SELECT p FROM ProdConfItemContentType p")})
public class ProdConfItemContentType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONF_ITEM_CONTENT_TYPE_ID")
    private String confItemContentTypeId;
    @Column(name = "HAS_TABLE")
    private Character hasTable;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @OneToMany(mappedBy = "parentTypeId")
    private List<ProdConfItemContentType> prodConfItemContentTypeList;
    @JoinColumn(name = "PARENT_TYPE_ID", referencedColumnName = "CONF_ITEM_CONTENT_TYPE_ID")
    @ManyToOne
    private ProdConfItemContentType parentTypeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prodConfItemContentType")
    private List<ProdConfItemContent> prodConfItemContentList;

    public ProdConfItemContentType() {
    }

    public ProdConfItemContentType(String confItemContentTypeId) {
        this.confItemContentTypeId = confItemContentTypeId;
    }

    public String getConfItemContentTypeId() {
        return confItemContentTypeId;
    }

    public void setConfItemContentTypeId(String confItemContentTypeId) {
        this.confItemContentTypeId = confItemContentTypeId;
    }

    public Character getHasTable() {
        return hasTable;
    }

    public void setHasTable(Character hasTable) {
        this.hasTable = hasTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public List<ProdConfItemContentType> getProdConfItemContentTypeList() {
        return prodConfItemContentTypeList;
    }

    public void setProdConfItemContentTypeList(List<ProdConfItemContentType> prodConfItemContentTypeList) {
        this.prodConfItemContentTypeList = prodConfItemContentTypeList;
    }

    public ProdConfItemContentType getParentTypeId() {
        return parentTypeId;
    }

    public void setParentTypeId(ProdConfItemContentType parentTypeId) {
        this.parentTypeId = parentTypeId;
    }

    public List<ProdConfItemContent> getProdConfItemContentList() {
        return prodConfItemContentList;
    }

    public void setProdConfItemContentList(List<ProdConfItemContent> prodConfItemContentList) {
        this.prodConfItemContentList = prodConfItemContentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (confItemContentTypeId != null ? confItemContentTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdConfItemContentType)) {
            return false;
        }
        ProdConfItemContentType other = (ProdConfItemContentType) object;
        if ((this.confItemContentTypeId == null && other.confItemContentTypeId != null) || (this.confItemContentTypeId != null && !this.confItemContentTypeId.equals(other.confItemContentTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ProdConfItemContentType[ confItemContentTypeId=" + confItemContentTypeId + " ]";
    }
    
}
