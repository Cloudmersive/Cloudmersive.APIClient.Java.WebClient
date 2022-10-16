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
import com.cloudmersive.client.gac.model.DocxParagraph;
import com.cloudmersive.client.gac.model.DocxTable;
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
 * DocxBody
 */
@JsonPropertyOrder({
  DocxBody.JSON_PROPERTY_PATH,
  DocxBody.JSON_PROPERTY_ALL_PARAGRAPHS,
  DocxBody.JSON_PROPERTY_ALL_TABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class DocxBody {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_ALL_PARAGRAPHS = "AllParagraphs";
  private List<DocxParagraph> allParagraphs = null;

  public static final String JSON_PROPERTY_ALL_TABLES = "AllTables";
  private List<DocxTable> allTables = null;

  public DocxBody() { 
  }

  public DocxBody path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
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


  public DocxBody allParagraphs(List<DocxParagraph> allParagraphs) {
    
    this.allParagraphs = allParagraphs;
    return this;
  }

  public DocxBody addAllParagraphsItem(DocxParagraph allParagraphsItem) {
    if (this.allParagraphs == null) {
      this.allParagraphs = new ArrayList<>();
    }
    this.allParagraphs.add(allParagraphsItem);
    return this;
  }

   /**
   * All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document
   * @return allParagraphs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document")
  @JsonProperty(JSON_PROPERTY_ALL_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxParagraph> getAllParagraphs() {
    return allParagraphs;
  }


  @JsonProperty(JSON_PROPERTY_ALL_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllParagraphs(List<DocxParagraph> allParagraphs) {
    this.allParagraphs = allParagraphs;
  }


  public DocxBody allTables(List<DocxTable> allTables) {
    
    this.allTables = allTables;
    return this;
  }

  public DocxBody addAllTablesItem(DocxTable allTablesItem) {
    if (this.allTables == null) {
      this.allTables = new ArrayList<>();
    }
    this.allTables.add(allTablesItem);
    return this;
  }

   /**
   * All tables anywhere in the document; these objects are not sequentially placed but are scatted across the document
   * @return allTables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All tables anywhere in the document; these objects are not sequentially placed but are scatted across the document")
  @JsonProperty(JSON_PROPERTY_ALL_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxTable> getAllTables() {
    return allTables;
  }


  @JsonProperty(JSON_PROPERTY_ALL_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllTables(List<DocxTable> allTables) {
    this.allTables = allTables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxBody docxBody = (DocxBody) o;
    return Objects.equals(this.path, docxBody.path) &&
        Objects.equals(this.allParagraphs, docxBody.allParagraphs) &&
        Objects.equals(this.allTables, docxBody.allTables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, allParagraphs, allTables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxBody {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    allParagraphs: ").append(toIndentedString(allParagraphs)).append("\n");
    sb.append("    allTables: ").append(toIndentedString(allTables)).append("\n");
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

