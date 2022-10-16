package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.LanguageDetectionRequest;
import com.cloudmersive.client.gac.model.LanguageDetectionResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:07.449581100-07:00[America/Los_Angeles]")
public class LanguageDetectionApi {
    private ApiClient apiClient;

    public LanguageDetectionApi() {
        this(new ApiClient());
    }

    @Autowired
    public LanguageDetectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Detect language of text
     * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return LanguageDetectionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageDetectionGetLanguageRequestCreation(LanguageDetectionRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageDetectionGetLanguage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageDetectionResponse> localVarReturnType = new ParameterizedTypeReference<LanguageDetectionResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/language/detect", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect language of text
     * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return LanguageDetectionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageDetectionResponse> languageDetectionGetLanguage(LanguageDetectionRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageDetectionResponse> localVarReturnType = new ParameterizedTypeReference<LanguageDetectionResponse>() {};
        return languageDetectionGetLanguageRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageDetectionResponse>> languageDetectionGetLanguageWithHttpInfo(LanguageDetectionRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageDetectionResponse> localVarReturnType = new ParameterizedTypeReference<LanguageDetectionResponse>() {};
        return languageDetectionGetLanguageRequestCreation(input).toEntity(localVarReturnType);
    }
}
