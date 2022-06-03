package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.HtmlGetLanguageResult;
import com.cloudmersive.client.gac.model.HtmlGetLinksResponse;
import com.cloudmersive.client.gac.model.HtmlGetRelCanonicalUrlResult;
import com.cloudmersive.client.gac.model.HtmlGetSitemapUrlResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class EditHtmlApi {
    private ApiClient apiClient;

    public EditHtmlApi() {
        this(new ApiClient());
    }

    @Autowired
    public EditHtmlApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Append an HTML tag to the HEAD section of an HTML Document
     * Appends an HTML tag to the HEAD section of an HTML document.
     * <p><b>200</b> - OK
     * @param htmlTag The HTML tag to append.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlAppendHeaderTagRequestCreation(String htmlTag, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'htmlTag' is set
        if (htmlTag == null) {
            throw new WebClientResponseException("Missing the required parameter 'htmlTag' when calling editHtmlHtmlAppendHeaderTag", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (htmlTag != null)
        headerParams.add("htmlTag", apiClient.parameterToString(htmlTag));
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
        return apiClient.invokeAPI("/convert/edit/html/head/append/tag", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append an HTML tag to the HEAD section of an HTML Document
     * Appends an HTML tag to the HEAD section of an HTML document.
     * <p><b>200</b> - OK
     * @param htmlTag The HTML tag to append.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlAppendHeaderTag(String htmlTag, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendHeaderTagRequestCreation(htmlTag, inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlAppendHeaderTagWithHttpInfo(String htmlTag, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendHeaderTagRequestCreation(htmlTag, inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Append a Heading to an HTML Document
     * Appends a heading to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param headingText The text content to be used in the header.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param headingSize Optional: The heading size number. Default is 1. Accepts values between 1 and 6.
     * @param cssStyle Optional: The CSS style for the heading.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlAppendHeadingRequestCreation(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'headingText' is set
        if (headingText == null) {
            throw new WebClientResponseException("Missing the required parameter 'headingText' when calling editHtmlHtmlAppendHeading", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (headingText != null)
        headerParams.add("headingText", apiClient.parameterToString(headingText));
        if (headingSize != null)
        headerParams.add("headingSize", apiClient.parameterToString(headingSize));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));
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
        return apiClient.invokeAPI("/convert/edit/html/append/heading", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append a Heading to an HTML Document
     * Appends a heading to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param headingText The text content to be used in the header.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param headingSize Optional: The heading size number. Default is 1. Accepts values between 1 and 6.
     * @param cssStyle Optional: The CSS style for the heading.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlAppendHeading(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendHeadingRequestCreation(headingText, inputFileUrl, headingSize, cssStyle, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlAppendHeadingWithHttpInfo(String headingText, String inputFileUrl, Integer headingSize, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendHeadingRequestCreation(headingText, inputFileUrl, headingSize, cssStyle, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Append an Image to an HTML Document from a URL
     * Appends an image to the end of an HTML document using a URL.
     * <p><b>200</b> - OK
     * @param imageUrl The URL for the image.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param cssStyle Optional: CSS style for the image.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlAppendImageFromUrlRequestCreation(String imageUrl, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageUrl' is set
        if (imageUrl == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageUrl' when calling editHtmlHtmlAppendImageFromUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (imageUrl != null)
        headerParams.add("imageUrl", apiClient.parameterToString(imageUrl));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));
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
        return apiClient.invokeAPI("/convert/edit/html/append/image/from-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append an Image to an HTML Document from a URL
     * Appends an image to the end of an HTML document using a URL.
     * <p><b>200</b> - OK
     * @param imageUrl The URL for the image.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param cssStyle Optional: CSS style for the image.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlAppendImageFromUrl(String imageUrl, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendImageFromUrlRequestCreation(imageUrl, inputFileUrl, cssStyle, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlAppendImageFromUrlWithHttpInfo(String imageUrl, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendImageFromUrlRequestCreation(imageUrl, inputFileUrl, cssStyle, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Append a Base64 Inline Image to an HTML Document
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param imageUrl Optional: Image URL to be appended as base64 inline image.
     * @param cssStyle Optional: CSS style for the image.
     * @param imageExtension Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG.
     * @param inputFile Optional: Input file to perform the operation on.
     * @param imageFile Optional: Image file to be appended as base64 inline image.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlAppendImageInlineRequestCreation(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (imageUrl != null)
        headerParams.add("imageUrl", apiClient.parameterToString(imageUrl));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));
        if (imageExtension != null)
        headerParams.add("imageExtension", apiClient.parameterToString(imageExtension));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);
        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/convert/edit/html/append/image/inline", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append a Base64 Inline Image to an HTML Document
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param imageUrl Optional: Image URL to be appended as base64 inline image.
     * @param cssStyle Optional: CSS style for the image.
     * @param imageExtension Optional: The extension (JPG, PNG, GIF, etc.) of the image file. Recommended if uploading an imageFile directly, instead of using imageUrl. If no extension can be determined, will default to JPG.
     * @param inputFile Optional: Input file to perform the operation on.
     * @param imageFile Optional: Image file to be appended as base64 inline image.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlAppendImageInline(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendImageInlineRequestCreation(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlAppendImageInlineWithHttpInfo(String inputFileUrl, String imageUrl, String cssStyle, String imageExtension, org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendImageInlineRequestCreation(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Append a Paragraph to an HTML Document
     * Appends a paragraph to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param paragraphText The text content to be used in the paragraph.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param cssStyle Optional: The CSS style for the paragraph.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlAppendParagraphRequestCreation(String paragraphText, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'paragraphText' is set
        if (paragraphText == null) {
            throw new WebClientResponseException("Missing the required parameter 'paragraphText' when calling editHtmlHtmlAppendParagraph", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (paragraphText != null)
        headerParams.add("paragraphText", apiClient.parameterToString(paragraphText));
        if (cssStyle != null)
        headerParams.add("cssStyle", apiClient.parameterToString(cssStyle));
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
        return apiClient.invokeAPI("/convert/edit/html/append/paragraph", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Append a Paragraph to an HTML Document
     * Appends a paragraph to the end of an HTML document.
     * <p><b>200</b> - OK
     * @param paragraphText The text content to be used in the paragraph.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param cssStyle Optional: The CSS style for the paragraph.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlAppendParagraph(String paragraphText, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendParagraphRequestCreation(paragraphText, inputFileUrl, cssStyle, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlAppendParagraphWithHttpInfo(String paragraphText, String inputFileUrl, String cssStyle, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlAppendParagraphRequestCreation(paragraphText, inputFileUrl, cssStyle, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Create a Blank HTML Document
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     * <p><b>200</b> - OK
     * @param title Optional: The title of the HTML document
     * @param cssUrl Optional: A CSS style URL to be added to the document.
     * @param cssInline Optional: An inline CSS style to be added to the document.
     * @param javascriptUrl Optional: Javascript URL to be added to the document.
     * @param javascriptInline Optional: Inline Javascript to be added to the document.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlCreateBlankDocumentRequestCreation(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (title != null)
        headerParams.add("title", apiClient.parameterToString(title));
        if (cssUrl != null)
        headerParams.add("cssUrl", apiClient.parameterToString(cssUrl));
        if (cssInline != null)
        headerParams.add("cssInline", apiClient.parameterToString(cssInline));
        if (javascriptUrl != null)
        headerParams.add("javascriptUrl", apiClient.parameterToString(javascriptUrl));
        if (javascriptInline != null)
        headerParams.add("javascriptInline", apiClient.parameterToString(javascriptInline));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/edit/html/create/blank", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create a Blank HTML Document
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     * <p><b>200</b> - OK
     * @param title Optional: The title of the HTML document
     * @param cssUrl Optional: A CSS style URL to be added to the document.
     * @param cssInline Optional: An inline CSS style to be added to the document.
     * @param javascriptUrl Optional: Javascript URL to be added to the document.
     * @param javascriptInline Optional: Inline Javascript to be added to the document.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlCreateBlankDocument(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlCreateBlankDocumentRequestCreation(title, cssUrl, cssInline, javascriptUrl, javascriptInline).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlCreateBlankDocumentWithHttpInfo(String title, String cssUrl, String cssInline, String javascriptUrl, String javascriptInline) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlCreateBlankDocumentRequestCreation(title, cssUrl, cssInline, javascriptUrl, javascriptInline).toEntity(localVarReturnType);
    }
    /**
     * Gets the language for the HTML document
     * Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetLanguageResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlGetLanguageRequestCreation(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
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

        ParameterizedTypeReference<HtmlGetLanguageResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetLanguageResult>() {};
        return apiClient.invokeAPI("/convert/edit/html/head/get/language", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the language for the HTML document
     * Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetLanguageResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlGetLanguageResult> editHtmlHtmlGetLanguage(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetLanguageResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetLanguageResult>() {};
        return editHtmlHtmlGetLanguageRequestCreation(inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlGetLanguageResult>> editHtmlHtmlGetLanguageWithHttpInfo(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetLanguageResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetLanguageResult>() {};
        return editHtmlHtmlGetLanguageRequestCreation(inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Extract resolved link URLs from HTML File
     * Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param baseUrl Optional: Base URL of the page, such as https://mydomain.com
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetLinksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlGetLinksRequestCreation(String inputFileUrl, String baseUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (baseUrl != null)
        headerParams.add("baseUrl", apiClient.parameterToString(baseUrl));
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

        ParameterizedTypeReference<HtmlGetLinksResponse> localVarReturnType = new ParameterizedTypeReference<HtmlGetLinksResponse>() {};
        return apiClient.invokeAPI("/convert/edit/html/extract/links", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Extract resolved link URLs from HTML File
     * Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param baseUrl Optional: Base URL of the page, such as https://mydomain.com
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetLinksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlGetLinksResponse> editHtmlHtmlGetLinks(String inputFileUrl, String baseUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetLinksResponse> localVarReturnType = new ParameterizedTypeReference<HtmlGetLinksResponse>() {};
        return editHtmlHtmlGetLinksRequestCreation(inputFileUrl, baseUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlGetLinksResponse>> editHtmlHtmlGetLinksWithHttpInfo(String inputFileUrl, String baseUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetLinksResponse> localVarReturnType = new ParameterizedTypeReference<HtmlGetLinksResponse>() {};
        return editHtmlHtmlGetLinksRequestCreation(inputFileUrl, baseUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Gets the rel canonical URL for the HTML document
     * Gets the rel canonical URL of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetRelCanonicalUrlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlGetRelCanonicalRequestCreation(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
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

        ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult>() {};
        return apiClient.invokeAPI("/convert/edit/html/head/get/rel-canonical-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the rel canonical URL for the HTML document
     * Gets the rel canonical URL of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetRelCanonicalUrlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlGetRelCanonicalUrlResult> editHtmlHtmlGetRelCanonical(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult>() {};
        return editHtmlHtmlGetRelCanonicalRequestCreation(inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlGetRelCanonicalUrlResult>> editHtmlHtmlGetRelCanonicalWithHttpInfo(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetRelCanonicalUrlResult>() {};
        return editHtmlHtmlGetRelCanonicalRequestCreation(inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Gets the sitemap URL for the HTML document
     * Gets the sitemap link URL of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetSitemapUrlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlGetSitemapRequestCreation(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
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

        ParameterizedTypeReference<HtmlGetSitemapUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetSitemapUrlResult>() {};
        return apiClient.invokeAPI("/convert/edit/html/head/get/sitemap-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Gets the sitemap URL for the HTML document
     * Gets the sitemap link URL of an HTML document.
     * <p><b>200</b> - OK
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return HtmlGetSitemapUrlResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlGetSitemapUrlResult> editHtmlHtmlGetSitemap(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetSitemapUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetSitemapUrlResult>() {};
        return editHtmlHtmlGetSitemapRequestCreation(inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlGetSitemapUrlResult>> editHtmlHtmlGetSitemapWithHttpInfo(String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlGetSitemapUrlResult> localVarReturnType = new ParameterizedTypeReference<HtmlGetSitemapUrlResult>() {};
        return editHtmlHtmlGetSitemapRequestCreation(inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Sets the language for the HTML document
     * Sets the language code of an HTML document.
     * <p><b>200</b> - OK
     * @param languageCode The HTML langauge code to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlSetLanguageRequestCreation(String languageCode, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'languageCode' is set
        if (languageCode == null) {
            throw new WebClientResponseException("Missing the required parameter 'languageCode' when calling editHtmlHtmlSetLanguage", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (languageCode != null)
        headerParams.add("languageCode", apiClient.parameterToString(languageCode));
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
        return apiClient.invokeAPI("/convert/edit/html/head/set/language", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the language for the HTML document
     * Sets the language code of an HTML document.
     * <p><b>200</b> - OK
     * @param languageCode The HTML langauge code to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlSetLanguage(String languageCode, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetLanguageRequestCreation(languageCode, inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlSetLanguageWithHttpInfo(String languageCode, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetLanguageRequestCreation(languageCode, inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Sets the rel canonical URL for the HTML document
     * Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.
     * <p><b>200</b> - OK
     * @param canonicalUrl The HTML canonical URL to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlSetRelCanonicalRequestCreation(String canonicalUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'canonicalUrl' is set
        if (canonicalUrl == null) {
            throw new WebClientResponseException("Missing the required parameter 'canonicalUrl' when calling editHtmlHtmlSetRelCanonical", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (canonicalUrl != null)
        headerParams.add("canonicalUrl", apiClient.parameterToString(canonicalUrl));
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
        return apiClient.invokeAPI("/convert/edit/html/head/set/rel-canonical-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the rel canonical URL for the HTML document
     * Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.
     * <p><b>200</b> - OK
     * @param canonicalUrl The HTML canonical URL to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlSetRelCanonical(String canonicalUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetRelCanonicalRequestCreation(canonicalUrl, inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlSetRelCanonicalWithHttpInfo(String canonicalUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetRelCanonicalRequestCreation(canonicalUrl, inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Sets the sitemap URL for the HTML document
     * Sets the sitemap URL of an HTML document.
     * <p><b>200</b> - OK
     * @param sitemapUrl The HTML sitemap URL to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec editHtmlHtmlSetSitemapUrlRequestCreation(String sitemapUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'sitemapUrl' is set
        if (sitemapUrl == null) {
            throw new WebClientResponseException("Missing the required parameter 'sitemapUrl' when calling editHtmlHtmlSetSitemapUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFileUrl != null)
        headerParams.add("inputFileUrl", apiClient.parameterToString(inputFileUrl));
        if (sitemapUrl != null)
        headerParams.add("sitemapUrl", apiClient.parameterToString(sitemapUrl));
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
        return apiClient.invokeAPI("/convert/edit/html/head/set/sitemap-url", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the sitemap URL for the HTML document
     * Sets the sitemap URL of an HTML document.
     * <p><b>200</b> - OK
     * @param sitemapUrl The HTML sitemap URL to set.
     * @param inputFileUrl Optional: URL of a file to operate on as input.
     * @param inputFile Optional: Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> editHtmlHtmlSetSitemapUrl(String sitemapUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetSitemapUrlRequestCreation(sitemapUrl, inputFileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> editHtmlHtmlSetSitemapUrlWithHttpInfo(String sitemapUrl, String inputFileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return editHtmlHtmlSetSitemapUrlRequestCreation(sitemapUrl, inputFileUrl, inputFile).toEntity(localVarReturnType);
    }
}
