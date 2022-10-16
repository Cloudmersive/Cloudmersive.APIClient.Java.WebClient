package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.BotCheckResponse;
import com.cloudmersive.client.gac.model.GeolocateResponse;
import com.cloudmersive.client.gac.model.GeolocateStreetAddressResponse;
import com.cloudmersive.client.gac.model.IPIntelligenceResponse;
import com.cloudmersive.client.gac.model.IPReverseDNSLookupResponse;
import com.cloudmersive.client.gac.model.IPThreatResponse;
import com.cloudmersive.client.gac.model.TorNodeResponse;

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
public class IpAddressApi {
    private ApiClient apiClient;

    public IpAddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public IpAddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Geolocate an IP address to a street address
     * Identify an IP address&#39;s street address.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return GeolocateStreetAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressGeolocateStreetAddressRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressGeolocateStreetAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GeolocateStreetAddressResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateStreetAddressResponse>() {};
        return apiClient.invokeAPI("/validate/ip/geolocate/street-address", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Geolocate an IP address to a street address
     * Identify an IP address&#39;s street address.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return GeolocateStreetAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GeolocateStreetAddressResponse> iPAddressGeolocateStreetAddress(String value) throws WebClientResponseException {
        ParameterizedTypeReference<GeolocateStreetAddressResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateStreetAddressResponse>() {};
        return iPAddressGeolocateStreetAddressRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GeolocateStreetAddressResponse>> iPAddressGeolocateStreetAddressWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<GeolocateStreetAddressResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateStreetAddressResponse>() {};
        return iPAddressGeolocateStreetAddressRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Get intelligence on an IP address
     * Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPIntelligenceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressIpIntelligenceRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressIpIntelligence", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IPIntelligenceResponse> localVarReturnType = new ParameterizedTypeReference<IPIntelligenceResponse>() {};
        return apiClient.invokeAPI("/validate/ip/intelligence", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get intelligence on an IP address
     * Identify key intelligence about an IP address, including if it is a known threat IP, known bot, Tor exit node, as well as the location of the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to process, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPIntelligenceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IPIntelligenceResponse> iPAddressIpIntelligence(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPIntelligenceResponse> localVarReturnType = new ParameterizedTypeReference<IPIntelligenceResponse>() {};
        return iPAddressIpIntelligenceRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<IPIntelligenceResponse>> iPAddressIpIntelligenceWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPIntelligenceResponse> localVarReturnType = new ParameterizedTypeReference<IPIntelligenceResponse>() {};
        return iPAddressIpIntelligenceRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check if IP address is a Bot client
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return BotCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressIsBotRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressIsBot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BotCheckResponse> localVarReturnType = new ParameterizedTypeReference<BotCheckResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-bot", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if IP address is a Bot client
     * Check if the input IP address is a Bot, robot, or otherwise a non-user entity.  Leverages real-time signals to check against known high-probability bots..
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return BotCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BotCheckResponse> iPAddressIsBot(String value) throws WebClientResponseException {
        ParameterizedTypeReference<BotCheckResponse> localVarReturnType = new ParameterizedTypeReference<BotCheckResponse>() {};
        return iPAddressIsBotRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<BotCheckResponse>> iPAddressIsBotWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<BotCheckResponse> localVarReturnType = new ParameterizedTypeReference<BotCheckResponse>() {};
        return iPAddressIsBotRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check if IP address is a known threat
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPThreatResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressIsThreatRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressIsThreat", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IPThreatResponse> localVarReturnType = new ParameterizedTypeReference<IPThreatResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-threat", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if IP address is a known threat
     * Check if the input IP address is a known threat IP address.  Checks against known bad IPs, botnets, compromised servers, and other lists of threats.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPThreatResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IPThreatResponse> iPAddressIsThreat(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPThreatResponse> localVarReturnType = new ParameterizedTypeReference<IPThreatResponse>() {};
        return iPAddressIsThreatRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<IPThreatResponse>> iPAddressIsThreatWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPThreatResponse> localVarReturnType = new ParameterizedTypeReference<IPThreatResponse>() {};
        return iPAddressIsThreatRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Check if IP address is a Tor node server
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return TorNodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressIsTorNodeRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressIsTorNode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TorNodeResponse> localVarReturnType = new ParameterizedTypeReference<TorNodeResponse>() {};
        return apiClient.invokeAPI("/validate/ip/is-tor-node", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if IP address is a Tor node server
     * Check if the input IP address is a Tor exit node server.  Tor servers are a type of privacy-preserving technology that can hide the original IP address who makes a request.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return TorNodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TorNodeResponse> iPAddressIsTorNode(String value) throws WebClientResponseException {
        ParameterizedTypeReference<TorNodeResponse> localVarReturnType = new ParameterizedTypeReference<TorNodeResponse>() {};
        return iPAddressIsTorNodeRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TorNodeResponse>> iPAddressIsTorNodeWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<TorNodeResponse> localVarReturnType = new ParameterizedTypeReference<TorNodeResponse>() {};
        return iPAddressIsTorNodeRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Geolocate an IP address
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return GeolocateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressPostRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressPost", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GeolocateResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateResponse>() {};
        return apiClient.invokeAPI("/validate/ip/geolocate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Geolocate an IP address
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     * <p><b>200</b> - OK
     * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return GeolocateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GeolocateResponse> iPAddressPost(String value) throws WebClientResponseException {
        ParameterizedTypeReference<GeolocateResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateResponse>() {};
        return iPAddressPostRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GeolocateResponse>> iPAddressPostWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<GeolocateResponse> localVarReturnType = new ParameterizedTypeReference<GeolocateResponse>() {};
        return iPAddressPostRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Perform a reverse domain name (DNS) lookup on an IP address
     * Gets the domain name, if any, associated with the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPReverseDNSLookupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec iPAddressReverseDomainLookupRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling iPAddressReverseDomainLookup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IPReverseDNSLookupResponse> localVarReturnType = new ParameterizedTypeReference<IPReverseDNSLookupResponse>() {};
        return apiClient.invokeAPI("/validate/ip/reverse-domain-lookup", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform a reverse domain name (DNS) lookup on an IP address
     * Gets the domain name, if any, associated with the IP address.
     * <p><b>200</b> - OK
     * @param value IP address to check, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes.
     * @return IPReverseDNSLookupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IPReverseDNSLookupResponse> iPAddressReverseDomainLookup(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPReverseDNSLookupResponse> localVarReturnType = new ParameterizedTypeReference<IPReverseDNSLookupResponse>() {};
        return iPAddressReverseDomainLookupRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<IPReverseDNSLookupResponse>> iPAddressReverseDomainLookupWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<IPReverseDNSLookupResponse> localVarReturnType = new ParameterizedTypeReference<IPReverseDNSLookupResponse>() {};
        return iPAddressReverseDomainLookupRequestCreation(value).toEntity(localVarReturnType);
    }
}
