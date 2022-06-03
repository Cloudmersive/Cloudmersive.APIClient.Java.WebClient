package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.VirusScanAdvancedResult;
import com.cloudmersive.client.gac.model.VirusScanResult;
import com.cloudmersive.client.gac.model.WebsiteScanRequest;
import com.cloudmersive.client.gac.model.WebsiteScanResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:56.710113300-07:00[America/Los_Angeles]")
public class ScanApi {
    private ApiClient apiClient;

    public ScanApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Scan a file for viruses
     * Scan files and content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return VirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanFileRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling scanFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<VirusScanResult> localVarReturnType = new ParameterizedTypeReference<VirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/file", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan a file for viruses
     * Scan files and content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return VirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirusScanResult> scanFile(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<VirusScanResult> localVarReturnType = new ParameterizedTypeReference<VirusScanResult>() {};
        return scanFileRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<VirusScanResult>> scanFileWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<VirusScanResult> localVarReturnType = new ParameterizedTypeReference<VirusScanResult>() {};
        return scanFileRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Advanced Scan a file for viruses
     * Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash, MSG, and a wide range of image file formats.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return VirusScanAdvancedResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanFileAdvancedRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling scanFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (allowExecutables != null)
        headerParams.add("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        headerParams.add("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        headerParams.add("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        headerParams.add("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        headerParams.add("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        headerParams.add("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        headerParams.add("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        headerParams.add("allowHtml", apiClient.parameterToString(allowHtml));
        if (restrictFileTypes != null)
        headerParams.add("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));
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

        ParameterizedTypeReference<VirusScanAdvancedResult> localVarReturnType = new ParameterizedTypeReference<VirusScanAdvancedResult>() {};
        return apiClient.invokeAPI("/virus/scan/file/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Advanced Scan a file for viruses
     * Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash, MSG, and a wide range of image file formats.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return VirusScanAdvancedResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VirusScanAdvancedResult> scanFileAdvanced(org.springframework.core.io.AbstractResource inputFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<VirusScanAdvancedResult> localVarReturnType = new ParameterizedTypeReference<VirusScanAdvancedResult>() {};
        return scanFileAdvancedRequestCreation(inputFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<VirusScanAdvancedResult>> scanFileAdvancedWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<VirusScanAdvancedResult> localVarReturnType = new ParameterizedTypeReference<VirusScanAdvancedResult>() {};
        return scanFileAdvancedRequestCreation(inputFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).toEntity(localVarReturnType);
    }
    /**
     * Scan a website for malicious content and threats
     * Operation includes scanning the content of the URL for various types of malicious content and threats, including viruses and threats (including Phishing).
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return WebsiteScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanWebsiteRequestCreation(WebsiteScanRequest input) throws WebClientResponseException {
        Object postBody = input;
        // verify the required parameter 'input' is set
        if (input == null) {
            throw new WebClientResponseException("Missing the required parameter 'input' when calling scanWebsite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<WebsiteScanResult> localVarReturnType = new ParameterizedTypeReference<WebsiteScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/website", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan a website for malicious content and threats
     * Operation includes scanning the content of the URL for various types of malicious content and threats, including viruses and threats (including Phishing).
     * <p><b>200</b> - OK
     * @param input The input parameter
     * @return WebsiteScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebsiteScanResult> scanWebsite(WebsiteScanRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<WebsiteScanResult> localVarReturnType = new ParameterizedTypeReference<WebsiteScanResult>() {};
        return scanWebsiteRequestCreation(input).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<WebsiteScanResult>> scanWebsiteWithHttpInfo(WebsiteScanRequest input) throws WebClientResponseException {
        ParameterizedTypeReference<WebsiteScanResult> localVarReturnType = new ParameterizedTypeReference<WebsiteScanResult>() {};
        return scanWebsiteRequestCreation(input).toEntity(localVarReturnType);
    }
}
