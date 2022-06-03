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
import com.cloudmersive.client.gac.model.PdfDocument;
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
 * Result of performing a PDF file split operation
 */
@ApiModel(description = "Result of performing a PDF file split operation")
@JsonPropertyOrder({
  SplitPdfResult.JSON_PROPERTY_SUCCESSFUL,
  SplitPdfResult.JSON_PROPERTY_DOCUMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class SplitPdfResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_DOCUMENTS = "Documents";
  private List<PdfDocument> documents = null;

  public SplitPdfResult() { 
  }

  public SplitPdfResult successful(Boolean successful) {
    
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


  public SplitPdfResult documents(List<PdfDocument> documents) {
    
    this.documents = documents;
    return this;
  }

  public SplitPdfResult addDocumentsItem(PdfDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * PDF documents as output
   * @return documents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PDF documents as output")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PdfDocument> getDocuments() {
    return documents;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocuments(List<PdfDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitPdfResult splitPdfResult = (SplitPdfResult) o;
    return Objects.equals(this.successful, splitPdfResult.successful) &&
        Objects.equals(this.documents, splitPdfResult.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitPdfResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

