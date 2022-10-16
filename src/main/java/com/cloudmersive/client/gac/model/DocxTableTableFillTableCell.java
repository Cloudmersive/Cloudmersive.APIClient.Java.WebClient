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
 * Cell data to fill in to the DOCX Table
 */
@ApiModel(description = "Cell data to fill in to the DOCX Table")
@JsonPropertyOrder({
  DocxTableTableFillTableCell.JSON_PROPERTY_TARGET_TAG,
  DocxTableTableFillTableCell.JSON_PROPERTY_REPLACEMENT_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class DocxTableTableFillTableCell {
  public static final String JSON_PROPERTY_TARGET_TAG = "TargetTag";
  private String targetTag;

  public static final String JSON_PROPERTY_REPLACEMENT_VALUE = "ReplacementValue";
  private String replacementValue;

  public DocxTableTableFillTableCell() { 
  }

  public DocxTableTableFillTableCell targetTag(String targetTag) {
    
    this.targetTag = targetTag;
    return this;
  }

   /**
   * Target tag to replace
   * @return targetTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Target tag to replace")
  @JsonProperty(JSON_PROPERTY_TARGET_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetTag() {
    return targetTag;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetTag(String targetTag) {
    this.targetTag = targetTag;
  }


  public DocxTableTableFillTableCell replacementValue(String replacementValue) {
    
    this.replacementValue = replacementValue;
    return this;
  }

   /**
   * Replacement value for the target tag
   * @return replacementValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Replacement value for the target tag")
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplacementValue() {
    return replacementValue;
  }


  @JsonProperty(JSON_PROPERTY_REPLACEMENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplacementValue(String replacementValue) {
    this.replacementValue = replacementValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTableTableFillTableCell docxTableTableFillTableCell = (DocxTableTableFillTableCell) o;
    return Objects.equals(this.targetTag, docxTableTableFillTableCell.targetTag) &&
        Objects.equals(this.replacementValue, docxTableTableFillTableCell.replacementValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetTag, replacementValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTableTableFillTableCell {\n");
    sb.append("    targetTag: ").append(toIndentedString(targetTag)).append("\n");
    sb.append("    replacementValue: ").append(toIndentedString(replacementValue)).append("\n");
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

