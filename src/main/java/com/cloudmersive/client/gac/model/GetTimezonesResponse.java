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
import com.cloudmersive.client.gac.model.Timezone;
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
 * Result of performing a get time zones operation
 */
@ApiModel(description = "Result of performing a get time zones operation")
@JsonPropertyOrder({
  GetTimezonesResponse.JSON_PROPERTY_SUCCESSFUL,
  GetTimezonesResponse.JSON_PROPERTY_COUNTRY_FULL_NAME,
  GetTimezonesResponse.JSON_PROPERTY_IS_O_TWO_LETTER_CODE,
  GetTimezonesResponse.JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE,
  GetTimezonesResponse.JSON_PROPERTY_THREE_LETTER_CODE,
  GetTimezonesResponse.JSON_PROPERTY_TIMEZONES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class GetTimezonesResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_COUNTRY_FULL_NAME = "CountryFullName";
  private String countryFullName;

  public static final String JSON_PROPERTY_IS_O_TWO_LETTER_CODE = "ISOTwoLetterCode";
  private String isOTwoLetterCode;

  public static final String JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE = "FIPSTwoLetterCode";
  private String fiPSTwoLetterCode;

  public static final String JSON_PROPERTY_THREE_LETTER_CODE = "ThreeLetterCode";
  private String threeLetterCode;

  public static final String JSON_PROPERTY_TIMEZONES = "Timezones";
  private List<Timezone> timezones = null;

  public GetTimezonesResponse() { 
  }

  public GetTimezonesResponse successful(Boolean successful) {
    
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


  public GetTimezonesResponse countryFullName(String countryFullName) {
    
    this.countryFullName = countryFullName;
    return this;
  }

   /**
   * Full name of the country
   * @return countryFullName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full name of the country")
  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryFullName() {
    return countryFullName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryFullName(String countryFullName) {
    this.countryFullName = countryFullName;
  }


  public GetTimezonesResponse isOTwoLetterCode(String isOTwoLetterCode) {
    
    this.isOTwoLetterCode = isOTwoLetterCode;
    return this;
  }

   /**
   * Two-letter ISO 3166-1 country code
   * @return isOTwoLetterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter ISO 3166-1 country code")
  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOTwoLetterCode() {
    return isOTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_IS_O_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOTwoLetterCode(String isOTwoLetterCode) {
    this.isOTwoLetterCode = isOTwoLetterCode;
  }


  public GetTimezonesResponse fiPSTwoLetterCode(String fiPSTwoLetterCode) {
    
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
    return this;
  }

   /**
   * Two-letter FIPS 10-4 country code
   * @return fiPSTwoLetterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Two-letter FIPS 10-4 country code")
  @JsonProperty(JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFiPSTwoLetterCode() {
    return fiPSTwoLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_FI_P_S_TWO_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiPSTwoLetterCode(String fiPSTwoLetterCode) {
    this.fiPSTwoLetterCode = fiPSTwoLetterCode;
  }


  public GetTimezonesResponse threeLetterCode(String threeLetterCode) {
    
    this.threeLetterCode = threeLetterCode;
    return this;
  }

   /**
   * Three-letter ISO 3166-1 country code
   * @return threeLetterCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Three-letter ISO 3166-1 country code")
  @JsonProperty(JSON_PROPERTY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreeLetterCode() {
    return threeLetterCode;
  }


  @JsonProperty(JSON_PROPERTY_THREE_LETTER_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreeLetterCode(String threeLetterCode) {
    this.threeLetterCode = threeLetterCode;
  }


  public GetTimezonesResponse timezones(List<Timezone> timezones) {
    
    this.timezones = timezones;
    return this;
  }

  public GetTimezonesResponse addTimezonesItem(Timezone timezonesItem) {
    if (this.timezones == null) {
      this.timezones = new ArrayList<>();
    }
    this.timezones.add(timezonesItem);
    return this;
  }

   /**
   * Time zones (IANA/Olsen) in the country
   * @return timezones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time zones (IANA/Olsen) in the country")
  @JsonProperty(JSON_PROPERTY_TIMEZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Timezone> getTimezones() {
    return timezones;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezones(List<Timezone> timezones) {
    this.timezones = timezones;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTimezonesResponse getTimezonesResponse = (GetTimezonesResponse) o;
    return Objects.equals(this.successful, getTimezonesResponse.successful) &&
        Objects.equals(this.countryFullName, getTimezonesResponse.countryFullName) &&
        Objects.equals(this.isOTwoLetterCode, getTimezonesResponse.isOTwoLetterCode) &&
        Objects.equals(this.fiPSTwoLetterCode, getTimezonesResponse.fiPSTwoLetterCode) &&
        Objects.equals(this.threeLetterCode, getTimezonesResponse.threeLetterCode) &&
        Objects.equals(this.timezones, getTimezonesResponse.timezones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, countryFullName, isOTwoLetterCode, fiPSTwoLetterCode, threeLetterCode, timezones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTimezonesResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    countryFullName: ").append(toIndentedString(countryFullName)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    fiPSTwoLetterCode: ").append(toIndentedString(fiPSTwoLetterCode)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
    sb.append("    timezones: ").append(toIndentedString(timezones)).append("\n");
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

