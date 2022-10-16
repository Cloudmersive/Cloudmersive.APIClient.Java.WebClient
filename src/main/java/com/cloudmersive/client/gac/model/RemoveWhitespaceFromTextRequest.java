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
 * Request to remove whitespace from a string
 */
@ApiModel(description = "Request to remove whitespace from a string")
@JsonPropertyOrder({
  RemoveWhitespaceFromTextRequest.JSON_PROPERTY_TEXT_CONTAINING_WHITESPACE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class RemoveWhitespaceFromTextRequest {
  public static final String JSON_PROPERTY_TEXT_CONTAINING_WHITESPACE = "TextContainingWhitespace";
  private String textContainingWhitespace;

  public RemoveWhitespaceFromTextRequest() { 
  }

  public RemoveWhitespaceFromTextRequest textContainingWhitespace(String textContainingWhitespace) {
    
    this.textContainingWhitespace = textContainingWhitespace;
    return this;
  }

   /**
   * Input text string to remove the whitespace from
   * @return textContainingWhitespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input text string to remove the whitespace from")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTAINING_WHITESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContainingWhitespace() {
    return textContainingWhitespace;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTAINING_WHITESPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContainingWhitespace(String textContainingWhitespace) {
    this.textContainingWhitespace = textContainingWhitespace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveWhitespaceFromTextRequest removeWhitespaceFromTextRequest = (RemoveWhitespaceFromTextRequest) o;
    return Objects.equals(this.textContainingWhitespace, removeWhitespaceFromTextRequest.textContainingWhitespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContainingWhitespace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveWhitespaceFromTextRequest {\n");
    sb.append("    textContainingWhitespace: ").append(toIndentedString(textContainingWhitespace)).append("\n");
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

