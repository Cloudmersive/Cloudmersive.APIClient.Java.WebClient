package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.GetWordsRequest;
import com.cloudmersive.client.gac.model.GetWordsResponse;
import com.cloudmersive.client.gac.model.SentenceSegmentationRequest;
import com.cloudmersive.client.gac.model.SentenceSegmentationResponse;

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
public class SegmentationApi {
    private ApiClient apiClient;

    public SegmentationApi() {
        this(new ApiClient());
    }

    @Autowired
    public SegmentationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Extract sentences from string
     * Segment an input string into separate sentences, output result as a string.
     * <p><b>200</b> - OK
     * @param input Input string
     * @return SentenceSegmentationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec segmentationGetSentencesRequestCreation(SentenceSegmentationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling segmentationGetSentences", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SentenceSegmentationResponse> localVarReturnType = new ParameterizedTypeReference<SentenceSegmentationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/segmentation/sentences", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Extract sentences from string
     * Segment an input string into separate sentences, output result as a string.
     * <p><b>200</b> - OK
     * @param input Input string
     * @return SentenceSegmentationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SentenceSegmentationResponse> segmentationGetSentences(SentenceSegmentationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SentenceSegmentationResponse> localVarReturnType = new ParameterizedTypeReference<SentenceSegmentationResponse>() {};
        return segmentationGetSentencesRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SentenceSegmentationResponse>> segmentationGetSentencesWithHttpInfo(SentenceSegmentationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SentenceSegmentationResponse> localVarReturnType = new ParameterizedTypeReference<SentenceSegmentationResponse>() {};
        return segmentationGetSentencesRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get words in input string
     * Get the component words in an input string
     * <p><b>200</b> - OK
     * @param input String to process
     * @return GetWordsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec segmentationGetWordsRequestCreation(GetWordsRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling segmentationGetWords", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetWordsResponse> localVarReturnType = new ParameterizedTypeReference<GetWordsResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/segmentation/words", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get words in input string
     * Get the component words in an input string
     * <p><b>200</b> - OK
     * @param input String to process
     * @return GetWordsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetWordsResponse> segmentationGetWords(GetWordsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetWordsResponse> localVarReturnType = new ParameterizedTypeReference<GetWordsResponse>() {};
        return segmentationGetWordsRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetWordsResponse>> segmentationGetWordsWithHttpInfo(GetWordsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetWordsResponse> localVarReturnType = new ParameterizedTypeReference<GetWordsResponse>() {};
        return segmentationGetWordsRequestCreation(input).toEntity(localVarReturnType);
    }
}
