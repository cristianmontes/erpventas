/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
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
@Table(name = "email_template_setting")
@NamedQueries({
    @NamedQuery(name = "EmailTemplateSetting.findAll", query = "SELECT e FROM EmailTemplateSetting e")})
public class EmailTemplateSetting implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "EMAIL_TEMPLATE_SETTING_ID")
    private String emailTemplateSettingId;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "BODY_SCREEN_LOCATION")
    private String bodyScreenLocation;
    @Column(name = "XSLFO_ATTACH_SCREEN_LOCATION")
    private String xslfoAttachScreenLocation;
    @Column(name = "FROM_ADDRESS")
    private String fromAddress;
    @Column(name = "CC_ADDRESS")
    private String ccAddress;
    @Column(name = "BCC_ADDRESS")
    private String bccAddress;
    @Column(name = "SUBJECT")
    private String subject;
    @Column(name = "CONTENT_TYPE")
    private String contentType;
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

    public EmailTemplateSetting() {
    }

    public EmailTemplateSetting(String emailTemplateSettingId) {
        this.emailTemplateSettingId = emailTemplateSettingId;
    }

    public String getEmailTemplateSettingId() {
        return emailTemplateSettingId;
    }

    public void setEmailTemplateSettingId(String emailTemplateSettingId) {
        this.emailTemplateSettingId = emailTemplateSettingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBodyScreenLocation() {
        return bodyScreenLocation;
    }

    public void setBodyScreenLocation(String bodyScreenLocation) {
        this.bodyScreenLocation = bodyScreenLocation;
    }

    public String getXslfoAttachScreenLocation() {
        return xslfoAttachScreenLocation;
    }

    public void setXslfoAttachScreenLocation(String xslfoAttachScreenLocation) {
        this.xslfoAttachScreenLocation = xslfoAttachScreenLocation;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getCcAddress() {
        return ccAddress;
    }

    public void setCcAddress(String ccAddress) {
        this.ccAddress = ccAddress;
    }

    public String getBccAddress() {
        return bccAddress;
    }

    public void setBccAddress(String bccAddress) {
        this.bccAddress = bccAddress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
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
        hash += (emailTemplateSettingId != null ? emailTemplateSettingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmailTemplateSetting)) {
            return false;
        }
        EmailTemplateSetting other = (EmailTemplateSetting) object;
        if ((this.emailTemplateSettingId == null && other.emailTemplateSettingId != null) || (this.emailTemplateSettingId != null && !this.emailTemplateSettingId.equals(other.emailTemplateSettingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.EmailTemplateSetting[ emailTemplateSettingId=" + emailTemplateSettingId + " ]";
    }
    
}
