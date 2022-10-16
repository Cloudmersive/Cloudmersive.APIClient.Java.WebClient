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
 * Individual instance of text occuring in an image; one piece of text
 */
@ApiModel(description = "Individual instance of text occuring in an image; one piece of text")
@JsonPropertyOrder({
  FineTextItem.JSON_PROPERTY_TOP_LEFT_X,
  FineTextItem.JSON_PROPERTY_TOP_LEFT_Y,
  FineTextItem.JSON_PROPERTY_TOP_RIGHT_X,
  FineTextItem.JSON_PROPERTY_TOP_RIGHT_Y,
  FineTextItem.JSON_PROPERTY_BOTTOM_LEFT_X,
  FineTextItem.JSON_PROPERTY_BOTTOM_LEFT_Y,
  FineTextItem.JSON_PROPERTY_BOTTOM_RIGHT_X,
  FineTextItem.JSON_PROPERTY_BOTTOM_RIGHT_Y,
  FineTextItem.JSON_PROPERTY_WIDTH,
  FineTextItem.JSON_PROPERTY_HEIGHT,
  FineTextItem.JSON_PROPERTY_ANGLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:01.811624800-07:00[America/Los_Angeles]")
public class FineTextItem {
  public static final String JSON_PROPERTY_TOP_LEFT_X = "TopLeftX";
  private Integer topLeftX;

  public static final String JSON_PROPERTY_TOP_LEFT_Y = "TopLeftY";
  private Integer topLeftY;

  public static final String JSON_PROPERTY_TOP_RIGHT_X = "TopRightX";
  private Integer topRightX;

  public static final String JSON_PROPERTY_TOP_RIGHT_Y = "TopRightY";
  private Integer topRightY;

  public static final String JSON_PROPERTY_BOTTOM_LEFT_X = "BottomLeftX";
  private Integer bottomLeftX;

  public static final String JSON_PROPERTY_BOTTOM_LEFT_Y = "BottomLeftY";
  private Integer bottomLeftY;

  public static final String JSON_PROPERTY_BOTTOM_RIGHT_X = "BottomRightX";
  private Integer bottomRightX;

  public static final String JSON_PROPERTY_BOTTOM_RIGHT_Y = "BottomRightY";
  private Integer bottomRightY;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_ANGLE = "Angle";
  private Double angle;

  public FineTextItem() { 
  }

  public FineTextItem topLeftX(Integer topLeftX) {
    
    this.topLeftX = topLeftX;
    return this;
  }

   /**
   * X coordinate of the top/left text location; 0 represents the left edge of the input image
   * @return topLeftX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the top/left text location; 0 represents the left edge of the input image")
  @JsonProperty(JSON_PROPERTY_TOP_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopLeftX() {
    return topLeftX;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLeftX(Integer topLeftX) {
    this.topLeftX = topLeftX;
  }


  public FineTextItem topLeftY(Integer topLeftY) {
    
    this.topLeftY = topLeftY;
    return this;
  }

   /**
   * Y coordinate of the top/left text location; 0 represents the top edge of the input image
   * @return topLeftY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the top/left text location; 0 represents the top edge of the input image")
  @JsonProperty(JSON_PROPERTY_TOP_LEFT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopLeftY() {
    return topLeftY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_LEFT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopLeftY(Integer topLeftY) {
    this.topLeftY = topLeftY;
  }


  public FineTextItem topRightX(Integer topRightX) {
    
    this.topRightX = topRightX;
    return this;
  }

   /**
   * X coordinate of the top/right text location; 0 represents the left edge of the input image
   * @return topRightX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the top/right text location; 0 represents the left edge of the input image")
  @JsonProperty(JSON_PROPERTY_TOP_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopRightX() {
    return topRightX;
  }


  @JsonProperty(JSON_PROPERTY_TOP_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopRightX(Integer topRightX) {
    this.topRightX = topRightX;
  }


  public FineTextItem topRightY(Integer topRightY) {
    
    this.topRightY = topRightY;
    return this;
  }

   /**
   * Y coordinate of the top/right text location; 0 represents the top edge of the input image
   * @return topRightY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the top/right text location; 0 represents the top edge of the input image")
  @JsonProperty(JSON_PROPERTY_TOP_RIGHT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTopRightY() {
    return topRightY;
  }


  @JsonProperty(JSON_PROPERTY_TOP_RIGHT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopRightY(Integer topRightY) {
    this.topRightY = topRightY;
  }


  public FineTextItem bottomLeftX(Integer bottomLeftX) {
    
    this.bottomLeftX = bottomLeftX;
    return this;
  }

   /**
   * X coordinate of the bottom/left text location; 0 represents the left edge of the input image
   * @return bottomLeftX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the bottom/left text location; 0 represents the left edge of the input image")
  @JsonProperty(JSON_PROPERTY_BOTTOM_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomLeftX() {
    return bottomLeftX;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_LEFT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomLeftX(Integer bottomLeftX) {
    this.bottomLeftX = bottomLeftX;
  }


  public FineTextItem bottomLeftY(Integer bottomLeftY) {
    
    this.bottomLeftY = bottomLeftY;
    return this;
  }

   /**
   * Y coordinate of the bottom/left text location; 0 represents the top edge of the input image
   * @return bottomLeftY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the bottom/left text location; 0 represents the top edge of the input image")
  @JsonProperty(JSON_PROPERTY_BOTTOM_LEFT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomLeftY() {
    return bottomLeftY;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_LEFT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomLeftY(Integer bottomLeftY) {
    this.bottomLeftY = bottomLeftY;
  }


  public FineTextItem bottomRightX(Integer bottomRightX) {
    
    this.bottomRightX = bottomRightX;
    return this;
  }

   /**
   * X coordinate of the bottom/right text location; 0 represents the left edge of the input image
   * @return bottomRightX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "X coordinate of the bottom/right text location; 0 represents the left edge of the input image")
  @JsonProperty(JSON_PROPERTY_BOTTOM_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomRightX() {
    return bottomRightX;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_RIGHT_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomRightX(Integer bottomRightX) {
    this.bottomRightX = bottomRightX;
  }


  public FineTextItem bottomRightY(Integer bottomRightY) {
    
    this.bottomRightY = bottomRightY;
    return this;
  }

   /**
   * Y coordinate of the bottom/right text location; 0 represents the top edge of the input image
   * @return bottomRightY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Y coordinate of the bottom/right text location; 0 represents the top edge of the input image")
  @JsonProperty(JSON_PROPERTY_BOTTOM_RIGHT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBottomRightY() {
    return bottomRightY;
  }


  @JsonProperty(JSON_PROPERTY_BOTTOM_RIGHT_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBottomRightY(Integer bottomRightY) {
    this.bottomRightY = bottomRightY;
  }


  public FineTextItem width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the text
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width in pixels of the text")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public FineTextItem height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the text
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height in pixels of the text")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public FineTextItem angle(Double angle) {
    
    this.angle = angle;
    return this;
  }

   /**
   * Rotation Angle in radians of the text
   * @return angle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rotation Angle in radians of the text")
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
    FineTextItem fineTextItem = (FineTextItem) o;
    return Objects.equals(this.topLeftX, fineTextItem.topLeftX) &&
        Objects.equals(this.topLeftY, fineTextItem.topLeftY) &&
        Objects.equals(this.topRightX, fineTextItem.topRightX) &&
        Objects.equals(this.topRightY, fineTextItem.topRightY) &&
        Objects.equals(this.bottomLeftX, fineTextItem.bottomLeftX) &&
        Objects.equals(this.bottomLeftY, fineTextItem.bottomLeftY) &&
        Objects.equals(this.bottomRightX, fineTextItem.bottomRightX) &&
        Objects.equals(this.bottomRightY, fineTextItem.bottomRightY) &&
        Objects.equals(this.width, fineTextItem.width) &&
        Objects.equals(this.height, fineTextItem.height) &&
        Objects.equals(this.angle, fineTextItem.angle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topLeftX, topLeftY, topRightX, topRightY, bottomLeftX, bottomLeftY, bottomRightX, bottomRightY, width, height, angle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTextItem {\n");
    sb.append("    topLeftX: ").append(toIndentedString(topLeftX)).append("\n");
    sb.append("    topLeftY: ").append(toIndentedString(topLeftY)).append("\n");
    sb.append("    topRightX: ").append(toIndentedString(topRightX)).append("\n");
    sb.append("    topRightY: ").append(toIndentedString(topRightY)).append("\n");
    sb.append("    bottomLeftX: ").append(toIndentedString(bottomLeftX)).append("\n");
    sb.append("    bottomLeftY: ").append(toIndentedString(bottomLeftY)).append("\n");
    sb.append("    bottomRightX: ").append(toIndentedString(bottomRightX)).append("\n");
    sb.append("    bottomRightY: ").append(toIndentedString(bottomRightY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

