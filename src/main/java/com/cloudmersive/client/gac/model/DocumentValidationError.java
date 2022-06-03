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
 * Validation error found in document
 */
@ApiModel(description = "Validation error found in document")
@JsonPropertyOrder({
  DocumentValidationError.JSON_PROPERTY_DESCRIPTION,
  DocumentValidationError.JSON_PROPERTY_PATH,
  DocumentValidationError.JSON_PROPERTY_URI,
  DocumentValidationError.JSON_PROPERTY_IS_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class DocumentValidationError {
  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_URI = "Uri";
  private String uri;

  public static final String JSON_PROPERTY_IS_ERROR = "IsError";
  private Boolean isError;

  public DocumentValidationError() { 
  }

  public DocumentValidationError description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the error
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the error")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public DocumentValidationError path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * XPath to the error
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "XPath to the error")
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


  public DocumentValidationError uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * URI of the part in question
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI of the part in question")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }


  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUri(String uri) {
    this.uri = uri;
  }


  public DocumentValidationError isError(Boolean isError) {
    
    this.isError = isError;
    return this;
  }

   /**
   * True if this is an error, false otherwise
   * @return isError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this is an error, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsError() {
    return isError;
  }


  @JsonProperty(JSON_PROPERTY_IS_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsError(Boolean isError) {
    this.isError = isError;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentValidationError documentValidationError = (DocumentValidationError) o;
    return Objects.equals(this.description, documentValidationError.description) &&
        Objects.equals(this.path, documentValidationError.path) &&
        Objects.equals(this.uri, documentValidationError.uri) &&
        Objects.equals(this.isError, documentValidationError.isError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, path, uri, isError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentValidationError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
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

