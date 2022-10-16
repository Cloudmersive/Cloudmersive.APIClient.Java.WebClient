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
import com.cloudmersive.client.gac.model.PdfAnnotation;
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
 * Request to add annotations to a PDF
 */
@ApiModel(description = "Request to add annotations to a PDF")
@JsonPropertyOrder({
  AddPdfAnnotationRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  AddPdfAnnotationRequest.JSON_PROPERTY_ANNOTATIONS_TO_ADD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class AddPdfAnnotationRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_ANNOTATIONS_TO_ADD = "AnnotationsToAdd";
  private List<PdfAnnotation> annotationsToAdd = null;

  public AddPdfAnnotationRequest() { 
  }

  public AddPdfAnnotationRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Input file contents bytes for the file to modify
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input file contents bytes for the file to modify")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public AddPdfAnnotationRequest annotationsToAdd(List<PdfAnnotation> annotationsToAdd) {
    
    this.annotationsToAdd = annotationsToAdd;
    return this;
  }

  public AddPdfAnnotationRequest addAnnotationsToAddItem(PdfAnnotation annotationsToAddItem) {
    if (this.annotationsToAdd == null) {
      this.annotationsToAdd = new ArrayList<>();
    }
    this.annotationsToAdd.add(annotationsToAddItem);
    return this;
  }

   /**
   * Annotations to add to the PDF file
   * @return annotationsToAdd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annotations to add to the PDF file")
  @JsonProperty(JSON_PROPERTY_ANNOTATIONS_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PdfAnnotation> getAnnotationsToAdd() {
    return annotationsToAdd;
  }


  @JsonProperty(JSON_PROPERTY_ANNOTATIONS_TO_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnotationsToAdd(List<PdfAnnotation> annotationsToAdd) {
    this.annotationsToAdd = annotationsToAdd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddPdfAnnotationRequest addPdfAnnotationRequest = (AddPdfAnnotationRequest) o;
    return Arrays.equals(this.inputFileBytes, addPdfAnnotationRequest.inputFileBytes) &&
        Objects.equals(this.annotationsToAdd, addPdfAnnotationRequest.annotationsToAdd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), annotationsToAdd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddPdfAnnotationRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    annotationsToAdd: ").append(toIndentedString(annotationsToAdd)).append("\n");
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

