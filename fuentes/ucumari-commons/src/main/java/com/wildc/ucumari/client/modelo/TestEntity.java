/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.wildc.ucumari.parameters.model.Enumeration;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "test_entity")
@NamedQueries({
    @NamedQuery(name = "TestEntity.findAll", query = "SELECT t FROM TestEntity t")})
public class TestEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TEST_ID")
    private String testId;
    @Column(name = "TEST_STRING_FIELD")
    private String testStringField;
    @Column(name = "TEST_DATE_TIME_FIELD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date testDateTimeField;
    @Lob
    @Column(name = "TEST_BLOB_FIELD")
    private byte[] testBlobField;
    @Column(name = "TEST_NUMERIC_FIELD")
    private BigInteger testNumericField;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TEST_FLOATING_POINT_FIELD")
    private BigDecimal testFloatingPointField;
    @Column(name = "TEST_CURRENCY_PRECISE_FIELD")
    private BigDecimal testCurrencyPreciseField;
    @Column(name = "TEST_CREDIT_CARD_NUMBER_FIELD")
    private String testCreditCardNumberField;
    @Column(name = "TEST_CREDIT_CARD_DATE_FIELD")
    private String testCreditCardDateField;
    @Column(name = "TEST_EMAIL_FIELD")
    private String testEmailField;
    @Column(name = "TEST_URL_FIELD")
    private String testUrlField;
    @Column(name = "TEST_TELPHONE_FIELD")
    private String testTelphoneField;
    @Column(name = "TEST_ENCRYPT")
    private String testEncrypt;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "testEntity")
    private List<TestEntityItem> testEntityItemList;
    @JoinColumn(name = "ENUM_ID", referencedColumnName = "ENUM_ID")
    @ManyToOne
    private Enumeration enumId;

    public TestEntity() {
    }

    public TestEntity(String testId) {
        this.testId = testId;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public String getTestStringField() {
        return testStringField;
    }

    public void setTestStringField(String testStringField) {
        this.testStringField = testStringField;
    }

    public Date getTestDateTimeField() {
        return testDateTimeField;
    }

    public void setTestDateTimeField(Date testDateTimeField) {
        this.testDateTimeField = testDateTimeField;
    }

    public byte[] getTestBlobField() {
        return testBlobField;
    }

    public void setTestBlobField(byte[] testBlobField) {
        this.testBlobField = testBlobField;
    }

    public BigInteger getTestNumericField() {
        return testNumericField;
    }

    public void setTestNumericField(BigInteger testNumericField) {
        this.testNumericField = testNumericField;
    }

    public BigDecimal getTestFloatingPointField() {
        return testFloatingPointField;
    }

    public void setTestFloatingPointField(BigDecimal testFloatingPointField) {
        this.testFloatingPointField = testFloatingPointField;
    }

    public BigDecimal getTestCurrencyPreciseField() {
        return testCurrencyPreciseField;
    }

    public void setTestCurrencyPreciseField(BigDecimal testCurrencyPreciseField) {
        this.testCurrencyPreciseField = testCurrencyPreciseField;
    }

    public String getTestCreditCardNumberField() {
        return testCreditCardNumberField;
    }

    public void setTestCreditCardNumberField(String testCreditCardNumberField) {
        this.testCreditCardNumberField = testCreditCardNumberField;
    }

    public String getTestCreditCardDateField() {
        return testCreditCardDateField;
    }

    public void setTestCreditCardDateField(String testCreditCardDateField) {
        this.testCreditCardDateField = testCreditCardDateField;
    }

    public String getTestEmailField() {
        return testEmailField;
    }

    public void setTestEmailField(String testEmailField) {
        this.testEmailField = testEmailField;
    }

    public String getTestUrlField() {
        return testUrlField;
    }

    public void setTestUrlField(String testUrlField) {
        this.testUrlField = testUrlField;
    }

    public String getTestTelphoneField() {
        return testTelphoneField;
    }

    public void setTestTelphoneField(String testTelphoneField) {
        this.testTelphoneField = testTelphoneField;
    }

    public String getTestEncrypt() {
        return testEncrypt;
    }

    public void setTestEncrypt(String testEncrypt) {
        this.testEncrypt = testEncrypt;
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

    public List<TestEntityItem> getTestEntityItemList() {
        return testEntityItemList;
    }

    public void setTestEntityItemList(List<TestEntityItem> testEntityItemList) {
        this.testEntityItemList = testEntityItemList;
    }

    public Enumeration getEnumId() {
        return enumId;
    }

    public void setEnumId(Enumeration enumId) {
        this.enumId = enumId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (testId != null ? testId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TestEntity)) {
            return false;
        }
        TestEntity other = (TestEntity) object;
        if ((this.testId == null && other.testId != null) || (this.testId != null && !this.testId.equals(other.testId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.TestEntity[ testId=" + testId + " ]";
    }
    
}
