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
 * Input object for spell checking
 */
@ApiModel(description = "Input object for spell checking")
@JsonPropertyOrder({
  CheckSentenceRequest.JSON_PROPERTY_SENTENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:07.449581100-07:00[America/Los_Angeles]")
public class CheckSentenceRequest {
  public static final String JSON_PROPERTY_SENTENCE = "Sentence";
  private String sentence;

  public CheckSentenceRequest() { 
  }

  public CheckSentenceRequest sentence(String sentence) {
    
    this.sentence = sentence;
    return this;
  }

   /**
   * Input sentence for spell check
   * @return sentence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Input sentence for spell check")
  @JsonProperty(JSON_PROPERTY_SENTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSentence() {
    return sentence;
  }


  @JsonProperty(JSON_PROPERTY_SENTENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSentence(String sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckSentenceRequest checkSentenceRequest = (CheckSentenceRequest) o;
    return Objects.equals(this.sentence, checkSentenceRequest.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSentenceRequest {\n");
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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

