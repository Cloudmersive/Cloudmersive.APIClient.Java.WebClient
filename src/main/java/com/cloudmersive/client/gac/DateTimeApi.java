package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DateTimeNaturalLanguageParseRequest;
import com.cloudmersive.client.gac.model.DateTimeNowResult;
import com.cloudmersive.client.gac.model.DateTimeStandardizedParseRequest;
import com.cloudmersive.client.gac.model.DateTimeStandardizedParseResponse;
import com.cloudmersive.client.gac.model.GetPublicHolidaysRequest;
import com.cloudmersive.client.gac.model.PublicHolidaysResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:48.638092300-07:00[America/Los_Angeles]")
public class DateTimeApi {
    private ApiClient apiClient;

    public DateTimeApi() {
        this(new ApiClient());
    }

    @Autowired
    public DateTimeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * <p><b>200</b> - OK
     * @return DateTimeNowResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dateTimeGetNowSimpleRequestCreation() throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeNowResult> localVarReturnType = new ParameterizedTypeReference<DateTimeNowResult>() {};
        return apiClient.invokeAPI("/validate/date-time/get/now", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get current date and time as of now
     * Gets the current date and time.  Response time is syncronized with atomic clocks, and represents a monotonic, centrally available, consistent clock.
     * <p><b>200</b> - OK
     * @return DateTimeNowResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DateTimeNowResult> dateTimeGetNowSimple() throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeNowResult> localVarReturnType = new ParameterizedTypeReference<DateTimeNowResult>() {};
        return dateTimeGetNowSimpleRequestCreation().bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DateTimeNowResult>> dateTimeGetNowSimpleWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeNowResult> localVarReturnType = new ParameterizedTypeReference<DateTimeNowResult>() {};
        return dateTimeGetNowSimpleRequestCreation().toEntity(localVarReturnType);
    }
    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return PublicHolidaysResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dateTimeGetPublicHolidaysRequestCreation(GetPublicHolidaysRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling dateTimeGetPublicHolidays", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PublicHolidaysResponse> localVarReturnType = new ParameterizedTypeReference<PublicHolidaysResponse>() {};
        return apiClient.invokeAPI("/validate/date-time/get/holidays", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get public holidays in the specified country and year
     * Enumerates all public holidays in a given country for a given year.  Supports over 100 countries.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return PublicHolidaysResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PublicHolidaysResponse> dateTimeGetPublicHolidays(GetPublicHolidaysRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<PublicHolidaysResponse> localVarReturnType = new ParameterizedTypeReference<PublicHolidaysResponse>() {};
        return dateTimeGetPublicHolidaysRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PublicHolidaysResponse>> dateTimeGetPublicHolidaysWithHttpInfo(GetPublicHolidaysRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<PublicHolidaysResponse> localVarReturnType = new ParameterizedTypeReference<PublicHolidaysResponse>() {};
        return dateTimeGetPublicHolidaysRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return DateTimeStandardizedParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dateTimeParseNaturalLanguageDateTimeRequestCreation(DateTimeNaturalLanguageParseRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling dateTimeParseNaturalLanguageDateTime", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.invokeAPI("/validate/date-time/parse/date-time/natural-language", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parses a free-form natural language date and time string into a date and time
     * Parses an unstructured, free-form, natural language date and time string into a date time object.  This is intended for lightweight human-entered input, such as \&quot;tomorrow at 3pm\&quot; or \&quot;tuesday\&quot;.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return DateTimeStandardizedParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DateTimeStandardizedParseResponse> dateTimeParseNaturalLanguageDateTime(DateTimeNaturalLanguageParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return dateTimeParseNaturalLanguageDateTimeRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DateTimeStandardizedParseResponse>> dateTimeParseNaturalLanguageDateTimeWithHttpInfo(DateTimeNaturalLanguageParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return dateTimeParseNaturalLanguageDateTimeRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return DateTimeStandardizedParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dateTimeParseStandardDateTimeRequestCreation(DateTimeStandardizedParseRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling dateTimeParseStandardDateTime", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return apiClient.invokeAPI("/validate/date-time/parse/date-time/structured", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parses a standardized date and time string into a date and time
     * Parses a structured date and time string into a date time object.  This is intended for standardized date strings that adhere to formatting conventions, rather than natural language input.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return DateTimeStandardizedParseResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DateTimeStandardizedParseResponse> dateTimeParseStandardDateTime(DateTimeStandardizedParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return dateTimeParseStandardDateTimeRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DateTimeStandardizedParseResponse>> dateTimeParseStandardDateTimeWithHttpInfo(DateTimeStandardizedParseRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DateTimeStandardizedParseResponse> localVarReturnType = new ParameterizedTypeReference<DateTimeStandardizedParseResponse>() {};
        return dateTimeParseStandardDateTimeRequestCreation(input).toEntity(localVarReturnType);
    }
}
