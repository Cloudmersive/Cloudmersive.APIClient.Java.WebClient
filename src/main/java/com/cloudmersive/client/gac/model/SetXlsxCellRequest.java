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
import com.cloudmersive.client.gac.model.XlsxSpreadsheetCell;
import com.cloudmersive.client.gac.model.XlsxWorksheet;
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
 * Input to a Set Cell in XLSX Worksheets request
 */
@ApiModel(description = "Input to a Set Cell in XLSX Worksheets request")
@JsonPropertyOrder({
  SetXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  SetXlsxCellRequest.JSON_PROPERTY_INPUT_FILE_URL,
  SetXlsxCellRequest.JSON_PROPERTY_WORKSHEET_TO_UPDATE,
  SetXlsxCellRequest.JSON_PROPERTY_ROW_INDEX,
  SetXlsxCellRequest.JSON_PROPERTY_CELL_INDEX,
  SetXlsxCellRequest.JSON_PROPERTY_CELL_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class SetXlsxCellRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_UPDATE = "WorksheetToUpdate";
  private XlsxWorksheet worksheetToUpdate;

  public static final String JSON_PROPERTY_ROW_INDEX = "RowIndex";
  private Integer rowIndex;

  public static final String JSON_PROPERTY_CELL_INDEX = "CellIndex";
  private Integer cellIndex;

  public static final String JSON_PROPERTY_CELL_VALUE = "CellValue";
  private XlsxSpreadsheetCell cellValue;

  public SetXlsxCellRequest() { 
  }

  public SetXlsxCellRequest inputFileBytes(byte[] inputFileBytes) {
    
    this.inputFileBytes = inputFileBytes;
    return this;
  }

   /**
   * Optional: Bytes of the input file to operate on
   * @return inputFileBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Bytes of the input file to operate on")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public byte[] getInputFileBytes() {
    return inputFileBytes;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileBytes(byte[] inputFileBytes) {
    this.inputFileBytes = inputFileBytes;
  }


  public SetXlsxCellRequest inputFileUrl(String inputFileUrl) {
    
    this.inputFileUrl = inputFileUrl;
    return this;
  }

   /**
   * Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
   * @return inputFileUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).")
  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInputFileUrl() {
    return inputFileUrl;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_FILE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputFileUrl(String inputFileUrl) {
    this.inputFileUrl = inputFileUrl;
  }


  public SetXlsxCellRequest worksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    
    this.worksheetToUpdate = worksheetToUpdate;
    return this;
  }

   /**
   * Get worksheetToUpdate
   * @return worksheetToUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToUpdate() {
    return worksheetToUpdate;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_UPDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToUpdate(XlsxWorksheet worksheetToUpdate) {
    this.worksheetToUpdate = worksheetToUpdate;
  }


  public SetXlsxCellRequest rowIndex(Integer rowIndex) {
    
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * 0-based index of the row, 0, 1, 2, ... to set
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row, 0, 1, 2, ... to set")
  @JsonProperty(JSON_PROPERTY_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRowIndex() {
    return rowIndex;
  }


  @JsonProperty(JSON_PROPERTY_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  public SetXlsxCellRequest cellIndex(Integer cellIndex) {
    
    this.cellIndex = cellIndex;
    return this;
  }

   /**
   * 0-based index of the cell, 0, 1, 2, ... in the row to set
   * @return cellIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the cell, 0, 1, 2, ... in the row to set")
  @JsonProperty(JSON_PROPERTY_CELL_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCellIndex() {
    return cellIndex;
  }


  @JsonProperty(JSON_PROPERTY_CELL_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellIndex(Integer cellIndex) {
    this.cellIndex = cellIndex;
  }


  public SetXlsxCellRequest cellValue(XlsxSpreadsheetCell cellValue) {
    
    this.cellValue = cellValue;
    return this;
  }

   /**
   * Get cellValue
   * @return cellValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CELL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxSpreadsheetCell getCellValue() {
    return cellValue;
  }


  @JsonProperty(JSON_PROPERTY_CELL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCellValue(XlsxSpreadsheetCell cellValue) {
    this.cellValue = cellValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetXlsxCellRequest setXlsxCellRequest = (SetXlsxCellRequest) o;
    return Arrays.equals(this.inputFileBytes, setXlsxCellRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, setXlsxCellRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToUpdate, setXlsxCellRequest.worksheetToUpdate) &&
        Objects.equals(this.rowIndex, setXlsxCellRequest.rowIndex) &&
        Objects.equals(this.cellIndex, setXlsxCellRequest.cellIndex) &&
        Objects.equals(this.cellValue, setXlsxCellRequest.cellValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToUpdate, rowIndex, cellIndex, cellValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetXlsxCellRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToUpdate: ").append(toIndentedString(worksheetToUpdate)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
    sb.append("    cellIndex: ").append(toIndentedString(cellIndex)).append("\n");
    sb.append("    cellValue: ").append(toIndentedString(cellValue)).append("\n");
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

