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
import com.cloudmersive.client.gac.model.CorrectWordInSentence;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of spell checking a sentence
 */
@ApiModel(description = "Result of spell checking a sentence")
@JsonPropertyOrder({
  CheckSentenceResponse.JSON_PROPERTY_INCORRECT_COUNT,
  CheckSentenceResponse.JSON_PROPERTY_WORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:23.937256-07:00[America/Los_Angeles]")
public class CheckSentenceResponse {
  public static final String JSON_PROPERTY_INCORRECT_COUNT = "IncorrectCount";
  private Integer incorrectCount;

  public static final String JSON_PROPERTY_WORDS = "Words";
  private List<CorrectWordInSentence> words = null;

  public CheckSentenceResponse() { 
  }

  public CheckSentenceResponse incorrectCount(Integer incorrectCount) {
    
    this.incorrectCount = incorrectCount;
    return this;
  }

   /**
   * Number of incorrect words
   * @return incorrectCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of incorrect words")
  @JsonProperty(JSON_PROPERTY_INCORRECT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIncorrectCount() {
    return incorrectCount;
  }


  @JsonProperty(JSON_PROPERTY_INCORRECT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncorrectCount(Integer incorrectCount) {
    this.incorrectCount = incorrectCount;
  }


  public CheckSentenceResponse words(List<CorrectWordInSentence> words) {
    
    this.words = words;
    return this;
  }

  public CheckSentenceResponse addWordsItem(CorrectWordInSentence wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Words in the sentence, both correct and incorrect
   * @return words
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Words in the sentence, both correct and incorrect")
  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CorrectWordInSentence> getWords() {
    return words;
  }


  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWords(List<CorrectWordInSentence> words) {
    this.words = words;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckSentenceResponse checkSentenceResponse = (CheckSentenceResponse) o;
    return Objects.equals(this.incorrectCount, checkSentenceResponse.incorrectCount) &&
        Objects.equals(this.words, checkSentenceResponse.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(incorrectCount, words);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckSentenceResponse {\n");
    sb.append("    incorrectCount: ").append(toIndentedString(incorrectCount)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

