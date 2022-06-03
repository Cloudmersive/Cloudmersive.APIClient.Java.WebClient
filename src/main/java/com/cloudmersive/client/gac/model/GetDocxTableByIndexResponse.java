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
import com.cloudmersive.client.gac.model.DocxTable;
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
 * Result of running a Get-Tables by Index command
 */
@ApiModel(description = "Result of running a Get-Tables by Index command")
@JsonPropertyOrder({
  GetDocxTableByIndexResponse.JSON_PROPERTY_SUCCESSFUL,
  GetDocxTableByIndexResponse.JSON_PROPERTY_TABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class GetDocxTableByIndexResponse {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_TABLE = "Table";
  private DocxTable table;

  public GetDocxTableByIndexResponse() { 
  }

  public GetDocxTableByIndexResponse successful(Boolean successful) {
    
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


  public GetDocxTableByIndexResponse table(DocxTable table) {
    
    this.table = table;
    return this;
  }

   /**
   * Get table
   * @return table
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DocxTable getTable() {
    return table;
  }


  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTable(DocxTable table) {
    this.table = table;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDocxTableByIndexResponse getDocxTableByIndexResponse = (GetDocxTableByIndexResponse) o;
    return Objects.equals(this.successful, getDocxTableByIndexResponse.successful) &&
        Objects.equals(this.table, getDocxTableByIndexResponse.table);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, table);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDocxTableByIndexResponse {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
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

