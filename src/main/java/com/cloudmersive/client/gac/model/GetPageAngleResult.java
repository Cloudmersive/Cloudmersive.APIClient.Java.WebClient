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
 * Result of performing a get-page-angle operation
 */
@ApiModel(description = "Result of performing a get-page-angle operation")
@JsonPropertyOrder({
  GetPageAngleResult.JSON_PROPERTY_SUCCESSFUL,
  GetPageAngleResult.JSON_PROPERTY_ANGLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:11.081951500-07:00[America/Los_Angeles]")
public class GetPageAngleResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ANGLE = "Angle";
  private Double angle;

  public GetPageAngleResult() { 
  }

  public GetPageAngleResult successful(Boolean successful) {
    
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


  public GetPageAngleResult angle(Double angle) {
    
    this.angle = angle;
    return this;
  }

   /**
   * Angle of the page in radians; 0 represents perfectly horizontal
   * @return angle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Angle of the page in radians; 0 represents perfectly horizontal")
  @JsonProperty(JSON_PROPERTY_ANGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAngle() {
    return angle;
  }


  @JsonProperty(JSON_PROPERTY_ANGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAngle(Double angle) {
    this.angle = angle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPageAngleResult getPageAngleResult = (GetPageAngleResult) o;
    return Objects.equals(this.successful, getPageAngleResult.successful) &&
        Objects.equals(this.angle, getPageAngleResult.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, angle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPageAngleResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    angle: ").append(toIndentedString(angle)).append("\n");
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

