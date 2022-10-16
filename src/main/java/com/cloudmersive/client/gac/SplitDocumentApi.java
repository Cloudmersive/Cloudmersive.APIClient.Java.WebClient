package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.SplitDocxDocumentResult;
import com.cloudmersive.client.gac.model.SplitPdfResult;
import com.cloudmersive.client.gac.model.SplitPptxPresentationResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.gac.model.SplitXlsxWorksheetResult;

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
public class SplitDocumentApi {
    private ApiClient apiClient;

    public SplitDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public SplitDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
     * @return SplitDocxDocumentResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));
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

        ParameterizedTypeReference<SplitDocxDocumentResult> localVarReturnType = new ParameterizedTypeReference<SplitDocxDocumentResult>() {};
        return apiClient.invokeAPI("/convert/split/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting document.  Default is true.
     * @return SplitDocxDocumentResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitDocxDocumentResult> splitDocumentDocx(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitDocxDocumentResult> localVarReturnType = new ParameterizedTypeReference<SplitDocxDocumentResult>() {};
        return splitDocumentDocxRequestCreation(inputFile, returnDocumentContents).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitDocxDocumentResult>> splitDocumentDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitDocxDocumentResult> localVarReturnType = new ParameterizedTypeReference<SplitDocxDocumentResult>() {};
        return splitDocumentDocxRequestCreation(inputFile, returnDocumentContents).toEntity(localVarReturnType);
    }
    /**
     * Split a PDF file into separate PDF files, one per page
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
     * @return SplitPdfResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentPdfByPageRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentPdfByPage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));
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

        ParameterizedTypeReference<SplitPdfResult> localVarReturnType = new ParameterizedTypeReference<SplitPdfResult>() {};
        return apiClient.invokeAPI("/convert/split/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a PDF file into separate PDF files, one per page
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to directly return all of the document contents in the DocumentContents field; set to false to return contents as temporary URLs (more efficient for large operations).  Default is false.
     * @return SplitPdfResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitPdfResult> splitDocumentPdfByPage(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitPdfResult> localVarReturnType = new ParameterizedTypeReference<SplitPdfResult>() {};
        return splitDocumentPdfByPageRequestCreation(inputFile, returnDocumentContents).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitPdfResult>> splitDocumentPdfByPageWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitPdfResult> localVarReturnType = new ParameterizedTypeReference<SplitPdfResult>() {};
        return splitDocumentPdfByPageRequestCreation(inputFile, returnDocumentContents).toEntity(localVarReturnType);
    }
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
     * @return SplitPptxPresentationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));
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

        ParameterizedTypeReference<SplitPptxPresentationResult> localVarReturnType = new ParameterizedTypeReference<SplitPptxPresentationResult>() {};
        return apiClient.invokeAPI("/convert/split/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each presentation directly, set to false to only return URLs to each resulting presentation.  Default is true.
     * @return SplitPptxPresentationResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitPptxPresentationResult> splitDocumentPptx(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitPptxPresentationResult> localVarReturnType = new ParameterizedTypeReference<SplitPptxPresentationResult>() {};
        return splitDocumentPptxRequestCreation(inputFile, returnDocumentContents).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitPptxPresentationResult>> splitDocumentPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitPptxPresentationResult> localVarReturnType = new ParameterizedTypeReference<SplitPptxPresentationResult>() {};
        return splitDocumentPptxRequestCreation(inputFile, returnDocumentContents).toEntity(localVarReturnType);
    }
    /**
     * Split a single Text file (txt) into lines
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return SplitTextDocumentByLinesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentTxtByLineRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByLine", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<SplitTextDocumentByLinesResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByLinesResult>() {};
        return apiClient.invokeAPI("/convert/split/txt/by-line", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a single Text file (txt) into lines
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return SplitTextDocumentByLinesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitTextDocumentByLinesResult> splitDocumentTxtByLine(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<SplitTextDocumentByLinesResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByLinesResult>() {};
        return splitDocumentTxtByLineRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitTextDocumentByLinesResult>> splitDocumentTxtByLineWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<SplitTextDocumentByLinesResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByLinesResult>() {};
        return splitDocumentTxtByLineRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Split a single Text file (txt) by a string delimiter
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     * <p><b>200</b> - OK
     * @param splitDelimiter Required; String to split up the input file on
     * @param inputFile Input file to perform the operation on.
     * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output
     * @return SplitTextDocumentByStringResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentTxtByStringRequestCreation(String splitDelimiter, org.springframework.core.io.AbstractResource inputFile, Boolean skipEmptyElements) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'splitDelimiter' is set
        if (splitDelimiter == null) {
            throw new WebClientResponseException("Missing the required parameter 'splitDelimiter' when calling splitDocumentTxtByString", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentTxtByString", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (splitDelimiter != null)
        headerParams.add("splitDelimiter", apiClient.parameterToString(splitDelimiter));
        if (skipEmptyElements != null)
        headerParams.add("skipEmptyElements", apiClient.parameterToString(skipEmptyElements));
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

        ParameterizedTypeReference<SplitTextDocumentByStringResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByStringResult>() {};
        return apiClient.invokeAPI("/convert/split/txt/by-string", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a single Text file (txt) by a string delimiter
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     * <p><b>200</b> - OK
     * @param splitDelimiter Required; String to split up the input file on
     * @param inputFile Input file to perform the operation on.
     * @param skipEmptyElements Optional; If true, empty elements will be skipped in the output
     * @return SplitTextDocumentByStringResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitTextDocumentByStringResult> splitDocumentTxtByString(String splitDelimiter, org.springframework.core.io.AbstractResource inputFile, Boolean skipEmptyElements) throws WebClientResponseException {
        ParameterizedTypeReference<SplitTextDocumentByStringResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByStringResult>() {};
        return splitDocumentTxtByStringRequestCreation(splitDelimiter, inputFile, skipEmptyElements).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitTextDocumentByStringResult>> splitDocumentTxtByStringWithHttpInfo(String splitDelimiter, org.springframework.core.io.AbstractResource inputFile, Boolean skipEmptyElements) throws WebClientResponseException {
        ParameterizedTypeReference<SplitTextDocumentByStringResult> localVarReturnType = new ParameterizedTypeReference<SplitTextDocumentByStringResult>() {};
        return splitDocumentTxtByStringRequestCreation(splitDelimiter, inputFile, skipEmptyElements).toEntity(localVarReturnType);
    }
    /**
     * Split a single Excel XLSX into Separate Worksheets
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
     * @return SplitXlsxWorksheetResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec splitDocumentXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling splitDocumentXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (returnDocumentContents != null)
        headerParams.add("returnDocumentContents", apiClient.parameterToString(returnDocumentContents));
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

        ParameterizedTypeReference<SplitXlsxWorksheetResult> localVarReturnType = new ParameterizedTypeReference<SplitXlsxWorksheetResult>() {};
        return apiClient.invokeAPI("/convert/split/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a single Excel XLSX into Separate Worksheets
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param returnDocumentContents Set to true to return the contents of each Worksheet directly, set to false to only return URLs to each resulting worksheet.  Default is true.
     * @return SplitXlsxWorksheetResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitXlsxWorksheetResult> splitDocumentXlsx(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitXlsxWorksheetResult> localVarReturnType = new ParameterizedTypeReference<SplitXlsxWorksheetResult>() {};
        return splitDocumentXlsxRequestCreation(inputFile, returnDocumentContents).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitXlsxWorksheetResult>> splitDocumentXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean returnDocumentContents) throws WebClientResponseException {
        ParameterizedTypeReference<SplitXlsxWorksheetResult> localVarReturnType = new ParameterizedTypeReference<SplitXlsxWorksheetResult>() {};
        return splitDocumentXlsxRequestCreation(inputFile, returnDocumentContents).toEntity(localVarReturnType);
    }
}
