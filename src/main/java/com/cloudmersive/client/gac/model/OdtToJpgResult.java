/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import com.cloudmersive.client.gac.model.ConvertedJpgPage;
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
 * Result of converting an ODT input to a JPG array
 */
@ApiModel(description = "Result of converting an ODT input to a JPG array")
@JsonPropertyOrder({
  OdtToJpgResult.JSON_PROPERTY_SUCCESSFUL,
  OdtToJpgResult.JSON_PROPERTY_JPG_RESULT_PAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class OdtToJpgResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_JPG_RESULT_PAGES = "JpgResultPages";
  private List<ConvertedJpgPage> jpgResultPages = null;

  public OdtToJpgResult() { 
  }

  public OdtToJpgResult successful(Boolean successful) {
    
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


  public OdtToJpgResult jpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    
    this.jpgResultPages = jpgResultPages;
    return this;
  }

  public OdtToJpgResult addJpgResultPagesItem(ConvertedJpgPage jpgResultPagesItem) {
    if (this.jpgResultPages == null) {
      this.jpgResultPages = new ArrayList<>();
    }
    this.jpgResultPages.add(jpgResultPagesItem);
    return this;
  }

   /**
   * Array of converted pages
   * @return jpgResultPages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of converted pages")
  @JsonProperty(JSON_PROPERTY_JPG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConvertedJpgPage> getJpgResultPages() {
    return jpgResultPages;
  }


  @JsonProperty(JSON_PROPERTY_JPG_RESULT_PAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJpgResultPages(List<ConvertedJpgPage> jpgResultPages) {
    this.jpgResultPages = jpgResultPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OdtToJpgResult odtToJpgResult = (OdtToJpgResult) o;
    return Objects.equals(this.successful, odtToJpgResult.successful) &&
        Objects.equals(this.jpgResultPages, odtToJpgResult.jpgResultPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, jpgResultPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OdtToJpgResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    jpgResultPages: ").append(toIndentedString(jpgResultPages)).append("\n");
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

