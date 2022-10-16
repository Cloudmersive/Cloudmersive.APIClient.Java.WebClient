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
 * Result of detecting text encoding
 */
@ApiModel(description = "Result of detecting text encoding")
@JsonPropertyOrder({
  TextEncodingDetectResponse.JSON_PROPERTY_SUCCESSFUL,
  TextEncodingDetectResponse.JSON_PROPERTY_TEXT_ENCODING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class TextEncodingDetectResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_ENCODING = "TextEncoding";
  private String textEncoding;

  public TextEncodingDetectResponse() { 
  }

  public TextEncodingDetectResponse successful(Boolean successful) {
    
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


  public TextEncodingDetectResponse textEncoding(String textEncoding) {
    
    this.textEncoding = textEncoding;
    return this;
  }

   /**
   * Text encoding used in file; possible values are ASCII, UTF7, UTF8, UTF16, BigEndianUnicode and UTF32
   * @return textEncoding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text encoding used in file; possible values are ASCII, UTF7, UTF8, UTF16, BigEndianUnicode and UTF32")
  @JsonProperty(JSON_PROPERTY_TEXT_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextEncoding() {
    return textEncoding;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextEncoding(String textEncoding) {
    this.textEncoding = textEncoding;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextEncodingDetectResponse textEncodingDetectResponse = (TextEncodingDetectResponse) o;
    return Objects.equals(this.successful, textEncodingDetectResponse.successful) &&
        Objects.equals(this.textEncoding, textEncodingDetectResponse.textEncoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textEncoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextEncodingDetectResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
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

