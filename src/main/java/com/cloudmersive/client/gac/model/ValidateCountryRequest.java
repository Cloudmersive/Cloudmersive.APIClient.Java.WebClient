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
 * Input parameter to a country validation request
 */
@ApiModel(description = "Input parameter to a country validation request")
@JsonPropertyOrder({
  ValidateCountryRequest.JSON_PROPERTY_RAW_COUNTRY_INPUT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:45.731195400-07:00[America/Los_Angeles]")
public class ValidateCountryRequest {
  public static final String JSON_PROPERTY_RAW_COUNTRY_INPUT = "RawCountryInput";
  private String rawCountryInput;

  public ValidateCountryRequest() { 
  }

  public ValidateCountryRequest rawCountryInput(String rawCountryInput) {
    
    this.rawCountryInput = rawCountryInput;
    return this;
  }

   /**
   * Raw country input - can be a two-letter code (FIPS 10-4 or ISO 3166-1), three-letter code (ISO 3166-1) or country name
   * @return rawCountryInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw country input - can be a two-letter code (FIPS 10-4 or ISO 3166-1), three-letter code (ISO 3166-1) or country name")
  @JsonProperty(JSON_PROPERTY_RAW_COUNTRY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawCountryInput() {
    return rawCountryInput;
  }


  @JsonProperty(JSON_PROPERTY_RAW_COUNTRY_INPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawCountryInput(String rawCountryInput) {
    this.rawCountryInput = rawCountryInput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateCountryRequest validateCountryRequest = (ValidateCountryRequest) o;
    return Objects.equals(this.rawCountryInput, validateCountryRequest.rawCountryInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawCountryInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateCountryRequest {\n");
    sb.append("    rawCountryInput: ").append(toIndentedString(rawCountryInput)).append("\n");
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

