/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
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
import com.cloudmersive.client.gac.model.SqlInjectionDetectionResult;
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
 * Result of performing a batch XSS protection operation
 */
@ApiModel(description = "Result of performing a batch XSS protection operation")
@JsonPropertyOrder({
  SqlInjectionCheckBatchResponse.JSON_PROPERTY_RESULT_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class SqlInjectionCheckBatchResponse {
  public static final String JSON_PROPERTY_RESULT_ITEMS = "ResultItems";
  private List<SqlInjectionDetectionResult> resultItems = null;

  public SqlInjectionCheckBatchResponse() { 
  }

  public SqlInjectionCheckBatchResponse resultItems(List<SqlInjectionDetectionResult> resultItems) {
    
    this.resultItems = resultItems;
    return this;
  }

  public SqlInjectionCheckBatchResponse addResultItemsItem(SqlInjectionDetectionResult resultItemsItem) {
    if (this.resultItems == null) {
      this.resultItems = new ArrayList<>();
    }
    this.resultItems.add(resultItemsItem);
    return this;
  }

   /**
   * Results from performing a batch SQL Injection detection operation; order is preserved from input data
   * @return resultItems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Results from performing a batch SQL Injection detection operation; order is preserved from input data")
  @JsonProperty(JSON_PROPERTY_RESULT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SqlInjectionDetectionResult> getResultItems() {
    return resultItems;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultItems(List<SqlInjectionDetectionResult> resultItems) {
    this.resultItems = resultItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SqlInjectionCheckBatchResponse sqlInjectionCheckBatchResponse = (SqlInjectionCheckBatchResponse) o;
    return Objects.equals(this.resultItems, sqlInjectionCheckBatchResponse.resultItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SqlInjectionCheckBatchResponse {\n");
    sb.append("    resultItems: ").append(toIndentedString(resultItems)).append("\n");
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

