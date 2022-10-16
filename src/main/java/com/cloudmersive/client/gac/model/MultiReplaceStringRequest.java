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
import com.cloudmersive.client.gac.model.SingleReplaceString;
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
 * Input to a multiple string replacement request
 */
@ApiModel(description = "Input to a multiple string replacement request")
@JsonPropertyOrder({
  MultiReplaceStringRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  MultiReplaceStringRequest.JSON_PROPERTY_INPUT_FILE_URL,
  MultiReplaceStringRequest.JSON_PROPERTY_REPLACE_STRINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class MultiReplaceStringRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_REPLACE_STRINGS = "ReplaceStrings";
  private List<SingleReplaceString> replaceStrings = null;

  public MultiReplaceStringRequest() { 
  }

  public MultiReplaceStringRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public MultiReplaceStringRequest inputFileUrl(String inputFileUrl) {
    
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


  public MultiReplaceStringRequest replaceStrings(List<SingleReplaceString> replaceStrings) {
    
    this.replaceStrings = replaceStrings;
    return this;
  }

  public MultiReplaceStringRequest addReplaceStringsItem(SingleReplaceString replaceStringsItem) {
    if (this.replaceStrings == null) {
      this.replaceStrings = new ArrayList<>();
    }
    this.replaceStrings.add(replaceStringsItem);
    return this;
  }

   /**
   * An array of individual string replacement requests
   * @return replaceStrings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of individual string replacement requests")
  @JsonProperty(JSON_PROPERTY_REPLACE_STRINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SingleReplaceString> getReplaceStrings() {
    return replaceStrings;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_STRINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceStrings(List<SingleReplaceString> replaceStrings) {
    this.replaceStrings = replaceStrings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiReplaceStringRequest multiReplaceStringRequest = (MultiReplaceStringRequest) o;
    return Arrays.equals(this.inputFileBytes, multiReplaceStringRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, multiReplaceStringRequest.inputFileUrl) &&
        Objects.equals(this.replaceStrings, multiReplaceStringRequest.replaceStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, replaceStrings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiReplaceStringRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    replaceStrings: ").append(toIndentedString(replaceStrings)).append("\n");
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

