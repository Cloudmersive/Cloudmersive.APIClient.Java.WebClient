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
 * Input to a language translation operation
 */
@ApiModel(description = "Input to a language translation operation")
@JsonPropertyOrder({
  LanguageTranslationRequest.JSON_PROPERTY_TEXT_TO_TRANSLATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:36.056137200-07:00[America/Los_Angeles]")
public class LanguageTranslationRequest {
  public static final String JSON_PROPERTY_TEXT_TO_TRANSLATE = "TextToTranslate";
  private String textToTranslate;

  public LanguageTranslationRequest() { 
  }

  public LanguageTranslationRequest textToTranslate(String textToTranslate) {
    
    this.textToTranslate = textToTranslate;
    return this;
  }

   /**
   * Text to translate
   * @return textToTranslate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text to translate")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageTranslationRequest languageTranslationRequest = (LanguageTranslationRequest) o;
    return Objects.equals(this.textToTranslate, languageTranslationRequest.textToTranslate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textToTranslate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageTranslationRequest {\n");
    sb.append("    textToTranslate: ").append(toIndentedString(textToTranslate)).append("\n");
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

