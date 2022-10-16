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
 * DocxTemplateOperation
 */
@JsonPropertyOrder({
  DocxTemplateOperation.JSON_PROPERTY_ACTION,
  DocxTemplateOperation.JSON_PROPERTY_MATCH_AGAINST,
  DocxTemplateOperation.JSON_PROPERTY_REPLACE_WITH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class DocxTemplateOperation {
  /**
   * Operation action to take; possible values are \&quot;Replace\&quot;
   */
  public enum ActionEnum {
    NUMBER_1(1);

    private Integer value;

    ActionEnum(Integer value) {
      this.value = value;
    }

    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionEnum fromValue(Integer value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "Action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_MATCH_AGAINST = "MatchAgainst";
  private String matchAgainst;

  public static final String JSON_PROPERTY_REPLACE_WITH = "ReplaceWith";
  private String replaceWith;

  public DocxTemplateOperation() { 
  }

  public DocxTemplateOperation action(ActionEnum action) {
    
    this.action = action;
    return this;
  }

   /**
   * Operation action to take; possible values are \&quot;Replace\&quot;
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operation action to take; possible values are \"Replace\"")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public DocxTemplateOperation matchAgainst(String matchAgainst) {
    
    this.matchAgainst = matchAgainst;
    return this;
  }

   /**
   * For Replace operations, the string to match against (to be replaced with ReplaceWith string)
   * @return matchAgainst
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Replace operations, the string to match against (to be replaced with ReplaceWith string)")
  @JsonProperty(JSON_PROPERTY_MATCH_AGAINST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchAgainst() {
    return matchAgainst;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_AGAINST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchAgainst(String matchAgainst) {
    this.matchAgainst = matchAgainst;
  }


  public DocxTemplateOperation replaceWith(String replaceWith) {
    
    this.replaceWith = replaceWith;
    return this;
  }

   /**
   * For Replace operations, the string to Replace the original string with
   * @return replaceWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For Replace operations, the string to Replace the original string with")
  @JsonProperty(JSON_PROPERTY_REPLACE_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReplaceWith() {
    return replaceWith;
  }


  @JsonProperty(JSON_PROPERTY_REPLACE_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReplaceWith(String replaceWith) {
    this.replaceWith = replaceWith;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxTemplateOperation docxTemplateOperation = (DocxTemplateOperation) o;
    return Objects.equals(this.action, docxTemplateOperation.action) &&
        Objects.equals(this.matchAgainst, docxTemplateOperation.matchAgainst) &&
        Objects.equals(this.replaceWith, docxTemplateOperation.replaceWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, matchAgainst, replaceWith);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxTemplateOperation {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    matchAgainst: ").append(toIndentedString(matchAgainst)).append("\n");
    sb.append("    replaceWith: ").append(toIndentedString(replaceWith)).append("\n");
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

