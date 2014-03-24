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
@Table(name = "comm_event_content_assoc")
@NamedQueries({
    @NamedQuery(name = "CommEventContentAssoc.findAll", query = "SELECT c FROM CommEventContentAssoc c")})
public class CommEventContentAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CommEventContentAssocPK commEventContentAssocPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
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
    @JoinColumn(name = "COMM_CONTENT_ASSOC_TYPE_ID", referencedColumnName = "COMM_CONTENT_ASSOC_TYPE_ID")
    @ManyToOne
    private CommContentAssocType commContentAssocTypeId;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;
    @JoinColumn(name = "COMMUNICATION_EVENT_ID", referencedColumnName = "COMMUNICATION_EVENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CommunicationEvent communicationEvent;

    public CommEventContentAssoc() {
    }

    public CommEventContentAssoc(CommEventContentAssocPK commEventContentAssocPK) {
        this.commEventContentAssocPK = commEventContentAssocPK;
    }

    public CommEventContentAssoc(String contentId, String communicationEventId, Date fromDate) {
        this.commEventContentAssocPK = new CommEventContentAssocPK(contentId, communicationEventId, fromDate);
    }

    public CommEventContentAssocPK getCommEventContentAssocPK() {
        return commEventContentAssocPK;
    }

    public void setCommEventContentAssocPK(CommEventContentAssocPK commEventContentAssocPK) {
        this.commEventContentAssocPK = commEventContentAssocPK;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
    }

    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(BigInteger sequenceNum) {
        this.sequenceNum = sequenceNum;
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

    public CommContentAssocType getCommContentAssocTypeId() {
        return commContentAssocTypeId;
    }

    public void setCommContentAssocTypeId(CommContentAssocType commContentAssocTypeId) {
        this.commContentAssocTypeId = commContentAssocTypeId;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public CommunicationEvent getCommunicationEvent() {
        return communicationEvent;
    }

    public void setCommunicationEvent(CommunicationEvent communicationEvent) {
        this.communicationEvent = communicationEvent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commEventContentAssocPK != null ? commEventContentAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommEventContentAssoc)) {
            return false;
        }
        CommEventContentAssoc other = (CommEventContentAssoc) object;
        if ((this.commEventContentAssocPK == null && other.commEventContentAssocPK != null) || (this.commEventContentAssocPK != null && !this.commEventContentAssocPK.equals(other.commEventContentAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.CommEventContentAssoc[ commEventContentAssocPK=" + commEventContentAssocPK + " ]";
    }
    
}
