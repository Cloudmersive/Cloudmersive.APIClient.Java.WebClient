/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
 * XlsxImage
 */
@JsonPropertyOrder({
  XlsxImage.JSON_PROPERTY_PATH,
  XlsxImage.JSON_PROPERTY_IMAGE_DATA_EMBED_ID,
  XlsxImage.JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE,
  XlsxImage.JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME,
  XlsxImage.JSON_PROPERTY_IMAGE_CONTENTS_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class XlsxImage {
  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_IMAGE_DATA_EMBED_ID = "ImageDataEmbedId";
  private String imageDataEmbedId;

  public static final String JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE = "ImageDataContentType";
  private String imageDataContentType;

  public static final String JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME = "ImageInternalFileName";
  private String imageInternalFileName;

  public static final String JSON_PROPERTY_IMAGE_CONTENTS_U_R_L = "ImageContentsURL";
  private String imageContentsURL;

  public XlsxImage() { 
  }

  public XlsxImage path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new rows
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new rows")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public XlsxImage imageDataEmbedId(String imageDataEmbedId) {
    
    this.imageDataEmbedId = imageDataEmbedId;
    return this;
  }

   /**
   * Read-only; internal ID for the image contents
   * @return imageDataEmbedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; internal ID for the image contents")
  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_EMBED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageDataEmbedId() {
    return imageDataEmbedId;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_EMBED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageDataEmbedId(String imageDataEmbedId) {
    this.imageDataEmbedId = imageDataEmbedId;
  }


  public XlsxImage imageDataContentType(String imageDataContentType) {
    
    this.imageDataContentType = imageDataContentType;
    return this;
  }

   /**
   * Read-only; image data MIME content-type
   * @return imageDataContentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; image data MIME content-type")
  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageDataContentType() {
    return imageDataContentType;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_DATA_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageDataContentType(String imageDataContentType) {
    this.imageDataContentType = imageDataContentType;
  }


  public XlsxImage imageInternalFileName(String imageInternalFileName) {
    
    this.imageInternalFileName = imageInternalFileName;
    return this;
  }

   /**
   * Read-only; internal file name/path for the image
   * @return imageInternalFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only; internal file name/path for the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageInternalFileName() {
    return imageInternalFileName;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_INTERNAL_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageInternalFileName(String imageInternalFileName) {
    this.imageInternalFileName = imageInternalFileName;
  }


  public XlsxImage imageContentsURL(String imageContentsURL) {
    
    this.imageContentsURL = imageContentsURL;
    return this;
  }

   /**
   * URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.
   * @return imageContentsURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the image contents; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the contents.")
  @JsonProperty(JSON_PROPERTY_IMAGE_CONTENTS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageContentsURL() {
    return imageContentsURL;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_CONTENTS_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageContentsURL(String imageContentsURL) {
    this.imageContentsURL = imageContentsURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XlsxImage xlsxImage = (XlsxImage) o;
    return Objects.equals(this.path, xlsxImage.path) &&
        Objects.equals(this.imageDataEmbedId, xlsxImage.imageDataEmbedId) &&
        Objects.equals(this.imageDataContentType, xlsxImage.imageDataContentType) &&
        Objects.equals(this.imageInternalFileName, xlsxImage.imageInternalFileName) &&
        Objects.equals(this.imageContentsURL, xlsxImage.imageContentsURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, imageDataEmbedId, imageDataContentType, imageInternalFileName, imageContentsURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XlsxImage {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    imageDataEmbedId: ").append(toIndentedString(imageDataEmbedId)).append("\n");
    sb.append("    imageDataContentType: ").append(toIndentedString(imageDataContentType)).append("\n");
    sb.append("    imageInternalFileName: ").append(toIndentedString(imageInternalFileName)).append("\n");
    sb.append("    imageContentsURL: ").append(toIndentedString(imageContentsURL)).append("\n");
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

