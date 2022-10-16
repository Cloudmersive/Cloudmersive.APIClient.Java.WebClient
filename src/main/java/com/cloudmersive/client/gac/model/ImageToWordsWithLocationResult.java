/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
import com.cloudmersive.client.gac.model.OcrWordElement;
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
 * Result of an image to words-with-location OCR operation
 */
@ApiModel(description = "Result of an image to words-with-location OCR operation")
@JsonPropertyOrder({
  ImageToWordsWithLocationResult.JSON_PROPERTY_SUCCESSFUL,
  ImageToWordsWithLocationResult.JSON_PROPERTY_WORDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:56.032546900-07:00[America/Los_Angeles]")
public class ImageToWordsWithLocationResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_WORDS = "Words";
  private List<OcrWordElement> words = null;

  public ImageToWordsWithLocationResult() { 
  }

  public ImageToWordsWithLocationResult successful(Boolean successful) {
    
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


  public ImageToWordsWithLocationResult words(List<OcrWordElement> words) {
    
    this.words = words;
    return this;
  }

  public ImageToWordsWithLocationResult addWordsItem(OcrWordElement wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * Word elements in the image
   * @return words
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Word elements in the image")
  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OcrWordElement> getWords() {
    return words;
  }


  @JsonProperty(JSON_PROPERTY_WORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWords(List<OcrWordElement> words) {
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
    ImageToWordsWithLocationResult imageToWordsWithLocationResult = (ImageToWordsWithLocationResult) o;
    return Objects.equals(this.successful, imageToWordsWithLocationResult.successful) &&
        Objects.equals(this.words, imageToWordsWithLocationResult.words);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, words);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageToWordsWithLocationResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

