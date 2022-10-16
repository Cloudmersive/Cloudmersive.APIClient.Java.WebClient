package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class CompareDocumentApi {
    private ApiClient apiClient;

    public CompareDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public CompareDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Compare Two Word DOCX
     * Compare two Office Word Documents (docx) files and highlight the differences
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec compareDocumentDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling compareDocumentDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling compareDocumentDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/compare/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compare Two Word DOCX
     * Compare two Office Word Documents (docx) files and highlight the differences
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> compareDocumentDocx(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return compareDocumentDocxRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> compareDocumentDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return compareDocumentDocxRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
}
