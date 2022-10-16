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
import com.cloudmersive.client.gac.model.MsgAttachment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of converting an MSG file to HTML string
 */
@ApiModel(description = "Result of converting an MSG file to HTML string")
@JsonPropertyOrder({
  MsgToHtmlResult.JSON_PROPERTY_SUCCESSFUL,
  MsgToHtmlResult.JSON_PROPERTY_CONTENT,
  MsgToHtmlResult.JSON_PROPERTY_BODY,
  MsgToHtmlResult.JSON_PROPERTY_FROM,
  MsgToHtmlResult.JSON_PROPERTY_TO,
  MsgToHtmlResult.JSON_PROPERTY_CC,
  MsgToHtmlResult.JSON_PROPERTY_RECEIVED_TIME,
  MsgToHtmlResult.JSON_PROPERTY_SUBJECT,
  MsgToHtmlResult.JSON_PROPERTY_ATTACHMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class MsgToHtmlResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTENT = "Content";
  private String content;

  public static final String JSON_PROPERTY_BODY = "Body";
  private String body;

  public static final String JSON_PROPERTY_FROM = "From";
  private String from;

  public static final String JSON_PROPERTY_TO = "To";
  private String to;

  public static final String JSON_PROPERTY_CC = "Cc";
  private String cc;

  public static final String JSON_PROPERTY_RECEIVED_TIME = "ReceivedTime";
  private String receivedTime;

  public static final String JSON_PROPERTY_SUBJECT = "Subject";
  private String subject;

  public static final String JSON_PROPERTY_ATTACHMENTS = "Attachments";
  private List<MsgAttachment> attachments = null;

  public MsgToHtmlResult() { 
  }

  public MsgToHtmlResult successful(Boolean successful) {
    
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


  public MsgToHtmlResult content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * An HTML string version of the MSG file
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An HTML string version of the MSG file")
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContent() {
    return content;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContent(String content) {
    this.content = content;
  }


  public MsgToHtmlResult body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * The main body of the MSG file&#39;s email as an HTML string
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The main body of the MSG file's email as an HTML string")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public MsgToHtmlResult from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * The From sender of the MSG file&#39;s email
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The From sender of the MSG file's email")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrom(String from) {
    this.from = from;
  }


  public MsgToHtmlResult to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The To recipients of the MSG file&#39;s email
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The To recipients of the MSG file's email")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTo(String to) {
    this.to = to;
  }


  public MsgToHtmlResult cc(String cc) {
    
    this.cc = cc;
    return this;
  }

   /**
   * The CC recipients of the MSG file&#39;s email
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CC recipients of the MSG file's email")
  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCc() {
    return cc;
  }


  @JsonProperty(JSON_PROPERTY_CC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCc(String cc) {
    this.cc = cc;
  }


  public MsgToHtmlResult receivedTime(String receivedTime) {
    
    this.receivedTime = receivedTime;
    return this;
  }

   /**
   * The time that the MSG file&#39;s email was received
   * @return receivedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time that the MSG file's email was received")
  @JsonProperty(JSON_PROPERTY_RECEIVED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReceivedTime() {
    return receivedTime;
  }


  @JsonProperty(JSON_PROPERTY_RECEIVED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReceivedTime(String receivedTime) {
    this.receivedTime = receivedTime;
  }


  public MsgToHtmlResult subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the MSG file&#39;s email
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of the MSG file's email")
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


  public MsgToHtmlResult attachments(List<MsgAttachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public MsgToHtmlResult addAttachmentsItem(MsgAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of all attachments for the MSG file
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of all attachments for the MSG file")
  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MsgAttachment> getAttachments() {
    return attachments;
  }


  @JsonProperty(JSON_PROPERTY_ATTACHMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttachments(List<MsgAttachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgToHtmlResult msgToHtmlResult = (MsgToHtmlResult) o;
    return Objects.equals(this.successful, msgToHtmlResult.successful) &&
        Objects.equals(this.content, msgToHtmlResult.content) &&
        Objects.equals(this.body, msgToHtmlResult.body) &&
        Objects.equals(this.from, msgToHtmlResult.from) &&
        Objects.equals(this.to, msgToHtmlResult.to) &&
        Objects.equals(this.cc, msgToHtmlResult.cc) &&
        Objects.equals(this.receivedTime, msgToHtmlResult.receivedTime) &&
        Objects.equals(this.subject, msgToHtmlResult.subject) &&
        Objects.equals(this.attachments, msgToHtmlResult.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, content, body, from, to, cc, receivedTime, subject, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgToHtmlResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    receivedTime: ").append(toIndentedString(receivedTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

