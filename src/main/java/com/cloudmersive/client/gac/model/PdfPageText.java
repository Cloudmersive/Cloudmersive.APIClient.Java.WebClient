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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Text of a single page of a PDF
 */
@ApiModel(description = "Text of a single page of a PDF")
@JsonPropertyOrder({
  PdfPageText.JSON_PROPERTY_PAGE_NUMBER,
  PdfPageText.JSON_PROPERTY_PAGE_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class PdfPageText {
  public static final String JSON_PROPERTY_PAGE_NUMBER = "PageNumber";
  private Integer pageNumber;

  public static final String JSON_PROPERTY_PAGE_TEXT = "PageText";
  private String pageText;

  public PdfPageText() { 
  }

  public PdfPageText pageNumber(Integer pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number of the page (1-based)
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number of the page (1-based)")
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


  public PdfPageText pageText(String pageText) {
    
    this.pageText = pageText;
    return this;
  }

   /**
   * Text of the page
   * @return pageText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text of the page")
  @JsonProperty(JSON_PROPERTY_PAGE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageText() {
    return pageText;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageText(String pageText) {
    this.pageText = pageText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfPageText pdfPageText = (PdfPageText) o;
    return Objects.equals(this.pageNumber, pdfPageText.pageNumber) &&
        Objects.equals(this.pageText, pdfPageText.pageText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNumber, pageText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfPageText {\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageText: ").append(toIndentedString(pageText)).append("\n");
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

