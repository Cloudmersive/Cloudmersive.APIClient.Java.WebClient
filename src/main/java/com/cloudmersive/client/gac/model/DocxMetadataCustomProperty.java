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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Name and value pair for a custom-defined DOCX metadata property
 */
@ApiModel(description = "Name and value pair for a custom-defined DOCX metadata property")
@JsonPropertyOrder({
  DocxMetadataCustomProperty.JSON_PROPERTY_PROPERTY_NAME,
  DocxMetadataCustomProperty.JSON_PROPERTY_PROPERTY_DATA_TYPE,
  DocxMetadataCustomProperty.JSON_PROPERTY_STRING_VALUE,
  DocxMetadataCustomProperty.JSON_PROPERTY_INTEGER_VALUE,
  DocxMetadataCustomProperty.JSON_PROPERTY_DOUBLE_VALUE,
  DocxMetadataCustomProperty.JSON_PROPERTY_DATE_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class DocxMetadataCustomProperty {
  public static final String JSON_PROPERTY_PROPERTY_NAME = "PropertyName";
  private String propertyName;

  public static final String JSON_PROPERTY_PROPERTY_DATA_TYPE = "PropertyDataType";
  private String propertyDataType;

  public static final String JSON_PROPERTY_STRING_VALUE = "StringValue";
  private String stringValue;

  public static final String JSON_PROPERTY_INTEGER_VALUE = "IntegerValue";
  private Long integerValue;

  public static final String JSON_PROPERTY_DOUBLE_VALUE = "DoubleValue";
  private Double doubleValue;

  public static final String JSON_PROPERTY_DATE_VALUE = "DateValue";
  private OffsetDateTime dateValue;

  public DocxMetadataCustomProperty() { 
  }

  public DocxMetadataCustomProperty propertyName(String propertyName) {
    
    this.propertyName = propertyName;
    return this;
  }

   /**
   * Name of the property
   * @return propertyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the property")
  @JsonProperty(JSON_PROPERTY_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyName() {
    return propertyName;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }


  public DocxMetadataCustomProperty propertyDataType(String propertyDataType) {
    
    this.propertyDataType = propertyDataType;
    return this;
  }

   /**
   * Data type of the property; possible values are \&quot;string\&quot;, \&quot;integer\&quot;, \&quot;double\&quot; or \&quot;date\&quot;
   * @return propertyDataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data type of the property; possible values are \"string\", \"integer\", \"double\" or \"date\"")
  @JsonProperty(JSON_PROPERTY_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPropertyDataType() {
    return propertyDataType;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTY_DATA_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropertyDataType(String propertyDataType) {
    this.propertyDataType = propertyDataType;
  }


  public DocxMetadataCustomProperty stringValue(String stringValue) {
    
    this.stringValue = stringValue;
    return this;
  }

   /**
   * If the property is of a string data type, then provides the string value if available
   * @return stringValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the property is of a string data type, then provides the string value if available")
  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStringValue() {
    return stringValue;
  }


  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public DocxMetadataCustomProperty integerValue(Long integerValue) {
    
    this.integerValue = integerValue;
    return this;
  }

   /**
   * If the property is of a integer data type, then provides the integer value if available
   * @return integerValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the property is of a integer data type, then provides the integer value if available")
  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIntegerValue() {
    return integerValue;
  }


  @JsonProperty(JSON_PROPERTY_INTEGER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegerValue(Long integerValue) {
    this.integerValue = integerValue;
  }


  public DocxMetadataCustomProperty doubleValue(Double doubleValue) {
    
    this.doubleValue = doubleValue;
    return this;
  }

   /**
   * If the property is of a double floating point data type, then provides the double value if available
   * @return doubleValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the property is of a double floating point data type, then provides the double value if available")
  @JsonProperty(JSON_PROPERTY_DOUBLE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDoubleValue() {
    return doubleValue;
  }


  @JsonProperty(JSON_PROPERTY_DOUBLE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public DocxMetadataCustomProperty dateValue(OffsetDateTime dateValue) {
    
    this.dateValue = dateValue;
    return this;
  }

   /**
   * If the property is of a date time data type, then provides the date time value if available
   * @return dateValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the property is of a date time data type, then provides the date time value if available")
  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateValue() {
    return dateValue;
  }


  @JsonProperty(JSON_PROPERTY_DATE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateValue(OffsetDateTime dateValue) {
    this.dateValue = dateValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxMetadataCustomProperty docxMetadataCustomProperty = (DocxMetadataCustomProperty) o;
    return Objects.equals(this.propertyName, docxMetadataCustomProperty.propertyName) &&
        Objects.equals(this.propertyDataType, docxMetadataCustomProperty.propertyDataType) &&
        Objects.equals(this.stringValue, docxMetadataCustomProperty.stringValue) &&
        Objects.equals(this.integerValue, docxMetadataCustomProperty.integerValue) &&
        Objects.equals(this.doubleValue, docxMetadataCustomProperty.doubleValue) &&
        Objects.equals(this.dateValue, docxMetadataCustomProperty.dateValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, propertyDataType, stringValue, integerValue, doubleValue, dateValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxMetadataCustomProperty {\n");
    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    propertyDataType: ").append(toIndentedString(propertyDataType)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    integerValue: ").append(toIndentedString(integerValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
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

