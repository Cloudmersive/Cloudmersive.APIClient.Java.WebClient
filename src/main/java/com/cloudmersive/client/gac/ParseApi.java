package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.ParseRequest;
import com.cloudmersive.client.gac.model.ParseResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:52.799943-07:00[America/Los_Angeles]")
public class ParseApi {
    private ApiClient apiClient;

    public ParseApi() {
        this(new ApiClient());
    }

    @Autowired
    public ParseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Parse string to syntax tree
     * Parses the input string into a Penn Treebank syntax tree
     * <p><b>200</b> - OK
     * @param input Input string
     * @return ParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec parseParseStringRequestCreation(ParseRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling parseParseString", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ParseResponse> localVarReturnType = new ParameterizedTypeReference<ParseResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/parse/tree", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parse string to syntax tree
     * Parses the input string into a Penn Treebank syntax tree
     * <p><b>200</b> - OK
     * @param input Input string
     * @return ParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ParseResponse> parseParseString(ParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ParseResponse> localVarReturnType = new ParameterizedTypeReference<ParseResponse>() {};
        return parseParseStringRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ParseResponse>> parseParseStringWithHttpInfo(ParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ParseResponse> localVarReturnType = new ParameterizedTypeReference<ParseResponse>() {};
        return parseParseStringRequestCreation(input).toEntity(localVarReturnType);
    }
}
