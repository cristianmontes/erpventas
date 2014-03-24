/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.security.model.UserLogin;
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
@Table(name = "content_assoc")
@NamedQueries({
    @NamedQuery(name = "ContentAssoc.findAll", query = "SELECT c FROM ContentAssoc c")})
public class ContentAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ContentAssocPK contentAssocPK;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
    @Column(name = "SEQUENCE_NUM")
    private BigInteger sequenceNum;
    @Column(name = "MAP_KEY")
    private String mapKey;
    @Column(name = "UPPER_COORDINATE")
    private BigInteger upperCoordinate;
    @Column(name = "LEFT_COORDINATE")
    private BigInteger leftCoordinate;
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;
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
    @JoinColumn(name = "CONTENT_ASSOC_TYPE_ID", referencedColumnName = "CONTENT_ASSOC_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ContentAssocType contentAssocType;
    @JoinColumn(name = "CONTENT_ID_TO", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content;
    @JoinColumn(name = "CONTENT_ASSOC_PREDICATE_ID", referencedColumnName = "CONTENT_ASSOC_PREDICATE_ID")
    @ManyToOne
    private ContentAssocPredicate contentAssocPredicateId;
    @JoinColumn(name = "LAST_MODIFIED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin lastModifiedByUserLogin;
    @JoinColumn(name = "CONTENT_ID", referencedColumnName = "CONTENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Content content1;
    @JoinColumn(name = "DATA_SOURCE_ID", referencedColumnName = "DATA_SOURCE_ID")
    @ManyToOne
    private DataSource dataSourceId;
    @JoinColumn(name = "CREATED_BY_USER_LOGIN", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin createdByUserLogin;

    public ContentAssoc() {
    }

    public ContentAssoc(ContentAssocPK contentAssocPK) {
        this.contentAssocPK = contentAssocPK;
    }

    public ContentAssoc(String contentId, String contentIdTo, String contentAssocTypeId, Date fromDate) {
        this.contentAssocPK = new ContentAssocPK(contentId, contentIdTo, contentAssocTypeId, fromDate);
    }

    public ContentAssocPK getContentAssocPK() {
        return contentAssocPK;
    }

    public void setContentAssocPK(ContentAssocPK contentAssocPK) {
        this.contentAssocPK = contentAssocPK;
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

    public String getMapKey() {
        return mapKey;
    }

    public void setMapKey(String mapKey) {
        this.mapKey = mapKey;
    }

    public BigInteger getUpperCoordinate() {
        return upperCoordinate;
    }

    public void setUpperCoordinate(BigInteger upperCoordinate) {
        this.upperCoordinate = upperCoordinate;
    }

    public BigInteger getLeftCoordinate() {
        return leftCoordinate;
    }

    public void setLeftCoordinate(BigInteger leftCoordinate) {
        this.leftCoordinate = leftCoordinate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
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

    public ContentAssocType getContentAssocType() {
        return contentAssocType;
    }

    public void setContentAssocType(ContentAssocType contentAssocType) {
        this.contentAssocType = contentAssocType;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public ContentAssocPredicate getContentAssocPredicateId() {
        return contentAssocPredicateId;
    }

    public void setContentAssocPredicateId(ContentAssocPredicate contentAssocPredicateId) {
        this.contentAssocPredicateId = contentAssocPredicateId;
    }

    public UserLogin getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(UserLogin lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public Content getContent1() {
        return content1;
    }

    public void setContent1(Content content1) {
        this.content1 = content1;
    }

    public DataSource getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(DataSource dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public UserLogin getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(UserLogin createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentAssocPK != null ? contentAssocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentAssoc)) {
            return false;
        }
        ContentAssoc other = (ContentAssoc) object;
        if ((this.contentAssocPK == null && other.contentAssocPK != null) || (this.contentAssocPK != null && !this.contentAssocPK.equals(other.contentAssocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentAssoc[ contentAssocPK=" + contentAssocPK + " ]";
    }
    
}
