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
 * Input to a get DOCX table row request
 */
@ApiModel(description = "Input to a get DOCX table row request")
@JsonPropertyOrder({
  GetDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_BYTES,
  GetDocxTableRowRequest.JSON_PROPERTY_INPUT_FILE_URL,
  GetDocxTableRowRequest.JSON_PROPERTY_TABLE_PATH,
  GetDocxTableRowRequest.JSON_PROPERTY_TABLE_ROW_ROW_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class GetDocxTableRowRequest {
  public static final String JSON_PROPERTY_INPUT_FILE_BYTES = "InputFileBytes";
  private byte[] inputFileBytes;

  public static final String JSON_PROPERTY_INPUT_FILE_URL = "InputFileUrl";
  private String inputFileUrl;

  public static final String JSON_PROPERTY_TABLE_PATH = "TablePath";
  private String tablePath;

  public static final String JSON_PROPERTY_TABLE_ROW_ROW_INDEX = "TableRowRowIndex";
  private Integer tableRowRowIndex;

  public GetDocxTableRowRequest() { 
  }

  public GetDocxTableRowRequest inputFileBytes(byte[] inputFileBytes) {
    
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


  public GetDocxTableRowRequest inputFileUrl(String inputFileUrl) {
    
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


  public GetDocxTableRowRequest tablePath(String tablePath) {
    
    this.tablePath = tablePath;
    return this;
  }

   /**
   * Path to the table to retrievew the row from
   * @return tablePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path to the table to retrievew the row from")
  @JsonProperty(JSON_PROPERTY_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTablePath() {
    return tablePath;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTablePath(String tablePath) {
    this.tablePath = tablePath;
  }


  public GetDocxTableRowRequest tableRowRowIndex(Integer tableRowRowIndex) {
    
    this.tableRowRowIndex = tableRowRowIndex;
    return this;
  }

   /**
   * 0-based index of the row to retrieve (e.g. 0, 1, 2, ...) in the table
   * @return tableRowRowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the row to retrieve (e.g. 0, 1, 2, ...) in the table")
  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTableRowRowIndex() {
    return tableRowRowIndex;
  }


  @JsonProperty(JSON_PROPERTY_TABLE_ROW_ROW_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTableRowRowIndex(Integer tableRowRowIndex) {
    this.tableRowRowIndex = tableRowRowIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTableRowRequest getDocxTableRowRequest = (GetDocxTableRowRequest) o;
    return Arrays.equals(this.inputFileBytes, getDocxTableRowRequest.inputFileBytes) &&
        Objects.equals(this.inputFileUrl, getDocxTableRowRequest.inputFileUrl) &&
        Objects.equals(this.tablePath, getDocxTableRowRequest.tablePath) &&
        Objects.equals(this.tableRowRowIndex, getDocxTableRowRequest.tableRowRowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(inputFileBytes), inputFileUrl, tablePath, tableRowRowIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTableRowRequest {\n");
    sb.append("    inputFileBytes: ").append(toIndentedString(inputFileBytes)).append("\n");
    sb.append("    inputFileUrl: ").append(toIndentedString(inputFileUrl)).append("\n");
    sb.append("    tablePath: ").append(toIndentedString(tablePath)).append("\n");
    sb.append("    tableRowRowIndex: ").append(toIndentedString(tableRowRowIndex)).append("\n");
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

