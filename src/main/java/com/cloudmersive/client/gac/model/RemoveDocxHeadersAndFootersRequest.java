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
 * Input to a Remove Headers and Footers request
 */
@ApiModel(description = "Input to a Remove Headers and Footers request")
@JsonPropertyOrder({
  RemoveDocxHeadersAndFootersRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  RemoveDocxHeadersAndFootersRequest.JSON_PROPERTY_INPUT_FILE_URL,
  RemoveDocxHeadersAndFootersRequest.JSON_PROPERTY_REMOVE_HEADERS,
  RemoveDocxHeadersAndFootersRequest.JSON_PROPERTY_REMOVE_FOOTERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class RemoveDocxHeadersAndFootersRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_REMOVE_HEADERS = "RemoveHeaders";
  private Boolean removeHeaders;

  public static final String JSON_PROPERTY_REMOVE_FOOTERS = "RemoveFooters";
  private Boolean removeFooters;

  public RemoveDocxHeadersAndFootersRequest() { 
  }

  public RemoveDocxHeadersAndFootersRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public RemoveDocxHeadersAndFootersRequest inputFileUrl(String inputFileUrl) {
    
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


  public RemoveDocxHeadersAndFootersRequest removeHeaders(Boolean removeHeaders) {
    
    this.removeHeaders = removeHeaders;
    return this;
  }

   /**
   * True if you would like to remove all headers from the input document, false otherwise
   * @return removeHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if you would like to remove all headers from the input document, false otherwise")
  @JsonProperty(JSON_PROPERTY_REMOVE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemoveHeaders() {
    return removeHeaders;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveHeaders(Boolean removeHeaders) {
    this.removeHeaders = removeHeaders;
  }


  public RemoveDocxHeadersAndFootersRequest removeFooters(Boolean removeFooters) {
    
    this.removeFooters = removeFooters;
    return this;
  }

   /**
   * True if you would like to remove all footers from the input document, false otherwise
   * @return removeFooters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if you would like to remove all footers from the input document, false otherwise")
  @JsonProperty(JSON_PROPERTY_REMOVE_FOOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemoveFooters() {
    return removeFooters;
  }


  @JsonProperty(JSON_PROPERTY_REMOVE_FOOTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemoveFooters(Boolean removeFooters) {
    this.removeFooters = removeFooters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDocxHeadersAndFootersRequest removeDocxHeadersAndFootersRequest = (RemoveDocxHeadersAndFootersRequest) o;
    return Arrays.equals(this.inputFileBytes, removeDocxHeadersAndFootersRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removeDocxHeadersAndFootersRequest.inputFileUrl) &&
        Objects.equals(this.removeHeaders, removeDocxHeadersAndFootersRequest.removeHeaders) &&
        Objects.equals(this.removeFooters, removeDocxHeadersAndFootersRequest.removeFooters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, removeHeaders, removeFooters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDocxHeadersAndFootersRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    removeHeaders: ").append(toIndentedString(removeHeaders)).append("\n");
    sb.append("    removeFooters: ").append(toIndentedString(removeFooters)).append("\n");
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

