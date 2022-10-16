/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
 * Specific recognition outcome
 */
@ApiModel(description = "Specific recognition outcome")
@JsonPropertyOrder({
  RecognitionOutcome.JSON_PROPERTY_CONFIDENCE_SCORE,
  RecognitionOutcome.JSON_PROPERTY_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:17.104419100-07:00[America/Los_Angeles]")
public class RecognitionOutcome {
  public static final String JSON_PROPERTY_CONFIDENCE_SCORE = "ConfidenceScore";
  private Double confidenceScore;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public RecognitionOutcome() { 
  }

  public RecognitionOutcome confidenceScore(Double confidenceScore) {
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * Scores closer to 1 are better than scores closer to 0
   * @return confidenceScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scores closer to 1 are better than scores closer to 0")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConfidenceScore() {
    return confidenceScore;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidenceScore(Double confidenceScore) {
    this.confidenceScore = confidenceScore;
  }


  public RecognitionOutcome description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * English language description of the image
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "English language description of the image")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecognitionOutcome recognitionOutcome = (RecognitionOutcome) o;
    return Objects.equals(this.confidenceScore, recognitionOutcome.confidenceScore) &&
        Objects.equals(this.description, recognitionOutcome.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidenceScore, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecognitionOutcome {\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

