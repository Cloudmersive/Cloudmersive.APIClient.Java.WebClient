package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.BarcodeLookupResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:17:58.888224100-07:00[America/Los_Angeles]")
public class BarcodeLookupApi {
    private ApiClient apiClient;

    public BarcodeLookupApi() {
        this(new ApiClient());
    }

    @Autowired
    public BarcodeLookupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lookup EAN barcode value, return product data
     * Lookup an input EAN barcode and return key details about the product
     * <p><b>200</b> - OK
     * @param value Barcode value
     * @return BarcodeLookupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec barcodeLookupEanLookupRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling barcodeLookupEanLookup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<BarcodeLookupResponse> localVarReturnType = new ParameterizedTypeReference<BarcodeLookupResponse>() {};
        return apiClient.invokeAPI("/barcode/lookup/ean", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Lookup EAN barcode value, return product data
     * Lookup an input EAN barcode and return key details about the product
     * <p><b>200</b> - OK
     * @param value Barcode value
     * @return BarcodeLookupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BarcodeLookupResponse> barcodeLookupEanLookup(String value) throws WebClientResponseException {
        ParameterizedTypeReference<BarcodeLookupResponse> localVarReturnType = new ParameterizedTypeReference<BarcodeLookupResponse>() {};
        return barcodeLookupEanLookupRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<BarcodeLookupResponse>> barcodeLookupEanLookupWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<BarcodeLookupResponse> localVarReturnType = new ParameterizedTypeReference<BarcodeLookupResponse>() {};
        return barcodeLookupEanLookupRequestCreation(value).toEntity(localVarReturnType);
    }
}
