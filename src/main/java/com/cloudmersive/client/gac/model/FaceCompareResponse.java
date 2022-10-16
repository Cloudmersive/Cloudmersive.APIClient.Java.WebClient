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
import com.cloudmersive.client.gac.model.FaceMatch;
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
 * Results of comparing/matching faces in an image
 */
@ApiModel(description = "Results of comparing/matching faces in an image")
@JsonPropertyOrder({
  FaceCompareResponse.JSON_PROPERTY_SUCCESSFUL,
  FaceCompareResponse.JSON_PROPERTY_FACES,
  FaceCompareResponse.JSON_PROPERTY_FACE_COUNT,
  FaceCompareResponse.JSON_PROPERTY_ERROR_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:01.811624800-07:00[America/Los_Angeles]")
public class FaceCompareResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_FACES = "Faces";
  private List<FaceMatch> faces = null;

  public static final String JSON_PROPERTY_FACE_COUNT = "FaceCount";
  private Integer faceCount;

  public static final String JSON_PROPERTY_ERROR_DETAILS = "ErrorDetails";
  private String errorDetails;

  public FaceCompareResponse() { 
  }

  public FaceCompareResponse successful(Boolean successful) {
    
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


  public FaceCompareResponse faces(List<FaceMatch> faces) {
    
    this.faces = faces;
    return this;
  }

  public FaceCompareResponse addFacesItem(FaceMatch facesItem) {
    if (this.faces == null) {
      this.faces = new ArrayList<>();
    }
    this.faces.add(facesItem);
    return this;
  }

   /**
   * Array of faces found in the input image
   * @return faces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of faces found in the input image")
  @JsonProperty(JSON_PROPERTY_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<FaceMatch> getFaces() {
    return faces;
  }


  @JsonProperty(JSON_PROPERTY_FACES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaces(List<FaceMatch> faces) {
    this.faces = faces;
  }


  public FaceCompareResponse faceCount(Integer faceCount) {
    
    this.faceCount = faceCount;
    return this;
  }

   /**
   * Number of faces found in the image
   * @return faceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of faces found in the image")
  @JsonProperty(JSON_PROPERTY_FACE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFaceCount() {
    return faceCount;
  }


  @JsonProperty(JSON_PROPERTY_FACE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFaceCount(Integer faceCount) {
    this.faceCount = faceCount;
  }


  public FaceCompareResponse errorDetails(String errorDetails) {
    
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Details of any errors that occurred
   * @return errorDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of any errors that occurred")
  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorDetails() {
    return errorDetails;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaceCompareResponse faceCompareResponse = (FaceCompareResponse) o;
    return Objects.equals(this.successful, faceCompareResponse.successful) &&
        Objects.equals(this.faces, faceCompareResponse.faces) &&
        Objects.equals(this.faceCount, faceCompareResponse.faceCount) &&
        Objects.equals(this.errorDetails, faceCompareResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, faces, faceCount, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaceCompareResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    faces: ").append(toIndentedString(faces)).append("\n");
    sb.append("    faceCount: ").append(toIndentedString(faceCount)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

