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
import com.cloudmersive.client.gac.model.HttpOrchestrationTask;
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
 * HTTP Orchestration request
 */
@ApiModel(description = "HTTP Orchestration request")
@JsonPropertyOrder({
  HttpOrchestrationRequest.JSON_PROPERTY_HTTP_TASKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:15.810531700-07:00[America/Los_Angeles]")
public class HttpOrchestrationRequest {
  public static final String JSON_PROPERTY_HTTP_TASKS = "HttpTasks";
  private List<HttpOrchestrationTask> httpTasks = null;

  public HttpOrchestrationRequest() { 
  }

  public HttpOrchestrationRequest httpTasks(List<HttpOrchestrationTask> httpTasks) {
    
    this.httpTasks = httpTasks;
    return this;
  }

  public HttpOrchestrationRequest addHttpTasksItem(HttpOrchestrationTask httpTasksItem) {
    if (this.httpTasks == null) {
      this.httpTasks = new ArrayList<>();
    }
    this.httpTasks.add(httpTasksItem);
    return this;
  }

   /**
   * Tasks to perform, in the order you wish to perform them
   * @return httpTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tasks to perform, in the order you wish to perform them")
  @JsonProperty(JSON_PROPERTY_HTTP_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpOrchestrationTask> getHttpTasks() {
    return httpTasks;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpTasks(List<HttpOrchestrationTask> httpTasks) {
    this.httpTasks = httpTasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpOrchestrationRequest httpOrchestrationRequest = (HttpOrchestrationRequest) o;
    return Objects.equals(this.httpTasks, httpOrchestrationRequest.httpTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationRequest {\n");
    sb.append("    httpTasks: ").append(toIndentedString(httpTasks)).append("\n");
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

