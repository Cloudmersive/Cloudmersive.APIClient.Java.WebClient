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
 * Input to a VAT lookup request
 */
@ApiModel(description = "Input to a VAT lookup request")
@JsonPropertyOrder({
  VatLookupRequest.JSON_PROPERTY_VAT_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class VatLookupRequest {
  public static final String JSON_PROPERTY_VAT_CODE = "VatCode";
  private String vatCode;

  public VatLookupRequest() { 
  }

  public VatLookupRequest vatCode(String vatCode) {
    
    this.vatCode = vatCode;
    return this;
  }

   /**
   * VAT code to lookup; example \&quot;CZ25123891\&quot;
   * @return vatCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "VAT code to lookup; example \"CZ25123891\"")
  @JsonProperty(JSON_PROPERTY_VAT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVatCode() {
    return vatCode;
  }


  @JsonProperty(JSON_PROPERTY_VAT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVatCode(String vatCode) {
    this.vatCode = vatCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VatLookupRequest vatLookupRequest = (VatLookupRequest) o;
    return Objects.equals(this.vatCode, vatLookupRequest.vatCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vatCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VatLookupRequest {\n");
    sb.append("    vatCode: ").append(toIndentedString(vatCode)).append("\n");
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

