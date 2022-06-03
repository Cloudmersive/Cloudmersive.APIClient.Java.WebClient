package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.HateSpeechAnalysisRequest;
import com.cloudmersive.client.gac.model.HateSpeechAnalysisResponse;
import com.cloudmersive.client.gac.model.ProfanityAnalysisRequest;
import com.cloudmersive.client.gac.model.ProfanityAnalysisResponse;
import com.cloudmersive.client.gac.model.SentimentAnalysisRequest;
import com.cloudmersive.client.gac.model.SentimentAnalysisResponse;
import com.cloudmersive.client.gac.model.SimilarityAnalysisRequest;
import com.cloudmersive.client.gac.model.SimilarityAnalysisResponse;
import com.cloudmersive.client.gac.model.SubjectivityAnalysisRequest;
import com.cloudmersive.client.gac.model.SubjectivityAnalysisResponse;

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
public class AnalyticsApi {
    private ApiClient apiClient;

    public AnalyticsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Perform Hate Speech Analysis and Detection on Text
     * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input hate speech analysis request
     * @return HateSpeechAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec analyticsHateSpeechRequestCreation(HateSpeechAnalysisRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling analyticsHateSpeech", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HateSpeechAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<HateSpeechAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/hate-speech", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform Hate Speech Analysis and Detection on Text
     * Analyze input text using advanced Hate Speech Analysis to determine if the input contains hate speech language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input hate speech analysis request
     * @return HateSpeechAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HateSpeechAnalysisResponse> analyticsHateSpeech(HateSpeechAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<HateSpeechAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<HateSpeechAnalysisResponse>() {};
        return analyticsHateSpeechRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HateSpeechAnalysisResponse>> analyticsHateSpeechWithHttpInfo(HateSpeechAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<HateSpeechAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<HateSpeechAnalysisResponse>() {};
        return analyticsHateSpeechRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Perform Profanity and Obscene Language Analysis and Detection on Text
     * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input profanity analysis request
     * @return ProfanityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec analyticsProfanityRequestCreation(ProfanityAnalysisRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling analyticsProfanity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ProfanityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<ProfanityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/profanity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform Profanity and Obscene Language Analysis and Detection on Text
     * Analyze input text using advanced Profanity and Obscene Language Analysis to determine if the input contains profane language.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input profanity analysis request
     * @return ProfanityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProfanityAnalysisResponse> analyticsProfanity(ProfanityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ProfanityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<ProfanityAnalysisResponse>() {};
        return analyticsProfanityRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ProfanityAnalysisResponse>> analyticsProfanityWithHttpInfo(ProfanityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ProfanityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<ProfanityAnalysisResponse>() {};
        return analyticsProfanityRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Perform Sentiment Analysis and Classification on Text
     * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input sentiment analysis request
     * @return SentimentAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec analyticsSentimentRequestCreation(SentimentAnalysisRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling analyticsSentiment", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SentimentAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SentimentAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/sentiment", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform Sentiment Analysis and Classification on Text
     * Analyze input text using advanced Sentiment Analysis to determine if the input is positive, negative, or neutral.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input sentiment analysis request
     * @return SentimentAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SentimentAnalysisResponse> analyticsSentiment(SentimentAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SentimentAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SentimentAnalysisResponse>() {};
        return analyticsSentimentRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SentimentAnalysisResponse>> analyticsSentimentWithHttpInfo(SentimentAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SentimentAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SentimentAnalysisResponse>() {};
        return analyticsSentimentRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Perform Semantic Similarity Comparison of Two Strings
     * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input similarity analysis request
     * @return SimilarityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec analyticsSimilarityRequestCreation(SimilarityAnalysisRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling analyticsSimilarity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SimilarityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SimilarityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/similarity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform Semantic Similarity Comparison of Two Strings
     * Analyze two input text strings, typically sentences, and determine the semantic similarity of each.  Semantic similarity refers to the degree to which two sentences mean the same thing semantically.  Uses advanced Deep Learning to perform the semantic similarity comparison.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input similarity analysis request
     * @return SimilarityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SimilarityAnalysisResponse> analyticsSimilarity(SimilarityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SimilarityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SimilarityAnalysisResponse>() {};
        return analyticsSimilarityRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SimilarityAnalysisResponse>> analyticsSimilarityWithHttpInfo(SimilarityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SimilarityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SimilarityAnalysisResponse>() {};
        return analyticsSimilarityRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Perform Subjectivity and Objectivity Analysis on Text
     * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input subjectivity analysis request
     * @return SubjectivityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec analyticsSubjectivityRequestCreation(SubjectivityAnalysisRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling analyticsSubjectivity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SubjectivityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SubjectivityAnalysisResponse>() {};
        return apiClient.invokeAPI("/nlp-v2/analytics/subjectivity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform Subjectivity and Objectivity Analysis on Text
     * Analyze input text using advanced Subjectivity and Objectivity Language Analysis to determine if the input text is objective or subjective, and how much.  Supports English language input.  Consumes 1-2 API calls per sentence.
     * <p><b>200</b> - OK
     * @param input Input subjectivity analysis request
     * @return SubjectivityAnalysisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SubjectivityAnalysisResponse> analyticsSubjectivity(SubjectivityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SubjectivityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SubjectivityAnalysisResponse>() {};
        return analyticsSubjectivityRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SubjectivityAnalysisResponse>> analyticsSubjectivityWithHttpInfo(SubjectivityAnalysisRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SubjectivityAnalysisResponse> localVarReturnType = new ParameterizedTypeReference<SubjectivityAnalysisResponse>() {};
        return analyticsSubjectivityRequestCreation(input).toEntity(localVarReturnType);
    }
}
