
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PermissionSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSet">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Assignments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldPerms" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="IsOwnedByProfile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NamespacePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectPerms" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="PermissionsApiEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsAuthorApex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsBulkApiHardDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCanInsertFeedSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCanUseNewDashboardBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsChatterFileLink" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsConvertLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCreatePackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomSidebarOnAllPages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsCustomizeApplication" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsDistributeFromPersWksp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditCaseComments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditOppLineItemUnitPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditPublicDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReadonlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEditTask" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailAdministration" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEmailTemplateManagement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsEnableNotifications" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsFlowUFLRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsImportLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsInstallPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageAnalyticSnapshots" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageAuthProviders" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageBusinessHourHolidays" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCallCenters" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCases" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageChatterMessages" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageCustomReportTypes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDataIntegrations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageDynamicDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageEmailClientConfig" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageInteraction" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageKnowledge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageKnowledgeImportExport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageLeads" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageRemoteAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageSynonyms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsManageUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsMassInlineEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsModifyAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsNewReportBuilder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPasswordNeverExpires" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsPublishPackaging" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsResetPasswords" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsRunFlow" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsRunReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsScheduleReports" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSendSitRequests" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsSolutionImport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyEntity" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsTransferAnyLead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsUseTeamReassignWizards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewAllData" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewDataCategories" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewMyTeamsDashboards" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PermissionsViewSetup" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Profile" type="{urn:sobject.enterprise.soap.sforce.com}Profile" minOccurs="0"/>
 *         &lt;element name="ProfileId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="SetupEntityAccessItems" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="UserLicense" type="{urn:sobject.enterprise.soap.sforce.com}UserLicense" minOccurs="0"/>
 *         &lt;element name="UserLicenseId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSet", propOrder = {
    "assignments",
    "createdBy",
    "createdById",
    "createdDate",
    "description",
    "fieldPerms",
    "isOwnedByProfile",
    "label",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "name",
    "namespacePrefix",
    "objectPerms",
    "permissionsApiEnabled",
    "permissionsAuthorApex",
    "permissionsBulkApiHardDelete",
    "permissionsCanInsertFeedSystemFields",
    "permissionsCanUseNewDashboardBuilder",
    "permissionsChatterFileLink",
    "permissionsConvertLeads",
    "permissionsCreatePackaging",
    "permissionsCustomSidebarOnAllPages",
    "permissionsCustomizeApplication",
    "permissionsDistributeFromPersWksp",
    "permissionsEditCaseComments",
    "permissionsEditEvent",
    "permissionsEditKnowledge",
    "permissionsEditOppLineItemUnitPrice",
    "permissionsEditPublicDocuments",
    "permissionsEditReadonlyFields",
    "permissionsEditReports",
    "permissionsEditTask",
    "permissionsEmailAdministration",
    "permissionsEmailTemplateManagement",
    "permissionsEnableNotifications",
    "permissionsFlowUFLRequired",
    "permissionsImportLeads",
    "permissionsInstallPackaging",
    "permissionsManageAnalyticSnapshots",
    "permissionsManageAuthProviders",
    "permissionsManageBusinessHourHolidays",
    "permissionsManageCallCenters",
    "permissionsManageCases",
    "permissionsManageCategories",
    "permissionsManageChatterMessages",
    "permissionsManageCustomReportTypes",
    "permissionsManageDashboards",
    "permissionsManageDataCategories",
    "permissionsManageDataIntegrations",
    "permissionsManageDynamicDashboards",
    "permissionsManageEmailClientConfig",
    "permissionsManageInteraction",
    "permissionsManageKnowledge",
    "permissionsManageKnowledgeImportExport",
    "permissionsManageLeads",
    "permissionsManageMobile",
    "permissionsManageRemoteAccess",
    "permissionsManageSolutions",
    "permissionsManageSynonyms",
    "permissionsManageUsers",
    "permissionsMassInlineEdit",
    "permissionsModifyAllData",
    "permissionsNewReportBuilder",
    "permissionsPasswordNeverExpires",
    "permissionsPublishPackaging",
    "permissionsResetPasswords",
    "permissionsRunFlow",
    "permissionsRunReports",
    "permissionsScheduleReports",
    "permissionsSendSitRequests",
    "permissionsSolutionImport",
    "permissionsTransferAnyCase",
    "permissionsTransferAnyEntity",
    "permissionsTransferAnyLead",
    "permissionsUseTeamReassignWizards",
    "permissionsViewAllData",
    "permissionsViewDataCategories",
    "permissionsViewMyTeamsDashboards",
    "permissionsViewSetup",
    "profile",
    "profileId",
    "setupEntityAccessItems",
    "systemModstamp",
    "userLicense",
    "userLicenseId"
})
public class PermissionSet
    extends SObject
{

    @XmlElementRef(name = "Assignments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> assignments;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "Description", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "FieldPerms", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> fieldPerms;
    @XmlElementRef(name = "IsOwnedByProfile", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isOwnedByProfile;
    @XmlElementRef(name = "Label", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> label;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "Name", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "NamespacePrefix", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> namespacePrefix;
    @XmlElementRef(name = "ObjectPerms", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> objectPerms;
    @XmlElementRef(name = "PermissionsApiEnabled", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsApiEnabled;
    @XmlElementRef(name = "PermissionsAuthorApex", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsAuthorApex;
    @XmlElementRef(name = "PermissionsBulkApiHardDelete", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsBulkApiHardDelete;
    @XmlElementRef(name = "PermissionsCanInsertFeedSystemFields", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsCanInsertFeedSystemFields;
    @XmlElementRef(name = "PermissionsCanUseNewDashboardBuilder", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsCanUseNewDashboardBuilder;
    @XmlElementRef(name = "PermissionsChatterFileLink", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsChatterFileLink;
    @XmlElementRef(name = "PermissionsConvertLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsConvertLeads;
    @XmlElementRef(name = "PermissionsCreatePackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsCreatePackaging;
    @XmlElementRef(name = "PermissionsCustomSidebarOnAllPages", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsCustomSidebarOnAllPages;
    @XmlElementRef(name = "PermissionsCustomizeApplication", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsCustomizeApplication;
    @XmlElementRef(name = "PermissionsDistributeFromPersWksp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsDistributeFromPersWksp;
    @XmlElementRef(name = "PermissionsEditCaseComments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditCaseComments;
    @XmlElementRef(name = "PermissionsEditEvent", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditEvent;
    @XmlElementRef(name = "PermissionsEditKnowledge", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditKnowledge;
    @XmlElementRef(name = "PermissionsEditOppLineItemUnitPrice", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditOppLineItemUnitPrice;
    @XmlElementRef(name = "PermissionsEditPublicDocuments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditPublicDocuments;
    @XmlElementRef(name = "PermissionsEditReadonlyFields", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditReadonlyFields;
    @XmlElementRef(name = "PermissionsEditReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditReports;
    @XmlElementRef(name = "PermissionsEditTask", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEditTask;
    @XmlElementRef(name = "PermissionsEmailAdministration", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEmailAdministration;
    @XmlElementRef(name = "PermissionsEmailTemplateManagement", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEmailTemplateManagement;
    @XmlElementRef(name = "PermissionsEnableNotifications", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsEnableNotifications;
    @XmlElementRef(name = "PermissionsFlowUFLRequired", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsFlowUFLRequired;
    @XmlElementRef(name = "PermissionsImportLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsImportLeads;
    @XmlElementRef(name = "PermissionsInstallPackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsInstallPackaging;
    @XmlElementRef(name = "PermissionsManageAnalyticSnapshots", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageAnalyticSnapshots;
    @XmlElementRef(name = "PermissionsManageAuthProviders", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageAuthProviders;
    @XmlElementRef(name = "PermissionsManageBusinessHourHolidays", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageBusinessHourHolidays;
    @XmlElementRef(name = "PermissionsManageCallCenters", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageCallCenters;
    @XmlElementRef(name = "PermissionsManageCases", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageCases;
    @XmlElementRef(name = "PermissionsManageCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageCategories;
    @XmlElementRef(name = "PermissionsManageChatterMessages", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageChatterMessages;
    @XmlElementRef(name = "PermissionsManageCustomReportTypes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageCustomReportTypes;
    @XmlElementRef(name = "PermissionsManageDashboards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageDashboards;
    @XmlElementRef(name = "PermissionsManageDataCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageDataCategories;
    @XmlElementRef(name = "PermissionsManageDataIntegrations", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageDataIntegrations;
    @XmlElementRef(name = "PermissionsManageDynamicDashboards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageDynamicDashboards;
    @XmlElementRef(name = "PermissionsManageEmailClientConfig", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageEmailClientConfig;
    @XmlElementRef(name = "PermissionsManageInteraction", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageInteraction;
    @XmlElementRef(name = "PermissionsManageKnowledge", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageKnowledge;
    @XmlElementRef(name = "PermissionsManageKnowledgeImportExport", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageKnowledgeImportExport;
    @XmlElementRef(name = "PermissionsManageLeads", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageLeads;
    @XmlElementRef(name = "PermissionsManageMobile", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageMobile;
    @XmlElementRef(name = "PermissionsManageRemoteAccess", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageRemoteAccess;
    @XmlElementRef(name = "PermissionsManageSolutions", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageSolutions;
    @XmlElementRef(name = "PermissionsManageSynonyms", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageSynonyms;
    @XmlElementRef(name = "PermissionsManageUsers", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsManageUsers;
    @XmlElementRef(name = "PermissionsMassInlineEdit", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsMassInlineEdit;
    @XmlElementRef(name = "PermissionsModifyAllData", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsModifyAllData;
    @XmlElementRef(name = "PermissionsNewReportBuilder", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsNewReportBuilder;
    @XmlElementRef(name = "PermissionsPasswordNeverExpires", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsPasswordNeverExpires;
    @XmlElementRef(name = "PermissionsPublishPackaging", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsPublishPackaging;
    @XmlElementRef(name = "PermissionsResetPasswords", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsResetPasswords;
    @XmlElementRef(name = "PermissionsRunFlow", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsRunFlow;
    @XmlElementRef(name = "PermissionsRunReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsRunReports;
    @XmlElementRef(name = "PermissionsScheduleReports", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsScheduleReports;
    @XmlElementRef(name = "PermissionsSendSitRequests", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsSendSitRequests;
    @XmlElementRef(name = "PermissionsSolutionImport", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsSolutionImport;
    @XmlElementRef(name = "PermissionsTransferAnyCase", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsTransferAnyCase;
    @XmlElementRef(name = "PermissionsTransferAnyEntity", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsTransferAnyEntity;
    @XmlElementRef(name = "PermissionsTransferAnyLead", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsTransferAnyLead;
    @XmlElementRef(name = "PermissionsUseTeamReassignWizards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsUseTeamReassignWizards;
    @XmlElementRef(name = "PermissionsViewAllData", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsViewAllData;
    @XmlElementRef(name = "PermissionsViewDataCategories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsViewDataCategories;
    @XmlElementRef(name = "PermissionsViewMyTeamsDashboards", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsViewMyTeamsDashboards;
    @XmlElementRef(name = "PermissionsViewSetup", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> permissionsViewSetup;
    @XmlElementRef(name = "Profile", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Profile> profile;
    @XmlElementRef(name = "ProfileId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profileId;
    @XmlElementRef(name = "SetupEntityAccessItems", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> setupEntityAccessItems;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "UserLicense", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<UserLicense> userLicense;
    @XmlElementRef(name = "UserLicenseId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> userLicenseId;

    /**
     * Gets the value of the assignments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getAssignments() {
        return assignments;
    }

    /**
     * Sets the value of the assignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setAssignments(JAXBElement<QueryResultType> value) {
        this.assignments = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the fieldPerms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getFieldPerms() {
        return fieldPerms;
    }

    /**
     * Sets the value of the fieldPerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setFieldPerms(JAXBElement<QueryResultType> value) {
        this.fieldPerms = value;
    }

    /**
     * Gets the value of the isOwnedByProfile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsOwnedByProfile() {
        return isOwnedByProfile;
    }

    /**
     * Sets the value of the isOwnedByProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsOwnedByProfile(JAXBElement<Boolean> value) {
        this.isOwnedByProfile = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLabel(JAXBElement<String> value) {
        this.label = value;
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
     * Gets the value of the namespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNamespacePrefix() {
        return namespacePrefix;
    }

    /**
     * Sets the value of the namespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNamespacePrefix(JAXBElement<String> value) {
        this.namespacePrefix = value;
    }

    /**
     * Gets the value of the objectPerms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getObjectPerms() {
        return objectPerms;
    }

    /**
     * Sets the value of the objectPerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setObjectPerms(JAXBElement<QueryResultType> value) {
        this.objectPerms = value;
    }

    /**
     * Gets the value of the permissionsApiEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsApiEnabled() {
        return permissionsApiEnabled;
    }

    /**
     * Sets the value of the permissionsApiEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsApiEnabled(JAXBElement<Boolean> value) {
        this.permissionsApiEnabled = value;
    }

    /**
     * Gets the value of the permissionsAuthorApex property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsAuthorApex() {
        return permissionsAuthorApex;
    }

    /**
     * Sets the value of the permissionsAuthorApex property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsAuthorApex(JAXBElement<Boolean> value) {
        this.permissionsAuthorApex = value;
    }

    /**
     * Gets the value of the permissionsBulkApiHardDelete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsBulkApiHardDelete() {
        return permissionsBulkApiHardDelete;
    }

    /**
     * Sets the value of the permissionsBulkApiHardDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsBulkApiHardDelete(JAXBElement<Boolean> value) {
        this.permissionsBulkApiHardDelete = value;
    }

    /**
     * Gets the value of the permissionsCanInsertFeedSystemFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsCanInsertFeedSystemFields() {
        return permissionsCanInsertFeedSystemFields;
    }

    /**
     * Sets the value of the permissionsCanInsertFeedSystemFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsCanInsertFeedSystemFields(JAXBElement<Boolean> value) {
        this.permissionsCanInsertFeedSystemFields = value;
    }

    /**
     * Gets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsCanUseNewDashboardBuilder() {
        return permissionsCanUseNewDashboardBuilder;
    }

    /**
     * Sets the value of the permissionsCanUseNewDashboardBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsCanUseNewDashboardBuilder(JAXBElement<Boolean> value) {
        this.permissionsCanUseNewDashboardBuilder = value;
    }

    /**
     * Gets the value of the permissionsChatterFileLink property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsChatterFileLink() {
        return permissionsChatterFileLink;
    }

    /**
     * Sets the value of the permissionsChatterFileLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsChatterFileLink(JAXBElement<Boolean> value) {
        this.permissionsChatterFileLink = value;
    }

    /**
     * Gets the value of the permissionsConvertLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsConvertLeads() {
        return permissionsConvertLeads;
    }

    /**
     * Sets the value of the permissionsConvertLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsConvertLeads(JAXBElement<Boolean> value) {
        this.permissionsConvertLeads = value;
    }

    /**
     * Gets the value of the permissionsCreatePackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsCreatePackaging() {
        return permissionsCreatePackaging;
    }

    /**
     * Sets the value of the permissionsCreatePackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsCreatePackaging(JAXBElement<Boolean> value) {
        this.permissionsCreatePackaging = value;
    }

    /**
     * Gets the value of the permissionsCustomSidebarOnAllPages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsCustomSidebarOnAllPages() {
        return permissionsCustomSidebarOnAllPages;
    }

    /**
     * Sets the value of the permissionsCustomSidebarOnAllPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsCustomSidebarOnAllPages(JAXBElement<Boolean> value) {
        this.permissionsCustomSidebarOnAllPages = value;
    }

    /**
     * Gets the value of the permissionsCustomizeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsCustomizeApplication() {
        return permissionsCustomizeApplication;
    }

    /**
     * Sets the value of the permissionsCustomizeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsCustomizeApplication(JAXBElement<Boolean> value) {
        this.permissionsCustomizeApplication = value;
    }

    /**
     * Gets the value of the permissionsDistributeFromPersWksp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsDistributeFromPersWksp() {
        return permissionsDistributeFromPersWksp;
    }

    /**
     * Sets the value of the permissionsDistributeFromPersWksp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsDistributeFromPersWksp(JAXBElement<Boolean> value) {
        this.permissionsDistributeFromPersWksp = value;
    }

    /**
     * Gets the value of the permissionsEditCaseComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditCaseComments() {
        return permissionsEditCaseComments;
    }

    /**
     * Sets the value of the permissionsEditCaseComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditCaseComments(JAXBElement<Boolean> value) {
        this.permissionsEditCaseComments = value;
    }

    /**
     * Gets the value of the permissionsEditEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditEvent() {
        return permissionsEditEvent;
    }

    /**
     * Sets the value of the permissionsEditEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditEvent(JAXBElement<Boolean> value) {
        this.permissionsEditEvent = value;
    }

    /**
     * Gets the value of the permissionsEditKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditKnowledge() {
        return permissionsEditKnowledge;
    }

    /**
     * Sets the value of the permissionsEditKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditKnowledge(JAXBElement<Boolean> value) {
        this.permissionsEditKnowledge = value;
    }

    /**
     * Gets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditOppLineItemUnitPrice() {
        return permissionsEditOppLineItemUnitPrice;
    }

    /**
     * Sets the value of the permissionsEditOppLineItemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditOppLineItemUnitPrice(JAXBElement<Boolean> value) {
        this.permissionsEditOppLineItemUnitPrice = value;
    }

    /**
     * Gets the value of the permissionsEditPublicDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditPublicDocuments() {
        return permissionsEditPublicDocuments;
    }

    /**
     * Sets the value of the permissionsEditPublicDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditPublicDocuments(JAXBElement<Boolean> value) {
        this.permissionsEditPublicDocuments = value;
    }

    /**
     * Gets the value of the permissionsEditReadonlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditReadonlyFields() {
        return permissionsEditReadonlyFields;
    }

    /**
     * Sets the value of the permissionsEditReadonlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditReadonlyFields(JAXBElement<Boolean> value) {
        this.permissionsEditReadonlyFields = value;
    }

    /**
     * Gets the value of the permissionsEditReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditReports() {
        return permissionsEditReports;
    }

    /**
     * Sets the value of the permissionsEditReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditReports(JAXBElement<Boolean> value) {
        this.permissionsEditReports = value;
    }

    /**
     * Gets the value of the permissionsEditTask property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEditTask() {
        return permissionsEditTask;
    }

    /**
     * Sets the value of the permissionsEditTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEditTask(JAXBElement<Boolean> value) {
        this.permissionsEditTask = value;
    }

    /**
     * Gets the value of the permissionsEmailAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEmailAdministration() {
        return permissionsEmailAdministration;
    }

    /**
     * Sets the value of the permissionsEmailAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEmailAdministration(JAXBElement<Boolean> value) {
        this.permissionsEmailAdministration = value;
    }

    /**
     * Gets the value of the permissionsEmailTemplateManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEmailTemplateManagement() {
        return permissionsEmailTemplateManagement;
    }

    /**
     * Sets the value of the permissionsEmailTemplateManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEmailTemplateManagement(JAXBElement<Boolean> value) {
        this.permissionsEmailTemplateManagement = value;
    }

    /**
     * Gets the value of the permissionsEnableNotifications property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsEnableNotifications() {
        return permissionsEnableNotifications;
    }

    /**
     * Sets the value of the permissionsEnableNotifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsEnableNotifications(JAXBElement<Boolean> value) {
        this.permissionsEnableNotifications = value;
    }

    /**
     * Gets the value of the permissionsFlowUFLRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsFlowUFLRequired() {
        return permissionsFlowUFLRequired;
    }

    /**
     * Sets the value of the permissionsFlowUFLRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsFlowUFLRequired(JAXBElement<Boolean> value) {
        this.permissionsFlowUFLRequired = value;
    }

    /**
     * Gets the value of the permissionsImportLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsImportLeads() {
        return permissionsImportLeads;
    }

    /**
     * Sets the value of the permissionsImportLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsImportLeads(JAXBElement<Boolean> value) {
        this.permissionsImportLeads = value;
    }

    /**
     * Gets the value of the permissionsInstallPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsInstallPackaging() {
        return permissionsInstallPackaging;
    }

    /**
     * Sets the value of the permissionsInstallPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsInstallPackaging(JAXBElement<Boolean> value) {
        this.permissionsInstallPackaging = value;
    }

    /**
     * Gets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageAnalyticSnapshots() {
        return permissionsManageAnalyticSnapshots;
    }

    /**
     * Sets the value of the permissionsManageAnalyticSnapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageAnalyticSnapshots(JAXBElement<Boolean> value) {
        this.permissionsManageAnalyticSnapshots = value;
    }

    /**
     * Gets the value of the permissionsManageAuthProviders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageAuthProviders() {
        return permissionsManageAuthProviders;
    }

    /**
     * Sets the value of the permissionsManageAuthProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageAuthProviders(JAXBElement<Boolean> value) {
        this.permissionsManageAuthProviders = value;
    }

    /**
     * Gets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageBusinessHourHolidays() {
        return permissionsManageBusinessHourHolidays;
    }

    /**
     * Sets the value of the permissionsManageBusinessHourHolidays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageBusinessHourHolidays(JAXBElement<Boolean> value) {
        this.permissionsManageBusinessHourHolidays = value;
    }

    /**
     * Gets the value of the permissionsManageCallCenters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageCallCenters() {
        return permissionsManageCallCenters;
    }

    /**
     * Sets the value of the permissionsManageCallCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageCallCenters(JAXBElement<Boolean> value) {
        this.permissionsManageCallCenters = value;
    }

    /**
     * Gets the value of the permissionsManageCases property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageCases() {
        return permissionsManageCases;
    }

    /**
     * Sets the value of the permissionsManageCases property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageCases(JAXBElement<Boolean> value) {
        this.permissionsManageCases = value;
    }

    /**
     * Gets the value of the permissionsManageCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageCategories() {
        return permissionsManageCategories;
    }

    /**
     * Sets the value of the permissionsManageCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageCategories(JAXBElement<Boolean> value) {
        this.permissionsManageCategories = value;
    }

    /**
     * Gets the value of the permissionsManageChatterMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageChatterMessages() {
        return permissionsManageChatterMessages;
    }

    /**
     * Sets the value of the permissionsManageChatterMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageChatterMessages(JAXBElement<Boolean> value) {
        this.permissionsManageChatterMessages = value;
    }

    /**
     * Gets the value of the permissionsManageCustomReportTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageCustomReportTypes() {
        return permissionsManageCustomReportTypes;
    }

    /**
     * Sets the value of the permissionsManageCustomReportTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageCustomReportTypes(JAXBElement<Boolean> value) {
        this.permissionsManageCustomReportTypes = value;
    }

    /**
     * Gets the value of the permissionsManageDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageDashboards() {
        return permissionsManageDashboards;
    }

    /**
     * Sets the value of the permissionsManageDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageDashboards(JAXBElement<Boolean> value) {
        this.permissionsManageDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageDataCategories() {
        return permissionsManageDataCategories;
    }

    /**
     * Sets the value of the permissionsManageDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageDataCategories(JAXBElement<Boolean> value) {
        this.permissionsManageDataCategories = value;
    }

    /**
     * Gets the value of the permissionsManageDataIntegrations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageDataIntegrations() {
        return permissionsManageDataIntegrations;
    }

    /**
     * Sets the value of the permissionsManageDataIntegrations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageDataIntegrations(JAXBElement<Boolean> value) {
        this.permissionsManageDataIntegrations = value;
    }

    /**
     * Gets the value of the permissionsManageDynamicDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageDynamicDashboards() {
        return permissionsManageDynamicDashboards;
    }

    /**
     * Sets the value of the permissionsManageDynamicDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageDynamicDashboards(JAXBElement<Boolean> value) {
        this.permissionsManageDynamicDashboards = value;
    }

    /**
     * Gets the value of the permissionsManageEmailClientConfig property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageEmailClientConfig() {
        return permissionsManageEmailClientConfig;
    }

    /**
     * Sets the value of the permissionsManageEmailClientConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageEmailClientConfig(JAXBElement<Boolean> value) {
        this.permissionsManageEmailClientConfig = value;
    }

    /**
     * Gets the value of the permissionsManageInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageInteraction() {
        return permissionsManageInteraction;
    }

    /**
     * Sets the value of the permissionsManageInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageInteraction(JAXBElement<Boolean> value) {
        this.permissionsManageInteraction = value;
    }

    /**
     * Gets the value of the permissionsManageKnowledge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageKnowledge() {
        return permissionsManageKnowledge;
    }

    /**
     * Sets the value of the permissionsManageKnowledge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageKnowledge(JAXBElement<Boolean> value) {
        this.permissionsManageKnowledge = value;
    }

    /**
     * Gets the value of the permissionsManageKnowledgeImportExport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageKnowledgeImportExport() {
        return permissionsManageKnowledgeImportExport;
    }

    /**
     * Sets the value of the permissionsManageKnowledgeImportExport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageKnowledgeImportExport(JAXBElement<Boolean> value) {
        this.permissionsManageKnowledgeImportExport = value;
    }

    /**
     * Gets the value of the permissionsManageLeads property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageLeads() {
        return permissionsManageLeads;
    }

    /**
     * Sets the value of the permissionsManageLeads property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageLeads(JAXBElement<Boolean> value) {
        this.permissionsManageLeads = value;
    }

    /**
     * Gets the value of the permissionsManageMobile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageMobile() {
        return permissionsManageMobile;
    }

    /**
     * Sets the value of the permissionsManageMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageMobile(JAXBElement<Boolean> value) {
        this.permissionsManageMobile = value;
    }

    /**
     * Gets the value of the permissionsManageRemoteAccess property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageRemoteAccess() {
        return permissionsManageRemoteAccess;
    }

    /**
     * Sets the value of the permissionsManageRemoteAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageRemoteAccess(JAXBElement<Boolean> value) {
        this.permissionsManageRemoteAccess = value;
    }

    /**
     * Gets the value of the permissionsManageSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageSolutions() {
        return permissionsManageSolutions;
    }

    /**
     * Sets the value of the permissionsManageSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageSolutions(JAXBElement<Boolean> value) {
        this.permissionsManageSolutions = value;
    }

    /**
     * Gets the value of the permissionsManageSynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageSynonyms() {
        return permissionsManageSynonyms;
    }

    /**
     * Sets the value of the permissionsManageSynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageSynonyms(JAXBElement<Boolean> value) {
        this.permissionsManageSynonyms = value;
    }

    /**
     * Gets the value of the permissionsManageUsers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsManageUsers() {
        return permissionsManageUsers;
    }

    /**
     * Sets the value of the permissionsManageUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsManageUsers(JAXBElement<Boolean> value) {
        this.permissionsManageUsers = value;
    }

    /**
     * Gets the value of the permissionsMassInlineEdit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsMassInlineEdit() {
        return permissionsMassInlineEdit;
    }

    /**
     * Sets the value of the permissionsMassInlineEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsMassInlineEdit(JAXBElement<Boolean> value) {
        this.permissionsMassInlineEdit = value;
    }

    /**
     * Gets the value of the permissionsModifyAllData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsModifyAllData() {
        return permissionsModifyAllData;
    }

    /**
     * Sets the value of the permissionsModifyAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsModifyAllData(JAXBElement<Boolean> value) {
        this.permissionsModifyAllData = value;
    }

    /**
     * Gets the value of the permissionsNewReportBuilder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsNewReportBuilder() {
        return permissionsNewReportBuilder;
    }

    /**
     * Sets the value of the permissionsNewReportBuilder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsNewReportBuilder(JAXBElement<Boolean> value) {
        this.permissionsNewReportBuilder = value;
    }

    /**
     * Gets the value of the permissionsPasswordNeverExpires property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsPasswordNeverExpires() {
        return permissionsPasswordNeverExpires;
    }

    /**
     * Sets the value of the permissionsPasswordNeverExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsPasswordNeverExpires(JAXBElement<Boolean> value) {
        this.permissionsPasswordNeverExpires = value;
    }

    /**
     * Gets the value of the permissionsPublishPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsPublishPackaging() {
        return permissionsPublishPackaging;
    }

    /**
     * Sets the value of the permissionsPublishPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsPublishPackaging(JAXBElement<Boolean> value) {
        this.permissionsPublishPackaging = value;
    }

    /**
     * Gets the value of the permissionsResetPasswords property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsResetPasswords() {
        return permissionsResetPasswords;
    }

    /**
     * Sets the value of the permissionsResetPasswords property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsResetPasswords(JAXBElement<Boolean> value) {
        this.permissionsResetPasswords = value;
    }

    /**
     * Gets the value of the permissionsRunFlow property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsRunFlow() {
        return permissionsRunFlow;
    }

    /**
     * Sets the value of the permissionsRunFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsRunFlow(JAXBElement<Boolean> value) {
        this.permissionsRunFlow = value;
    }

    /**
     * Gets the value of the permissionsRunReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsRunReports() {
        return permissionsRunReports;
    }

    /**
     * Sets the value of the permissionsRunReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsRunReports(JAXBElement<Boolean> value) {
        this.permissionsRunReports = value;
    }

    /**
     * Gets the value of the permissionsScheduleReports property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsScheduleReports() {
        return permissionsScheduleReports;
    }

    /**
     * Sets the value of the permissionsScheduleReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsScheduleReports(JAXBElement<Boolean> value) {
        this.permissionsScheduleReports = value;
    }

    /**
     * Gets the value of the permissionsSendSitRequests property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsSendSitRequests() {
        return permissionsSendSitRequests;
    }

    /**
     * Sets the value of the permissionsSendSitRequests property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsSendSitRequests(JAXBElement<Boolean> value) {
        this.permissionsSendSitRequests = value;
    }

    /**
     * Gets the value of the permissionsSolutionImport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsSolutionImport() {
        return permissionsSolutionImport;
    }

    /**
     * Sets the value of the permissionsSolutionImport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsSolutionImport(JAXBElement<Boolean> value) {
        this.permissionsSolutionImport = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyCase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsTransferAnyCase() {
        return permissionsTransferAnyCase;
    }

    /**
     * Sets the value of the permissionsTransferAnyCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsTransferAnyCase(JAXBElement<Boolean> value) {
        this.permissionsTransferAnyCase = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyEntity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsTransferAnyEntity() {
        return permissionsTransferAnyEntity;
    }

    /**
     * Sets the value of the permissionsTransferAnyEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsTransferAnyEntity(JAXBElement<Boolean> value) {
        this.permissionsTransferAnyEntity = value;
    }

    /**
     * Gets the value of the permissionsTransferAnyLead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsTransferAnyLead() {
        return permissionsTransferAnyLead;
    }

    /**
     * Sets the value of the permissionsTransferAnyLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsTransferAnyLead(JAXBElement<Boolean> value) {
        this.permissionsTransferAnyLead = value;
    }

    /**
     * Gets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsUseTeamReassignWizards() {
        return permissionsUseTeamReassignWizards;
    }

    /**
     * Sets the value of the permissionsUseTeamReassignWizards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsUseTeamReassignWizards(JAXBElement<Boolean> value) {
        this.permissionsUseTeamReassignWizards = value;
    }

    /**
     * Gets the value of the permissionsViewAllData property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsViewAllData() {
        return permissionsViewAllData;
    }

    /**
     * Sets the value of the permissionsViewAllData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsViewAllData(JAXBElement<Boolean> value) {
        this.permissionsViewAllData = value;
    }

    /**
     * Gets the value of the permissionsViewDataCategories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsViewDataCategories() {
        return permissionsViewDataCategories;
    }

    /**
     * Sets the value of the permissionsViewDataCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsViewDataCategories(JAXBElement<Boolean> value) {
        this.permissionsViewDataCategories = value;
    }

    /**
     * Gets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsViewMyTeamsDashboards() {
        return permissionsViewMyTeamsDashboards;
    }

    /**
     * Sets the value of the permissionsViewMyTeamsDashboards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsViewMyTeamsDashboards(JAXBElement<Boolean> value) {
        this.permissionsViewMyTeamsDashboards = value;
    }

    /**
     * Gets the value of the permissionsViewSetup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPermissionsViewSetup() {
        return permissionsViewSetup;
    }

    /**
     * Sets the value of the permissionsViewSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPermissionsViewSetup(JAXBElement<Boolean> value) {
        this.permissionsViewSetup = value;
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
     * Gets the value of the setupEntityAccessItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getSetupEntityAccessItems() {
        return setupEntityAccessItems;
    }

    /**
     * Sets the value of the setupEntityAccessItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setSetupEntityAccessItems(JAXBElement<QueryResultType> value) {
        this.setupEntityAccessItems = value;
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
     * Gets the value of the userLicense property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserLicense }{@code >}
     *     
     */
    public JAXBElement<UserLicense> getUserLicense() {
        return userLicense;
    }

    /**
     * Sets the value of the userLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserLicense }{@code >}
     *     
     */
    public void setUserLicense(JAXBElement<UserLicense> value) {
        this.userLicense = value;
    }

    /**
     * Gets the value of the userLicenseId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUserLicenseId() {
        return userLicenseId;
    }

    /**
     * Sets the value of the userLicenseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUserLicenseId(JAXBElement<String> value) {
        this.userLicenseId = value;
    }

}
