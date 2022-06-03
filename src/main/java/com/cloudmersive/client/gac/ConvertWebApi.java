package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.HtmlMdResult;
import com.cloudmersive.client.gac.model.HtmlToOfficeRequest;
import com.cloudmersive.client.gac.model.HtmlToPdfRequest;
import com.cloudmersive.client.gac.model.HtmlToPngRequest;
import com.cloudmersive.client.gac.model.HtmlToTextRequest;
import com.cloudmersive.client.gac.model.HtmlToTextResponse;
import com.cloudmersive.client.gac.model.ScreenshotRequest;
import com.cloudmersive.client.gac.model.UrlToPdfRequest;
import com.cloudmersive.client.gac.model.UrlToTextRequest;
import com.cloudmersive.client.gac.model.UrlToTextResponse;

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
public class ConvertWebApi {
    private ApiClient apiClient;

    public ConvertWebApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertWebApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert HTML to Word DOCX Document
     * Convert HTML to Office Word Document (DOCX) format
     * <p><b>200</b> - OK
     * @param inputRequest HTML input to convert to DOCX
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebHtmlToDocxRequestCreation(HtmlToOfficeRequest inputRequest) throws WebClientResponseException {
        Object postBody = inputRequest;
        // verify the required parameter 'inputRequest' is set
        if (inputRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputRequest' when calling convertWebHtmlToDocx", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/html/to/docx", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML to Word DOCX Document
     * Convert HTML to Office Word Document (DOCX) format
     * <p><b>200</b> - OK
     * @param inputRequest HTML input to convert to DOCX
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertWebHtmlToDocx(HtmlToOfficeRequest inputRequest) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToDocxRequestCreation(inputRequest).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertWebHtmlToDocxWithHttpInfo(HtmlToOfficeRequest inputRequest) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToDocxRequestCreation(inputRequest).toEntity(localVarReturnType);
    }
    /**
     * Convert HTML string to PDF
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PDF request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebHtmlToPdfRequestCreation(HtmlToPdfRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebHtmlToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/web/html/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML string to PDF
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PDF request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertWebHtmlToPdf(HtmlToPdfRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToPdfRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertWebHtmlToPdfWithHttpInfo(HtmlToPdfRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToPdfRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Convert HTML string to PNG screenshot
     * Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PNG request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebHtmlToPngRequestCreation(HtmlToPngRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebHtmlToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/web/html/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML string to PNG screenshot
     * Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input HTML to PNG request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertWebHtmlToPng(HtmlToPngRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToPngRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertWebHtmlToPngWithHttpInfo(HtmlToPngRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebHtmlToPngRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Convert HTML string to text (txt)
     * Converts an HTML string input into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters
     * @return HtmlToTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebHtmlToTxtRequestCreation(HtmlToTextRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebHtmlToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HtmlToTextResponse> localVarReturnType = new ParameterizedTypeReference<HtmlToTextResponse>() {};
        return apiClient.invokeAPI("/convert/web/html/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert HTML string to text (txt)
     * Converts an HTML string input into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters
     * @return HtmlToTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlToTextResponse> convertWebHtmlToTxt(HtmlToTextRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlToTextResponse> localVarReturnType = new ParameterizedTypeReference<HtmlToTextResponse>() {};
        return convertWebHtmlToTxtRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlToTextResponse>> convertWebHtmlToTxtWithHttpInfo(HtmlToTextRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlToTextResponse> localVarReturnType = new ParameterizedTypeReference<HtmlToTextResponse>() {};
        return convertWebHtmlToTxtRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Convert Markdown to HTML
     * Convert a markdown file (.md) to HTML
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return HtmlMdResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebMdToHtmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertWebMdToHtml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HtmlMdResult> localVarReturnType = new ParameterizedTypeReference<HtmlMdResult>() {};
        return apiClient.invokeAPI("/convert/web/md/to/html", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Markdown to HTML
     * Convert a markdown file (.md) to HTML
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return HtmlMdResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlMdResult> convertWebMdToHtml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlMdResult> localVarReturnType = new ParameterizedTypeReference<HtmlMdResult>() {};
        return convertWebMdToHtmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlMdResult>> convertWebMdToHtmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlMdResult> localVarReturnType = new ParameterizedTypeReference<HtmlMdResult>() {};
        return convertWebMdToHtmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert a URL to PDF
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input URL to PDF request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebUrlToPdfRequestCreation(UrlToPdfRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebUrlToPdf", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/web/url/to/pdf", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert a URL to PDF
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input URL to PDF request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertWebUrlToPdf(UrlToPdfRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebUrlToPdfRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertWebUrlToPdfWithHttpInfo(UrlToPdfRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebUrlToPdfRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Take screenshot of URL
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input Screenshot request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebUrlToScreenshotRequestCreation(ScreenshotRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebUrlToScreenshot", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/convert/web/url/to/screenshot", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Take screenshot of URL
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     * <p><b>200</b> - OK
     * @param input Screenshot request parameters
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertWebUrlToScreenshot(ScreenshotRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebUrlToScreenshotRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertWebUrlToScreenshotWithHttpInfo(ScreenshotRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertWebUrlToScreenshotRequestCreation(input).toEntity(localVarReturnType);
    }
    /**
     * Convert website URL page to text (txt)
     * Converts a website URL page into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters
     * @return UrlToTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertWebUrlToTxtRequestCreation(UrlToTextRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling convertWebUrlToTxt", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<UrlToTextResponse> localVarReturnType = new ParameterizedTypeReference<UrlToTextResponse>() {};
        return apiClient.invokeAPI("/convert/web/url/to/txt", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert website URL page to text (txt)
     * Converts a website URL page into text (txt); extracts text from HTML
     * <p><b>200</b> - OK
     * @param input HTML to Text request parameters
     * @return UrlToTextResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UrlToTextResponse> convertWebUrlToTxt(UrlToTextRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<UrlToTextResponse> localVarReturnType = new ParameterizedTypeReference<UrlToTextResponse>() {};
        return convertWebUrlToTxtRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<UrlToTextResponse>> convertWebUrlToTxtWithHttpInfo(UrlToTextRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<UrlToTextResponse> localVarReturnType = new ParameterizedTypeReference<UrlToTextResponse>() {};
        return convertWebUrlToTxtRequestCreation(input).toEntity(localVarReturnType);
    }
}
