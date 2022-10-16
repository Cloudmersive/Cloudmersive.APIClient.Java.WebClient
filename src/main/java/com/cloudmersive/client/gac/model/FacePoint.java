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
 * Point location within a face
 */
@ApiModel(description = "Point location within a face")
@JsonPropertyOrder({
  FacePoint.JSON_PROPERTY_X,
  FacePoint.JSON_PROPERTY_Y
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:33.831018100-07:00[America/Los_Angeles]")
public class FacePoint {
  public static final String JSON_PROPERTY_X = "X";
  private Integer X;

  public static final String JSON_PROPERTY_Y = "Y";
  private Integer Y;

  public FacePoint() { 
  }

  public FacePoint X(Integer X) {
    
    this.X = X;
    return this;
  }

   /**
   * X location, where 0 is the left-most pixel
   * @return X
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X location, where 0 is the left-most pixel")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return X;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(Integer X) {
    this.X = X;
  }


  public FacePoint Y(Integer Y) {
    
    this.Y = Y;
    return this;
  }

   /**
   * Y location, where 0 is the top-most pixel
   * @return Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y location, where 0 is the top-most pixel")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return Y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(Integer Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacePoint facePoint = (FacePoint) o;
    return Objects.equals(this.X, facePoint.X) &&
        Objects.equals(this.Y, facePoint.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(X, Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacePoint {\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

