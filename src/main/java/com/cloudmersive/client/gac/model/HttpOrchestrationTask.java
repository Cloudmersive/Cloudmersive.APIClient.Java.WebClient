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
import com.cloudmersive.client.gac.model.HttpFormDataParameter;
import com.cloudmersive.client.gac.model.HttpGetParameter;
import com.cloudmersive.client.gac.model.HttpOrchestrationHeader;
import com.cloudmersive.client.gac.model.HttpRawBinaryParameter;
import com.cloudmersive.client.gac.model.HttpRawTextParameter;
import com.cloudmersive.client.gac.model.HttpWwwFormUrlEncodedParameter;
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
 * HttpOrchestrationTask
 */
@JsonPropertyOrder({
  HttpOrchestrationTask.JSON_PROPERTY_TASK_NAME,
  HttpOrchestrationTask.JSON_PROPERTY_HTTP_METHOD,
  HttpOrchestrationTask.JSON_PROPERTY_U_R_L,
  HttpOrchestrationTask.JSON_PROPERTY_HTTP_HEADERS,
  HttpOrchestrationTask.JSON_PROPERTY_QUERY_PARAMETERS,
  HttpOrchestrationTask.JSON_PROPERTY_FORM_DATA_PARAMETERS,
  HttpOrchestrationTask.JSON_PROPERTY_WWW_FORM_URL_ENCODED_PARAMETERS,
  HttpOrchestrationTask.JSON_PROPERTY_RAW_TEXT_BODY,
  HttpOrchestrationTask.JSON_PROPERTY_RAW_BINARY_BODY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:15.810531700-07:00[America/Los_Angeles]")
public class HttpOrchestrationTask {
  public static final String JSON_PROPERTY_TASK_NAME = "TaskName";
  private String taskName;

  public static final String JSON_PROPERTY_HTTP_METHOD = "HttpMethod";
  private String httpMethod;

  public static final String JSON_PROPERTY_U_R_L = "URL";
  private String URL;

  public static final String JSON_PROPERTY_HTTP_HEADERS = "HttpHeaders";
  private List<HttpOrchestrationHeader> httpHeaders = null;

  public static final String JSON_PROPERTY_QUERY_PARAMETERS = "QueryParameters";
  private List<HttpGetParameter> queryParameters = null;

  public static final String JSON_PROPERTY_FORM_DATA_PARAMETERS = "FormDataParameters";
  private List<HttpFormDataParameter> formDataParameters = null;

  public static final String JSON_PROPERTY_WWW_FORM_URL_ENCODED_PARAMETERS = "WwwFormUrlEncodedParameters";
  private List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters = null;

  public static final String JSON_PROPERTY_RAW_TEXT_BODY = "RawTextBody";
  private HttpRawTextParameter rawTextBody;

  public static final String JSON_PROPERTY_RAW_BINARY_BODY = "RawBinaryBody";
  private HttpRawBinaryParameter rawBinaryBody;

  public HttpOrchestrationTask() { 
  }

  public HttpOrchestrationTask taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * An identifier for this task name, e.g. CreateCustomer or ScanForVirus; allows you to refer to this task from other tasks; if not supplied, it will default to a 0-based integer index of the task
   * @return taskName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier for this task name, e.g. CreateCustomer or ScanForVirus; allows you to refer to this task from other tasks; if not supplied, it will default to a 0-based integer index of the task")
  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskName() {
    return taskName;
  }


  @JsonProperty(JSON_PROPERTY_TASK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public HttpOrchestrationTask httpMethod(String httpMethod) {
    
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * HTTP Method, e.g. GET, PUT, POST, etc.
   * @return httpMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP Method, e.g. GET, PUT, POST, etc.")
  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHttpMethod() {
    return httpMethod;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  public HttpOrchestrationTask URL(String URL) {
    
    this.URL = URL;
    return this;
  }

   /**
   * HTTP URL to orchestrate
   * @return URL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP URL to orchestrate")
  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getURL() {
    return URL;
  }


  @JsonProperty(JSON_PROPERTY_U_R_L)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setURL(String URL) {
    this.URL = URL;
  }


  public HttpOrchestrationTask httpHeaders(List<HttpOrchestrationHeader> httpHeaders) {
    
    this.httpHeaders = httpHeaders;
    return this;
  }

  public HttpOrchestrationTask addHttpHeadersItem(HttpOrchestrationHeader httpHeadersItem) {
    if (this.httpHeaders == null) {
      this.httpHeaders = new ArrayList<>();
    }
    this.httpHeaders.add(httpHeadersItem);
    return this;
  }

   /**
   * Optional; HTTP headers to apply to the request
   * @return httpHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; HTTP headers to apply to the request")
  @JsonProperty(JSON_PROPERTY_HTTP_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpOrchestrationHeader> getHttpHeaders() {
    return httpHeaders;
  }


  @JsonProperty(JSON_PROPERTY_HTTP_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHttpHeaders(List<HttpOrchestrationHeader> httpHeaders) {
    this.httpHeaders = httpHeaders;
  }


  public HttpOrchestrationTask queryParameters(List<HttpGetParameter> queryParameters) {
    
    this.queryParameters = queryParameters;
    return this;
  }

  public HttpOrchestrationTask addQueryParametersItem(HttpGetParameter queryParametersItem) {
    if (this.queryParameters == null) {
      this.queryParameters = new ArrayList<>();
    }
    this.queryParameters.add(queryParametersItem);
    return this;
  }

   /**
   * Optional; query parameters, these query parameters will be incorporated into the URL
   * @return queryParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; query parameters, these query parameters will be incorporated into the URL")
  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpGetParameter> getQueryParameters() {
    return queryParameters;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryParameters(List<HttpGetParameter> queryParameters) {
    this.queryParameters = queryParameters;
  }


  public HttpOrchestrationTask formDataParameters(List<HttpFormDataParameter> formDataParameters) {
    
    this.formDataParameters = formDataParameters;
    return this;
  }

  public HttpOrchestrationTask addFormDataParametersItem(HttpFormDataParameter formDataParametersItem) {
    if (this.formDataParameters == null) {
      this.formDataParameters = new ArrayList<>();
    }
    this.formDataParameters.add(formDataParametersItem);
    return this;
  }

   /**
   * Optional; FormData parameters, these parameters will be stored in the body in a multi-part encoding
   * @return formDataParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; FormData parameters, these parameters will be stored in the body in a multi-part encoding")
  @JsonProperty(JSON_PROPERTY_FORM_DATA_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpFormDataParameter> getFormDataParameters() {
    return formDataParameters;
  }


  @JsonProperty(JSON_PROPERTY_FORM_DATA_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormDataParameters(List<HttpFormDataParameter> formDataParameters) {
    this.formDataParameters = formDataParameters;
  }


  public HttpOrchestrationTask wwwFormUrlEncodedParameters(List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters) {
    
    this.wwwFormUrlEncodedParameters = wwwFormUrlEncodedParameters;
    return this;
  }

  public HttpOrchestrationTask addWwwFormUrlEncodedParametersItem(HttpWwwFormUrlEncodedParameter wwwFormUrlEncodedParametersItem) {
    if (this.wwwFormUrlEncodedParameters == null) {
      this.wwwFormUrlEncodedParameters = new ArrayList<>();
    }
    this.wwwFormUrlEncodedParameters.add(wwwFormUrlEncodedParametersItem);
    return this;
  }

   /**
   * Optional; x-www-form-urlencoded paramereters, these parameters will be stored in the body as an application/x-www-form-urlencoded encoding
   * @return wwwFormUrlEncodedParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional; x-www-form-urlencoded paramereters, these parameters will be stored in the body as an application/x-www-form-urlencoded encoding")
  @JsonProperty(JSON_PROPERTY_WWW_FORM_URL_ENCODED_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<HttpWwwFormUrlEncodedParameter> getWwwFormUrlEncodedParameters() {
    return wwwFormUrlEncodedParameters;
  }


  @JsonProperty(JSON_PROPERTY_WWW_FORM_URL_ENCODED_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwwFormUrlEncodedParameters(List<HttpWwwFormUrlEncodedParameter> wwwFormUrlEncodedParameters) {
    this.wwwFormUrlEncodedParameters = wwwFormUrlEncodedParameters;
  }


  public HttpOrchestrationTask rawTextBody(HttpRawTextParameter rawTextBody) {
    
    this.rawTextBody = rawTextBody;
    return this;
  }

   /**
   * Get rawTextBody
   * @return rawTextBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAW_TEXT_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpRawTextParameter getRawTextBody() {
    return rawTextBody;
  }


  @JsonProperty(JSON_PROPERTY_RAW_TEXT_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawTextBody(HttpRawTextParameter rawTextBody) {
    this.rawTextBody = rawTextBody;
  }


  public HttpOrchestrationTask rawBinaryBody(HttpRawBinaryParameter rawBinaryBody) {
    
    this.rawBinaryBody = rawBinaryBody;
    return this;
  }

   /**
   * Get rawBinaryBody
   * @return rawBinaryBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RAW_BINARY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public HttpRawBinaryParameter getRawBinaryBody() {
    return rawBinaryBody;
  }


  @JsonProperty(JSON_PROPERTY_RAW_BINARY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawBinaryBody(HttpRawBinaryParameter rawBinaryBody) {
    this.rawBinaryBody = rawBinaryBody;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpOrchestrationTask httpOrchestrationTask = (HttpOrchestrationTask) o;
    return Objects.equals(this.taskName, httpOrchestrationTask.taskName) &&
        Objects.equals(this.httpMethod, httpOrchestrationTask.httpMethod) &&
        Objects.equals(this.URL, httpOrchestrationTask.URL) &&
        Objects.equals(this.httpHeaders, httpOrchestrationTask.httpHeaders) &&
        Objects.equals(this.queryParameters, httpOrchestrationTask.queryParameters) &&
        Objects.equals(this.formDataParameters, httpOrchestrationTask.formDataParameters) &&
        Objects.equals(this.wwwFormUrlEncodedParameters, httpOrchestrationTask.wwwFormUrlEncodedParameters) &&
        Objects.equals(this.rawTextBody, httpOrchestrationTask.rawTextBody) &&
        Objects.equals(this.rawBinaryBody, httpOrchestrationTask.rawBinaryBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskName, httpMethod, URL, httpHeaders, queryParameters, formDataParameters, wwwFormUrlEncodedParameters, rawTextBody, rawBinaryBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpOrchestrationTask {\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    httpHeaders: ").append(toIndentedString(httpHeaders)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    formDataParameters: ").append(toIndentedString(formDataParameters)).append("\n");
    sb.append("    wwwFormUrlEncodedParameters: ").append(toIndentedString(wwwFormUrlEncodedParameters)).append("\n");
    sb.append("    rawTextBody: ").append(toIndentedString(rawTextBody)).append("\n");
    sb.append("    rawBinaryBody: ").append(toIndentedString(rawBinaryBody)).append("\n");
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

