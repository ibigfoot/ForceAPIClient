
package com.force.aus.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Idea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Idea">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:sobject.enterprise.soap.sforce.com}sObject">
 *       &lt;sequence>
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Categories" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *         &lt;element name="Community" type="{urn:sobject.enterprise.soap.sforce.com}Community" minOccurs="0"/>
 *         &lt;element name="CommunityId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="CreatedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsHtml" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastComment" type="{urn:sobject.enterprise.soap.sforce.com}IdeaComment" minOccurs="0"/>
 *         &lt;element name="LastCommentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastCommentId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedBy" type="{urn:sobject.enterprise.soap.sforce.com}User" minOccurs="0"/>
 *         &lt;element name="LastModifiedById" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="LastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumComments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ParentIdeaId" type="{urn:enterprise.soap.sforce.com}ID" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SystemModstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VoteScore" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VoteTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Votes" type="{urn:enterprise.soap.sforce.com}QueryResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Idea", propOrder = {
    "body",
    "categories",
    "comments",
    "community",
    "communityId",
    "createdBy",
    "createdById",
    "createdDate",
    "isDeleted",
    "isHtml",
    "isLocked",
    "lastComment",
    "lastCommentDate",
    "lastCommentId",
    "lastModifiedBy",
    "lastModifiedById",
    "lastModifiedDate",
    "numComments",
    "parentIdeaId",
    "status",
    "systemModstamp",
    "title",
    "voteScore",
    "voteTotal",
    "votes"
})
public class Idea
    extends SObject
{

    @XmlElementRef(name = "Body", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> body;
    @XmlElementRef(name = "Categories", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categories;
    @XmlElementRef(name = "Comments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> comments;
    @XmlElementRef(name = "Community", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Community> community;
    @XmlElementRef(name = "CommunityId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> communityId;
    @XmlElementRef(name = "CreatedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> createdBy;
    @XmlElementRef(name = "CreatedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdById;
    @XmlElementRef(name = "CreatedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createdDate;
    @XmlElementRef(name = "IsDeleted", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isDeleted;
    @XmlElementRef(name = "IsHtml", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isHtml;
    @XmlElementRef(name = "IsLocked", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isLocked;
    @XmlElementRef(name = "LastComment", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<IdeaComment> lastComment;
    @XmlElementRef(name = "LastCommentDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastCommentDate;
    @XmlElementRef(name = "LastCommentId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastCommentId;
    @XmlElementRef(name = "LastModifiedBy", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<User> lastModifiedBy;
    @XmlElementRef(name = "LastModifiedById", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastModifiedById;
    @XmlElementRef(name = "LastModifiedDate", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastModifiedDate;
    @XmlElementRef(name = "NumComments", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numComments;
    @XmlElementRef(name = "ParentIdeaId", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentIdeaId;
    @XmlElementRef(name = "Status", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "SystemModstamp", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> systemModstamp;
    @XmlElementRef(name = "Title", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "VoteScore", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> voteScore;
    @XmlElementRef(name = "VoteTotal", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> voteTotal;
    @XmlElementRef(name = "Votes", namespace = "urn:sobject.enterprise.soap.sforce.com", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryResultType> votes;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBody(JAXBElement<String> value) {
        this.body = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategories(JAXBElement<String> value) {
        this.categories = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setComments(JAXBElement<QueryResultType> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Community }{@code >}
     *     
     */
    public JAXBElement<Community> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Community }{@code >}
     *     
     */
    public void setCommunity(JAXBElement<Community> value) {
        this.community = value;
    }

    /**
     * Gets the value of the communityId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunityId() {
        return communityId;
    }

    /**
     * Sets the value of the communityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunityId(JAXBElement<String> value) {
        this.communityId = value;
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
     * Gets the value of the isDeleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsDeleted() {
        return isDeleted;
    }

    /**
     * Sets the value of the isDeleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsDeleted(JAXBElement<Boolean> value) {
        this.isDeleted = value;
    }

    /**
     * Gets the value of the isHtml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsHtml() {
        return isHtml;
    }

    /**
     * Sets the value of the isHtml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsHtml(JAXBElement<Boolean> value) {
        this.isHtml = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsLocked(JAXBElement<Boolean> value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the lastComment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdeaComment }{@code >}
     *     
     */
    public JAXBElement<IdeaComment> getLastComment() {
        return lastComment;
    }

    /**
     * Sets the value of the lastComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdeaComment }{@code >}
     *     
     */
    public void setLastComment(JAXBElement<IdeaComment> value) {
        this.lastComment = value;
    }

    /**
     * Gets the value of the lastCommentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastCommentDate() {
        return lastCommentDate;
    }

    /**
     * Sets the value of the lastCommentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastCommentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastCommentDate = value;
    }

    /**
     * Gets the value of the lastCommentId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastCommentId() {
        return lastCommentId;
    }

    /**
     * Sets the value of the lastCommentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastCommentId(JAXBElement<String> value) {
        this.lastCommentId = value;
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
     * Gets the value of the numComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumComments() {
        return numComments;
    }

    /**
     * Sets the value of the numComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumComments(JAXBElement<Integer> value) {
        this.numComments = value;
    }

    /**
     * Gets the value of the parentIdeaId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentIdeaId() {
        return parentIdeaId;
    }

    /**
     * Sets the value of the parentIdeaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentIdeaId(JAXBElement<String> value) {
        this.parentIdeaId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
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
     * Gets the value of the voteScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVoteScore() {
        return voteScore;
    }

    /**
     * Sets the value of the voteScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVoteScore(JAXBElement<Double> value) {
        this.voteScore = value;
    }

    /**
     * Gets the value of the voteTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getVoteTotal() {
        return voteTotal;
    }

    /**
     * Sets the value of the voteTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setVoteTotal(JAXBElement<Double> value) {
        this.voteTotal = value;
    }

    /**
     * Gets the value of the votes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public JAXBElement<QueryResultType> getVotes() {
        return votes;
    }

    /**
     * Sets the value of the votes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}
     *     
     */
    public void setVotes(JAXBElement<QueryResultType> value) {
        this.votes = value;
    }

}
