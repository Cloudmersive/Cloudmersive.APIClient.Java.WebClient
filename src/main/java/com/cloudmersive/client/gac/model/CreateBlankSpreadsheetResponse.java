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
 * Result of creating a blank worksheet
 */
@ApiModel(description = "Result of creating a blank worksheet")
@JsonPropertyOrder({
  CreateBlankSpreadsheetResponse.JSON_PROPERTY_SUCCESSFUL,
  CreateBlankSpreadsheetResponse.JSON_PROPERTY_EDITED_DOCUMENT_U_R_L
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class CreateBlankSpreadsheetResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_EDITED_DOCUMENT_U_R_L = "EditedDocumentURL";
  private String editedDocumentURL;

  public CreateBlankSpreadsheetResponse() { 
  }

  public CreateBlankSpreadsheetResponse successful(Boolean successful) {
    
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


  public CreateBlankSpreadsheetResponse editedDocumentURL(String editedDocumentURL) {
    
    this.editedDocumentURL = editedDocumentURL;
    return this;
  }

   /**
   * URL to the edited XLSX file; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the result document contents.
   * @return editedDocumentURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to the edited XLSX file; file is stored in an in-memory cache and will be deleted.  Call Finish-Editing to get the result document contents.")
  @JsonProperty(JSON_PROPERTY_EDITED_DOCUMENT_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditedDocumentURL() {
    return editedDocumentURL;
  }


  @JsonProperty(JSON_PROPERTY_EDITED_DOCUMENT_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditedDocumentURL(String editedDocumentURL) {
    this.editedDocumentURL = editedDocumentURL;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateBlankSpreadsheetResponse createBlankSpreadsheetResponse = (CreateBlankSpreadsheetResponse) o;
    return Objects.equals(this.successful, createBlankSpreadsheetResponse.successful) &&
        Objects.equals(this.editedDocumentURL, createBlankSpreadsheetResponse.editedDocumentURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, editedDocumentURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBlankSpreadsheetResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    editedDocumentURL: ").append(toIndentedString(editedDocumentURL)).append("\n");
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

