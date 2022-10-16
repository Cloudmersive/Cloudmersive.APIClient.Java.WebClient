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
import com.cloudmersive.client.gac.model.HtmlThreatLink;
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
 * HTML SSRF validation result
 */
@ApiModel(description = "HTML SSRF validation result")
@JsonPropertyOrder({
  HtmlSsrfThreatCheckResult.JSON_PROPERTY_IS_VALID,
  HtmlSsrfThreatCheckResult.JSON_PROPERTY_IS_THREAT,
  HtmlSsrfThreatCheckResult.JSON_PROPERTY_THREAT_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class HtmlSsrfThreatCheckResult {
  public static final String JSON_PROPERTY_IS_VALID = "IsValid";
  private Boolean isValid;

  public static final String JSON_PROPERTY_IS_THREAT = "IsThreat";
  private Boolean isThreat;

  public static final String JSON_PROPERTY_THREAT_LINKS = "ThreatLinks";
  private List<HtmlThreatLink> threatLinks = null;

  public HtmlSsrfThreatCheckResult() { 
  }

  public HtmlSsrfThreatCheckResult isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * True if the document is valid and has no errors, false otherwise
   * @return isValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the document is valid and has no errors, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsValid() {
    return isValid;
  }


  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public HtmlSsrfThreatCheckResult isThreat(Boolean isThreat) {
    
    this.isThreat = isThreat;
    return this;
  }

   /**
   * True if the document contains an SSRF threat, false otherwise
   * @return isThreat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the document contains an SSRF threat, false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsThreat() {
    return isThreat;
  }


  @JsonProperty(JSON_PROPERTY_IS_THREAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsThreat(Boolean isThreat) {
    this.isThreat = isThreat;
  }


  public HtmlSsrfThreatCheckResult threatLinks(List<HtmlThreatLink> threatLinks) {
    
    this.threatLinks = threatLinks;
    return this;
  }

  public HtmlSsrfThreatCheckResult addThreatLinksItem(HtmlThreatLink threatLinksItem) {
    if (this.threatLinks == null) {
      this.threatLinks = new ArrayList<>();
    }
    this.threatLinks.add(threatLinksItem);
    return this;
  }

   /**
   * Links found in the input HTML that contains threats
   * @return threatLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Links found in the input HTML that contains threats")
  @JsonProperty(JSON_PROPERTY_THREAT_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HtmlThreatLink> getThreatLinks() {
    return threatLinks;
  }


  @JsonProperty(JSON_PROPERTY_THREAT_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreatLinks(List<HtmlThreatLink> threatLinks) {
    this.threatLinks = threatLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlSsrfThreatCheckResult htmlSsrfThreatCheckResult = (HtmlSsrfThreatCheckResult) o;
    return Objects.equals(this.isValid, htmlSsrfThreatCheckResult.isValid) &&
        Objects.equals(this.isThreat, htmlSsrfThreatCheckResult.isThreat) &&
        Objects.equals(this.threatLinks, htmlSsrfThreatCheckResult.threatLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, isThreat, threatLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlSsrfThreatCheckResult {\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    isThreat: ").append(toIndentedString(isThreat)).append("\n");
    sb.append("    threatLinks: ").append(toIndentedString(threatLinks)).append("\n");
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

