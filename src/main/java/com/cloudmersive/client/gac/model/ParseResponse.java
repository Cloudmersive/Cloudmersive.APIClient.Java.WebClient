/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
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
 * Result of linguistic parse operation
 */
@ApiModel(description = "Result of linguistic parse operation")
@JsonPropertyOrder({
  ParseResponse.JSON_PROPERTY_PARSE_TREE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:52.799943-07:00[America/Los_Angeles]")
public class ParseResponse {
  public static final String JSON_PROPERTY_PARSE_TREE = "ParseTree";
  private String parseTree;

  public ParseResponse() { 
  }

  public ParseResponse parseTree(String parseTree) {
    
    this.parseTree = parseTree;
    return this;
  }

   /**
   * Parse tree in Penn Treebank syntax tree format
   * @return parseTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parse tree in Penn Treebank syntax tree format")
  @JsonProperty(JSON_PROPERTY_PARSE_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParseTree() {
    return parseTree;
  }


  @JsonProperty(JSON_PROPERTY_PARSE_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParseTree(String parseTree) {
    this.parseTree = parseTree;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParseResponse parseResponse = (ParseResponse) o;
    return Objects.equals(this.parseTree, parseResponse.parseTree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parseTree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParseResponse {\n");
    sb.append("    parseTree: ").append(toIndentedString(parseTree)).append("\n");
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

