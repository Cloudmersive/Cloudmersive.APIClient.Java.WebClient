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
import com.cloudmersive.client.gac.model.DetectedLicensePlate;
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
 * Result of detecting vehicle license plates in an image
 */
@ApiModel(description = "Result of detecting vehicle license plates in an image")
@JsonPropertyOrder({
  VehicleLicensePlateDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  VehicleLicensePlateDetectionResult.JSON_PROPERTY_DETECTED_LICENSE_PLATES,
  VehicleLicensePlateDetectionResult.JSON_PROPERTY_DETECTED_LICENSE_PLATE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:33.831018100-07:00[America/Los_Angeles]")
public class VehicleLicensePlateDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_DETECTED_LICENSE_PLATES = "DetectedLicensePlates";
  private List<DetectedLicensePlate> detectedLicensePlates = null;

  public static final String JSON_PROPERTY_DETECTED_LICENSE_PLATE_COUNT = "DetectedLicensePlateCount";
  private Integer detectedLicensePlateCount;

  public VehicleLicensePlateDetectionResult() { 
  }

  public VehicleLicensePlateDetectionResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Was the image processed successfully?
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Was the image processed successfully?")
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


  public VehicleLicensePlateDetectionResult detectedLicensePlates(List<DetectedLicensePlate> detectedLicensePlates) {
    
    this.detectedLicensePlates = detectedLicensePlates;
    return this;
  }

  public VehicleLicensePlateDetectionResult addDetectedLicensePlatesItem(DetectedLicensePlate detectedLicensePlatesItem) {
    if (this.detectedLicensePlates == null) {
      this.detectedLicensePlates = new ArrayList<>();
    }
    this.detectedLicensePlates.add(detectedLicensePlatesItem);
    return this;
  }

   /**
   * License plates found in the image
   * @return detectedLicensePlates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "License plates found in the image")
  @JsonProperty(JSON_PROPERTY_DETECTED_LICENSE_PLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DetectedLicensePlate> getDetectedLicensePlates() {
    return detectedLicensePlates;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_LICENSE_PLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedLicensePlates(List<DetectedLicensePlate> detectedLicensePlates) {
    this.detectedLicensePlates = detectedLicensePlates;
  }


  public VehicleLicensePlateDetectionResult detectedLicensePlateCount(Integer detectedLicensePlateCount) {
    
    this.detectedLicensePlateCount = detectedLicensePlateCount;
    return this;
  }

   /**
   * The number of license plates detected in the image
   * @return detectedLicensePlateCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of license plates detected in the image")
  @JsonProperty(JSON_PROPERTY_DETECTED_LICENSE_PLATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDetectedLicensePlateCount() {
    return detectedLicensePlateCount;
  }


  @JsonProperty(JSON_PROPERTY_DETECTED_LICENSE_PLATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetectedLicensePlateCount(Integer detectedLicensePlateCount) {
    this.detectedLicensePlateCount = detectedLicensePlateCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleLicensePlateDetectionResult vehicleLicensePlateDetectionResult = (VehicleLicensePlateDetectionResult) o;
    return Objects.equals(this.successful, vehicleLicensePlateDetectionResult.successful) &&
        Objects.equals(this.detectedLicensePlates, vehicleLicensePlateDetectionResult.detectedLicensePlates) &&
        Objects.equals(this.detectedLicensePlateCount, vehicleLicensePlateDetectionResult.detectedLicensePlateCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, detectedLicensePlates, detectedLicensePlateCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleLicensePlateDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    detectedLicensePlates: ").append(toIndentedString(detectedLicensePlates)).append("\n");
    sb.append("    detectedLicensePlateCount: ").append(toIndentedString(detectedLicensePlateCount)).append("\n");
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

