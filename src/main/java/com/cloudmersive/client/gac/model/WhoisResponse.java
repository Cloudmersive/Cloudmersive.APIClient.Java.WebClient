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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Result of a WHOIS operation
 */
@ApiModel(description = "Result of a WHOIS operation")
@JsonPropertyOrder({
  WhoisResponse.JSON_PROPERTY_VALID_DOMAIN,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_NAME,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_ORGANIZATION,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_EMAIL,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_STREET_NUMBER,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_STREET,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_CITY,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_STATE_OR_PROVINCE,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_POSTAL_CODE,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_COUNTRY,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_RAW_ADDRESS,
  WhoisResponse.JSON_PROPERTY_REGISTRANT_TELEPHONE,
  WhoisResponse.JSON_PROPERTY_WHOIS_SERVER,
  WhoisResponse.JSON_PROPERTY_RAW_TEXT_RECORD,
  WhoisResponse.JSON_PROPERTY_CREATED_DT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class WhoisResponse {
  public static final String JSON_PROPERTY_VALID_DOMAIN = "ValidDomain";
  private Boolean validDomain;

  public static final String JSON_PROPERTY_REGISTRANT_NAME = "RegistrantName";
  private String registrantName;

  public static final String JSON_PROPERTY_REGISTRANT_ORGANIZATION = "RegistrantOrganization";
  private String registrantOrganization;

  public static final String JSON_PROPERTY_REGISTRANT_EMAIL = "RegistrantEmail";
  private String registrantEmail;

  public static final String JSON_PROPERTY_REGISTRANT_STREET_NUMBER = "RegistrantStreetNumber";
  private String registrantStreetNumber;

  public static final String JSON_PROPERTY_REGISTRANT_STREET = "RegistrantStreet";
  private String registrantStreet;

  public static final String JSON_PROPERTY_REGISTRANT_CITY = "RegistrantCity";
  private String registrantCity;

  public static final String JSON_PROPERTY_REGISTRANT_STATE_OR_PROVINCE = "RegistrantStateOrProvince";
  private String registrantStateOrProvince;

  public static final String JSON_PROPERTY_REGISTRANT_POSTAL_CODE = "RegistrantPostalCode";
  private String registrantPostalCode;

  public static final String JSON_PROPERTY_REGISTRANT_COUNTRY = "RegistrantCountry";
  private String registrantCountry;

  public static final String JSON_PROPERTY_REGISTRANT_RAW_ADDRESS = "RegistrantRawAddress";
  private String registrantRawAddress;

  public static final String JSON_PROPERTY_REGISTRANT_TELEPHONE = "RegistrantTelephone";
  private String registrantTelephone;

  public static final String JSON_PROPERTY_WHOIS_SERVER = "WhoisServer";
  private String whoisServer;

  public static final String JSON_PROPERTY_RAW_TEXT_RECORD = "RawTextRecord";
  private String rawTextRecord;

  public static final String JSON_PROPERTY_CREATED_DT = "CreatedDt";
  private OffsetDateTime createdDt;

  public WhoisResponse() { 
  }

  public WhoisResponse validDomain(Boolean validDomain) {
    
    this.validDomain = validDomain;
    return this;
  }

   /**
   * True if the domain is valid, false if it is not
   * @return validDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the domain is valid, false if it is not")
  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValidDomain() {
    return validDomain;
  }


  @JsonProperty(JSON_PROPERTY_VALID_DOMAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidDomain(Boolean validDomain) {
    this.validDomain = validDomain;
  }


  public WhoisResponse registrantName(String registrantName) {
    
    this.registrantName = registrantName;
    return this;
  }

   /**
   * Name of the domain registrant
   * @return registrantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the domain registrant")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantName() {
    return registrantName;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantName(String registrantName) {
    this.registrantName = registrantName;
  }


  public WhoisResponse registrantOrganization(String registrantOrganization) {
    
    this.registrantOrganization = registrantOrganization;
    return this;
  }

   /**
   * Organization name of the domain registrant
   * @return registrantOrganization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organization name of the domain registrant")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantOrganization() {
    return registrantOrganization;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_ORGANIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantOrganization(String registrantOrganization) {
    this.registrantOrganization = registrantOrganization;
  }


  public WhoisResponse registrantEmail(String registrantEmail) {
    
    this.registrantEmail = registrantEmail;
    return this;
  }

   /**
   * Email address of the domain registrant
   * @return registrantEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address of the domain registrant")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantEmail() {
    return registrantEmail;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantEmail(String registrantEmail) {
    this.registrantEmail = registrantEmail;
  }


  public WhoisResponse registrantStreetNumber(String registrantStreetNumber) {
    
    this.registrantStreetNumber = registrantStreetNumber;
    return this;
  }

   /**
   * Street number of the address of the domain registrant, if available
   * @return registrantStreetNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street number of the address of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantStreetNumber() {
    return registrantStreetNumber;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_STREET_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantStreetNumber(String registrantStreetNumber) {
    this.registrantStreetNumber = registrantStreetNumber;
  }


  public WhoisResponse registrantStreet(String registrantStreet) {
    
    this.registrantStreet = registrantStreet;
    return this;
  }

   /**
   * Street name of the address of the domain registrant, if available
   * @return registrantStreet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Street name of the address of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantStreet() {
    return registrantStreet;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_STREET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantStreet(String registrantStreet) {
    this.registrantStreet = registrantStreet;
  }


  public WhoisResponse registrantCity(String registrantCity) {
    
    this.registrantCity = registrantCity;
    return this;
  }

   /**
   * City of the domain registrant, if available
   * @return registrantCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantCity() {
    return registrantCity;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantCity(String registrantCity) {
    this.registrantCity = registrantCity;
  }


  public WhoisResponse registrantStateOrProvince(String registrantStateOrProvince) {
    
    this.registrantStateOrProvince = registrantStateOrProvince;
    return this;
  }

   /**
   * State or Province of the address of the domain registrant, if available
   * @return registrantStateOrProvince
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "State or Province of the address of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantStateOrProvince() {
    return registrantStateOrProvince;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_STATE_OR_PROVINCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantStateOrProvince(String registrantStateOrProvince) {
    this.registrantStateOrProvince = registrantStateOrProvince;
  }


  public WhoisResponse registrantPostalCode(String registrantPostalCode) {
    
    this.registrantPostalCode = registrantPostalCode;
    return this;
  }

   /**
   * Postal code of the address of the domain registrant, if available
   * @return registrantPostalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal code of the address of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantPostalCode() {
    return registrantPostalCode;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantPostalCode(String registrantPostalCode) {
    this.registrantPostalCode = registrantPostalCode;
  }


  public WhoisResponse registrantCountry(String registrantCountry) {
    
    this.registrantCountry = registrantCountry;
    return this;
  }

   /**
   * Country of the address of the domain registrant, if available
   * @return registrantCountry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Country of the address of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantCountry() {
    return registrantCountry;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantCountry(String registrantCountry) {
    this.registrantCountry = registrantCountry;
  }


  public WhoisResponse registrantRawAddress(String registrantRawAddress) {
    
    this.registrantRawAddress = registrantRawAddress;
    return this;
  }

   /**
   * Raw address string of the domain registrant, if available
   * @return registrantRawAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Raw address string of the domain registrant, if available")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_RAW_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantRawAddress() {
    return registrantRawAddress;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_RAW_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantRawAddress(String registrantRawAddress) {
    this.registrantRawAddress = registrantRawAddress;
  }


  public WhoisResponse registrantTelephone(String registrantTelephone) {
    
    this.registrantTelephone = registrantTelephone;
    return this;
  }

   /**
   * Telephone number of the address of the domain registrant
   * @return registrantTelephone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Telephone number of the address of the domain registrant")
  @JsonProperty(JSON_PROPERTY_REGISTRANT_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrantTelephone() {
    return registrantTelephone;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRANT_TELEPHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrantTelephone(String registrantTelephone) {
    this.registrantTelephone = registrantTelephone;
  }


  public WhoisResponse whoisServer(String whoisServer) {
    
    this.whoisServer = whoisServer;
    return this;
  }

   /**
   * Server used to lookup WHOIS information (may change based on lookup).
   * @return whoisServer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Server used to lookup WHOIS information (may change based on lookup).")
  @JsonProperty(JSON_PROPERTY_WHOIS_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWhoisServer() {
    return whoisServer;
  }


  @JsonProperty(JSON_PROPERTY_WHOIS_SERVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWhoisServer(String whoisServer) {
    this.whoisServer = whoisServer;
  }


  public WhoisResponse rawTextRecord(String rawTextRecord) {
    
    this.rawTextRecord = rawTextRecord;
    return this;
  }

   /**
   * WHOIS raw text record
   * @return rawTextRecord
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WHOIS raw text record")
  @JsonProperty(JSON_PROPERTY_RAW_TEXT_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawTextRecord() {
    return rawTextRecord;
  }


  @JsonProperty(JSON_PROPERTY_RAW_TEXT_RECORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawTextRecord(String rawTextRecord) {
    this.rawTextRecord = rawTextRecord;
  }


  public WhoisResponse createdDt(OffsetDateTime createdDt) {
    
    this.createdDt = createdDt;
    return this;
  }

   /**
   * Creation date for the record
   * @return createdDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Creation date for the record")
  @JsonProperty(JSON_PROPERTY_CREATED_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedDt() {
    return createdDt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDt(OffsetDateTime createdDt) {
    this.createdDt = createdDt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhoisResponse whoisResponse = (WhoisResponse) o;
    return Objects.equals(this.validDomain, whoisResponse.validDomain) &&
        Objects.equals(this.registrantName, whoisResponse.registrantName) &&
        Objects.equals(this.registrantOrganization, whoisResponse.registrantOrganization) &&
        Objects.equals(this.registrantEmail, whoisResponse.registrantEmail) &&
        Objects.equals(this.registrantStreetNumber, whoisResponse.registrantStreetNumber) &&
        Objects.equals(this.registrantStreet, whoisResponse.registrantStreet) &&
        Objects.equals(this.registrantCity, whoisResponse.registrantCity) &&
        Objects.equals(this.registrantStateOrProvince, whoisResponse.registrantStateOrProvince) &&
        Objects.equals(this.registrantPostalCode, whoisResponse.registrantPostalCode) &&
        Objects.equals(this.registrantCountry, whoisResponse.registrantCountry) &&
        Objects.equals(this.registrantRawAddress, whoisResponse.registrantRawAddress) &&
        Objects.equals(this.registrantTelephone, whoisResponse.registrantTelephone) &&
        Objects.equals(this.whoisServer, whoisResponse.whoisServer) &&
        Objects.equals(this.rawTextRecord, whoisResponse.rawTextRecord) &&
        Objects.equals(this.createdDt, whoisResponse.createdDt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validDomain, registrantName, registrantOrganization, registrantEmail, registrantStreetNumber, registrantStreet, registrantCity, registrantStateOrProvince, registrantPostalCode, registrantCountry, registrantRawAddress, registrantTelephone, whoisServer, rawTextRecord, createdDt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhoisResponse {\n");
    sb.append("    validDomain: ").append(toIndentedString(validDomain)).append("\n");
    sb.append("    registrantName: ").append(toIndentedString(registrantName)).append("\n");
    sb.append("    registrantOrganization: ").append(toIndentedString(registrantOrganization)).append("\n");
    sb.append("    registrantEmail: ").append(toIndentedString(registrantEmail)).append("\n");
    sb.append("    registrantStreetNumber: ").append(toIndentedString(registrantStreetNumber)).append("\n");
    sb.append("    registrantStreet: ").append(toIndentedString(registrantStreet)).append("\n");
    sb.append("    registrantCity: ").append(toIndentedString(registrantCity)).append("\n");
    sb.append("    registrantStateOrProvince: ").append(toIndentedString(registrantStateOrProvince)).append("\n");
    sb.append("    registrantPostalCode: ").append(toIndentedString(registrantPostalCode)).append("\n");
    sb.append("    registrantCountry: ").append(toIndentedString(registrantCountry)).append("\n");
    sb.append("    registrantRawAddress: ").append(toIndentedString(registrantRawAddress)).append("\n");
    sb.append("    registrantTelephone: ").append(toIndentedString(registrantTelephone)).append("\n");
    sb.append("    whoisServer: ").append(toIndentedString(whoisServer)).append("\n");
    sb.append("    rawTextRecord: ").append(toIndentedString(rawTextRecord)).append("\n");
    sb.append("    createdDt: ").append(toIndentedString(createdDt)).append("\n");
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

