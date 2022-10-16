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
 * Location of one face in an image
 */
@ApiModel(description = "Location of one face in an image")
@JsonPropertyOrder({
  Face.JSON_PROPERTY_LEFT_X,
  Face.JSON_PROPERTY_TOP_Y,
  Face.JSON_PROPERTY_RIGHT_X,
  Face.JSON_PROPERTY_BOTTOM_Y
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:17.104419100-07:00[America/Los_Angeles]")
public class Face {
  public static final String JSON_PROPERTY_LEFT_X = "LeftX";
  private Integer leftX;

  public static final String JSON_PROPERTY_TOP_Y = "TopY";
  private Integer topY;

  public static final String JSON_PROPERTY_RIGHT_X = "RightX";
  private Integer rightX;

  public static final String JSON_PROPERTY_BOTTOM_Y = "BottomY";
  private Integer bottomY;

  public Face() { 
  }

  public Face leftX(Integer leftX) {
    
    this.leftX = leftX;
    return this;
  }

   /**
   * X coordinate of the left side of the face
   * @return leftX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the left side of the face")
  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLeftX() {
    return leftX;
  }


  @JsonProperty(JSON_PROPERTY_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeftX(Integer leftX) {
    this.leftX = leftX;
  }


  public Face topY(Integer topY) {
    
    this.topY = topY;
    return this;
  }

   /**
   * Y coordinate of the top side of the face
   * @return topY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the top side of the face")
  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopY() {
    return topY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopY(Integer topY) {
    this.topY = topY;
  }


  public Face rightX(Integer rightX) {
    
    this.rightX = rightX;
    return this;
  }

   /**
   * X coordinate of the right side of the face
   * @return rightX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the right side of the face")
  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRightX() {
    return rightX;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRightX(Integer rightX) {
    this.rightX = rightX;
  }


  public Face bottomY(Integer bottomY) {
    
    this.bottomY = bottomY;
    return this;
  }

   /**
   * Y coordinate of the bottom side of the face
   * @return bottomY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the bottom side of the face")
  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomY() {
    return bottomY;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomY(Integer bottomY) {
    this.bottomY = bottomY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Face face = (Face) o;
    return Objects.equals(this.leftX, face.leftX) &&
        Objects.equals(this.topY, face.topY) &&
        Objects.equals(this.rightX, face.rightX) &&
        Objects.equals(this.bottomY, face.bottomY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, rightX, bottomY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Face {\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
    sb.append("    rightX: ").append(toIndentedString(rightX)).append("\n");
    sb.append("    bottomY: ").append(toIndentedString(bottomY)).append("\n");
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

