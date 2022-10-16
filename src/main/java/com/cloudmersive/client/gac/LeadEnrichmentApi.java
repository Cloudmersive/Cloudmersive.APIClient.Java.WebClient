package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.EmailLead;
import com.cloudmersive.client.gac.model.LeadEnrichmentRequest;
import com.cloudmersive.client.gac.model.LeadEnrichmentResponse;

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
public class LeadEnrichmentApi {
    private ApiClient apiClient;

    public LeadEnrichmentApi() {
        this(new ApiClient());
    }

    @Autowired
    public LeadEnrichmentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Enrich an input lead with additional fields of data
     * 
     * <p><b>200</b> - OK
     * @param request Input lead with known fields set, and unknown fields left blank (null)
     * @return LeadEnrichmentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec leadEnrichmentEnrichLeadRequestCreation(LeadEnrichmentRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling leadEnrichmentEnrichLead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return apiClient.invokeAPI("/validate/lead-enrichment/lead/enrich", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Enrich an input lead with additional fields of data
     * 
     * <p><b>200</b> - OK
     * @param request Input lead with known fields set, and unknown fields left blank (null)
     * @return LeadEnrichmentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LeadEnrichmentResponse> leadEnrichmentEnrichLead(LeadEnrichmentRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return leadEnrichmentEnrichLeadRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LeadEnrichmentResponse>> leadEnrichmentEnrichLeadWithHttpInfo(LeadEnrichmentRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return leadEnrichmentEnrichLeadRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Get company information from email address
     * 
     * <p><b>200</b> - OK
     * @param request Input email address lead
     * @return LeadEnrichmentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec leadEnrichmentGetCompanyInformationRequestCreation(EmailLead request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling leadEnrichmentGetCompanyInformation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return apiClient.invokeAPI("/validate/lead-enrichment/lead/email/company-information", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get company information from email address
     * 
     * <p><b>200</b> - OK
     * @param request Input email address lead
     * @return LeadEnrichmentResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LeadEnrichmentResponse> leadEnrichmentGetCompanyInformation(EmailLead request) throws WebClientResponseException {
        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return leadEnrichmentGetCompanyInformationRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<LeadEnrichmentResponse>> leadEnrichmentGetCompanyInformationWithHttpInfo(EmailLead request) throws WebClientResponseException {
        ParameterizedTypeReference<LeadEnrichmentResponse> localVarReturnType = new ParameterizedTypeReference<LeadEnrichmentResponse>() {};
        return leadEnrichmentGetCompanyInformationRequestCreation(request).toEntity(localVarReturnType);
    }
}
