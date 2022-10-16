package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:14.096561400-07:00[America/Los_Angeles]")
public class GenerateBarcodeApi {
    private ApiClient apiClient;

    public GenerateBarcodeApi() {
        this(new ApiClient());
    }

    @Autowired
    public GenerateBarcodeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate a EAN-13 code barcode as PNG file
     * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value Barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateBarcodeEAN13RequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling generateBarcodeEAN13", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/barcode/generate/ean-13", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a EAN-13 code barcode as PNG file
     * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value Barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> generateBarcodeEAN13(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeEAN13RequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> generateBarcodeEAN13WithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeEAN13RequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Generate a EAN-8 code barcode as PNG file
     * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value Barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateBarcodeEAN8RequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling generateBarcodeEAN8", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/barcode/generate/ean-8", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a EAN-8 code barcode as PNG file
     * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value Barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> generateBarcodeEAN8(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeEAN8RequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> generateBarcodeEAN8WithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeEAN8RequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Generate a QR code barcode as PNG file
     * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
     * <p><b>200</b> - OK
     * @param value QR code text to convert into the QR code barcode
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateBarcodeQRCodeRequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling generateBarcodeQRCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/barcode/generate/qrcode", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a QR code barcode as PNG file
     * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
     * <p><b>200</b> - OK
     * @param value QR code text to convert into the QR code barcode
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> generateBarcodeQRCode(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeQRCodeRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> generateBarcodeQRCodeWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeQRCodeRequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Generate a UPC-A code barcode as PNG file
     * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value UPC-A barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateBarcodeUPCARequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling generateBarcodeUPCA", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/barcode/generate/upc-a", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a UPC-A code barcode as PNG file
     * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value UPC-A barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> generateBarcodeUPCA(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeUPCARequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> generateBarcodeUPCAWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeUPCARequestCreation(value).toEntity(localVarReturnType);
    }
    /**
     * Generate a UPC-E code barcode as PNG file
     * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value UPC-E barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec generateBarcodeUPCERequestCreation(String value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling generateBarcodeUPCE", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/barcode/generate/upc-e", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a UPC-E code barcode as PNG file
     * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
     * <p><b>200</b> - OK
     * @param value UPC-E barcode value to generate from
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> generateBarcodeUPCE(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeUPCERequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> generateBarcodeUPCEWithHttpInfo(String value) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return generateBarcodeUPCERequestCreation(value).toEntity(localVarReturnType);
    }
}
