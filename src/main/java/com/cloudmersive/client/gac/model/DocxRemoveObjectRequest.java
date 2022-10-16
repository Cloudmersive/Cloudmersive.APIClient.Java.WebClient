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
 * Input to a Insert Paragraph request
 */
@ApiModel(description = "Input to a Insert Paragraph request")
@JsonPropertyOrder({
  DocxRemoveObjectRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DocxRemoveObjectRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxRemoveObjectRequest.JSON_PROPERTY_PATH_TO_OBJECT_TO_REMOVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class DocxRemoveObjectRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_PATH_TO_OBJECT_TO_REMOVE = "PathToObjectToRemove";
  private String pathToObjectToRemove;

  public DocxRemoveObjectRequest() { 
  }

  public DocxRemoveObjectRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public DocxRemoveObjectRequest inputFileUrl(String inputFileUrl) {
    
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


  public DocxRemoveObjectRequest pathToObjectToRemove(String pathToObjectToRemove) {
    
    this.pathToObjectToRemove = pathToObjectToRemove;
    return this;
  }

   /**
   * Path within the document of the object to delete; fill in the PathToObjectToRemove field using the Path value from an existing object.
   * @return pathToObjectToRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path within the document of the object to delete; fill in the PathToObjectToRemove field using the Path value from an existing object.")
  @JsonProperty(JSON_PROPERTY_PATH_TO_OBJECT_TO_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPathToObjectToRemove() {
    return pathToObjectToRemove;
  }


  @JsonProperty(JSON_PROPERTY_PATH_TO_OBJECT_TO_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathToObjectToRemove(String pathToObjectToRemove) {
    this.pathToObjectToRemove = pathToObjectToRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxRemoveObjectRequest docxRemoveObjectRequest = (DocxRemoveObjectRequest) o;
    return Arrays.equals(this.inputFileBytes, docxRemoveObjectRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxRemoveObjectRequest.inputFileUrl) &&
        Objects.equals(this.pathToObjectToRemove, docxRemoveObjectRequest.pathToObjectToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, pathToObjectToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxRemoveObjectRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    pathToObjectToRemove: ").append(toIndentedString(pathToObjectToRemove)).append("\n");
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

