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
 * Request to remove HTML from a string
 */
@ApiModel(description = "Request to remove HTML from a string")
@JsonPropertyOrder({
  RemoveHtmlFromTextRequest.JSON_PROPERTY_TEXT_CONTAINING_HTML
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class RemoveHtmlFromTextRequest {
  public static final String JSON_PROPERTY_TEXT_CONTAINING_HTML = "TextContainingHtml";
  private String textContainingHtml;

  public RemoveHtmlFromTextRequest() { 
  }

  public RemoveHtmlFromTextRequest textContainingHtml(String textContainingHtml) {
    
    this.textContainingHtml = textContainingHtml;
    return this;
  }

   /**
   * Input text string to remove the HTML from
   * @return textContainingHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input text string to remove the HTML from")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTAINING_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContainingHtml() {
    return textContainingHtml;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTAINING_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContainingHtml(String textContainingHtml) {
    this.textContainingHtml = textContainingHtml;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoveHtmlFromTextRequest removeHtmlFromTextRequest = (RemoveHtmlFromTextRequest) o;
    return Objects.equals(this.textContainingHtml, removeHtmlFromTextRequest.textContainingHtml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContainingHtml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveHtmlFromTextRequest {\n");
    sb.append("    textContainingHtml: ").append(toIndentedString(textContainingHtml)).append("\n");
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

