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
 * Result of performing a domain quality score operation
 */
@ApiModel(description = "Result of performing a domain quality score operation")
@JsonPropertyOrder({
  DomainQualityResponse.JSON_PROPERTY_DOMAIN_QUALITY_SCORE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:03.012760300-07:00[America/Los_Angeles]")
public class DomainQualityResponse {
  public static final String JSON_PROPERTY_DOMAIN_QUALITY_SCORE = "DomainQualityScore";
  private Double domainQualityScore;

  public DomainQualityResponse() { 
  }

  public DomainQualityResponse domainQualityScore(Double domainQualityScore) {
    
    this.domainQualityScore = domainQualityScore;
    return this;
  }

   /**
   * The quality score of the domain name; possible values are 0.0 to 10.0 with 10.0 being the highest and 0.0 being the lowest quality.
   * @return domainQualityScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The quality score of the domain name; possible values are 0.0 to 10.0 with 10.0 being the highest and 0.0 being the lowest quality.")
  @JsonProperty(JSON_PROPERTY_DOMAIN_QUALITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDomainQualityScore() {
    return domainQualityScore;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_QUALITY_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainQualityScore(Double domainQualityScore) {
    this.domainQualityScore = domainQualityScore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainQualityResponse domainQualityResponse = (DomainQualityResponse) o;
    return Objects.equals(this.domainQualityScore, domainQualityResponse.domainQualityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainQualityScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainQualityResponse {\n");
    sb.append("    domainQualityScore: ").append(toIndentedString(domainQualityScore)).append("\n");
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

