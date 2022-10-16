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
  TextItem.JSON_PROPERTY_LEFT_X,
  TextItem.JSON_PROPERTY_TOP_Y,
  TextItem.JSON_PROPERTY_WIDTH,
  TextItem.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:17.104419100-07:00[America/Los_Angeles]")
public class TextItem {
  public static final String JSON_PROPERTY_LEFT_X = "LeftX";
  private Integer leftX;

  public static final String JSON_PROPERTY_TOP_Y = "TopY";
  private Integer topY;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public TextItem() { 
  }

  public TextItem leftX(Integer leftX) {
    
    this.leftX = leftX;
    return this;
  }

   /**
   * Left X coordinate of the text location; 0 represents the left edge of the input image
   * @return leftX
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Left X coordinate of the text location; 0 represents the left edge of the input image")
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


  public TextItem topY(Integer topY) {
    
    this.topY = topY;
    return this;
  }

   /**
   * Top Y coordinate of the text location; 0 represents the top edge of the input image
   * @return topY
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Top Y coordinate of the text location; 0 represents the top edge of the input image")
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


  public TextItem width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the text item
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width in pixels of the text item")
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


  public TextItem height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the text item
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height in pixels of the text item")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextItem textItem = (TextItem) o;
    return Objects.equals(this.leftX, textItem.leftX) &&
        Objects.equals(this.topY, textItem.topY) &&
        Objects.equals(this.width, textItem.width) &&
        Objects.equals(this.height, textItem.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leftX, topY, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextItem {\n");
    sb.append("    leftX: ").append(toIndentedString(leftX)).append("\n");
    sb.append("    topY: ").append(toIndentedString(topY)).append("\n");
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

