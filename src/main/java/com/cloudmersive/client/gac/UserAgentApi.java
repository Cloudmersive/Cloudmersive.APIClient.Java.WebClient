package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.UserAgentValidateRequest;
import com.cloudmersive.client.gac.model.UserAgentValidateResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:19.474063200-07:00[America/Los_Angeles]")
public class UserAgentApi {
    private ApiClient apiClient;

    public UserAgentApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserAgentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Parse an HTTP User-Agent string, identify robots
     * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
     * <p><b>200</b> - OK
     * @param request Input parse request
     * @return UserAgentValidateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec userAgentParseRequestCreation(UserAgentValidateRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling userAgentParse", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UserAgentValidateResponse> localVarReturnType = new ParameterizedTypeReference<UserAgentValidateResponse>() {};
        return apiClient.invokeAPI("/validate/useragent/parse", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parse an HTTP User-Agent string, identify robots
     * Uses a parsing system and database to parse the User-Agent into its structured component parts, such as Browser, Browser Version, Browser Engine, Operating System, and importantly, Robot identification.
     * <p><b>200</b> - OK
     * @param request Input parse request
     * @return UserAgentValidateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserAgentValidateResponse> userAgentParse(UserAgentValidateRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<UserAgentValidateResponse> localVarReturnType = new ParameterizedTypeReference<UserAgentValidateResponse>() {};
        return userAgentParseRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UserAgentValidateResponse>> userAgentParseWithHttpInfo(UserAgentValidateRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<UserAgentValidateResponse> localVarReturnType = new ParameterizedTypeReference<UserAgentValidateResponse>() {};
        return userAgentParseRequestCreation(request).toEntity(localVarReturnType);
    }
}
