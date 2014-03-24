/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.party.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "person")
/*@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")})*/
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PARTY_ID")
    private String partyId;
    @Column(name = "SALUTATION")
    private String salutation;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_NAME")
    private String middleName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "PERSONAL_TITLE")
    private String personalTitle;
    @Column(name = "SUFFIX")
    private String suffix;
    @Column(name = "NICKNAME")
    private String nickname;
    @Column(name = "FIRST_NAME_LOCAL")
    private String firstNameLocal;
    @Column(name = "MIDDLE_NAME_LOCAL")
    private String middleNameLocal;
    @Column(name = "LAST_NAME_LOCAL")
    private String lastNameLocal;
    @Column(name = "OTHER_LOCAL")
    private String otherLocal;
    @Column(name = "MEMBER_ID")
    private String memberId;
    @Column(name = "GENDER")
    private Character gender;
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HEIGHT")
    private BigDecimal height;
    @Column(name = "WEIGHT")
    private BigDecimal weight;
    @Column(name = "MOTHERS_MAIDEN_NAME")
    private String mothersMaidenName;
    @Column(name = "MARITAL_STATUS")
    private Character maritalStatus;
    @Column(name = "SOCIAL_SECURITY_NUMBER")
    private String socialSecurityNumber;
    @Column(name = "PASSPORT_NUMBER")
    private String passportNumber;
    @Column(name = "PASSPORT_EXPIRE_DATE")
    @Temporal(TemporalType.DATE)
    private Date passportExpireDate;
    @Column(name = "TOTAL_YEARS_WORK_EXPERIENCE")
    private BigDecimal totalYearsWorkExperience;
    @Column(name = "COMMENTS")
    private String comments;
    @Column(name = "OCCUPATION")
    private String occupation;
    @Column(name = "YEARS_WITH_EMPLOYER")
    private BigInteger yearsWithEmployer;
    @Column(name = "MONTHS_WITH_EMPLOYER")
    private BigInteger monthsWithEmployer;
    @Column(name = "EXISTING_CUSTOMER")
    private Character existingCustomer;
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
    
    @JoinColumn(name = "RESIDENCE_STATUS_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration residenceStatusEnumId;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Party party;
    @JoinColumn(name = "EMPLOYMENT_STATUS_ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration employmentStatusEnumId;
    

    public Person() {
    }

    public Person(String partyId) {
        this.partyId = partyId;
    }

    public String getPartyId() {
        return partyId;
    }

    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }

    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPersonalTitle() {
        return personalTitle;
    }

    public void setPersonalTitle(String personalTitle) {
        this.personalTitle = personalTitle;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstNameLocal() {
        return firstNameLocal;
    }

    public void setFirstNameLocal(String firstNameLocal) {
        this.firstNameLocal = firstNameLocal;
    }

    public String getMiddleNameLocal() {
        return middleNameLocal;
    }

    public void setMiddleNameLocal(String middleNameLocal) {
        this.middleNameLocal = middleNameLocal;
    }

    public String getLastNameLocal() {
        return lastNameLocal;
    }

    public void setLastNameLocal(String lastNameLocal) {
        this.lastNameLocal = lastNameLocal;
    }

    public String getOtherLocal() {
        return otherLocal;
    }

    public void setOtherLocal(String otherLocal) {
        this.otherLocal = otherLocal;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getMothersMaidenName() {
        return mothersMaidenName;
    }

    public void setMothersMaidenName(String mothersMaidenName) {
        this.mothersMaidenName = mothersMaidenName;
    }

    public Character getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Character maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getPassportExpireDate() {
        return passportExpireDate;
    }

    public void setPassportExpireDate(Date passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }

    public BigDecimal getTotalYearsWorkExperience() {
        return totalYearsWorkExperience;
    }

    public void setTotalYearsWorkExperience(BigDecimal totalYearsWorkExperience) {
        this.totalYearsWorkExperience = totalYearsWorkExperience;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public BigInteger getYearsWithEmployer() {
        return yearsWithEmployer;
    }

    public void setYearsWithEmployer(BigInteger yearsWithEmployer) {
        this.yearsWithEmployer = yearsWithEmployer;
    }

    public BigInteger getMonthsWithEmployer() {
        return monthsWithEmployer;
    }

    public void setMonthsWithEmployer(BigInteger monthsWithEmployer) {
        this.monthsWithEmployer = monthsWithEmployer;
    }

    public Character getExistingCustomer() {
        return existingCustomer;
    }

    public void setExistingCustomer(Character existingCustomer) {
        this.existingCustomer = existingCustomer;
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

    
    public Enumeration getResidenceStatusEnumId() {
        return residenceStatusEnumId;
    }

    public void setResidenceStatusEnumId(Enumeration residenceStatusEnumId) {
        this.residenceStatusEnumId = residenceStatusEnumId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Enumeration getEmploymentStatusEnumId() {
        return employmentStatusEnumId;
    }

    public void setEmploymentStatusEnumId(Enumeration employmentStatusEnumId) {
        this.employmentStatusEnumId = employmentStatusEnumId;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (partyId != null ? partyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.partyId == null && other.partyId != null) || (this.partyId != null && !this.partyId.equals(other.partyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Person[ partyId=" + partyId + " ]";
    }
    
}
