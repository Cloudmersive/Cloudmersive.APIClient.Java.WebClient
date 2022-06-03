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
import com.cloudmersive.client.gac.model.TextDocumentElement;
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
 * The result of splitting a Text document into separate elements
 */
@ApiModel(description = "The result of splitting a Text document into separate elements")
@JsonPropertyOrder({
  SplitTextDocumentByStringResult.JSON_PROPERTY_RESULT_ELEMENTS,
  SplitTextDocumentByStringResult.JSON_PROPERTY_SUCCESSFUL,
  SplitTextDocumentByStringResult.JSON_PROPERTY_ELEMENT_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class SplitTextDocumentByStringResult {
  public static final String JSON_PROPERTY_RESULT_ELEMENTS = "ResultElements";
  private List<TextDocumentElement> resultElements = null;

  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_ELEMENT_COUNT = "ElementCount";
  private Integer elementCount;

  public SplitTextDocumentByStringResult() { 
  }

  public SplitTextDocumentByStringResult resultElements(List<TextDocumentElement> resultElements) {
    
    this.resultElements = resultElements;
    return this;
  }

  public SplitTextDocumentByStringResult addResultElementsItem(TextDocumentElement resultElementsItem) {
    if (this.resultElements == null) {
      this.resultElements = new ArrayList<>();
    }
    this.resultElements.add(resultElementsItem);
    return this;
  }

   /**
   * Get resultElements
   * @return resultElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TextDocumentElement> getResultElements() {
    return resultElements;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultElements(List<TextDocumentElement> resultElements) {
    this.resultElements = resultElements;
  }


  public SplitTextDocumentByStringResult successful(Boolean successful) {
    
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


  public SplitTextDocumentByStringResult elementCount(Integer elementCount) {
    
    this.elementCount = elementCount;
    return this;
  }

   /**
   * The count of elements in the text file
   * @return elementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of elements in the text file")
  @JsonProperty(JSON_PROPERTY_ELEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElementCount() {
    return elementCount;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElementCount(Integer elementCount) {
    this.elementCount = elementCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTextDocumentByStringResult splitTextDocumentByStringResult = (SplitTextDocumentByStringResult) o;
    return Objects.equals(this.resultElements, splitTextDocumentByStringResult.resultElements) &&
        Objects.equals(this.successful, splitTextDocumentByStringResult.successful) &&
        Objects.equals(this.elementCount, splitTextDocumentByStringResult.elementCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultElements, successful, elementCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTextDocumentByStringResult {\n");
    sb.append("    resultElements: ").append(toIndentedString(resultElements)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    elementCount: ").append(toIndentedString(elementCount)).append("\n");
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

