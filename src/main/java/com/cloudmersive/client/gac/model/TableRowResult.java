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
import com.cloudmersive.client.gac.model.TableCellResult;
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
 * One row of data in the resulting table
 */
@ApiModel(description = "One row of data in the resulting table")
@JsonPropertyOrder({
  TableRowResult.JSON_PROPERTY_TABLE_ROW_CELLS_RESULT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:52.595540500-07:00[America/Los_Angeles]")
public class TableRowResult {
  public static final String JSON_PROPERTY_TABLE_ROW_CELLS_RESULT = "TableRowCellsResult";
  private List<TableCellResult> tableRowCellsResult = null;

  public TableRowResult() { 
  }

  public TableRowResult tableRowCellsResult(List<TableCellResult> tableRowCellsResult) {
    
    this.tableRowCellsResult = tableRowCellsResult;
    return this;
  }

  public TableRowResult addTableRowCellsResultItem(TableCellResult tableRowCellsResultItem) {
    if (this.tableRowCellsResult == null) {
      this.tableRowCellsResult = new ArrayList<>();
    }
    this.tableRowCellsResult.add(tableRowCellsResultItem);
    return this;
  }

   /**
   * Table cells in this row result
   * @return tableRowCellsResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Table cells in this row result")
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_CELLS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TableCellResult> getTableRowCellsResult() {
    return tableRowCellsResult;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ROW_CELLS_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableRowCellsResult(List<TableCellResult> tableRowCellsResult) {
    this.tableRowCellsResult = tableRowCellsResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableRowResult tableRowResult = (TableRowResult) o;
    return Objects.equals(this.tableRowCellsResult, tableRowResult.tableRowCellsResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableRowCellsResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableRowResult {\n");
    sb.append("    tableRowCellsResult: ").append(toIndentedString(tableRowCellsResult)).append("\n");
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

