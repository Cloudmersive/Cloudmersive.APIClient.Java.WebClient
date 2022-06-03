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
import com.cloudmersive.client.gac.model.DocxMetadataCustomProperty;
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
 * Request to set Word custom metadata properties
 */
@ApiModel(description = "Request to set Word custom metadata properties")
@JsonPropertyOrder({
  DocxSetCustomMetadataPropertiesRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DocxSetCustomMetadataPropertiesRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxSetCustomMetadataPropertiesRequest.JSON_PROPERTY_PROPERTIES_TO_SET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class DocxSetCustomMetadataPropertiesRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_PROPERTIES_TO_SET = "PropertiesToSet";
  private List<DocxMetadataCustomProperty> propertiesToSet = null;

  public DocxSetCustomMetadataPropertiesRequest() { 
  }

  public DocxSetCustomMetadataPropertiesRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public DocxSetCustomMetadataPropertiesRequest inputFileUrl(String inputFileUrl) {
    
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


  public DocxSetCustomMetadataPropertiesRequest propertiesToSet(List<DocxMetadataCustomProperty> propertiesToSet) {
    
    this.propertiesToSet = propertiesToSet;
    return this;
  }

  public DocxSetCustomMetadataPropertiesRequest addPropertiesToSetItem(DocxMetadataCustomProperty propertiesToSetItem) {
    if (this.propertiesToSet == null) {
      this.propertiesToSet = new ArrayList<>();
    }
    this.propertiesToSet.add(propertiesToSetItem);
    return this;
  }

   /**
   * Required: properties to set in the Word Document; provide one or more property definitions to set - be sure to specify the data type and value, together with the property name
   * @return propertiesToSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required: properties to set in the Word Document; provide one or more property definitions to set - be sure to specify the data type and value, together with the property name")
  @JsonProperty(JSON_PROPERTY_PROPERTIES_TO_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocxMetadataCustomProperty> getPropertiesToSet() {
    return propertiesToSet;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES_TO_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertiesToSet(List<DocxMetadataCustomProperty> propertiesToSet) {
    this.propertiesToSet = propertiesToSet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSetCustomMetadataPropertiesRequest docxSetCustomMetadataPropertiesRequest = (DocxSetCustomMetadataPropertiesRequest) o;
    return Arrays.equals(this.inputFileBytes, docxSetCustomMetadataPropertiesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxSetCustomMetadataPropertiesRequest.inputFileUrl) &&
        Objects.equals(this.propertiesToSet, docxSetCustomMetadataPropertiesRequest.propertiesToSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, propertiesToSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSetCustomMetadataPropertiesRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    propertiesToSet: ").append(toIndentedString(propertiesToSet)).append("\n");
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
