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
 * Request to validate a phone number
 */
@ApiModel(description = "Request to validate a phone number")
@JsonPropertyOrder({
  PhoneNumberValidateRequest.JSON_PROPERTY_PHONE_NUMBER,
  PhoneNumberValidateRequest.JSON_PROPERTY_DEFAULT_COUNTRY_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:03.012760300-07:00[America/Los_Angeles]")
public class PhoneNumberValidateRequest {
  public static final String JSON_PROPERTY_PHONE_NUMBER = "PhoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_DEFAULT_COUNTRY_CODE = "DefaultCountryCode";
  private String defaultCountryCode;

  public PhoneNumberValidateRequest() { 
  }

  public PhoneNumberValidateRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Raw phone number string to parse as input for validation
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw phone number string to parse as input for validation")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public PhoneNumberValidateRequest defaultCountryCode(String defaultCountryCode) {
    
    this.defaultCountryCode = defaultCountryCode;
    return this;
  }

   /**
   * Optional, default country code.  If left blank, will default to \&quot;US\&quot;.
   * @return defaultCountryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional, default country code.  If left blank, will default to \"US\".")
  @JsonProperty(JSON_PROPERTY_DEFAULT_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultCountryCode() {
    return defaultCountryCode;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCountryCode(String defaultCountryCode) {
    this.defaultCountryCode = defaultCountryCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhoneNumberValidateRequest phoneNumberValidateRequest = (PhoneNumberValidateRequest) o;
    return Objects.equals(this.phoneNumber, phoneNumberValidateRequest.phoneNumber) &&
        Objects.equals(this.defaultCountryCode, phoneNumberValidateRequest.defaultCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, defaultCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhoneNumberValidateRequest {\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    defaultCountryCode: ").append(toIndentedString(defaultCountryCode)).append("\n");
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

