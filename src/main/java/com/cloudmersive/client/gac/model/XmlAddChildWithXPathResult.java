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
 * Result of performing a add child node operation on XML input using XPath
 */
@ApiModel(description = "Result of performing a add child node operation on XML input using XPath")
@JsonPropertyOrder({
  XmlAddChildWithXPathResult.JSON_PROPERTY_SUCCESSFUL,
  XmlAddChildWithXPathResult.JSON_PROPERTY_RESULTING_XML_DOCUMENT,
  XmlAddChildWithXPathResult.JSON_PROPERTY_NODES_EDITED_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class XmlAddChildWithXPathResult {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_RESULTING_XML_DOCUMENT = "ResultingXmlDocument";
  private String resultingXmlDocument;

  public static final String JSON_PROPERTY_NODES_EDITED_COUNT = "NodesEditedCount";
  private Integer nodesEditedCount;

  public XmlAddChildWithXPathResult() { 
  }

  public XmlAddChildWithXPathResult successful(Boolean successful) {
    
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


  public XmlAddChildWithXPathResult resultingXmlDocument(String resultingXmlDocument) {
    
    this.resultingXmlDocument = resultingXmlDocument;
    return this;
  }

   /**
   * Resulting, modified XML document
   * @return resultingXmlDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resulting, modified XML document")
  @JsonProperty(JSON_PROPERTY_RESULTING_XML_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultingXmlDocument() {
    return resultingXmlDocument;
  }


  @JsonProperty(JSON_PROPERTY_RESULTING_XML_DOCUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultingXmlDocument(String resultingXmlDocument) {
    this.resultingXmlDocument = resultingXmlDocument;
  }


  public XmlAddChildWithXPathResult nodesEditedCount(Integer nodesEditedCount) {
    
    this.nodesEditedCount = nodesEditedCount;
    return this;
  }

   /**
   * Count of the matching results
   * @return nodesEditedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of the matching results")
  @JsonProperty(JSON_PROPERTY_NODES_EDITED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNodesEditedCount() {
    return nodesEditedCount;
  }


  @JsonProperty(JSON_PROPERTY_NODES_EDITED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodesEditedCount(Integer nodesEditedCount) {
    this.nodesEditedCount = nodesEditedCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XmlAddChildWithXPathResult xmlAddChildWithXPathResult = (XmlAddChildWithXPathResult) o;
    return Objects.equals(this.successful, xmlAddChildWithXPathResult.successful) &&
        Objects.equals(this.resultingXmlDocument, xmlAddChildWithXPathResult.resultingXmlDocument) &&
        Objects.equals(this.nodesEditedCount, xmlAddChildWithXPathResult.nodesEditedCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, resultingXmlDocument, nodesEditedCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlAddChildWithXPathResult {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    resultingXmlDocument: ").append(toIndentedString(resultingXmlDocument)).append("\n");
    sb.append("    nodesEditedCount: ").append(toIndentedString(nodesEditedCount)).append("\n");
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

