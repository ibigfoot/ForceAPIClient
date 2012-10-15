
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for User complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="AboutMe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallCenterId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CommunityNickname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contact" type="{urn:sobject.enterprise.soap.sforce.com}Contact" minOccurs="0"/>
 *         &lt;element name="ContactId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ContractsSigned" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DefaultGroupNotificationFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DelegatedApproverId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="DelegatedUsers" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigestFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailEncodingKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventRelations" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptions" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FeedSubscriptionsForEntity" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Feeds" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ForecastEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FullPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LanguageLocaleKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastLoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastPasswordChangeDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LocaleSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Manager" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="ManagerId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfflinePdaTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OfflineTrialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PermissionSetAssignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:sobject.enterprise.soap.sforce.com}Profile" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="ReceivesAdminInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ReceivesInfoEmails" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SmallPhotoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TimeZoneSidKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserPermissionsCallCenterAutoLogin" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsInteractionUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsKnowledgeUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMarketingUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsMobileUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsOfflineUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSFContentUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSiteforceContributorUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSiteforcePublisherUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPermissionsSupportUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferences" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="UserPreferencesActivityRemindersPopup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesApexPagesDeveloperMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisCommentAfterLikeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisMentionsCommentEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisProfPostCommentEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableAllFeedsEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableBookmarkEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableChangeCommentEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableFileShareNotificationsForApi" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableFollowersEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableLaterCommentEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableLikeEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableMentionsPostEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableMessageEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableProfilePostEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesDisableSharePostEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesEnableAutoSubForFeeds" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesEventRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideCSNDesktopTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesHideCSNGetChatterMobileTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesOptOutOfTouch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesReminderSoundOff" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCityToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowCountryToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowEmailToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowFaxToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowManagerToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowMobilePhoneToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowPostalCodeToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowStateToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowStreetAddressToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowTitleToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesShowWorkPhoneToExternalUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserPreferencesTaskRemindersCheckboxDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserRole" type="{urn:sobject.enterprise.soap.sforce.com}UserRole" minOccurs="0"/>
 *         &lt;element name="UserRoleId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="UserType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkspaceId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
    "aboutMe",
    "accountId",
    "alias",
    "callCenterId",
    "city",
    "communityNickname",
    "companyName",
    "contact",
    "contactId",
    "contractsSigned",
    "country",
    "createdBy",
    "createdById",
    "createdDate",
    "defaultGroupNotificationFrequency",
    "delegatedApproverId",
    "delegatedUsers",
    "department",
    "digestFrequency",
    "division",
    "email",
    "emailEncodingKey",
    "employeeNumber",
    "eventRelations",
    "extension",
    "fax",
    "federationIdentifier",
    "feedSubscriptions",
    "feedSubscriptionsForEntity",
    "feeds",
    "firstName",
    "forecastEnabled",
    "fullPhotoUrl",
    "isActive",
    "languageLocaleKey",
    "lastLoginDate",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "lastName",
    "lastPasswordChangeDate",
    "localeSidKey",
    "manager",
    "managerId",
    "mobilePhone",
    "name",
    "offlinePdaTrialExpirationDate",
    "offlineTrialExpirationDate",
    "permissionSetAssignments",
    "phone",
    "postalCode",
    "profile",
    "profileId",
    "receivesAdminInfoEmails",
    "receivesInfoEmails",
    "smallPhotoUrl",
    "state",
    "street",
    "systemModstamp",
    "timeZoneSidKey",
    "title",
    "userPermissionsCallCenterAutoLogin",
    "userPermissionsInteractionUser",
    "userPermissionsKnowledgeUser",
    "userPermissionsMarketingUser",
    "userPermissionsMobileUser",
    "userPermissionsOfflineUser",
    "userPermissionsSFContentUser",
    "userPermissionsSiteforceContributorUser",
    "userPermissionsSiteforcePublisherUser",
    "userPermissionsSupportUser",
    "userPreferences",
    "userPreferencesActivityRemindersPopup",
    "userPreferencesApexPagesDeveloperMode",
    "userPreferencesDisCommentAfterLikeEmail",
    "userPreferencesDisMentionsCommentEmail",
    "userPreferencesDisProfPostCommentEmail",
    "userPreferencesDisableAllFeedsEmail",
    "userPreferencesDisableBookmarkEmail",
    "userPreferencesDisableChangeCommentEmail",
    "userPreferencesDisableFileShareNotificationsForApi",
    "userPreferencesDisableFollowersEmail",
    "userPreferencesDisableLaterCommentEmail",
    "userPreferencesDisableLikeEmail",
    "userPreferencesDisableMentionsPostEmail",
    "userPreferencesDisableMessageEmail",
    "userPreferencesDisableProfilePostEmail",
    "userPreferencesDisableSharePostEmail",
    "userPreferencesEnableAutoSubForFeeds",
    "userPreferencesEventRemindersCheckboxDefault",
    "userPreferencesHideCSNDesktopTask",
    "userPreferencesHideCSNGetChatterMobileTask",
    "userPreferencesOptOutOfTouch",
    "userPreferencesReminderSoundOff",
    "userPreferencesShowCityToExternalUsers",
    "userPreferencesShowCountryToExternalUsers",
    "userPreferencesShowEmailToExternalUsers",
    "userPreferencesShowFaxToExternalUsers",
    "userPreferencesShowManagerToExternalUsers",
    "userPreferencesShowMobilePhoneToExternalUsers",
    "userPreferencesShowPostalCodeToExternalUsers",
    "userPreferencesShowStateToExternalUsers",
    "userPreferencesShowStreetAddressToExternalUsers",
    "userPreferencesShowTitleToExternalUsers",
    "userPreferencesShowWorkPhoneToExternalUsers",
    "userPreferencesTaskRemindersCheckboxDefault",
    "userRole",
    "userRoleId",
    "userType",
    "username",
    "workspaceId"
})
public class User
    extends SObject
{

    @XmlElementRef(name = "AboutMe", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aboutMe;
    @XmlElementRef(name = "AccountId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountId;
    @XmlElementRef(name = "Alias", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alias;
    @XmlElementRef(name = "CallCenterId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callCenterId;
    @XmlElementRef(name = "City", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "CommunityNickname", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communityNickname;
    @XmlElementRef(name = "CompanyName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Contact", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Contact> contact;
    @XmlElementRef(name = "ContactId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactId;
    @XmlElementRef(name = "ContractsSigned", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> contractsSigned;
    @XmlElementRef(name = "Country", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "DefaultGroupNotificationFrequency", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> defaultGroupNotificationFrequency;
    @XmlElementRef(name = "DelegatedApproverId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> delegatedApproverId;
    @XmlElementRef(name = "DelegatedUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> delegatedUsers;
    @XmlElementRef(name = "Department", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "DigestFrequency", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> digestFrequency;
    @XmlElementRef(name = "Division", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> division;
    @XmlElementRef(name = "Email", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EmailEncodingKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailEncodingKey;
    @XmlElementRef(name = "EmployeeNumber", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeNumber;
    @XmlElementRef(name = "EventRelations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> eventRelations;
    @XmlElementRef(name = "Extension", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extension;
    @XmlElementRef(name = "Fax", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fax;
    @XmlElementRef(name = "FederationIdentifier", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federationIdentifier;
    @XmlElementRef(name = "FeedSubscriptions", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptions;
    @XmlElementRef(name = "FeedSubscriptionsForEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feedSubscriptionsForEntity;
    @XmlElementRef(name = "Feeds", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> feeds;
    @XmlElementRef(name = "FirstName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "ForecastEnabled", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> forecastEnabled;
    @XmlElementRef(name = "FullPhotoUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullPhotoUrl;
    @XmlElementRef(name = "IsActive", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isActive;
    @XmlElementRef(name = "LanguageLocaleKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageLocaleKey;
    @XmlElementRef(name = "LastLoginDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastLoginDate;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "LastName", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastName;
    @XmlElementRef(name = "LastPasswordChangeDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastPasswordChangeDate;
    @XmlElementRef(name = "LocaleSidKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localeSidKey;
    @XmlElementRef(name = "Manager", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> manager;
    @XmlElementRef(name = "ManagerId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managerId;
    @XmlElementRef(name = "MobilePhone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobilePhone;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "OfflinePdaTrialExpirationDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> offlinePdaTrialExpirationDate;
    @XmlElementRef(name = "OfflineTrialExpirationDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> offlineTrialExpirationDate;
    @XmlElementRef(name = "PermissionSetAssignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> permissionSetAssignments;
    @XmlElementRef(name = "Phone", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phone;
    @XmlElementRef(name = "PostalCode", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "Profile", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Profile> profile;
    @XmlElementRef(name = "ProfileId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileId;
    @XmlElementRef(name = "ReceivesAdminInfoEmails", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> receivesAdminInfoEmails;
    @XmlElementRef(name = "ReceivesInfoEmails", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> receivesInfoEmails;
    @XmlElementRef(name = "SmallPhotoUrl", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smallPhotoUrl;
    @XmlElementRef(name = "State", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "Street", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> street;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "TimeZoneSidKey", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeZoneSidKey;
    @XmlElementRef(name = "Title", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "UserPermissionsCallCenterAutoLogin", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsCallCenterAutoLogin;
    @XmlElementRef(name = "UserPermissionsInteractionUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsInteractionUser;
    @XmlElementRef(name = "UserPermissionsKnowledgeUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsKnowledgeUser;
    @XmlElementRef(name = "UserPermissionsMarketingUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsMarketingUser;
    @XmlElementRef(name = "UserPermissionsMobileUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsMobileUser;
    @XmlElementRef(name = "UserPermissionsOfflineUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsOfflineUser;
    @XmlElementRef(name = "UserPermissionsSFContentUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsSFContentUser;
    @XmlElementRef(name = "UserPermissionsSiteforceContributorUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsSiteforceContributorUser;
    @XmlElementRef(name = "UserPermissionsSiteforcePublisherUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsSiteforcePublisherUser;
    @XmlElementRef(name = "UserPermissionsSupportUser", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPermissionsSupportUser;
    @XmlElementRef(name = "UserPreferences", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> userPreferences;
    @XmlElementRef(name = "UserPreferencesActivityRemindersPopup", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesActivityRemindersPopup;
    @XmlElementRef(name = "UserPreferencesApexPagesDeveloperMode", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesApexPagesDeveloperMode;
    @XmlElementRef(name = "UserPreferencesDisCommentAfterLikeEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisCommentAfterLikeEmail;
    @XmlElementRef(name = "UserPreferencesDisMentionsCommentEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisMentionsCommentEmail;
    @XmlElementRef(name = "UserPreferencesDisProfPostCommentEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisProfPostCommentEmail;
    @XmlElementRef(name = "UserPreferencesDisableAllFeedsEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableAllFeedsEmail;
    @XmlElementRef(name = "UserPreferencesDisableBookmarkEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableBookmarkEmail;
    @XmlElementRef(name = "UserPreferencesDisableChangeCommentEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableChangeCommentEmail;
    @XmlElementRef(name = "UserPreferencesDisableFileShareNotificationsForApi", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableFileShareNotificationsForApi;
    @XmlElementRef(name = "UserPreferencesDisableFollowersEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableFollowersEmail;
    @XmlElementRef(name = "UserPreferencesDisableLaterCommentEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableLaterCommentEmail;
    @XmlElementRef(name = "UserPreferencesDisableLikeEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableLikeEmail;
    @XmlElementRef(name = "UserPreferencesDisableMentionsPostEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableMentionsPostEmail;
    @XmlElementRef(name = "UserPreferencesDisableMessageEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableMessageEmail;
    @XmlElementRef(name = "UserPreferencesDisableProfilePostEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableProfilePostEmail;
    @XmlElementRef(name = "UserPreferencesDisableSharePostEmail", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesDisableSharePostEmail;
    @XmlElementRef(name = "UserPreferencesEnableAutoSubForFeeds", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesEnableAutoSubForFeeds;
    @XmlElementRef(name = "UserPreferencesEventRemindersCheckboxDefault", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesEventRemindersCheckboxDefault;
    @XmlElementRef(name = "UserPreferencesHideCSNDesktopTask", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesHideCSNDesktopTask;
    @XmlElementRef(name = "UserPreferencesHideCSNGetChatterMobileTask", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesHideCSNGetChatterMobileTask;
    @XmlElementRef(name = "UserPreferencesOptOutOfTouch", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesOptOutOfTouch;
    @XmlElementRef(name = "UserPreferencesReminderSoundOff", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesReminderSoundOff;
    @XmlElementRef(name = "UserPreferencesShowCityToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowCityToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowCountryToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowCountryToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowEmailToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowEmailToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowFaxToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowFaxToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowManagerToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowManagerToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowMobilePhoneToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowMobilePhoneToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowPostalCodeToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowPostalCodeToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowStateToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowStateToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowStreetAddressToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowStreetAddressToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowTitleToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowTitleToExternalUsers;
    @XmlElementRef(name = "UserPreferencesShowWorkPhoneToExternalUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesShowWorkPhoneToExternalUsers;
    @XmlElementRef(name = "UserPreferencesTaskRemindersCheckboxDefault", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> userPreferencesTaskRemindersCheckboxDefault;
    @XmlElementRef(name = "UserRole", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserRole> userRole;
    @XmlElementRef(name = "UserRoleId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userRoleId;
    @XmlElementRef(name = "UserType", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userType;
    @XmlElementRef(name = "Username", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "WorkspaceId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workspaceId;

    /**
     * Gets the value of the aboutMe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAboutMe() {
        return aboutMe;
    }

    /**
     * Sets the value of the aboutMe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAboutMe(JAXBElement<String> value) {
        this.aboutMe = value;
    }

    /**
     * Gets the value of the accountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountId(JAXBElement<String> value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlias(JAXBElement<String> value) {
        this.alias = value;
    }

    /**
     * Gets the value of the callCenterId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallCenterId() {
        return callCenterId;
    }

    /**
     * Sets the value of the callCenterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallCenterId(JAXBElement<String> value) {
        this.callCenterId = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the communityNickname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunityNickname() {
        return communityNickname;
    }

    /**
     * Sets the value of the communityNickname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunityNickname(JAXBElement<String> value) {
        this.communityNickname = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public JAXBElement<Contact> getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Contact }{@code >}
     *     
     */
    public void setContact(JAXBElement<Contact> value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactId() {
        return contactId;
    }

    /**
     * Sets the value of the contactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactId(JAXBElement<String> value) {
        this.contactId = value;
    }

    /**
     * Gets the value of the contractsSigned property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getContractsSigned() {
        return contractsSigned;
    }

    /**
     * Sets the value of the contractsSigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setContractsSigned(JAXBElement<QueryResultType> value) {
        this.contractsSigned = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<User> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the createdById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedById() {
        return createdById;
    }

    /**
     * Sets the value of the createdById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedById(JAXBElement<String> value) {
        this.createdById = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the defaultGroupNotificationFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDefaultGroupNotificationFrequency() {
        return defaultGroupNotificationFrequency;
    }

    /**
     * Sets the value of the defaultGroupNotificationFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDefaultGroupNotificationFrequency(JAXBElement<String> value) {
        this.defaultGroupNotificationFrequency = value;
    }

    /**
     * Gets the value of the delegatedApproverId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDelegatedApproverId() {
        return delegatedApproverId;
    }

    /**
     * Sets the value of the delegatedApproverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDelegatedApproverId(JAXBElement<String> value) {
        this.delegatedApproverId = value;
    }

    /**
     * Gets the value of the delegatedUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getDelegatedUsers() {
        return delegatedUsers;
    }

    /**
     * Sets the value of the delegatedUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setDelegatedUsers(JAXBElement<QueryResultType> value) {
        this.delegatedUsers = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the digestFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDigestFrequency() {
        return digestFrequency;
    }

    /**
     * Sets the value of the digestFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDigestFrequency(JAXBElement<String> value) {
        this.digestFrequency = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDivision(JAXBElement<String> value) {
        this.division = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the emailEncodingKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailEncodingKey() {
        return emailEncodingKey;
    }

    /**
     * Sets the value of the emailEncodingKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailEncodingKey(JAXBElement<String> value) {
        this.emailEncodingKey = value;
    }

    /**
     * Gets the value of the employeeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets the value of the employeeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeNumber(JAXBElement<String> value) {
        this.employeeNumber = value;
    }

    /**
     * Gets the value of the eventRelations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getEventRelations() {
        return eventRelations;
    }

    /**
     * Sets the value of the eventRelations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setEventRelations(JAXBElement<QueryResultType> value) {
        this.eventRelations = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtension(JAXBElement<String> value) {
        this.extension = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFax(JAXBElement<String> value) {
        this.fax = value;
    }

    /**
     * Gets the value of the federationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederationIdentifier() {
        return federationIdentifier;
    }

    /**
     * Sets the value of the federationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederationIdentifier(JAXBElement<String> value) {
        this.federationIdentifier = value;
    }

    /**
     * Gets the value of the feedSubscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFeedSubscriptions() {
        return feedSubscriptions;
    }

    /**
     * Sets the value of the feedSubscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFeedSubscriptions(JAXBElement<QueryResultType> value) {
        this.feedSubscriptions = value;
    }

    /**
     * Gets the value of the feedSubscriptionsForEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }

    /**
     * Sets the value of the feedSubscriptionsForEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFeedSubscriptionsForEntity(JAXBElement<QueryResultType> value) {
        this.feedSubscriptionsForEntity = value;
    }

    /**
     * Gets the value of the feeds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFeeds() {
        return feeds;
    }

    /**
     * Sets the value of the feeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFeeds(JAXBElement<QueryResultType> value) {
        this.feeds = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the forecastEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getForecastEnabled() {
        return forecastEnabled;
    }

    /**
     * Sets the value of the forecastEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setForecastEnabled(JAXBElement<Boolean> value) {
        this.forecastEnabled = value;
    }

    /**
     * Gets the value of the fullPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullPhotoUrl() {
        return fullPhotoUrl;
    }

    /**
     * Sets the value of the fullPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullPhotoUrl(JAXBElement<String> value) {
        this.fullPhotoUrl = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsActive(JAXBElement<Boolean> value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the languageLocaleKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageLocaleKey() {
        return languageLocaleKey;
    }

    /**
     * Sets the value of the languageLocaleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageLocaleKey(JAXBElement<String> value) {
        this.languageLocaleKey = value;
    }

    /**
     * Gets the value of the lastLoginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastLoginDate() {
        return lastLoginDate;
    }

    /**
     * Sets the value of the lastLoginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastLoginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastLoginDate = value;
    }

    /**
     * Gets the value of the lastModifiedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getLastModifiedBy() {
        return lastModifiedBy;
    }

    /**
     * Sets the value of the lastModifiedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setLastModifiedBy(JAXBElement<User> value) {
        this.lastModifiedBy = value;
    }

    /**
     * Gets the value of the lastModifiedById property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastModifiedById() {
        return lastModifiedById;
    }

    /**
     * Sets the value of the lastModifiedById property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastModifiedById(JAXBElement<String> value) {
        this.lastModifiedById = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastName(JAXBElement<String> value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the lastPasswordChangeDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastPasswordChangeDate() {
        return lastPasswordChangeDate;
    }

    /**
     * Sets the value of the lastPasswordChangeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastPasswordChangeDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastPasswordChangeDate = value;
    }

    /**
     * Gets the value of the localeSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocaleSidKey() {
        return localeSidKey;
    }

    /**
     * Sets the value of the localeSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocaleSidKey(JAXBElement<String> value) {
        this.localeSidKey = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public JAXBElement<User> getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link User }{@code >}
     *     
     */
    public void setManager(JAXBElement<User> value) {
        this.manager = value;
    }

    /**
     * Gets the value of the managerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagerId() {
        return managerId;
    }

    /**
     * Sets the value of the managerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagerId(JAXBElement<String> value) {
        this.managerId = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobilePhone(JAXBElement<String> value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOfflinePdaTrialExpirationDate() {
        return offlinePdaTrialExpirationDate;
    }

    /**
     * Sets the value of the offlinePdaTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOfflinePdaTrialExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.offlinePdaTrialExpirationDate = value;
    }

    /**
     * Gets the value of the offlineTrialExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOfflineTrialExpirationDate() {
        return offlineTrialExpirationDate;
    }

    /**
     * Sets the value of the offlineTrialExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOfflineTrialExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.offlineTrialExpirationDate = value;
    }

    /**
     * Gets the value of the permissionSetAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getPermissionSetAssignments() {
        return permissionSetAssignments;
    }

    /**
     * Sets the value of the permissionSetAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setPermissionSetAssignments(JAXBElement<QueryResultType> value) {
        this.permissionSetAssignments = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhone(JAXBElement<String> value) {
        this.phone = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the profile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public JAXBElement<Profile> getProfile() {
        return profile;
    }

    /**
     * Sets the value of the profile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Profile }{@code >}
     *     
     */
    public void setProfile(JAXBElement<Profile> value) {
        this.profile = value;
    }

    /**
     * Gets the value of the profileId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfileId() {
        return profileId;
    }

    /**
     * Sets the value of the profileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfileId(JAXBElement<String> value) {
        this.profileId = value;
    }

    /**
     * Gets the value of the receivesAdminInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReceivesAdminInfoEmails() {
        return receivesAdminInfoEmails;
    }

    /**
     * Sets the value of the receivesAdminInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReceivesAdminInfoEmails(JAXBElement<Boolean> value) {
        this.receivesAdminInfoEmails = value;
    }

    /**
     * Gets the value of the receivesInfoEmails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getReceivesInfoEmails() {
        return receivesInfoEmails;
    }

    /**
     * Sets the value of the receivesInfoEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setReceivesInfoEmails(JAXBElement<Boolean> value) {
        this.receivesInfoEmails = value;
    }

    /**
     * Gets the value of the smallPhotoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmallPhotoUrl() {
        return smallPhotoUrl;
    }

    /**
     * Sets the value of the smallPhotoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmallPhotoUrl(JAXBElement<String> value) {
        this.smallPhotoUrl = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStreet(JAXBElement<String> value) {
        this.street = value;
    }

    /**
     * Gets the value of the systemModstamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSystemModstamp() {
        return systemModstamp;
    }

    /**
     * Sets the value of the systemModstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSystemModstamp(JAXBElement<XMLGregorianCalendar> value) {
        this.systemModstamp = value;
    }

    /**
     * Gets the value of the timeZoneSidKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeZoneSidKey() {
        return timeZoneSidKey;
    }

    /**
     * Sets the value of the timeZoneSidKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeZoneSidKey(JAXBElement<String> value) {
        this.timeZoneSidKey = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsCallCenterAutoLogin() {
        return userPermissionsCallCenterAutoLogin;
    }

    /**
     * Sets the value of the userPermissionsCallCenterAutoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsCallCenterAutoLogin(JAXBElement<Boolean> value) {
        this.userPermissionsCallCenterAutoLogin = value;
    }

    /**
     * Gets the value of the userPermissionsInteractionUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsInteractionUser() {
        return userPermissionsInteractionUser;
    }

    /**
     * Sets the value of the userPermissionsInteractionUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsInteractionUser(JAXBElement<Boolean> value) {
        this.userPermissionsInteractionUser = value;
    }

    /**
     * Gets the value of the userPermissionsKnowledgeUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsKnowledgeUser() {
        return userPermissionsKnowledgeUser;
    }

    /**
     * Sets the value of the userPermissionsKnowledgeUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsKnowledgeUser(JAXBElement<Boolean> value) {
        this.userPermissionsKnowledgeUser = value;
    }

    /**
     * Gets the value of the userPermissionsMarketingUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsMarketingUser() {
        return userPermissionsMarketingUser;
    }

    /**
     * Sets the value of the userPermissionsMarketingUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsMarketingUser(JAXBElement<Boolean> value) {
        this.userPermissionsMarketingUser = value;
    }

    /**
     * Gets the value of the userPermissionsMobileUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsMobileUser() {
        return userPermissionsMobileUser;
    }

    /**
     * Sets the value of the userPermissionsMobileUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsMobileUser(JAXBElement<Boolean> value) {
        this.userPermissionsMobileUser = value;
    }

    /**
     * Gets the value of the userPermissionsOfflineUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsOfflineUser() {
        return userPermissionsOfflineUser;
    }

    /**
     * Sets the value of the userPermissionsOfflineUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsOfflineUser(JAXBElement<Boolean> value) {
        this.userPermissionsOfflineUser = value;
    }

    /**
     * Gets the value of the userPermissionsSFContentUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsSFContentUser() {
        return userPermissionsSFContentUser;
    }

    /**
     * Sets the value of the userPermissionsSFContentUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsSFContentUser(JAXBElement<Boolean> value) {
        this.userPermissionsSFContentUser = value;
    }

    /**
     * Gets the value of the userPermissionsSiteforceContributorUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsSiteforceContributorUser() {
        return userPermissionsSiteforceContributorUser;
    }

    /**
     * Sets the value of the userPermissionsSiteforceContributorUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsSiteforceContributorUser(JAXBElement<Boolean> value) {
        this.userPermissionsSiteforceContributorUser = value;
    }

    /**
     * Gets the value of the userPermissionsSiteforcePublisherUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsSiteforcePublisherUser() {
        return userPermissionsSiteforcePublisherUser;
    }

    /**
     * Sets the value of the userPermissionsSiteforcePublisherUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsSiteforcePublisherUser(JAXBElement<Boolean> value) {
        this.userPermissionsSiteforcePublisherUser = value;
    }

    /**
     * Gets the value of the userPermissionsSupportUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPermissionsSupportUser() {
        return userPermissionsSupportUser;
    }

    /**
     * Sets the value of the userPermissionsSupportUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPermissionsSupportUser(JAXBElement<Boolean> value) {
        this.userPermissionsSupportUser = value;
    }

    /**
     * Gets the value of the userPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getUserPreferences() {
        return userPreferences;
    }

    /**
     * Sets the value of the userPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setUserPreferences(JAXBElement<QueryResultType> value) {
        this.userPreferences = value;
    }

    /**
     * Gets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesActivityRemindersPopup() {
        return userPreferencesActivityRemindersPopup;
    }

    /**
     * Sets the value of the userPreferencesActivityRemindersPopup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesActivityRemindersPopup(JAXBElement<Boolean> value) {
        this.userPreferencesActivityRemindersPopup = value;
    }

    /**
     * Gets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesApexPagesDeveloperMode() {
        return userPreferencesApexPagesDeveloperMode;
    }

    /**
     * Sets the value of the userPreferencesApexPagesDeveloperMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesApexPagesDeveloperMode(JAXBElement<Boolean> value) {
        this.userPreferencesApexPagesDeveloperMode = value;
    }

    /**
     * Gets the value of the userPreferencesDisCommentAfterLikeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisCommentAfterLikeEmail() {
        return userPreferencesDisCommentAfterLikeEmail;
    }

    /**
     * Sets the value of the userPreferencesDisCommentAfterLikeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisCommentAfterLikeEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisCommentAfterLikeEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisMentionsCommentEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisMentionsCommentEmail() {
        return userPreferencesDisMentionsCommentEmail;
    }

    /**
     * Sets the value of the userPreferencesDisMentionsCommentEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisMentionsCommentEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisMentionsCommentEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisProfPostCommentEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisProfPostCommentEmail() {
        return userPreferencesDisProfPostCommentEmail;
    }

    /**
     * Sets the value of the userPreferencesDisProfPostCommentEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisProfPostCommentEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisProfPostCommentEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableAllFeedsEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableAllFeedsEmail() {
        return userPreferencesDisableAllFeedsEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableAllFeedsEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableAllFeedsEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableAllFeedsEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableBookmarkEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableBookmarkEmail() {
        return userPreferencesDisableBookmarkEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableBookmarkEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableBookmarkEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableBookmarkEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableChangeCommentEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableChangeCommentEmail() {
        return userPreferencesDisableChangeCommentEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableChangeCommentEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableChangeCommentEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableChangeCommentEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableFileShareNotificationsForApi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableFileShareNotificationsForApi() {
        return userPreferencesDisableFileShareNotificationsForApi;
    }

    /**
     * Sets the value of the userPreferencesDisableFileShareNotificationsForApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableFileShareNotificationsForApi(JAXBElement<Boolean> value) {
        this.userPreferencesDisableFileShareNotificationsForApi = value;
    }

    /**
     * Gets the value of the userPreferencesDisableFollowersEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableFollowersEmail() {
        return userPreferencesDisableFollowersEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableFollowersEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableFollowersEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableFollowersEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableLaterCommentEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableLaterCommentEmail() {
        return userPreferencesDisableLaterCommentEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableLaterCommentEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableLaterCommentEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableLaterCommentEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableLikeEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableLikeEmail() {
        return userPreferencesDisableLikeEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableLikeEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableLikeEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableLikeEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableMentionsPostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableMentionsPostEmail() {
        return userPreferencesDisableMentionsPostEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableMentionsPostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableMentionsPostEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableMentionsPostEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableMessageEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableMessageEmail() {
        return userPreferencesDisableMessageEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableMessageEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableMessageEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableMessageEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableProfilePostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableProfilePostEmail() {
        return userPreferencesDisableProfilePostEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableProfilePostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableProfilePostEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableProfilePostEmail = value;
    }

    /**
     * Gets the value of the userPreferencesDisableSharePostEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesDisableSharePostEmail() {
        return userPreferencesDisableSharePostEmail;
    }

    /**
     * Sets the value of the userPreferencesDisableSharePostEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesDisableSharePostEmail(JAXBElement<Boolean> value) {
        this.userPreferencesDisableSharePostEmail = value;
    }

    /**
     * Gets the value of the userPreferencesEnableAutoSubForFeeds property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesEnableAutoSubForFeeds() {
        return userPreferencesEnableAutoSubForFeeds;
    }

    /**
     * Sets the value of the userPreferencesEnableAutoSubForFeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesEnableAutoSubForFeeds(JAXBElement<Boolean> value) {
        this.userPreferencesEnableAutoSubForFeeds = value;
    }

    /**
     * Gets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesEventRemindersCheckboxDefault() {
        return userPreferencesEventRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesEventRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesEventRemindersCheckboxDefault(JAXBElement<Boolean> value) {
        this.userPreferencesEventRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userPreferencesHideCSNDesktopTask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesHideCSNDesktopTask() {
        return userPreferencesHideCSNDesktopTask;
    }

    /**
     * Sets the value of the userPreferencesHideCSNDesktopTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesHideCSNDesktopTask(JAXBElement<Boolean> value) {
        this.userPreferencesHideCSNDesktopTask = value;
    }

    /**
     * Gets the value of the userPreferencesHideCSNGetChatterMobileTask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesHideCSNGetChatterMobileTask() {
        return userPreferencesHideCSNGetChatterMobileTask;
    }

    /**
     * Sets the value of the userPreferencesHideCSNGetChatterMobileTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesHideCSNGetChatterMobileTask(JAXBElement<Boolean> value) {
        this.userPreferencesHideCSNGetChatterMobileTask = value;
    }

    /**
     * Gets the value of the userPreferencesOptOutOfTouch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesOptOutOfTouch() {
        return userPreferencesOptOutOfTouch;
    }

    /**
     * Sets the value of the userPreferencesOptOutOfTouch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesOptOutOfTouch(JAXBElement<Boolean> value) {
        this.userPreferencesOptOutOfTouch = value;
    }

    /**
     * Gets the value of the userPreferencesReminderSoundOff property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesReminderSoundOff() {
        return userPreferencesReminderSoundOff;
    }

    /**
     * Sets the value of the userPreferencesReminderSoundOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesReminderSoundOff(JAXBElement<Boolean> value) {
        this.userPreferencesReminderSoundOff = value;
    }

    /**
     * Gets the value of the userPreferencesShowCityToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowCityToExternalUsers() {
        return userPreferencesShowCityToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCityToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowCityToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowCityToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowCountryToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowCountryToExternalUsers() {
        return userPreferencesShowCountryToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowCountryToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowCountryToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowCountryToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowEmailToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowEmailToExternalUsers() {
        return userPreferencesShowEmailToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowEmailToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowEmailToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowEmailToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowFaxToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowFaxToExternalUsers() {
        return userPreferencesShowFaxToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowFaxToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowFaxToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowFaxToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowManagerToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowManagerToExternalUsers() {
        return userPreferencesShowManagerToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowManagerToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowManagerToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowManagerToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowMobilePhoneToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowMobilePhoneToExternalUsers() {
        return userPreferencesShowMobilePhoneToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowMobilePhoneToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowMobilePhoneToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowMobilePhoneToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowPostalCodeToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowPostalCodeToExternalUsers() {
        return userPreferencesShowPostalCodeToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowPostalCodeToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowPostalCodeToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowPostalCodeToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowStateToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowStateToExternalUsers() {
        return userPreferencesShowStateToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowStateToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowStateToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowStateToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowStreetAddressToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowStreetAddressToExternalUsers() {
        return userPreferencesShowStreetAddressToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowStreetAddressToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowStreetAddressToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowStreetAddressToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowTitleToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowTitleToExternalUsers() {
        return userPreferencesShowTitleToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowTitleToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowTitleToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowTitleToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesShowWorkPhoneToExternalUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesShowWorkPhoneToExternalUsers() {
        return userPreferencesShowWorkPhoneToExternalUsers;
    }

    /**
     * Sets the value of the userPreferencesShowWorkPhoneToExternalUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesShowWorkPhoneToExternalUsers(JAXBElement<Boolean> value) {
        this.userPreferencesShowWorkPhoneToExternalUsers = value;
    }

    /**
     * Gets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUserPreferencesTaskRemindersCheckboxDefault() {
        return userPreferencesTaskRemindersCheckboxDefault;
    }

    /**
     * Sets the value of the userPreferencesTaskRemindersCheckboxDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUserPreferencesTaskRemindersCheckboxDefault(JAXBElement<Boolean> value) {
        this.userPreferencesTaskRemindersCheckboxDefault = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserRole }{@code >}
     *     
     */
    public JAXBElement<UserRole> getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserRole }{@code >}
     *     
     */
    public void setUserRole(JAXBElement<UserRole> value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the userRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserRoleId() {
        return userRoleId;
    }

    /**
     * Sets the value of the userRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserRoleId(JAXBElement<String> value) {
        this.userRoleId = value;
    }

    /**
     * Gets the value of the userType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserType(JAXBElement<String> value) {
        this.userType = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = value;
    }

    /**
     * Gets the value of the workspaceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkspaceId() {
        return workspaceId;
    }

    /**
     * Sets the value of the workspaceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkspaceId(JAXBElement<String> value) {
        this.workspaceId = value;
    }

}
