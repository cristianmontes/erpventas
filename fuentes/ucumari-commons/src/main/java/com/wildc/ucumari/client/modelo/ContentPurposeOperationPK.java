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
public class ContentPurposeOperationPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CONTENT_PURPOSE_TYPE_ID")
    private String contentPurposeTypeId;
    @Basic(optional = false)
    @Column(name = "CONTENT_OPERATION_ID")
    private String contentOperationId;
    @Basic(optional = false)
    @Column(name = "ROLE_TYPE_ID")
    private String roleTypeId;
    @Basic(optional = false)
    @Column(name = "STATUS_ID")
    private String statusId;
    @Basic(optional = false)
    @Column(name = "PRIVILEGE_ENUM_ID")
    private String privilegeEnumId;

    public ContentPurposeOperationPK() {
    }

    public ContentPurposeOperationPK(String contentPurposeTypeId, String contentOperationId, String roleTypeId, String statusId, String privilegeEnumId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
        this.contentOperationId = contentOperationId;
        this.roleTypeId = roleTypeId;
        this.statusId = statusId;
        this.privilegeEnumId = privilegeEnumId;
    }

    public String getContentPurposeTypeId() {
        return contentPurposeTypeId;
    }

    public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }

    public String getContentOperationId() {
        return contentOperationId;
    }

    public void setContentOperationId(String contentOperationId) {
        this.contentOperationId = contentOperationId;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getPrivilegeEnumId() {
        return privilegeEnumId;
    }

    public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contentPurposeTypeId != null ? contentPurposeTypeId.hashCode() : 0);
        hash += (contentOperationId != null ? contentOperationId.hashCode() : 0);
        hash += (roleTypeId != null ? roleTypeId.hashCode() : 0);
        hash += (statusId != null ? statusId.hashCode() : 0);
        hash += (privilegeEnumId != null ? privilegeEnumId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContentPurposeOperationPK)) {
            return false;
        }
        ContentPurposeOperationPK other = (ContentPurposeOperationPK) object;
        if ((this.contentPurposeTypeId == null && other.contentPurposeTypeId != null) || (this.contentPurposeTypeId != null && !this.contentPurposeTypeId.equals(other.contentPurposeTypeId))) {
            return false;
        }
        if ((this.contentOperationId == null && other.contentOperationId != null) || (this.contentOperationId != null && !this.contentOperationId.equals(other.contentOperationId))) {
            return false;
        }
        if ((this.roleTypeId == null && other.roleTypeId != null) || (this.roleTypeId != null && !this.roleTypeId.equals(other.roleTypeId))) {
            return false;
        }
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        if ((this.privilegeEnumId == null && other.privilegeEnumId != null) || (this.privilegeEnumId != null && !this.privilegeEnumId.equals(other.privilegeEnumId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.ContentPurposeOperationPK[ contentPurposeTypeId=" + contentPurposeTypeId + ", contentOperationId=" + contentOperationId + ", roleTypeId=" + roleTypeId + ", statusId=" + statusId + ", privilegeEnumId=" + privilegeEnumId + " ]";
    }
    
}
