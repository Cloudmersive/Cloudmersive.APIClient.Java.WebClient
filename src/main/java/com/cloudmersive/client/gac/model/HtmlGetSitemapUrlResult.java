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
 * Result of getting the sitemap URL of the input HTML document
 */
@ApiModel(description = "Result of getting the sitemap URL of the input HTML document")
@JsonPropertyOrder({
  HtmlGetSitemapUrlResult.JSON_PROPERTY_SUCCESSFUL,
  HtmlGetSitemapUrlResult.JSON_PROPERTY_CANONICAL_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class HtmlGetSitemapUrlResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CANONICAL_URL = "CanonicalUrl";
  private String canonicalUrl;

  public HtmlGetSitemapUrlResult() { 
  }

  public HtmlGetSitemapUrlResult successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if the operation was successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the operation was successful, false otherwise")
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


  public HtmlGetSitemapUrlResult canonicalUrl(String canonicalUrl) {
    
    this.canonicalUrl = canonicalUrl;
    return this;
  }

   /**
   * HTML sitemap URL if present
   * @return canonicalUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTML sitemap URL if present")
  @JsonProperty(JSON_PROPERTY_CANONICAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCanonicalUrl() {
    return canonicalUrl;
  }


  @JsonProperty(JSON_PROPERTY_CANONICAL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanonicalUrl(String canonicalUrl) {
    this.canonicalUrl = canonicalUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlGetSitemapUrlResult htmlGetSitemapUrlResult = (HtmlGetSitemapUrlResult) o;
    return Objects.equals(this.successful, htmlGetSitemapUrlResult.successful) &&
        Objects.equals(this.canonicalUrl, htmlGetSitemapUrlResult.canonicalUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, canonicalUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlGetSitemapUrlResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    canonicalUrl: ").append(toIndentedString(canonicalUrl)).append("\n");
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

