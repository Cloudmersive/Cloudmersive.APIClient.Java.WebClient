package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.HtmlSsrfDetectionResult;
import com.cloudmersive.client.gac.model.SqlInjectionCheckBatchRequest;
import com.cloudmersive.client.gac.model.SqlInjectionCheckBatchResponse;
import com.cloudmersive.client.gac.model.SqlInjectionDetectionResult;
import com.cloudmersive.client.gac.model.XssProtectionBatchRequest;
import com.cloudmersive.client.gac.model.XssProtectionBatchResponse;
import com.cloudmersive.client.gac.model.XssProtectionResult;
import com.cloudmersive.client.gac.model.XxeDetectionBatchRequest;
import com.cloudmersive.client.gac.model.XxeDetectionBatchResponse;
import com.cloudmersive.client.gac.model.XxeDetectionResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:26:45.731195400-07:00[America/Los_Angeles]")
public class TextInputApi {
    private ApiClient apiClient;

    public TextInputApi() {
        this(new ApiClient());
    }

    @Autowired
    public TextInputApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input.
     * @return HtmlSsrfDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckHtmlSsrfRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckHtmlSsrf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HtmlSsrfDetectionResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/html/check/ssrf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Protect html input from Server-side Request Forgery (SSRF) attacks
     * Detects SSRF (Server-side request forgery) attacks and unsafe URL attacks from HTML text input, where attackers can attempt to access unsafe local or network paths in the server environment by injecting them into HTML.
     * <p><b>200</b> - OK
     * @param value User-facing HTML input.
     * @return HtmlSsrfDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlSsrfDetectionResult> textInputCheckHtmlSsrf(String value) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlSsrfDetectionResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfDetectionResult>() {};
        return textInputCheckHtmlSsrfRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlSsrfDetectionResult>> textInputCheckHtmlSsrfWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlSsrfDetectionResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfDetectionResult>() {};
        return textInputCheckHtmlSsrfRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check text input for SQL Injection (SQLI) attacks
     * Detects SQL Injection (SQLI) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @param detectionLevel Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
     * @return SqlInjectionDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckSqlInjectionRequestCreation(String value, String detectionLevel) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckSqlInjection", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (detectionLevel != null)
        headerParams.add("detectionLevel", apiClient.parameterToString(detectionLevel));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<SqlInjectionDetectionResult> localVarReturnType = new ParameterizedTypeReference<SqlInjectionDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/sql-injection", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check text input for SQL Injection (SQLI) attacks
     * Detects SQL Injection (SQLI) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @param detectionLevel Set to Normal to target a high-security SQL Injection detection level with a very low false positive rate; select High to target a very-high security SQL Injection detection level with higher false positives.  Default is Normal (recommended).
     * @return SqlInjectionDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SqlInjectionDetectionResult> textInputCheckSqlInjection(String value, String detectionLevel) throws WebClientResponseException {
        ParameterizedTypeReference<SqlInjectionDetectionResult> localVarReturnType = new ParameterizedTypeReference<SqlInjectionDetectionResult>() {};
        return textInputCheckSqlInjectionRequestCreation(value, detectionLevel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SqlInjectionDetectionResult>> textInputCheckSqlInjectionWithHttpInfo(String value, String detectionLevel) throws WebClientResponseException {
        ParameterizedTypeReference<SqlInjectionDetectionResult> localVarReturnType = new ParameterizedTypeReference<SqlInjectionDetectionResult>() {};
        return textInputCheckSqlInjectionRequestCreation(value, detectionLevel).toEntity(localVarReturnType);
    }
    /**
     * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
     * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return SqlInjectionCheckBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckSqlInjectionBatchRequestCreation(SqlInjectionCheckBatchRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckSqlInjectionBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SqlInjectionCheckBatchResponse> localVarReturnType = new ParameterizedTypeReference<SqlInjectionCheckBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check/sql-injection/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check and protect multiple text inputs for SQL Injection (SQLI) attacks in batch
     * Detects SQL Injection (SQLI) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return SqlInjectionCheckBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SqlInjectionCheckBatchResponse> textInputCheckSqlInjectionBatch(SqlInjectionCheckBatchRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<SqlInjectionCheckBatchResponse> localVarReturnType = new ParameterizedTypeReference<SqlInjectionCheckBatchResponse>() {};
        return textInputCheckSqlInjectionBatchRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SqlInjectionCheckBatchResponse>> textInputCheckSqlInjectionBatchWithHttpInfo(SqlInjectionCheckBatchRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<SqlInjectionCheckBatchResponse> localVarReturnType = new ParameterizedTypeReference<SqlInjectionCheckBatchResponse>() {};
        return textInputCheckSqlInjectionBatchRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check text input for Cross-Site-Scripting (XSS) attacks
     * Detects XSS (Cross-Site-Scripting) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckXssRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckXss", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xss", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check text input for Cross-Site-Scripting (XSS) attacks
     * Detects XSS (Cross-Site-Scripting) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XssProtectionResult> textInputCheckXss(String value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return textInputCheckXssRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XssProtectionResult>> textInputCheckXssWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return textInputCheckXssRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
     * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckXssBatchRequestCreation(XssProtectionBatchRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckXssBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XssProtectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XssProtectionBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check-and-protect/xss/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check and protect multiple text inputs for Cross-Site-Scripting (XSS) attacks in batch
     * Detects XSS (Cross-Site-Scripting) attacks from multiple text inputs.  Output preverses order of input items.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XssProtectionBatchResponse> textInputCheckXssBatch(XssProtectionBatchRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XssProtectionBatchResponse>() {};
        return textInputCheckXssBatchRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XssProtectionBatchResponse>> textInputCheckXssBatchWithHttpInfo(XssProtectionBatchRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XssProtectionBatchResponse>() {};
        return textInputCheckXssBatchRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @param allowInternetUrls Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
     * @param knownSafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
     * @param knownUnsafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
     * @return XxeDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckXxeRequestCreation(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputCheckXxe", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (allowInternetUrls != null)
        headerParams.add("allowInternetUrls", apiClient.parameterToString(allowInternetUrls));
        if (knownSafeUrls != null)
        headerParams.add("knownSafeUrls", apiClient.parameterToString(knownSafeUrls));
        if (knownUnsafeUrls != null)
        headerParams.add("knownUnsafeUrls", apiClient.parameterToString(knownUnsafeUrls));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XxeDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeDetectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xxe", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @param allowInternetUrls Optional: Set to true to allow Internet-based dependency URLs for DTDs and other XML External Entitites, set to false to block.  Default is false.
     * @param knownSafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered safe.
     * @param knownUnsafeUrls Optional: Comma separated list of fully-qualified URLs that will automatically be considered unsafe.
     * @return XxeDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XxeDetectionResult> textInputCheckXxe(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws WebClientResponseException {
        ParameterizedTypeReference<XxeDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeDetectionResult>() {};
        return textInputCheckXxeRequestCreation(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XxeDetectionResult>> textInputCheckXxeWithHttpInfo(String value, Boolean allowInternetUrls, String knownSafeUrls, String knownUnsafeUrls) throws WebClientResponseException {
        ParameterizedTypeReference<XxeDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeDetectionResult>() {};
        return textInputCheckXxeRequestCreation(value, allowInternetUrls, knownSafeUrls, knownUnsafeUrls).toEntity(localVarReturnType);
    }
    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return XxeDetectionBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputCheckXxeBatchRequestCreation(XxeDetectionBatchRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling textInputCheckXxeBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XxeDetectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XxeDetectionBatchResponse>() {};
        return apiClient.invokeAPI("/validate/text-input/check/xxe/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Protect text input from XML External Entity (XXE) attacks
     * Detects XXE (XML External Entity) attacks from text input.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return XxeDetectionBatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XxeDetectionBatchResponse> textInputCheckXxeBatch(XxeDetectionBatchRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<XxeDetectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XxeDetectionBatchResponse>() {};
        return textInputCheckXxeBatchRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XxeDetectionBatchResponse>> textInputCheckXxeBatchWithHttpInfo(XxeDetectionBatchRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<XxeDetectionBatchResponse> localVarReturnType = new ParameterizedTypeReference<XxeDetectionBatchResponse>() {};
        return textInputCheckXxeBatchRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
     * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec textInputProtectXssRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling textInputProtectXss", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return apiClient.invokeAPI("/validate/text-input/protect/xss", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Protect text input from Cross-Site-Scripting (XSS) attacks through normalization
     * Detects and removes XSS (Cross-Site-Scripting) attacks from text input through normalization.  Returns the normalized result, as well as information on whether the original input contained an XSS risk.
     * <p><b>200</b> - OK
     * @param value User-facing text input.
     * @return XssProtectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XssProtectionResult> textInputProtectXss(String value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return textInputProtectXssRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XssProtectionResult>> textInputProtectXssWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<XssProtectionResult> localVarReturnType = new ParameterizedTypeReference<XssProtectionResult>() {};
        return textInputProtectXssRequestCreation(value).toEntity(localVarReturnType);
    }
}
