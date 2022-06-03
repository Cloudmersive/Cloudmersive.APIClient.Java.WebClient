/*
 * ocrapi
 * The powerful Optical Character Recognition (OCR) APIs let you convert scanned images of pages into recognized text.
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
 * Result of recognizing a business card, to extract the key information from the business card
 */
@ApiModel(description = "Result of recognizing a business card, to extract the key information from the business card")
@JsonPropertyOrder({
  BusinessCardRecognitionResult.JSON_PROPERTY_SUCCESSFUL,
  BusinessCardRecognitionResult.JSON_PROPERTY_PERSON_NAME,
  BusinessCardRecognitionResult.JSON_PROPERTY_PERSON_TITLE,
  BusinessCardRecognitionResult.JSON_PROPERTY_BUSINESS_NAME,
  BusinessCardRecognitionResult.JSON_PROPERTY_ADDRESS_STRING,
  BusinessCardRecognitionResult.JSON_PROPERTY_PHONE_NUMBER,
  BusinessCardRecognitionResult.JSON_PROPERTY_EMAIL_ADDRESS,
  BusinessCardRecognitionResult.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:39.143700400-07:00[America/Los_Angeles]")
public class BusinessCardRecognitionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PERSON_NAME = "PersonName";
  private String personName;

  public static final String JSON_PROPERTY_PERSON_TITLE = "PersonTitle";
  private String personTitle;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "BusinessName";
  private String businessName;

  public static final String JSON_PROPERTY_ADDRESS_STRING = "AddressString";
  private String addressString;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "PhoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "EmailAddress";
  private String emailAddress;

  public static final String JSON_PROPERTY_TIMESTAMP = "Timestamp";
  private OffsetDateTime timestamp;

  public BusinessCardRecognitionResult() { 
  }

  public BusinessCardRecognitionResult successful(Boolean successful) {
    
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


  public BusinessCardRecognitionResult personName(String personName) {
    
    this.personName = personName;
    return this;
  }

   /**
   * The name of the person printed on the business card (if included on the business card)
   * @return personName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the person printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonName() {
    return personName;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonName(String personName) {
    this.personName = personName;
  }


  public BusinessCardRecognitionResult personTitle(String personTitle) {
    
    this.personTitle = personTitle;
    return this;
  }

   /**
   * The title of the person printed on the business card (if included on the business card)
   * @return personTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the person printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_PERSON_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonTitle() {
    return personTitle;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonTitle(String personTitle) {
    this.personTitle = personTitle;
  }


  public BusinessCardRecognitionResult businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * The name of the business printed on the business card (if included on the business card)
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the business printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public BusinessCardRecognitionResult addressString(String addressString) {
    
    this.addressString = addressString;
    return this;
  }

   /**
   * The address printed on the business card (if included on the business card)
   * @return addressString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The address printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_ADDRESS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressString() {
    return addressString;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressString(String addressString) {
    this.addressString = addressString;
  }


  public BusinessCardRecognitionResult phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number printed on the business card (if included on the business card)
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phone number printed on the business card (if included on the business card)")
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


  public BusinessCardRecognitionResult emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address printed on the business card (if included on the business card)
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public BusinessCardRecognitionResult timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The date and time printed on the business card (if included on the business card)
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time printed on the business card (if included on the business card)")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessCardRecognitionResult businessCardRecognitionResult = (BusinessCardRecognitionResult) o;
    return Objects.equals(this.successful, businessCardRecognitionResult.successful) &&
        Objects.equals(this.personName, businessCardRecognitionResult.personName) &&
        Objects.equals(this.personTitle, businessCardRecognitionResult.personTitle) &&
        Objects.equals(this.businessName, businessCardRecognitionResult.businessName) &&
        Objects.equals(this.addressString, businessCardRecognitionResult.addressString) &&
        Objects.equals(this.phoneNumber, businessCardRecognitionResult.phoneNumber) &&
        Objects.equals(this.emailAddress, businessCardRecognitionResult.emailAddress) &&
        Objects.equals(this.timestamp, businessCardRecognitionResult.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, personName, personTitle, businessName, addressString, phoneNumber, emailAddress, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessCardRecognitionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    personTitle: ").append(toIndentedString(personTitle)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    addressString: ").append(toIndentedString(addressString)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

