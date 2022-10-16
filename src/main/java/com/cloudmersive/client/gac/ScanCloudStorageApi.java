package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.CloudStorageAdvancedVirusScanResult;
import com.cloudmersive.client.gac.model.CloudStorageVirusScanResult;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:16:44.614679900-07:00[America/Los_Angeles]")
public class ScanCloudStorageApi {
    private ApiClient apiClient;

    public ScanCloudStorageApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScanCloudStorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Scan an AWS S3 file for viruses
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
     * @param bucketName Name of the S3 bucket
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanAwsS3FileRequestCreation(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3File", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3File", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3File", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3File", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new WebClientResponseException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3File", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (accessKey != null)
        headerParams.add("accessKey", apiClient.parameterToString(accessKey));
        if (secretKey != null)
        headerParams.add("secretKey", apiClient.parameterToString(secretKey));
        if (bucketRegion != null)
        headerParams.add("bucketRegion", apiClient.parameterToString(bucketRegion));
        if (bucketName != null)
        headerParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (keyName != null)
        headerParams.add("keyName", apiClient.parameterToString(keyName));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/aws-s3/single", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan an AWS S3 file for viruses
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
     * @param bucketName Name of the S3 bucket
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageVirusScanResult> scanCloudStorageScanAwsS3File(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanAwsS3FileRequestCreation(accessKey, secretKey, bucketRegion, bucketName, keyName).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageVirusScanResult>> scanCloudStorageScanAwsS3FileWithHttpInfo(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanAwsS3FileRequestCreation(accessKey, secretKey, bucketRegion, bucketName, keyName).toEntity(localVarReturnType);
    }
    /**
     * Advanced Scan an AWS S3 file for viruses
     * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
     * @param bucketName Name of the S3 bucket
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanAwsS3FileAdvancedRequestCreation(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'accessKey' is set
        if (accessKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'accessKey' when calling scanCloudStorageScanAwsS3FileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'secretKey' is set
        if (secretKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'secretKey' when calling scanCloudStorageScanAwsS3FileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bucketRegion' is set
        if (bucketRegion == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketRegion' when calling scanCloudStorageScanAwsS3FileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanAwsS3FileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'keyName' is set
        if (keyName == null) {
            throw new WebClientResponseException("Missing the required parameter 'keyName' when calling scanCloudStorageScanAwsS3FileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (accessKey != null)
        headerParams.add("accessKey", apiClient.parameterToString(accessKey));
        if (secretKey != null)
        headerParams.add("secretKey", apiClient.parameterToString(secretKey));
        if (bucketRegion != null)
        headerParams.add("bucketRegion", apiClient.parameterToString(bucketRegion));
        if (bucketName != null)
        headerParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (keyName != null)
        headerParams.add("keyName", apiClient.parameterToString(keyName));
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
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/aws-s3/single/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Advanced Scan an AWS S3 file for viruses
     * Advanced Scan the contents of a single AWS S3 file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param accessKey AWS S3 access key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param secretKey AWS S3 secret key for the S3 bucket; you can get this from My Security Credentials in the AWS console
     * @param bucketRegion Name of the region of the S3 bucket, such as &#39;US-East-1&#39;
     * @param bucketName Name of the S3 bucket
     * @param keyName Key name (also called file name) of the file in S3 that you wish to scan for viruses.  If the key name contains Unicode characters, you must base64 encode the key name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanAwsS3FileAdvanced(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanAwsS3FileAdvancedRequestCreation(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageAdvancedVirusScanResult>> scanCloudStorageScanAwsS3FileAdvancedWithHttpInfo(String accessKey, String secretKey, String bucketRegion, String bucketName, String keyName, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanAwsS3FileAdvancedRequestCreation(accessKey, secretKey, bucketRegion, bucketName, keyName, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).toEntity(localVarReturnType);
    }
    /**
     * Scan an Azure Blob for viruses
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
     * @param containerName Name of the Blob container within the Azure Blob Storage account
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanAzureBlobRequestCreation(String connectionString, String containerName, String blobPath) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new WebClientResponseException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlob", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new WebClientResponseException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlob", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new WebClientResponseException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlob", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (connectionString != null)
        headerParams.add("connectionString", apiClient.parameterToString(connectionString));
        if (containerName != null)
        headerParams.add("containerName", apiClient.parameterToString(containerName));
        if (blobPath != null)
        headerParams.add("blobPath", apiClient.parameterToString(blobPath));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/azure-blob/single", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan an Azure Blob for viruses
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
     * @param containerName Name of the Blob container within the Azure Blob Storage account
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageVirusScanResult> scanCloudStorageScanAzureBlob(String connectionString, String containerName, String blobPath) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanAzureBlobRequestCreation(connectionString, containerName, blobPath).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageVirusScanResult>> scanCloudStorageScanAzureBlobWithHttpInfo(String connectionString, String containerName, String blobPath) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanAzureBlobRequestCreation(connectionString, containerName, blobPath).toEntity(localVarReturnType);
    }
    /**
     * Advanced Scan an Azure Blob for viruses
     * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
     * @param containerName Name of the Blob container within the Azure Blob Storage account
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanAzureBlobAdvancedRequestCreation(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'connectionString' is set
        if (connectionString == null) {
            throw new WebClientResponseException("Missing the required parameter 'connectionString' when calling scanCloudStorageScanAzureBlobAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new WebClientResponseException("Missing the required parameter 'containerName' when calling scanCloudStorageScanAzureBlobAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'blobPath' is set
        if (blobPath == null) {
            throw new WebClientResponseException("Missing the required parameter 'blobPath' when calling scanCloudStorageScanAzureBlobAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (connectionString != null)
        headerParams.add("connectionString", apiClient.parameterToString(connectionString));
        if (containerName != null)
        headerParams.add("containerName", apiClient.parameterToString(containerName));
        if (blobPath != null)
        headerParams.add("blobPath", apiClient.parameterToString(blobPath));
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
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/azure-blob/single/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Advanced Scan an Azure Blob for viruses
     * Advanced Scan the contents of a single Azure Blob and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param connectionString Connection string for the Azure Blob Storage Account; you can get this connection string from the Access Keys tab of the Storage Account blade in the Azure Portal.
     * @param containerName Name of the Blob container within the Azure Blob Storage account
     * @param blobPath Path to the blob within the container, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the blob path contains Unicode characters, you must base64 encode the blob path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanAzureBlobAdvanced(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanAzureBlobAdvancedRequestCreation(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageAdvancedVirusScanResult>> scanCloudStorageScanAzureBlobAdvancedWithHttpInfo(String connectionString, String containerName, String blobPath, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanAzureBlobAdvancedRequestCreation(connectionString, containerName, blobPath, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).toEntity(localVarReturnType);
    }
    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanGcpStorageFileRequestCreation(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new WebClientResponseException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bucketName != null)
        headerParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (objectName != null)
        headerParams.add("objectName", apiClient.parameterToString(objectName));
        if (jsonCredentialFile != null)
            formParams.add("jsonCredentialFile", jsonCredentialFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/gcp-storage/single", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageVirusScanResult> scanCloudStorageScanGcpStorageFile(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanGcpStorageFileRequestCreation(bucketName, objectName, jsonCredentialFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageVirusScanResult>> scanCloudStorageScanGcpStorageFileWithHttpInfo(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanGcpStorageFileRequestCreation(bucketName, objectName, jsonCredentialFile).toEntity(localVarReturnType);
    }
    /**
     * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanGcpStorageFileAdvancedRequestCreation(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'bucketName' is set
        if (bucketName == null) {
            throw new WebClientResponseException("Missing the required parameter 'bucketName' when calling scanCloudStorageScanGcpStorageFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'objectName' is set
        if (objectName == null) {
            throw new WebClientResponseException("Missing the required parameter 'objectName' when calling scanCloudStorageScanGcpStorageFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'jsonCredentialFile' is set
        if (jsonCredentialFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'jsonCredentialFile' when calling scanCloudStorageScanGcpStorageFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (bucketName != null)
        headerParams.add("bucketName", apiClient.parameterToString(bucketName));
        if (objectName != null)
        headerParams.add("objectName", apiClient.parameterToString(objectName));
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
        if (jsonCredentialFile != null)
            formParams.add("jsonCredentialFile", jsonCredentialFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/gcp-storage/single/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Advanced Scan an Google Cloud Platform (GCP) Storage file for viruses
     * Advanced Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses and threats. Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     * <p><b>200</b> - OK
     * @param bucketName Name of the bucket in Google Cloud Storage
     * @param objectName Name of the object or file in Google Cloud Storage.  If the object name contains Unicode characters, you must base64 encode the object name and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param jsonCredentialFile Service Account credential for Google Cloud stored in a JSON file.
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanGcpStorageFileAdvanced(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanGcpStorageFileAdvancedRequestCreation(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageAdvancedVirusScanResult>> scanCloudStorageScanGcpStorageFileAdvancedWithHttpInfo(String bucketName, String objectName, org.springframework.core.io.AbstractResource jsonCredentialFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanGcpStorageFileAdvancedRequestCreation(bucketName, objectName, jsonCredentialFile, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).toEntity(localVarReturnType);
    }
    /**
     * Virus Scan a file in a SharePoint Online Site Drive
     * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param tenantID Optional; Tenant ID of your Azure Active Directory
     * @param itemID SharePoint itemID, such as a DriveItem Id
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanSharePointOnlineFileRequestCreation(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new WebClientResponseException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new WebClientResponseException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new WebClientResponseException("Missing the required parameter 'filePath' when calling scanCloudStorageScanSharePointOnlineFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (clientID != null)
        headerParams.add("clientID", apiClient.parameterToString(clientID));
        if (clientSecret != null)
        headerParams.add("clientSecret", apiClient.parameterToString(clientSecret));
        if (sharepointDomainName != null)
        headerParams.add("sharepointDomainName", apiClient.parameterToString(sharepointDomainName));
        if (siteID != null)
        headerParams.add("siteID", apiClient.parameterToString(siteID));
        if (tenantID != null)
        headerParams.add("tenantID", apiClient.parameterToString(tenantID));
        if (filePath != null)
        headerParams.add("filePath", apiClient.parameterToString(filePath));
        if (itemID != null)
        headerParams.add("itemID", apiClient.parameterToString(itemID));
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/sharepoint-online/site/single", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Virus Scan a file in a SharePoint Online Site Drive
     * Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param tenantID Optional; Tenant ID of your Azure Active Directory
     * @param itemID SharePoint itemID, such as a DriveItem Id
     * @return CloudStorageVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageVirusScanResult> scanCloudStorageScanSharePointOnlineFile(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanSharePointOnlineFileRequestCreation(clientID, clientSecret, sharepointDomainName, siteID, filePath, tenantID, itemID).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageVirusScanResult>> scanCloudStorageScanSharePointOnlineFileWithHttpInfo(String clientID, String clientSecret, String sharepointDomainName, String siteID, String filePath, String tenantID, String itemID) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageVirusScanResult>() {};
        return scanCloudStorageScanSharePointOnlineFileRequestCreation(clientID, clientSecret, sharepointDomainName, siteID, filePath, tenantID, itemID).toEntity(localVarReturnType);
    }
    /**
     * Advanced Virus Scan a file in a SharePoint Online Site Drive
     * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
     * @param tenantID Optional; Tenant ID of your Azure Active Directory
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param itemID SharePoint itemID, such as a DriveItem Id
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec scanCloudStorageScanSharePointOnlineFileAdvancedRequestCreation(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'clientID' is set
        if (clientID == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'clientSecret' is set
        if (clientSecret == null) {
            throw new WebClientResponseException("Missing the required parameter 'clientSecret' when calling scanCloudStorageScanSharePointOnlineFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sharepointDomainName' is set
        if (sharepointDomainName == null) {
            throw new WebClientResponseException("Missing the required parameter 'sharepointDomainName' when calling scanCloudStorageScanSharePointOnlineFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'siteID' is set
        if (siteID == null) {
            throw new WebClientResponseException("Missing the required parameter 'siteID' when calling scanCloudStorageScanSharePointOnlineFileAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (clientID != null)
        headerParams.add("clientID", apiClient.parameterToString(clientID));
        if (clientSecret != null)
        headerParams.add("clientSecret", apiClient.parameterToString(clientSecret));
        if (sharepointDomainName != null)
        headerParams.add("sharepointDomainName", apiClient.parameterToString(sharepointDomainName));
        if (siteID != null)
        headerParams.add("siteID", apiClient.parameterToString(siteID));
        if (tenantID != null)
        headerParams.add("tenantID", apiClient.parameterToString(tenantID));
        if (filePath != null)
        headerParams.add("filePath", apiClient.parameterToString(filePath));
        if (itemID != null)
        headerParams.add("itemID", apiClient.parameterToString(itemID));
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
        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return apiClient.invokeAPI("/virus/scan/cloud-storage/sharepoint-online/site/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Advanced Virus Scan a file in a SharePoint Online Site Drive
     * Advanced Virus Scan the contents of a single SharePoint Online Site Drive file and its content for viruses and threats.  Advanced Scan files with 360-degree Content Protection across Viruses and Malware, executables, invalid files, scripts, and even restrictions on accepted file types with complete content verification. Customize threat rules to your needs. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Block threats beyond viruses including executables, scripts, invalid files, and more.  Optionally limit input files to a specific set of file types (e.g. PDF and Word Documents only).  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time. To get the Client ID and Client Secret, follow these steps: (1) Navigate to the Azure Portal and click on Azure Active Directory, (2) click on App Registrations on the left hand side, (3) click on Register Application, (4) Name the application CloudmersiveAntiVirus and click on Register, (5) Get the client ID by clicking on Overview and copying the value labeled Application (client) ID, (6) click on Certificates and Secrets, (7) click on New client secret, choose a longer expiration and give the secret a name, (8) copy the secret value to the clipboard and save it securely, this is your Client Secret, (9) Now we need to grant permissions to SharePOint; click on API Permissions on the left hand side, (10) click on Add a permission and choose Microsoft Graph, (11) click on Application Permissions, (12) search for Sites.FullControl.All, (13) Click on Add Permissions, (14) now navigate back to Azure Active Directory and click on Enterprise Applications, click on CloudmersiveAntiVirus and click on Permissions, and (15) click on Grant Admin Consent.
     * <p><b>200</b> - OK
     * @param clientID Client ID access credentials; see description above for instructions on how to get the Client ID from the Azure Active Directory portal.
     * @param clientSecret Client Secret access credentials; see description above for instructions on how to get the Client Secret from the Azure Active Directory portal
     * @param sharepointDomainName SharePoint Online domain name, such as mydomain.sharepoint.com
     * @param siteID Site ID (GUID) of the SharePoint site you wish to retrieve the file from
     * @param tenantID Optional; Tenant ID of your Azure Active Directory
     * @param filePath Path to the file within the drive, such as &#39;hello.pdf&#39; or &#39;/folder/subfolder/world.pdf&#39;.  If the file path contains Unicode characters, you must base64 encode the file path and prepend it with &#39;base64:&#39;, such as: &#39;base64:6ZWV6ZWV6ZWV6ZWV6ZWV6ZWV&#39;.
     * @param itemID SharePoint itemID, such as a DriveItem Id
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended).
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended).
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats. Set to true to allow these file types. Default is false (recommended).
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended).
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled.
     * @return CloudStorageAdvancedVirusScanResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CloudStorageAdvancedVirusScanResult> scanCloudStorageScanSharePointOnlineFileAdvanced(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanSharePointOnlineFileAdvancedRequestCreation(clientID, clientSecret, sharepointDomainName, siteID, tenantID, filePath, itemID, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<CloudStorageAdvancedVirusScanResult>> scanCloudStorageScanSharePointOnlineFileAdvancedWithHttpInfo(String clientID, String clientSecret, String sharepointDomainName, String siteID, String tenantID, String filePath, String itemID, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, String restrictFileTypes) throws WebClientResponseException {
        ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult> localVarReturnType = new ParameterizedTypeReference<CloudStorageAdvancedVirusScanResult>() {};
        return scanCloudStorageScanSharePointOnlineFileAdvancedRequestCreation(clientID, clientSecret, sharepointDomainName, siteID, tenantID, filePath, itemID, allowExecutables, allowInvalidFiles, allowScripts, allowPasswordProtectedFiles, allowMacros, allowXmlExternalEntities, allowInsecureDeserialization, allowHtml, restrictFileTypes).toEntity(localVarReturnType);
    }
}
