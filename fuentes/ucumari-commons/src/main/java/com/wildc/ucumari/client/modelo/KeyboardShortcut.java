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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "keyboard_shortcut")
@NamedQueries({
    @NamedQuery(name = "KeyboardShortcut.findAll", query = "SELECT k FROM KeyboardShortcut k")})
public class KeyboardShortcut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SHORTCUT_ID")
    private String shortcutId;
    @Column(name = "APPLICATION_NAME")
    private String applicationName;
    @Column(name = "SCREEN_NAME")
    private String screenName;
    @Column(name = "SHORTCUT")
    private String shortcut;
    @Column(name = "ACTION_TARGET")
    private String actionTarget;
    @Column(name = "DESCRIPTION")
    private String description;
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
    @JoinColumn(name = "USER_LOGIN_ID", referencedColumnName = "USER_LOGIN_ID")
    @ManyToOne
    private UserLogin userLoginId;
    @JoinColumn(name = "ACTION_TYPE_ID", referencedColumnName = "ACTION_TYPE_ID")
    @ManyToOne
    private KeyboardShortcutHandler actionTypeId;

    public KeyboardShortcut() {
    }

    public KeyboardShortcut(String shortcutId) {
        this.shortcutId = shortcutId;
    }

    public String getShortcutId() {
        return shortcutId;
    }

    public void setShortcutId(String shortcutId) {
        this.shortcutId = shortcutId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getShortcut() {
        return shortcut;
    }

    public void setShortcut(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getActionTarget() {
        return actionTarget;
    }

    public void setActionTarget(String actionTarget) {
        this.actionTarget = actionTarget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public UserLogin getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(UserLogin userLoginId) {
        this.userLoginId = userLoginId;
    }

    public KeyboardShortcutHandler getActionTypeId() {
        return actionTypeId;
    }

    public void setActionTypeId(KeyboardShortcutHandler actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shortcutId != null ? shortcutId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeyboardShortcut)) {
            return false;
        }
        KeyboardShortcut other = (KeyboardShortcut) object;
        if ((this.shortcutId == null && other.shortcutId != null) || (this.shortcutId != null && !this.shortcutId.equals(other.shortcutId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.KeyboardShortcut[ shortcutId=" + shortcutId + " ]";
    }
    
}
