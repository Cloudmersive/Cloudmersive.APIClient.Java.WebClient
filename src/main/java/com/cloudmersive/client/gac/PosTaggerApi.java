package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.PosRequest;
import com.cloudmersive.client.gac.model.PosResponse;

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
public class PosTaggerApi {
    private ApiClient apiClient;

    public PosTaggerApi() {
        this(new ApiClient());
    }

    @Autowired
    public PosTaggerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Part-of-speech tag a string, filter to adjectives
     * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagAdjectivesRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagAdjectives", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/adjectives", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string, filter to adjectives
     * Part-of-speech (POS) tag a string, find the adjectives, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagAdjectives(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagAdjectivesRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagAdjectivesWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagAdjectivesRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Part-of-speech tag a string, filter to adverbs
     * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagAdverbsRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagAdverbs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/adverbs", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string, filter to adverbs
     * Part-of-speech (POS) tag a string, find the adverbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagAdverbs(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagAdverbsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagAdverbsWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagAdverbsRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Part-of-speech tag a string, filter to nouns
     * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagNounsRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagNouns", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/nouns", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string, filter to nouns
     * Part-of-speech (POS) tag a string, find the nouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagNouns(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagNounsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagNounsWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagNounsRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Part-of-speech tag a string, filter to pronouns
     * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagPronounsRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagPronouns", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/pronouns", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string, filter to pronouns
     * Part-of-speech (POS) tag a string, find the pronouns, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagPronouns(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagPronounsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagPronounsWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagPronounsRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Part-of-speech tag a string
     * Part-of-speech (POS) tag a string and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagSentenceRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagSentence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/sentence", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string
     * Part-of-speech (POS) tag a string and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagSentence(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagSentenceRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagSentenceWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagSentenceRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Part-of-speech tag a string, filter to verbs
     * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec posTaggerTagVerbsRequestCreation(PosRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling posTaggerTagVerbs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/pos/tag/verbs", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Part-of-speech tag a string, filter to verbs
     * Part-of-speech (POS) tag a string, find the verbs, and return result as JSON
     * <p><b>200</b> - OK
     * @param request Input string
     * @return PosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PosResponse> posTaggerTagVerbs(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagVerbsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PosResponse>> posTaggerTagVerbsWithHttpInfo(PosRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PosResponse> localVarReturnType = new ParameterizedTypeReference<PosResponse>() {};
        return posTaggerTagVerbsRequestCreation(request).toEntity(localVarReturnType);
    }
}
