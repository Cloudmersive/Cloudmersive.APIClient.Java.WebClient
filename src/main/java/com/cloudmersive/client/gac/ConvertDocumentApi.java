package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AutodetectGetInfoResult;
import com.cloudmersive.client.gac.model.AutodetectToJpgResult;
import com.cloudmersive.client.gac.model.AutodetectToPngResult;
import com.cloudmersive.client.gac.model.AutodetectToThumbnailsResult;
import com.cloudmersive.client.gac.model.CsvCollection;
import com.cloudmersive.client.gac.model.DocxToJpgResult;
import com.cloudmersive.client.gac.model.DocxToPngResult;
import com.cloudmersive.client.gac.model.EmlToHtmlResult;
import com.cloudmersive.client.gac.model.EmlToJpgResult;
import com.cloudmersive.client.gac.model.EmlToPngResult;
import java.io.File;
import com.cloudmersive.client.gac.model.GetFileTypeIconResult;
import com.cloudmersive.client.gac.model.KeynoteToJpgResult;
import com.cloudmersive.client.gac.model.KeynoteToPngResult;
import com.cloudmersive.client.gac.model.MsgToHtmlResult;
import com.cloudmersive.client.gac.model.MsgToJpgResult;
import com.cloudmersive.client.gac.model.MsgToPngResult;
import com.cloudmersive.client.gac.model.OdpToJpgResult;
import com.cloudmersive.client.gac.model.OdpToPngResult;
import com.cloudmersive.client.gac.model.OdsToJpgResult;
import com.cloudmersive.client.gac.model.OdsToPngResult;
import com.cloudmersive.client.gac.model.OdtToJpgResult;
import com.cloudmersive.client.gac.model.OdtToPngResult;
import com.cloudmersive.client.gac.model.PdfToJpgResult;
import com.cloudmersive.client.gac.model.PdfToPngResult;
import com.cloudmersive.client.gac.model.PptxToPngResult;
import com.cloudmersive.client.gac.model.RtfToJpgResult;
import com.cloudmersive.client.gac.model.RtfToPngResult;
import com.cloudmersive.client.gac.model.TextConversionResult;
import com.cloudmersive.client.gac.model.XlsxToPngResult;

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
public class ConvertDocumentApi {
    private ApiClient apiClient;

    public ConvertDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get document type information
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectGetInfoResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectGetInfoRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectGetInfo", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AutodetectGetInfoResult> localVarReturnType = new ParameterizedTypeReference<AutodetectGetInfoResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/get-info", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get document type information
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.  Even if no file extension is present, the auto-detect system will reliably analyze the contents of the file and identify its file type.  Supports over 100 image file formats, Office document file formats, PDF, and more.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectGetInfoResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AutodetectGetInfoResult> convertDocumentAutodetectGetInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectGetInfoResult> localVarReturnType = new ParameterizedTypeReference<AutodetectGetInfoResult>() {};
        return convertDocumentAutodetectGetInfoRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AutodetectGetInfoResult>> convertDocumentAutodetectGetInfoWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectGetInfoResult> localVarReturnType = new ParameterizedTypeReference<AutodetectGetInfoResult>() {};
        return convertDocumentAutodetectGetInfoRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Document to JPG/JPEG image array
     * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return AutodetectToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AutodetectToJpgResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToJpgResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Document to JPG/JPEG image array
     * Automatically detect file type and convert it to an array of JPG/JPEG Images.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return AutodetectToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AutodetectToJpgResult> convertDocumentAutodetectToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToJpgResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToJpgResult>() {};
        return convertDocumentAutodetectToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AutodetectToJpgResult>> convertDocumentAutodetectToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToJpgResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToJpgResult>() {};
        return convertDocumentAutodetectToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Document to PDF
     * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/autodetect/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Document to PDF
     * Automatically detect file type and convert it to PDF.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentAutodetectToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentAutodetectToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentAutodetectToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentAutodetectToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Document to PNG array
     * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToPngArrayRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPngArray", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AutodetectToPngResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToPngResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Document to PNG array
     * Automatically detect file type and convert it to an array of PNG images.  Supports all of the major Office document file formats, over 100 image formats, and even multi-page TIFF files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return AutodetectToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AutodetectToPngResult> convertDocumentAutodetectToPngArray(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToPngResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToPngResult>() {};
        return convertDocumentAutodetectToPngArrayRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AutodetectToPngResult>> convertDocumentAutodetectToPngArrayWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToPngResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToPngResult>() {};
        return convertDocumentAutodetectToPngArrayRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert File to Thumbnail Image
     * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToThumbnailRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));
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
        return apiClient.invokeAPI("/convert/autodetect/to/thumbnail", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert File to Thumbnail Image
     * Automatically detect file type and convert it to a PNG thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentAutodetectToThumbnail(org.springframework.core.io.AbstractResource inputFile, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentAutodetectToThumbnailRequestCreation(inputFile, maxWidth, maxHeight, extension).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentAutodetectToThumbnailWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentAutodetectToThumbnailRequestCreation(inputFile, maxWidth, maxHeight, extension).toEntity(localVarReturnType);
    }
    /**
     * Convert File to Thumbnail Image Object
     * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param pages Optional; Specify how many pages of the document will be converted to thumbnails. Default is 1 page.
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
     * @return AutodetectToThumbnailsResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToThumbnailsAdvancedRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToThumbnailsAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (pages != null)
        headerParams.add("pages", apiClient.parameterToString(pages));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (extension != null)
        headerParams.add("extension", apiClient.parameterToString(extension));
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

        ParameterizedTypeReference<AutodetectToThumbnailsResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToThumbnailsResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/to/thumbnail/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert File to Thumbnail Image Object
     * Automatically detect file type and convert it to an array of PNG thumbnails, returned as an object. May specify the number of pages for multiple thumbnails; default is one thumbnail. Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT), over 100 image formats, HTML files, and even multi-page TIFF files. Returns a generic PNG thumbnail for unsupported formats. Maximum thumbnail size is 2048x2048.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param pages Optional; Specify how many pages of the document will be converted to thumbnails. Default is 1 page.
     * @param maxWidth Optional; Maximum width of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param maxHeight Optional; Maximum height of the output thumbnail - final image will be as large as possible while less than or equal to this width. Default is 128.
     * @param extension Optional; Specify the file extension of the inputFile. This will improve the response time in most cases. Also allows unsupported files without extensions to still return a corresponding generic icon.
     * @return AutodetectToThumbnailsResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AutodetectToThumbnailsResult> convertDocumentAutodetectToThumbnailsAdvanced(org.springframework.core.io.AbstractResource inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToThumbnailsResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToThumbnailsResult>() {};
        return convertDocumentAutodetectToThumbnailsAdvancedRequestCreation(inputFile, pages, maxWidth, maxHeight, extension).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AutodetectToThumbnailsResult>> convertDocumentAutodetectToThumbnailsAdvancedWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer pages, Integer maxWidth, Integer maxHeight, String extension) throws WebClientResponseException {
        ParameterizedTypeReference<AutodetectToThumbnailsResult> localVarReturnType = new ParameterizedTypeReference<AutodetectToThumbnailsResult>() {};
        return convertDocumentAutodetectToThumbnailsAdvancedRequestCreation(inputFile, pages, maxWidth, maxHeight, extension).toEntity(localVarReturnType);
    }
    /**
     * Convert Document to Text (txt)
     * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentAutodetectToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Document to Text (txt)
     * Automatically detect file type and convert it to Text.  Supports all of the major Office document file formats including Word (DOCX, DOC), Excel (XLSX, XLS), PowerPoint (PPTX, PPT) and PDF files.  For spreadsheets, all worksheets will be included.  If you wish to exclude certain pages, worksheets, slides, etc. use the Split document API first, or the delete pages/slides/worksheet APIs first to adjust the document to the target state prior to converting to text.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentAutodetectToTxt(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentAutodetectToTxtRequestCreation(inputFile, textFormattingMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentAutodetectToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentAutodetectToTxtRequestCreation(inputFile, textFormattingMode).toEntity(localVarReturnType);
    }
    /**
     * Convert Multiple CSV Files into a Single XLSX Spreadsheet
     * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on.
     * @param worksheetNames Optional; Specify the name of each CSV&#39;s worksheet in order, separated with commas (e.g. \&quot;worksheet1,worksheet2,worksheet3\&quot;). Defaults to the names of the input CSV files. Recommended when inputting the files directly, without file names.
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
    private ResponseSpec convertDocumentCsvMultiToXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, String worksheetNames, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling convertDocumentCsvMultiToXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling convertDocumentCsvMultiToXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (worksheetNames != null)
        headerParams.add("worksheetNames", apiClient.parameterToString(worksheetNames));
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
        return apiClient.invokeAPI("/convert/csv/multi/to/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Multiple CSV Files into a Single XLSX Spreadsheet
     * Convert multiple Comma-Separated Values (CSV) files into a single Excel XLSX Spreadsheet, with one worksheet corresponding to each CSV file.
     * <p><b>200</b> - OK
     * @param inputFile1 First input file to perform the operation on.
     * @param inputFile2 Second input file to perform the operation on.
     * @param worksheetNames Optional; Specify the name of each CSV&#39;s worksheet in order, separated with commas (e.g. \&quot;worksheet1,worksheet2,worksheet3\&quot;). Defaults to the names of the input CSV files. Recommended when inputting the files directly, without file names.
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
    public Mono<byte[]> convertDocumentCsvMultiToXlsx(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, String worksheetNames, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvMultiToXlsxRequestCreation(inputFile1, inputFile2, worksheetNames, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentCsvMultiToXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, String worksheetNames, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvMultiToXlsxRequestCreation(inputFile1, inputFile2, worksheetNames, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Convert CSV to HTML document
     * Convert Comma-Separated Values (CSV) file to HTML document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentCsvToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/csv/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert CSV to HTML document
     * Convert Comma-Separated Values (CSV) file to HTML document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentCsvToHtml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToHtmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentCsvToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToHtmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert CSV to PDF document
     * Convert Comma-Separated Values (CSV) file to PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentCsvToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/csv/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert CSV to PDF document
     * Convert Comma-Separated Values (CSV) file to PDF document.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentCsvToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentCsvToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert CSV to Excel XLSX Spreadsheet
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentCsvToXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentCsvToXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/csv/to/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert CSV to Excel XLSX Spreadsheet
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentCsvToXlsx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToXlsxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentCsvToXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentCsvToXlsxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOC (97-03) Document to DOCX
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocToDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocToDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/doc/to/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOC (97-03) Document to DOCX
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocToDocx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocToDocxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocToDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocToDocxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOC (97-03) Document to PDF
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/doc/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOC (97-03) Document to PDF
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOC (97-03) Document to Text (txt)
     * Convert Office Word DOC (97-03) Document (doc) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/doc/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOC (97-03) Document to Text (txt)
     * Convert Office Word DOC (97-03) Document (doc) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentDocToTxt(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentDocToTxtRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentDocToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentDocToTxtRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to Legacy Word DOC (97-03)
     * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToDocRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToDoc", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/docx/to/doc", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to Legacy Word DOC (97-03)
     * Convert/downgrade modern Office Word DOCX Documents (DOCX) to the legacy Word DOC (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocxToDoc(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToDocRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocxToDocWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToDocRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to HTML Document
     * Convert Office Word Document (DOCX) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/docx/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to HTML Document
     * Convert Office Word Document (DOCX) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocxToHtml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToHtmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocxToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToHtmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to JPG/JPEG image array
     * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return DocxToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<DocxToJpgResult> localVarReturnType = new ParameterizedTypeReference<DocxToJpgResult>() {};
        return apiClient.invokeAPI("/convert/docx/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to JPG/JPEG image array
     * Converts an Office Word Document (DOCX) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return DocxToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxToJpgResult> convertDocumentDocxToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<DocxToJpgResult> localVarReturnType = new ParameterizedTypeReference<DocxToJpgResult>() {};
        return convertDocumentDocxToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxToJpgResult>> convertDocumentDocxToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<DocxToJpgResult> localVarReturnType = new ParameterizedTypeReference<DocxToJpgResult>() {};
        return convertDocumentDocxToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to PDF
     * Convert Office Word Documents (docx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/docx/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to PDF
     * Convert Office Word Documents (docx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocxToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocxToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to PNG image array
     * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocxToPngResult> localVarReturnType = new ParameterizedTypeReference<DocxToPngResult>() {};
        return apiClient.invokeAPI("/convert/docx/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to PNG image array
     * Converts an Office Word Document (DOCX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return DocxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocxToPngResult> convertDocumentDocxToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocxToPngResult> localVarReturnType = new ParameterizedTypeReference<DocxToPngResult>() {};
        return convertDocumentDocxToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<DocxToPngResult>> convertDocumentDocxToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<DocxToPngResult> localVarReturnType = new ParameterizedTypeReference<DocxToPngResult>() {};
        return convertDocumentDocxToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to RTF
     * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToRtfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToRtf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/docx/to/rtf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to RTF
     * Convert an Office Word Document (DOCX) to Rich Text Format Document (RTF)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentDocxToRtf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToRtfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentDocxToRtfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentDocxToRtfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Word DOCX Document to Text (txt)
     * Convert Office Word Documents (docx) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;minimizeWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentDocxToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentDocxToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/docx/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Word DOCX Document to Text (txt)
     * Convert Office Word Documents (docx) to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting the document to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;minimizeWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentDocxToTxt(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentDocxToTxtRequestCreation(inputFile, textFormattingMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentDocxToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentDocxToTxtRequestCreation(inputFile, textFormattingMode).toEntity(localVarReturnType);
    }
    /**
     * Convert Email EML file to HTML string
     * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
     * @return EmlToHtmlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentEmlToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
        if (includeAttachments != null)
        headerParams.add("includeAttachments", apiClient.parameterToString(includeAttachments));
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

        ParameterizedTypeReference<EmlToHtmlResult> localVarReturnType = new ParameterizedTypeReference<EmlToHtmlResult>() {};
        return apiClient.invokeAPI("/convert/eml/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email EML file to HTML string
     * Convert Outlook Email EML file to HTML string and attachments. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
     * @return EmlToHtmlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmlToHtmlResult> convertDocumentEmlToHtml(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToHtmlResult> localVarReturnType = new ParameterizedTypeReference<EmlToHtmlResult>() {};
        return convertDocumentEmlToHtmlRequestCreation(inputFile, bodyOnly, includeAttachments).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<EmlToHtmlResult>> convertDocumentEmlToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToHtmlResult> localVarReturnType = new ParameterizedTypeReference<EmlToHtmlResult>() {};
        return convertDocumentEmlToHtmlRequestCreation(inputFile, bodyOnly, includeAttachments).toEntity(localVarReturnType);
    }
    /**
     * Convert Email EML file to JPG/JPEG image array
     * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return EmlToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentEmlToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<EmlToJpgResult> localVarReturnType = new ParameterizedTypeReference<EmlToJpgResult>() {};
        return apiClient.invokeAPI("/convert/eml/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email EML file to JPG/JPEG image array
     * Converts an Outlook Email File (EML) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return EmlToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmlToJpgResult> convertDocumentEmlToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToJpgResult> localVarReturnType = new ParameterizedTypeReference<EmlToJpgResult>() {};
        return convertDocumentEmlToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<EmlToJpgResult>> convertDocumentEmlToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToJpgResult> localVarReturnType = new ParameterizedTypeReference<EmlToJpgResult>() {};
        return convertDocumentEmlToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Email EML file to PDF document
     * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentEmlToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
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
        return apiClient.invokeAPI("/convert/eml/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email EML file to PDF document
     * Convert Outlook Email EML file to PDF document. Supports images if they are base 64 inline.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentEmlToPdf(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentEmlToPdfRequestCreation(inputFile, bodyOnly).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentEmlToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentEmlToPdfRequestCreation(inputFile, bodyOnly).toEntity(localVarReturnType);
    }
    /**
     * Convert Email EML file to PNG image array
     * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return EmlToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentEmlToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentEmlToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<EmlToPngResult> localVarReturnType = new ParameterizedTypeReference<EmlToPngResult>() {};
        return apiClient.invokeAPI("/convert/eml/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email EML file to PNG image array
     * Converts an Outlook Email File (EML) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return EmlToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EmlToPngResult> convertDocumentEmlToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToPngResult> localVarReturnType = new ParameterizedTypeReference<EmlToPngResult>() {};
        return convertDocumentEmlToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<EmlToPngResult>> convertDocumentEmlToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<EmlToPngResult> localVarReturnType = new ParameterizedTypeReference<EmlToPngResult>() {};
        return convertDocumentEmlToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get PNG icon file for the file extension
     * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentGetFileTypeIconRequestCreation(String fileExtension, Integer iconSize) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new WebClientResponseException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIcon", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileExtension != null)
        headerParams.add("fileExtension", apiClient.parameterToString(fileExtension));
        if (iconSize != null)
        headerParams.add("iconSize", apiClient.parameterToString(iconSize));
        final String[] localVarAccepts = { 
            "application/octet-stream"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/autodetect/get-icon", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PNG icon file for the file extension
     * Returns a PNG icon for the given file format extension as a file for download. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentGetFileTypeIcon(String fileExtension, Integer iconSize) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentGetFileTypeIconRequestCreation(fileExtension, iconSize).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentGetFileTypeIconWithHttpInfo(String fileExtension, Integer iconSize) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentGetFileTypeIconRequestCreation(fileExtension, iconSize).toEntity(localVarReturnType);
    }
    /**
     * Get PNG icon byte array for the file extension
     * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
     * @return GetFileTypeIconResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentGetFileTypeIconAdvancedRequestCreation(String fileExtension, Integer iconSize) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fileExtension' is set
        if (fileExtension == null) {
            throw new WebClientResponseException("Missing the required parameter 'fileExtension' when calling convertDocumentGetFileTypeIconAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileExtension != null)
        headerParams.add("fileExtension", apiClient.parameterToString(fileExtension));
        if (iconSize != null)
        headerParams.add("iconSize", apiClient.parameterToString(iconSize));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GetFileTypeIconResult> localVarReturnType = new ParameterizedTypeReference<GetFileTypeIconResult>() {};
        return apiClient.invokeAPI("/convert/autodetect/get-icon/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PNG icon byte array for the file extension
     * Returns a PNG icon for the given file format extension directly as a byte array. User may specify the icon size. Supports over 100 file formats, with a generic icon for unsupported formats.
     * <p><b>200</b> - OK
     * @param fileExtension Required; The file extension to be used for the icon. Limited to 4 AlphaNumeric characters.
     * @param iconSize Optional; The desired width of the icon, preserving its aspect ratio.
     * @return GetFileTypeIconResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetFileTypeIconResult> convertDocumentGetFileTypeIconAdvanced(String fileExtension, Integer iconSize) throws WebClientResponseException {
        ParameterizedTypeReference<GetFileTypeIconResult> localVarReturnType = new ParameterizedTypeReference<GetFileTypeIconResult>() {};
        return convertDocumentGetFileTypeIconAdvancedRequestCreation(fileExtension, iconSize).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetFileTypeIconResult>> convertDocumentGetFileTypeIconAdvancedWithHttpInfo(String fileExtension, Integer iconSize) throws WebClientResponseException {
        ParameterizedTypeReference<GetFileTypeIconResult> localVarReturnType = new ParameterizedTypeReference<GetFileTypeIconResult>() {};
        return convertDocumentGetFileTypeIconAdvancedRequestCreation(fileExtension, iconSize).toEntity(localVarReturnType);
    }
    /**
     * Convert HTML document file to PDF Document
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param includeBackgroundGraphics Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.
     * @param scaleFactor Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentHtmlToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (includeBackgroundGraphics != null)
        headerParams.add("includeBackgroundGraphics", apiClient.parameterToString(includeBackgroundGraphics));
        if (scaleFactor != null)
        headerParams.add("scaleFactor", apiClient.parameterToString(scaleFactor));
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
        return apiClient.invokeAPI("/convert/html/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML document file to PDF Document
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to PDF.  To use external files such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param includeBackgroundGraphics Optional: Set to true to include background graphics in the PDF, or false to not include.  Default is true.
     * @param scaleFactor Optional: Set to 100 to scale at 100%, set to 50% to scale down to 50% scale, set to 200% to scale up to 200% scale, etc.  Default is 100%. Maximum is 1000%.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentHtmlToPdf(org.springframework.core.io.AbstractResource inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentHtmlToPdfRequestCreation(inputFile, includeBackgroundGraphics, scaleFactor).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentHtmlToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean includeBackgroundGraphics, Integer scaleFactor) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentHtmlToPdfRequestCreation(inputFile, includeBackgroundGraphics, scaleFactor).toEntity(localVarReturnType);
    }
    /**
     * Convert HTML document file to PNG image array
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentHtmlToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return apiClient.invokeAPI("/convert/html/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML document file to PNG image array
     * Convert standard HTML, with full support for CSS, JavaScript, Images, and other complex behavior to an array of PNG images, one for each page.  To use external files in your HTML such as images, use an absolute URL to the file.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfToPngResult> convertDocumentHtmlToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return convertDocumentHtmlToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfToPngResult>> convertDocumentHtmlToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return convertDocumentHtmlToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * HTML Document file to Text (txt)
     * HTML document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentHtmlToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentHtmlToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/html/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * HTML Document file to Text (txt)
     * HTML document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentHtmlToTxt(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentHtmlToTxtRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentHtmlToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentHtmlToTxtRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to JPG/JPEG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return KeynoteToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentKeynoteToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<KeynoteToJpgResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToJpgResult>() {};
        return apiClient.invokeAPI("/convert/key/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Keynote Presentation (KEY) to JPG/JPEG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return KeynoteToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<KeynoteToJpgResult> convertDocumentKeynoteToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<KeynoteToJpgResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToJpgResult>() {};
        return convertDocumentKeynoteToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<KeynoteToJpgResult>> convertDocumentKeynoteToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<KeynoteToJpgResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToJpgResult>() {};
        return convertDocumentKeynoteToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PDF
     * Convert Mac Keynote Presentation (KEY) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentKeynoteToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/key/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Keynote Presentation (KEY) to PDF
     * Convert Mac Keynote Presentation (KEY) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentKeynoteToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentKeynoteToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentKeynoteToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentKeynoteToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PNG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return KeynoteToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentKeynoteToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<KeynoteToPngResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToPngResult>() {};
        return apiClient.invokeAPI("/convert/key/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Keynote Presentation (KEY) to PNG image array
     * Converts a Mac Keynote Presentation (KEY) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return KeynoteToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<KeynoteToPngResult> convertDocumentKeynoteToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<KeynoteToPngResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToPngResult>() {};
        return convertDocumentKeynoteToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<KeynoteToPngResult>> convertDocumentKeynoteToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<KeynoteToPngResult> localVarReturnType = new ParameterizedTypeReference<KeynoteToPngResult>() {};
        return convertDocumentKeynoteToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Keynote Presentation (KEY) to PPTX
     * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentKeynoteToPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentKeynoteToPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/key/to/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Keynote Presentation (KEY) to PPTX
     * Convert Mac Keynote Presentation (KEY) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentKeynoteToPptx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentKeynoteToPptxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentKeynoteToPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentKeynoteToPptxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Email MSG file to HTML string
     * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the MSG. Other information such as subject will still be given as properties in the response object. Default is false.
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
     * @return MsgToHtmlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentMsgToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
        if (includeAttachments != null)
        headerParams.add("includeAttachments", apiClient.parameterToString(includeAttachments));
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

        ParameterizedTypeReference<MsgToHtmlResult> localVarReturnType = new ParameterizedTypeReference<MsgToHtmlResult>() {};
        return apiClient.invokeAPI("/convert/msg/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email MSG file to HTML string
     * Convert Outlook Email MSG file to HTML string and attachments. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the MSG. Other information such as subject will still be given as properties in the response object. Default is false.
     * @param includeAttachments Optional; If false, the response object will not include any attachment files from the input file. Default is true.
     * @return MsgToHtmlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MsgToHtmlResult> convertDocumentMsgToHtml(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToHtmlResult> localVarReturnType = new ParameterizedTypeReference<MsgToHtmlResult>() {};
        return convertDocumentMsgToHtmlRequestCreation(inputFile, bodyOnly, includeAttachments).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<MsgToHtmlResult>> convertDocumentMsgToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly, Boolean includeAttachments) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToHtmlResult> localVarReturnType = new ParameterizedTypeReference<MsgToHtmlResult>() {};
        return convertDocumentMsgToHtmlRequestCreation(inputFile, bodyOnly, includeAttachments).toEntity(localVarReturnType);
    }
    /**
     * Convert Email MSG file to JPG/JPEG image array
     * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return MsgToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentMsgToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MsgToJpgResult> localVarReturnType = new ParameterizedTypeReference<MsgToJpgResult>() {};
        return apiClient.invokeAPI("/convert/msg/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email MSG file to JPG/JPEG image array
     * Converts an Outlook Message File (MSG) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return MsgToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MsgToJpgResult> convertDocumentMsgToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToJpgResult> localVarReturnType = new ParameterizedTypeReference<MsgToJpgResult>() {};
        return convertDocumentMsgToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<MsgToJpgResult>> convertDocumentMsgToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToJpgResult> localVarReturnType = new ParameterizedTypeReference<MsgToJpgResult>() {};
        return convertDocumentMsgToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Email MSG file to PDF document
     * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentMsgToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bodyOnly != null)
        headerParams.add("bodyOnly", apiClient.parameterToString(bodyOnly));
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
        return apiClient.invokeAPI("/convert/msg/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email MSG file to PDF document
     * Convert Outlook Email MSG file to PDF document. Supports images if they are base 64 inline. Supports most, but not all, RTF bodied MSG files.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param bodyOnly Optional; If true, the HTML string will only include the body of the email. Other information such as subject will still be given as properties in the response object. Default is false.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentMsgToPdf(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentMsgToPdfRequestCreation(inputFile, bodyOnly).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentMsgToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean bodyOnly) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentMsgToPdfRequestCreation(inputFile, bodyOnly).toEntity(localVarReturnType);
    }
    /**
     * Convert Email MSG file to PNG image array
     * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return MsgToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentMsgToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentMsgToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<MsgToPngResult> localVarReturnType = new ParameterizedTypeReference<MsgToPngResult>() {};
        return apiClient.invokeAPI("/convert/msg/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Email MSG file to PNG image array
     * Converts an Outlook Email Message File (MSG) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return MsgToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MsgToPngResult> convertDocumentMsgToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToPngResult> localVarReturnType = new ParameterizedTypeReference<MsgToPngResult>() {};
        return convertDocumentMsgToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<MsgToPngResult>> convertDocumentMsgToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MsgToPngResult> localVarReturnType = new ParameterizedTypeReference<MsgToPngResult>() {};
        return convertDocumentMsgToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODP Presentation to JPG/JPEG image array
     * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdpToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdpToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdpToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdpToJpgResult>() {};
        return apiClient.invokeAPI("/convert/odp/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODP Presentation to JPG/JPEG image array
     * Converts an Open Document Presentation (ODP) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdpToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdpToJpgResult> convertDocumentOdpToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdpToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdpToJpgResult>() {};
        return convertDocumentOdpToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdpToJpgResult>> convertDocumentOdpToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdpToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdpToJpgResult>() {};
        return convertDocumentOdpToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert ODP Presentation to PDF
     * Convert Office Open Document Presentation (ODP) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdpToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/odp/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODP Presentation to PDF
     * Convert Office Open Document Presentation (ODP) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdpToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdpToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdpToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdpToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODP Presentation to PNG image array
     * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdpToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdpToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<OdpToPngResult> localVarReturnType = new ParameterizedTypeReference<OdpToPngResult>() {};
        return apiClient.invokeAPI("/convert/odp/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODP Presentation to PNG image array
     * Converts an Office Open Document Presentation (ODP) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdpToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdpToPngResult> convertDocumentOdpToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdpToPngResult> localVarReturnType = new ParameterizedTypeReference<OdpToPngResult>() {};
        return convertDocumentOdpToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdpToPngResult>> convertDocumentOdpToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdpToPngResult> localVarReturnType = new ParameterizedTypeReference<OdpToPngResult>() {};
        return convertDocumentOdpToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODP Presentation to PPTX
     * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdpToPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdpToPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/odp/to/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODP Presentation to PPTX
     * Convert Office Open Document Presentation (ODP) to PowerPoint Presentation (PPTX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdpToPptx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdpToPptxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdpToPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdpToPptxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODS Spreadsheet to JPG/JPEG image array
     * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdsToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdsToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdsToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdsToJpgResult>() {};
        return apiClient.invokeAPI("/convert/ods/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODS Spreadsheet to JPG/JPEG image array
     * Converts an Open Document Spreadsheet (ODS) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdsToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdsToJpgResult> convertDocumentOdsToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdsToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdsToJpgResult>() {};
        return convertDocumentOdsToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdsToJpgResult>> convertDocumentOdsToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdsToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdsToJpgResult>() {};
        return convertDocumentOdsToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert ODS Spreadsheet to PDF
     * Convert Office Open Document Spreadsheet (ODS) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdsToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/ods/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODS Spreadsheet to PDF
     * Convert Office Open Document Spreadsheet (ODS) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdsToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdsToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdsToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdsToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODS Spreadsheet to PNG image array
     * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdsToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdsToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<OdsToPngResult> localVarReturnType = new ParameterizedTypeReference<OdsToPngResult>() {};
        return apiClient.invokeAPI("/convert/ods/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODS Spreadsheet to PNG image array
     * Converts an Office Open Document Spreadsheet (ODS) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdsToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdsToPngResult> convertDocumentOdsToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdsToPngResult> localVarReturnType = new ParameterizedTypeReference<OdsToPngResult>() {};
        return convertDocumentOdsToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdsToPngResult>> convertDocumentOdsToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdsToPngResult> localVarReturnType = new ParameterizedTypeReference<OdsToPngResult>() {};
        return convertDocumentOdsToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODS Spreadsheet to XLSX
     * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdsToXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdsToXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/ods/to/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODS Spreadsheet to XLSX
     * Convert Office Open Document Spreadsheet (ODS) to Excel Spreadsheet (XLSX)
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdsToXlsx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdsToXlsxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdsToXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdsToXlsxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODT Text File to Word DOCX
     * Convert Office Open Document Text File (ODT) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdtToDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/odt/to/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODT Text File to Word DOCX
     * Convert Office Open Document Text File (ODT) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdtToDocx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdtToDocxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdtToDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdtToDocxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODT Text File to JPG/JPEG image array
     * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdtToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdtToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<OdtToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdtToJpgResult>() {};
        return apiClient.invokeAPI("/convert/odt/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODT Text File to JPG/JPEG image array
     * Converts an Open Document Text File (ODT) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return OdtToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdtToJpgResult> convertDocumentOdtToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdtToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdtToJpgResult>() {};
        return convertDocumentOdtToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdtToJpgResult>> convertDocumentOdtToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<OdtToJpgResult> localVarReturnType = new ParameterizedTypeReference<OdtToJpgResult>() {};
        return convertDocumentOdtToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert ODT Text File to PDF
     * Convert Office Open Document Text File (ODT) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdtToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/odt/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODT Text File to PDF
     * Convert Office Open Document Text File (ODT) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentOdtToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdtToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentOdtToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentOdtToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert ODT Text File to PNG image array
     * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdtToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentOdtToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentOdtToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<OdtToPngResult> localVarReturnType = new ParameterizedTypeReference<OdtToPngResult>() {};
        return apiClient.invokeAPI("/convert/odt/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert ODT Text File to PNG image array
     * Converts an Office Open Document Text File (ODT) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return OdtToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OdtToPngResult> convertDocumentOdtToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdtToPngResult> localVarReturnType = new ParameterizedTypeReference<OdtToPngResult>() {};
        return convertDocumentOdtToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<OdtToPngResult>> convertDocumentOdtToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<OdtToPngResult> localVarReturnType = new ParameterizedTypeReference<OdtToPngResult>() {};
        return convertDocumentOdtToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to Word DOCX Document
     * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/pdf/to/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to Word DOCX Document
     * Convert standard PDF to Office Word Documents (docx).    Converts a PDF at high fidelity into Word format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPdfToDocx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToDocxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPdfToDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToDocxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to Word DOCX Document based on rasterized version of the PDF
     * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToDocxRasterizeRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToDocxRasterize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/pdf/to/docx/rasterize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to Word DOCX Document based on rasterized version of the PDF
     * Convert standard PDF to Office Word Documents (docx), but first rasterize the PDF.    Converts a PDF at high fidelity into Word format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPdfToDocxRasterize(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToDocxRasterizeRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPdfToDocxRasterizeWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToDocxRasterizeRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to JPG/JPEG image array
     * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return PdfToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<PdfToJpgResult> localVarReturnType = new ParameterizedTypeReference<PdfToJpgResult>() {};
        return apiClient.invokeAPI("/convert/pdf/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to JPG/JPEG image array
     * Converts a PDF Document to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return PdfToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfToJpgResult> convertDocumentPdfToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToJpgResult> localVarReturnType = new ParameterizedTypeReference<PdfToJpgResult>() {};
        return convertDocumentPdfToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfToJpgResult>> convertDocumentPdfToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToJpgResult> localVarReturnType = new ParameterizedTypeReference<PdfToJpgResult>() {};
        return convertDocumentPdfToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to PNG Image Array
     * Convert PDF document to PNG array, one image per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToPngArrayRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngArray", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return apiClient.invokeAPI("/convert/pdf/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to PNG Image Array
     * Convert PDF document to PNG array, one image per page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PdfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PdfToPngResult> convertDocumentPdfToPngArray(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return convertDocumentPdfToPngArrayRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PdfToPngResult>> convertDocumentPdfToPngArrayWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PdfToPngResult> localVarReturnType = new ParameterizedTypeReference<PdfToPngResult>() {};
        return convertDocumentPdfToPngArrayRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to Single PNG image
     * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToPngSingleRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPngSingle", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/pdf/to/png/merge-single", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to Single PNG image
     * Convert PDF document to a single tall PNG image, by stacking/concatenating the images vertically into a single \&quot;tall\&quot; image
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPdfToPngSingle(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToPngSingleRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPdfToPngSingleWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToPngSingleRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF to PowerPoint PPTX Presentation
     * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/pdf/to/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF to PowerPoint PPTX Presentation
     * Convert standard PDF to Office PowerPoint Presentation (pptx).  Converts a PDF file at high fidelity into PowerPoint format, where it can be easily edited and processed.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPdfToPptx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToPptxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPdfToPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPdfToPptxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PDF Document to Text (txt)
     * PDF document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting PDF to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPdfToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPdfToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/pdf/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PDF Document to Text (txt)
     * PDF document to text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param textFormattingMode Optional; specify how whitespace should be handled when converting PDF to text.  Possible values are &#39;preserveWhitespace&#39; which will attempt to preserve whitespace in the document and relative positioning of text within the document, and &#39;minimizeWhitespace&#39; which will not insert additional spaces into the document in most cases.  Default is &#39;preserveWhitespace&#39;.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentPdfToTxt(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentPdfToTxtRequestCreation(inputFile, textFormattingMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentPdfToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String textFormattingMode) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentPdfToTxtRequestCreation(inputFile, textFormattingMode).toEntity(localVarReturnType);
    }
    /**
     * Convert PNG Array to PDF
     * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
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
    private ResponseSpec convertDocumentPngArrayToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling convertDocumentPngArrayToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile2' is set
        if (inputFile2 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile2' when calling convertDocumentPngArrayToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/png/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PNG Array to PDF
     * Convert an array of PNG images, one image per page, into a newly-created PDF.  Supports images of different sizes as input.
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
    public Mono<byte[]> convertDocumentPngArrayToPdf(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPngArrayToPdfRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPngArrayToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPngArrayToPdfRequestCreation(inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PDF
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/ppt/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPT (97-03) Presentation to PDF
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPptToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPptToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPT (97-03) Presentation to PPTX
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptToPptxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPptToPptx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/ppt/to/pptx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPT (97-03) Presentation to PPTX
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPptToPptx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptToPptxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPptToPptxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptToPptxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPTX Presentation to PDF
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptxToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/pptx/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPTX Presentation to PDF
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentPptxToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptxToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentPptxToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentPptxToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPTX to PNG image array
     * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PptxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptxToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PptxToPngResult> localVarReturnType = new ParameterizedTypeReference<PptxToPngResult>() {};
        return apiClient.invokeAPI("/convert/pptx/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPTX to PNG image array
     * Converts a PowerPoint Presentation (PPTX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return PptxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PptxToPngResult> convertDocumentPptxToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PptxToPngResult> localVarReturnType = new ParameterizedTypeReference<PptxToPngResult>() {};
        return convertDocumentPptxToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<PptxToPngResult>> convertDocumentPptxToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<PptxToPngResult> localVarReturnType = new ParameterizedTypeReference<PptxToPngResult>() {};
        return convertDocumentPptxToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
     * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
     * <p><b>200</b> - OK
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptxToPptRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/pptx/to/ppt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPTX presentation to Legacy PowerPoint PPT (97-03)
     * Convert/downgrade modern Office PowerPoint PPTX Presentation to the legacy PowerPoint PPT (97-2003 Format) format
     * <p><b>200</b> - OK
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> convertDocumentPptxToPpt() throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDocumentPptxToPptRequestCreation().bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> convertDocumentPptxToPptWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDocumentPptxToPptRequestCreation().toEntity(localVarReturnType);
    }
    /**
     * Convert PowerPoint PPTX Presentation to Text (txt)
     * Convert Office PowerPoint Documents (pptx) to standard Text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentPptxToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentPptxToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/pptx/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert PowerPoint PPTX Presentation to Text (txt)
     * Convert Office PowerPoint Documents (pptx) to standard Text
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentPptxToTxt(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentPptxToTxtRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentPptxToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentPptxToTxtRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Rich Text Format RTF to DOCX Document
     * Convert Rich Text Format Document (RTF) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentRtfToDocxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/rtf/to/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Rich Text Format RTF to DOCX Document
     * Convert Rich Text Format Document (RTF) to Word DOCX Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentRtfToDocx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToDocxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentRtfToDocxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToDocxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Rich Text Format RTF to HTML Document
     * Convert Rich Text Format Document (RTF) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentRtfToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/rtf/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Rich Text Format RTF to HTML Document
     * Convert Rich Text Format Document (RTF) to HTML Document
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentRtfToHtml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToHtmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentRtfToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToHtmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Rich Text Format RTF to JPG/JPEG image array
     * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return RtfToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentRtfToJpgRequestCreation(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<RtfToJpgResult> localVarReturnType = new ParameterizedTypeReference<RtfToJpgResult>() {};
        return apiClient.invokeAPI("/convert/rtf/to/jpg", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Rich Text Format RTF to JPG/JPEG image array
     * Converts a Rich Text Format Document (RTF) to an array of JPG/JPEG images, one for each page. Customize image quality using quality header.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param quality Optional; Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75. Default value is 75.
     * @return RtfToJpgResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RtfToJpgResult> convertDocumentRtfToJpg(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<RtfToJpgResult> localVarReturnType = new ParameterizedTypeReference<RtfToJpgResult>() {};
        return convertDocumentRtfToJpgRequestCreation(inputFile, quality).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RtfToJpgResult>> convertDocumentRtfToJpgWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Integer quality) throws WebClientResponseException {
        ParameterizedTypeReference<RtfToJpgResult> localVarReturnType = new ParameterizedTypeReference<RtfToJpgResult>() {};
        return convertDocumentRtfToJpgRequestCreation(inputFile, quality).toEntity(localVarReturnType);
    }
    /**
     * Convert Rich Text Format RTF to PDF
     * Convert Rich Text Format Document (RTF) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentRtfToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/rtf/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Rich Text Format RTF to PDF
     * Convert Rich Text Format Document (RTF) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentRtfToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentRtfToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentRtfToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Rich Text Format RTF to PNG image array
     * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return RtfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentRtfToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentRtfToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RtfToPngResult> localVarReturnType = new ParameterizedTypeReference<RtfToPngResult>() {};
        return apiClient.invokeAPI("/convert/rtf/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Rich Text Format RTF to PNG image array
     * Converts a Rich Text Format Document (RTF) to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return RtfToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RtfToPngResult> convertDocumentRtfToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<RtfToPngResult> localVarReturnType = new ParameterizedTypeReference<RtfToPngResult>() {};
        return convertDocumentRtfToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<RtfToPngResult>> convertDocumentRtfToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<RtfToPngResult> localVarReturnType = new ParameterizedTypeReference<RtfToPngResult>() {};
        return convertDocumentRtfToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to CSV
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsToCsvRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToCsv", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xls/to/csv", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to CSV
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to standard CSV format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsToCsv(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToCsvRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsToCsvWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToCsvRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to PDF
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xls/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to PDF
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLS (97-03) Spreadsheet to XLSX
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsToXlsxRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsToXlsx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xls/to/xlsx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLS (97-03) Spreadsheet to XLSX
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsToXlsx(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToXlsxRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsToXlsxWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsToXlsxRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToCsvRequestCreation(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsv", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (outputEncoding != null)
        headerParams.add("outputEncoding", apiClient.parameterToString(outputEncoding));
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
        return apiClient.invokeAPI("/convert/xlsx/to/csv", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to CSV, Single Worksheet
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format.  Supports both XLSX and XLSB file Excel formats.  If the input file contains multiple worksheets, the first one is used.  If you wish to convert all of the worksheets (not just the first one), be sure to use the xlsx/to/csv/multi API.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsxToCsv(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToCsvRequestCreation(inputFile, outputEncoding).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsxToCsvWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToCsvRequestCreation(inputFile, outputEncoding).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
     * @return CsvCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToCsvMultiRequestCreation(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsvMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (outputEncoding != null)
        headerParams.add("outputEncoding", apiClient.parameterToString(outputEncoding));
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

        ParameterizedTypeReference<CsvCollection> localVarReturnType = new ParameterizedTypeReference<CsvCollection>() {};
        return apiClient.invokeAPI("/convert/xlsx/to/csv/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to CSV, Multiple Worksheets
     * Convert Office Excel Workbooks (XLSX) to standard Comma-Separated Values (CSV) format, with support for multiple worksheets.  Supports both XLSX and XLSB file Excel formats.  Returns multiple CSV files, one for each worksheet (tab) in the spreadsheet.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param outputEncoding Optional, set the output text encoding for the result; possible values are UTF-8, ASCII and UTF-32.  Default is UTF-8.
     * @return CsvCollection
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CsvCollection> convertDocumentXlsxToCsvMulti(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        ParameterizedTypeReference<CsvCollection> localVarReturnType = new ParameterizedTypeReference<CsvCollection>() {};
        return convertDocumentXlsxToCsvMultiRequestCreation(inputFile, outputEncoding).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CsvCollection>> convertDocumentXlsxToCsvMultiWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, String outputEncoding) throws WebClientResponseException {
        ParameterizedTypeReference<CsvCollection> localVarReturnType = new ParameterizedTypeReference<CsvCollection>() {};
        return convertDocumentXlsxToCsvMultiRequestCreation(inputFile, outputEncoding).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to HTML Document
     * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xlsx/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to HTML Document
     * Convert Office Excel Spreadsheet (XLSX) to HTML Document.  Converts all worksheets to HTML.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsxToHtml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToHtmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsxToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToHtmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to PDF
     * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToPdfRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xlsx/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to PDF
     * Convert Office Excel Workbooks (XLSX) to standard PDF.  Converts all worksheets in the workbook to PDF.  Supports both XLSX and XLSB Excel file formats.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsxToPdf(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToPdfRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsxToPdfWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToPdfRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX spreadsheet to PNG image array
     * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return XlsxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToPngRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<XlsxToPngResult> localVarReturnType = new ParameterizedTypeReference<XlsxToPngResult>() {};
        return apiClient.invokeAPI("/convert/xlsx/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX spreadsheet to PNG image array
     * Converts an Excel Spreadsheet (XLSX) file to an array of PNG images, one for each page.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return XlsxToPngResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XlsxToPngResult> convertDocumentXlsxToPng(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XlsxToPngResult> localVarReturnType = new ParameterizedTypeReference<XlsxToPngResult>() {};
        return convertDocumentXlsxToPngRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XlsxToPngResult>> convertDocumentXlsxToPngWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XlsxToPngResult> localVarReturnType = new ParameterizedTypeReference<XlsxToPngResult>() {};
        return convertDocumentXlsxToPngRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to Text (txt)
     * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToTxtRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return apiClient.invokeAPI("/convert/xlsx/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to Text (txt)
     * Convert Office Excel Workbooks (XLSX) to standard Text.  Converts all worksheets in the workbook to Text.  Supports both XLSX and XLSB file formats.  When a spreadsheet contains multiple worksheets, will export all of the text from all of the worksheets.  If you wish to export the text from only one worksheet, try using the Split XLSX API to split the spreadsheet into multiple worksheet files, and then run XLSX to Text on the individual worksheet file that you need to extract the text from.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return TextConversionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextConversionResult> convertDocumentXlsxToTxt(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentXlsxToTxtRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextConversionResult>> convertDocumentXlsxToTxtWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextConversionResult> localVarReturnType = new ParameterizedTypeReference<TextConversionResult>() {};
        return convertDocumentXlsxToTxtRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
     * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDocumentXlsxToXlsRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDocumentXlsxToXls", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/xlsx/to/xls", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX Spreadsheet to Legacy Excel XLS (97-03)
     * Convert/downgrade modern Office Excel XLSX Spreadsheet to the legacy Excel XLS (97-2003 Format) format
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDocumentXlsxToXls(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToXlsRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDocumentXlsxToXlsWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDocumentXlsxToXlsRequestCreation(inputFile).toEntity(localVarReturnType);
    }
}
