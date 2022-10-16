package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.HttpOrchestrationRequest;
import com.cloudmersive.client.gac.model.HttpOrchestrationResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:15.810531700-07:00[America/Los_Angeles]")
public class OrchestratorApi {
    private ApiClient apiClient;

    public OrchestratorApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrchestratorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.
     * 
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return HttpOrchestrationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec orchestratorHttpSimpleRequestCreation(HttpOrchestrationRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling orchestratorHttpSimple", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<HttpOrchestrationResponse> localVarReturnType = new ParameterizedTypeReference<HttpOrchestrationResponse>() {};
        return apiClient.invokeAPI("/config/orchestrator/http/simple", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Orchestrate multiple HTTP API calls with a single API call in the order specified.  Call other Cloudmersive APIs or third party APIs.  For Cloudmersive APIs, the API Key will automatically propogate to the child calls without needing to be set explicitly.  Name each task and reference the output of a previous task in the inputs to a given task.
     * 
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return HttpOrchestrationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HttpOrchestrationResponse> orchestratorHttpSimple(HttpOrchestrationRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<HttpOrchestrationResponse> localVarReturnType = new ParameterizedTypeReference<HttpOrchestrationResponse>() {};
        return orchestratorHttpSimpleRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HttpOrchestrationResponse>> orchestratorHttpSimpleWithHttpInfo(HttpOrchestrationRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<HttpOrchestrationResponse> localVarReturnType = new ParameterizedTypeReference<HttpOrchestrationResponse>() {};
        return orchestratorHttpSimpleRequestCreation(request).toEntity(localVarReturnType);
    }
}
