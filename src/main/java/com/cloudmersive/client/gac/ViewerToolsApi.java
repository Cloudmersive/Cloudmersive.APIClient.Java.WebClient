package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.ViewerResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class ViewerToolsApi {
    private ApiClient apiClient;

    public ViewerToolsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ViewerToolsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param width Optional; width of the output viewer in pixels
     * @param height Optional; height of the output viewer in pixels
     * @return ViewerResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec viewerToolsCreateSimpleRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer width, Integer height) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling viewerToolsCreateSimple", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (width != null)
        headerParams.add("width", apiClient.parameterToString(width));
        if (height != null)
        headerParams.add("height", apiClient.parameterToString(height));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ViewerResponse> localVarReturnType = new ParameterizedTypeReference<ViewerResponse>() {};
        return apiClient.invokeAPI("/convert/viewer/create/web/simple", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a web-based viewer
     * Creates an HTML embed code for a simple web-based viewer of a document; supports Office document types and PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param width Optional; width of the output viewer in pixels
     * @param height Optional; height of the output viewer in pixels
     * @return ViewerResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ViewerResponse> viewerToolsCreateSimple(org.springframework.core.io.AbstractResource inputFile, Integer width, Integer height) throws WebClientResponseException {
        ParameterizedTypeReference<ViewerResponse> localVarReturnType = new ParameterizedTypeReference<ViewerResponse>() {};
        return viewerToolsCreateSimpleRequestCreation(inputFile, width, height).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ViewerResponse>> viewerToolsCreateSimpleWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer width, Integer height) throws WebClientResponseException {
        ParameterizedTypeReference<ViewerResponse> localVarReturnType = new ParameterizedTypeReference<ViewerResponse>() {};
        return viewerToolsCreateSimpleRequestCreation(inputFile, width, height).toEntity(localVarReturnType);
    }
}
