package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AvailableCurrencyResponse;
import com.cloudmersive.client.gac.model.ConvertedCurrencyResult;
import com.cloudmersive.client.gac.model.ExchangeRateResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:57.670203600-07:00[America/Los_Angeles]")
public class CurrencyExchangeApi {
    private ApiClient apiClient;

    public CurrencyExchangeApi() {
        this(new ApiClient());
    }

    @Autowired
    public CurrencyExchangeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Converts a price from the source currency into the destination currency
     * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param sourcePrice Input price, such as 19.99 in source currency
     * @return ConvertedCurrencyResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec currencyExchangeConvertCurrencyRequestCreation(String source, String destination, Double sourcePrice) throws WebClientResponseException {
        Object postBody = sourcePrice;
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new WebClientResponseException("Missing the required parameter 'source' when calling currencyExchangeConvertCurrency", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new WebClientResponseException("Missing the required parameter 'destination' when calling currencyExchangeConvertCurrency", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sourcePrice' is set
        if (sourcePrice == null) {
            throw new WebClientResponseException("Missing the required parameter 'sourcePrice' when calling currencyExchangeConvertCurrency", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("source", source);
        pathParams.put("destination", destination);

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

        ParameterizedTypeReference<ConvertedCurrencyResult> localVarReturnType = new ParameterizedTypeReference<ConvertedCurrencyResult>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/convert/{source}/to/{destination}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Converts a price from the source currency into the destination currency
     * Automatically converts the price in the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param sourcePrice Input price, such as 19.99 in source currency
     * @return ConvertedCurrencyResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ConvertedCurrencyResult> currencyExchangeConvertCurrency(String source, String destination, Double sourcePrice) throws WebClientResponseException {
        ParameterizedTypeReference<ConvertedCurrencyResult> localVarReturnType = new ParameterizedTypeReference<ConvertedCurrencyResult>() {};
        return currencyExchangeConvertCurrencyRequestCreation(source, destination, sourcePrice).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ConvertedCurrencyResult>> currencyExchangeConvertCurrencyWithHttpInfo(String source, String destination, Double sourcePrice) throws WebClientResponseException {
        ParameterizedTypeReference<ConvertedCurrencyResult> localVarReturnType = new ParameterizedTypeReference<ConvertedCurrencyResult>() {};
        return currencyExchangeConvertCurrencyRequestCreation(source, destination, sourcePrice).toEntity(localVarReturnType);
    }
    /**
     * Get a list of available currencies and corresponding countries
     * Enumerates available currencies and the countries that correspond to these currencies.
     * <p><b>200</b> - OK
     * @return AvailableCurrencyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec currencyExchangeGetAvailableCurrenciesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<AvailableCurrencyResponse> localVarReturnType = new ParameterizedTypeReference<AvailableCurrencyResponse>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/list-available", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a list of available currencies and corresponding countries
     * Enumerates available currencies and the countries that correspond to these currencies.
     * <p><b>200</b> - OK
     * @return AvailableCurrencyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AvailableCurrencyResponse> currencyExchangeGetAvailableCurrencies() throws WebClientResponseException {
        ParameterizedTypeReference<AvailableCurrencyResponse> localVarReturnType = new ParameterizedTypeReference<AvailableCurrencyResponse>() {};
        return currencyExchangeGetAvailableCurrenciesRequestCreation().bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AvailableCurrencyResponse>> currencyExchangeGetAvailableCurrenciesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<AvailableCurrencyResponse> localVarReturnType = new ParameterizedTypeReference<AvailableCurrencyResponse>() {};
        return currencyExchangeGetAvailableCurrenciesRequestCreation().toEntity(localVarReturnType);
    }
    /**
     * Gets the exchange rate from the source currency into the destination currency
     * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @return ExchangeRateResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec currencyExchangeGetExchangeRateRequestCreation(String source, String destination) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'source' is set
        if (source == null) {
            throw new WebClientResponseException("Missing the required parameter 'source' when calling currencyExchangeGetExchangeRate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new WebClientResponseException("Missing the required parameter 'destination' when calling currencyExchangeGetExchangeRate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("source", source);
        pathParams.put("destination", destination);

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

        ParameterizedTypeReference<ExchangeRateResult> localVarReturnType = new ParameterizedTypeReference<ExchangeRateResult>() {};
        return apiClient.invokeAPI("/currency/exchange-rates/get/{source}/to/{destination}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the exchange rate from the source currency into the destination currency
     * Automatically gets the exchange rate from the source currency into the destination currency using the latest available currency exchange rate data.
     * <p><b>200</b> - OK
     * @param source Source currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @param destination Destination currency three-digit code (ISO 4217), e.g. USD, EUR, etc.
     * @return ExchangeRateResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ExchangeRateResult> currencyExchangeGetExchangeRate(String source, String destination) throws WebClientResponseException {
        ParameterizedTypeReference<ExchangeRateResult> localVarReturnType = new ParameterizedTypeReference<ExchangeRateResult>() {};
        return currencyExchangeGetExchangeRateRequestCreation(source, destination).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ExchangeRateResult>> currencyExchangeGetExchangeRateWithHttpInfo(String source, String destination) throws WebClientResponseException {
        ParameterizedTypeReference<ExchangeRateResult> localVarReturnType = new ParameterizedTypeReference<ExchangeRateResult>() {};
        return currencyExchangeGetExchangeRateRequestCreation(source, destination).toEntity(localVarReturnType);
    }
}
