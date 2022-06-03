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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Individual item to detect for XXE
 */
@ApiModel(description = "Individual item to detect for XXE")
@JsonPropertyOrder({
  XxeDetectionRequestItem.JSON_PROPERTY_INPUT_TEXT,
  XxeDetectionRequestItem.JSON_PROPERTY_ALLOW_INTERNET_URLS,
  XxeDetectionRequestItem.JSON_PROPERTY_KNOWN_SAFE_URLS,
  XxeDetectionRequestItem.JSON_PROPERTY_KNOWN_UNSAFE_URLS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:45.731195400-07:00[America/Los_Angeles]")
public class XxeDetectionRequestItem {
  public static final String JSON_PROPERTY_INPUT_TEXT = "InputText";
  private String inputText;

  public static final String JSON_PROPERTY_ALLOW_INTERNET_URLS = "AllowInternetUrls";
  private Boolean allowInternetUrls;

  public static final String JSON_PROPERTY_KNOWN_SAFE_URLS = "KnownSafeUrls";
  private List<String> knownSafeUrls = null;

  public static final String JSON_PROPERTY_KNOWN_UNSAFE_URLS = "KnownUnsafeUrls";
  private List<String> knownUnsafeUrls = null;

  public XxeDetectionRequestItem() { 
  }

  public XxeDetectionRequestItem inputText(String inputText) {
    
    this.inputText = inputText;
    return this;
  }

   /**
   * Individual input text item to protect from XXE
   * @return inputText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Individual input text item to protect from XXE")
  @JsonProperty(JSON_PROPERTY_INPUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputText() {
    return inputText;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputText(String inputText) {
    this.inputText = inputText;
  }


  public XxeDetectionRequestItem allowInternetUrls(Boolean allowInternetUrls) {
    
    this.allowInternetUrls = allowInternetUrls;
    return this;
  }

   /**
   * Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
   * @return allowInternetUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.")
  @JsonProperty(JSON_PROPERTY_ALLOW_INTERNET_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowInternetUrls() {
    return allowInternetUrls;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_INTERNET_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowInternetUrls(Boolean allowInternetUrls) {
    this.allowInternetUrls = allowInternetUrls;
  }


  public XxeDetectionRequestItem knownSafeUrls(List<String> knownSafeUrls) {
    
    this.knownSafeUrls = knownSafeUrls;
    return this;
  }

  public XxeDetectionRequestItem addKnownSafeUrlsItem(String knownSafeUrlsItem) {
    if (this.knownSafeUrls == null) {
      this.knownSafeUrls = new ArrayList<>();
    }
    this.knownSafeUrls.add(knownSafeUrlsItem);
    return this;
  }

   /**
   * Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
   * @return knownSafeUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.")
  @JsonProperty(JSON_PROPERTY_KNOWN_SAFE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKnownSafeUrls() {
    return knownSafeUrls;
  }


  @JsonProperty(JSON_PROPERTY_KNOWN_SAFE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnownSafeUrls(List<String> knownSafeUrls) {
    this.knownSafeUrls = knownSafeUrls;
  }


  public XxeDetectionRequestItem knownUnsafeUrls(List<String> knownUnsafeUrls) {
    
    this.knownUnsafeUrls = knownUnsafeUrls;
    return this;
  }

  public XxeDetectionRequestItem addKnownUnsafeUrlsItem(String knownUnsafeUrlsItem) {
    if (this.knownUnsafeUrls == null) {
      this.knownUnsafeUrls = new ArrayList<>();
    }
    this.knownUnsafeUrls.add(knownUnsafeUrlsItem);
    return this;
  }

   /**
   * Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
   * @return knownUnsafeUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.")
  @JsonProperty(JSON_PROPERTY_KNOWN_UNSAFE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getKnownUnsafeUrls() {
    return knownUnsafeUrls;
  }


  @JsonProperty(JSON_PROPERTY_KNOWN_UNSAFE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnownUnsafeUrls(List<String> knownUnsafeUrls) {
    this.knownUnsafeUrls = knownUnsafeUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XxeDetectionRequestItem xxeDetectionRequestItem = (XxeDetectionRequestItem) o;
    return Objects.equals(this.inputText, xxeDetectionRequestItem.inputText) &&
        Objects.equals(this.allowInternetUrls, xxeDetectionRequestItem.allowInternetUrls) &&
        Objects.equals(this.knownSafeUrls, xxeDetectionRequestItem.knownSafeUrls) &&
        Objects.equals(this.knownUnsafeUrls, xxeDetectionRequestItem.knownUnsafeUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText, allowInternetUrls, knownSafeUrls, knownUnsafeUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XxeDetectionRequestItem {\n");
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
    sb.append("    allowInternetUrls: ").append(toIndentedString(allowInternetUrls)).append("\n");
    sb.append("    knownSafeUrls: ").append(toIndentedString(knownSafeUrls)).append("\n");
    sb.append("    knownUnsafeUrls: ").append(toIndentedString(knownUnsafeUrls)).append("\n");
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

