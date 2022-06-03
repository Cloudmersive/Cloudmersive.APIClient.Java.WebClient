package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CheckSentenceRequest;
import com.cloudmersive.client.gac.model.CheckSentenceResponse;
import com.cloudmersive.client.gac.model.CheckWordRequest;
import com.cloudmersive.client.gac.model.CheckWordResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:36.056137200-07:00[America/Los_Angeles]")
public class SpellcheckApi {
    private ApiClient apiClient;

    public SpellcheckApi() {
        this(new ApiClient());
    }

    @Autowired
    public SpellcheckApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * <p><b>200</b> - OK
     * @param value Input sentence
     * @return CheckSentenceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec spellcheckCheckSentenceRequestCreation(CheckSentenceRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling spellcheckCheckSentence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CheckSentenceResponse> localVarReturnType = new ParameterizedTypeReference<CheckSentenceResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/spellcheck/check/sentence", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if sentence is spelled correctly
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     * <p><b>200</b> - OK
     * @param value Input sentence
     * @return CheckSentenceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CheckSentenceResponse> spellcheckCheckSentence(CheckSentenceRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<CheckSentenceResponse> localVarReturnType = new ParameterizedTypeReference<CheckSentenceResponse>() {};
        return spellcheckCheckSentenceRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CheckSentenceResponse>> spellcheckCheckSentenceWithHttpInfo(CheckSentenceRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<CheckSentenceResponse> localVarReturnType = new ParameterizedTypeReference<CheckSentenceResponse>() {};
        return spellcheckCheckSentenceRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * <p><b>200</b> - OK
     * @param value Input string
     * @return CheckWordResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec spellcheckCorrectJsonRequestCreation(CheckWordRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling spellcheckCorrectJson", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CheckWordResponse> localVarReturnType = new ParameterizedTypeReference<CheckWordResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/spellcheck/check/word", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find spelling corrections
     * Find spelling correction suggestions and return result as JSON
     * <p><b>200</b> - OK
     * @param value Input string
     * @return CheckWordResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CheckWordResponse> spellcheckCorrectJson(CheckWordRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<CheckWordResponse> localVarReturnType = new ParameterizedTypeReference<CheckWordResponse>() {};
        return spellcheckCorrectJsonRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CheckWordResponse>> spellcheckCorrectJsonWithHttpInfo(CheckWordRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<CheckWordResponse> localVarReturnType = new ParameterizedTypeReference<CheckWordResponse>() {};
        return spellcheckCorrectJsonRequestCreation(value).toEntity(localVarReturnType);
    }
}
