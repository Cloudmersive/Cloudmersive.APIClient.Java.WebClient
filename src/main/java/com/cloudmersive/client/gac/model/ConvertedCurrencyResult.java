/*
 * currencyapi
 * The currency APIs help you retrieve exchange rates and convert prices between currencies easily.
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
 * Result of performing a Convert Currency operation
 */
@ApiModel(description = "Result of performing a Convert Currency operation")
@JsonPropertyOrder({
  ConvertedCurrencyResult.JSON_PROPERTY_CONVERTED_PRICE,
  ConvertedCurrencyResult.JSON_PROPERTY_IS_O_CURRENCY_CODE,
  ConvertedCurrencyResult.JSON_PROPERTY_CURRENCY_SYMBOL,
  ConvertedCurrencyResult.JSON_PROPERTY_FORMATTED_PRICE_AS_STRING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:21.455246100-07:00[America/Los_Angeles]")
public class ConvertedCurrencyResult {
  public static final String JSON_PROPERTY_CONVERTED_PRICE = "ConvertedPrice";
  private Double convertedPrice;

  public static final String JSON_PROPERTY_IS_O_CURRENCY_CODE = "ISOCurrencyCode";
  private String isOCurrencyCode;

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "CurrencySymbol";
  private String currencySymbol;

  public static final String JSON_PROPERTY_FORMATTED_PRICE_AS_STRING = "FormattedPriceAsString";
  private String formattedPriceAsString;

  public ConvertedCurrencyResult() { 
  }

  public ConvertedCurrencyResult convertedPrice(Double convertedPrice) {
    
    this.convertedPrice = convertedPrice;
    return this;
  }

   /**
   * The converted price in the destination currency
   * @return convertedPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The converted price in the destination currency")
  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConvertedPrice() {
    return convertedPrice;
  }


  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertedPrice(Double convertedPrice) {
    this.convertedPrice = convertedPrice;
  }


  public ConvertedCurrencyResult isOCurrencyCode(String isOCurrencyCode) {
    
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

   /**
   * ISO 4217 currency three-letter code of destination price
   * @return isOCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 currency three-letter code of destination price")
  @JsonProperty(JSON_PROPERTY_IS_O_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsOCurrencyCode() {
    return isOCurrencyCode;
  }


  @JsonProperty(JSON_PROPERTY_IS_O_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOCurrencyCode(String isOCurrencyCode) {
    this.isOCurrencyCode = isOCurrencyCode;
  }


  public ConvertedCurrencyResult currencySymbol(String currencySymbol) {
    
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Destination currency symbol
   * @return currencySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Destination currency symbol")
  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencySymbol() {
    return currencySymbol;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }


  public ConvertedCurrencyResult formattedPriceAsString(String formattedPriceAsString) {
    
    this.formattedPriceAsString = formattedPriceAsString;
    return this;
  }

   /**
   * Formatted price in the destination currency as a string
   * @return formattedPriceAsString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Formatted price in the destination currency as a string")
  @JsonProperty(JSON_PROPERTY_FORMATTED_PRICE_AS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormattedPriceAsString() {
    return formattedPriceAsString;
  }


  @JsonProperty(JSON_PROPERTY_FORMATTED_PRICE_AS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormattedPriceAsString(String formattedPriceAsString) {
    this.formattedPriceAsString = formattedPriceAsString;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedCurrencyResult convertedCurrencyResult = (ConvertedCurrencyResult) o;
    return Objects.equals(this.convertedPrice, convertedCurrencyResult.convertedPrice) &&
        Objects.equals(this.isOCurrencyCode, convertedCurrencyResult.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, convertedCurrencyResult.currencySymbol) &&
        Objects.equals(this.formattedPriceAsString, convertedCurrencyResult.formattedPriceAsString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedPrice, isOCurrencyCode, currencySymbol, formattedPriceAsString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedCurrencyResult {\n");
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    formattedPriceAsString: ").append(toIndentedString(formattedPriceAsString)).append("\n");
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

