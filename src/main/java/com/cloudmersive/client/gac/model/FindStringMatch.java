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
 * Individual match result of finding a target string in a longer text string
 */
@ApiModel(description = "Individual match result of finding a target string in a longer text string")
@JsonPropertyOrder({
  FindStringMatch.JSON_PROPERTY_CHARACTER_OFFSET_START,
  FindStringMatch.JSON_PROPERTY_CHARACTER_OFFSET_END,
  FindStringMatch.JSON_PROPERTY_CONTAINING_LINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class FindStringMatch {
  public static final String JSON_PROPERTY_CHARACTER_OFFSET_START = "CharacterOffsetStart";
  private Integer characterOffsetStart;

  public static final String JSON_PROPERTY_CHARACTER_OFFSET_END = "CharacterOffsetEnd";
  private Integer characterOffsetEnd;

  public static final String JSON_PROPERTY_CONTAINING_LINE = "ContainingLine";
  private String containingLine;

  public FindStringMatch() { 
  }

  public FindStringMatch characterOffsetStart(Integer characterOffsetStart) {
    
    this.characterOffsetStart = characterOffsetStart;
    return this;
  }

   /**
   * 0-based index of the start of the match
   * @return characterOffsetStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the start of the match")
  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCharacterOffsetStart() {
    return characterOffsetStart;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacterOffsetStart(Integer characterOffsetStart) {
    this.characterOffsetStart = characterOffsetStart;
  }


  public FindStringMatch characterOffsetEnd(Integer characterOffsetEnd) {
    
    this.characterOffsetEnd = characterOffsetEnd;
    return this;
  }

   /**
   * 0-based index of the end of the match
   * @return characterOffsetEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "0-based index of the end of the match")
  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCharacterOffsetEnd() {
    return characterOffsetEnd;
  }


  @JsonProperty(JSON_PROPERTY_CHARACTER_OFFSET_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharacterOffsetEnd(Integer characterOffsetEnd) {
    this.characterOffsetEnd = characterOffsetEnd;
  }


  public FindStringMatch containingLine(String containingLine) {
    
    this.containingLine = containingLine;
    return this;
  }

   /**
   * Text content of the line containing the match
   * @return containingLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text content of the line containing the match")
  @JsonProperty(JSON_PROPERTY_CONTAINING_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContainingLine() {
    return containingLine;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINING_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainingLine(String containingLine) {
    this.containingLine = containingLine;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FindStringMatch findStringMatch = (FindStringMatch) o;
    return Objects.equals(this.characterOffsetStart, findStringMatch.characterOffsetStart) &&
        Objects.equals(this.characterOffsetEnd, findStringMatch.characterOffsetEnd) &&
        Objects.equals(this.containingLine, findStringMatch.containingLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterOffsetStart, characterOffsetEnd, containingLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FindStringMatch {\n");
    sb.append("    characterOffsetStart: ").append(toIndentedString(characterOffsetStart)).append("\n");
    sb.append("    characterOffsetEnd: ").append(toIndentedString(characterOffsetEnd)).append("\n");
    sb.append("    containingLine: ").append(toIndentedString(containingLine)).append("\n");
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

