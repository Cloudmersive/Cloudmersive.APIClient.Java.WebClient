package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.Base64DecodeRequest;
import com.cloudmersive.client.gac.model.Base64DecodeResponse;
import com.cloudmersive.client.gac.model.Base64DetectRequest;
import com.cloudmersive.client.gac.model.Base64DetectResponse;
import com.cloudmersive.client.gac.model.Base64EncodeRequest;
import com.cloudmersive.client.gac.model.Base64EncodeResponse;
import com.cloudmersive.client.gac.model.ChangeLineEndingResponse;
import com.cloudmersive.client.gac.model.DetectLineEndingsResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.FindStringRegexRequest;
import com.cloudmersive.client.gac.model.FindStringRegexResponse;
import com.cloudmersive.client.gac.model.FindStringSimpleRequest;
import com.cloudmersive.client.gac.model.FindStringSimpleResponse;
import com.cloudmersive.client.gac.model.RemoveHtmlFromTextRequest;
import com.cloudmersive.client.gac.model.RemoveHtmlFromTextResponse;
import com.cloudmersive.client.gac.model.RemoveWhitespaceFromTextRequest;
import com.cloudmersive.client.gac.model.RemoveWhitespaceFromTextResponse;
import com.cloudmersive.client.gac.model.ReplaceStringRegexRequest;
import com.cloudmersive.client.gac.model.ReplaceStringRegexResponse;
import com.cloudmersive.client.gac.model.ReplaceStringSimpleRequest;
import com.cloudmersive.client.gac.model.ReplaceStringSimpleResponse;
import com.cloudmersive.client.gac.model.TextEncodingDetectResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class EditTextApi {
    private ApiClient apiClient;

    public EditTextApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditTextApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Base 64 decode, convert base 64 string to binary content
     * Decodes / converts base 64 UTF-8 text string to binary content
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64DecodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextBase64DecodeRequestCreation(Base64DecodeRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextBase64Decode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Base64DecodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64DecodeResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/encoding/base64/decode", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Base 64 decode, convert base 64 string to binary content
     * Decodes / converts base 64 UTF-8 text string to binary content
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64DecodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Base64DecodeResponse> editTextBase64Decode(Base64DecodeRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64DecodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64DecodeResponse>() {};
        return editTextBase64DecodeRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Base64DecodeResponse>> editTextBase64DecodeWithHttpInfo(Base64DecodeRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64DecodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64DecodeResponse>() {};
        return editTextBase64DecodeRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Detect, check if text string is base 64 encoded
     * Checks, detects if input string is base 64 encoded
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64DetectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextBase64DetectRequestCreation(Base64DetectRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextBase64Detect", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Base64DetectResponse> localVarReturnType = new ParameterizedTypeReference<Base64DetectResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/encoding/base64/detect", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect, check if text string is base 64 encoded
     * Checks, detects if input string is base 64 encoded
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64DetectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Base64DetectResponse> editTextBase64Detect(Base64DetectRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64DetectResponse> localVarReturnType = new ParameterizedTypeReference<Base64DetectResponse>() {};
        return editTextBase64DetectRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Base64DetectResponse>> editTextBase64DetectWithHttpInfo(Base64DetectRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64DetectResponse> localVarReturnType = new ParameterizedTypeReference<Base64DetectResponse>() {};
        return editTextBase64DetectRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Base 64 encode, convert binary or file data to a text string
     * Encodes / converts binary or file data to a text string
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64EncodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextBase64EncodeRequestCreation(Base64EncodeRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextBase64Encode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Base64EncodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64EncodeResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/encoding/base64/encode", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Base 64 encode, convert binary or file data to a text string
     * Encodes / converts binary or file data to a text string
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Base64EncodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Base64EncodeResponse> editTextBase64Encode(Base64EncodeRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64EncodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64EncodeResponse>() {};
        return editTextBase64EncodeRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Base64EncodeResponse>> editTextBase64EncodeWithHttpInfo(Base64EncodeRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Base64EncodeResponse> localVarReturnType = new ParameterizedTypeReference<Base64EncodeResponse>() {};
        return editTextBase64EncodeRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Set, change line endings of a text file
     * Sets the line ending type of a text file; set to Windows, Unix or Mac.
     * <p><b>200</b> - OK
     * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return
     * @param inputFile Input file to perform the operation on.
     * @return ChangeLineEndingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextChangeLineEndingsRequestCreation(String lineEndingType, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lineEndingType' is set
        if (lineEndingType == null) {
            throw new WebClientResponseException("Missing the required parameter 'lineEndingType' when calling editTextChangeLineEndings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editTextChangeLineEndings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (lineEndingType != null)
        headerParams.add("lineEndingType", apiClient.parameterToString(lineEndingType));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<ChangeLineEndingResponse> localVarReturnType = new ParameterizedTypeReference<ChangeLineEndingResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/line-endings/change", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set, change line endings of a text file
     * Sets the line ending type of a text file; set to Windows, Unix or Mac.
     * <p><b>200</b> - OK
     * @param lineEndingType Required; &#39;Windows&#39; will use carriage return and line feed, &#39;Unix&#39; will use newline, and &#39;Mac&#39; will use carriage return
     * @param inputFile Input file to perform the operation on.
     * @return ChangeLineEndingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ChangeLineEndingResponse> editTextChangeLineEndings(String lineEndingType, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<ChangeLineEndingResponse> localVarReturnType = new ParameterizedTypeReference<ChangeLineEndingResponse>() {};
        return editTextChangeLineEndingsRequestCreation(lineEndingType, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ChangeLineEndingResponse>> editTextChangeLineEndingsWithHttpInfo(String lineEndingType, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<ChangeLineEndingResponse> localVarReturnType = new ParameterizedTypeReference<ChangeLineEndingResponse>() {};
        return editTextChangeLineEndingsRequestCreation(lineEndingType, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Detect line endings of a text file
     * Detect line ending type (Windows, Unix or Mac) of an input file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DetectLineEndingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextDetectLineEndingsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editTextDetectLineEndings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DetectLineEndingsResponse> localVarReturnType = new ParameterizedTypeReference<DetectLineEndingsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/line-endings/detect", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect line endings of a text file
     * Detect line ending type (Windows, Unix or Mac) of an input file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DetectLineEndingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DetectLineEndingsResponse> editTextDetectLineEndings(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DetectLineEndingsResponse> localVarReturnType = new ParameterizedTypeReference<DetectLineEndingsResponse>() {};
        return editTextDetectLineEndingsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DetectLineEndingsResponse>> editTextDetectLineEndingsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DetectLineEndingsResponse> localVarReturnType = new ParameterizedTypeReference<DetectLineEndingsResponse>() {};
        return editTextDetectLineEndingsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Find a regular expression regex in text input
     * Find all occurrences of the input regular expression in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request
     * @return FindStringRegexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextFindRegexRequestCreation(FindStringRegexRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextFindRegex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FindStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<FindStringRegexResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/find/regex", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find a regular expression regex in text input
     * Find all occurrences of the input regular expression in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request
     * @return FindStringRegexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FindStringRegexResponse> editTextFindRegex(FindStringRegexRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<FindStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<FindStringRegexResponse>() {};
        return editTextFindRegexRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FindStringRegexResponse>> editTextFindRegexWithHttpInfo(FindStringRegexRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<FindStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<FindStringRegexResponse>() {};
        return editTextFindRegexRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Find a string in text input
     * Finds all occurrences of the input string in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request
     * @return FindStringSimpleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextFindSimpleRequestCreation(FindStringSimpleRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextFindSimple", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FindStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<FindStringSimpleResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/find/string", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find a string in text input
     * Finds all occurrences of the input string in the input content, and returns the matches
     * <p><b>200</b> - OK
     * @param request Input request
     * @return FindStringSimpleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FindStringSimpleResponse> editTextFindSimple(FindStringSimpleRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<FindStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<FindStringSimpleResponse>() {};
        return editTextFindSimpleRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FindStringSimpleResponse>> editTextFindSimpleWithHttpInfo(FindStringSimpleRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<FindStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<FindStringSimpleResponse>() {};
        return editTextFindSimpleRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Remove whitespace from text string
     * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveWhitespaceFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextRemoveAllWhitespaceRequestCreation(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextRemoveAllWhitespace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/remove/whitespace/all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove whitespace from text string
     * Removes all whitespace from text, leaving behind only non-whitespace characters.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveWhitespaceFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoveWhitespaceFromTextResponse> editTextRemoveAllWhitespace(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return editTextRemoveAllWhitespaceRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RemoveWhitespaceFromTextResponse>> editTextRemoveAllWhitespaceWithHttpInfo(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return editTextRemoveAllWhitespaceRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Remove HTML from text string
     * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveHtmlFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextRemoveHtmlRequestCreation(RemoveHtmlFromTextRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextRemoveHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RemoveHtmlFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveHtmlFromTextResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/remove/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove HTML from text string
     * Removes HTML from text, leaving behind only text.  Formatted text will become plain text.  Important for protecting against HTML and Cross-Site-Scripting attacks.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveHtmlFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoveHtmlFromTextResponse> editTextRemoveHtml(RemoveHtmlFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveHtmlFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveHtmlFromTextResponse>() {};
        return editTextRemoveHtmlRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RemoveHtmlFromTextResponse>> editTextRemoveHtmlWithHttpInfo(RemoveHtmlFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveHtmlFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveHtmlFromTextResponse>() {};
        return editTextRemoveHtmlRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Replace a string in text with a regex regular expression string
     * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request
     * @return ReplaceStringRegexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextReplaceRegexRequestCreation(ReplaceStringRegexRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextReplaceRegex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReplaceStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringRegexResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/replace/regex", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace a string in text with a regex regular expression string
     * Replaces all occurrences of the input regular expression regex string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request
     * @return ReplaceStringRegexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReplaceStringRegexResponse> editTextReplaceRegex(ReplaceStringRegexRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringRegexResponse>() {};
        return editTextReplaceRegexRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ReplaceStringRegexResponse>> editTextReplaceRegexWithHttpInfo(ReplaceStringRegexRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceStringRegexResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringRegexResponse>() {};
        return editTextReplaceRegexRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Replace a string in text with another string value
     * Replaces all occurrences of the input string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request
     * @return ReplaceStringSimpleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextReplaceSimpleRequestCreation(ReplaceStringSimpleRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextReplaceSimple", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReplaceStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringSimpleResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/replace/string", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace a string in text with another string value
     * Replaces all occurrences of the input string in the input content, and returns the result
     * <p><b>200</b> - OK
     * @param request Input request
     * @return ReplaceStringSimpleResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReplaceStringSimpleResponse> editTextReplaceSimple(ReplaceStringSimpleRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringSimpleResponse>() {};
        return editTextReplaceSimpleRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ReplaceStringSimpleResponse>> editTextReplaceSimpleWithHttpInfo(ReplaceStringSimpleRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceStringSimpleResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceStringSimpleResponse>() {};
        return editTextReplaceSimpleRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Detect text encoding of file
     * Checks text encoding of file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextEncodingDetectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextTextEncodingDetectRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editTextTextEncodingDetect", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<TextEncodingDetectResponse> localVarReturnType = new ParameterizedTypeReference<TextEncodingDetectResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/encoding/detect", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect text encoding of file
     * Checks text encoding of file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextEncodingDetectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextEncodingDetectResponse> editTextTextEncodingDetect(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextEncodingDetectResponse> localVarReturnType = new ParameterizedTypeReference<TextEncodingDetectResponse>() {};
        return editTextTextEncodingDetectRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextEncodingDetectResponse>> editTextTextEncodingDetectWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextEncodingDetectResponse> localVarReturnType = new ParameterizedTypeReference<TextEncodingDetectResponse>() {};
        return editTextTextEncodingDetectRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Trim leading and trailing whitespace from text string
     * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveWhitespaceFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editTextTrimWhitespaceRequestCreation(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editTextTrimWhitespace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return apiClient.invokeAPI("/convert/edit/text/remove/whitespace/trim", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Trim leading and trailing whitespace from text string
     * Trim leading and trailing whitespace from text, leaving behind a trimmed string.  Whitespace includes newlines, spaces and other whitespace characters.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return RemoveWhitespaceFromTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoveWhitespaceFromTextResponse> editTextTrimWhitespace(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return editTextTrimWhitespaceRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RemoveWhitespaceFromTextResponse>> editTextTrimWhitespaceWithHttpInfo(RemoveWhitespaceFromTextRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveWhitespaceFromTextResponse> localVarReturnType = new ParameterizedTypeReference<RemoveWhitespaceFromTextResponse>() {};
        return editTextTrimWhitespaceRequestCreation(request).toEntity(localVarReturnType);
    }
}
