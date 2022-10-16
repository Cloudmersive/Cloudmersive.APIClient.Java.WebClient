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
import com.cloudmersive.client.gac.model.CsvFileResult;
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
 * Collection of CSV Files
 */
@ApiModel(description = "Collection of CSV Files")
@JsonPropertyOrder({
  CsvCollection.JSON_PROPERTY_SUCCESSFUL,
  CsvCollection.JSON_PROPERTY_CSV_FILES,
  CsvCollection.JSON_PROPERTY_FILE_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class CsvCollection {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_CSV_FILES = "CsvFiles";
  private List<CsvFileResult> csvFiles = null;

  public static final String JSON_PROPERTY_FILE_COUNT = "FileCount";
  private Integer fileCount;

  public CsvCollection() { 
  }

  public CsvCollection successful(Boolean successful) {
    
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


  public CsvCollection csvFiles(List<CsvFileResult> csvFiles) {
    
    this.csvFiles = csvFiles;
    return this;
  }

  public CsvCollection addCsvFilesItem(CsvFileResult csvFilesItem) {
    if (this.csvFiles == null) {
      this.csvFiles = new ArrayList<>();
    }
    this.csvFiles.add(csvFilesItem);
    return this;
  }

   /**
   * Array of CSV File results
   * @return csvFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of CSV File results")
  @JsonProperty(JSON_PROPERTY_CSV_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CsvFileResult> getCsvFiles() {
    return csvFiles;
  }


  @JsonProperty(JSON_PROPERTY_CSV_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCsvFiles(List<CsvFileResult> csvFiles) {
    this.csvFiles = csvFiles;
  }


  public CsvCollection fileCount(Integer fileCount) {
    
    this.fileCount = fileCount;
    return this;
  }

   /**
   * Count of the number of CSV files produced
   * @return fileCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of the number of CSV files produced")
  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFileCount() {
    return fileCount;
  }


  @JsonProperty(JSON_PROPERTY_FILE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileCount(Integer fileCount) {
    this.fileCount = fileCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvCollection csvCollection = (CsvCollection) o;
    return Objects.equals(this.successful, csvCollection.successful) &&
        Objects.equals(this.csvFiles, csvCollection.csvFiles) &&
        Objects.equals(this.fileCount, csvCollection.fileCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, csvFiles, fileCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvCollection {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    csvFiles: ").append(toIndentedString(csvFiles)).append("\n");
    sb.append("    fileCount: ").append(toIndentedString(fileCount)).append("\n");
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

