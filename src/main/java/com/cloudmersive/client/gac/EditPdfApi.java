package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AddPdfAnnotationRequest;
import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.gac.model.GetPdfAnnotationsResult;
import com.cloudmersive.client.gac.model.PdfFormFields;
import com.cloudmersive.client.gac.model.PdfMetadata;
import com.cloudmersive.client.gac.model.PdfTextByPageResult;
import com.cloudmersive.client.gac.model.SetPdfFormFieldsRequest;
import com.cloudmersive.client.gac.model.SetPdfMetadataRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:38.799299300-07:00[America/Los_Angeles]")
public class EditPdfApi {
    private ApiClient apiClient;

    public EditPdfApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditPdfApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add one or more PDF annotations, comments in the PDF document
     * Adds one or more annotations, comments to a PDF document.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfAddAnnotationsRequestCreation(AddPdfAnnotationRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editPdfAddAnnotations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/add-item", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add one or more PDF annotations, comments in the PDF document
     * Adds one or more annotations, comments to a PDF document.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfAddAnnotations(AddPdfAnnotationRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfAddAnnotationsRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfAddAnnotationsWithHttpInfo(AddPdfAnnotationRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfAddAnnotationsRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Convert a PDF file to PDF/A
     * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param conformanceLevel Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfConvertToPdfARequestCreation(org.springframework.core.io.AbstractResource inputFile, String conformanceLevel) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfConvertToPdfA", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (conformanceLevel != null)
        headerParams.add("conformanceLevel", apiClient.parameterToString(conformanceLevel));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/pdf-a", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert a PDF file to PDF/A
     * Converts the input PDF file to a PDF/A-1b or PDF/A-2b standardized PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param conformanceLevel Optional: Select the conformance level for PDF/A - specify &#39;1b&#39; for PDF/A-1b or specify &#39;2b&#39; for PDF/A-2b; default is PDF/A-1b
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfConvertToPdfA(org.springframework.core.io.AbstractResource inputFile, String conformanceLevel) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfConvertToPdfARequestCreation(inputFile, conformanceLevel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfConvertToPdfAWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String conformanceLevel) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfConvertToPdfARequestCreation(inputFile, conformanceLevel).toEntity(localVarReturnType);
    }
    /**
     * Decrypt and password-protect a PDF
     * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
     * <p><b>200</b> - OK
     * @param password Valid password for the PDF file
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfDecryptRequestCreation(String password, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new WebClientResponseException("Missing the required parameter 'password' when calling editPdfDecrypt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfDecrypt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (password != null)
        headerParams.add("password", apiClient.parameterToString(password));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/decrypt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Decrypt and password-protect a PDF
     * Decrypt a PDF document with a password.  Decrypted PDF will no longer require a password to open.
     * <p><b>200</b> - OK
     * @param password Valid password for the PDF file
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfDecrypt(String password, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfDecryptRequestCreation(password, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfDecryptWithHttpInfo(String password, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfDecryptRequestCreation(password, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Remove, delete pages from a PDF document
     * Remove one or more pages from a PDF document
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive).
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfDeletePagesRequestCreation(Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageStart' when calling editPdfDeletePages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageEnd' when calling editPdfDeletePages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfDeletePages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (pageStart != null)
        headerParams.add("pageStart", apiClient.parameterToString(pageStart));
        if (pageEnd != null)
        headerParams.add("pageEnd", apiClient.parameterToString(pageEnd));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/delete", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove, delete pages from a PDF document
     * Remove one or more pages from a PDF document
     * <p><b>200</b> - OK
     * @param pageStart Page number (1 based) to start deleting pages from (inclusive).
     * @param pageEnd Page number (1 based) to stop deleting pages from (inclusive).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfDeletePages(Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfDeletePagesRequestCreation(pageStart, pageEnd, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfDeletePagesWithHttpInfo(Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfDeletePagesRequestCreation(pageStart, pageEnd, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param userPassword Password of a user (reader) of the PDF file
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfEncryptRequestCreation(org.springframework.core.io.AbstractResource inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfEncrypt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (userPassword != null)
        headerParams.add("userPassword", apiClient.parameterToString(userPassword));
        if (ownerPassword != null)
        headerParams.add("ownerPassword", apiClient.parameterToString(ownerPassword));
        if (encryptionKeyLength != null)
        headerParams.add("encryptionKeyLength", apiClient.parameterToString(encryptionKeyLength));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/encrypt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Encrypt and password-protect a PDF
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param userPassword Password of a user (reader) of the PDF file
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfEncrypt(org.springframework.core.io.AbstractResource inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfEncryptRequestCreation(inputFile, userPassword, ownerPassword, encryptionKeyLength).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfEncryptWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String userPassword, String ownerPassword, String encryptionKeyLength) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfEncryptRequestCreation(inputFile, userPassword, ownerPassword, encryptionKeyLength).toEntity(localVarReturnType);
    }
    /**
     * Get PDF annotations, including comments in the document
     * Enumerates the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetPdfAnnotationsResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfGetAnnotationsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfGetAnnotations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GetPdfAnnotationsResult> localVarReturnType = new ParameterizedTypeReference<GetPdfAnnotationsResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PDF annotations, including comments in the document
     * Enumerates the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetPdfAnnotationsResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPdfAnnotationsResult> editPdfGetAnnotations(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetPdfAnnotationsResult> localVarReturnType = new ParameterizedTypeReference<GetPdfAnnotationsResult>() {};
        return editPdfGetAnnotationsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetPdfAnnotationsResult>> editPdfGetAnnotationsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetPdfAnnotationsResult> localVarReturnType = new ParameterizedTypeReference<GetPdfAnnotationsResult>() {};
        return editPdfGetAnnotationsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Gets PDF Form fields and values
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfFormFields
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfGetFormFieldsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfGetFormFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PdfFormFields> localVarReturnType = new ParameterizedTypeReference<PdfFormFields>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/form/get-fields", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets PDF Form fields and values
     * Encrypt a PDF document with a password.  Set an owner password to control owner (editor/creator) permissions, and set a user (reader) password to control the viewer of the PDF.  Set the password fields null to omit the given password.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfFormFields
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfFormFields> editPdfGetFormFields(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfFormFields> localVarReturnType = new ParameterizedTypeReference<PdfFormFields>() {};
        return editPdfGetFormFieldsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfFormFields>> editPdfGetFormFieldsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfFormFields> localVarReturnType = new ParameterizedTypeReference<PdfFormFields>() {};
        return editPdfGetFormFieldsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get PDF document metadata
     * Returns the metadata from the PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfMetadata
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfGetMetadataRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfGetMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PdfMetadata> localVarReturnType = new ParameterizedTypeReference<PdfMetadata>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/get-metadata", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PDF document metadata
     * Returns the metadata from the PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfMetadata
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfMetadata> editPdfGetMetadata(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfMetadata> localVarReturnType = new ParameterizedTypeReference<PdfMetadata>() {};
        return editPdfGetMetadataRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfMetadata>> editPdfGetMetadataWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfMetadata> localVarReturnType = new ParameterizedTypeReference<PdfMetadata>() {};
        return editPdfGetMetadataRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get text in a PDF document by page
     * Gets the text in a PDF by page
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return PdfTextByPageResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfGetPdfTextByPagesRequestCreation(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfGetPdfTextByPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (textFormattingMode != null)
        headerParams.add("textFormattingMode", apiClient.parameterToString(textFormattingMode));
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

        ParameterizedTypeReference<PdfTextByPageResult> localVarReturnType = new ParameterizedTypeReference<PdfTextByPageResult>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/pages/get-text", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get text in a PDF document by page
     * Gets the text in a PDF by page
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return PdfTextByPageResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfTextByPageResult> editPdfGetPdfTextByPages(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<PdfTextByPageResult> localVarReturnType = new ParameterizedTypeReference<PdfTextByPageResult>() {};
        return editPdfGetPdfTextByPagesRequestCreation(inputFile, textFormattingMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfTextByPageResult>> editPdfGetPdfTextByPagesWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<PdfTextByPageResult> localVarReturnType = new ParameterizedTypeReference<PdfTextByPageResult>() {};
        return editPdfGetPdfTextByPagesRequestCreation(inputFile, textFormattingMode).toEntity(localVarReturnType);
    }
    /**
     * Insert, copy pages from one PDF document into another
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file.
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file.
     * @param sourceFile Source PDF file to copy pages from.
     * @param destinationFile Destination PDF file to copy pages into.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfInsertPagesRequestCreation(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.AbstractResource sourceFile, org.springframework.core.io.AbstractResource destinationFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'pageStartSource' is set
        if (pageStartSource == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageStartSource' when calling editPdfInsertPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'pageEndSource' is set
        if (pageEndSource == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageEndSource' when calling editPdfInsertPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'pageInsertBeforeDesitnation' is set
        if (pageInsertBeforeDesitnation == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageInsertBeforeDesitnation' when calling editPdfInsertPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sourceFile' is set
        if (sourceFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'sourceFile' when calling editPdfInsertPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'destinationFile' is set
        if (destinationFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'destinationFile' when calling editPdfInsertPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (pageStartSource != null)
        headerParams.add("pageStartSource", apiClient.parameterToString(pageStartSource));
        if (pageEndSource != null)
        headerParams.add("pageEndSource", apiClient.parameterToString(pageEndSource));
        if (pageInsertBeforeDesitnation != null)
        headerParams.add("pageInsertBeforeDesitnation", apiClient.parameterToString(pageInsertBeforeDesitnation));
        if (sourceFile != null)
            formParams.add("sourceFile", sourceFile);
        if (destinationFile != null)
            formParams.add("destinationFile", destinationFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/insert", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert, copy pages from one PDF document into another
     * Copy one or more pages from one PDF document (source document) and insert them into a second PDF document (destination document).
     * <p><b>200</b> - OK
     * @param pageStartSource Page number (1 based) to start copying pages from (inclusive) in the Source file.
     * @param pageEndSource Page number (1 based) to stop copying pages pages from (inclusive) in the Source file.
     * @param pageInsertBeforeDesitnation Page number (1 based) to insert the pages before in the Destination file.
     * @param sourceFile Source PDF file to copy pages from.
     * @param destinationFile Destination PDF file to copy pages into.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfInsertPages(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.AbstractResource sourceFile, org.springframework.core.io.AbstractResource destinationFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfInsertPagesRequestCreation(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfInsertPagesWithHttpInfo(Integer pageStartSource, Integer pageEndSource, Integer pageInsertBeforeDesitnation, org.springframework.core.io.AbstractResource sourceFile, org.springframework.core.io.AbstractResource destinationFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfInsertPagesRequestCreation(pageStartSource, pageEndSource, pageInsertBeforeDesitnation, sourceFile, destinationFile).toEntity(localVarReturnType);
    }
    /**
     * Linearize and optimize a PDF for streaming download
     * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfLinearizeRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfLinearize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/linearize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Linearize and optimize a PDF for streaming download
     * Linearizes the content of a PDF to optimize it for streaming download, particularly over web streaming.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfLinearize(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfLinearizeRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfLinearizeWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfLinearizeRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Rasterize a PDF to an image-based PDF
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfRasterizeRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfRasterize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/rasterize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rasterize a PDF to an image-based PDF
     * Rasterize a PDF into an image-based PDF.  The output is a PDF where each page is comprised of a high-resolution image, with all text, figures and other components removed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfRasterize(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRasterizeRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfRasterizeWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRasterizeRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Reduce the file size and optimize a PDF
     * Reduces the file size and optimizes the content of a PDF to minimize its file size.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Quality level for the images in the PDF, ranging from 0.0 (low quality) to 1.0 (high quality); default is 0.3
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfReduceFileSizeRequestCreation(org.springframework.core.io.AbstractResource inputFile, BigDecimal quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfReduceFileSize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/optimize/reduce-file-size", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Reduce the file size and optimize a PDF
     * Reduces the file size and optimizes the content of a PDF to minimize its file size.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Quality level for the images in the PDF, ranging from 0.0 (low quality) to 1.0 (high quality); default is 0.3
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfReduceFileSize(org.springframework.core.io.AbstractResource inputFile, BigDecimal quality) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfReduceFileSizeRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfReduceFileSizeWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, BigDecimal quality) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfReduceFileSizeRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Remove all PDF annotations, including comments in the document
     * Removes all of the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfRemoveAllAnnotationsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfRemoveAllAnnotations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/remove-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove all PDF annotations, including comments in the document
     * Removes all of the annotations, including comments and notes, in a PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfRemoveAllAnnotations(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRemoveAllAnnotationsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfRemoveAllAnnotationsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRemoveAllAnnotationsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Remove a specific PDF annotation, comment in the document
     * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
     * <p><b>200</b> - OK
     * @param annotationIndex The 0-based index of the annotation in the document
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfRemoveAnnotationItemRequestCreation(Integer annotationIndex, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'annotationIndex' is set
        if (annotationIndex == null) {
            throw new WebClientResponseException("Missing the required parameter 'annotationIndex' when calling editPdfRemoveAnnotationItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfRemoveAnnotationItem", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (annotationIndex != null)
        headerParams.add("annotationIndex", apiClient.parameterToString(annotationIndex));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/annotations/remove-item", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove a specific PDF annotation, comment in the document
     * Removes a specific annotation in a PDF document, using the AnnotationIndex.  To enumerate AnnotationIndex for all of the annotations in the PDF document, use the /edit/pdf/annotations/list API.
     * <p><b>200</b> - OK
     * @param annotationIndex The 0-based index of the annotation in the document
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfRemoveAnnotationItem(Integer annotationIndex, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRemoveAnnotationItemRequestCreation(annotationIndex, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfRemoveAnnotationItemWithHttpInfo(Integer annotationIndex, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRemoveAnnotationItemRequestCreation(annotationIndex, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Change PDF Document&#39;s Paper Size
     * Resizes a PDF document&#39;s paper size.
     * <p><b>200</b> - OK
     * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfResizeRequestCreation(String paperSize, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'paperSize' is set
        if (paperSize == null) {
            throw new WebClientResponseException("Missing the required parameter 'paperSize' when calling editPdfResize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfResize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (paperSize != null)
        headerParams.add("paperSize", apiClient.parameterToString(paperSize));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/resize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Change PDF Document&#39;s Paper Size
     * Resizes a PDF document&#39;s paper size.
     * <p><b>200</b> - OK
     * @param paperSize The desired paper size for the resized PDF document. Size ranges from A7 (smallest) to A0 (largest).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfResize(String paperSize, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfResizeRequestCreation(paperSize, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfResizeWithHttpInfo(String paperSize, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfResizeRequestCreation(paperSize, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Rotate all pages in a PDF document
     * Rotate all of the pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfRotateAllPagesRequestCreation(Integer rotationAngle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new WebClientResponseException("Missing the required parameter 'rotationAngle' when calling editPdfRotateAllPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfRotateAllPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (rotationAngle != null)
        headerParams.add("rotationAngle", apiClient.parameterToString(rotationAngle));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/rotate/all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rotate all pages in a PDF document
     * Rotate all of the pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfRotateAllPages(Integer rotationAngle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRotateAllPagesRequestCreation(rotationAngle, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfRotateAllPagesWithHttpInfo(Integer rotationAngle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRotateAllPagesRequestCreation(rotationAngle, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Rotate a range, subset of pages in a PDF document
     * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
     * @param pageStart Page number (1 based) to start rotating pages from (inclusive).
     * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfRotatePageRangeRequestCreation(Integer rotationAngle, Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'rotationAngle' is set
        if (rotationAngle == null) {
            throw new WebClientResponseException("Missing the required parameter 'rotationAngle' when calling editPdfRotatePageRange", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'pageStart' is set
        if (pageStart == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageStart' when calling editPdfRotatePageRange", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'pageEnd' is set
        if (pageEnd == null) {
            throw new WebClientResponseException("Missing the required parameter 'pageEnd' when calling editPdfRotatePageRange", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfRotatePageRange", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (rotationAngle != null)
        headerParams.add("rotationAngle", apiClient.parameterToString(rotationAngle));
        if (pageStart != null)
        headerParams.add("pageStart", apiClient.parameterToString(pageStart));
        if (pageEnd != null)
        headerParams.add("pageEnd", apiClient.parameterToString(pageEnd));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/pages/rotate/page-range", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rotate a range, subset of pages in a PDF document
     * Rotate a range of specific pages in a PDF document by a multiple of 90 degrees
     * <p><b>200</b> - OK
     * @param rotationAngle The angle to rotate the page in degrees, must be a multiple of 90 degrees, e.g. 90, 180, 270, or -90, -180, -270, etc.
     * @param pageStart Page number (1 based) to start rotating pages from (inclusive).
     * @param pageEnd Page number (1 based) to stop rotating pages from (inclusive).
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfRotatePageRange(Integer rotationAngle, Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRotatePageRangeRequestCreation(rotationAngle, pageStart, pageEnd, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfRotatePageRangeWithHttpInfo(Integer rotationAngle, Integer pageStart, Integer pageEnd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfRotatePageRangeRequestCreation(rotationAngle, pageStart, pageEnd, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Sets ands fills PDF Form field values
     * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
     * <p><b>200</b> - OK
     * @param fieldValues The fieldValues parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfSetFormFieldsRequestCreation(SetPdfFormFieldsRequest fieldValues) throws WebClientResponseException {
        Object postBody = fieldValues;
        // verify the required parameter 'fieldValues' is set
        if (fieldValues == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldValues' when calling editPdfSetFormFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/pdf/form/set-fields", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets ands fills PDF Form field values
     * Fill in the form fields in a PDF form with specific values.  Use form/get-fields to enumerate the available fields and their data types in an input form.
     * <p><b>200</b> - OK
     * @param fieldValues The fieldValues parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfSetFormFields(SetPdfFormFieldsRequest fieldValues) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetFormFieldsRequestCreation(fieldValues).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfSetFormFieldsWithHttpInfo(SetPdfFormFieldsRequest fieldValues) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetFormFieldsRequestCreation(fieldValues).toEntity(localVarReturnType);
    }
    /**
     * Sets PDF document metadata
     * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfSetMetadataRequestCreation(SetPdfMetadataRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling editPdfSetMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/pdf/set-metadata", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets PDF document metadata
     * Sets (writes) metadata into the input PDF document, including Title, Author, etc.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfSetMetadata(SetPdfMetadataRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetMetadataRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfSetMetadataWithHttpInfo(SetPdfMetadataRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetMetadataRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * <p><b>200</b> - OK
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param inputFile Input file to perform the operation on.
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true.
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true.
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true.
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true.
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true.
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true.
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfSetPermissionsRequestCreation(String ownerPassword, String userPassword, org.springframework.core.io.AbstractResource inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'ownerPassword' is set
        if (ownerPassword == null) {
            throw new WebClientResponseException("Missing the required parameter 'ownerPassword' when calling editPdfSetPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'userPassword' is set
        if (userPassword == null) {
            throw new WebClientResponseException("Missing the required parameter 'userPassword' when calling editPdfSetPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfSetPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (ownerPassword != null)
        headerParams.add("ownerPassword", apiClient.parameterToString(ownerPassword));
        if (userPassword != null)
        headerParams.add("userPassword", apiClient.parameterToString(userPassword));
        if (encryptionKeyLength != null)
        headerParams.add("encryptionKeyLength", apiClient.parameterToString(encryptionKeyLength));
        if (allowPrinting != null)
        headerParams.add("allowPrinting", apiClient.parameterToString(allowPrinting));
        if (allowDocumentAssembly != null)
        headerParams.add("allowDocumentAssembly", apiClient.parameterToString(allowDocumentAssembly));
        if (allowContentExtraction != null)
        headerParams.add("allowContentExtraction", apiClient.parameterToString(allowContentExtraction));
        if (allowFormFilling != null)
        headerParams.add("allowFormFilling", apiClient.parameterToString(allowFormFilling));
        if (allowEditing != null)
        headerParams.add("allowEditing", apiClient.parameterToString(allowEditing));
        if (allowAnnotations != null)
        headerParams.add("allowAnnotations", apiClient.parameterToString(allowAnnotations));
        if (allowDegradedPrinting != null)
        headerParams.add("allowDegradedPrinting", apiClient.parameterToString(allowDegradedPrinting));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/encrypt/set-permissions", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Encrypt, password-protect and set restricted permissions on a PDF
     * Encrypt a PDF document with a password, and set permissions on the PDF.  Set an owner password to control owner (editor/creator) permissions [required], and set a user (reader) password to control the viewer of the PDF [optional].  Set the reader password to null to omit the password.  Restrict or allow printing, copying content, document assembly, editing (read-only), form filling, modification of annotations, and degraded printing through document Digital Rights Management (DRM).
     * <p><b>200</b> - OK
     * @param ownerPassword Password of a owner (creator/editor) of the PDF file (required)
     * @param userPassword Password of a user (reader) of the PDF file (optional)
     * @param inputFile Input file to perform the operation on.
     * @param encryptionKeyLength Possible values are \&quot;128\&quot; (128-bit RC4 encryption) and \&quot;256\&quot; (256-bit AES encryption).  Default is 256.
     * @param allowPrinting Set to false to disable printing through DRM.  Default is true.
     * @param allowDocumentAssembly Set to false to disable document assembly through DRM.  Default is true.
     * @param allowContentExtraction Set to false to disable copying/extracting content out of the PDF through DRM.  Default is true.
     * @param allowFormFilling Set to false to disable filling out form fields in the PDF through DRM.  Default is true.
     * @param allowEditing Set to false to disable editing in the PDF through DRM (making the PDF read-only).  Default is true.
     * @param allowAnnotations Set to false to disable annotations and editing of annotations in the PDF through DRM.  Default is true.
     * @param allowDegradedPrinting Set to false to disable degraded printing of the PDF through DRM.  Default is true.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfSetPermissions(String ownerPassword, String userPassword, org.springframework.core.io.AbstractResource inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetPermissionsRequestCreation(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfSetPermissionsWithHttpInfo(String ownerPassword, String userPassword, org.springframework.core.io.AbstractResource inputFile, String encryptionKeyLength, Boolean allowPrinting, Boolean allowDocumentAssembly, Boolean allowContentExtraction, Boolean allowFormFilling, Boolean allowEditing, Boolean allowAnnotations, Boolean allowDegradedPrinting) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfSetPermissionsRequestCreation(ownerPassword, userPassword, inputFile, encryptionKeyLength, allowPrinting, allowDocumentAssembly, allowContentExtraction, allowFormFilling, allowEditing, allowAnnotations, allowDegradedPrinting).toEntity(localVarReturnType);
    }
    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * <p><b>200</b> - OK
     * @param watermarkText Watermark text to add to the PDF (required)
     * @param inputFile Input file to perform the operation on.
     * @param fontName Font Family Name for the watermark text; default is Times New Roman
     * @param fontSize Font Size in points of the text; default is 150
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editPdfWatermarkTextRequestCreation(String watermarkText, org.springframework.core.io.AbstractResource inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'watermarkText' is set
        if (watermarkText == null) {
            throw new WebClientResponseException("Missing the required parameter 'watermarkText' when calling editPdfWatermarkText", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editPdfWatermarkText", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (watermarkText != null)
        headerParams.add("watermarkText", apiClient.parameterToString(watermarkText));
        if (fontName != null)
        headerParams.add("fontName", apiClient.parameterToString(fontName));
        if (fontSize != null)
        headerParams.add("fontSize", apiClient.parameterToString(fontSize));
        if (fontColor != null)
        headerParams.add("fontColor", apiClient.parameterToString(fontColor));
        if (fontTransparency != null)
        headerParams.add("fontTransparency", apiClient.parameterToString(fontTransparency));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/edit/pdf/watermark/text", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add a text watermark to a PDF
     * Adds a text watermark to a PDF
     * <p><b>200</b> - OK
     * @param watermarkText Watermark text to add to the PDF (required)
     * @param inputFile Input file to perform the operation on.
     * @param fontName Font Family Name for the watermark text; default is Times New Roman
     * @param fontSize Font Size in points of the text; default is 150
     * @param fontColor Font color in hexadecimal or HTML color name; default is Red
     * @param fontTransparency Font transparency between 0.0 (completely transparent) to 1.0 (fully opaque); default is 0.5
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editPdfWatermarkText(String watermarkText, org.springframework.core.io.AbstractResource inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfWatermarkTextRequestCreation(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editPdfWatermarkTextWithHttpInfo(String watermarkText, org.springframework.core.io.AbstractResource inputFile, String fontName, BigDecimal fontSize, String fontColor, BigDecimal fontTransparency) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editPdfWatermarkTextRequestCreation(watermarkText, inputFile, fontName, fontSize, fontColor, fontTransparency).toEntity(localVarReturnType);
    }
}
