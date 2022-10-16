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
import com.cloudmersive.client.gac.model.DrawTextInstance;
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
 * Request to draw one or more pieces of text onto an image
 */
@ApiModel(description = "Request to draw one or more pieces of text onto an image")
@JsonPropertyOrder({
  DrawTextRequest.JSON_PROPERTY_BASE_IMAGE_BYTES,
  DrawTextRequest.JSON_PROPERTY_BASE_IMAGE_URL,
  DrawTextRequest.JSON_PROPERTY_TEXT_TO_DRAW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:01.811624800-07:00[America/Los_Angeles]")
public class DrawTextRequest {
  public static final String JSON_PROPERTY_BASE_IMAGE_BYTES = "BaseImageBytes";
  private byte[] baseImageBytes;

  public static final String JSON_PROPERTY_BASE_IMAGE_URL = "BaseImageUrl";
  private String baseImageUrl;

  public static final String JSON_PROPERTY_TEXT_TO_DRAW = "TextToDraw";
  private List<DrawTextInstance> textToDraw = null;

  public DrawTextRequest() { 
  }

  public DrawTextRequest baseImageBytes(byte[] baseImageBytes) {
    
    this.baseImageBytes = baseImageBytes;
    return this;
  }

   /**
   * Image to draw text on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL
   * @return baseImageBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image to draw text on, in bytes.  You can also use the BaseImageUrl instead to supply image input as a URL")
  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getBaseImageBytes() {
    return baseImageBytes;
  }


  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseImageBytes(byte[] baseImageBytes) {
    this.baseImageBytes = baseImageBytes;
  }


  public DrawTextRequest baseImageUrl(String baseImageUrl) {
    
    this.baseImageUrl = baseImageUrl;
    return this;
  }

   /**
   * Image to draw text on, as an HTTP or HTTPS fully-qualified URL
   * @return baseImageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image to draw text on, as an HTTP or HTTPS fully-qualified URL")
  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseImageUrl() {
    return baseImageUrl;
  }


  @JsonProperty(JSON_PROPERTY_BASE_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseImageUrl(String baseImageUrl) {
    this.baseImageUrl = baseImageUrl;
  }


  public DrawTextRequest textToDraw(List<DrawTextInstance> textToDraw) {
    
    this.textToDraw = textToDraw;
    return this;
  }

  public DrawTextRequest addTextToDrawItem(DrawTextInstance textToDrawItem) {
    if (this.textToDraw == null) {
      this.textToDraw = new ArrayList<>();
    }
    this.textToDraw.add(textToDrawItem);
    return this;
  }

   /**
   * One or more pieces of text to draw onto the image
   * @return textToDraw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more pieces of text to draw onto the image")
  @JsonProperty(JSON_PROPERTY_TEXT_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DrawTextInstance> getTextToDraw() {
    return textToDraw;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_TO_DRAW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextToDraw(List<DrawTextInstance> textToDraw) {
    this.textToDraw = textToDraw;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DrawTextRequest drawTextRequest = (DrawTextRequest) o;
    return Arrays.equals(this.baseImageBytes, drawTextRequest.baseImageBytes) &&
        Objects.equals(this.baseImageUrl, drawTextRequest.baseImageUrl) &&
        Objects.equals(this.textToDraw, drawTextRequest.textToDraw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(baseImageBytes), baseImageUrl, textToDraw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DrawTextRequest {\n");
    sb.append("    baseImageBytes: ").append(toIndentedString(baseImageBytes)).append("\n");
    sb.append("    baseImageUrl: ").append(toIndentedString(baseImageUrl)).append("\n");
    sb.append("    textToDraw: ").append(toIndentedString(textToDraw)).append("\n");
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

