package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CreateZipArchiveRequest;
import java.io.File;
import com.cloudmersive.client.gac.model.ZipEncryptionAdvancedRequest;
import com.cloudmersive.client.gac.model.ZipExtractResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:27:02.750428300-07:00[America/Los_Angeles]")
public class ZipArchiveApi {
    private ApiClient apiClient;

    public ZipArchiveApi() {
        this(new ApiClient());
    }

    @Autowired
    public ZipArchiveApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Compress files to create a new zip archive
     * Create a new zip archive by compressing input files.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on.
     * @param inputFile3 Third input file to perform the operation on.
     * @param inputFile4 Fourth input file to perform the operation on.
     * @param inputFile5 Fifth input file to perform the operation on.
     * @param inputFile6 Sixth input file to perform the operation on.
     * @param inputFile7 Seventh input file to perform the operation on.
     * @param inputFile8 Eighth input file to perform the operation on.
     * @param inputFile9 Ninth input file to perform the operation on.
     * @param inputFile10 Tenth input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipCreateRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compress files to create a new zip archive
     * Create a new zip archive by compressing input files.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on.
     * @param inputFile3 Third input file to perform the operation on.
     * @param inputFile4 Fourth input file to perform the operation on.
     * @param inputFile5 Fifth input file to perform the operation on.
     * @param inputFile6 Sixth input file to perform the operation on.
     * @param inputFile7 Seventh input file to perform the operation on.
     * @param inputFile8 Eighth input file to perform the operation on.
     * @param inputFile9 Ninth input file to perform the operation on.
     * @param inputFile10 Tenth input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> zipArchiveZipCreate(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return zipArchiveZipCreateRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> zipArchiveZipCreateWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return zipArchiveZipCreateRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Compress files and folders to create a new zip archive with advanced options
     * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipCreateAdvancedRequestCreation(CreateZipArchiveRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling zipArchiveZipCreateAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compress files and folders to create a new zip archive with advanced options
     * Create a new zip archive by compressing input files, folders and leverage advanced options to control the structure of the resulting zip archive.
     * <p><b>200</b> - OK
     * @param request Input request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> zipArchiveZipCreateAdvanced(CreateZipArchiveRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipCreateAdvancedRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> zipArchiveZipCreateAdvancedWithHttpInfo(CreateZipArchiveRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipCreateAdvancedRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Compress files to create a new, encrypted and password-protected zip archive
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure
     * @param inputFile1 First input file to perform the operation on.
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
     * @param inputFile2 Second input file to perform the operation on.
     * @param inputFile3 Third input file to perform the operation on.
     * @param inputFile4 Fourth input file to perform the operation on.
     * @param inputFile5 Fifth input file to perform the operation on.
     * @param inputFile6 Sixth input file to perform the operation on.
     * @param inputFile7 Seventh input file to perform the operation on.
     * @param inputFile8 Eighth input file to perform the operation on.
     * @param inputFile9 Ninth input file to perform the operation on.
     * @param inputFile10 Tenth input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipCreateEncryptedRequestCreation(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new WebClientResponseException("Missing the required parameter 'password' when calling zipArchiveZipCreateEncrypted", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateEncrypted", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        headerParams.add("password", apiClient.parameterToString(password));
        if (encryptionAlgorithm != null)
        headerParams.add("encryptionAlgorithm", apiClient.parameterToString(encryptionAlgorithm));
        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create/encrypted", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compress files to create a new, encrypted and password-protected zip archive
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure
     * @param inputFile1 First input file to perform the operation on.
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
     * @param inputFile2 Second input file to perform the operation on.
     * @param inputFile3 Third input file to perform the operation on.
     * @param inputFile4 Fourth input file to perform the operation on.
     * @param inputFile5 Fifth input file to perform the operation on.
     * @param inputFile6 Sixth input file to perform the operation on.
     * @param inputFile7 Seventh input file to perform the operation on.
     * @param inputFile8 Eighth input file to perform the operation on.
     * @param inputFile9 Ninth input file to perform the operation on.
     * @param inputFile10 Tenth input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> zipArchiveZipCreateEncrypted(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return zipArchiveZipCreateEncryptedRequestCreation(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> zipArchiveZipCreateEncryptedWithHttpInfo(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return zipArchiveZipCreateEncryptedRequestCreation(password, inputFile1, encryptionAlgorithm, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Create an encrypted zip file to quarantine a dangerous file
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure
     * @param inputFile1 First input file to perform the operation on.
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipCreateQuarantineRequestCreation(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new WebClientResponseException("Missing the required parameter 'password' when calling zipArchiveZipCreateQuarantine", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling zipArchiveZipCreateQuarantine", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        headerParams.add("password", apiClient.parameterToString(password));
        if (encryptionAlgorithm != null)
        headerParams.add("encryptionAlgorithm", apiClient.parameterToString(encryptionAlgorithm));
        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);

        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/create/quarantine", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create an encrypted zip file to quarantine a dangerous file
     * Create a new zip archive by compressing input files, and also applies encryption and password protection to the zip, for the purposes of quarantining the underlyikng file.
     * <p><b>200</b> - OK
     * @param password Password to place on the Zip file; the longer the password, the more secure
     * @param inputFile1 First input file to perform the operation on.
     * @param encryptionAlgorithm Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm). Default is AES-256.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> zipArchiveZipCreateQuarantine(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipCreateQuarantineRequestCreation(password, inputFile1, encryptionAlgorithm).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> zipArchiveZipCreateQuarantineWithHttpInfo(String password, org.springframework.core.io.AbstractResource inputFile1, String encryptionAlgorithm) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipCreateQuarantineRequestCreation(password, inputFile1, encryptionAlgorithm).toEntity(localVarReturnType);
    }
    /**
     * Decrypt and remove password protection on a zip file
     * Decrypts and removes password protection from an encrypted zip file with the specified password
     * <p><b>200</b> - OK
     * @param zipPassword Required; Password for the input archive
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipDecryptRequestCreation(String zipPassword, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'zipPassword' is set
        if (zipPassword == null) {
            throw new WebClientResponseException("Missing the required parameter 'zipPassword' when calling zipArchiveZipDecrypt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling zipArchiveZipDecrypt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (zipPassword != null)
        headerParams.add("zipPassword", apiClient.parameterToString(zipPassword));
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/decrypt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Decrypt and remove password protection on a zip file
     * Decrypts and removes password protection from an encrypted zip file with the specified password
     * <p><b>200</b> - OK
     * @param zipPassword Required; Password for the input archive
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> zipArchiveZipDecrypt(String zipPassword, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipDecryptRequestCreation(zipPassword, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> zipArchiveZipDecryptWithHttpInfo(String zipPassword, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipDecryptRequestCreation(zipPassword, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Encrypt and password protect a zip file
     * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
     * <p><b>200</b> - OK
     * @param encryptionRequest Encryption request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipEncryptAdvancedRequestCreation(ZipEncryptionAdvancedRequest encryptionRequest) throws WebClientResponseException {
        Object postBody = encryptionRequest;
        // verify the required parameter 'encryptionRequest' is set
        if (encryptionRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'encryptionRequest' when calling zipArchiveZipEncryptAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/archive/zip/encrypt/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Encrypt and password protect a zip file
     * Encrypts and password protects an existing zip file with the specified password and encryption algorithm
     * <p><b>200</b> - OK
     * @param encryptionRequest Encryption request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> zipArchiveZipEncryptAdvanced(ZipEncryptionAdvancedRequest encryptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipEncryptAdvancedRequestCreation(encryptionRequest).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> zipArchiveZipEncryptAdvancedWithHttpInfo(ZipEncryptionAdvancedRequest encryptionRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return zipArchiveZipEncryptAdvancedRequestCreation(encryptionRequest).toEntity(localVarReturnType);
    }
    /**
     * Extract, decompress files and folders from a zip archive
     * Extracts a zip archive by decompressing files, and folders.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return ZipExtractResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec zipArchiveZipExtractRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling zipArchiveZipExtract", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ZipExtractResponse> localVarReturnType = new ParameterizedTypeReference<ZipExtractResponse>() {};
        return apiClient.invokeAPI("/convert/archive/zip/extract", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Extract, decompress files and folders from a zip archive
     * Extracts a zip archive by decompressing files, and folders.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return ZipExtractResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ZipExtractResponse> zipArchiveZipExtract(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<ZipExtractResponse> localVarReturnType = new ParameterizedTypeReference<ZipExtractResponse>() {};
        return zipArchiveZipExtractRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ZipExtractResponse>> zipArchiveZipExtractWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<ZipExtractResponse> localVarReturnType = new ParameterizedTypeReference<ZipExtractResponse>() {};
        return zipArchiveZipExtractRequestCreation(inputFile).toEntity(localVarReturnType);
    }
}
