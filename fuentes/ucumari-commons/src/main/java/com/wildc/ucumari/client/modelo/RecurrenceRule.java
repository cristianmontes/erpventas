/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "recurrence_rule")
@NamedQueries({
    @NamedQuery(name = "RecurrenceRule.findAll", query = "SELECT r FROM RecurrenceRule r")})
public class RecurrenceRule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RECURRENCE_RULE_ID")
    private String recurrenceRuleId;
    @Column(name = "FREQUENCY")
    private String frequency;
    @Column(name = "UNTIL_DATE_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date untilDateTime;
    @Column(name = "COUNT_NUMBER")
    private BigInteger countNumber;
    @Column(name = "INTERVAL_NUMBER")
    private BigInteger intervalNumber;
    @Lob
    @Column(name = "BY_SECOND_LIST")
    private String bySecondList;
    @Lob
    @Column(name = "BY_MINUTE_LIST")
    private String byMinuteList;
    @Lob
    @Column(name = "BY_HOUR_LIST")
    private String byHourList;
    @Lob
    @Column(name = "BY_DAY_LIST")
    private String byDayList;
    @Lob
    @Column(name = "BY_MONTH_DAY_LIST")
    private String byMonthDayList;
    @Lob
    @Column(name = "BY_YEAR_DAY_LIST")
    private String byYearDayList;
    @Lob
    @Column(name = "BY_WEEK_NO_LIST")
    private String byWeekNoList;
    @Lob
    @Column(name = "BY_MONTH_LIST")
    private String byMonthList;
    @Lob
    @Column(name = "BY_SET_POS_LIST")
    private String bySetPosList;
    @Column(name = "WEEK_START")
    private String weekStart;
    @Lob
    @Column(name = "X_NAME")
    private String xName;
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
    @OneToMany(mappedBy = "recurrenceRuleId")
    private List<RecurrenceInfo> recurrenceInfoList;
    @OneToMany(mappedBy = "exceptionRuleId")
    private List<RecurrenceInfo> recurrenceInfoList1;

    public RecurrenceRule() {
    }

    public RecurrenceRule(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }

    public String getRecurrenceRuleId() {
        return recurrenceRuleId;
    }

    public void setRecurrenceRuleId(String recurrenceRuleId) {
        this.recurrenceRuleId = recurrenceRuleId;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Date getUntilDateTime() {
        return untilDateTime;
    }

    public void setUntilDateTime(Date untilDateTime) {
        this.untilDateTime = untilDateTime;
    }

    public BigInteger getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(BigInteger countNumber) {
        this.countNumber = countNumber;
    }

    public BigInteger getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(BigInteger intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public String getBySecondList() {
        return bySecondList;
    }

    public void setBySecondList(String bySecondList) {
        this.bySecondList = bySecondList;
    }

    public String getByMinuteList() {
        return byMinuteList;
    }

    public void setByMinuteList(String byMinuteList) {
        this.byMinuteList = byMinuteList;
    }

    public String getByHourList() {
        return byHourList;
    }

    public void setByHourList(String byHourList) {
        this.byHourList = byHourList;
    }

    public String getByDayList() {
        return byDayList;
    }

    public void setByDayList(String byDayList) {
        this.byDayList = byDayList;
    }

    public String getByMonthDayList() {
        return byMonthDayList;
    }

    public void setByMonthDayList(String byMonthDayList) {
        this.byMonthDayList = byMonthDayList;
    }

    public String getByYearDayList() {
        return byYearDayList;
    }

    public void setByYearDayList(String byYearDayList) {
        this.byYearDayList = byYearDayList;
    }

    public String getByWeekNoList() {
        return byWeekNoList;
    }

    public void setByWeekNoList(String byWeekNoList) {
        this.byWeekNoList = byWeekNoList;
    }

    public String getByMonthList() {
        return byMonthList;
    }

    public void setByMonthList(String byMonthList) {
        this.byMonthList = byMonthList;
    }

    public String getBySetPosList() {
        return bySetPosList;
    }

    public void setBySetPosList(String bySetPosList) {
        this.bySetPosList = bySetPosList;
    }

    public String getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(String weekStart) {
        this.weekStart = weekStart;
    }

    public String getXName() {
        return xName;
    }

    public void setXName(String xName) {
        this.xName = xName;
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

    public List<RecurrenceInfo> getRecurrenceInfoList() {
        return recurrenceInfoList;
    }

    public void setRecurrenceInfoList(List<RecurrenceInfo> recurrenceInfoList) {
        this.recurrenceInfoList = recurrenceInfoList;
    }

    public List<RecurrenceInfo> getRecurrenceInfoList1() {
        return recurrenceInfoList1;
    }

    public void setRecurrenceInfoList1(List<RecurrenceInfo> recurrenceInfoList1) {
        this.recurrenceInfoList1 = recurrenceInfoList1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recurrenceRuleId != null ? recurrenceRuleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecurrenceRule)) {
            return false;
        }
        RecurrenceRule other = (RecurrenceRule) object;
        if ((this.recurrenceRuleId == null && other.recurrenceRuleId != null) || (this.recurrenceRuleId != null && !this.recurrenceRuleId.equals(other.recurrenceRuleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.RecurrenceRule[ recurrenceRuleId=" + recurrenceRuleId + " ]";
    }
    
}
