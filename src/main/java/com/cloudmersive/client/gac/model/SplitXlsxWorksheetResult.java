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
import com.cloudmersive.client.gac.model.WorksheetResult;
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
 * The result of splitting a spreadsheet into individual Excel XLSX worksheets
 */
@ApiModel(description = "The result of splitting a spreadsheet into individual Excel XLSX worksheets")
@JsonPropertyOrder({
  SplitXlsxWorksheetResult.JSON_PROPERTY_RESULT_WORKSHEETS,
  SplitXlsxWorksheetResult.JSON_PROPERTY_SUCCESSFUL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class SplitXlsxWorksheetResult {
  public static final String JSON_PROPERTY_RESULT_WORKSHEETS = "ResultWorksheets";
  private List<WorksheetResult> resultWorksheets = null;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public SplitXlsxWorksheetResult() { 
  }

  public SplitXlsxWorksheetResult resultWorksheets(List<WorksheetResult> resultWorksheets) {
    
    this.resultWorksheets = resultWorksheets;
    return this;
  }

  public SplitXlsxWorksheetResult addResultWorksheetsItem(WorksheetResult resultWorksheetsItem) {
    if (this.resultWorksheets == null) {
      this.resultWorksheets = new ArrayList<>();
    }
    this.resultWorksheets.add(resultWorksheetsItem);
    return this;
  }

   /**
   * Get resultWorksheets
   * @return resultWorksheets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_WORKSHEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WorksheetResult> getResultWorksheets() {
    return resultWorksheets;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_WORKSHEETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultWorksheets(List<WorksheetResult> resultWorksheets) {
    this.resultWorksheets = resultWorksheets;
  }


  public SplitXlsxWorksheetResult successful(Boolean successful) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitXlsxWorksheetResult splitXlsxWorksheetResult = (SplitXlsxWorksheetResult) o;
    return Objects.equals(this.resultWorksheets, splitXlsxWorksheetResult.resultWorksheets) &&
        Objects.equals(this.successful, splitXlsxWorksheetResult.successful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultWorksheets, successful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitXlsxWorksheetResult {\n");
    sb.append("    resultWorksheets: ").append(toIndentedString(resultWorksheets)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
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

