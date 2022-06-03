package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CountryListResult;
import com.cloudmersive.client.gac.model.GetTimezonesRequest;
import com.cloudmersive.client.gac.model.GetTimezonesResponse;
import com.cloudmersive.client.gac.model.NormalizeAddressResponse;
import com.cloudmersive.client.gac.model.ParseAddressRequest;
import com.cloudmersive.client.gac.model.ParseAddressResponse;
import com.cloudmersive.client.gac.model.ReverseGeocodeAddressRequest;
import com.cloudmersive.client.gac.model.ReverseGeocodeAddressResponse;
import com.cloudmersive.client.gac.model.ValidateAddressRequest;
import com.cloudmersive.client.gac.model.ValidateAddressResponse;
import com.cloudmersive.client.gac.model.ValidateCityRequest;
import com.cloudmersive.client.gac.model.ValidateCityResponse;
import com.cloudmersive.client.gac.model.ValidateCountryRequest;
import com.cloudmersive.client.gac.model.ValidateCountryResponse;
import com.cloudmersive.client.gac.model.ValidatePostalCodeRequest;
import com.cloudmersive.client.gac.model.ValidatePostalCodeResponse;
import com.cloudmersive.client.gac.model.ValidateStateRequest;
import com.cloudmersive.client.gac.model.ValidateStateResponse;

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
public class AddressApi {
    private ApiClient apiClient;

    public AddressApi() {
        this(new ApiClient());
    }

    @Autowired
    public AddressApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Check if a country is a member of the European Union (EU)
     * Checks if the input country is a member of the European Union or not.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressCheckEUMembershipRequestCreation(ValidateCountryRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressCheckEUMembership", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/check-eu-membership", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check if a country is a member of the European Union (EU)
     * Checks if the input country is a member of the European Union or not.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateCountryResponse> addressCheckEUMembership(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressCheckEUMembershipRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateCountryResponse>> addressCheckEUMembershipWithHttpInfo(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressCheckEUMembershipRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressCountryRequestCreation(ValidateCountryRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressCountry", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate and normalize country information, return ISO 3166-1 country codes and country name
     * Validates and normalizes country information, and returns key information about a country, as well as whether it is a member of the European Union.  Also returns distinct time zones in the country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateCountryResponse> addressCountry(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressCountryRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateCountryResponse>> addressCountryWithHttpInfo(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressCountryRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get a list of ISO 3166-1 countries
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     * <p><b>200</b> - OK
     * @return CountryListResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressCountryListRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CountryListResult> localVarReturnType = new ParameterizedTypeReference<CountryListResult>() {};
        return apiClient.invokeAPI("/validate/address/country/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a list of ISO 3166-1 countries
     * Enumerates the list of ISO 3166-1 countries, including name, country codes, and more.
     * <p><b>200</b> - OK
     * @return CountryListResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CountryListResult> addressCountryList() throws WebClientResponseException {
        ParameterizedTypeReference<CountryListResult> localVarReturnType = new ParameterizedTypeReference<CountryListResult>() {};
        return addressCountryListRequestCreation().bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CountryListResult>> addressCountryListWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<CountryListResult> localVarReturnType = new ParameterizedTypeReference<CountryListResult>() {};
        return addressCountryListRequestCreation().toEntity(localVarReturnType);
    }
    /**
     * Geocode a street address into latitude and longitude
     * Geocodes a street address into latitude and longitude.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressGeocodeRequestCreation(ValidateAddressRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressGeocode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/geocode", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Geocode a street address into latitude and longitude
     * Geocodes a street address into latitude and longitude.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateAddressResponse> addressGeocode(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return addressGeocodeRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateAddressResponse>> addressGeocodeWithHttpInfo(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return addressGeocodeRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get the currency of the input country
     * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressGetCountryCurrencyRequestCreation(ValidateCountryRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressGetCountryCurrency", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-currency", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the currency of the input country
     * Gets the currency information for the input country, including the ISO three-letter country code, currency symbol, and English currency name.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateCountryResponse> addressGetCountryCurrency(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressGetCountryCurrencyRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateCountryResponse>> addressGetCountryCurrencyWithHttpInfo(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressGetCountryCurrencyRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get the region, subregion and continent of the country
     * Gets the continent information including region and subregion for the input country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressGetCountryRegionRequestCreation(ValidateCountryRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressGetCountryRegion", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-region", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the region, subregion and continent of the country
     * Gets the continent information including region and subregion for the input country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return ValidateCountryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateCountryResponse> addressGetCountryRegion(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressGetCountryRegionRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateCountryResponse>> addressGetCountryRegionWithHttpInfo(ValidateCountryRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCountryResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCountryResponse>() {};
        return addressGetCountryRegionRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Gets IANA/Olsen time zones for a country
     * Gets the IANA/Olsen time zones for a country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return GetTimezonesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressGetTimezoneRequestCreation(GetTimezonesRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressGetTimezone", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetTimezonesResponse> localVarReturnType = new ParameterizedTypeReference<GetTimezonesResponse>() {};
        return apiClient.invokeAPI("/validate/address/country/get-timezones", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets IANA/Olsen time zones for a country
     * Gets the IANA/Olsen time zones for a country.
     * <p><b>200</b> - OK
     * @param input Input request
     * @return GetTimezonesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetTimezonesResponse> addressGetTimezone(GetTimezonesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetTimezonesResponse> localVarReturnType = new ParameterizedTypeReference<GetTimezonesResponse>() {};
        return addressGetTimezoneRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetTimezonesResponse>> addressGetTimezoneWithHttpInfo(GetTimezonesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetTimezonesResponse> localVarReturnType = new ParameterizedTypeReference<GetTimezonesResponse>() {};
        return addressGetTimezoneRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Normalize a street address
     * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return NormalizeAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressNormalizeAddressRequestCreation(ValidateAddressRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressNormalizeAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<NormalizeAddressResponse> localVarReturnType = new ParameterizedTypeReference<NormalizeAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/street-address/normalize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Normalize a street address
     * Normalizes an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return NormalizeAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NormalizeAddressResponse> addressNormalizeAddress(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<NormalizeAddressResponse> localVarReturnType = new ParameterizedTypeReference<NormalizeAddressResponse>() {};
        return addressNormalizeAddressRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<NormalizeAddressResponse>> addressNormalizeAddressWithHttpInfo(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<NormalizeAddressResponse> localVarReturnType = new ParameterizedTypeReference<NormalizeAddressResponse>() {};
        return addressNormalizeAddressRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Parse an unstructured input text string into an international, formatted address
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ParseAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressParseStringRequestCreation(ParseAddressRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressParseString", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ParseAddressResponse> localVarReturnType = new ParameterizedTypeReference<ParseAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/parse", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Parse an unstructured input text string into an international, formatted address
     * Uses machine learning and Natural Language Processing (NLP) to handle a wide array of cases, including non-standard and unstructured address strings across a wide array of countries and address formatting norms.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ParseAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ParseAddressResponse> addressParseString(ParseAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ParseAddressResponse> localVarReturnType = new ParameterizedTypeReference<ParseAddressResponse>() {};
        return addressParseStringRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ParseAddressResponse>> addressParseStringWithHttpInfo(ParseAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ParseAddressResponse> localVarReturnType = new ParameterizedTypeReference<ParseAddressResponse>() {};
        return addressParseStringRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Reverse geocode a lattitude and longitude into an address
     * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
     * <p><b>200</b> - OK
     * @param input Input reverse geocoding request
     * @return ReverseGeocodeAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressReverseGeocodeAddressRequestCreation(ReverseGeocodeAddressRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressReverseGeocodeAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReverseGeocodeAddressResponse> localVarReturnType = new ParameterizedTypeReference<ReverseGeocodeAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/geocode/reverse", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reverse geocode a lattitude and longitude into an address
     * Converts lattitude and longitude coordinates into an address through reverse-geocoding.
     * <p><b>200</b> - OK
     * @param input Input reverse geocoding request
     * @return ReverseGeocodeAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReverseGeocodeAddressResponse> addressReverseGeocodeAddress(ReverseGeocodeAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseGeocodeAddressResponse> localVarReturnType = new ParameterizedTypeReference<ReverseGeocodeAddressResponse>() {};
        return addressReverseGeocodeAddressRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ReverseGeocodeAddressResponse>> addressReverseGeocodeAddressWithHttpInfo(ReverseGeocodeAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ReverseGeocodeAddressResponse> localVarReturnType = new ParameterizedTypeReference<ReverseGeocodeAddressResponse>() {};
        return addressReverseGeocodeAddressRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a street address
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressValidateAddressRequestCreation(ValidateAddressRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressValidateAddress", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return apiClient.invokeAPI("/validate/address/street-address", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a street address
     * Determines if an input structured street address is valid or invalid.  If the address is valid, also returns the latitude and longitude of the address.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateAddressResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateAddressResponse> addressValidateAddress(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return addressValidateAddressRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateAddressResponse>> addressValidateAddressWithHttpInfo(ValidateAddressRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateAddressResponse> localVarReturnType = new ParameterizedTypeReference<ValidateAddressResponse>() {};
        return addressValidateAddressRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a City and State/Province combination, get location information about it
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateCityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressValidateCityRequestCreation(ValidateCityRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressValidateCity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateCityResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCityResponse>() {};
        return apiClient.invokeAPI("/validate/address/city", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a City and State/Province combination, get location information about it
     * Checks if the input city and state name or code is valid, and returns information about it such as normalized City name, State name and more.  Supports all major international addresses.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateCityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateCityResponse> addressValidateCity(ValidateCityRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCityResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCityResponse>() {};
        return addressValidateCityRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateCityResponse>> addressValidateCityWithHttpInfo(ValidateCityRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateCityResponse> localVarReturnType = new ParameterizedTypeReference<ValidateCityResponse>() {};
        return addressValidateCityRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a postal code, get location information about it
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidatePostalCodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressValidatePostalCodeRequestCreation(ValidatePostalCodeRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressValidatePostalCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidatePostalCodeResponse> localVarReturnType = new ParameterizedTypeReference<ValidatePostalCodeResponse>() {};
        return apiClient.invokeAPI("/validate/address/postal-code", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a postal code, get location information about it
     * Checks if the input postal code is valid, and returns information about it such as City, State and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidatePostalCodeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidatePostalCodeResponse> addressValidatePostalCode(ValidatePostalCodeRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidatePostalCodeResponse> localVarReturnType = new ParameterizedTypeReference<ValidatePostalCodeResponse>() {};
        return addressValidatePostalCodeRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidatePostalCodeResponse>> addressValidatePostalCodeWithHttpInfo(ValidatePostalCodeRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidatePostalCodeResponse> localVarReturnType = new ParameterizedTypeReference<ValidatePostalCodeResponse>() {};
        return addressValidatePostalCodeRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Validate a state or province, name or abbreviation, get location information about it
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateStateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addressValidateStateRequestCreation(ValidateStateRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling addressValidateState", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ValidateStateResponse> localVarReturnType = new ParameterizedTypeReference<ValidateStateResponse>() {};
        return apiClient.invokeAPI("/validate/address/state", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a state or province, name or abbreviation, get location information about it
     * Checks if the input state name or code is valid, and returns information about it such as normalized State name and more.  Supports all major countries.
     * <p><b>200</b> - OK
     * @param input Input parse request
     * @return ValidateStateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ValidateStateResponse> addressValidateState(ValidateStateRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateStateResponse> localVarReturnType = new ParameterizedTypeReference<ValidateStateResponse>() {};
        return addressValidateStateRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ValidateStateResponse>> addressValidateStateWithHttpInfo(ValidateStateRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ValidateStateResponse> localVarReturnType = new ParameterizedTypeReference<ValidateStateResponse>() {};
        return addressValidateStateRequestCreation(input).toEntity(localVarReturnType);
    }
}
