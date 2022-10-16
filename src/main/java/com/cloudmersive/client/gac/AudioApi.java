package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.math.BigDecimal;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:34.870739900-07:00[America/Los_Angeles]")
public class AudioApi {
    private ApiClient apiClient;

    public AudioApi() {
        this(new ApiClient());
    }

    @Autowired
    public AudioApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert Audio File to AAC format.
     * Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec audioConvertToAacRequestCreation(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (bitRate != null)
        headerParams.add("bitRate", apiClient.parameterToString(bitRate));
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
        return apiClient.invokeAPI("/video/convert/to/aac", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Audio File to AAC format.
     * Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> audioConvertToAac(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToAacRequestCreation(fileUrl, bitRate, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> audioConvertToAacWithHttpInfo(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToAacRequestCreation(fileUrl, bitRate, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Audio File to M4A format.
     * Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec audioConvertToM4aRequestCreation(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (bitRate != null)
        headerParams.add("bitRate", apiClient.parameterToString(bitRate));
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
        return apiClient.invokeAPI("/video/convert/to/m4a", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Audio File to M4A format.
     * Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> audioConvertToM4a(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToM4aRequestCreation(fileUrl, bitRate, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> audioConvertToM4aWithHttpInfo(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToM4aRequestCreation(fileUrl, bitRate, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Audio File to MP3 format.
     * Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec audioConvertToMp3RequestCreation(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (bitRate != null)
        headerParams.add("bitRate", apiClient.parameterToString(bitRate));
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
        return apiClient.invokeAPI("/video/convert/to/mp3", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Audio File to MP3 format.
     * Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param bitRate Optional; Specify the desired bitrate of the converted audio file in kilobytes per second (kB/s). Value may be between 48 and 1,411. By default, the optimal bitrate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> audioConvertToMp3(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToMp3RequestCreation(fileUrl, bitRate, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> audioConvertToMp3WithHttpInfo(String fileUrl, Integer bitRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToMp3RequestCreation(fileUrl, bitRate, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Audio File to WAV format.
     * Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param sampleRate Optional; Specify the desired sample rate of the converted audio file in kHz. Value may be between 8 and 96. Standard for audio CDs is 44.1, while DVD audio standard is 48. By default, the optimal sample rate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec audioConvertToWavRequestCreation(String fileUrl, BigDecimal sampleRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (sampleRate != null)
        headerParams.add("sampleRate", apiClient.parameterToString(sampleRate));
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
        return apiClient.invokeAPI("/video/convert/to/wav", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Audio File to WAV format.
     * Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of an audio file being used for conversion. Use this option for files larger than 2GB.
     * @param sampleRate Optional; Specify the desired sample rate of the converted audio file in kHz. Value may be between 8 and 96. Standard for audio CDs is 44.1, while DVD audio standard is 48. By default, the optimal sample rate will be chosen automatically.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> audioConvertToWav(String fileUrl, BigDecimal sampleRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToWavRequestCreation(fileUrl, sampleRate, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> audioConvertToWavWithHttpInfo(String fileUrl, BigDecimal sampleRate, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return audioConvertToWavRequestCreation(fileUrl, sampleRate, inputFile).toEntity(localVarReturnType);
    }
}
