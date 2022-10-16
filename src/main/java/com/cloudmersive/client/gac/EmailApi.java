package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AddressGetServersResponse;
import com.cloudmersive.client.gac.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.gac.model.FullEmailValidationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:03.012760300-07:00[America/Los_Angeles]")
public class EmailApi {
    private ApiClient apiClient;

    public EmailApi() {
        this(new ApiClient());
    }

    @Autowired
    public EmailApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Partially check whether an email address is valid
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return AddressGetServersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec emailAddressGetServersRequestCreation(String email) throws WebClientResponseException {
        Object postBody = email;
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new WebClientResponseException("Missing the required parameter 'email' when calling emailAddressGetServers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddressGetServersResponse> localVarReturnType = new ParameterizedTypeReference<AddressGetServersResponse>() {};
        return apiClient.invokeAPI("/validate/email/address/servers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Partially check whether an email address is valid
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return AddressGetServersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddressGetServersResponse> emailAddressGetServers(String email) throws WebClientResponseException {
        ParameterizedTypeReference<AddressGetServersResponse> localVarReturnType = new ParameterizedTypeReference<AddressGetServersResponse>() {};
        return emailAddressGetServersRequestCreation(email).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AddressGetServersResponse>> emailAddressGetServersWithHttpInfo(String email) throws WebClientResponseException {
        ParameterizedTypeReference<AddressGetServersResponse> localVarReturnType = new ParameterizedTypeReference<AddressGetServersResponse>() {};
        return emailAddressGetServersRequestCreation(email).toEntity(localVarReturnType);
    }
    /**
     * Fully validate an email address
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return FullEmailValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec emailFullValidationRequestCreation(String email) throws WebClientResponseException {
        Object postBody = email;
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new WebClientResponseException("Missing the required parameter 'email' when calling emailFullValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FullEmailValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullEmailValidationResponse>() {};
        return apiClient.invokeAPI("/validate/email/address/full", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fully validate an email address
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     * <p><b>200</b> - OK
     * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return FullEmailValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FullEmailValidationResponse> emailFullValidation(String email) throws WebClientResponseException {
        ParameterizedTypeReference<FullEmailValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullEmailValidationResponse>() {};
        return emailFullValidationRequestCreation(email).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FullEmailValidationResponse>> emailFullValidationWithHttpInfo(String email) throws WebClientResponseException {
        ParameterizedTypeReference<FullEmailValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullEmailValidationResponse>() {};
        return emailFullValidationRequestCreation(email).toEntity(localVarReturnType);
    }
    /**
     * Validate email adddress for syntactic correctness only
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     * <p><b>200</b> - OK
     * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return AddressVerifySyntaxOnlyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec emailPostRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling emailPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse> localVarReturnType = new ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return apiClient.invokeAPI("/validate/email/address/syntaxOnly", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate email adddress for syntactic correctness only
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     * <p><b>200</b> - OK
     * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes.
     * @return AddressVerifySyntaxOnlyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AddressVerifySyntaxOnlyResponse> emailPost(String value) throws WebClientResponseException {
        ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse> localVarReturnType = new ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return emailPostRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AddressVerifySyntaxOnlyResponse>> emailPostWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse> localVarReturnType = new ParameterizedTypeReference<AddressVerifySyntaxOnlyResponse>() {};
        return emailPostRequestCreation(value).toEntity(localVarReturnType);
    }
}
