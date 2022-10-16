/*
 * configapi
 * Config API lets you easily manage configuration at scale.
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
import com.cloudmersive.client.gac.model.TaskOutputReference;
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
 * Raw text parameter that defines the entire body of the HTTP payload; cannot be used with other parameter types
 */
@ApiModel(description = "Raw text parameter that defines the entire body of the HTTP payload; cannot be used with other parameter types")
@JsonPropertyOrder({
  HttpRawTextParameter.JSON_PROPERTY_PARAMETER_VALUE,
  HttpRawTextParameter.JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:15.810531700-07:00[America/Los_Angeles]")
public class HttpRawTextParameter {
  public static final String JSON_PROPERTY_PARAMETER_VALUE = "ParameterValue";
  private String parameterValue;

  public static final String JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK = "UseOutputFromPreviousTask";
  private TaskOutputReference useOutputFromPreviousTask;

  public HttpRawTextParameter() { 
  }

  public HttpRawTextParameter parameterValue(String parameterValue) {
    
    this.parameterValue = parameterValue;
    return this;
  }

   /**
   * Text value of the parameter
   * @return parameterValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text value of the parameter")
  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameterValue() {
    return parameterValue;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterValue(String parameterValue) {
    this.parameterValue = parameterValue;
  }


  public HttpRawTextParameter useOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
    return this;
  }

   /**
   * Get useOutputFromPreviousTask
   * @return useOutputFromPreviousTask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOutputReference getUseOutputFromPreviousTask() {
    return useOutputFromPreviousTask;
  }


  @JsonProperty(JSON_PROPERTY_USE_OUTPUT_FROM_PREVIOUS_TASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseOutputFromPreviousTask(TaskOutputReference useOutputFromPreviousTask) {
    this.useOutputFromPreviousTask = useOutputFromPreviousTask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpRawTextParameter httpRawTextParameter = (HttpRawTextParameter) o;
    return Objects.equals(this.parameterValue, httpRawTextParameter.parameterValue) &&
        Objects.equals(this.useOutputFromPreviousTask, httpRawTextParameter.useOutputFromPreviousTask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterValue, useOutputFromPreviousTask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpRawTextParameter {\n");
    sb.append("    parameterValue: ").append(toIndentedString(parameterValue)).append("\n");
    sb.append("    useOutputFromPreviousTask: ").append(toIndentedString(useOutputFromPreviousTask)).append("\n");
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

