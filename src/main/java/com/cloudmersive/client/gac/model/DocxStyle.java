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
 * Style in a DOCX Word Document
 */
@ApiModel(description = "Style in a DOCX Word Document")
@JsonPropertyOrder({
  DocxStyle.JSON_PROPERTY_STYLE_I_D,
  DocxStyle.JSON_PROPERTY_PATH,
  DocxStyle.JSON_PROPERTY_BOLD,
  DocxStyle.JSON_PROPERTY_ITALIC,
  DocxStyle.JSON_PROPERTY_UNDERLINE,
  DocxStyle.JSON_PROPERTY_FONT_SIZE,
  DocxStyle.JSON_PROPERTY_FONT_FAMILY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class DocxStyle {
  public static final String JSON_PROPERTY_STYLE_I_D = "StyleID";
  private String styleID;

  public static final String JSON_PROPERTY_PATH = "Path";
  private String path;

  public static final String JSON_PROPERTY_BOLD = "Bold";
  private Boolean bold;

  public static final String JSON_PROPERTY_ITALIC = "Italic";
  private Boolean italic;

  public static final String JSON_PROPERTY_UNDERLINE = "Underline";
  private Boolean underline;

  public static final String JSON_PROPERTY_FONT_SIZE = "FontSize";
  private String fontSize;

  public static final String JSON_PROPERTY_FONT_FAMILY = "FontFamily";
  private String fontFamily;

  public DocxStyle() { 
  }

  public DocxStyle styleID(String styleID) {
    
    this.styleID = styleID;
    return this;
  }

   /**
   * ID of the style
   * @return styleID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the style")
  @JsonProperty(JSON_PROPERTY_STYLE_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStyleID() {
    return styleID;
  }


  @JsonProperty(JSON_PROPERTY_STYLE_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyleID(String styleID) {
    this.styleID = styleID;
  }


  public DocxStyle path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The Path of the location of this object; leave blank for new tables
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Path of the location of this object; leave blank for new tables")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public DocxStyle bold(Boolean bold) {
    
    this.bold = bold;
    return this;
  }

   /**
   * Style applies bold formatting
   * @return bold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Style applies bold formatting")
  @JsonProperty(JSON_PROPERTY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBold() {
    return bold;
  }


  @JsonProperty(JSON_PROPERTY_BOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBold(Boolean bold) {
    this.bold = bold;
  }


  public DocxStyle italic(Boolean italic) {
    
    this.italic = italic;
    return this;
  }

   /**
   * Style applies italic formatting
   * @return italic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Style applies italic formatting")
  @JsonProperty(JSON_PROPERTY_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getItalic() {
    return italic;
  }


  @JsonProperty(JSON_PROPERTY_ITALIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItalic(Boolean italic) {
    this.italic = italic;
  }


  public DocxStyle underline(Boolean underline) {
    
    this.underline = underline;
    return this;
  }

   /**
   * Style applies underline formatting
   * @return underline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Style applies underline formatting")
  @JsonProperty(JSON_PROPERTY_UNDERLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUnderline() {
    return underline;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderline(Boolean underline) {
    this.underline = underline;
  }


  public DocxStyle fontSize(String fontSize) {
    
    this.fontSize = fontSize;
    return this;
  }

   /**
   * Font size
   * @return fontSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font size")
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontSize() {
    return fontSize;
  }


  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  public DocxStyle fontFamily(String fontFamily) {
    
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font family
   * @return fontFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Font family")
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontFamily() {
    return fontFamily;
  }


  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocxStyle docxStyle = (DocxStyle) o;
    return Objects.equals(this.styleID, docxStyle.styleID) &&
        Objects.equals(this.path, docxStyle.path) &&
        Objects.equals(this.bold, docxStyle.bold) &&
        Objects.equals(this.italic, docxStyle.italic) &&
        Objects.equals(this.underline, docxStyle.underline) &&
        Objects.equals(this.fontSize, docxStyle.fontSize) &&
        Objects.equals(this.fontFamily, docxStyle.fontFamily);
  }

  @Override
  public int hashCode() {
    return Objects.hash(styleID, path, bold, italic, underline, fontSize, fontFamily);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocxStyle {\n");
    sb.append("    styleID: ").append(toIndentedString(styleID)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
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

