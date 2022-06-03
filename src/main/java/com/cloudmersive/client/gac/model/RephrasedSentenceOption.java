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
 * One rephrasing of an original input sentence
 */
@ApiModel(description = "One rephrasing of an original input sentence")
@JsonPropertyOrder({
  RephrasedSentenceOption.JSON_PROPERTY_REPHRASED_OPTION_INDEX,
  RephrasedSentenceOption.JSON_PROPERTY_REPHRASED_SENTENCE_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:49.362192400-07:00[America/Los_Angeles]")
public class RephrasedSentenceOption {
  public static final String JSON_PROPERTY_REPHRASED_OPTION_INDEX = "RephrasedOptionIndex";
  private Integer rephrasedOptionIndex;

  public static final String JSON_PROPERTY_REPHRASED_SENTENCE_TEXT = "RephrasedSentenceText";
  private String rephrasedSentenceText;

  public RephrasedSentenceOption() { 
  }

  public RephrasedSentenceOption rephrasedOptionIndex(Integer rephrasedOptionIndex) {
    
    this.rephrasedOptionIndex = rephrasedOptionIndex;
    return this;
  }

   /**
   * Ordered index of the rephrasing option, 1-based, with 1 being the best option
   * @return rephrasedOptionIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ordered index of the rephrasing option, 1-based, with 1 being the best option")
  @JsonProperty(JSON_PROPERTY_REPHRASED_OPTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRephrasedOptionIndex() {
    return rephrasedOptionIndex;
  }


  @JsonProperty(JSON_PROPERTY_REPHRASED_OPTION_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRephrasedOptionIndex(Integer rephrasedOptionIndex) {
    this.rephrasedOptionIndex = rephrasedOptionIndex;
  }


  public RephrasedSentenceOption rephrasedSentenceText(String rephrasedSentenceText) {
    
    this.rephrasedSentenceText = rephrasedSentenceText;
    return this;
  }

   /**
   * One sentence of output rephrased text of original input sentence
   * @return rephrasedSentenceText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One sentence of output rephrased text of original input sentence")
  @JsonProperty(JSON_PROPERTY_REPHRASED_SENTENCE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRephrasedSentenceText() {
    return rephrasedSentenceText;
  }


  @JsonProperty(JSON_PROPERTY_REPHRASED_SENTENCE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRephrasedSentenceText(String rephrasedSentenceText) {
    this.rephrasedSentenceText = rephrasedSentenceText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RephrasedSentenceOption rephrasedSentenceOption = (RephrasedSentenceOption) o;
    return Objects.equals(this.rephrasedOptionIndex, rephrasedSentenceOption.rephrasedOptionIndex) &&
        Objects.equals(this.rephrasedSentenceText, rephrasedSentenceOption.rephrasedSentenceText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rephrasedOptionIndex, rephrasedSentenceText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RephrasedSentenceOption {\n");
    sb.append("    rephrasedOptionIndex: ").append(toIndentedString(rephrasedOptionIndex)).append("\n");
    sb.append("    rephrasedSentenceText: ").append(toIndentedString(rephrasedSentenceText)).append("\n");
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

