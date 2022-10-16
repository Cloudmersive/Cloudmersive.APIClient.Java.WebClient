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
import com.cloudmersive.client.gac.model.FillHandlebarFormField;
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
 * Request for DocxSetFormFields operation
 */
@ApiModel(description = "Request for DocxSetFormFields operation")
@JsonPropertyOrder({
  DocxSetFormFieldsRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DocxSetFormFieldsRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxSetFormFieldsRequest.JSON_PROPERTY_HANDLEBAR_FIELDS_TO_FILL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class DocxSetFormFieldsRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_HANDLEBAR_FIELDS_TO_FILL = "HandlebarFieldsToFill";
  private List<FillHandlebarFormField> handlebarFieldsToFill = null;

  public DocxSetFormFieldsRequest() { 
  }

  public DocxSetFormFieldsRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
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


  public DocxSetFormFieldsRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public DocxSetFormFieldsRequest handlebarFieldsToFill(List<FillHandlebarFormField> handlebarFieldsToFill) {
    
    this.handlebarFieldsToFill = handlebarFieldsToFill;
    return this;
  }

  public DocxSetFormFieldsRequest addHandlebarFieldsToFillItem(FillHandlebarFormField handlebarFieldsToFillItem) {
    if (this.handlebarFieldsToFill == null) {
      this.handlebarFieldsToFill = new ArrayList<>();
    }
    this.handlebarFieldsToFill.add(handlebarFieldsToFillItem);
    return this;
  }

   /**
   * Handlebar style form fields to fill in; form field that is handlebar style, such as \&quot;{{FieldName}}\&quot;
   * @return handlebarFieldsToFill
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Handlebar style form fields to fill in; form field that is handlebar style, such as \"{{FieldName}}\"")
  @JsonProperty(JSON_PROPERTY_HANDLEBAR_FIELDS_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FillHandlebarFormField> getHandlebarFieldsToFill() {
    return handlebarFieldsToFill;
  }


  @JsonProperty(JSON_PROPERTY_HANDLEBAR_FIELDS_TO_FILL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHandlebarFieldsToFill(List<FillHandlebarFormField> handlebarFieldsToFill) {
    this.handlebarFieldsToFill = handlebarFieldsToFill;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSetFormFieldsRequest docxSetFormFieldsRequest = (DocxSetFormFieldsRequest) o;
    return Arrays.equals(this.inputFileBytes, docxSetFormFieldsRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxSetFormFieldsRequest.inputFileUrl) &&
        Objects.equals(this.handlebarFieldsToFill, docxSetFormFieldsRequest.handlebarFieldsToFill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, handlebarFieldsToFill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSetFormFieldsRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    handlebarFieldsToFill: ").append(toIndentedString(handlebarFieldsToFill)).append("\n");
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

