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
 * Details of one country
 */
@ApiModel(description = "Details of one country")
@JsonPropertyOrder({
  CountryDetails.JSON_PROPERTY_COUNTRY_NAME,
  CountryDetails.JSON_PROPERTY_THREE_LETTER_CODE,
  CountryDetails.JSON_PROPERTY_IS_O_TWO_LETTER_CODE,
  CountryDetails.JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER,
  CountryDetails.JSON_PROPERTY_IS_O_CURRENCY_CODE,
  CountryDetails.JSON_PROPERTY_CURRENCY_SYMBOL,
  CountryDetails.JSON_PROPERTY_CURRENCY_ENGLISH_NAME,
  CountryDetails.JSON_PROPERTY_REGION,
  CountryDetails.JSON_PROPERTY_SUBREGION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:45.731195400-07:00[America/Los_Angeles]")
public class CountryDetails {
  public static final String JSON_PROPERTY_COUNTRY_NAME = "CountryName";
  private String countryName;

  public static final String JSON_PROPERTY_THREE_LETTER_CODE = "ThreeLetterCode";
  private String threeLetterCode;

  public static final String JSON_PROPERTY_IS_O_TWO_LETTER_CODE = "ISOTwoLetterCode";
  private String isOTwoLetterCode;

  public static final String JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER = "IsEuropeanUnionMember";
  private Boolean isEuropeanUnionMember;

  public static final String JSON_PROPERTY_IS_O_CURRENCY_CODE = "ISOCurrencyCode";
  private String isOCurrencyCode;

  public static final String JSON_PROPERTY_CURRENCY_SYMBOL = "CurrencySymbol";
  private String currencySymbol;

  public static final String JSON_PROPERTY_CURRENCY_ENGLISH_NAME = "CurrencyEnglishName";
  private String currencyEnglishName;

  public static final String JSON_PROPERTY_REGION = "Region";
  private String region;

  public static final String JSON_PROPERTY_SUBREGION = "Subregion";
  private String subregion;

  public CountryDetails() { 
  }

  public CountryDetails countryName(String countryName) {
    
    this.countryName = countryName;
    return this;
  }

   /**
   * Name of the country
   * @return countryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the country")
  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryName() {
    return countryName;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }


  public CountryDetails threeLetterCode(String threeLetterCode) {
    
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


  public CountryDetails isOTwoLetterCode(String isOTwoLetterCode) {
    
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


  public CountryDetails isEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    
    this.isEuropeanUnionMember = isEuropeanUnionMember;
    return this;
  }

   /**
   * True if this country is currently a member of the European Union (EU), false otherwise
   * @return isEuropeanUnionMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if this country is currently a member of the European Union (EU), false otherwise")
  @JsonProperty(JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEuropeanUnionMember() {
    return isEuropeanUnionMember;
  }


  @JsonProperty(JSON_PROPERTY_IS_EUROPEAN_UNION_MEMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEuropeanUnionMember(Boolean isEuropeanUnionMember) {
    this.isEuropeanUnionMember = isEuropeanUnionMember;
  }


  public CountryDetails isOCurrencyCode(String isOCurrencyCode) {
    
    this.isOCurrencyCode = isOCurrencyCode;
    return this;
  }

   /**
   * ISO 4217 currency three-letter code associated with the country
   * @return isOCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 currency three-letter code associated with the country")
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


  public CountryDetails currencySymbol(String currencySymbol) {
    
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Symbol associated with the currency
   * @return currencySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Symbol associated with the currency")
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


  public CountryDetails currencyEnglishName(String currencyEnglishName) {
    
    this.currencyEnglishName = currencyEnglishName;
    return this;
  }

   /**
   * Full name of the currency
   * @return currencyEnglishName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full name of the currency")
  @JsonProperty(JSON_PROPERTY_CURRENCY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyEnglishName() {
    return currencyEnglishName;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_ENGLISH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyEnglishName(String currencyEnglishName) {
    this.currencyEnglishName = currencyEnglishName;
  }


  public CountryDetails region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region (continent) in which the country is located; possible values are None, Europe, Americas, Asia, Africa, Oceania")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public CountryDetails subregion(String subregion) {
    
    this.subregion = subregion;
    return this;
  }

   /**
   * Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,
   * @return subregion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subregion in which the country is located; possible values are None, NorthernEurope, WesternEurope, SouthernEurope, EasternEurope, CentralAmerica, NorthernAmerica, SouthAmerica, EasternAfrica, MiddleAfrica, NorthernAfrica , SouthernAfrica , WesternAfrica , CentralAsia , EasternAsia , SouthernAsia , SouthEasternAsia , WesternAsia , Southern , Middle , AustraliaandNewZealand , Melanesia , Polynesia , Micronesia , Caribbean,")
  @JsonProperty(JSON_PROPERTY_SUBREGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubregion() {
    return subregion;
  }


  @JsonProperty(JSON_PROPERTY_SUBREGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubregion(String subregion) {
    this.subregion = subregion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CountryDetails countryDetails = (CountryDetails) o;
    return Objects.equals(this.countryName, countryDetails.countryName) &&
        Objects.equals(this.threeLetterCode, countryDetails.threeLetterCode) &&
        Objects.equals(this.isOTwoLetterCode, countryDetails.isOTwoLetterCode) &&
        Objects.equals(this.isEuropeanUnionMember, countryDetails.isEuropeanUnionMember) &&
        Objects.equals(this.isOCurrencyCode, countryDetails.isOCurrencyCode) &&
        Objects.equals(this.currencySymbol, countryDetails.currencySymbol) &&
        Objects.equals(this.currencyEnglishName, countryDetails.currencyEnglishName) &&
        Objects.equals(this.region, countryDetails.region) &&
        Objects.equals(this.subregion, countryDetails.subregion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryName, threeLetterCode, isOTwoLetterCode, isEuropeanUnionMember, isOCurrencyCode, currencySymbol, currencyEnglishName, region, subregion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CountryDetails {\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    threeLetterCode: ").append(toIndentedString(threeLetterCode)).append("\n");
    sb.append("    isOTwoLetterCode: ").append(toIndentedString(isOTwoLetterCode)).append("\n");
    sb.append("    isEuropeanUnionMember: ").append(toIndentedString(isEuropeanUnionMember)).append("\n");
    sb.append("    isOCurrencyCode: ").append(toIndentedString(isOCurrencyCode)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    currencyEnglishName: ").append(toIndentedString(currencyEnglishName)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subregion: ").append(toIndentedString(subregion)).append("\n");
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

