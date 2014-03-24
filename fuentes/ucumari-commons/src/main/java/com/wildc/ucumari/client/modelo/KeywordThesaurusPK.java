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
public class KeywordThesaurusPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ENTERED_KEYWORD")
    private String enteredKeyword;
    @Basic(optional = false)
    @Column(name = "ALTERNATE_KEYWORD")
    private String alternateKeyword;

    public KeywordThesaurusPK() {
    }

    public KeywordThesaurusPK(String enteredKeyword, String alternateKeyword) {
        this.enteredKeyword = enteredKeyword;
        this.alternateKeyword = alternateKeyword;
    }

    public String getEnteredKeyword() {
        return enteredKeyword;
    }

    public void setEnteredKeyword(String enteredKeyword) {
        this.enteredKeyword = enteredKeyword;
    }

    public String getAlternateKeyword() {
        return alternateKeyword;
    }

    public void setAlternateKeyword(String alternateKeyword) {
        this.alternateKeyword = alternateKeyword;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enteredKeyword != null ? enteredKeyword.hashCode() : 0);
        hash += (alternateKeyword != null ? alternateKeyword.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KeywordThesaurusPK)) {
            return false;
        }
        KeywordThesaurusPK other = (KeywordThesaurusPK) object;
        if ((this.enteredKeyword == null && other.enteredKeyword != null) || (this.enteredKeyword != null && !this.enteredKeyword.equals(other.enteredKeyword))) {
            return false;
        }
        if ((this.alternateKeyword == null && other.alternateKeyword != null) || (this.alternateKeyword != null && !this.alternateKeyword.equals(other.alternateKeyword))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.KeywordThesaurusPK[ enteredKeyword=" + enteredKeyword + ", alternateKeyword=" + alternateKeyword + " ]";
    }
    
}
