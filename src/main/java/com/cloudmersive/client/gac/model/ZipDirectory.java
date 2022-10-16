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
 * Representation of a directory in a zip file
 */
@ApiModel(description = "Representation of a directory in a zip file")
@JsonPropertyOrder({
  ZipDirectory.JSON_PROPERTY_DIRECTORY_NAME,
  ZipDirectory.JSON_PROPERTY_DIRECTORIES_IN_DIRECTORY,
  ZipDirectory.JSON_PROPERTY_FILES_IN_DIRECTORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class ZipDirectory {
  public static final String JSON_PROPERTY_DIRECTORY_NAME = "DirectoryName";
  private String directoryName;

  public static final String JSON_PROPERTY_DIRECTORIES_IN_DIRECTORY = "DirectoriesInDirectory";
  private List<ZipDirectory> directoriesInDirectory = null;

  public static final String JSON_PROPERTY_FILES_IN_DIRECTORY = "FilesInDirectory";
  private List<ZipFile> filesInDirectory = null;

  public ZipDirectory() { 
  }

  public ZipDirectory directoryName(String directoryName) {
    
    this.directoryName = directoryName;
    return this;
  }

   /**
   * Name of this directory
   * @return directoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of this directory")
  @JsonProperty(JSON_PROPERTY_DIRECTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectoryName() {
    return directoryName;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoryName(String directoryName) {
    this.directoryName = directoryName;
  }


  public ZipDirectory directoriesInDirectory(List<ZipDirectory> directoriesInDirectory) {
    
    this.directoriesInDirectory = directoriesInDirectory;
    return this;
  }

  public ZipDirectory addDirectoriesInDirectoryItem(ZipDirectory directoriesInDirectoryItem) {
    if (this.directoriesInDirectory == null) {
      this.directoriesInDirectory = new ArrayList<>();
    }
    this.directoriesInDirectory.add(directoriesInDirectoryItem);
    return this;
  }

   /**
   * Child directories contained directly in this directory
   * @return directoriesInDirectory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Child directories contained directly in this directory")
  @JsonProperty(JSON_PROPERTY_DIRECTORIES_IN_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZipDirectory> getDirectoriesInDirectory() {
    return directoriesInDirectory;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTORIES_IN_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectoriesInDirectory(List<ZipDirectory> directoriesInDirectory) {
    this.directoriesInDirectory = directoriesInDirectory;
  }


  public ZipDirectory filesInDirectory(List<ZipFile> filesInDirectory) {
    
    this.filesInDirectory = filesInDirectory;
    return this;
  }

  public ZipDirectory addFilesInDirectoryItem(ZipFile filesInDirectoryItem) {
    if (this.filesInDirectory == null) {
      this.filesInDirectory = new ArrayList<>();
    }
    this.filesInDirectory.add(filesInDirectoryItem);
    return this;
  }

   /**
   * Child files contained directly in this directory
   * @return filesInDirectory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Child files contained directly in this directory")
  @JsonProperty(JSON_PROPERTY_FILES_IN_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ZipFile> getFilesInDirectory() {
    return filesInDirectory;
  }


  @JsonProperty(JSON_PROPERTY_FILES_IN_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilesInDirectory(List<ZipFile> filesInDirectory) {
    this.filesInDirectory = filesInDirectory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZipDirectory zipDirectory = (ZipDirectory) o;
    return Objects.equals(this.directoryName, zipDirectory.directoryName) &&
        Objects.equals(this.directoriesInDirectory, zipDirectory.directoriesInDirectory) &&
        Objects.equals(this.filesInDirectory, zipDirectory.filesInDirectory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryName, directoriesInDirectory, filesInDirectory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZipDirectory {\n");
    sb.append("    directoryName: ").append(toIndentedString(directoryName)).append("\n");
    sb.append("    directoriesInDirectory: ").append(toIndentedString(directoriesInDirectory)).append("\n");
    sb.append("    filesInDirectory: ").append(toIndentedString(filesInDirectory)).append("\n");
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

