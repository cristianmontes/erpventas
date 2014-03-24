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
public class WebslingerHostMappingPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "HOST_NAME")
    private String hostName;
    @Basic(optional = false)
    @Column(name = "CONTEXT_PATH")
    private String contextPath;

    public WebslingerHostMappingPK() {
    }

    public WebslingerHostMappingPK(String hostName, String contextPath) {
        this.hostName = hostName;
        this.contextPath = contextPath;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hostName != null ? hostName.hashCode() : 0);
        hash += (contextPath != null ? contextPath.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerHostMappingPK)) {
            return false;
        }
        WebslingerHostMappingPK other = (WebslingerHostMappingPK) object;
        if ((this.hostName == null && other.hostName != null) || (this.hostName != null && !this.hostName.equals(other.hostName))) {
            return false;
        }
        if ((this.contextPath == null && other.contextPath != null) || (this.contextPath != null && !this.contextPath.equals(other.contextPath))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerHostMappingPK[ hostName=" + hostName + ", contextPath=" + contextPath + " ]";
    }
    
}
