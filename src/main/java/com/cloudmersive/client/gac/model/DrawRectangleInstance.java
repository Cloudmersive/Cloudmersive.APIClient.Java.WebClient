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
 * Rectangle instance to draw on an image
 */
@ApiModel(description = "Rectangle instance to draw on an image")
@JsonPropertyOrder({
  DrawRectangleInstance.JSON_PROPERTY_BORDER_COLOR,
  DrawRectangleInstance.JSON_PROPERTY_BORDER_WIDTH,
  DrawRectangleInstance.JSON_PROPERTY_FILL_COLOR,
  DrawRectangleInstance.JSON_PROPERTY_X,
  DrawRectangleInstance.JSON_PROPERTY_Y,
  DrawRectangleInstance.JSON_PROPERTY_WIDTH,
  DrawRectangleInstance.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:57.968804100-07:00[America/Los_Angeles]")
public class DrawRectangleInstance {
  public static final String JSON_PROPERTY_BORDER_COLOR = "BorderColor";
  private String borderColor;

  public static final String JSON_PROPERTY_BORDER_WIDTH = "BorderWidth";
  private Double borderWidth;

  public static final String JSON_PROPERTY_FILL_COLOR = "FillColor";
  private String fillColor;

  public static final String JSON_PROPERTY_X = "X";
  private Double X;

  public static final String JSON_PROPERTY_Y = "Y";
  private Double Y;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Double width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Double height;

  public DrawRectangleInstance() { 
  }

  public DrawRectangleInstance borderColor(String borderColor) {
    
    this.borderColor = borderColor;
    return this;
  }

   /**
   * Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.
   * @return borderColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Border Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.")
  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBorderColor() {
    return borderColor;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  public DrawRectangleInstance borderWidth(Double borderWidth) {
    
    this.borderWidth = borderWidth;
    return this;
  }

   /**
   * Width in pixels of the border.  Pass in 0 to draw a rectangle with no border
   * @return borderWidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width in pixels of the border.  Pass in 0 to draw a rectangle with no border")
  @JsonProperty(JSON_PROPERTY_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getBorderWidth() {
    return borderWidth;
  }


  @JsonProperty(JSON_PROPERTY_BORDER_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorderWidth(Double borderWidth) {
    this.borderWidth = borderWidth;
  }


  public DrawRectangleInstance fillColor(String fillColor) {
    
    this.fillColor = fillColor;
    return this;
  }

   /**
   * Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the rectangle.
   * @return fillColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fill Color to use - can be a hex value (with #) or HTML common color name.  Transparent colors are supported.  Leave blank to not fill the rectangle.")
  @JsonProperty(JSON_PROPERTY_FILL_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFillColor() {
    return fillColor;
  }


  @JsonProperty(JSON_PROPERTY_FILL_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }


  public DrawRectangleInstance X(Double X) {
    
    this.X = X;
    return this;
  }

   /**
   * Pixel location of the left edge of the rectangle location
   * @return X
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pixel location of the left edge of the rectangle location")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getX() {
    return X;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(Double X) {
    this.X = X;
  }


  public DrawRectangleInstance Y(Double Y) {
    
    this.Y = Y;
    return this;
  }

   /**
   * Pixel location of the top edge of the rectangle location
   * @return Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pixel location of the top edge of the rectangle location")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getY() {
    return Y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(Double Y) {
    this.Y = Y;
  }


  public DrawRectangleInstance width(Double width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the rectangle
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width in pixels of the rectangle")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Double width) {
    this.width = width;
  }


  public DrawRectangleInstance height(Double height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the rectangle
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height in pixels of the rectangle")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Double height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawRectangleInstance drawRectangleInstance = (DrawRectangleInstance) o;
    return Objects.equals(this.borderColor, drawRectangleInstance.borderColor) &&
        Objects.equals(this.borderWidth, drawRectangleInstance.borderWidth) &&
        Objects.equals(this.fillColor, drawRectangleInstance.fillColor) &&
        Objects.equals(this.X, drawRectangleInstance.X) &&
        Objects.equals(this.Y, drawRectangleInstance.Y) &&
        Objects.equals(this.width, drawRectangleInstance.width) &&
        Objects.equals(this.height, drawRectangleInstance.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(borderColor, borderWidth, fillColor, X, Y, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawRectangleInstance {\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    fillColor: ").append(toIndentedString(fillColor)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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
