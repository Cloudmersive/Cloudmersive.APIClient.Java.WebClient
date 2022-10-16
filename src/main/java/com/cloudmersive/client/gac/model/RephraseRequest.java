/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Input to a text rephrasing operation
 */
@ApiModel(description = "Input to a text rephrasing operation")
@JsonPropertyOrder({
  RephraseRequest.JSON_PROPERTY_TEXT_TO_TRANSLATE,
  RephraseRequest.JSON_PROPERTY_TARGET_REPHRASING_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:52.799943-07:00[America/Los_Angeles]")
public class RephraseRequest {
  public static final String JSON_PROPERTY_TEXT_TO_TRANSLATE = "TextToTranslate";
  private String textToTranslate;

  public static final String JSON_PROPERTY_TARGET_REPHRASING_COUNT = "TargetRephrasingCount";
  private Integer targetRephrasingCount;

  public RephraseRequest() { 
  }

  public RephraseRequest textToTranslate(String textToTranslate) {
    
    this.textToTranslate = textToTranslate;
    return this;
  }

   /**
   * Text to rephrase
   * @return textToTranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text to rephrase")
  @JsonProperty(JSON_PROPERTY_TEXT_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextToTranslate() {
    return textToTranslate;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_TO_TRANSLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextToTranslate(String textToTranslate) {
    this.textToTranslate = textToTranslate;
  }


  public RephraseRequest targetRephrasingCount(Integer targetRephrasingCount) {
    
    this.targetRephrasingCount = targetRephrasingCount;
    return this;
  }

   /**
   * The number of rephrasing output options you would like per sentence; possible values are 1 to 10.  Default is 2.
   * @return targetRephrasingCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of rephrasing output options you would like per sentence; possible values are 1 to 10.  Default is 2.")
  @JsonProperty(JSON_PROPERTY_TARGET_REPHRASING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTargetRephrasingCount() {
    return targetRephrasingCount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_REPHRASING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetRephrasingCount(Integer targetRephrasingCount) {
    this.targetRephrasingCount = targetRephrasingCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RephraseRequest rephraseRequest = (RephraseRequest) o;
    return Objects.equals(this.textToTranslate, rephraseRequest.textToTranslate) &&
        Objects.equals(this.targetRephrasingCount, rephraseRequest.targetRephrasingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToTranslate, targetRephrasingCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RephraseRequest {\n");
    sb.append("    textToTranslate: ").append(toIndentedString(textToTranslate)).append("\n");
    sb.append("    targetRephrasingCount: ").append(toIndentedString(targetRephrasingCount)).append("\n");
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

