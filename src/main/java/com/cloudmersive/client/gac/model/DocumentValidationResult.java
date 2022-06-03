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
import com.cloudmersive.client.gac.model.DocumentValidationError;
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
 * Document validation result
 */
@ApiModel(description = "Document validation result")
@JsonPropertyOrder({
  DocumentValidationResult.JSON_PROPERTY_DOCUMENT_IS_VALID,
  DocumentValidationResult.JSON_PROPERTY_PASSWORD_PROTECTED,
  DocumentValidationResult.JSON_PROPERTY_ERROR_COUNT,
  DocumentValidationResult.JSON_PROPERTY_WARNING_COUNT,
  DocumentValidationResult.JSON_PROPERTY_ERRORS_AND_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class DocumentValidationResult {
  public static final String JSON_PROPERTY_DOCUMENT_IS_VALID = "DocumentIsValid";
  private Boolean documentIsValid;

  public static final String JSON_PROPERTY_PASSWORD_PROTECTED = "PasswordProtected";
  private Boolean passwordProtected;

  public static final String JSON_PROPERTY_ERROR_COUNT = "ErrorCount";
  private Integer errorCount;

  public static final String JSON_PROPERTY_WARNING_COUNT = "WarningCount";
  private Integer warningCount;

  public static final String JSON_PROPERTY_ERRORS_AND_WARNINGS = "ErrorsAndWarnings";
  private List<DocumentValidationError> errorsAndWarnings = null;

  public DocumentValidationResult() { 
  }

  public DocumentValidationResult documentIsValid(Boolean documentIsValid) {
    
    this.documentIsValid = documentIsValid;
    return this;
  }

   /**
   * True if the document is valid and has no errors, false otherwise
   * @return documentIsValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the document is valid and has no errors, false otherwise")
  @JsonProperty(JSON_PROPERTY_DOCUMENT_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDocumentIsValid() {
    return documentIsValid;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENT_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentIsValid(Boolean documentIsValid) {
    this.documentIsValid = documentIsValid;
  }


  public DocumentValidationResult passwordProtected(Boolean passwordProtected) {
    
    this.passwordProtected = passwordProtected;
    return this;
  }

   /**
   * True if the document is password protected, false otherwise
   * @return passwordProtected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the document is password protected, false otherwise")
  @JsonProperty(JSON_PROPERTY_PASSWORD_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPasswordProtected() {
    return passwordProtected;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_PROTECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordProtected(Boolean passwordProtected) {
    this.passwordProtected = passwordProtected;
  }


  public DocumentValidationResult errorCount(Integer errorCount) {
    
    this.errorCount = errorCount;
    return this;
  }

   /**
   * Number of validation errors found in the document
   * @return errorCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of validation errors found in the document")
  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getErrorCount() {
    return errorCount;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }


  public DocumentValidationResult warningCount(Integer warningCount) {
    
    this.warningCount = warningCount;
    return this;
  }

   /**
   * Number of validation warnings found in the document
   * @return warningCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of validation warnings found in the document")
  @JsonProperty(JSON_PROPERTY_WARNING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWarningCount() {
    return warningCount;
  }


  @JsonProperty(JSON_PROPERTY_WARNING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarningCount(Integer warningCount) {
    this.warningCount = warningCount;
  }


  public DocumentValidationResult errorsAndWarnings(List<DocumentValidationError> errorsAndWarnings) {
    
    this.errorsAndWarnings = errorsAndWarnings;
    return this;
  }

  public DocumentValidationResult addErrorsAndWarningsItem(DocumentValidationError errorsAndWarningsItem) {
    if (this.errorsAndWarnings == null) {
      this.errorsAndWarnings = new ArrayList<>();
    }
    this.errorsAndWarnings.add(errorsAndWarningsItem);
    return this;
  }

   /**
   * Details of errors and warnings found
   * @return errorsAndWarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of errors and warnings found")
  @JsonProperty(JSON_PROPERTY_ERRORS_AND_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DocumentValidationError> getErrorsAndWarnings() {
    return errorsAndWarnings;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS_AND_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorsAndWarnings(List<DocumentValidationError> errorsAndWarnings) {
    this.errorsAndWarnings = errorsAndWarnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentValidationResult documentValidationResult = (DocumentValidationResult) o;
    return Objects.equals(this.documentIsValid, documentValidationResult.documentIsValid) &&
        Objects.equals(this.passwordProtected, documentValidationResult.passwordProtected) &&
        Objects.equals(this.errorCount, documentValidationResult.errorCount) &&
        Objects.equals(this.warningCount, documentValidationResult.warningCount) &&
        Objects.equals(this.errorsAndWarnings, documentValidationResult.errorsAndWarnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentIsValid, passwordProtected, errorCount, warningCount, errorsAndWarnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentValidationResult {\n");
    sb.append("    documentIsValid: ").append(toIndentedString(documentIsValid)).append("\n");
    sb.append("    passwordProtected: ").append(toIndentedString(passwordProtected)).append("\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    warningCount: ").append(toIndentedString(warningCount)).append("\n");
    sb.append("    errorsAndWarnings: ").append(toIndentedString(errorsAndWarnings)).append("\n");
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

