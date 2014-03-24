/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "comm_content_assoc_type")
@NamedQueries({
    @NamedQuery(name = "CommContentAssocType.findAll", query = "SELECT c FROM CommContentAssocType c")})
public class CommContentAssocType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMM_CONTENT_ASSOC_TYPE_ID")
    private String commContentAssocTypeId;
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
    @OneToMany(mappedBy = "commContentAssocTypeId")
    private List<CommEventContentAssoc> commEventContentAssocList;

    public CommContentAssocType() {
    }

    public CommContentAssocType(String commContentAssocTypeId) {
        this.commContentAssocTypeId = commContentAssocTypeId;
    }

    public String getCommContentAssocTypeId() {
        return commContentAssocTypeId;
    }

    public void setCommContentAssocTypeId(String commContentAssocTypeId) {
        this.commContentAssocTypeId = commContentAssocTypeId;
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

    public List<CommEventContentAssoc> getCommEventContentAssocList() {
        return commEventContentAssocList;
    }

    public void setCommEventContentAssocList(List<CommEventContentAssoc> commEventContentAssocList) {
        this.commEventContentAssocList = commEventContentAssocList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commContentAssocTypeId != null ? commContentAssocTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommContentAssocType)) {
            return false;
        }
        CommContentAssocType other = (CommContentAssocType) object;
        if ((this.commContentAssocTypeId == null && other.commContentAssocTypeId != null) || (this.commContentAssocTypeId != null && !this.commContentAssocTypeId.equals(other.commContentAssocTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommContentAssocType[ commContentAssocTypeId=" + commContentAssocTypeId + " ]";
    }
    
}
