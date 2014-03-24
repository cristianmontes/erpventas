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
@Table(name = "keyboard_shortcut_handler")
@NamedQueries({
    @NamedQuery(name = "KeyboardShortcutHandler.findAll", query = "SELECT k FROM KeyboardShortcutHandler k")})
public class KeyboardShortcutHandler implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ACTION_TYPE_ID")
    private String actionTypeId;
    @Column(name = "SHORTCUT_HANDLER")
    private String shortcutHandler;
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
    @OneToMany(mappedBy = "actionTypeId")
    private List<KeyboardShortcut> keyboardShortcutList;

    public KeyboardShortcutHandler() {
    }

    public KeyboardShortcutHandler(String actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    public String getActionTypeId() {
        return actionTypeId;
    }

    public void setActionTypeId(String actionTypeId) {
        this.actionTypeId = actionTypeId;
    }

    public String getShortcutHandler() {
        return shortcutHandler;
    }

    public void setShortcutHandler(String shortcutHandler) {
        this.shortcutHandler = shortcutHandler;
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

    public List<KeyboardShortcut> getKeyboardShortcutList() {
        return keyboardShortcutList;
    }

    public void setKeyboardShortcutList(List<KeyboardShortcut> keyboardShortcutList) {
        this.keyboardShortcutList = keyboardShortcutList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actionTypeId != null ? actionTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeyboardShortcutHandler)) {
            return false;
        }
        KeyboardShortcutHandler other = (KeyboardShortcutHandler) object;
        if ((this.actionTypeId == null && other.actionTypeId != null) || (this.actionTypeId != null && !this.actionTypeId.equals(other.actionTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.KeyboardShortcutHandler[ actionTypeId=" + actionTypeId + " ]";
    }
    
}
