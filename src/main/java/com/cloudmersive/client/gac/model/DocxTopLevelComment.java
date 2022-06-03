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
import com.cloudmersive.client.gac.model.DocxComment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Top-level Comment in a Word Document
 */
@ApiModel(description = "Top-level Comment in a Word Document")
@JsonPropertyOrder({
  DocxTopLevelComment.JSON_PROPERTY_PATH,
  DocxTopLevelComment.JSON_PROPERTY_AUTHOR,
  DocxTopLevelComment.JSON_PROPERTY_AUTHOR_INITIALS,
  DocxTopLevelComment.JSON_PROPERTY_COMMENT_TEXT,
  DocxTopLevelComment.JSON_PROPERTY_COMMENT_DATE,
  DocxTopLevelComment.JSON_PROPERTY_REPLY_CHILD_COMMENTS,
  DocxTopLevelComment.JSON_PROPERTY_DONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class DocxTopLevelComment {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_AUTHOR = "Author";
  private String author;

  public static final String JSON_PROPERTY_AUTHOR_INITIALS = "AuthorInitials";
  private String authorInitials;

  public static final String JSON_PROPERTY_COMMENT_TEXT = "CommentText";
  private String commentText;

  public static final String JSON_PROPERTY_COMMENT_DATE = "CommentDate";
  private OffsetDateTime commentDate;

  public static final String JSON_PROPERTY_REPLY_CHILD_COMMENTS = "ReplyChildComments";
  private List<DocxComment> replyChildComments = null;

  public static final String JSON_PROPERTY_DONE = "Done";
  private Boolean done;

  public DocxTopLevelComment() { 
  }

  public DocxTopLevelComment path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path to the comment in the document
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the comment in the document")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public DocxTopLevelComment author(String author) {
    
    this.author = author;
    return this;
  }

   /**
   * Author name of the comment
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Author name of the comment")
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


  public DocxTopLevelComment authorInitials(String authorInitials) {
    
    this.authorInitials = authorInitials;
    return this;
  }

   /**
   * Initials of the author of the comment
   * @return authorInitials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Initials of the author of the comment")
  @JsonProperty(JSON_PROPERTY_AUTHOR_INITIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorInitials() {
    return authorInitials;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_INITIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorInitials(String authorInitials) {
    this.authorInitials = authorInitials;
  }


  public DocxTopLevelComment commentText(String commentText) {
    
    this.commentText = commentText;
    return this;
  }

   /**
   * Text content of the comment
   * @return commentText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text content of the comment")
  @JsonProperty(JSON_PROPERTY_COMMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCommentText() {
    return commentText;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentText(String commentText) {
    this.commentText = commentText;
  }


  public DocxTopLevelComment commentDate(OffsetDateTime commentDate) {
    
    this.commentDate = commentDate;
    return this;
  }

   /**
   * Date timestamp of the comment
   * @return commentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date timestamp of the comment")
  @JsonProperty(JSON_PROPERTY_COMMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCommentDate() {
    return commentDate;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommentDate(OffsetDateTime commentDate) {
    this.commentDate = commentDate;
  }


  public DocxTopLevelComment replyChildComments(List<DocxComment> replyChildComments) {
    
    this.replyChildComments = replyChildComments;
    return this;
  }

  public DocxTopLevelComment addReplyChildCommentsItem(DocxComment replyChildCommentsItem) {
    if (this.replyChildComments == null) {
      this.replyChildComments = new ArrayList<>();
    }
    this.replyChildComments.add(replyChildCommentsItem);
    return this;
  }

   /**
   * Child comments, that are replies to this one
   * @return replyChildComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Child comments, that are replies to this one")
  @JsonProperty(JSON_PROPERTY_REPLY_CHILD_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxComment> getReplyChildComments() {
    return replyChildComments;
  }


  @JsonProperty(JSON_PROPERTY_REPLY_CHILD_COMMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplyChildComments(List<DocxComment> replyChildComments) {
    this.replyChildComments = replyChildComments;
  }


  public DocxTopLevelComment done(Boolean done) {
    
    this.done = done;
    return this;
  }

   /**
   * True if this comment is marked as Done in Word, otherwise it is false
   * @return done
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this comment is marked as Done in Word, otherwise it is false")
  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDone() {
    return done;
  }


  @JsonProperty(JSON_PROPERTY_DONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDone(Boolean done) {
    this.done = done;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTopLevelComment docxTopLevelComment = (DocxTopLevelComment) o;
    return Objects.equals(this.path, docxTopLevelComment.path) &&
        Objects.equals(this.author, docxTopLevelComment.author) &&
        Objects.equals(this.authorInitials, docxTopLevelComment.authorInitials) &&
        Objects.equals(this.commentText, docxTopLevelComment.commentText) &&
        Objects.equals(this.commentDate, docxTopLevelComment.commentDate) &&
        Objects.equals(this.replyChildComments, docxTopLevelComment.replyChildComments) &&
        Objects.equals(this.done, docxTopLevelComment.done);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, author, authorInitials, commentText, commentDate, replyChildComments, done);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTopLevelComment {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorInitials: ").append(toIndentedString(authorInitials)).append("\n");
    sb.append("    commentText: ").append(toIndentedString(commentText)).append("\n");
    sb.append("    commentDate: ").append(toIndentedString(commentDate)).append("\n");
    sb.append("    replyChildComments: ").append(toIndentedString(replyChildComments)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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

