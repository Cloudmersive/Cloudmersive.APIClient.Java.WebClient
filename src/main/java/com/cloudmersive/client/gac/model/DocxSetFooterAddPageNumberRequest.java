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
 * Input to set-footer/add-page-number command
 */
@ApiModel(description = "Input to set-footer/add-page-number command")
@JsonPropertyOrder({
  DocxSetFooterAddPageNumberRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  DocxSetFooterAddPageNumberRequest.JSON_PROPERTY_INPUT_FILE_URL,
  DocxSetFooterAddPageNumberRequest.JSON_PROPERTY_PREPEND_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class DocxSetFooterAddPageNumberRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_PREPEND_TEXT = "PrependText";
  private String prependText;

  public DocxSetFooterAddPageNumberRequest() { 
  }

  public DocxSetFooterAddPageNumberRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public DocxSetFooterAddPageNumberRequest inputFileUrl(String inputFileUrl) {
    
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


  public DocxSetFooterAddPageNumberRequest prependText(String prependText) {
    
    this.prependText = prependText;
    return this;
  }

   /**
   * Optional: extra text to add before the page number, for example if you want to show \&quot;Page 1\&quot; then you can set PrependText to \&quot;Page\&quot;
   * @return prependText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: extra text to add before the page number, for example if you want to show \"Page 1\" then you can set PrependText to \"Page\"")
  @JsonProperty(JSON_PROPERTY_PREPEND_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrependText() {
    return prependText;
  }


  @JsonProperty(JSON_PROPERTY_PREPEND_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrependText(String prependText) {
    this.prependText = prependText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxSetFooterAddPageNumberRequest docxSetFooterAddPageNumberRequest = (DocxSetFooterAddPageNumberRequest) o;
    return Arrays.equals(this.inputFileBytes, docxSetFooterAddPageNumberRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, docxSetFooterAddPageNumberRequest.inputFileUrl) &&
        Objects.equals(this.prependText, docxSetFooterAddPageNumberRequest.prependText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, prependText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxSetFooterAddPageNumberRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    prependText: ").append(toIndentedString(prependText)).append("\n");
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

