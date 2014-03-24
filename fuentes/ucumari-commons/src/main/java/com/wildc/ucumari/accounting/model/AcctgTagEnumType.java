/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.accounting.model;

import com.wildc.ucumari.parameters.model.Enumeration;
import com.wildc.ucumari.parameters.model.EnumerationType;
import com.wildc.ucumari.party.model.Party;
import java.io.Serializable;
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
@Table(name = "acctg_tag_enum_type")
@NamedQueries({
    @NamedQuery(name = "AcctgTagEnumType.findAll", query = "SELECT a FROM AcctgTagEnumType a")})
public class AcctgTagEnumType implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctgTagEnumTypePK acctgTagEnumTypePK;
    @Column(name = "IS_TAG_ENUM1_REQUIRED")
    private Character isTagEnum1Required;
    @Column(name = "IS_TAG_ENUM2_REQUIRED")
    private Character isTagEnum2Required;
    @Column(name = "IS_TAG_ENUM3_REQUIRED")
    private Character isTagEnum3Required;
    @Column(name = "IS_TAG_ENUM4_REQUIRED")
    private Character isTagEnum4Required;
    @Column(name = "IS_TAG_ENUM5_REQUIRED")
    private Character isTagEnum5Required;
    @Column(name = "IS_TAG_ENUM6_REQUIRED")
    private Character isTagEnum6Required;
    @Column(name = "IS_TAG_ENUM7_REQUIRED")
    private Character isTagEnum7Required;
    @Column(name = "IS_TAG_ENUM8_REQUIRED")
    private Character isTagEnum8Required;
    @Column(name = "IS_TAG_ENUM9_REQUIRED")
    private Character isTagEnum9Required;
    @Column(name = "IS_TAG_ENUM10_REQUIRED")
    private Character isTagEnum10Required;
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
    @JoinColumn(name = "ACCTG_TAG_USAGE_TYPE_ID", referencedColumnName = "ACCTG_TAG_USAGE_TYPE_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AcctgTagUsageType acctgTagUsageType;
    @JoinColumn(name = "ENUM_TYPE_ID9", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId9;
    @JoinColumn(name = "ENUM_TYPE_ID8", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId8;
    @JoinColumn(name = "ENUM_TYPE_ID7", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId7;
    @JoinColumn(name = "ENUM_TYPE_ID6", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId6;
    @JoinColumn(name = "ENUM_TYPE_ID5", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId5;
    @JoinColumn(name = "ENUM_TYPE_ID4", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId4;
    @JoinColumn(name = "ENUM_TYPE_ID3", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId3;
    @JoinColumn(name = "ENUM_TYPE_ID2", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId2;
    @JoinColumn(name = "ENUM_TYPE_ID10", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId10;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID1", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId1;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID10", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId10;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID2", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId2;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID3", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId3;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID4", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId4;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID5", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId5;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID6", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId6;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID7", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId7;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID8", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId8;
    @JoinColumn(name = "DEFAULT_TAG_ENUM_ID9", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration defaultTagEnumId9;
    @JoinColumn(name = "ORGANIZATION_PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Party party;
    @JoinColumn(name = "ENUM_TYPE_ID1", referencedColumnName = "ENUM_TYPE_ID")
    @ManyToOne
    private EnumerationType enumTypeId1;

    public AcctgTagEnumType() {
    }

    public AcctgTagEnumType(AcctgTagEnumTypePK acctgTagEnumTypePK) {
        this.acctgTagEnumTypePK = acctgTagEnumTypePK;
    }

    public AcctgTagEnumType(String organizationPartyId, String acctgTagUsageTypeId) {
        this.acctgTagEnumTypePK = new AcctgTagEnumTypePK(organizationPartyId, acctgTagUsageTypeId);
    }

    public AcctgTagEnumTypePK getAcctgTagEnumTypePK() {
        return acctgTagEnumTypePK;
    }

    public void setAcctgTagEnumTypePK(AcctgTagEnumTypePK acctgTagEnumTypePK) {
        this.acctgTagEnumTypePK = acctgTagEnumTypePK;
    }

    public Character getIsTagEnum1Required() {
        return isTagEnum1Required;
    }

    public void setIsTagEnum1Required(Character isTagEnum1Required) {
        this.isTagEnum1Required = isTagEnum1Required;
    }

    public Character getIsTagEnum2Required() {
        return isTagEnum2Required;
    }

    public void setIsTagEnum2Required(Character isTagEnum2Required) {
        this.isTagEnum2Required = isTagEnum2Required;
    }

    public Character getIsTagEnum3Required() {
        return isTagEnum3Required;
    }

    public void setIsTagEnum3Required(Character isTagEnum3Required) {
        this.isTagEnum3Required = isTagEnum3Required;
    }

    public Character getIsTagEnum4Required() {
        return isTagEnum4Required;
    }

    public void setIsTagEnum4Required(Character isTagEnum4Required) {
        this.isTagEnum4Required = isTagEnum4Required;
    }

    public Character getIsTagEnum5Required() {
        return isTagEnum5Required;
    }

    public void setIsTagEnum5Required(Character isTagEnum5Required) {
        this.isTagEnum5Required = isTagEnum5Required;
    }

    public Character getIsTagEnum6Required() {
        return isTagEnum6Required;
    }

    public void setIsTagEnum6Required(Character isTagEnum6Required) {
        this.isTagEnum6Required = isTagEnum6Required;
    }

    public Character getIsTagEnum7Required() {
        return isTagEnum7Required;
    }

    public void setIsTagEnum7Required(Character isTagEnum7Required) {
        this.isTagEnum7Required = isTagEnum7Required;
    }

    public Character getIsTagEnum8Required() {
        return isTagEnum8Required;
    }

    public void setIsTagEnum8Required(Character isTagEnum8Required) {
        this.isTagEnum8Required = isTagEnum8Required;
    }

    public Character getIsTagEnum9Required() {
        return isTagEnum9Required;
    }

    public void setIsTagEnum9Required(Character isTagEnum9Required) {
        this.isTagEnum9Required = isTagEnum9Required;
    }

    public Character getIsTagEnum10Required() {
        return isTagEnum10Required;
    }

    public void setIsTagEnum10Required(Character isTagEnum10Required) {
        this.isTagEnum10Required = isTagEnum10Required;
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

    public AcctgTagUsageType getAcctgTagUsageType() {
        return acctgTagUsageType;
    }

    public void setAcctgTagUsageType(AcctgTagUsageType acctgTagUsageType) {
        this.acctgTagUsageType = acctgTagUsageType;
    }

    public EnumerationType getEnumTypeId9() {
        return enumTypeId9;
    }

    public void setEnumTypeId9(EnumerationType enumTypeId9) {
        this.enumTypeId9 = enumTypeId9;
    }

    public EnumerationType getEnumTypeId8() {
        return enumTypeId8;
    }

    public void setEnumTypeId8(EnumerationType enumTypeId8) {
        this.enumTypeId8 = enumTypeId8;
    }

    public EnumerationType getEnumTypeId7() {
        return enumTypeId7;
    }

    public void setEnumTypeId7(EnumerationType enumTypeId7) {
        this.enumTypeId7 = enumTypeId7;
    }

    public EnumerationType getEnumTypeId6() {
        return enumTypeId6;
    }

    public void setEnumTypeId6(EnumerationType enumTypeId6) {
        this.enumTypeId6 = enumTypeId6;
    }

    public EnumerationType getEnumTypeId5() {
        return enumTypeId5;
    }

    public void setEnumTypeId5(EnumerationType enumTypeId5) {
        this.enumTypeId5 = enumTypeId5;
    }

    public EnumerationType getEnumTypeId4() {
        return enumTypeId4;
    }

    public void setEnumTypeId4(EnumerationType enumTypeId4) {
        this.enumTypeId4 = enumTypeId4;
    }

    public EnumerationType getEnumTypeId3() {
        return enumTypeId3;
    }

    public void setEnumTypeId3(EnumerationType enumTypeId3) {
        this.enumTypeId3 = enumTypeId3;
    }

    public EnumerationType getEnumTypeId2() {
        return enumTypeId2;
    }

    public void setEnumTypeId2(EnumerationType enumTypeId2) {
        this.enumTypeId2 = enumTypeId2;
    }

    public EnumerationType getEnumTypeId10() {
        return enumTypeId10;
    }

    public void setEnumTypeId10(EnumerationType enumTypeId10) {
        this.enumTypeId10 = enumTypeId10;
    }

    public Enumeration getDefaultTagEnumId1() {
        return defaultTagEnumId1;
    }

    public void setDefaultTagEnumId1(Enumeration defaultTagEnumId1) {
        this.defaultTagEnumId1 = defaultTagEnumId1;
    }

    public Enumeration getDefaultTagEnumId10() {
        return defaultTagEnumId10;
    }

    public void setDefaultTagEnumId10(Enumeration defaultTagEnumId10) {
        this.defaultTagEnumId10 = defaultTagEnumId10;
    }

    public Enumeration getDefaultTagEnumId2() {
        return defaultTagEnumId2;
    }

    public void setDefaultTagEnumId2(Enumeration defaultTagEnumId2) {
        this.defaultTagEnumId2 = defaultTagEnumId2;
    }

    public Enumeration getDefaultTagEnumId3() {
        return defaultTagEnumId3;
    }

    public void setDefaultTagEnumId3(Enumeration defaultTagEnumId3) {
        this.defaultTagEnumId3 = defaultTagEnumId3;
    }

    public Enumeration getDefaultTagEnumId4() {
        return defaultTagEnumId4;
    }

    public void setDefaultTagEnumId4(Enumeration defaultTagEnumId4) {
        this.defaultTagEnumId4 = defaultTagEnumId4;
    }

    public Enumeration getDefaultTagEnumId5() {
        return defaultTagEnumId5;
    }

    public void setDefaultTagEnumId5(Enumeration defaultTagEnumId5) {
        this.defaultTagEnumId5 = defaultTagEnumId5;
    }

    public Enumeration getDefaultTagEnumId6() {
        return defaultTagEnumId6;
    }

    public void setDefaultTagEnumId6(Enumeration defaultTagEnumId6) {
        this.defaultTagEnumId6 = defaultTagEnumId6;
    }

    public Enumeration getDefaultTagEnumId7() {
        return defaultTagEnumId7;
    }

    public void setDefaultTagEnumId7(Enumeration defaultTagEnumId7) {
        this.defaultTagEnumId7 = defaultTagEnumId7;
    }

    public Enumeration getDefaultTagEnumId8() {
        return defaultTagEnumId8;
    }

    public void setDefaultTagEnumId8(Enumeration defaultTagEnumId8) {
        this.defaultTagEnumId8 = defaultTagEnumId8;
    }

    public Enumeration getDefaultTagEnumId9() {
        return defaultTagEnumId9;
    }

    public void setDefaultTagEnumId9(Enumeration defaultTagEnumId9) {
        this.defaultTagEnumId9 = defaultTagEnumId9;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public EnumerationType getEnumTypeId1() {
        return enumTypeId1;
    }

    public void setEnumTypeId1(EnumerationType enumTypeId1) {
        this.enumTypeId1 = enumTypeId1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctgTagEnumTypePK != null ? acctgTagEnumTypePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctgTagEnumType)) {
            return false;
        }
        AcctgTagEnumType other = (AcctgTagEnumType) object;
        if ((this.acctgTagEnumTypePK == null && other.acctgTagEnumTypePK != null) || (this.acctgTagEnumTypePK != null && !this.acctgTagEnumTypePK.equals(other.acctgTagEnumTypePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.AcctgTagEnumType[ acctgTagEnumTypePK=" + acctgTagEnumTypePK + " ]";
    }
    
}
