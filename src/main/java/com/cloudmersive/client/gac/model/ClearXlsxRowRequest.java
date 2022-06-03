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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Input to a Clear-Row request
 */
@ApiModel(description = "Input to a Clear-Row request")
@JsonPropertyOrder({
  ClearXlsxRowRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  ClearXlsxRowRequest.JSON_PROPERTY_INPUT_FILE_URL,
  ClearXlsxRowRequest.JSON_PROPERTY_WORKSHEET_TO_EDIT,
  ClearXlsxRowRequest.JSON_PROPERTY_ROW_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class ClearXlsxRowRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_WORKSHEET_TO_EDIT = "WorksheetToEdit";
  private XlsxWorksheet worksheetToEdit;

  public static final String JSON_PROPERTY_ROW_INDEX = "RowIndex";
  private Integer rowIndex;

  public ClearXlsxRowRequest() { 
  }

  public ClearXlsxRowRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public ClearXlsxRowRequest inputFileUrl(String inputFileUrl) {
    
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


  public ClearXlsxRowRequest worksheetToEdit(XlsxWorksheet worksheetToEdit) {
    
    this.worksheetToEdit = worksheetToEdit;
    return this;
  }

   /**
   * Get worksheetToEdit
   * @return worksheetToEdit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public XlsxWorksheet getWorksheetToEdit() {
    return worksheetToEdit;
  }


  @JsonProperty(JSON_PROPERTY_WORKSHEET_TO_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWorksheetToEdit(XlsxWorksheet worksheetToEdit) {
    this.worksheetToEdit = worksheetToEdit;
  }


  public ClearXlsxRowRequest rowIndex(Integer rowIndex) {
    
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Required; Index for the desired row to be cleared
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Required; Index for the desired row to be cleared")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearXlsxRowRequest clearXlsxRowRequest = (ClearXlsxRowRequest) o;
    return Arrays.equals(this.inputFileBytes, clearXlsxRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, clearXlsxRowRequest.inputFileUrl) &&
        Objects.equals(this.worksheetToEdit, clearXlsxRowRequest.worksheetToEdit) &&
        Objects.equals(this.rowIndex, clearXlsxRowRequest.rowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, worksheetToEdit, rowIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearXlsxRowRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    worksheetToEdit: ").append(toIndentedString(worksheetToEdit)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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

