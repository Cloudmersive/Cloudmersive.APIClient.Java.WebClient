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
 * Result of performing an XXE threat detection operation
 */
@ApiModel(description = "Result of performing an XXE threat detection operation")
@JsonPropertyOrder({
  XxeThreatDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  XxeThreatDetectionResult.JSON_PROPERTY_CONTAINS_XXE_THREAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class XxeThreatDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINS_XXE_THREAT = "ContainsXxeThreat";
  private Boolean containsXxeThreat;

  public XxeThreatDetectionResult() { 
  }

  public XxeThreatDetectionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
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


  public XxeThreatDetectionResult containsXxeThreat(Boolean containsXxeThreat) {
    
    this.containsXxeThreat = containsXxeThreat;
    return this;
  }

   /**
   * True if the XML input contains XXE threats, false otherwise
   * @return containsXxeThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the XML input contains XXE threats, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINS_XXE_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsXxeThreat() {
    return containsXxeThreat;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_XXE_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsXxeThreat(Boolean containsXxeThreat) {
    this.containsXxeThreat = containsXxeThreat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XxeThreatDetectionResult xxeThreatDetectionResult = (XxeThreatDetectionResult) o;
    return Objects.equals(this.successful, xxeThreatDetectionResult.successful) &&
        Objects.equals(this.containsXxeThreat, xxeThreatDetectionResult.containsXxeThreat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containsXxeThreat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XxeThreatDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containsXxeThreat: ").append(toIndentedString(containsXxeThreat)).append("\n");
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

