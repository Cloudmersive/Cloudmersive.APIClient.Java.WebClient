/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of an autodetect/get-info operation
 */
@ApiModel(description = "Result of an autodetect/get-info operation")
@JsonPropertyOrder({
  PdfMetadata.JSON_PROPERTY_SUCCESSFUL,
  PdfMetadata.JSON_PROPERTY_TITLE,
  PdfMetadata.JSON_PROPERTY_KEYWORDS,
  PdfMetadata.JSON_PROPERTY_SUBJECT,
  PdfMetadata.JSON_PROPERTY_AUTHOR,
  PdfMetadata.JSON_PROPERTY_CREATOR,
  PdfMetadata.JSON_PROPERTY_DATE_MODIFIED,
  PdfMetadata.JSON_PROPERTY_DATE_CREATED,
  PdfMetadata.JSON_PROPERTY_PAGE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class PdfMetadata {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private String title;

  public static final String JSON_PROPERTY_KEYWORDS = "Keywords";
  private String keywords;

  public static final String JSON_PROPERTY_SUBJECT = "Subject";
  private String subject;

  public static final String JSON_PROPERTY_AUTHOR = "Author";
  private String author;

  public static final String JSON_PROPERTY_CREATOR = "Creator";
  private String creator;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "DateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_DATE_CREATED = "DateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_PAGE_COUNT = "PageCount";
  private Integer pageCount;

  public PdfMetadata() { 
  }

  public PdfMetadata successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public PdfMetadata title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the document
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the document")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public PdfMetadata keywords(String keywords) {
    
    this.keywords = keywords;
    return this;
  }

   /**
   * Keywords of the document
   * @return keywords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Keywords of the document")
  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeywords() {
    return keywords;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  public PdfMetadata subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject of the document
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject of the document")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public PdfMetadata author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * User name of the creator/author of the document, if available, null if not available
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User name of the creator/author of the document, if available, null if not available")
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthor() {
    return author;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthor(String author) {
    this.author = author;
  }


  public PdfMetadata creator(String creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Creator of the document
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creator of the document")
  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreator() {
    return creator;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreator(String creator) {
    this.creator = creator;
  }


  public PdfMetadata dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * The timestamp that the document was last modified, if available, null if not available
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp that the document was last modified, if available, null if not available")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  public PdfMetadata dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * The timestamp that the document was created, if available, null if not available
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp that the document was created, if available, null if not available")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public PdfMetadata pageCount(Integer pageCount) {
    
    this.pageCount = pageCount;
    return this;
  }

   /**
   * The number of pages in the document
   * @return pageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of pages in the document")
  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageCount() {
    return pageCount;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfMetadata pdfMetadata = (PdfMetadata) o;
    return Objects.equals(this.successful, pdfMetadata.successful) &&
        Objects.equals(this.title, pdfMetadata.title) &&
        Objects.equals(this.keywords, pdfMetadata.keywords) &&
        Objects.equals(this.subject, pdfMetadata.subject) &&
        Objects.equals(this.author, pdfMetadata.author) &&
        Objects.equals(this.creator, pdfMetadata.creator) &&
        Objects.equals(this.dateModified, pdfMetadata.dateModified) &&
        Objects.equals(this.dateCreated, pdfMetadata.dateCreated) &&
        Objects.equals(this.pageCount, pdfMetadata.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, title, keywords, subject, author, creator, dateModified, dateCreated, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfMetadata {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

