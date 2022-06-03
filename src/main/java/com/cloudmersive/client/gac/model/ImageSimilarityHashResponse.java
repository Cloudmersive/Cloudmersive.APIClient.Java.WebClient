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
 * Result of performing an image hash operation
 */
@ApiModel(description = "Result of performing an image hash operation")
@JsonPropertyOrder({
  ImageSimilarityHashResponse.JSON_PROPERTY_SUCCESSFUL,
  ImageSimilarityHashResponse.JSON_PROPERTY_IMAGE_HASH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:57.968804100-07:00[America/Los_Angeles]")
public class ImageSimilarityHashResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_IMAGE_HASH = "ImageHash";
  private String imageHash;

  public ImageSimilarityHashResponse() { 
  }

  public ImageSimilarityHashResponse successful(Boolean successful) {
    
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


  public ImageSimilarityHashResponse imageHash(String imageHash) {
    
    this.imageHash = imageHash;
    return this;
  }

   /**
   * String representing image perceptual hash value; values with smaller Hamming Distances are more similar than ones with large Hamming Distances
   * @return imageHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "String representing image perceptual hash value; values with smaller Hamming Distances are more similar than ones with large Hamming Distances")
  @JsonProperty(JSON_PROPERTY_IMAGE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageHash() {
    return imageHash;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageHash(String imageHash) {
    this.imageHash = imageHash;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSimilarityHashResponse imageSimilarityHashResponse = (ImageSimilarityHashResponse) o;
    return Objects.equals(this.successful, imageSimilarityHashResponse.successful) &&
        Objects.equals(this.imageHash, imageSimilarityHashResponse.imageHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, imageHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSimilarityHashResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    imageHash: ").append(toIndentedString(imageHash)).append("\n");
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

