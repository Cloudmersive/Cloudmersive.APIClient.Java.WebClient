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
import com.cloudmersive.client.gac.model.PdfFormField;
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
 * Result of retrieving PDF form fields
 */
@ApiModel(description = "Result of retrieving PDF form fields")
@JsonPropertyOrder({
  PdfFormFields.JSON_PROPERTY_SUCCESSFUL,
  PdfFormFields.JSON_PROPERTY_FORM_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class PdfFormFields {
  public static final String JSON_PROPERTY_SUCCESSFUL = "Successful";
  private Boolean successful;

  public static final String JSON_PROPERTY_FORM_FIELDS = "FormFields";
  private List<PdfFormField> formFields = null;

  public PdfFormFields() { 
  }

  public PdfFormFields successful(Boolean successful) {
    
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


  public PdfFormFields formFields(List<PdfFormField> formFields) {
    
    this.formFields = formFields;
    return this;
  }

  public PdfFormFields addFormFieldsItem(PdfFormField formFieldsItem) {
    if (this.formFields == null) {
      this.formFields = new ArrayList<>();
    }
    this.formFields.add(formFieldsItem);
    return this;
  }

   /**
   * Fields and field values found in the form
   * @return formFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fields and field values found in the form")
  @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PdfFormField> getFormFields() {
    return formFields;
  }


  @JsonProperty(JSON_PROPERTY_FORM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormFields(List<PdfFormField> formFields) {
    this.formFields = formFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFormFields pdfFormFields = (PdfFormFields) o;
    return Objects.equals(this.successful, pdfFormFields.successful) &&
        Objects.equals(this.formFields, pdfFormFields.formFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, formFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFormFields {\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    formFields: ").append(toIndentedString(formFields)).append("\n");
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

