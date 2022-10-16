package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.PhoneNumberValidateRequest;
import com.cloudmersive.client.gac.model.PhoneNumberValidationResponse;

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
public class PhoneNumberApi {
    private ApiClient apiClient;

    public PhoneNumberApi() {
        this(new ApiClient());
    }

    @Autowired
    public PhoneNumberApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Validate phone number (basic)
     * Validate a phone number by analyzing the syntax
     * <p><b>200</b> - OK
     * @param value Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \&quot;1.800.463.3339\&quot;, and either leave DefaultCountryCode blank or use \&quot;US\&quot;.
     * @return PhoneNumberValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec phoneNumberSyntaxOnlyRequestCreation(PhoneNumberValidateRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling phoneNumberSyntaxOnly", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PhoneNumberValidationResponse> localVarReturnType = new ParameterizedTypeReference<PhoneNumberValidationResponse>() {};
        return apiClient.invokeAPI("/validate/phonenumber/basic", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate phone number (basic)
     * Validate a phone number by analyzing the syntax
     * <p><b>200</b> - OK
     * @param value Phone number to validate in a PhoneNumberValidateRequest object.  Try a phone number such as \&quot;1.800.463.3339\&quot;, and either leave DefaultCountryCode blank or use \&quot;US\&quot;.
     * @return PhoneNumberValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PhoneNumberValidationResponse> phoneNumberSyntaxOnly(PhoneNumberValidateRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<PhoneNumberValidationResponse> localVarReturnType = new ParameterizedTypeReference<PhoneNumberValidationResponse>() {};
        return phoneNumberSyntaxOnlyRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PhoneNumberValidationResponse>> phoneNumberSyntaxOnlyWithHttpInfo(PhoneNumberValidateRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<PhoneNumberValidationResponse> localVarReturnType = new ParameterizedTypeReference<PhoneNumberValidationResponse>() {};
        return phoneNumberSyntaxOnlyRequestCreation(value).toEntity(localVarReturnType);
    }
}
