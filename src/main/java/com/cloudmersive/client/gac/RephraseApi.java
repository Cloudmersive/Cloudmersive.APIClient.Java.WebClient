package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.RephraseRequest;
import com.cloudmersive.client.gac.model.RephraseResponse;

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
public class RephraseApi {
    private ApiClient apiClient;

    public RephraseApi() {
        this(new ApiClient());
    }

    @Autowired
    public RephraseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI
     * Automatically rephrases or paraphrases input text in English sentence by sentence using advanced Deep Learning and Neural NLP.  Creates multiple reprhasing candidates per input sentence, from 1 to 10 possible rephrasings of the original sentence.  Seeks to preserve original semantic meaning in rephrased output candidates.  Consumes 1-2 API calls per output rephrasing option generated, per sentence.
     * <p><b>200</b> - OK
     * @param input Input rephrase request
     * @return RephraseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec rephraseEnglishRephraseSentenceBySentenceRequestCreation(RephraseRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling rephraseEnglishRephraseSentenceBySentence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RephraseResponse> localVarReturnType = new ParameterizedTypeReference<RephraseResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/rephrase/rephrase/eng/by-sentence", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rephrase, paraphrase English text sentence-by-sentence using Deep Learning AI
     * Automatically rephrases or paraphrases input text in English sentence by sentence using advanced Deep Learning and Neural NLP.  Creates multiple reprhasing candidates per input sentence, from 1 to 10 possible rephrasings of the original sentence.  Seeks to preserve original semantic meaning in rephrased output candidates.  Consumes 1-2 API calls per output rephrasing option generated, per sentence.
     * <p><b>200</b> - OK
     * @param input Input rephrase request
     * @return RephraseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RephraseResponse> rephraseEnglishRephraseSentenceBySentence(RephraseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<RephraseResponse> localVarReturnType = new ParameterizedTypeReference<RephraseResponse>() {};
        return rephraseEnglishRephraseSentenceBySentenceRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RephraseResponse>> rephraseEnglishRephraseSentenceBySentenceWithHttpInfo(RephraseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<RephraseResponse> localVarReturnType = new ParameterizedTypeReference<RephraseResponse>() {};
        return rephraseEnglishRephraseSentenceBySentenceRequestCreation(input).toEntity(localVarReturnType);
    }
}
