/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
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
 * Additional non-threat content verification information
 */
@ApiModel(description = "Additional non-threat content verification information")
@JsonPropertyOrder({
  AdditionalAdvancedScanInformation.JSON_PROPERTY_CONTAINS_J_S_O_N,
  AdditionalAdvancedScanInformation.JSON_PROPERTY_CONTAINS_X_M_L,
  AdditionalAdvancedScanInformation.JSON_PROPERTY_CONTAINS_IMAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:09.766816-07:00[America/Los_Angeles]")
public class AdditionalAdvancedScanInformation {
  public static final String JSON_PROPERTY_CONTAINS_J_S_O_N = "ContainsJSON";
  private Boolean containsJSON;

  public static final String JSON_PROPERTY_CONTAINS_X_M_L = "ContainsXML";
  private Boolean containsXML;

  public static final String JSON_PROPERTY_CONTAINS_IMAGE = "ContainsImage";
  private Boolean containsImage;

  public AdditionalAdvancedScanInformation() { 
  }

  public AdditionalAdvancedScanInformation containsJSON(Boolean containsJSON) {
    
    this.containsJSON = containsJSON;
    return this;
  }

   /**
   * True if the input file contains JSON data, false otherwise; this is not a threat signal
   * @return containsJSON
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input file contains JSON data, false otherwise; this is not a threat signal")
  @JsonProperty(JSON_PROPERTY_CONTAINS_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsJSON() {
    return containsJSON;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_J_S_O_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsJSON(Boolean containsJSON) {
    this.containsJSON = containsJSON;
  }


  public AdditionalAdvancedScanInformation containsXML(Boolean containsXML) {
    
    this.containsXML = containsXML;
    return this;
  }

   /**
   * True if the input file contains XML data, false otherwise; this is not a threat signal
   * @return containsXML
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input file contains XML data, false otherwise; this is not a threat signal")
  @JsonProperty(JSON_PROPERTY_CONTAINS_X_M_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsXML() {
    return containsXML;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_X_M_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsXML(Boolean containsXML) {
    this.containsXML = containsXML;
  }


  public AdditionalAdvancedScanInformation containsImage(Boolean containsImage) {
    
    this.containsImage = containsImage;
    return this;
  }

   /**
   * True if the input file contains an image
   * @return containsImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the input file contains an image")
  @JsonProperty(JSON_PROPERTY_CONTAINS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getContainsImage() {
    return containsImage;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsImage(Boolean containsImage) {
    this.containsImage = containsImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalAdvancedScanInformation additionalAdvancedScanInformation = (AdditionalAdvancedScanInformation) o;
    return Objects.equals(this.containsJSON, additionalAdvancedScanInformation.containsJSON) &&
        Objects.equals(this.containsXML, additionalAdvancedScanInformation.containsXML) &&
        Objects.equals(this.containsImage, additionalAdvancedScanInformation.containsImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containsJSON, containsXML, containsImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalAdvancedScanInformation {\n");
    sb.append("    containsJSON: ").append(toIndentedString(containsJSON)).append("\n");
    sb.append("    containsXML: ").append(toIndentedString(containsXML)).append("\n");
    sb.append("    containsImage: ").append(toIndentedString(containsImage)).append("\n");
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

