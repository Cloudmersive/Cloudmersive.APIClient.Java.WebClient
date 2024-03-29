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
import com.cloudmersive.client.gac.model.DocxTopLevelComment;
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
 * Result of getting comments hierarchically from a Word Document DOCX
 */
@ApiModel(description = "Result of getting comments hierarchically from a Word Document DOCX")
@JsonPropertyOrder({
  GetDocxCommentsHierarchicalResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxCommentsHierarchicalResponse.JSON_PROPERTY_COMMENTS,
  GetDocxCommentsHierarchicalResponse.JSON_PROPERTY_TOP_LEVEL_COMMENT_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class GetDocxCommentsHierarchicalResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COMMENTS = "Comments";
  private List<DocxTopLevelComment> comments = null;

  public static final String JSON_PROPERTY_TOP_LEVEL_COMMENT_COUNT = "TopLevelCommentCount";
  private Integer topLevelCommentCount;

  public GetDocxCommentsHierarchicalResponse() { 
  }

  public GetDocxCommentsHierarchicalResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
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


  public GetDocxCommentsHierarchicalResponse comments(List<DocxTopLevelComment> comments) {
    
    this.comments = comments;
    return this;
  }

  public GetDocxCommentsHierarchicalResponse addCommentsItem(DocxTopLevelComment commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Comments in the document
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comments in the document")
  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTopLevelComment> getComments() {
    return comments;
  }


  @JsonProperty(JSON_PROPERTY_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComments(List<DocxTopLevelComment> comments) {
    this.comments = comments;
  }


  public GetDocxCommentsHierarchicalResponse topLevelCommentCount(Integer topLevelCommentCount) {
    
    this.topLevelCommentCount = topLevelCommentCount;
    return this;
  }

   /**
   * The number of comments in the document
   * @return topLevelCommentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of comments in the document")
  @JsonProperty(JSON_PROPERTY_TOP_LEVEL_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopLevelCommentCount() {
    return topLevelCommentCount;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LEVEL_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLevelCommentCount(Integer topLevelCommentCount) {
    this.topLevelCommentCount = topLevelCommentCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxCommentsHierarchicalResponse getDocxCommentsHierarchicalResponse = (GetDocxCommentsHierarchicalResponse) o;
    return Objects.equals(this.successful, getDocxCommentsHierarchicalResponse.successful) &&
        Objects.equals(this.comments, getDocxCommentsHierarchicalResponse.comments) &&
        Objects.equals(this.topLevelCommentCount, getDocxCommentsHierarchicalResponse.topLevelCommentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, comments, topLevelCommentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxCommentsHierarchicalResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    topLevelCommentCount: ").append(toIndentedString(topLevelCommentCount)).append("\n");
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

