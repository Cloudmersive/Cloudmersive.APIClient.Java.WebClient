package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.FirstNameValidationRequest;
import com.cloudmersive.client.gac.model.FirstNameValidationResponse;
import com.cloudmersive.client.gac.model.FullNameValidationRequest;
import com.cloudmersive.client.gac.model.FullNameValidationResponse;
import com.cloudmersive.client.gac.model.GetGenderRequest;
import com.cloudmersive.client.gac.model.GetGenderResponse;
import com.cloudmersive.client.gac.model.LastNameValidationRequest;
import com.cloudmersive.client.gac.model.LastNameValidationResponse;
import com.cloudmersive.client.gac.model.ValidateIdentifierRequest;
import com.cloudmersive.client.gac.model.ValidateIdentifierResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:32.359992900-07:00[America/Los_Angeles]")
public class NameApi {
    private ApiClient apiClient;

    public NameApi() {
        this(new ApiClient());
    }

    @Autowired
    public NameApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get the gender of a first name
     * Determines the gender of a first name (given name)
     * <p><b>200</b> - OK
     * @param input Gender request information
     * @return GetGenderResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nameGetGenderRequestCreation(GetGenderRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling nameGetGender", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetGenderResponse> localVarReturnType = new ParameterizedTypeReference<GetGenderResponse>() {};
        return apiClient.invokeAPI("/validate/name/get-gender", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the gender of a first name
     * Determines the gender of a first name (given name)
     * <p><b>200</b> - OK
     * @param input Gender request information
     * @return GetGenderResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetGenderResponse> nameGetGender(GetGenderRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetGenderResponse> localVarReturnType = new ParameterizedTypeReference<GetGenderResponse>() {};
        return nameGetGenderRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetGenderResponse>> nameGetGenderWithHttpInfo(GetGenderRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetGenderResponse> localVarReturnType = new ParameterizedTypeReference<GetGenderResponse>() {};
        return nameGetGenderRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a code identifier
     * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
     * <p><b>200</b> - OK
     * @param input Identifier validation request information
     * @return ValidateIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nameIdentifierRequestCreation(ValidateIdentifierRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling nameIdentifier", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<ValidateIdentifierResponse>() {};
        return apiClient.invokeAPI("/validate/name/identifier", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a code identifier
     * Determines if the input name is a valid technical / code identifier.  Configure input rules such as whether whitespace, hyphens, underscores, etc. are allowed.  For example, a valid identifier might be \&quot;helloWorld\&quot; but not \&quot;hello*World\&quot;.
     * <p><b>200</b> - OK
     * @param input Identifier validation request information
     * @return ValidateIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateIdentifierResponse> nameIdentifier(ValidateIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<ValidateIdentifierResponse>() {};
        return nameIdentifierRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateIdentifierResponse>> nameIdentifierWithHttpInfo(ValidateIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<ValidateIdentifierResponse>() {};
        return nameIdentifierRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a first name
     * Determines if a string is a valid first name (given name)
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return FirstNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nameValidateFirstNameRequestCreation(FirstNameValidationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling nameValidateFirstName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FirstNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FirstNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/first", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a first name
     * Determines if a string is a valid first name (given name)
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return FirstNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FirstNameValidationResponse> nameValidateFirstName(FirstNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<FirstNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FirstNameValidationResponse>() {};
        return nameValidateFirstNameRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FirstNameValidationResponse>> nameValidateFirstNameWithHttpInfo(FirstNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<FirstNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FirstNameValidationResponse>() {};
        return nameValidateFirstNameRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Parse and validate a full name
     * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return FullNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nameValidateFullNameRequestCreation(FullNameValidationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling nameValidateFullName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FullNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/full-name", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parse and validate a full name
     * Parses a full name string (e.g. \&quot;Mr. Jon van der Waal Jr.\&quot;) into its component parts (and returns these component parts), and then validates whether it is a valid name string or not
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return FullNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FullNameValidationResponse> nameValidateFullName(FullNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<FullNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullNameValidationResponse>() {};
        return nameValidateFullNameRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FullNameValidationResponse>> nameValidateFullNameWithHttpInfo(FullNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<FullNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<FullNameValidationResponse>() {};
        return nameValidateFullNameRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a last name
     * Determines if a string is a valid last name (surname)
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return LastNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nameValidateLastNameRequestCreation(LastNameValidationRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling nameValidateLastName", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LastNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<LastNameValidationResponse>() {};
        return apiClient.invokeAPI("/validate/name/last", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a last name
     * Determines if a string is a valid last name (surname)
     * <p><b>200</b> - OK
     * @param input Validation request information
     * @return LastNameValidationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LastNameValidationResponse> nameValidateLastName(LastNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LastNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<LastNameValidationResponse>() {};
        return nameValidateLastNameRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LastNameValidationResponse>> nameValidateLastNameWithHttpInfo(LastNameValidationRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<LastNameValidationResponse> localVarReturnType = new ParameterizedTypeReference<LastNameValidationResponse>() {};
        return nameValidateLastNameRequestCreation(input).toEntity(localVarReturnType);
    }
}
