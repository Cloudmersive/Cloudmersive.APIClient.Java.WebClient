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
import com.cloudmersive.client.gac.model.XlsxWorksheet;
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
 * Result of running a Get-Worksheets command
 */
@ApiModel(description = "Result of running a Get-Worksheets command")
@JsonPropertyOrder({
  GetXlsxWorksheetsResponse.JSON_PROPERTY_SUCCESSFUL,
  GetXlsxWorksheetsResponse.JSON_PROPERTY_WORKSHEETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class GetXlsxWorksheetsResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_WORKSHEETS = "Worksheets";
  private List<XlsxWorksheet> worksheets = null;

  public GetXlsxWorksheetsResponse() { 
  }

  public GetXlsxWorksheetsResponse successful(Boolean successful) {
    
    this.successful = successful;
    return this;
  }

   /**
   * True if successful, false otherwise
   * @return successful
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if successful, false otherwise")
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


  public GetXlsxWorksheetsResponse worksheets(List<XlsxWorksheet> worksheets) {
    
    this.worksheets = worksheets;
    return this;
  }

  public GetXlsxWorksheetsResponse addWorksheetsItem(XlsxWorksheet worksheetsItem) {
    if (this.worksheets == null) {
      this.worksheets = new ArrayList<>();
    }
    this.worksheets.add(worksheetsItem);
    return this;
  }

   /**
   * Worksheets in the Excel XLSX spreadsheet
   * @return worksheets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Worksheets in the Excel XLSX spreadsheet")
  @JsonProperty(JSON_PROPERTY_WORKSHEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XlsxWorksheet> getWorksheets() {
    return worksheets;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheets(List<XlsxWorksheet> worksheets) {
    this.worksheets = worksheets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetXlsxWorksheetsResponse getXlsxWorksheetsResponse = (GetXlsxWorksheetsResponse) o;
    return Objects.equals(this.successful, getXlsxWorksheetsResponse.successful) &&
        Objects.equals(this.worksheets, getXlsxWorksheetsResponse.worksheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, worksheets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetXlsxWorksheetsResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    worksheets: ").append(toIndentedString(worksheets)).append("\n");
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

