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
 * Request to find a string in a string
 */
@ApiModel(description = "Request to find a string in a string")
@JsonPropertyOrder({
  FindStringRegexRequest.JSON_PROPERTY_TEXT_CONTENT,
  FindStringRegexRequest.JSON_PROPERTY_TARGET_REGEX,
  FindStringRegexRequest.JSON_PROPERTY_MATCH_CASE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class FindStringRegexRequest {
  public static final String JSON_PROPERTY_TEXT_CONTENT = "TextContent";
  private String textContent;

  public static final String JSON_PROPERTY_TARGET_REGEX = "TargetRegex";
  private String targetRegex;

  public static final String JSON_PROPERTY_MATCH_CASE = "MatchCase";
  private Boolean matchCase;

  public FindStringRegexRequest() { 
  }

  public FindStringRegexRequest textContent(String textContent) {
    
    this.textContent = textContent;
    return this;
  }

   /**
   * Input text content
   * @return textContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input text content")
  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextContent() {
    return textContent;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextContent(String textContent) {
    this.textContent = textContent;
  }


  public FindStringRegexRequest targetRegex(String targetRegex) {
    
    this.targetRegex = targetRegex;
    return this;
  }

   /**
   * Target input regular expression (regex) to find
   * @return targetRegex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target input regular expression (regex) to find")
  @JsonProperty(JSON_PROPERTY_TARGET_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetRegex() {
    return targetRegex;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_REGEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRegex(String targetRegex) {
    this.targetRegex = targetRegex;
  }


  public FindStringRegexRequest matchCase(Boolean matchCase) {
    
    this.matchCase = matchCase;
    return this;
  }

   /**
   * Set to True to match case, False to ignore case
   * @return matchCase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set to True to match case, False to ignore case")
  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMatchCase() {
    return matchCase;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_CASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchCase(Boolean matchCase) {
    this.matchCase = matchCase;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringRegexRequest findStringRegexRequest = (FindStringRegexRequest) o;
    return Objects.equals(this.textContent, findStringRegexRequest.textContent) &&
        Objects.equals(this.targetRegex, findStringRegexRequest.targetRegex) &&
        Objects.equals(this.matchCase, findStringRegexRequest.matchCase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textContent, targetRegex, matchCase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringRegexRequest {\n");
    sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
    sb.append("    targetRegex: ").append(toIndentedString(targetRegex)).append("\n");
    sb.append("    matchCase: ").append(toIndentedString(matchCase)).append("\n");
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

