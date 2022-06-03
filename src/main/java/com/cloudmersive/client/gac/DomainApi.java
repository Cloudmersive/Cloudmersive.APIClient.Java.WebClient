package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CheckResponse;
import com.cloudmersive.client.gac.model.DomainQualityResponse;
import com.cloudmersive.client.gac.model.IsAdminPathResponse;
import com.cloudmersive.client.gac.model.PhishingCheckRequest;
import com.cloudmersive.client.gac.model.PhishingCheckResponse;
import com.cloudmersive.client.gac.model.UrlHtmlSsrfRequestFull;
import com.cloudmersive.client.gac.model.UrlHtmlSsrfResponseFull;
import com.cloudmersive.client.gac.model.UrlSafetyCheckRequestFull;
import com.cloudmersive.client.gac.model.UrlSafetyCheckResponseFull;
import com.cloudmersive.client.gac.model.UrlSsrfRequestBatch;
import com.cloudmersive.client.gac.model.UrlSsrfRequestFull;
import com.cloudmersive.client.gac.model.UrlSsrfResponseBatch;
import com.cloudmersive.client.gac.model.UrlSsrfResponseFull;
import com.cloudmersive.client.gac.model.ValidateUrlRequestFull;
import com.cloudmersive.client.gac.model.ValidateUrlRequestSyntaxOnly;
import com.cloudmersive.client.gac.model.ValidateUrlResponseFull;
import com.cloudmersive.client.gac.model.ValidateUrlResponseSyntaxOnly;
import com.cloudmersive.client.gac.model.WhoisResponse;

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
public class DomainApi {
    private ApiClient apiClient;

    public DomainApi() {
        this(new ApiClient());
    }

    @Autowired
    public DomainApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Validate a domain name
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return CheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainCheckRequestCreation(String domain) throws WebClientResponseException {
        Object postBody = domain;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new WebClientResponseException("Missing the required parameter 'domain' when calling domainCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CheckResponse> localVarReturnType = new ParameterizedTypeReference<CheckResponse>() {};
        return apiClient.invokeAPI("/validate/domain/check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a domain name
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return CheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CheckResponse> domainCheck(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<CheckResponse> localVarReturnType = new ParameterizedTypeReference<CheckResponse>() {};
        return domainCheckRequestCreation(domain).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CheckResponse>> domainCheckWithHttpInfo(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<CheckResponse> localVarReturnType = new ParameterizedTypeReference<CheckResponse>() {};
        return domainCheckRequestCreation(domain).toEntity(localVarReturnType);
    }
    /**
     * Get top-level domain name from URL
     * Gets the top-level domain name from a URL, such as mydomain.com.
     * <p><b>200</b> - OK
     * @param request Input URL information
     * @return ValidateUrlResponseSyntaxOnly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainGetTopLevelDomainFromUrlRequestCreation(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainGetTopLevelDomainFromUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.invokeAPI("/validate/domain/url/get-top-level-domain", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get top-level domain name from URL
     * Gets the top-level domain name from a URL, such as mydomain.com.
     * <p><b>200</b> - OK
     * @param request Input URL information
     * @return ValidateUrlResponseSyntaxOnly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateUrlResponseSyntaxOnly> domainGetTopLevelDomainFromUrl(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return domainGetTopLevelDomainFromUrlRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateUrlResponseSyntaxOnly>> domainGetTopLevelDomainFromUrlWithHttpInfo(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return domainGetTopLevelDomainFromUrlRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Check if path is a high-risk or vulnerable server administration path
     * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
     * <p><b>200</b> - OK
     * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IsAdminPathResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainIsAdminPathRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling domainIsAdminPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IsAdminPathResponse> localVarReturnType = new ParameterizedTypeReference<IsAdminPathResponse>() {};
        return apiClient.invokeAPI("/validate/domain/url/is-admin-path", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if path is a high-risk or vulnerable server administration path
     * Check if the input URL or relative path is a server Administration Path, and therefore a risk or vulnerability for remote access.
     * <p><b>200</b> - OK
     * @param value URL or relative path to check, e.g. \&quot;/admin/login\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IsAdminPathResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IsAdminPathResponse> domainIsAdminPath(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IsAdminPathResponse> localVarReturnType = new ParameterizedTypeReference<IsAdminPathResponse>() {};
        return domainIsAdminPathRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<IsAdminPathResponse>> domainIsAdminPathWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IsAdminPathResponse> localVarReturnType = new ParameterizedTypeReference<IsAdminPathResponse>() {};
        return domainIsAdminPathRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check a URL for Phishing threats
     * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return PhishingCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainPhishingCheckRequestCreation(PhishingCheckRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainPhishingCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PhishingCheckResponse> localVarReturnType = new ParameterizedTypeReference<PhishingCheckResponse>() {};
        return apiClient.invokeAPI("/validate/domain/url/phishing-threat-check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check a URL for Phishing threats
     * Checks if an input URL is at risk of being an Phishing (fake login page, or other page designed to collect information via social engineering) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return PhishingCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PhishingCheckResponse> domainPhishingCheck(PhishingCheckRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PhishingCheckResponse> localVarReturnType = new ParameterizedTypeReference<PhishingCheckResponse>() {};
        return domainPhishingCheckRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PhishingCheckResponse>> domainPhishingCheckWithHttpInfo(PhishingCheckRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<PhishingCheckResponse> localVarReturnType = new ParameterizedTypeReference<PhishingCheckResponse>() {};
        return domainPhishingCheckRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Get WHOIS information for a domain
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes.
     * @return WhoisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainPostRequestCreation(String domain) throws WebClientResponseException {
        Object postBody = domain;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new WebClientResponseException("Missing the required parameter 'domain' when calling domainPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<WhoisResponse> localVarReturnType = new ParameterizedTypeReference<WhoisResponse>() {};
        return apiClient.invokeAPI("/validate/domain/whois", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get WHOIS information for a domain
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes.
     * @return WhoisResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WhoisResponse> domainPost(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<WhoisResponse> localVarReturnType = new ParameterizedTypeReference<WhoisResponse>() {};
        return domainPostRequestCreation(domain).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<WhoisResponse>> domainPostWithHttpInfo(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<WhoisResponse> localVarReturnType = new ParameterizedTypeReference<WhoisResponse>() {};
        return domainPostRequestCreation(domain).toEntity(localVarReturnType);
    }
    /**
     * Validate a domain name&#39;s quality score
     * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.
     * @return DomainQualityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainQualityScoreRequestCreation(String domain) throws WebClientResponseException {
        Object postBody = domain;
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new WebClientResponseException("Missing the required parameter 'domain' when calling domainQualityScore", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DomainQualityResponse> localVarReturnType = new ParameterizedTypeReference<DomainQualityResponse>() {};
        return apiClient.invokeAPI("/validate/domain/quality-score", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a domain name&#39;s quality score
     * Check the quality of a domain name.  Supports over 9 million domain names.  Higher quality scores indicate more trust and authority in the domain name, with values ranging from 0.0 (low quality) to 10.0 (maximum quality).
     * <p><b>200</b> - OK
     * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.
     * @return DomainQualityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DomainQualityResponse> domainQualityScore(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<DomainQualityResponse> localVarReturnType = new ParameterizedTypeReference<DomainQualityResponse>() {};
        return domainQualityScoreRequestCreation(domain).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DomainQualityResponse>> domainQualityScoreWithHttpInfo(String domain) throws WebClientResponseException {
        ParameterizedTypeReference<DomainQualityResponse> localVarReturnType = new ParameterizedTypeReference<DomainQualityResponse>() {};
        return domainQualityScoreRequestCreation(domain).toEntity(localVarReturnType);
    }
    /**
     * Check a URL for safety threats
     * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlSafetyCheckResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainSafetyCheckRequestCreation(UrlSafetyCheckRequestFull request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainSafetyCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UrlSafetyCheckResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSafetyCheckResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/safety-threat-check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check a URL for safety threats
     * Checks if an input URL is at risk of being a safety threat through malware, unwanted software, or social engineering threats.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlSafetyCheckResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UrlSafetyCheckResponseFull> domainSafetyCheck(UrlSafetyCheckRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSafetyCheckResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSafetyCheckResponseFull>() {};
        return domainSafetyCheckRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UrlSafetyCheckResponseFull>> domainSafetyCheckWithHttpInfo(UrlSafetyCheckRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSafetyCheckResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSafetyCheckResponseFull>() {};
        return domainSafetyCheckRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Check a URL for SSRF threats
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlSsrfResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainSsrfCheckRequestCreation(UrlSsrfRequestFull request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainSsrfCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UrlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check a URL for SSRF threats
     * Checks if an input URL is at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlSsrfResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UrlSsrfResponseFull> domainSsrfCheck(UrlSsrfRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseFull>() {};
        return domainSsrfCheckRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UrlSsrfResponseFull>> domainSsrfCheckWithHttpInfo(UrlSsrfRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseFull>() {};
        return domainSsrfCheckRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Check a URL for SSRF threats in batches
     * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request as a batch of multiple URLs
     * @return UrlSsrfResponseBatch
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainSsrfCheckBatchRequestCreation(UrlSsrfRequestBatch request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainSsrfCheckBatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UrlSsrfResponseBatch> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseBatch>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check/batch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check a URL for SSRF threats in batches
     * Batch-checks if input URLs are at risk of being an SSRF (Server-side request forgery) threat or attack.
     * <p><b>200</b> - OK
     * @param request Input URL request as a batch of multiple URLs
     * @return UrlSsrfResponseBatch
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UrlSsrfResponseBatch> domainSsrfCheckBatch(UrlSsrfRequestBatch request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSsrfResponseBatch> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseBatch>() {};
        return domainSsrfCheckBatchRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UrlSsrfResponseBatch>> domainSsrfCheckBatchWithHttpInfo(UrlSsrfRequestBatch request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlSsrfResponseBatch> localVarReturnType = new ParameterizedTypeReference<UrlSsrfResponseBatch>() {};
        return domainSsrfCheckBatchRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Validate a URL fully
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return ValidateUrlResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainUrlFullRequestCreation(ValidateUrlRequestFull request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainUrlFull", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateUrlResponseFull> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/full", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a URL fully
     * Validate whether a URL is syntactically valid (does not check endpoint for validity), whether it exists, and whether the endpoint is up and passes virus scan checks.  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return ValidateUrlResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateUrlResponseFull> domainUrlFull(ValidateUrlRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseFull> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseFull>() {};
        return domainUrlFullRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateUrlResponseFull>> domainUrlFullWithHttpInfo(ValidateUrlRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseFull> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseFull>() {};
        return domainUrlFullRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Check a URL for HTML embedded SSRF threats
     * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlHtmlSsrfResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainUrlHtmlSsrfCheckRequestCreation(UrlHtmlSsrfRequestFull request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainUrlHtmlSsrfCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UrlHtmlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlHtmlSsrfResponseFull>() {};
        return apiClient.invokeAPI("/validate/domain/url/ssrf-threat-check/html-embedded", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check a URL for HTML embedded SSRF threats
     * Checks if an input URL HTML is at risk of containing one or more embedded SSRF (Server-side request forgery) threats or attacks.
     * <p><b>200</b> - OK
     * @param request Input URL request
     * @return UrlHtmlSsrfResponseFull
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UrlHtmlSsrfResponseFull> domainUrlHtmlSsrfCheck(UrlHtmlSsrfRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlHtmlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlHtmlSsrfResponseFull>() {};
        return domainUrlHtmlSsrfCheckRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UrlHtmlSsrfResponseFull>> domainUrlHtmlSsrfCheckWithHttpInfo(UrlHtmlSsrfRequestFull request) throws WebClientResponseException {
        ParameterizedTypeReference<UrlHtmlSsrfResponseFull> localVarReturnType = new ParameterizedTypeReference<UrlHtmlSsrfResponseFull>() {};
        return domainUrlHtmlSsrfCheckRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Validate a URL syntactically
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL information
     * @return ValidateUrlResponseSyntaxOnly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec domainUrlSyntaxOnlyRequestCreation(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling domainUrlSyntaxOnly", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return apiClient.invokeAPI("/validate/domain/url/syntax-only", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a URL syntactically
     * Validate whether a URL is syntactically valid (does not check endpoint for validity).  Accepts various types of input and produces a well-formed URL as output.
     * <p><b>200</b> - OK
     * @param request Input URL information
     * @return ValidateUrlResponseSyntaxOnly
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateUrlResponseSyntaxOnly> domainUrlSyntaxOnly(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return domainUrlSyntaxOnlyRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateUrlResponseSyntaxOnly>> domainUrlSyntaxOnlyWithHttpInfo(ValidateUrlRequestSyntaxOnly request) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly> localVarReturnType = new ParameterizedTypeReference<ValidateUrlResponseSyntaxOnly>() {};
        return domainUrlSyntaxOnlyRequestCreation(request).toEntity(localVarReturnType);
    }
}
