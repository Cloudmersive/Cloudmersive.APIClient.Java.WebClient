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
 * EXIF tag and value
 */
@ApiModel(description = "EXIF tag and value")
@JsonPropertyOrder({
  ImageMetadataExifValue.JSON_PROPERTY_TAG,
  ImageMetadataExifValue.JSON_PROPERTY_DATA_TYPE,
  ImageMetadataExifValue.JSON_PROPERTY_DATA_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:33.831018100-07:00[America/Los_Angeles]")
public class ImageMetadataExifValue {
  public static final String JSON_PROPERTY_TAG = "Tag";
  private String tag;

  public static final String JSON_PROPERTY_DATA_TYPE = "DataType";
  private String dataType;

  public static final String JSON_PROPERTY_DATA_VALUE = "DataValue";
  private String dataValue;

  public ImageMetadataExifValue() { 
  }

  public ImageMetadataExifValue tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Tag name for the EXIF value
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag name for the EXIF value")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public ImageMetadataExifValue dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Date type of the EXIF value
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date type of the EXIF value")
  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataType() {
    return dataType;
  }


  @JsonProperty(JSON_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public ImageMetadataExifValue dataValue(String dataValue) {
    
    this.dataValue = dataValue;
    return this;
  }

   /**
   * Value, formatted as a string of the EXIF value
   * @return dataValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value, formatted as a string of the EXIF value")
  @JsonProperty(JSON_PROPERTY_DATA_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataValue() {
    return dataValue;
  }


  @JsonProperty(JSON_PROPERTY_DATA_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataValue(String dataValue) {
    this.dataValue = dataValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadataExifValue imageMetadataExifValue = (ImageMetadataExifValue) o;
    return Objects.equals(this.tag, imageMetadataExifValue.tag) &&
        Objects.equals(this.dataType, imageMetadataExifValue.dataType) &&
        Objects.equals(this.dataValue, imageMetadataExifValue.dataValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, dataType, dataValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadataExifValue {\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    dataValue: ").append(toIndentedString(dataValue)).append("\n");
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

