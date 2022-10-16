/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.gac.model.OcrPageResult;
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
 * Response from an OCR to text operation.  Includes the confidence rating and converted text result.
 */
@ApiModel(description = "Response from an OCR to text operation.  Includes the confidence rating and converted text result.")
@JsonPropertyOrder({
  PdfToTextResponse.JSON_PROPERTY_SUCCESSFUL,
  PdfToTextResponse.JSON_PROPERTY_OCR_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:27.708282300-07:00[America/Los_Angeles]")
public class PdfToTextResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_OCR_PAGES = "OcrPages";
  private List<OcrPageResult> ocrPages = null;

  public PdfToTextResponse() { 
  }

  public PdfToTextResponse successful(Boolean successful) {
    
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


  public PdfToTextResponse ocrPages(List<OcrPageResult> ocrPages) {
    
    this.ocrPages = ocrPages;
    return this;
  }

  public PdfToTextResponse addOcrPagesItem(OcrPageResult ocrPagesItem) {
    if (this.ocrPages == null) {
      this.ocrPages = new ArrayList<>();
    }
    this.ocrPages.add(ocrPagesItem);
    return this;
  }

   /**
   * Page OCR results
   * @return ocrPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page OCR results")
  @JsonProperty(JSON_PROPERTY_OCR_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrPageResult> getOcrPages() {
    return ocrPages;
  }


  @JsonProperty(JSON_PROPERTY_OCR_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOcrPages(List<OcrPageResult> ocrPages) {
    this.ocrPages = ocrPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfToTextResponse pdfToTextResponse = (PdfToTextResponse) o;
    return Objects.equals(this.successful, pdfToTextResponse.successful) &&
        Objects.equals(this.ocrPages, pdfToTextResponse.ocrPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, ocrPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfToTextResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    ocrPages: ").append(toIndentedString(ocrPages)).append("\n");
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

