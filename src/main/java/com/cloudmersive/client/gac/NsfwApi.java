package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.NsfwResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:45.286050300-07:00[America/Los_Angeles]")
public class NsfwApi {
    private ApiClient apiClient;

    public NsfwApi() {
        this(new ApiClient());
    }

    @Autowired
    public NsfwApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Not safe for work NSFW racy content classification
     * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return NsfwResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec nsfwClassifyRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling nsfwClassify", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return apiClient.invokeAPI("/image/nsfw/classify", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Not safe for work NSFW racy content classification
     * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return NsfwResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NsfwResult> nsfwClassify(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return nsfwClassifyRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<NsfwResult>> nsfwClassifyWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return nsfwClassifyRequestCreation(imageFile).toEntity(localVarReturnType);
    }
}
