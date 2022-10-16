package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.DocumentTransformEditSession;
import com.cloudmersive.client.gac.model.DocxTableTableFillMultiRequest;
import com.cloudmersive.client.gac.model.DocxTableTableFillRequest;
import java.io.File;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class TransformDocumentApi {
    private ApiClient apiClient;

    public TransformDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public TransformDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Replace string in Word DOCX document, return result
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentDocxReplaceRequestCreation(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new WebClientResponseException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new WebClientResponseException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));
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
        return apiClient.invokeAPI("/convert/transform/docx/replace-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace string in Word DOCX document, return result
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> transformDocumentDocxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxReplaceRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> transformDocumentDocxReplaceWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxReplaceRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Replace string in Word DOCX document, return edit session
     * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return DocumentTransformEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentDocxReplaceEditSessionRequestCreation(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new WebClientResponseException("Missing the required parameter 'matchString' when calling transformDocumentDocxReplaceEditSession", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new WebClientResponseException("Missing the required parameter 'replaceString' when calling transformDocumentDocxReplaceEditSession", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));
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

        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI("/convert/transform/docx/replace-all/edit-session", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace string in Word DOCX document, return edit session
     * Replace all instances of a string in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return DocumentTransformEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentTransformEditSession> transformDocumentDocxReplaceEditSession(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return transformDocumentDocxReplaceEditSessionRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentTransformEditSession>> transformDocumentDocxReplaceEditSessionWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return transformDocumentDocxReplaceEditSessionRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Fill in data in a table in a Word DOCX document, return result
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentDocxTableFillInRequestCreation(DocxTableTableFillRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillIn", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fill in data in a table in a Word DOCX document, return result
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> transformDocumentDocxTableFillIn(DocxTableTableFillRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxTableFillInRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> transformDocumentDocxTableFillInWithHttpInfo(DocxTableTableFillRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxTableFillInRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Fill in data in a table in a Word DOCX document, return edit session
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return DocumentTransformEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentDocxTableFillInEditSessionRequestCreation(DocxTableTableFillRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInEditSession", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data/edit-session", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fill in data in a table in a Word DOCX document, return edit session
     * Replace placeholder rows ina  table in an Office Word Document (docx) using one or more templates.  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return DocumentTransformEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentTransformEditSession> transformDocumentDocxTableFillInEditSession(DocxTableTableFillRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return transformDocumentDocxTableFillInEditSessionRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentTransformEditSession>> transformDocumentDocxTableFillInEditSessionWithHttpInfo(DocxTableTableFillRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentTransformEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentTransformEditSession>() {};
        return transformDocumentDocxTableFillInEditSessionRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Fill in data in multiple tables in a Word DOCX document, return result
     * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentDocxTableFillInMultiRequestCreation(DocxTableTableFillMultiRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling transformDocumentDocxTableFillInMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/transform/docx/table/fill/data/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Fill in data in multiple tables in a Word DOCX document, return result
     * Replace placeholder rows in multiple tables in an Office Word Document (docx) using one or more templates
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> transformDocumentDocxTableFillInMulti(DocxTableTableFillMultiRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxTableFillInMultiRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> transformDocumentDocxTableFillInMultiWithHttpInfo(DocxTableTableFillMultiRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentDocxTableFillInMultiRequestCreation(request).toEntity(localVarReturnType);
    }
    /**
     * Replace string in PowerPoint PPTX presentation, return result
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec transformDocumentPptxReplaceRequestCreation(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'matchString' is set
        if (matchString == null) {
            throw new WebClientResponseException("Missing the required parameter 'matchString' when calling transformDocumentPptxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'replaceString' is set
        if (replaceString == null) {
            throw new WebClientResponseException("Missing the required parameter 'replaceString' when calling transformDocumentPptxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (matchString != null)
        headerParams.add("matchString", apiClient.parameterToString(matchString));
        if (replaceString != null)
        headerParams.add("replaceString", apiClient.parameterToString(replaceString));
        if (matchCase != null)
        headerParams.add("matchCase", apiClient.parameterToString(matchCase));
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
        return apiClient.invokeAPI("/convert/transform/pptx/replace-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace string in PowerPoint PPTX presentation, return result
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param matchString String to search for and match against, to be replaced
     * @param replaceString String to replace the matched values with
     * @param inputFileUrl Optional: URL of a file to operate on as input.  This can be a public URL, or you can also use the begin-editing API (part of EditDocumentApi) to upload a document and pass in the secure URL result from that operation as the URL here (this URL is not public).
     * @param matchCase Optional: True if the case should be matched, false for case insensitive match. Default is false.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> transformDocumentPptxReplace(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentPptxReplaceRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> transformDocumentPptxReplaceWithHttpInfo(String matchString, String replaceString, String inputFileUrl, Boolean matchCase, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return transformDocumentPptxReplaceRequestCreation(matchString, replaceString, inputFileUrl, matchCase, inputFile).toEntity(localVarReturnType);
    }
}
