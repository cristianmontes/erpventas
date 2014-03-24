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
public class WebslingerServerBasePK implements Serializable {
    @Basic(optional = false)
    @Column(name = "WEBSLINGER_SERVER_ID")
    private String webslingerServerId;
    @Basic(optional = false)
    @Column(name = "BASE_NAME")
    private String baseName;

    public WebslingerServerBasePK() {
    }

    public WebslingerServerBasePK(String webslingerServerId, String baseName) {
        this.webslingerServerId = webslingerServerId;
        this.baseName = baseName;
    }

    public String getWebslingerServerId() {
        return webslingerServerId;
    }

    public void setWebslingerServerId(String webslingerServerId) {
        this.webslingerServerId = webslingerServerId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webslingerServerId != null ? webslingerServerId.hashCode() : 0);
        hash += (baseName != null ? baseName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebslingerServerBasePK)) {
            return false;
        }
        WebslingerServerBasePK other = (WebslingerServerBasePK) object;
        if ((this.webslingerServerId == null && other.webslingerServerId != null) || (this.webslingerServerId != null && !this.webslingerServerId.equals(other.webslingerServerId))) {
            return false;
        }
        if ((this.baseName == null && other.baseName != null) || (this.baseName != null && !this.baseName.equals(other.baseName))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.WebslingerServerBasePK[ webslingerServerId=" + webslingerServerId + ", baseName=" + baseName + " ]";
    }
    
}
