package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:18:06.409836300-07:00[America/Los_Angeles]")
public class MergeDocumentApi {
    private ApiClient apiClient;

    public MergeDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public MergeDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Merge Two Word DOCX Together
     * Combine two Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two Word DOCX Together
     * Combine two Office Word Documents (docx) into one single Office Word document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentDocx(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentDocxRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentDocxRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word document
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
    private ResponseSpec mergeDocumentDocxMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentDocxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentDocxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/docx/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple Word DOCX Together
     * Combine multiple Office Word Documents (docx) into one single Office Word document
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
    public Mono<byte[]> mergeDocumentDocxMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentDocxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentDocxMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentDocxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two HTML (HTM) Files Together
     * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two HTML (HTM) Files Together
     * Combine two HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentHtml(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentHtmlRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentHtmlRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple HTML (HTM) Files Together
     * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
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
    private ResponseSpec mergeDocumentHtmlMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentHtmlMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentHtmlMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/html/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple HTML (HTM) Files Together
     * Combine multiple HTML (.HTM) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.  The title will be taken from the first document.
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
    public Mono<byte[]> mergeDocumentHtmlMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentHtmlMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentHtmlMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentHtmlMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two PDF Files Together
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two PDF Files Together
     * Combine two PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentPdf(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPdfRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPdfRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple PDF Files Together
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
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
    private ResponseSpec mergeDocumentPdfMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPdfMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPdfMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/pdf/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple PDF Files Together
     * Combine multiple PDF files (pdf) into a single PDF document, preserving the order of the input documents in the combined document
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
    public Mono<byte[]> mergeDocumentPdfMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPdfMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPdfMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPdfMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two PNG Files Together
     * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentPngRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/png/vertical", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two PNG Files Together
     * Combine two PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentPng(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPngRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPngRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple PNG Files Together
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
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
    private ResponseSpec mergeDocumentPngMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPngMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPngMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/png/vertical/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple PNG Files Together
     * Combine multiple PNG files into a single PNG document, preserving the order of the input documents in the combined document by stacking them vertically
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
    public Mono<byte[]> mergeDocumentPngMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPngMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPngMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPngMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two PowerPoint PPTX Together
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two PowerPoint PPTX Together
     * Combine two Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentPptx(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPptxRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPptxRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple PowerPoint PPTX Together
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
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
    private ResponseSpec mergeDocumentPptxMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentPptxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentPptxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/pptx/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple PowerPoint PPTX Together
     * Combine multiple Office PowerPoint presentations (pptx) into one single Office PowerPoint presentation
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
    public Mono<byte[]> mergeDocumentPptxMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPptxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentPptxMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentPptxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two Text (TXT) Files Together
     * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two Text (TXT) Files Together
     * Combine two Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> mergeDocumentTxt(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return mergeDocumentTxtRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> mergeDocumentTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return mergeDocumentTxtRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple Text (TXT) Files Together
     * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
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
    private ResponseSpec mergeDocumentTxtMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentTxtMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentTxtMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/txt/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple Text (TXT) Files Together
     * Combine multiple Text (.TXT) files into a single text document, preserving the order of the input documents in the combined document by stacking them vertically.
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
    public Mono<byte[]> mergeDocumentTxtMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentTxtMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentTxtMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentTxtMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Merge Two Excel XLSX Together
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec mergeDocumentXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Two Excel XLSX Together
     * Combine two Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on (more than 2 can be supplied).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> mergeDocumentXlsx(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentXlsxRequestCreation(inputFile1, inputFile2).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentXlsxRequestCreation(inputFile1, inputFile2).toEntity(localVarReturnType);
    }
    /**
     * Merge Multple Excel XLSX Together
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
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
    private ResponseSpec mergeDocumentXlsxMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling mergeDocumentXlsxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling mergeDocumentXlsxMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/merge/xlsx/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Merge Multple Excel XLSX Together
     * Combine multiple Office Excel spreadsheets (xlsx) into a single Office Excel spreadsheet
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
    public Mono<byte[]> mergeDocumentXlsxMulti(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentXlsxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> mergeDocumentXlsxMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return mergeDocumentXlsxMultiRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
}
