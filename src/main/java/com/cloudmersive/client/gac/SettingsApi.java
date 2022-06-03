package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CreateSettingRequest;
import com.cloudmersive.client.gac.model.CreateSettingResponse;
import com.cloudmersive.client.gac.model.ListSettingsRequest;
import com.cloudmersive.client.gac.model.ListSettingsResponse;
import com.cloudmersive.client.gac.model.UpdateSettingRequest;
import com.cloudmersive.client.gac.model.UpdateSettingResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:12.838058600-07:00[America/Los_Angeles]")
public class SettingsApi {
    private ApiClient apiClient;

    public SettingsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SettingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a setting in the specified bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return CreateSettingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec settingsCreateSettingRequestCreation(CreateSettingRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling settingsCreateSetting", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreateSettingResponse> localVarReturnType = new ParameterizedTypeReference<CreateSettingResponse>() {};
        return apiClient.invokeAPI("/config/settings/create", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a setting in the specified bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return CreateSettingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateSettingResponse> settingsCreateSetting(CreateSettingRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<CreateSettingResponse> localVarReturnType = new ParameterizedTypeReference<CreateSettingResponse>() {};
        return settingsCreateSettingRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CreateSettingResponse>> settingsCreateSettingWithHttpInfo(CreateSettingRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<CreateSettingResponse> localVarReturnType = new ParameterizedTypeReference<CreateSettingResponse>() {};
        return settingsCreateSettingRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Enumerate the settings in a bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return ListSettingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec settingsListSettingsRequestCreation(ListSettingsRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling settingsListSettings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ListSettingsResponse> localVarReturnType = new ParameterizedTypeReference<ListSettingsResponse>() {};
        return apiClient.invokeAPI("/config/settings/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Enumerate the settings in a bucket
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return ListSettingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ListSettingsResponse> settingsListSettings(ListSettingsRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ListSettingsResponse> localVarReturnType = new ParameterizedTypeReference<ListSettingsResponse>() {};
        return settingsListSettingsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ListSettingsResponse>> settingsListSettingsWithHttpInfo(ListSettingsRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ListSettingsResponse> localVarReturnType = new ParameterizedTypeReference<ListSettingsResponse>() {};
        return settingsListSettingsRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Update a setting
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return UpdateSettingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec settingsUpdateSettingRequestCreation(UpdateSettingRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling settingsUpdateSetting", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UpdateSettingResponse> localVarReturnType = new ParameterizedTypeReference<UpdateSettingResponse>() {};
        return apiClient.invokeAPI("/config/settings/update", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update a setting
     * 
     * <p><b>200</b> - OK
     * @param request Request to perform the operation on
     * @return UpdateSettingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateSettingResponse> settingsUpdateSetting(UpdateSettingRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateSettingResponse> localVarReturnType = new ParameterizedTypeReference<UpdateSettingResponse>() {};
        return settingsUpdateSettingRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UpdateSettingResponse>> settingsUpdateSettingWithHttpInfo(UpdateSettingRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateSettingResponse> localVarReturnType = new ParameterizedTypeReference<UpdateSettingResponse>() {};
        return settingsUpdateSettingRequestCreation(request).toEntity(localVarReturnType);
    }
}
