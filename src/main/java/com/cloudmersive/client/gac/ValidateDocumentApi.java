package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AutodetectDocumentValidationResult;
import com.cloudmersive.client.gac.model.DocumentValidationResult;
import java.io.File;
import com.cloudmersive.client.gac.model.HtmlSsrfThreatCheckResult;
import com.cloudmersive.client.gac.model.XxeThreatDetectionResult;

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
public class ValidateDocumentApi {
    private ApiClient apiClient;

    public ValidateDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ValidateDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectDocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentAutodetectValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentAutodetectValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AutodetectDocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<AutodetectDocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/autodetect", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Autodetect content type and validate
     * Automatically detect the type of content, verify and validate that the content is indeed fully valid at depth, and then report the validation result.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectDocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AutodetectDocumentValidationResult> validateDocumentAutodetectValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectDocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<AutodetectDocumentValidationResult>() {};
        return validateDocumentAutodetectValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AutodetectDocumentValidationResult>> validateDocumentAutodetectValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectDocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<AutodetectDocumentValidationResult>() {};
        return validateDocumentAutodetectValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentCsvValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentCsvValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/csv", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a CSV file document (CSV)
     * Validate a CSV file document (CSV); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentCsvValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentCsvValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentCsvValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentCsvValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentDocValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentDocValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/doc", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Word 97-2003 Legacy document (DOC)
     * Validate a Word 97-2003 Legacy document (DOC)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentDocValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentDocValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentDocValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentDocValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentDocxValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentDocxValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Word document (DOCX)
     * Validate a Word document (DOCX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentDocxValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentDocxValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentDocxValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentDocxValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate if an EML file is executable
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentEmlValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentEmlValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/eml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate if an EML file is executable
     * Validate if an input file is an EML email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentEmlValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentEmlValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentEmlValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentEmlValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentExecutableValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentExecutableValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/executable", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate if a file is executable
     * Validate if an input file is a binary executable file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentExecutableValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentExecutableValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentExecutableValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentExecutableValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentGZipValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentGZipValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/gzip", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a GZip Archive file (gzip or gz)
     * Validate a GZip archive file (GZIP or GZ)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentGZipValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentGZipValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentGZipValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentGZipValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return HtmlSsrfThreatCheckResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentHtmlSsrfValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlSsrfValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HtmlSsrfThreatCheckResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfThreatCheckResult>() {};
        return apiClient.invokeAPI("/convert/validate/html/ssrf-threat-check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an HTML file and checks for SSRF threats
     * Validate an HTML document file and checks for SSRF (Server-side Request Forgery) threats in the file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return HtmlSsrfThreatCheckResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlSsrfThreatCheckResult> validateDocumentHtmlSsrfValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlSsrfThreatCheckResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfThreatCheckResult>() {};
        return validateDocumentHtmlSsrfValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlSsrfThreatCheckResult>> validateDocumentHtmlSsrfValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlSsrfThreatCheckResult> localVarReturnType = new ParameterizedTypeReference<HtmlSsrfThreatCheckResult>() {};
        return validateDocumentHtmlSsrfValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentHtmlValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentHtmlValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an HTML file
     * Validate an HTML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentHtmlValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentHtmlValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentHtmlValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentHtmlValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentImageValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentImageValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/image", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an Image File
     * Validate an image file; if the document is not valid, identifies the errors in the document.  Formats supported include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentImageValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentImageValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentImageValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentImageValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentJpgValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentJpgValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a JPG File
     * Validate a JPEG image file; if the document is not valid, identifies the errors in the document..
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentJpgValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentJpgValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentJpgValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentJpgValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentJsonValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentJsonValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/json", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a JSON file
     * Validate a JSON (JavaScript Object Notation) document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentJsonValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentJsonValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentJsonValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentJsonValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate if an MSG file is executable
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentMsgValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentMsgValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/msg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate if an MSG file is executable
     * Validate if an input file is an MSG email file; if the document is not valid
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentMsgValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentMsgValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentMsgValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentMsgValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentPdfValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentPdfValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a PDF document file
     * Validate a PDF document; if the document is not valid, identifies the errors in the document.  Also checks if the PDF is password protected.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentPdfValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPdfValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentPdfValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPdfValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentPngValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentPngValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a PNG File
     * Validate a PNG image file; if the document is not valid, identifies the errors in the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentPngValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPngValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentPngValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPngValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentPptValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentPptValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/ppt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * Validate a PowerPoint 97-2003 Legacy presentation (PPT)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentPptValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPptValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentPptValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPptValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentPptxValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentPptxValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a PowerPoint presentation (PPTX)
     * Validate a PowerPoint presentation (PPTX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentPptxValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPptxValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentPptxValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentPptxValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentRarValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentRarValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/rar", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a RAR Archive file (RAR)
     * Validate a RAR archive file (RAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentRarValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentRarValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentRarValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentRarValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentRtfValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentRtfValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/rtf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Rich Text Format document (RTF)
     * Validate a Rich Text Format document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentRtfValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentRtfValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentRtfValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentRtfValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentTarValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentTarValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/tar", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a TAR Tarball Archive file (TAR)
     * Validate a TAR tarball archive file (TAR)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentTarValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentTarValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentTarValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentTarValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentTxtValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentTxtValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an TXT file
     * Validate an TXT document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentTxtValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentTxtValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentTxtValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentTxtValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentXlsValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentXlsValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xls", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * Validate a Excel 97-2003 Legacy spreadsheet (XLS)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentXlsValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXlsValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentXlsValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXlsValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentXlsxValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentXlsxValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Excel document (XLSX)
     * Validate a Excel document (XLSX); if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentXlsxValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXlsxValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentXlsxValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXlsxValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentXmlValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentXmlValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an XML file
     * Validate an XML document file; if the document is not valid, identifies the errors in the document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentXmlValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXmlValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentXmlValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentXmlValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return XxeThreatDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentXmlXxeThreatValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentXmlXxeThreatValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XxeThreatDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeThreatDetectionResult>() {};
        return apiClient.invokeAPI("/convert/validate/xml/xxe-threats", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate an XML file for XML External Entity (XXE) threats
     * Validate an XML document file for XML External Entity (XXE) threats; if the document is not valid, identifies the errors in the document.  XXE threats are a type of threat that exploits vulnerabilities in the XML standard relating to external or local entity URIs in XML documents.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return XxeThreatDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XxeThreatDetectionResult> validateDocumentXmlXxeThreatValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XxeThreatDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeThreatDetectionResult>() {};
        return validateDocumentXmlXxeThreatValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XxeThreatDetectionResult>> validateDocumentXmlXxeThreatValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XxeThreatDetectionResult> localVarReturnType = new ParameterizedTypeReference<XxeThreatDetectionResult>() {};
        return validateDocumentXmlXxeThreatValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec validateDocumentZipValidationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling validateDocumentZipValidation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return apiClient.invokeAPI("/convert/validate/zip", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Validate a Zip Archive file (zip)
     * Validate a Zip archive file (ZIP)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocumentValidationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentValidationResult> validateDocumentZipValidation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentZipValidationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentValidationResult>> validateDocumentZipValidationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentValidationResult> localVarReturnType = new ParameterizedTypeReference<DocumentValidationResult>() {};
        return validateDocumentZipValidationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
}
