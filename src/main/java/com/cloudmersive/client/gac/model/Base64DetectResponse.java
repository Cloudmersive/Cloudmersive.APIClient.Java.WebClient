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
 * Result of base 64 detection
 */
@ApiModel(description = "Result of base 64 detection")
@JsonPropertyOrder({
  Base64DetectResponse.JSON_PROPERTY_SUCCESSFUL,
  Base64DetectResponse.JSON_PROPERTY_IS_BASE64_ENCODED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class Base64DetectResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_IS_BASE64_ENCODED = "IsBase64Encoded";
  private Boolean isBase64Encoded;

  public Base64DetectResponse() { 
  }

  public Base64DetectResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
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


  public Base64DetectResponse isBase64Encoded(Boolean isBase64Encoded) {
    
    this.isBase64Encoded = isBase64Encoded;
    return this;
  }

   /**
   * True if the input string is base 64 encoded, false otherwise
   * @return isBase64Encoded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input string is base 64 encoded, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_BASE64_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBase64Encoded() {
    return isBase64Encoded;
  }


  @JsonProperty(JSON_PROPERTY_IS_BASE64_ENCODED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBase64Encoded(Boolean isBase64Encoded) {
    this.isBase64Encoded = isBase64Encoded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64DetectResponse base64DetectResponse = (Base64DetectResponse) o;
    return Objects.equals(this.successful, base64DetectResponse.successful) &&
        Objects.equals(this.isBase64Encoded, base64DetectResponse.isBase64Encoded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, isBase64Encoded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64DetectResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    isBase64Encoded: ").append(toIndentedString(isBase64Encoded)).append("\n");
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

