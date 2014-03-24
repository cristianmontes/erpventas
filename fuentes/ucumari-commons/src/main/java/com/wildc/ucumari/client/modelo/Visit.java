/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wildc.ucumari.client.modelo;

import com.wildc.ucumari.contact.model.ContactMech;
import com.wildc.ucumari.inventory.model.InventoryItemTempRes;
import com.wildc.ucumari.parameters.model.Geo;
import com.wildc.ucumari.parameters.model.RoleType;
import com.wildc.ucumari.party.model.Party;
import com.wildc.ucumari.party.model.PartyRole;
import com.wildc.ucumari.party.model.PartyDataSource;
import com.wildc.ucumari.party.model.PartyNeed;
import com.wildc.ucumari.product.model.ProductKeywordResult;
import com.wildc.ucumari.product.model.ProductSearchResult;
import com.wildc.ucumari.security.model.UserAgent;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "visit")
@NamedQueries({
    @NamedQuery(name = "Visit.findAll", query = "SELECT v FROM Visit v")})
public class Visit implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
    private List<ServerHit> serverHitList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
    private List<TrackingCodeVisit> trackingCodeVisitList;
    @OneToMany(mappedBy = "visitId")
    private List<WorkEffortSearchResult> workEffortSearchResultList;
    @OneToMany(mappedBy = "visitId")
    private List<ProductSearchResult> productSearchResultList;
    @OneToMany(mappedBy = "visitId")
    private List<PartyDataSource> partyDataSourceList;
    @OneToMany(mappedBy = "visitId")
    private List<ProductKeywordResult> productKeywordResultList;
    @OneToMany(mappedBy = "visitId")
    private List<PartyNeed> partyNeedList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
    private List<InventoryItemTempRes> inventoryItemTempResList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VISIT_ID")
    private String visitId;
    @Column(name = "USER_LOGIN_ID")
    private String userLoginId;
    @Column(name = "USER_CREATED")
    private Character userCreated;
    @Column(name = "SESSION_ID")
    private String sessionId;
    @Column(name = "SERVER_IP_ADDRESS")
    private String serverIpAddress;
    @Column(name = "SERVER_HOST_NAME")
    private String serverHostName;
    @Column(name = "WEBAPP_NAME")
    private String webappName;
    @Column(name = "INITIAL_LOCALE")
    private String initialLocale;
    @Column(name = "INITIAL_REQUEST")
    private String initialRequest;
    @Column(name = "INITIAL_REFERRER")
    private String initialReferrer;
    @Column(name = "INITIAL_USER_AGENT")
    private String initialUserAgent;
    @Column(name = "CLIENT_IP_ADDRESS")
    private String clientIpAddress;
    @Column(name = "CLIENT_HOST_NAME")
    private String clientHostName;
    @Column(name = "CLIENT_USER")
    private String clientUser;
    @Column(name = "CLIENT_IP_ISP_NAME")
    private String clientIpIspName;
    @Column(name = "CLIENT_IP_POSTAL_CODE")
    private String clientIpPostalCode;
    @Column(name = "COOKIE")
    private String cookie;
    @Column(name = "FROM_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fromDate;
    @Column(name = "THRU_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date thruDate;
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
    @JoinColumn(name = "VISITOR_ID", referencedColumnName = "VISITOR_ID")
    @ManyToOne
    private Visitor visitorId;
    @JoinColumn(name = "USER_AGENT_ID", referencedColumnName = "USER_AGENT_ID")
    @ManyToOne
    private UserAgent userAgentId;
    @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")
    @ManyToOne
    private RoleType roleTypeId;
    @JoinColumns({
        @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID"),
        @JoinColumn(name = "ROLE_TYPE_ID", referencedColumnName = "ROLE_TYPE_ID")})
    @ManyToOne
    private PartyRole partyRole;
    @JoinColumn(name = "PARTY_ID", referencedColumnName = "PARTY_ID")
    @ManyToOne
    private Party partyId;
    @JoinColumn(name = "CONTACT_MECH_ID", referencedColumnName = "CONTACT_MECH_ID")
    @ManyToOne
    private ContactMech contactMechId;
    @JoinColumn(name = "CLIENT_IP_STATE_PROV_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo clientIpStateProvGeoId;
    @JoinColumn(name = "CLIENT_IP_COUNTRY_GEO_ID", referencedColumnName = "GEO_ID")
    @ManyToOne
    private Geo clientIpCountryGeoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visit")
    private List<CartAbandonedLine> cartAbandonedLineList;

    public Visit() {
    }

    public Visit(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }

    public Character getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Character userCreated) {
        this.userCreated = userCreated;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getServerIpAddress() {
        return serverIpAddress;
    }

    public void setServerIpAddress(String serverIpAddress) {
        this.serverIpAddress = serverIpAddress;
    }

    public String getServerHostName() {
        return serverHostName;
    }

    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName;
    }

    public String getWebappName() {
        return webappName;
    }

    public void setWebappName(String webappName) {
        this.webappName = webappName;
    }

    public String getInitialLocale() {
        return initialLocale;
    }

    public void setInitialLocale(String initialLocale) {
        this.initialLocale = initialLocale;
    }

    public String getInitialRequest() {
        return initialRequest;
    }

    public void setInitialRequest(String initialRequest) {
        this.initialRequest = initialRequest;
    }

    public String getInitialReferrer() {
        return initialReferrer;
    }

    public void setInitialReferrer(String initialReferrer) {
        this.initialReferrer = initialReferrer;
    }

    public String getInitialUserAgent() {
        return initialUserAgent;
    }

    public void setInitialUserAgent(String initialUserAgent) {
        this.initialUserAgent = initialUserAgent;
    }

    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public String getClientHostName() {
        return clientHostName;
    }

    public void setClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
    }

    public String getClientUser() {
        return clientUser;
    }

    public void setClientUser(String clientUser) {
        this.clientUser = clientUser;
    }

    public String getClientIpIspName() {
        return clientIpIspName;
    }

    public void setClientIpIspName(String clientIpIspName) {
        this.clientIpIspName = clientIpIspName;
    }

    public String getClientIpPostalCode() {
        return clientIpPostalCode;
    }

    public void setClientIpPostalCode(String clientIpPostalCode) {
        this.clientIpPostalCode = clientIpPostalCode;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getThruDate() {
        return thruDate;
    }

    public void setThruDate(Date thruDate) {
        this.thruDate = thruDate;
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

    public Visitor getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(Visitor visitorId) {
        this.visitorId = visitorId;
    }

    public UserAgent getUserAgentId() {
        return userAgentId;
    }

    public void setUserAgentId(UserAgent userAgentId) {
        this.userAgentId = userAgentId;
    }

    public RoleType getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(RoleType roleTypeId) {
        this.roleTypeId = roleTypeId;
    }

    public PartyRole getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(PartyRole partyRole) {
        this.partyRole = partyRole;
    }

    public Party getPartyId() {
        return partyId;
    }

    public void setPartyId(Party partyId) {
        this.partyId = partyId;
    }

    public ContactMech getContactMechId() {
        return contactMechId;
    }

    public void setContactMechId(ContactMech contactMechId) {
        this.contactMechId = contactMechId;
    }

    public Geo getClientIpStateProvGeoId() {
        return clientIpStateProvGeoId;
    }

    public void setClientIpStateProvGeoId(Geo clientIpStateProvGeoId) {
        this.clientIpStateProvGeoId = clientIpStateProvGeoId;
    }

    public Geo getClientIpCountryGeoId() {
        return clientIpCountryGeoId;
    }

    public void setClientIpCountryGeoId(Geo clientIpCountryGeoId) {
        this.clientIpCountryGeoId = clientIpCountryGeoId;
    }

    public List<CartAbandonedLine> getCartAbandonedLineList() {
        return cartAbandonedLineList;
    }

    public void setCartAbandonedLineList(List<CartAbandonedLine> cartAbandonedLineList) {
        this.cartAbandonedLineList = cartAbandonedLineList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (visitId != null ? visitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visit)) {
            return false;
        }
        Visit other = (Visit) object;
        if ((this.visitId == null && other.visitId != null) || (this.visitId != null && !this.visitId.equals(other.visitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wildc.ucumari.client.modelo.Visit[ visitId=" + visitId + " ]";
    }

    public List<InventoryItemTempRes> getInventoryItemTempResList() {
        return inventoryItemTempResList;
    }

    public void setInventoryItemTempResList(List<InventoryItemTempRes> inventoryItemTempResList) {
        this.inventoryItemTempResList = inventoryItemTempResList;
    }

    public List<ProductSearchResult> getProductSearchResultList() {
        return productSearchResultList;
    }

    public void setProductSearchResultList(List<ProductSearchResult> productSearchResultList) {
        this.productSearchResultList = productSearchResultList;
    }

    public List<PartyDataSource> getPartyDataSourceList() {
        return partyDataSourceList;
    }

    public void setPartyDataSourceList(List<PartyDataSource> partyDataSourceList) {
        this.partyDataSourceList = partyDataSourceList;
    }

    public List<ProductKeywordResult> getProductKeywordResultList() {
        return productKeywordResultList;
    }

    public void setProductKeywordResultList(List<ProductKeywordResult> productKeywordResultList) {
        this.productKeywordResultList = productKeywordResultList;
    }

    public List<PartyNeed> getPartyNeedList() {
        return partyNeedList;
    }

    public void setPartyNeedList(List<PartyNeed> partyNeedList) {
        this.partyNeedList = partyNeedList;
    }

    public List<ServerHit> getServerHitList() {
        return serverHitList;
    }

    public void setServerHitList(List<ServerHit> serverHitList) {
        this.serverHitList = serverHitList;
    }

    public List<TrackingCodeVisit> getTrackingCodeVisitList() {
        return trackingCodeVisitList;
    }

    public void setTrackingCodeVisitList(List<TrackingCodeVisit> trackingCodeVisitList) {
        this.trackingCodeVisitList = trackingCodeVisitList;
    }

    public List<WorkEffortSearchResult> getWorkEffortSearchResultList() {
        return workEffortSearchResultList;
    }

    public void setWorkEffortSearchResultList(List<WorkEffortSearchResult> workEffortSearchResultList) {
        this.workEffortSearchResultList = workEffortSearchResultList;
    }
    
}
