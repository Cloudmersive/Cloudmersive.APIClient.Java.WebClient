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
import com.cloudmersive.client.gac.model.VirusFound;
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
 * Result of running a virus scan
 */
@ApiModel(description = "Result of running a virus scan")
@JsonPropertyOrder({
  VirusScanResult.JSON_PROPERTY_CLEAN_RESULT,
  VirusScanResult.JSON_PROPERTY_FOUND_VIRUSES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:44.614679900-07:00[America/Los_Angeles]")
public class VirusScanResult {
  public static final String JSON_PROPERTY_CLEAN_RESULT = "CleanResult";
  private Boolean cleanResult;

  public static final String JSON_PROPERTY_FOUND_VIRUSES = "FoundViruses";
  private List<VirusFound> foundViruses = null;

  public VirusScanResult() { 
  }

  public VirusScanResult cleanResult(Boolean cleanResult) {
    
    this.cleanResult = cleanResult;
    return this;
  }

   /**
   * True if the scan contained no viruses, false otherwise
   * @return cleanResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the scan contained no viruses, false otherwise")
  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCleanResult() {
    return cleanResult;
  }


  @JsonProperty(JSON_PROPERTY_CLEAN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCleanResult(Boolean cleanResult) {
    this.cleanResult = cleanResult;
  }


  public VirusScanResult foundViruses(List<VirusFound> foundViruses) {
    
    this.foundViruses = foundViruses;
    return this;
  }

  public VirusScanResult addFoundVirusesItem(VirusFound foundVirusesItem) {
    if (this.foundViruses == null) {
      this.foundViruses = new ArrayList<>();
    }
    this.foundViruses.add(foundVirusesItem);
    return this;
  }

   /**
   * Array of viruses found, if any
   * @return foundViruses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of viruses found, if any")
  @JsonProperty(JSON_PROPERTY_FOUND_VIRUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VirusFound> getFoundViruses() {
    return foundViruses;
  }


  @JsonProperty(JSON_PROPERTY_FOUND_VIRUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFoundViruses(List<VirusFound> foundViruses) {
    this.foundViruses = foundViruses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirusScanResult virusScanResult = (VirusScanResult) o;
    return Objects.equals(this.cleanResult, virusScanResult.cleanResult) &&
        Objects.equals(this.foundViruses, virusScanResult.foundViruses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cleanResult, foundViruses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirusScanResult {\n");
    sb.append("    cleanResult: ").append(toIndentedString(cleanResult)).append("\n");
    sb.append("    foundViruses: ").append(toIndentedString(foundViruses)).append("\n");
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

