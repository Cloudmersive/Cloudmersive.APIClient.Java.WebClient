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
 * Input to a Remove Word DOCX Document Pages request
 */
@ApiModel(description = "Input to a Remove Word DOCX Document Pages request")
@JsonPropertyOrder({
  RemoveDocxPagesRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  RemoveDocxPagesRequest.JSON_PROPERTY_INPUT_FILE_URL,
  RemoveDocxPagesRequest.JSON_PROPERTY_START_DELETE_PAGE_NUMBER,
  RemoveDocxPagesRequest.JSON_PROPERTY_END_DELETE_PAGE_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class RemoveDocxPagesRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_START_DELETE_PAGE_NUMBER = "StartDeletePageNumber";
  private Integer startDeletePageNumber;

  public static final String JSON_PROPERTY_END_DELETE_PAGE_NUMBER = "EndDeletePageNumber";
  private Integer endDeletePageNumber;

  public RemoveDocxPagesRequest() { 
  }

  public RemoveDocxPagesRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public RemoveDocxPagesRequest inputFileUrl(String inputFileUrl) {
    
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


  public RemoveDocxPagesRequest startDeletePageNumber(Integer startDeletePageNumber) {
    
    this.startDeletePageNumber = startDeletePageNumber;
    return this;
  }

   /**
   * Page number (1-based) to start deleting pages; inclusive
   * @return startDeletePageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number (1-based) to start deleting pages; inclusive")
  @JsonProperty(JSON_PROPERTY_START_DELETE_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartDeletePageNumber() {
    return startDeletePageNumber;
  }


  @JsonProperty(JSON_PROPERTY_START_DELETE_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDeletePageNumber(Integer startDeletePageNumber) {
    this.startDeletePageNumber = startDeletePageNumber;
  }


  public RemoveDocxPagesRequest endDeletePageNumber(Integer endDeletePageNumber) {
    
    this.endDeletePageNumber = endDeletePageNumber;
    return this;
  }

   /**
   * Page number (1-based) to stop deleting pages; inclusive
   * @return endDeletePageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Page number (1-based) to stop deleting pages; inclusive")
  @JsonProperty(JSON_PROPERTY_END_DELETE_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getEndDeletePageNumber() {
    return endDeletePageNumber;
  }


  @JsonProperty(JSON_PROPERTY_END_DELETE_PAGE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDeletePageNumber(Integer endDeletePageNumber) {
    this.endDeletePageNumber = endDeletePageNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveDocxPagesRequest removeDocxPagesRequest = (RemoveDocxPagesRequest) o;
    return Arrays.equals(this.inputFileBytes, removeDocxPagesRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, removeDocxPagesRequest.inputFileUrl) &&
        Objects.equals(this.startDeletePageNumber, removeDocxPagesRequest.startDeletePageNumber) &&
        Objects.equals(this.endDeletePageNumber, removeDocxPagesRequest.endDeletePageNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, startDeletePageNumber, endDeletePageNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveDocxPagesRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    startDeletePageNumber: ").append(toIndentedString(startDeletePageNumber)).append("\n");
    sb.append("    endDeletePageNumber: ").append(toIndentedString(endDeletePageNumber)).append("\n");
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

