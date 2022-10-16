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
import com.cloudmersive.client.gac.model.ZipDirectory;
import com.cloudmersive.client.gac.model.ZipFile;
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
 * Request to create a Zip Archive
 */
@ApiModel(description = "Request to create a Zip Archive")
@JsonPropertyOrder({
  CreateZipArchiveRequest.JSON_PROPERTY_FILES_IN_ZIP,
  CreateZipArchiveRequest.JSON_PROPERTY_DIRECTORIES_IN_ZIP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class CreateZipArchiveRequest {
  public static final String JSON_PROPERTY_FILES_IN_ZIP = "FilesInZip";
  private List<ZipFile> filesInZip = null;

  public static final String JSON_PROPERTY_DIRECTORIES_IN_ZIP = "DirectoriesInZip";
  private List<ZipDirectory> directoriesInZip = null;

  public CreateZipArchiveRequest() { 
  }

  public CreateZipArchiveRequest filesInZip(List<ZipFile> filesInZip) {
    
    this.filesInZip = filesInZip;
    return this;
  }

  public CreateZipArchiveRequest addFilesInZipItem(ZipFile filesInZipItem) {
    if (this.filesInZip == null) {
      this.filesInZip = new ArrayList<>();
    }
    this.filesInZip.add(filesInZipItem);
    return this;
  }

   /**
   * Top-level files in the root directory fo the zip file
   * @return filesInZip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Top-level files in the root directory fo the zip file")
  @JsonProperty(JSON_PROPERTY_FILES_IN_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZipFile> getFilesInZip() {
    return filesInZip;
  }


  @JsonProperty(JSON_PROPERTY_FILES_IN_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilesInZip(List<ZipFile> filesInZip) {
    this.filesInZip = filesInZip;
  }


  public CreateZipArchiveRequest directoriesInZip(List<ZipDirectory> directoriesInZip) {
    
    this.directoriesInZip = directoriesInZip;
    return this;
  }

  public CreateZipArchiveRequest addDirectoriesInZipItem(ZipDirectory directoriesInZipItem) {
    if (this.directoriesInZip == null) {
      this.directoriesInZip = new ArrayList<>();
    }
    this.directoriesInZip.add(directoriesInZipItem);
    return this;
  }

   /**
   * Top-level directories in the root directory of the zip; directories can contain sub-directories and files
   * @return directoriesInZip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Top-level directories in the root directory of the zip; directories can contain sub-directories and files")
  @JsonProperty(JSON_PROPERTY_DIRECTORIES_IN_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZipDirectory> getDirectoriesInZip() {
    return directoriesInZip;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORIES_IN_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoriesInZip(List<ZipDirectory> directoriesInZip) {
    this.directoriesInZip = directoriesInZip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateZipArchiveRequest createZipArchiveRequest = (CreateZipArchiveRequest) o;
    return Objects.equals(this.filesInZip, createZipArchiveRequest.filesInZip) &&
        Objects.equals(this.directoriesInZip, createZipArchiveRequest.directoriesInZip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filesInZip, directoriesInZip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateZipArchiveRequest {\n");
    sb.append("    filesInZip: ").append(toIndentedString(filesInZip)).append("\n");
    sb.append("    directoriesInZip: ").append(toIndentedString(directoriesInZip)).append("\n");
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

