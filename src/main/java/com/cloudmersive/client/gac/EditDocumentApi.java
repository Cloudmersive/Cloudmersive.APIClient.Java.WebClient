package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AppendXlsxRowRequest;
import com.cloudmersive.client.gac.model.AppendXlsxRowResponse;
import com.cloudmersive.client.gac.model.ClearXlsxCellRequest;
import com.cloudmersive.client.gac.model.ClearXlsxCellResponse;
import com.cloudmersive.client.gac.model.ClearXlsxRowRequest;
import com.cloudmersive.client.gac.model.ClearXlsxRowResponse;
import com.cloudmersive.client.gac.model.CreateBlankDocxRequest;
import com.cloudmersive.client.gac.model.CreateBlankDocxResponse;
import com.cloudmersive.client.gac.model.CreateBlankSpreadsheetRequest;
import com.cloudmersive.client.gac.model.CreateBlankSpreadsheetResponse;
import com.cloudmersive.client.gac.model.CreateSpreadsheetFromDataRequest;
import com.cloudmersive.client.gac.model.CreateSpreadsheetFromDataResponse;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRangeRequest;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRangeResponse;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowRequest;
import com.cloudmersive.client.gac.model.DeleteDocxTableRowResponse;
import com.cloudmersive.client.gac.model.DisableSharedWorkbookRequest;
import com.cloudmersive.client.gac.model.DisableSharedWorkbookResponse;
import com.cloudmersive.client.gac.model.DocumentEditingEditSession;
import com.cloudmersive.client.gac.model.DocxInsertCommentOnParagraphRequest;
import com.cloudmersive.client.gac.model.DocxInsertImageRequest;
import com.cloudmersive.client.gac.model.DocxInsertImageResponse;
import com.cloudmersive.client.gac.model.DocxRemoveObjectRequest;
import com.cloudmersive.client.gac.model.DocxRemoveObjectResponse;
import com.cloudmersive.client.gac.model.DocxSetCustomMetadataPropertiesRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterAddPageNumberRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterRequest;
import com.cloudmersive.client.gac.model.DocxSetFooterResponse;
import com.cloudmersive.client.gac.model.DocxSetFormFieldsRequest;
import com.cloudmersive.client.gac.model.DocxSetHeaderRequest;
import com.cloudmersive.client.gac.model.DocxSetHeaderResponse;
import com.cloudmersive.client.gac.model.EnableSharedWorkbookRequest;
import com.cloudmersive.client.gac.model.EnableSharedWorkbookResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.FindDocxParagraphRequest;
import com.cloudmersive.client.gac.model.FindDocxParagraphResponse;
import com.cloudmersive.client.gac.model.FinishEditingRequest;
import com.cloudmersive.client.gac.model.GetDocxBodyRequest;
import com.cloudmersive.client.gac.model.GetDocxBodyResponse;
import com.cloudmersive.client.gac.model.GetDocxCommentsHierarchicalResponse;
import com.cloudmersive.client.gac.model.GetDocxCommentsResponse;
import com.cloudmersive.client.gac.model.GetDocxContentControlsResponse;
import com.cloudmersive.client.gac.model.GetDocxGetCommentsHierarchicalRequest;
import com.cloudmersive.client.gac.model.GetDocxGetCommentsRequest;
import com.cloudmersive.client.gac.model.GetDocxGetFormFieldsResponse;
import com.cloudmersive.client.gac.model.GetDocxHeadersAndFootersRequest;
import com.cloudmersive.client.gac.model.GetDocxHeadersAndFootersResponse;
import com.cloudmersive.client.gac.model.GetDocxImagesRequest;
import com.cloudmersive.client.gac.model.GetDocxImagesResponse;
import com.cloudmersive.client.gac.model.GetDocxMetadataPropertiesResponse;
import com.cloudmersive.client.gac.model.GetDocxPagesRequest;
import com.cloudmersive.client.gac.model.GetDocxPagesResponse;
import com.cloudmersive.client.gac.model.GetDocxSectionsRequest;
import com.cloudmersive.client.gac.model.GetDocxSectionsResponse;
import com.cloudmersive.client.gac.model.GetDocxStylesRequest;
import com.cloudmersive.client.gac.model.GetDocxStylesResponse;
import com.cloudmersive.client.gac.model.GetDocxTableByIndexRequest;
import com.cloudmersive.client.gac.model.GetDocxTableByIndexResponse;
import com.cloudmersive.client.gac.model.GetDocxTableRowRequest;
import com.cloudmersive.client.gac.model.GetDocxTableRowResponse;
import com.cloudmersive.client.gac.model.GetDocxTablesRequest;
import com.cloudmersive.client.gac.model.GetDocxTablesResponse;
import com.cloudmersive.client.gac.model.GetMacrosResponse;
import com.cloudmersive.client.gac.model.GetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.gac.model.GetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.gac.model.GetXlsxCellRequest;
import com.cloudmersive.client.gac.model.GetXlsxCellResponse;
import com.cloudmersive.client.gac.model.GetXlsxColumnsRequest;
import com.cloudmersive.client.gac.model.GetXlsxColumnsResponse;
import com.cloudmersive.client.gac.model.GetXlsxImagesRequest;
import com.cloudmersive.client.gac.model.GetXlsxImagesResponse;
import com.cloudmersive.client.gac.model.GetXlsxRowsAndCellsRequest;
import com.cloudmersive.client.gac.model.GetXlsxRowsAndCellsResponse;
import com.cloudmersive.client.gac.model.GetXlsxSpecificRowRequest;
import com.cloudmersive.client.gac.model.GetXlsxSpecificRowResponse;
import com.cloudmersive.client.gac.model.GetXlsxStylesRequest;
import com.cloudmersive.client.gac.model.GetXlsxStylesResponse;
import com.cloudmersive.client.gac.model.GetXlsxWorksheetsRequest;
import com.cloudmersive.client.gac.model.GetXlsxWorksheetsResponse;
import com.cloudmersive.client.gac.model.InsertDocxCommentOnParagraphResponse;
import com.cloudmersive.client.gac.model.InsertDocxInsertParagraphRequest;
import com.cloudmersive.client.gac.model.InsertDocxInsertParagraphResponse;
import com.cloudmersive.client.gac.model.InsertDocxTableRowRequest;
import com.cloudmersive.client.gac.model.InsertDocxTableRowResponse;
import com.cloudmersive.client.gac.model.InsertDocxTablesRequest;
import com.cloudmersive.client.gac.model.InsertDocxTablesResponse;
import com.cloudmersive.client.gac.model.InsertXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.InsertXlsxWorksheetResponse;
import com.cloudmersive.client.gac.model.MultiReplaceStringRequest;
import com.cloudmersive.client.gac.model.RemoveDocxHeadersAndFootersRequest;
import com.cloudmersive.client.gac.model.RemoveDocxHeadersAndFootersResponse;
import com.cloudmersive.client.gac.model.RemoveDocxPagesRequest;
import com.cloudmersive.client.gac.model.RemovePptxSlidesRequest;
import com.cloudmersive.client.gac.model.RemoveXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.RenameXlsxWorksheetRequest;
import com.cloudmersive.client.gac.model.RenameXlsxWorksheetResponse;
import com.cloudmersive.client.gac.model.ReplaceDocxParagraphRequest;
import com.cloudmersive.client.gac.model.ReplaceDocxParagraphResponse;
import com.cloudmersive.client.gac.model.ReplaceStringRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellByIdentifierRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellByIdentifierResponse;
import com.cloudmersive.client.gac.model.SetXlsxCellRequest;
import com.cloudmersive.client.gac.model.SetXlsxCellResponse;
import com.cloudmersive.client.gac.model.UpdateDocxTableCellRequest;
import com.cloudmersive.client.gac.model.UpdateDocxTableCellResponse;
import com.cloudmersive.client.gac.model.UpdateDocxTableRowRequest;
import com.cloudmersive.client.gac.model.UpdateDocxTableRowResponse;

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
public class EditDocumentApi {
    private ApiClient apiClient;

    public EditDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Begin editing a document
     * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentBeginEditingRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentBeginEditing", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/convert/edit/begin-editing", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Begin editing a document
     * Uploads a document to Cloudmersive to begin a series of one or more editing operations.  To edit a document, first call Begin Editing on the document.  Then perform operations on the document using the secure URL returned from BeginEditing, such as Word DOCX Delete Pages and Insert Table.  Finally, perform finish editing on the URL to return the resulting edited document.  The editing URL is temporary and only stored in-memory cache, and will automatically expire from the cache after 30 minutes, and cannot be directly accessed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return String
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<String> editDocumentBeginEditing(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return editDocumentBeginEditingRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<String>> editDocumentBeginEditingWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<String> localVarReturnType = new ParameterizedTypeReference<String>() {};
        return editDocumentBeginEditingRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Accept all tracked changes, revisions in a Word DOCX document
     * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxAcceptAllTrackChangesRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxAcceptAllTrackChanges", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/accept-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Accept all tracked changes, revisions in a Word DOCX document
     * Accepts all tracked changes and revisions in a Word DOCX document.  This will accept all pending changes in the document when tracked changes is turned on.  Track changes will remain on (if it is on) after this oepration is completed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxAcceptAllTrackChanges(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxAcceptAllTrackChangesRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxAcceptAllTrackChangesWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxAcceptAllTrackChangesRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get body from a Word DOCX document
     * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxBodyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxBodyRequestCreation(GetDocxBodyRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxBody", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxBodyResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxBodyResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-body", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get body from a Word DOCX document
     * Returns the body defined in the Word Document (DOCX) format file; this is the main content part of a DOCX document
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxBodyResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxBodyResponse> editDocumentDocxBody(GetDocxBodyRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxBodyResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxBodyResponse>() {};
        return editDocumentDocxBodyRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxBodyResponse>> editDocumentDocxBodyWithHttpInfo(GetDocxBodyRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxBodyResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxBodyResponse>() {};
        return editDocumentDocxBodyRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Create a blank Word DOCX document
     * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateBlankDocxResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxCreateBlankDocumentRequestCreation(CreateBlankDocxRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentDocxCreateBlankDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreateBlankDocxResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankDocxResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/create/blank", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a blank Word DOCX document
     * Returns a blank Word DOCX Document format file.  The file is blank, with no contents.  Use additional editing commands such as Insert Paragraph or Insert Table or Insert Image to populate the document.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateBlankDocxResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateBlankDocxResponse> editDocumentDocxCreateBlankDocument(CreateBlankDocxRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateBlankDocxResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankDocxResponse>() {};
        return editDocumentDocxCreateBlankDocumentRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CreateBlankDocxResponse>> editDocumentDocxCreateBlankDocumentWithHttpInfo(CreateBlankDocxRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateBlankDocxResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankDocxResponse>() {};
        return editDocumentDocxCreateBlankDocumentRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Delete, remove pages from a Word DOCX document
     * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxDeletePagesRequestCreation(RemoveDocxPagesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeletePages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/docx/delete-pages", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete, remove pages from a Word DOCX document
     * Returns the edited Word Document in the Word Document (DOCX) format file with the specified pages removed
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxDeletePages(RemoveDocxPagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxDeletePagesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxDeletePagesWithHttpInfo(RemoveDocxPagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxDeletePagesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Deletes a table row in an existing table in a Word DOCX document
     * Deletes an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DeleteDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxDeleteTableRowRequestCreation(DeleteDocxTableRowRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DeleteDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/delete-table-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a table row in an existing table in a Word DOCX document
     * Deletes an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DeleteDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DeleteDocxTableRowResponse> editDocumentDocxDeleteTableRow(DeleteDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowResponse>() {};
        return editDocumentDocxDeleteTableRowRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DeleteDocxTableRowResponse>> editDocumentDocxDeleteTableRowWithHttpInfo(DeleteDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowResponse>() {};
        return editDocumentDocxDeleteTableRowRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Deletes a range of multiple table rows in an existing table in a Word DOCX document
     * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DeleteDocxTableRowRangeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxDeleteTableRowRangeRequestCreation(DeleteDocxTableRowRangeRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxDeleteTableRowRange", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DeleteDocxTableRowRangeResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowRangeResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/delete-table-row/range", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Deletes a range of multiple table rows in an existing table in a Word DOCX document
     * Deletes a range of 1 or more existing table rows in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DeleteDocxTableRowRangeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DeleteDocxTableRowRangeResponse> editDocumentDocxDeleteTableRowRange(DeleteDocxTableRowRangeRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteDocxTableRowRangeResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowRangeResponse>() {};
        return editDocumentDocxDeleteTableRowRangeRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DeleteDocxTableRowRangeResponse>> editDocumentDocxDeleteTableRowRangeWithHttpInfo(DeleteDocxTableRowRangeRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteDocxTableRowRangeResponse> localVarReturnType = new ParameterizedTypeReference<DeleteDocxTableRowRangeResponse>() {};
        return editDocumentDocxDeleteTableRowRangeRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Disable track changes, revisions in a Word DOCX document
     * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxDisableTrackChangesRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxDisableTrackChanges", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/disable", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Disable track changes, revisions in a Word DOCX document
     * Diables tracking of changes and revisions in a Word DOCX document, and accepts any pending changes.  Users editing the document will no longer see changes tracked automatically.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxDisableTrackChanges(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxDisableTrackChangesRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxDisableTrackChangesWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxDisableTrackChangesRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Enable track changes, revisions in a Word DOCX document
     * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxEnableTrackChangesRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxEnableTrackChanges", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/track-changes/enable", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Enable track changes, revisions in a Word DOCX document
     * Enables tracking of changes and revisions in a Word DOCX document.  Users editing the document will see changes tracked automatically, with edits highlighted, and the ability to accept or reject changes made to the document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxEnableTrackChanges(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxEnableTrackChangesRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxEnableTrackChangesWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxEnableTrackChangesRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Find matching paragraphs in a Word DOCX document
     * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return FindDocxParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxFindParagraphRequestCreation(FindDocxParagraphRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxFindParagraph", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FindDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<FindDocxParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/find/paragraph", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find matching paragraphs in a Word DOCX document
     * Returns the paragraphs defined in the Word Document (DOCX) format file that match the input criteria
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return FindDocxParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FindDocxParagraphResponse> editDocumentDocxFindParagraph(FindDocxParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<FindDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<FindDocxParagraphResponse>() {};
        return editDocumentDocxFindParagraphRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FindDocxParagraphResponse>> editDocumentDocxFindParagraphWithHttpInfo(FindDocxParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<FindDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<FindDocxParagraphResponse>() {};
        return editDocumentDocxFindParagraphRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get comments from a Word DOCX document as a flat list
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxCommentsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetCommentsRequestCreation(GetDocxGetCommentsRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetComments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxCommentsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-comments/flat-list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get comments from a Word DOCX document as a flat list
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file as a flattened list (not as a hierarchy of comments and replies).
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxCommentsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxCommentsResponse> editDocumentDocxGetComments(GetDocxGetCommentsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxCommentsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsResponse>() {};
        return editDocumentDocxGetCommentsRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxCommentsResponse>> editDocumentDocxGetCommentsWithHttpInfo(GetDocxGetCommentsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxCommentsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsResponse>() {};
        return editDocumentDocxGetCommentsRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get comments from a Word DOCX document hierarchically
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxCommentsHierarchicalResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetCommentsHierarchicalRequestCreation(GetDocxGetCommentsHierarchicalRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetCommentsHierarchical", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-comments/hierarchical", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get comments from a Word DOCX document hierarchically
     * Returns the comments and review annotations stored in the Word Document (DOCX) format file hierarchically, where reply comments are nested as children under top-level comments in the results returned.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxCommentsHierarchicalResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxCommentsHierarchicalResponse> editDocumentDocxGetCommentsHierarchical(GetDocxGetCommentsHierarchicalRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return editDocumentDocxGetCommentsHierarchicalRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxCommentsHierarchicalResponse>> editDocumentDocxGetCommentsHierarchicalWithHttpInfo(GetDocxGetCommentsHierarchicalRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxCommentsHierarchicalResponse>() {};
        return editDocumentDocxGetCommentsHierarchicalRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get all content controls (form fields) and values in a Word DOCX document
     * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxContentControlsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetContentControlsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetContentControls", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxContentControlsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxContentControlsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-content-controls", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all content controls (form fields) and values in a Word DOCX document
     * Returns all the content controls, used for creating form fields, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxContentControlsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxContentControlsResponse> editDocumentDocxGetContentControls(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxContentControlsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxContentControlsResponse>() {};
        return editDocumentDocxGetContentControlsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxContentControlsResponse>> editDocumentDocxGetContentControlsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxContentControlsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxContentControlsResponse>() {};
        return editDocumentDocxGetContentControlsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get all form fields in a Word DOCX document
     * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxGetFormFieldsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetFormFieldsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetFormFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxGetFormFieldsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxGetFormFieldsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-form-fields", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all form fields in a Word DOCX document
     * Returns all the content controls, used for creating form fields, as well as handlebar style text-based form fields such as \&quot;{{FieldName}}\&quot;, in a Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxGetFormFieldsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxGetFormFieldsResponse> editDocumentDocxGetFormFields(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxGetFormFieldsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxGetFormFieldsResponse>() {};
        return editDocumentDocxGetFormFieldsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxGetFormFieldsResponse>> editDocumentDocxGetFormFieldsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxGetFormFieldsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxGetFormFieldsResponse>() {};
        return editDocumentDocxGetFormFieldsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get content of a footer from a Word DOCX document
     * Returns the footer content from a Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxHeadersAndFootersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetHeadersAndFootersRequestCreation(GetDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetHeadersAndFooters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxHeadersAndFootersResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-headers-and-footers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get content of a footer from a Word DOCX document
     * Returns the footer content from a Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxHeadersAndFootersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxHeadersAndFootersResponse> editDocumentDocxGetHeadersAndFooters(GetDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxHeadersAndFootersResponse>() {};
        return editDocumentDocxGetHeadersAndFootersRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxHeadersAndFootersResponse>> editDocumentDocxGetHeadersAndFootersWithHttpInfo(GetDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxHeadersAndFootersResponse>() {};
        return editDocumentDocxGetHeadersAndFootersRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get images from a Word DOCX document
     * Returns the images defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxImagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetImagesRequestCreation(GetDocxImagesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetImages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxImagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-images", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get images from a Word DOCX document
     * Returns the images defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxImagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxImagesResponse> editDocumentDocxGetImages(GetDocxImagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxImagesResponse>() {};
        return editDocumentDocxGetImagesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxImagesResponse>> editDocumentDocxGetImagesWithHttpInfo(GetDocxImagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxImagesResponse>() {};
        return editDocumentDocxGetImagesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get macro information from a Word DOCX/DOCM document
     * Returns information about the Macros (e.g. VBA) defined in the Word Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetMacroInformationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMacroInformation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-macros", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get macro information from a Word DOCX/DOCM document
     * Returns information about the Macros (e.g. VBA) defined in the Word Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMacrosResponse> editDocumentDocxGetMacroInformation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentDocxGetMacroInformationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetMacrosResponse>> editDocumentDocxGetMacroInformationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentDocxGetMacroInformationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get all metadata properties in Word DOCX document
     * Returns all the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxMetadataPropertiesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetMetadataPropertiesRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxGetMetadataProperties", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxMetadataPropertiesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxMetadataPropertiesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-metadata", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all metadata properties in Word DOCX document
     * Returns all the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetDocxMetadataPropertiesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxMetadataPropertiesResponse> editDocumentDocxGetMetadataProperties(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxMetadataPropertiesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxMetadataPropertiesResponse>() {};
        return editDocumentDocxGetMetadataPropertiesRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxMetadataPropertiesResponse>> editDocumentDocxGetMetadataPropertiesWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxMetadataPropertiesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxMetadataPropertiesResponse>() {};
        return editDocumentDocxGetMetadataPropertiesRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get sections from a Word DOCX document
     * Returns the sections defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxSectionsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetSectionsRequestCreation(GetDocxSectionsRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetSections", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxSectionsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxSectionsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-sections", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get sections from a Word DOCX document
     * Returns the sections defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxSectionsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxSectionsResponse> editDocumentDocxGetSections(GetDocxSectionsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxSectionsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxSectionsResponse>() {};
        return editDocumentDocxGetSectionsRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxSectionsResponse>> editDocumentDocxGetSectionsWithHttpInfo(GetDocxSectionsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxSectionsResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxSectionsResponse>() {};
        return editDocumentDocxGetSectionsRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get styles from a Word DOCX document
     * Returns the styles defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxStylesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetStylesRequestCreation(GetDocxStylesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetStyles", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxStylesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-styles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get styles from a Word DOCX document
     * Returns the styles defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxStylesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxStylesResponse> editDocumentDocxGetStyles(GetDocxStylesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxStylesResponse>() {};
        return editDocumentDocxGetStylesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxStylesResponse>> editDocumentDocxGetStylesWithHttpInfo(GetDocxStylesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxStylesResponse>() {};
        return editDocumentDocxGetStylesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get a specific table by index in a Word DOCX document
     * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTableByIndexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetTableByIndexRequestCreation(GetDocxTableByIndexRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableByIndex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxTableByIndexResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableByIndexResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-table/by-index", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a specific table by index in a Word DOCX document
     * Returns the specific table object by its 0-based index in an Office Word Document (DOCX)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTableByIndexResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxTableByIndexResponse> editDocumentDocxGetTableByIndex(GetDocxTableByIndexRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTableByIndexResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableByIndexResponse>() {};
        return editDocumentDocxGetTableByIndexRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxTableByIndexResponse>> editDocumentDocxGetTableByIndexWithHttpInfo(GetDocxTableByIndexRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTableByIndexResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableByIndexResponse>() {};
        return editDocumentDocxGetTableByIndexRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Gets the contents of an existing table row in an existing table in a Word DOCX document
     * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetTableRowRequestCreation(GetDocxTableRowRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTableRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-table-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the contents of an existing table row in an existing table in a Word DOCX document
     * Gets the contents of an existing table row in a Word DOCX Document and returns the result.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxTableRowResponse> editDocumentDocxGetTableRow(GetDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableRowResponse>() {};
        return editDocumentDocxGetTableRowRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxTableRowResponse>> editDocumentDocxGetTableRowWithHttpInfo(GetDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTableRowResponse>() {};
        return editDocumentDocxGetTableRowRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get all tables in Word DOCX document
     * Returns all the table objects in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTablesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxGetTablesRequestCreation(GetDocxTablesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxGetTables", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTablesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-tables", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all tables in Word DOCX document
     * Returns all the table objects in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxTablesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxTablesResponse> editDocumentDocxGetTables(GetDocxTablesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTablesResponse>() {};
        return editDocumentDocxGetTablesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxTablesResponse>> editDocumentDocxGetTablesWithHttpInfo(GetDocxTablesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxTablesResponse>() {};
        return editDocumentDocxGetTablesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Insert a new comment into a Word DOCX document attached to a paragraph
     * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxCommentOnParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxInsertCommentOnParagraphRequestCreation(DocxInsertCommentOnParagraphRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertCommentOnParagraph", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-comment/on/paragraph", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert a new comment into a Word DOCX document attached to a paragraph
     * Adds a new comment into a Word DOCX document attached to a paragraph and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxCommentOnParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InsertDocxCommentOnParagraphResponse> editDocumentDocxInsertCommentOnParagraph(DocxInsertCommentOnParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return editDocumentDocxInsertCommentOnParagraphRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<InsertDocxCommentOnParagraphResponse>> editDocumentDocxInsertCommentOnParagraphWithHttpInfo(DocxInsertCommentOnParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxCommentOnParagraphResponse>() {};
        return editDocumentDocxInsertCommentOnParagraphRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Insert image into a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxInsertImageResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxInsertImageRequestCreation(DocxInsertImageRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertImage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxInsertImageResponse> localVarReturnType = new ParameterizedTypeReference<DocxInsertImageResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-image", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert image into a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxInsertImageResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxInsertImageResponse> editDocumentDocxInsertImage(DocxInsertImageRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxInsertImageResponse> localVarReturnType = new ParameterizedTypeReference<DocxInsertImageResponse>() {};
        return editDocumentDocxInsertImageRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxInsertImageResponse>> editDocumentDocxInsertImageWithHttpInfo(DocxInsertImageRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxInsertImageResponse> localVarReturnType = new ParameterizedTypeReference<DocxInsertImageResponse>() {};
        return editDocumentDocxInsertImageRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Insert a new paragraph into a Word DOCX document
     * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxInsertParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxInsertParagraphRequestCreation(InsertDocxInsertParagraphRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertParagraph", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InsertDocxInsertParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxInsertParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-paragraph", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert a new paragraph into a Word DOCX document
     * Adds a new paragraph into a DOCX and returns the result.  You can insert at the beginning/end of a document, or before/after an existing object using its Path (location within the document).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxInsertParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InsertDocxInsertParagraphResponse> editDocumentDocxInsertParagraph(InsertDocxInsertParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxInsertParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxInsertParagraphResponse>() {};
        return editDocumentDocxInsertParagraphRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<InsertDocxInsertParagraphResponse>> editDocumentDocxInsertParagraphWithHttpInfo(InsertDocxInsertParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxInsertParagraphResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxInsertParagraphResponse>() {};
        return editDocumentDocxInsertParagraphRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Insert a new table into a Word DOCX document
     * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxTablesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxInsertTableRequestCreation(InsertDocxTablesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTable", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InsertDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTablesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-table", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert a new table into a Word DOCX document
     * Adds a new table into a DOCX and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxTablesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InsertDocxTablesResponse> editDocumentDocxInsertTable(InsertDocxTablesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTablesResponse>() {};
        return editDocumentDocxInsertTableRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<InsertDocxTablesResponse>> editDocumentDocxInsertTableWithHttpInfo(InsertDocxTablesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxTablesResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTablesResponse>() {};
        return editDocumentDocxInsertTableRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Insert a new row into an existing table in a Word DOCX document
     * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxInsertTableRowRequestCreation(InsertDocxTableRowRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxInsertTableRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InsertDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/insert-table-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert a new row into an existing table in a Word DOCX document
     * Adds a new table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return InsertDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InsertDocxTableRowResponse> editDocumentDocxInsertTableRow(InsertDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTableRowResponse>() {};
        return editDocumentDocxInsertTableRowRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<InsertDocxTableRowResponse>> editDocumentDocxInsertTableRowWithHttpInfo(InsertDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<InsertDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<InsertDocxTableRowResponse>() {};
        return editDocumentDocxInsertTableRowRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get pages and content from a Word DOCX document
     * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxPagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxPagesRequestCreation(GetDocxPagesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxPages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocxPagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxPagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/get-pages", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get pages and content from a Word DOCX document
     * Returns the pages and contents of each page defined in the Word Document (DOCX) format file
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return GetDocxPagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocxPagesResponse> editDocumentDocxPages(GetDocxPagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxPagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxPagesResponse>() {};
        return editDocumentDocxPagesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetDocxPagesResponse>> editDocumentDocxPagesWithHttpInfo(GetDocxPagesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocxPagesResponse> localVarReturnType = new ParameterizedTypeReference<GetDocxPagesResponse>() {};
        return editDocumentDocxPagesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Remove all comments from a Word DOCX document
     * Removes all of the comments from a Word Document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxRemoveAllCommentsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentDocxRemoveAllComments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/docx/comments/remove-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove all comments from a Word DOCX document
     * Removes all of the comments from a Word Document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxRemoveAllComments(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxRemoveAllCommentsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxRemoveAllCommentsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxRemoveAllCommentsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Remove headers and footers from Word DOCX document
     * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return RemoveDocxHeadersAndFootersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxRemoveHeadersAndFootersRequestCreation(RemoveDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveHeadersAndFooters", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/remove-headers-and-footers", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove headers and footers from Word DOCX document
     * Remove all headers, or footers, or both from a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return RemoveDocxHeadersAndFootersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoveDocxHeadersAndFootersResponse> editDocumentDocxRemoveHeadersAndFooters(RemoveDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return editDocumentDocxRemoveHeadersAndFootersRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RemoveDocxHeadersAndFootersResponse>> editDocumentDocxRemoveHeadersAndFootersWithHttpInfo(RemoveDocxHeadersAndFootersRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse> localVarReturnType = new ParameterizedTypeReference<RemoveDocxHeadersAndFootersResponse>() {};
        return editDocumentDocxRemoveHeadersAndFootersRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Delete any object in a Word DOCX document
     * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxRemoveObjectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxRemoveObjectRequestCreation(DocxRemoveObjectRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxRemoveObject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxRemoveObjectResponse> localVarReturnType = new ParameterizedTypeReference<DocxRemoveObjectResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/remove-object", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete any object in a Word DOCX document
     * Delete any object, such as a paragraph, table, image, etc. from a Word Document (DOCX).  Pass in the Path of the object you would like to delete.  You can call other functions such as Get-Tables, Get-Images, Get-Body, etc. to get the paths of the objects in the document.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxRemoveObjectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxRemoveObjectResponse> editDocumentDocxRemoveObject(DocxRemoveObjectRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxRemoveObjectResponse> localVarReturnType = new ParameterizedTypeReference<DocxRemoveObjectResponse>() {};
        return editDocumentDocxRemoveObjectRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxRemoveObjectResponse>> editDocumentDocxRemoveObjectWithHttpInfo(DocxRemoveObjectRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxRemoveObjectResponse> localVarReturnType = new ParameterizedTypeReference<DocxRemoveObjectResponse>() {};
        return editDocumentDocxRemoveObjectRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Replace string in Word DOCX document
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxReplaceRequestCreation(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/docx/replace-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace string in Word DOCX document
     * Replace all instances of a string in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxReplace(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxReplaceRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxReplaceWithHttpInfo(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxReplaceRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Replace multiple strings in Word DOCX document, return result
     * Replace all instances of multiple strings in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxReplaceMultiRequestCreation(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/docx/replace-all/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace multiple strings in Word DOCX document, return result
     * Replace all instances of multiple strings in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxReplaceMulti(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxReplaceMultiRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxReplaceMultiWithHttpInfo(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxReplaceMultiRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Replace multiple strings in Word DOCX document, return edit session
     * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return DocumentEditingEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxReplaceMultiEditSessionRequestCreation(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceMultiEditSession", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentEditingEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentEditingEditSession>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace-all/multi/edit-session", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace multiple strings in Word DOCX document, return edit session
     * Replace all instances of multiple strings in an Office Word Document (docx).  Returns an edit session URL so that you can chain together multiple edit operations without having to send the entire document contents back and forth multiple times.  Call the Finish Editing API to retrieve the final document once editing is complete.
     * <p><b>200</b> - OK
     * @param reqConfig Document string replacement configuration input
     * @return DocumentEditingEditSession
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentEditingEditSession> editDocumentDocxReplaceMultiEditSession(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentEditingEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentEditingEditSession>() {};
        return editDocumentDocxReplaceMultiEditSessionRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocumentEditingEditSession>> editDocumentDocxReplaceMultiEditSessionWithHttpInfo(MultiReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentEditingEditSession> localVarReturnType = new ParameterizedTypeReference<DocumentEditingEditSession>() {};
        return editDocumentDocxReplaceMultiEditSessionRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Replace matching paragraphs in a Word DOCX document
     * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return ReplaceDocxParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxReplaceParagraphRequestCreation(ReplaceDocxParagraphRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxReplaceParagraph", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ReplaceDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceDocxParagraphResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/replace/paragraph", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace matching paragraphs in a Word DOCX document
     * Returns the edited Word Document (DOCX) format file with the matching paragraphs replaced as requested.  Replace a paragraph with another object such as an image.  Useful for performing templating operations.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return ReplaceDocxParagraphResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ReplaceDocxParagraphResponse> editDocumentDocxReplaceParagraph(ReplaceDocxParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceDocxParagraphResponse>() {};
        return editDocumentDocxReplaceParagraphRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ReplaceDocxParagraphResponse>> editDocumentDocxReplaceParagraphWithHttpInfo(ReplaceDocxParagraphRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<ReplaceDocxParagraphResponse> localVarReturnType = new ParameterizedTypeReference<ReplaceDocxParagraphResponse>() {};
        return editDocumentDocxReplaceParagraphRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Set custom property metadata properties in Word DOCX document
     * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxSetCustomMetadataPropertiesRequestCreation(DocxSetCustomMetadataPropertiesRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentDocxSetCustomMetadataProperties", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/docx/set-metadata/custom-property", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set custom property metadata properties in Word DOCX document
     * Sets the custom property metadata for the metadata properties in an Office Word Document (docx)
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxSetCustomMetadataProperties(DocxSetCustomMetadataPropertiesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxSetCustomMetadataPropertiesRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxSetCustomMetadataPropertiesWithHttpInfo(DocxSetCustomMetadataPropertiesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxSetCustomMetadataPropertiesRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Set the footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetFooterResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxSetFooterRequestCreation(DocxSetFooterRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooter", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-footer", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set the footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetFooterResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxSetFooterResponse> editDocumentDocxSetFooter(DocxSetFooterRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return editDocumentDocxSetFooterRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxSetFooterResponse>> editDocumentDocxSetFooterWithHttpInfo(DocxSetFooterRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return editDocumentDocxSetFooterRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Add page number to footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetFooterResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxSetFooterAddPageNumberRequestCreation(DocxSetFooterAddPageNumberRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFooterAddPageNumber", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-footer/add-page-number", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add page number to footer in a Word DOCX document
     * Set the footer in a Word Document (DOCX) to contain a page number.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetFooterResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxSetFooterResponse> editDocumentDocxSetFooterAddPageNumber(DocxSetFooterAddPageNumberRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return editDocumentDocxSetFooterAddPageNumberRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxSetFooterResponse>> editDocumentDocxSetFooterAddPageNumberWithHttpInfo(DocxSetFooterAddPageNumberRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetFooterResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetFooterResponse>() {};
        return editDocumentDocxSetFooterAddPageNumberRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Set and fill values for form fields in a Word DOCX document
     * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
     * <p><b>200</b> - OK
     * @param reqConfig The reqConfig parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxSetFormFieldsRequestCreation(DocxSetFormFieldsRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetFormFields", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/docx/set-form-fields", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set and fill values for form fields in a Word DOCX document
     * Modifies a Office Word Document (docx) by filling in form fields using the provided values.
     * <p><b>200</b> - OK
     * @param reqConfig The reqConfig parameter
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentDocxSetFormFields(DocxSetFormFieldsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxSetFormFieldsRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentDocxSetFormFieldsWithHttpInfo(DocxSetFormFieldsRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentDocxSetFormFieldsRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Set the header in a Word DOCX document
     * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetHeaderResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxSetHeaderRequestCreation(DocxSetHeaderRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxSetHeader", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxSetHeaderResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetHeaderResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/set-header", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set the header in a Word DOCX document
     * Set the header in a Word Document (DOCX).  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return DocxSetHeaderResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxSetHeaderResponse> editDocumentDocxSetHeader(DocxSetHeaderRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetHeaderResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetHeaderResponse>() {};
        return editDocumentDocxSetHeaderRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxSetHeaderResponse>> editDocumentDocxSetHeaderWithHttpInfo(DocxSetHeaderRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<DocxSetHeaderResponse> localVarReturnType = new ParameterizedTypeReference<DocxSetHeaderResponse>() {};
        return editDocumentDocxSetHeaderRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Update, set contents of a table cell in an existing table in a Word DOCX document
     * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return UpdateDocxTableCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxUpdateTableCellRequestCreation(UpdateDocxTableCellRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableCell", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UpdateDocxTableCellResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/update-table-cell", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update, set contents of a table cell in an existing table in a Word DOCX document
     * Sets the contents of a table cell into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return UpdateDocxTableCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateDocxTableCellResponse> editDocumentDocxUpdateTableCell(UpdateDocxTableCellRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocxTableCellResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableCellResponse>() {};
        return editDocumentDocxUpdateTableCellRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UpdateDocxTableCellResponse>> editDocumentDocxUpdateTableCellWithHttpInfo(UpdateDocxTableCellRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocxTableCellResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableCellResponse>() {};
        return editDocumentDocxUpdateTableCellRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Update, set contents of a table row in an existing table in a Word DOCX document
     * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return UpdateDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentDocxUpdateTableRowRequestCreation(UpdateDocxTableRowRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentDocxUpdateTableRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UpdateDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/docx/update-table-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update, set contents of a table row in an existing table in a Word DOCX document
     * Sets the contents of a table row into a DOCX Document and returns the result.  Call Finish Editing on the output URL to complete the operation.
     * <p><b>200</b> - OK
     * @param reqConfig Document input request
     * @return UpdateDocxTableRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateDocxTableRowResponse> editDocumentDocxUpdateTableRow(UpdateDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableRowResponse>() {};
        return editDocumentDocxUpdateTableRowRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UpdateDocxTableRowResponse>> editDocumentDocxUpdateTableRowWithHttpInfo(UpdateDocxTableRowRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocxTableRowResponse> localVarReturnType = new ParameterizedTypeReference<UpdateDocxTableRowResponse>() {};
        return editDocumentDocxUpdateTableRowRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Finish editing document, and download result from document editing
     * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
     * <p><b>200</b> - OK
     * @param reqConfig Cloudmersive Document URL to complete editing on
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentFinishEditingRequestCreation(FinishEditingRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentFinishEditing", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/finish-editing", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Finish editing document, and download result from document editing
     * Once done editing a document, download the result.  Begin editing a document by calling begin-editing, then perform operations, then call finish-editing to get the result.
     * <p><b>200</b> - OK
     * @param reqConfig Cloudmersive Document URL to complete editing on
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentFinishEditing(FinishEditingRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentFinishEditingRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentFinishEditingWithHttpInfo(FinishEditingRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentFinishEditingRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Delete, remove slides from a PowerPoint PPTX presentation document
     * Edits the input PowerPoint PPTX presentation document to remove the specified slides
     * <p><b>200</b> - OK
     * @param reqConfig Presentation input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentPptxDeleteSlidesRequestCreation(RemovePptxSlidesRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentPptxDeleteSlides", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/pptx/delete-slides", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete, remove slides from a PowerPoint PPTX presentation document
     * Edits the input PowerPoint PPTX presentation document to remove the specified slides
     * <p><b>200</b> - OK
     * @param reqConfig Presentation input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentPptxDeleteSlides(RemovePptxSlidesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentPptxDeleteSlidesRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentPptxDeleteSlidesWithHttpInfo(RemovePptxSlidesRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentPptxDeleteSlidesRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Get macro information from a PowerPoint PPTX/PPTM presentation document
     * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentPptxGetMacroInformationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentPptxGetMacroInformation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/pptx/get-macros", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get macro information from a PowerPoint PPTX/PPTM presentation document
     * Returns information about the Macros (e.g. VBA) defined in the PowerPoint Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMacrosResponse> editDocumentPptxGetMacroInformation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentPptxGetMacroInformationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetMacrosResponse>> editDocumentPptxGetMacroInformationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentPptxGetMacroInformationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Replace string in PowerPoint PPTX presentation
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param reqConfig Replacement document configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentPptxReplaceRequestCreation(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentPptxReplace", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/pptx/replace-all", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replace string in PowerPoint PPTX presentation
     * Replace all instances of a string in an Office PowerPoint Document (pptx)
     * <p><b>200</b> - OK
     * @param reqConfig Replacement document configuration input
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentPptxReplace(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentPptxReplaceRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentPptxReplaceWithHttpInfo(ReplaceStringRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentPptxReplaceRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Append row to a Excel XLSX spreadsheet, worksheet
     * Appends a row to the end of an Excel Spreadsheet worksheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return AppendXlsxRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxAppendRowRequestCreation(AppendXlsxRowRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxAppendRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AppendXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<AppendXlsxRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/append-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append row to a Excel XLSX spreadsheet, worksheet
     * Appends a row to the end of an Excel Spreadsheet worksheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return AppendXlsxRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AppendXlsxRowResponse> editDocumentXlsxAppendRow(AppendXlsxRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<AppendXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<AppendXlsxRowResponse>() {};
        return editDocumentXlsxAppendRowRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AppendXlsxRowResponse>> editDocumentXlsxAppendRowWithHttpInfo(AppendXlsxRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<AppendXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<AppendXlsxRowResponse>() {};
        return editDocumentXlsxAppendRowRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return ClearXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxClearCellByIndexRequestCreation(ClearXlsxCellRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxClearCellByIndex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClearXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/clear-cell/by-index", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Clear cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Clears, sets to blank, the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return ClearXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClearXlsxCellResponse> editDocumentXlsxClearCellByIndex(ClearXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ClearXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxCellResponse>() {};
        return editDocumentXlsxClearCellByIndexRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ClearXlsxCellResponse>> editDocumentXlsxClearCellByIndexWithHttpInfo(ClearXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ClearXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxCellResponse>() {};
        return editDocumentXlsxClearCellByIndexRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Clear row from a Excel XLSX spreadsheet, worksheet
     * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return ClearXlsxRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxClearRowRequestCreation(ClearXlsxRowRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxClearRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ClearXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/clear-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Clear row from a Excel XLSX spreadsheet, worksheet
     * Clears data from a specific row in the Excel Spreadsheet worksheet, leaving a blank row. Use the Get Rows And Cells API to enumerate available rows in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return ClearXlsxRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ClearXlsxRowResponse> editDocumentXlsxClearRow(ClearXlsxRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ClearXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxRowResponse>() {};
        return editDocumentXlsxClearRowRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ClearXlsxRowResponse>> editDocumentXlsxClearRowWithHttpInfo(ClearXlsxRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<ClearXlsxRowResponse> localVarReturnType = new ParameterizedTypeReference<ClearXlsxRowResponse>() {};
        return editDocumentXlsxClearRowRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Create a blank Excel XLSX spreadsheet
     * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateBlankSpreadsheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxCreateBlankSpreadsheetRequestCreation(CreateBlankSpreadsheetRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxCreateBlankSpreadsheet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreateBlankSpreadsheetResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankSpreadsheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/create/blank", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a blank Excel XLSX spreadsheet
     * Returns a blank Excel XLSX Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateBlankSpreadsheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateBlankSpreadsheetResponse> editDocumentXlsxCreateBlankSpreadsheet(CreateBlankSpreadsheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateBlankSpreadsheetResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankSpreadsheetResponse>() {};
        return editDocumentXlsxCreateBlankSpreadsheetRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CreateBlankSpreadsheetResponse>> editDocumentXlsxCreateBlankSpreadsheetWithHttpInfo(CreateBlankSpreadsheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateBlankSpreadsheetResponse> localVarReturnType = new ParameterizedTypeReference<CreateBlankSpreadsheetResponse>() {};
        return editDocumentXlsxCreateBlankSpreadsheetRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Create a new Excel XLSX spreadsheet from column and row data
     * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateSpreadsheetFromDataResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxCreateSpreadsheetFromDataRequestCreation(CreateSpreadsheetFromDataRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxCreateSpreadsheetFromData", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CreateSpreadsheetFromDataResponse> localVarReturnType = new ParameterizedTypeReference<CreateSpreadsheetFromDataResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/create/from/data", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a new Excel XLSX spreadsheet from column and row data
     * Returns a new Excel XLSX Spreadsheet (XLSX) format file populated with column and row data specified as input
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return CreateSpreadsheetFromDataResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CreateSpreadsheetFromDataResponse> editDocumentXlsxCreateSpreadsheetFromData(CreateSpreadsheetFromDataRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateSpreadsheetFromDataResponse> localVarReturnType = new ParameterizedTypeReference<CreateSpreadsheetFromDataResponse>() {};
        return editDocumentXlsxCreateSpreadsheetFromDataRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CreateSpreadsheetFromDataResponse>> editDocumentXlsxCreateSpreadsheetFromDataWithHttpInfo(CreateSpreadsheetFromDataRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<CreateSpreadsheetFromDataResponse> localVarReturnType = new ParameterizedTypeReference<CreateSpreadsheetFromDataResponse>() {};
        return editDocumentXlsxCreateSpreadsheetFromDataRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Delete, remove worksheet from an Excel XLSX spreadsheet document
     * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param reqConfig Spreadsheet input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxDeleteWorksheetRequestCreation(RemoveXlsxWorksheetRequest reqConfig) throws WebClientResponseException {
        Object postBody = reqConfig;
        // verify the required parameter 'reqConfig' is set
        if (reqConfig == null) {
            throw new WebClientResponseException("Missing the required parameter 'reqConfig' when calling editDocumentXlsxDeleteWorksheet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/edit/xlsx/delete-worksheet", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete, remove worksheet from an Excel XLSX spreadsheet document
     * Edits the input Excel XLSX spreadsheet document to remove the specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param reqConfig Spreadsheet input request
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editDocumentXlsxDeleteWorksheet(RemoveXlsxWorksheetRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentXlsxDeleteWorksheetRequestCreation(reqConfig).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editDocumentXlsxDeleteWorksheetWithHttpInfo(RemoveXlsxWorksheetRequest reqConfig) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editDocumentXlsxDeleteWorksheetRequestCreation(reqConfig).toEntity(localVarReturnType);
    }
    /**
     * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return DisableSharedWorkbookResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxDisableSharedWorkbookRequestCreation(DisableSharedWorkbookRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxDisableSharedWorkbook", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DisableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<DisableSharedWorkbookResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/configuration/disable-shared-workbook", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Disable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Disable the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return DisableSharedWorkbookResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DisableSharedWorkbookResponse> editDocumentXlsxDisableSharedWorkbook(DisableSharedWorkbookRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DisableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<DisableSharedWorkbookResponse>() {};
        return editDocumentXlsxDisableSharedWorkbookRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DisableSharedWorkbookResponse>> editDocumentXlsxDisableSharedWorkbookWithHttpInfo(DisableSharedWorkbookRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<DisableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<DisableSharedWorkbookResponse>() {};
        return editDocumentXlsxDisableSharedWorkbookRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return EnableSharedWorkbookResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxEnableSharedWorkbookRequestCreation(EnableSharedWorkbookRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxEnableSharedWorkbook", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<EnableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<EnableSharedWorkbookResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/configuration/enable-shared-workbook", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Enable Shared Workbook (legacy) in Excel XLSX spreadsheet
     * Enables the Shared Workbook (legacy) mode in an Excel XLSX spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return EnableSharedWorkbookResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EnableSharedWorkbookResponse> editDocumentXlsxEnableSharedWorkbook(EnableSharedWorkbookRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<EnableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<EnableSharedWorkbookResponse>() {};
        return editDocumentXlsxEnableSharedWorkbookRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<EnableSharedWorkbookResponse>> editDocumentXlsxEnableSharedWorkbookWithHttpInfo(EnableSharedWorkbookRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<EnableSharedWorkbookResponse> localVarReturnType = new ParameterizedTypeReference<EnableSharedWorkbookResponse>() {};
        return editDocumentXlsxEnableSharedWorkbookRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
     * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxCellByIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetCellByIdentifierRequestCreation(GetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIdentifier", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellByIdentifierResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-cell/by-identifier", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by cell identifier
     * Returns the value of a specific cell based on its identifier (e.g. A1, B22, C33, etc.) in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxCellByIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxCellByIdentifierResponse> editDocumentXlsxGetCellByIdentifier(GetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellByIdentifierResponse>() {};
        return editDocumentXlsxGetCellByIdentifierRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxCellByIdentifierResponse>> editDocumentXlsxGetCellByIdentifierWithHttpInfo(GetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellByIdentifierResponse>() {};
        return editDocumentXlsxGetCellByIdentifierRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by index
     * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetCellByIndexRequestCreation(GetXlsxCellRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetCellByIndex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-cell/by-index", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get cell from an Excel XLSX spreadsheet, worksheet by index
     * Returns the value and definition of a specific cell in a specific row in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxCellResponse> editDocumentXlsxGetCellByIndex(GetXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellResponse>() {};
        return editDocumentXlsxGetCellByIndexRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxCellResponse>> editDocumentXlsxGetCellByIndexWithHttpInfo(GetXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxCellResponse>() {};
        return editDocumentXlsxGetCellByIndexRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get columns from a Excel XLSX spreadsheet, worksheet
     * Returns the columns defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxColumnsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetColumnsRequestCreation(GetXlsxColumnsRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetColumns", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxColumnsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxColumnsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-columns", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get columns from a Excel XLSX spreadsheet, worksheet
     * Returns the columns defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxColumnsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxColumnsResponse> editDocumentXlsxGetColumns(GetXlsxColumnsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxColumnsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxColumnsResponse>() {};
        return editDocumentXlsxGetColumnsRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxColumnsResponse>> editDocumentXlsxGetColumnsWithHttpInfo(GetXlsxColumnsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxColumnsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxColumnsResponse>() {};
        return editDocumentXlsxGetColumnsRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get images from a Excel XLSX spreadsheet, worksheet
     * Returns the images defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxImagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetImagesRequestCreation(GetXlsxImagesRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetImages", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxImagesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-images", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get images from a Excel XLSX spreadsheet, worksheet
     * Returns the images defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxImagesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxImagesResponse> editDocumentXlsxGetImages(GetXlsxImagesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxImagesResponse>() {};
        return editDocumentXlsxGetImagesRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxImagesResponse>> editDocumentXlsxGetImagesWithHttpInfo(GetXlsxImagesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxImagesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxImagesResponse>() {};
        return editDocumentXlsxGetImagesRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
     * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetMacroInformationRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling editDocumentXlsxGetMacroInformation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-macros", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get macro information from a Excel XLSX/XLSM spreadsheet, worksheet
     * Returns information about the Macros (e.g. VBA) defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return GetMacrosResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMacrosResponse> editDocumentXlsxGetMacroInformation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentXlsxGetMacroInformationRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetMacrosResponse>> editDocumentXlsxGetMacroInformationWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetMacrosResponse> localVarReturnType = new ParameterizedTypeReference<GetMacrosResponse>() {};
        return editDocumentXlsxGetMacroInformationRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get rows and cells from a Excel XLSX spreadsheet, worksheet
     * Returns the rows and cells defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxRowsAndCellsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetRowsAndCellsRequestCreation(GetXlsxRowsAndCellsRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetRowsAndCells", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxRowsAndCellsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxRowsAndCellsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-rows-and-cells", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get rows and cells from a Excel XLSX spreadsheet, worksheet
     * Returns the rows and cells defined in the Excel Spreadsheet worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxRowsAndCellsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxRowsAndCellsResponse> editDocumentXlsxGetRowsAndCells(GetXlsxRowsAndCellsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxRowsAndCellsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxRowsAndCellsResponse>() {};
        return editDocumentXlsxGetRowsAndCellsRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxRowsAndCellsResponse>> editDocumentXlsxGetRowsAndCellsWithHttpInfo(GetXlsxRowsAndCellsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxRowsAndCellsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxRowsAndCellsResponse>() {};
        return editDocumentXlsxGetRowsAndCellsRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
     * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxSpecificRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetSpecificRowRequestCreation(GetXlsxSpecificRowRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetSpecificRow", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxSpecificRowResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxSpecificRowResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-specific-row", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get a specific row from a Excel XLSX spreadsheet, worksheet by path
     * Returns the specific row and its cells defined in the Excel Spreadsheet worksheet based on the specified path.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxSpecificRowResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxSpecificRowResponse> editDocumentXlsxGetSpecificRow(GetXlsxSpecificRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxSpecificRowResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxSpecificRowResponse>() {};
        return editDocumentXlsxGetSpecificRowRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxSpecificRowResponse>> editDocumentXlsxGetSpecificRowWithHttpInfo(GetXlsxSpecificRowRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxSpecificRowResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxSpecificRowResponse>() {};
        return editDocumentXlsxGetSpecificRowRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get styles from a Excel XLSX spreadsheet, worksheet
     * Returns the style defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxStylesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetStylesRequestCreation(GetXlsxStylesRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetStyles", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxStylesResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-styles", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get styles from a Excel XLSX spreadsheet, worksheet
     * Returns the style defined in the Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxStylesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxStylesResponse> editDocumentXlsxGetStyles(GetXlsxStylesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxStylesResponse>() {};
        return editDocumentXlsxGetStylesRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxStylesResponse>> editDocumentXlsxGetStylesWithHttpInfo(GetXlsxStylesRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxStylesResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxStylesResponse>() {};
        return editDocumentXlsxGetStylesRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Get worksheets from a Excel XLSX spreadsheet
     * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxWorksheetsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxGetWorksheetsRequestCreation(GetXlsxWorksheetsRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxGetWorksheets", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetXlsxWorksheetsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxWorksheetsResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/get-worksheets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get worksheets from a Excel XLSX spreadsheet
     * Returns the worksheets (tabs) defined in the Excel Spreadsheet (XLSX) format file
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return GetXlsxWorksheetsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetXlsxWorksheetsResponse> editDocumentXlsxGetWorksheets(GetXlsxWorksheetsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxWorksheetsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxWorksheetsResponse>() {};
        return editDocumentXlsxGetWorksheetsRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetXlsxWorksheetsResponse>> editDocumentXlsxGetWorksheetsWithHttpInfo(GetXlsxWorksheetsRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<GetXlsxWorksheetsResponse> localVarReturnType = new ParameterizedTypeReference<GetXlsxWorksheetsResponse>() {};
        return editDocumentXlsxGetWorksheetsRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Insert a new worksheet into an Excel XLSX spreadsheet
     * Inserts a new worksheet into an Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return InsertXlsxWorksheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxInsertWorksheetRequestCreation(InsertXlsxWorksheetRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxInsertWorksheet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<InsertXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<InsertXlsxWorksheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/insert-worksheet", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Insert a new worksheet into an Excel XLSX spreadsheet
     * Inserts a new worksheet into an Excel Spreadsheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return InsertXlsxWorksheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<InsertXlsxWorksheetResponse> editDocumentXlsxInsertWorksheet(InsertXlsxWorksheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<InsertXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<InsertXlsxWorksheetResponse>() {};
        return editDocumentXlsxInsertWorksheetRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<InsertXlsxWorksheetResponse>> editDocumentXlsxInsertWorksheetWithHttpInfo(InsertXlsxWorksheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<InsertXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<InsertXlsxWorksheetResponse>() {};
        return editDocumentXlsxInsertWorksheetRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Rename a specific worksheet in a Excel XLSX spreadsheet
     * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return RenameXlsxWorksheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxRenameWorksheetRequestCreation(RenameXlsxWorksheetRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxRenameWorksheet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RenameXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<RenameXlsxWorksheetResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/rename-worksheet", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Rename a specific worksheet in a Excel XLSX spreadsheet
     * Edits the input Excel XLSX spreadsheet document to rename a specified worksheet (tab).  Use the Get Worksheets API to enumerate available worksheets in a spreadsheet.
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return RenameXlsxWorksheetResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RenameXlsxWorksheetResponse> editDocumentXlsxRenameWorksheet(RenameXlsxWorksheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<RenameXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<RenameXlsxWorksheetResponse>() {};
        return editDocumentXlsxRenameWorksheetRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RenameXlsxWorksheetResponse>> editDocumentXlsxRenameWorksheetWithHttpInfo(RenameXlsxWorksheetRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<RenameXlsxWorksheetResponse> localVarReturnType = new ParameterizedTypeReference<RenameXlsxWorksheetResponse>() {};
        return editDocumentXlsxRenameWorksheetRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return SetXlsxCellByIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxSetCellByIdentifierRequestCreation(SetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIdentifier", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellByIdentifierResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/set-cell/by-identifier", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by cell identifier
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet using its cell identifier (e.g. A1, B22, C33) in the worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return SetXlsxCellByIdentifierResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SetXlsxCellByIdentifierResponse> editDocumentXlsxSetCellByIdentifier(SetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellByIdentifierResponse>() {};
        return editDocumentXlsxSetCellByIdentifierRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SetXlsxCellByIdentifierResponse>> editDocumentXlsxSetCellByIdentifierWithHttpInfo(SetXlsxCellByIdentifierRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SetXlsxCellByIdentifierResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellByIdentifierResponse>() {};
        return editDocumentXlsxSetCellByIdentifierRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return SetXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editDocumentXlsxSetCellByIndexRequestCreation(SetXlsxCellRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling editDocumentXlsxSetCellByIndex", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellResponse>() {};
        return apiClient.invokeAPI("/convert/edit/xlsx/set-cell/by-index", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Set, update cell contents in an Excel XLSX spreadsheet, worksheet by index
     * Sets, updates the contents of a specific cell in an Excel XLSX spreadsheet, worksheet
     * <p><b>200</b> - OK
     * @param input Document input request
     * @return SetXlsxCellResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SetXlsxCellResponse> editDocumentXlsxSetCellByIndex(SetXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellResponse>() {};
        return editDocumentXlsxSetCellByIndexRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SetXlsxCellResponse>> editDocumentXlsxSetCellByIndexWithHttpInfo(SetXlsxCellRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<SetXlsxCellResponse> localVarReturnType = new ParameterizedTypeReference<SetXlsxCellResponse>() {};
        return editDocumentXlsxSetCellByIndexRequestCreation(input).toEntity(localVarReturnType);
    }
}
