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
 * Text conversion result from converting a document to Plain Text (TXT) format
 */
@ApiModel(description = "Text conversion result from converting a document to Plain Text (TXT) format")
@JsonPropertyOrder({
  TextConversionResult.JSON_PROPERTY_SUCCESSFUL,
  TextConversionResult.JSON_PROPERTY_TEXT_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class TextConversionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TEXT_RESULT = "TextResult";
  private String textResult;

  public TextConversionResult() { 
  }

  public TextConversionResult successful(Boolean successful) {
    
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


  public TextConversionResult textResult(String textResult) {
    
    this.textResult = textResult;
    return this;
  }

   /**
   * Plain Text (TXT) format conversion result of the input document.  The text result is returned as a string.
   * @return textResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plain Text (TXT) format conversion result of the input document.  The text result is returned as a string.")
  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextResult() {
    return textResult;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextResult(String textResult) {
    this.textResult = textResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextConversionResult textConversionResult = (TextConversionResult) o;
    return Objects.equals(this.successful, textConversionResult.successful) &&
        Objects.equals(this.textResult, textConversionResult.textResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, textResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextConversionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    textResult: ").append(toIndentedString(textResult)).append("\n");
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

