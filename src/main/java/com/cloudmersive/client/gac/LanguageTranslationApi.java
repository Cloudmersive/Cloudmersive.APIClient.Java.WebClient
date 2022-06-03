package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.LanguageTranslationRequest;
import com.cloudmersive.client.gac.model.LanguageTranslationResponse;

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
public class LanguageTranslationApi {
    private ApiClient apiClient;

    public LanguageTranslationApi() {
        this(new ApiClient());
    }

    @Autowired
    public LanguageTranslationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Translate German to English text with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateDeuToEngRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateDeuToEng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/deu/to/eng", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate German to English text with Deep Learning AI
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateDeuToEng(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateDeuToEngRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateDeuToEngWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateDeuToEngRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Translate English to German text with Deep Learning AI
     * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateEngToDeuRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToDeu", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/deu", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate English to German text with Deep Learning AI
     * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateEngToDeu(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToDeuRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateEngToDeuWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToDeuRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Translate English to French text with Deep Learning AI
     * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateEngToFraRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToFra", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/fra", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate English to French text with Deep Learning AI
     * Automatically translates input text in English to output text in French using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateEngToFra(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToFraRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateEngToFraWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToFraRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Translate English to Russian text with Deep Learning AI
     * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateEngToRusRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateEngToRus", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/eng/to/rus", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate English to Russian text with Deep Learning AI
     * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateEngToRus(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToRusRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateEngToRusWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateEngToRusRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Translate French to English text with Deep Learning AI
     * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateFraToEngRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateFraToEng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/fra/to/eng", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate French to English text with Deep Learning AI
     * Automatically translates input text in French to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateFraToEng(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateFraToEngRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateFraToEngWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateFraToEngRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Translate Russian to English text with Deep Learning AI
     * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec languageTranslationTranslateRusToEngRequestCreation(LanguageTranslationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling languageTranslationTranslateRusToEng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/translate/language/rus/to/eng", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Translate Russian to English text with Deep Learning AI
     * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     * <p><b>200</b> - OK
     * @param input Input translation request
     * @return LanguageTranslationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LanguageTranslationResponse> languageTranslationTranslateRusToEng(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateRusToEngRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LanguageTranslationResponse>> languageTranslationTranslateRusToEngWithHttpInfo(LanguageTranslationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LanguageTranslationResponse> localVarReturnType = new ParameterizedTypeReference<LanguageTranslationResponse>() {};
        return languageTranslationTranslateRusToEngRequestCreation(input).toEntity(localVarReturnType);
    }
}
