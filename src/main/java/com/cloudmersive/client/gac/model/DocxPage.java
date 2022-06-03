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
 * One page in a Word Document DOCX
 */
@ApiModel(description = "One page in a Word Document DOCX")
@JsonPropertyOrder({
  DocxPage.JSON_PROPERTY_PAGE_NUMBER,
  DocxPage.JSON_PROPERTY_PARAGRAPHS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class DocxPage {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_PARAGRAPHS = "Paragraphs";
  private List<DocxParagraph> paragraphs = null;

  public DocxPage() { 
  }

  public DocxPage pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of this page, 1-based
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number of this page, 1-based")
  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageNumber() {
    return pageNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }


  public DocxPage paragraphs(List<DocxParagraph> paragraphs) {
    
    this.paragraphs = paragraphs;
    return this;
  }

  public DocxPage addParagraphsItem(DocxParagraph paragraphsItem) {
    if (this.paragraphs == null) {
      this.paragraphs = new ArrayList<>();
    }
    this.paragraphs.add(paragraphsItem);
    return this;
  }

   /**
   * All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document
   * @return paragraphs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All paragraphs anywhere in the document; these objects are not sequentially placed but are scatted across document")
  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxParagraph> getParagraphs() {
    return paragraphs;
  }


  @JsonProperty(JSON_PROPERTY_PARAGRAPHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParagraphs(List<DocxParagraph> paragraphs) {
    this.paragraphs = paragraphs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxPage docxPage = (DocxPage) o;
    return Objects.equals(this.pageNumber, docxPage.pageNumber) &&
        Objects.equals(this.paragraphs, docxPage.paragraphs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, paragraphs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxPage {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    paragraphs: ").append(toIndentedString(paragraphs)).append("\n");
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

