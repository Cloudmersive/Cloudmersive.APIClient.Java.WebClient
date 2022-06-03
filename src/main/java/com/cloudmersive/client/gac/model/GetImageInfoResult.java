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
import com.cloudmersive.client.gac.model.ExifValue;
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
 * Result of running a get-info operation on an image
 */
@ApiModel(description = "Result of running a get-info operation on an image")
@JsonPropertyOrder({
  GetImageInfoResult.JSON_PROPERTY_SUCCESSFUL,
  GetImageInfoResult.JSON_PROPERTY_COLOR_SPACE,
  GetImageInfoResult.JSON_PROPERTY_COLOR_TYPE,
  GetImageInfoResult.JSON_PROPERTY_WIDTH,
  GetImageInfoResult.JSON_PROPERTY_HEIGHT,
  GetImageInfoResult.JSON_PROPERTY_COMPRESSION_LEVEL,
  GetImageInfoResult.JSON_PROPERTY_IMAGE_HASH_SIGNATURE,
  GetImageInfoResult.JSON_PROPERTY_HAS_TRANSPARENCY,
  GetImageInfoResult.JSON_PROPERTY_MIME_TYPE,
  GetImageInfoResult.JSON_PROPERTY_IMAGE_FORMAT,
  GetImageInfoResult.JSON_PROPERTY_DP_I_UNIT,
  GetImageInfoResult.JSON_PROPERTY_D_P_I,
  GetImageInfoResult.JSON_PROPERTY_COLOR_COUNT,
  GetImageInfoResult.JSON_PROPERTY_BIT_DEPTH,
  GetImageInfoResult.JSON_PROPERTY_COMMENT,
  GetImageInfoResult.JSON_PROPERTY_EXIF_PROFILE_NAME,
  GetImageInfoResult.JSON_PROPERTY_EXIF_VALUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class GetImageInfoResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COLOR_SPACE = "ColorSpace";
  private String colorSpace;

  public static final String JSON_PROPERTY_COLOR_TYPE = "ColorType";
  private String colorType;

  public static final String JSON_PROPERTY_WIDTH = "Width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "Height";
  private Integer height;

  public static final String JSON_PROPERTY_COMPRESSION_LEVEL = "CompressionLevel";
  private Integer compressionLevel;

  public static final String JSON_PROPERTY_IMAGE_HASH_SIGNATURE = "ImageHashSignature";
  private String imageHashSignature;

  public static final String JSON_PROPERTY_HAS_TRANSPARENCY = "HasTransparency";
  private Boolean hasTransparency;

  public static final String JSON_PROPERTY_MIME_TYPE = "MimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_IMAGE_FORMAT = "ImageFormat";
  private String imageFormat;

  public static final String JSON_PROPERTY_DP_I_UNIT = "DPIUnit";
  private String dpIUnit;

  public static final String JSON_PROPERTY_D_P_I = "DPI";
  private Double DPI;

  public static final String JSON_PROPERTY_COLOR_COUNT = "ColorCount";
  private Integer colorCount;

  public static final String JSON_PROPERTY_BIT_DEPTH = "BitDepth";
  private Integer bitDepth;

  public static final String JSON_PROPERTY_COMMENT = "Comment";
  private String comment;

  public static final String JSON_PROPERTY_EXIF_PROFILE_NAME = "ExifProfileName";
  private String exifProfileName;

  public static final String JSON_PROPERTY_EXIF_VALUES = "ExifValues";
  private List<ExifValue> exifValues = null;

  public GetImageInfoResult() { 
  }

  public GetImageInfoResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public GetImageInfoResult colorSpace(String colorSpace) {
    
    this.colorSpace = colorSpace;
    return this;
  }

   /**
   * Color space of the image
   * @return colorSpace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color space of the image")
  @JsonProperty(JSON_PROPERTY_COLOR_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColorSpace() {
    return colorSpace;
  }


  @JsonProperty(JSON_PROPERTY_COLOR_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorSpace(String colorSpace) {
    this.colorSpace = colorSpace;
  }


  public GetImageInfoResult colorType(String colorType) {
    
    this.colorType = colorType;
    return this;
  }

   /**
   * Color type of the image
   * @return colorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Color type of the image")
  @JsonProperty(JSON_PROPERTY_COLOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColorType() {
    return colorType;
  }


  @JsonProperty(JSON_PROPERTY_COLOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorType(String colorType) {
    this.colorType = colorType;
  }


  public GetImageInfoResult width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Width in pixels of the image
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width in pixels of the image")
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


  public GetImageInfoResult height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Height in pixels of the image
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height in pixels of the image")
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


  public GetImageInfoResult compressionLevel(Integer compressionLevel) {
    
    this.compressionLevel = compressionLevel;
    return this;
  }

   /**
   * Compression level value from 0 (lowest quality) to 100 (highest quality)
   * @return compressionLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Compression level value from 0 (lowest quality) to 100 (highest quality)")
  @JsonProperty(JSON_PROPERTY_COMPRESSION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCompressionLevel() {
    return compressionLevel;
  }


  @JsonProperty(JSON_PROPERTY_COMPRESSION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompressionLevel(Integer compressionLevel) {
    this.compressionLevel = compressionLevel;
  }


  public GetImageInfoResult imageHashSignature(String imageHashSignature) {
    
    this.imageHashSignature = imageHashSignature;
    return this;
  }

   /**
   * SHA256 hash signature of the image
   * @return imageHashSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SHA256 hash signature of the image")
  @JsonProperty(JSON_PROPERTY_IMAGE_HASH_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageHashSignature() {
    return imageHashSignature;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_HASH_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageHashSignature(String imageHashSignature) {
    this.imageHashSignature = imageHashSignature;
  }


  public GetImageInfoResult hasTransparency(Boolean hasTransparency) {
    
    this.hasTransparency = hasTransparency;
    return this;
  }

   /**
   * True if the image contains transparency, otherwise false
   * @return hasTransparency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the image contains transparency, otherwise false")
  @JsonProperty(JSON_PROPERTY_HAS_TRANSPARENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasTransparency() {
    return hasTransparency;
  }


  @JsonProperty(JSON_PROPERTY_HAS_TRANSPARENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasTransparency(Boolean hasTransparency) {
    this.hasTransparency = hasTransparency;
  }


  public GetImageInfoResult mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIME type of the image format
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MIME type of the image format")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public GetImageInfoResult imageFormat(String imageFormat) {
    
    this.imageFormat = imageFormat;
    return this;
  }

   /**
   * Image format
   * @return imageFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image format")
  @JsonProperty(JSON_PROPERTY_IMAGE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageFormat() {
    return imageFormat;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageFormat(String imageFormat) {
    this.imageFormat = imageFormat;
  }


  public GetImageInfoResult dpIUnit(String dpIUnit) {
    
    this.dpIUnit = dpIUnit;
    return this;
  }

   /**
   * Units of the DPI measurement; can be either in Inches or Centimeters
   * @return dpIUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Units of the DPI measurement; can be either in Inches or Centimeters")
  @JsonProperty(JSON_PROPERTY_DP_I_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDpIUnit() {
    return dpIUnit;
  }


  @JsonProperty(JSON_PROPERTY_DP_I_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDpIUnit(String dpIUnit) {
    this.dpIUnit = dpIUnit;
  }


  public GetImageInfoResult DPI(Double DPI) {
    
    this.DPI = DPI;
    return this;
  }

   /**
   * DPI (pixels per unit, e.g. pixels per inch) of the image
   * @return DPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DPI (pixels per unit, e.g. pixels per inch) of the image")
  @JsonProperty(JSON_PROPERTY_D_P_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDPI() {
    return DPI;
  }


  @JsonProperty(JSON_PROPERTY_D_P_I)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDPI(Double DPI) {
    this.DPI = DPI;
  }


  public GetImageInfoResult colorCount(Integer colorCount) {
    
    this.colorCount = colorCount;
    return this;
  }

   /**
   * Unique colors in the image
   * @return colorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique colors in the image")
  @JsonProperty(JSON_PROPERTY_COLOR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getColorCount() {
    return colorCount;
  }


  @JsonProperty(JSON_PROPERTY_COLOR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColorCount(Integer colorCount) {
    this.colorCount = colorCount;
  }


  public GetImageInfoResult bitDepth(Integer bitDepth) {
    
    this.bitDepth = bitDepth;
    return this;
  }

   /**
   * Bit depth of the image
   * @return bitDepth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bit depth of the image")
  @JsonProperty(JSON_PROPERTY_BIT_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBitDepth() {
    return bitDepth;
  }


  @JsonProperty(JSON_PROPERTY_BIT_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBitDepth(Integer bitDepth) {
    this.bitDepth = bitDepth;
  }


  public GetImageInfoResult comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Comment string in the image
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment string in the image")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public GetImageInfoResult exifProfileName(String exifProfileName) {
    
    this.exifProfileName = exifProfileName;
    return this;
  }

   /**
   * Name of the EXIF profile used
   * @return exifProfileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the EXIF profile used")
  @JsonProperty(JSON_PROPERTY_EXIF_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExifProfileName() {
    return exifProfileName;
  }


  @JsonProperty(JSON_PROPERTY_EXIF_PROFILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExifProfileName(String exifProfileName) {
    this.exifProfileName = exifProfileName;
  }


  public GetImageInfoResult exifValues(List<ExifValue> exifValues) {
    
    this.exifValues = exifValues;
    return this;
  }

  public GetImageInfoResult addExifValuesItem(ExifValue exifValuesItem) {
    if (this.exifValues == null) {
      this.exifValues = new ArrayList<>();
    }
    this.exifValues.add(exifValuesItem);
    return this;
  }

   /**
   * EXIF tags and values embedded in the image
   * @return exifValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EXIF tags and values embedded in the image")
  @JsonProperty(JSON_PROPERTY_EXIF_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ExifValue> getExifValues() {
    return exifValues;
  }


  @JsonProperty(JSON_PROPERTY_EXIF_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExifValues(List<ExifValue> exifValues) {
    this.exifValues = exifValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetImageInfoResult getImageInfoResult = (GetImageInfoResult) o;
    return Objects.equals(this.successful, getImageInfoResult.successful) &&
        Objects.equals(this.colorSpace, getImageInfoResult.colorSpace) &&
        Objects.equals(this.colorType, getImageInfoResult.colorType) &&
        Objects.equals(this.width, getImageInfoResult.width) &&
        Objects.equals(this.height, getImageInfoResult.height) &&
        Objects.equals(this.compressionLevel, getImageInfoResult.compressionLevel) &&
        Objects.equals(this.imageHashSignature, getImageInfoResult.imageHashSignature) &&
        Objects.equals(this.hasTransparency, getImageInfoResult.hasTransparency) &&
        Objects.equals(this.mimeType, getImageInfoResult.mimeType) &&
        Objects.equals(this.imageFormat, getImageInfoResult.imageFormat) &&
        Objects.equals(this.dpIUnit, getImageInfoResult.dpIUnit) &&
        Objects.equals(this.DPI, getImageInfoResult.DPI) &&
        Objects.equals(this.colorCount, getImageInfoResult.colorCount) &&
        Objects.equals(this.bitDepth, getImageInfoResult.bitDepth) &&
        Objects.equals(this.comment, getImageInfoResult.comment) &&
        Objects.equals(this.exifProfileName, getImageInfoResult.exifProfileName) &&
        Objects.equals(this.exifValues, getImageInfoResult.exifValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, colorSpace, colorType, width, height, compressionLevel, imageHashSignature, hasTransparency, mimeType, imageFormat, dpIUnit, DPI, colorCount, bitDepth, comment, exifProfileName, exifValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetImageInfoResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    colorType: ").append(toIndentedString(colorType)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    compressionLevel: ").append(toIndentedString(compressionLevel)).append("\n");
    sb.append("    imageHashSignature: ").append(toIndentedString(imageHashSignature)).append("\n");
    sb.append("    hasTransparency: ").append(toIndentedString(hasTransparency)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
    sb.append("    dpIUnit: ").append(toIndentedString(dpIUnit)).append("\n");
    sb.append("    DPI: ").append(toIndentedString(DPI)).append("\n");
    sb.append("    colorCount: ").append(toIndentedString(colorCount)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    exifProfileName: ").append(toIndentedString(exifProfileName)).append("\n");
    sb.append("    exifValues: ").append(toIndentedString(exifValues)).append("\n");
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

