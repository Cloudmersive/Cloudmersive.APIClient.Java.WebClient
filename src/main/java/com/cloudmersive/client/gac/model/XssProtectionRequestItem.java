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
 * Individual item to protect for XSS
 */
@ApiModel(description = "Individual item to protect for XSS")
@JsonPropertyOrder({
  XssProtectionRequestItem.JSON_PROPERTY_INPUT_TEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class XssProtectionRequestItem {
  public static final String JSON_PROPERTY_INPUT_TEXT = "InputText";
  private String inputText;

  public XssProtectionRequestItem() { 
  }

  public XssProtectionRequestItem inputText(String inputText) {
    
    this.inputText = inputText;
    return this;
  }

   /**
   * Individual input text item to protect from XSS
   * @return inputText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Individual input text item to protect from XSS")
  @JsonProperty(JSON_PROPERTY_INPUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputText() {
    return inputText;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputText(String inputText) {
    this.inputText = inputText;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XssProtectionRequestItem xssProtectionRequestItem = (XssProtectionRequestItem) o;
    return Objects.equals(this.inputText, xssProtectionRequestItem.inputText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XssProtectionRequestItem {\n");
    sb.append("    inputText: ").append(toIndentedString(inputText)).append("\n");
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

