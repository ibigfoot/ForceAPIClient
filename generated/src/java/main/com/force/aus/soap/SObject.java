
package com.force.aus.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldsToNull" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Id" type="{urn:enterprise.soap.sforce.com}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sObject", propOrder = {
    "fieldsToNull",
    "id"
})
@XmlSeeAlso({
    User.class,
    UserLicense.class,
    ContentVersionHistory.class,
    Attachment.class,
    ContentDocument.class,
    MetadataContainerMember.class,
    LoginHistory.class,
    FiscalYearSettings.class,
    TraceFlag.class,
    IDEPerspective.class,
    QueueSobject.class,
    Lead.class,
    Group.class,
    CaseShare.class,
    FeedTrackedChange.class,
    PushTopic.class,
    UserProfileFeed.class,
    ProcessInstanceHistory.class,
    ContentDocumentFeed.class,
    CaseFeed.class,
    RecordType.class,
    DashboardComponent.class,
    FeedLike.class,
    Domain.class,
    Profile.class,
    CaseComment.class,
    CaseTeamMember.class,
    SolutionFeed.class,
    ApexPage.class,
    Campaign.class,
    ApexExecutionOverlayAction.class,
    UserFeed.class,
    WebLink.class,
    PermissionSetAssignment.class,
    DocumentAttachmentMap.class,
    Task.class,
    CaseContactRole.class,
    ActivityHistory.class,
    ContentVersion.class,
    CustomConsoleComponent.class,
    EntitySubscription.class,
    Period.class,
    CaseHistory.class,
    OpportunityStage.class,
    Dashboard.class,
    CategoryNode.class,
    FeedItem.class,
    ApexLog.class,
    Product2 .class,
    Pricebook2 .class,
    ProcessInstanceStep.class,
    BusinessHours.class,
    LeadShare.class,
    Idea.class,
    DashboardFeed.class,
    AccountPartner.class,
    Product2Feed.class,
    CronTrigger.class,
    NoteAndAttachment.class,
    OpportunityShare.class,
    Vote.class,
    Holiday.class,
    CollaborationGroupFeed.class,
    ApexComponent.class,
    SiteHistory.class,
    Solution.class,
    ContactHistory.class,
    EmailStatus.class,
    CollaborationGroup.class,
    DomainSite.class,
    PricebookEntry.class,
    OpportunityFieldHistory.class,
    CampaignMemberStatus.class,
    AssetFeed.class,
    ApexTestQueueItem.class,
    ApexTestResult.class,
    ProcessInstance.class,
    ForecastShare.class,
    Note.class,
    TaskFeed.class,
    NewsFeed.class,
    UserRecordAccess.class,
    OpportunityLineItem.class,
    AsyncApexJob.class,
    CaseTeamTemplate.class,
    ApexTrigger.class,
    Approval.class,
    ObjectPermissions.class,
    CallCenter.class,
    AccountContactRole.class,
    ReportFeed.class,
    ContractStatus.class,
    CampaignMember.class,
    CollaborationGroupMemberRequest.class,
    IDEWorkspace.class,
    SetupEntityAccess.class,
    Organization.class,
    IdeaComment.class,
    LeadFeed.class,
    ContentDocumentHistory.class,
    OpportunityCompetitor.class,
    ContainerAsyncRequest.class,
    UserRole.class,
    CaseStatus.class,
    HashtagDefinition.class,
    CaseTeamTemplateMember.class,
    Case.class,
    Asset.class,
    TaskStatus.class,
    FeedComment.class,
    ChatterActivity.class,
    ContractContactRole.class,
    OpportunityContactRole.class,
    ContactFeed.class,
    Site.class,
    ContractFeed.class,
    AdditionalNumber.class,
    Event.class,
    OpportunityPartner.class,
    CampaignShare.class,
    EventRelation.class,
    ContactShare.class,
    CaseSolution.class,
    SiteFeed.class,
    StaticResource.class,
    EmailTemplate.class,
    ContractHistory.class,
    DashboardComponentFeed.class,
    OrgWideEmailAddress.class,
    AssignmentRule.class,
    CollaborationGroupMember.class,
    PartnerRole.class,
    BusinessProcess.class,
    PermissionSet.class,
    ProcessInstanceWorkitem.class,
    ContentDocumentLink.class,
    OpportunityHistory.class,
    SolutionHistory.class,
    EmailServicesAddress.class,
    Report.class,
    OpportunityFeed.class,
    Account.class,
    SolutionStatus.class,
    CaseTeamTemplateRecord.class,
    AggregateResult.class,
    OpenActivity.class,
    BrandTemplate.class,
    AccountHistory.class,
    FieldPermissions.class,
    MailmergeTemplate.class,
    Opportunity.class,
    CategoryData.class,
    ApexClass.class,
    Partner.class,
    AccountShare.class,
    UserPreference.class,
    GroupMember.class,
    Community.class,
    Document.class,
    Folder.class,
    CaseTeamRole.class,
    EventFeed.class,
    LeadStatus.class,
    EmailServicesFunction.class,
    Contact.class,
    MetadataContainer.class,
    LeadHistory.class,
    AccountFeed.class,
    TaskPriority.class,
    Contract.class,
    Name.class,
    CollaborationInvitation.class,
    CampaignFeed.class
})
public class SObject {

    @XmlElement(nillable = true)
    protected List<String> fieldsToNull;
    @XmlElement(name = "Id", required = true, nillable = true)
    protected String id;

    /**
     * Gets the value of the fieldsToNull property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldsToNull property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldsToNull().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFieldsToNull() {
        if (fieldsToNull == null) {
            fieldsToNull = new ArrayList<String>();
        }
        return this.fieldsToNull;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
