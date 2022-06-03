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
 * Result of running a Get Macro Information command
 */
@ApiModel(description = "Result of running a Get Macro Information command")
@JsonPropertyOrder({
  GetMacrosResponse.JSON_PROPERTY_SUCCESSFUL,
  GetMacrosResponse.JSON_PROPERTY_CONTAINS_VBA_MACROS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class GetMacrosResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CONTAINS_VBA_MACROS = "ContainsVbaMacros";
  private Boolean containsVbaMacros;

  public GetMacrosResponse() { 
  }

  public GetMacrosResponse successful(Boolean successful) {
    
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


  public GetMacrosResponse containsVbaMacros(Boolean containsVbaMacros) {
    
    this.containsVbaMacros = containsVbaMacros;
    return this;
  }

   /**
   * True if the document contains VBA macros, false otherwise
   * @return containsVbaMacros
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the document contains VBA macros, false otherwise")
  @JsonProperty(JSON_PROPERTY_CONTAINS_VBA_MACROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsVbaMacros() {
    return containsVbaMacros;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_VBA_MACROS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsVbaMacros(Boolean containsVbaMacros) {
    this.containsVbaMacros = containsVbaMacros;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMacrosResponse getMacrosResponse = (GetMacrosResponse) o;
    return Objects.equals(this.successful, getMacrosResponse.successful) &&
        Objects.equals(this.containsVbaMacros, getMacrosResponse.containsVbaMacros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, containsVbaMacros);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMacrosResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    containsVbaMacros: ").append(toIndentedString(containsVbaMacros)).append("\n");
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

