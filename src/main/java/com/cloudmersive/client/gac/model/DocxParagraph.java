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
import com.cloudmersive.client.gac.model.DocxRun;
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
 * A paragraph in a Word Document (DOCX) file; there is where text, content and formatting are stored - similar to the paragraph tag in HTML
 */
@ApiModel(description = "A paragraph in a Word Document (DOCX) file; there is where text, content and formatting are stored - similar to the paragraph tag in HTML")
@JsonPropertyOrder({
  DocxParagraph.JSON_PROPERTY_PARAGRAPH_INDEX,
  DocxParagraph.JSON_PROPERTY_PATH,
  DocxParagraph.JSON_PROPERTY_CONTENT_RUNS,
  DocxParagraph.JSON_PROPERTY_STYLE_I_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class DocxParagraph {
  public static final String JSON_PROPERTY_PARAGRAPH_INDEX = "ParagraphIndex";
  private Integer paragraphIndex;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_CONTENT_RUNS = "ContentRuns";
  private List<DocxRun> contentRuns = null;

  public static final String JSON_PROPERTY_STYLE_I_D = "StyleID";
  private String styleID;

  public DocxParagraph() { 
  }

  public DocxParagraph paragraphIndex(Integer paragraphIndex) {
    
    this.paragraphIndex = paragraphIndex;
    return this;
  }

   /**
   * The index of the paragraph; 0-based
   * @return paragraphIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the paragraph; 0-based")
  @JsonProperty(JSON_PROPERTY_PARAGRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParagraphIndex() {
    return paragraphIndex;
  }


  @JsonProperty(JSON_PROPERTY_PARAGRAPH_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParagraphIndex(Integer paragraphIndex) {
    this.paragraphIndex = paragraphIndex;
  }


  public DocxParagraph path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this Paragraph object; leave blank during creation
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this Paragraph object; leave blank during creation")
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


  public DocxParagraph contentRuns(List<DocxRun> contentRuns) {
    
    this.contentRuns = contentRuns;
    return this;
  }

  public DocxParagraph addContentRunsItem(DocxRun contentRunsItem) {
    if (this.contentRuns == null) {
      this.contentRuns = new ArrayList<>();
    }
    this.contentRuns.add(contentRunsItem);
    return this;
  }

   /**
   * The content runs in the paragraph - this is where text is stored; similar to a span in HTML
   * @return contentRuns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content runs in the paragraph - this is where text is stored; similar to a span in HTML")
  @JsonProperty(JSON_PROPERTY_CONTENT_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxRun> getContentRuns() {
    return contentRuns;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_RUNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentRuns(List<DocxRun> contentRuns) {
    this.contentRuns = contentRuns;
  }


  public DocxParagraph styleID(String styleID) {
    
    this.styleID = styleID;
    return this;
  }

   /**
   * Style ID of the style applied to the paragraph; null if no style is applied
   * @return styleID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Style ID of the style applied to the paragraph; null if no style is applied")
  @JsonProperty(JSON_PROPERTY_STYLE_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStyleID() {
    return styleID;
  }


  @JsonProperty(JSON_PROPERTY_STYLE_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyleID(String styleID) {
    this.styleID = styleID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxParagraph docxParagraph = (DocxParagraph) o;
    return Objects.equals(this.paragraphIndex, docxParagraph.paragraphIndex) &&
        Objects.equals(this.path, docxParagraph.path) &&
        Objects.equals(this.contentRuns, docxParagraph.contentRuns) &&
        Objects.equals(this.styleID, docxParagraph.styleID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paragraphIndex, path, contentRuns, styleID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxParagraph {\n");
    sb.append("    paragraphIndex: ").append(toIndentedString(paragraphIndex)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    contentRuns: ").append(toIndentedString(contentRuns)).append("\n");
    sb.append("    styleID: ").append(toIndentedString(styleID)).append("\n");
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
