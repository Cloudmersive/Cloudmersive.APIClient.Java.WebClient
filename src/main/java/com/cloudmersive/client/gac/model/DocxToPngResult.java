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
import com.cloudmersive.client.gac.model.ConvertedPngPage;
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
 * Result of converting a DOCX input to a PNG array
 */
@ApiModel(description = "Result of converting a DOCX input to a PNG array")
@JsonPropertyOrder({
  DocxToPngResult.JSON_PROPERTY_SUCCESSFUL,
  DocxToPngResult.JSON_PROPERTY_PNG_RESULT_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class DocxToPngResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PNG_RESULT_PAGES = "PngResultPages";
  private List<ConvertedPngPage> pngResultPages = null;

  public DocxToPngResult() { 
  }

  public DocxToPngResult successful(Boolean successful) {
    
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


  public DocxToPngResult pngResultPages(List<ConvertedPngPage> pngResultPages) {
    
    this.pngResultPages = pngResultPages;
    return this;
  }

  public DocxToPngResult addPngResultPagesItem(ConvertedPngPage pngResultPagesItem) {
    if (this.pngResultPages == null) {
      this.pngResultPages = new ArrayList<>();
    }
    this.pngResultPages.add(pngResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return pngResultPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of converted pages")
  @JsonProperty(JSON_PROPERTY_PNG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConvertedPngPage> getPngResultPages() {
    return pngResultPages;
  }


  @JsonProperty(JSON_PROPERTY_PNG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPngResultPages(List<ConvertedPngPage> pngResultPages) {
    this.pngResultPages = pngResultPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxToPngResult docxToPngResult = (DocxToPngResult) o;
    return Objects.equals(this.successful, docxToPngResult.successful) &&
        Objects.equals(this.pngResultPages, docxToPngResult.pngResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, pngResultPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxToPngResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    pngResultPages: ").append(toIndentedString(pngResultPages)).append("\n");
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

