/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
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
import com.cloudmersive.client.gac.model.PersonWithAge;
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
 * Result from classifying the Age of people in an image
 */
@ApiModel(description = "Result from classifying the Age of people in an image")
@JsonPropertyOrder({
  AgeDetectionResult.JSON_PROPERTY_SUCCESSFUL,
  AgeDetectionResult.JSON_PROPERTY_PEOPLE_WITH_AGE,
  AgeDetectionResult.JSON_PROPERTY_PEOPLE_IDENTIFIED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:45.286050300-07:00[America/Los_Angeles]")
public class AgeDetectionResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_PEOPLE_WITH_AGE = "PeopleWithAge";
  private List<PersonWithAge> peopleWithAge = null;

  public static final String JSON_PROPERTY_PEOPLE_IDENTIFIED = "PeopleIdentified";
  private Integer peopleIdentified;

  public AgeDetectionResult() { 
  }

  public AgeDetectionResult successful(Boolean successful) {
    
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


  public AgeDetectionResult peopleWithAge(List<PersonWithAge> peopleWithAge) {
    
    this.peopleWithAge = peopleWithAge;
    return this;
  }

  public AgeDetectionResult addPeopleWithAgeItem(PersonWithAge peopleWithAgeItem) {
    if (this.peopleWithAge == null) {
      this.peopleWithAge = new ArrayList<>();
    }
    this.peopleWithAge.add(peopleWithAgeItem);
    return this;
  }

   /**
   * People in the image annotated with age information
   * @return peopleWithAge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "People in the image annotated with age information")
  @JsonProperty(JSON_PROPERTY_PEOPLE_WITH_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersonWithAge> getPeopleWithAge() {
    return peopleWithAge;
  }


  @JsonProperty(JSON_PROPERTY_PEOPLE_WITH_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeopleWithAge(List<PersonWithAge> peopleWithAge) {
    this.peopleWithAge = peopleWithAge;
  }


  public AgeDetectionResult peopleIdentified(Integer peopleIdentified) {
    
    this.peopleIdentified = peopleIdentified;
    return this;
  }

   /**
   * Number of people identified in the image with an age
   * @return peopleIdentified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of people identified in the image with an age")
  @JsonProperty(JSON_PROPERTY_PEOPLE_IDENTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPeopleIdentified() {
    return peopleIdentified;
  }


  @JsonProperty(JSON_PROPERTY_PEOPLE_IDENTIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeopleIdentified(Integer peopleIdentified) {
    this.peopleIdentified = peopleIdentified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeDetectionResult ageDetectionResult = (AgeDetectionResult) o;
    return Objects.equals(this.successful, ageDetectionResult.successful) &&
        Objects.equals(this.peopleWithAge, ageDetectionResult.peopleWithAge) &&
        Objects.equals(this.peopleIdentified, ageDetectionResult.peopleIdentified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, peopleWithAge, peopleIdentified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeDetectionResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    peopleWithAge: ").append(toIndentedString(peopleWithAge)).append("\n");
    sb.append("    peopleIdentified: ").append(toIndentedString(peopleIdentified)).append("\n");
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

