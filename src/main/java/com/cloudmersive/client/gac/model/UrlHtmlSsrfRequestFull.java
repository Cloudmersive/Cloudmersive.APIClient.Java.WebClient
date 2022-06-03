/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
 * Request to determine if a URL contains HTML-embedded SSRF threats
 */
@ApiModel(description = "Request to determine if a URL contains HTML-embedded SSRF threats")
@JsonPropertyOrder({
  UrlHtmlSsrfRequestFull.JSON_PROPERTY_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:45.731195400-07:00[America/Los_Angeles]")
public class UrlHtmlSsrfRequestFull {
  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public UrlHtmlSsrfRequestFull() { 
  }

  public UrlHtmlSsrfRequestFull URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * URL to validate
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to validate")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UrlHtmlSsrfRequestFull urlHtmlSsrfRequestFull = (UrlHtmlSsrfRequestFull) o;
    return Objects.equals(this.URL, urlHtmlSsrfRequestFull.URL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(URL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UrlHtmlSsrfRequestFull {\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
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

