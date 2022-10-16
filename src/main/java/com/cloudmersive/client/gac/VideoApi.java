package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.math.BigDecimal;
import java.io.File;
import com.cloudmersive.client.gac.model.MediaInformation;
import com.cloudmersive.client.gac.model.NsfwResult;
import java.time.OffsetDateTime;
import com.cloudmersive.client.gac.model.SplitVideoResult;
import com.cloudmersive.client.gac.model.StillFramesResult;

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
public class VideoApi {
    private ApiClient apiClient;

    public VideoApi() {
        this(new ApiClient());
    }

    @Autowired
    public VideoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert Video to Animated GIF format.
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to 24 frames per second.
     * @param startTime Optional; Specify the desired starting time of the GIF video in TimeSpan format.
     * @param timeSpan Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoConvertToGifRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (startTime != null)
        headerParams.add("startTime", apiClient.parameterToString(startTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));
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
        return apiClient.invokeAPI("/video/convert/to/gif", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Video to Animated GIF format.
     * Automatically detect video file format and convert it to animated GIF format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB. Default height is 250 pixels, while preserving the video&#39;s aspect ratio.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to 250 pixels, maximum is 500 pixels.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to 24 frames per second.
     * @param startTime Optional; Specify the desired starting time of the GIF video in TimeSpan format.
     * @param timeSpan Optional; Specify the desired length of the GIF video in TimeSpan format. Limit is 30 seconds. Default is 10 seconds.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoConvertToGif(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToGifRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoConvertToGifWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToGifRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, startTime, timeSpan, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Video to MOV format.
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoConvertToMovRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
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
        return apiClient.invokeAPI("/video/convert/to/mov", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Video to MOV format.
     * Automatically detect video file format and convert it to MOV format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoConvertToMov(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToMovRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoConvertToMovWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToMovRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Video to MP4 format.
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoConvertToMp4RequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
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
        return apiClient.invokeAPI("/video/convert/to/mp4", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Video to MP4 format.
     * Automatically detect video file format and convert it to MP4 format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoConvertToMp4(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToMp4RequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoConvertToMp4WithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToMp4RequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Video to PNG Still Frames.
     * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param framesPerSecond Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames.
     * @param inputFile Input file to perform the operation on.
     * @return StillFramesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoConvertToStillFramesRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (framesPerSecond != null)
        headerParams.add("framesPerSecond", apiClient.parameterToString(framesPerSecond));
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

        ParameterizedTypeReference<StillFramesResult> localVarReturnType = new ParameterizedTypeReference<StillFramesResult>() {};
        return apiClient.invokeAPI("/video/convert/to/still-frames", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Video to PNG Still Frames.
     * Automatically detect video file format and convert it to an array of still frame PNG images. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param framesPerSecond Optional; How many video frames per second to be returned as PNG images. Minimum value is 0.1, maximum is 60. Default is 1 frame per second. Maximum of 2000 total frames.
     * @param inputFile Input file to perform the operation on.
     * @return StillFramesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<StillFramesResult> videoConvertToStillFrames(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<StillFramesResult> localVarReturnType = new ParameterizedTypeReference<StillFramesResult>() {};
        return videoConvertToStillFramesRequestCreation(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<StillFramesResult>> videoConvertToStillFramesWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<StillFramesResult> localVarReturnType = new ParameterizedTypeReference<StillFramesResult>() {};
        return videoConvertToStillFramesRequestCreation(fileUrl, maxWidth, maxHeight, framesPerSecond, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Video to WEBM format.
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoConvertToWebmRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (preserveAspectRatio != null)
        headerParams.add("preserveAspectRatio", apiClient.parameterToString(preserveAspectRatio));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
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
        return apiClient.invokeAPI("/video/convert/to/webm", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Video to WEBM format.
     * Automatically detect video file format and convert it to WEBM format. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param preserveAspectRatio Optional; If false, the original video&#39;s aspect ratio will not be preserved, allowing customization of the aspect ratio using maxWidth and maxHeight, potentially skewing the video. Default is true.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoConvertToWebm(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToWebmRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoConvertToWebmWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Boolean preserveAspectRatio, Integer frameRate, Integer quality, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoConvertToWebmRequestCreation(fileUrl, maxWidth, maxHeight, preserveAspectRatio, frameRate, quality, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Cut a Video to a Shorter Length
     * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param startTime Optional; Specify the desired starting time of the cut video in TimeSpan format.
     * @param timeSpan Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoCutVideoRequestCreation(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (startTime != null)
        headerParams.add("startTime", apiClient.parameterToString(startTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));
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
        return apiClient.invokeAPI("/video/cut", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cut a Video to a Shorter Length
     * Cuts a video to the specified start and end times. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param startTime Optional; Specify the desired starting time of the cut video in TimeSpan format.
     * @param timeSpan Optional; Specify the desired length of the cut video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoCutVideo(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoCutVideoRequestCreation(fileUrl, startTime, timeSpan, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoCutVideoWithHttpInfo(String fileUrl, OffsetDateTime startTime, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoCutVideoRequestCreation(fileUrl, startTime, timeSpan, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Get detailed information about a video or audio file
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param inputFile Input file to perform the operation on.
     * @return MediaInformation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoGetInfoRequestCreation(String fileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
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

        ParameterizedTypeReference<MediaInformation> localVarReturnType = new ParameterizedTypeReference<MediaInformation>() {};
        return apiClient.invokeAPI("/video/convert/get-info", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get detailed information about a video or audio file
     * Retrieve detailed information about a video or audio file, including format, dimensions, file size, bit rate, duration and start time. Compatible with many formats, including: AVI, ASF, FLV, GIF, MP4, MPEG/MPG, Matroska/WEBM, MOV, AIFF, ASF, CAF, MP3, MP2, MP1, Ogg, OMG/OMA, and WAV. Uses 1 API call per 10 MB of file size.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param inputFile Input file to perform the operation on.
     * @return MediaInformation
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MediaInformation> videoGetInfo(String fileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MediaInformation> localVarReturnType = new ParameterizedTypeReference<MediaInformation>() {};
        return videoGetInfoRequestCreation(fileUrl, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<MediaInformation>> videoGetInfoWithHttpInfo(String fileUrl, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MediaInformation> localVarReturnType = new ParameterizedTypeReference<MediaInformation>() {};
        return videoGetInfoRequestCreation(fileUrl, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Resizes a Video Preserving the Original Aspect Ratio.
     * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoResizeVideoRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
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
        return apiClient.invokeAPI("/video/resize/preserveAspectRatio", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Resizes a Video Preserving the Original Aspect Ratio.
     * Resizes a video, while maintaining the original aspect ratio and encoding. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoResizeVideo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoResizeVideoRequestCreation(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoResizeVideoWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoResizeVideoRequestCreation(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Resizes a Video without Preserving Aspect Ratio.
     * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoResizeVideoSimpleRequestCreation(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (maxWidth != null)
        headerParams.add("maxWidth", apiClient.parameterToString(maxWidth));
        if (maxHeight != null)
        headerParams.add("maxHeight", apiClient.parameterToString(maxHeight));
        if (frameRate != null)
        headerParams.add("frameRate", apiClient.parameterToString(frameRate));
        if (quality != null)
        headerParams.add("quality", apiClient.parameterToString(quality));
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
        return apiClient.invokeAPI("/video/resize/target", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Resizes a Video without Preserving Aspect Ratio.
     * Resizes a video without maintaining original aspect ratio, allowing fully customizable dimensions. May cause image skewing. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param maxWidth Optional; Maximum width of the output video, up to the original video width. Defaults to original video width.
     * @param maxHeight Optional; Maximum height of the output video, up to the original video width. Defaults to original video height.
     * @param frameRate Optional; Specify the frame rate of the output video. Defaults to original video frame rate.
     * @param quality Optional; Specify the quality of the output video, where 100 is lossless and 1 is the lowest possible quality with highest compression. Default is 50.
     * @param extension Optional; Specify the file extension of the input video. This is recommended when inputting a file directly, without a file name. If no file name is available and no extension is provided, the extension will be inferred from the file data, which may cause a different extension to be used in the output.
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> videoResizeVideoSimple(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoResizeVideoSimpleRequestCreation(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> videoResizeVideoSimpleWithHttpInfo(String fileUrl, Integer maxWidth, Integer maxHeight, Integer frameRate, Integer quality, String extension, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return videoResizeVideoSimpleRequestCreation(fileUrl, maxWidth, maxHeight, frameRate, quality, extension, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Scan a Video for NSFW content.
     * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being scanned. Use this option for files larger than 2GB.
     * @param framesPerSecond Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos.
     * @param inputFile Input file to perform the operation on.
     * @return NsfwResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoScanForNsfwRequestCreation(String fileUrl, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (framesPerSecond != null)
        headerParams.add("framesPerSecond", apiClient.parameterToString(framesPerSecond));
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

        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return apiClient.invokeAPI("/video/scan/nsfw", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Scan a Video for NSFW content.
     * Automatically detect video file format and scan it for Not Safe For Work (NSFW)/Porn/Racy content. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, OGV, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per frame scanned.
     * <p><b>200</b> - OK
     * @param fileUrl Optional; URL of a video file being scanned. Use this option for files larger than 2GB.
     * @param framesPerSecond Optional; How many video frames per second to be scanned. Minimum value is 0.05 (1 frame per 20 seconds), maximum is 1. Default is 0.33 frame per second (1 frame scanned every 3 seconds). Maximum of 1000 total frames can be scanned, potentially adjusting the framerate for longer videos.
     * @param inputFile Input file to perform the operation on.
     * @return NsfwResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NsfwResult> videoScanForNsfw(String fileUrl, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return videoScanForNsfwRequestCreation(fileUrl, framesPerSecond, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<NsfwResult>> videoScanForNsfwWithHttpInfo(String fileUrl, BigDecimal framesPerSecond, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<NsfwResult> localVarReturnType = new ParameterizedTypeReference<NsfwResult>() {};
        return videoScanForNsfwRequestCreation(fileUrl, framesPerSecond, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Split a Video into Two Shorter Videos
     * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param splitTime Specify the desired time at which to split the video in TimeSpan format.
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param timeSpan Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
     * @param inputFile Input file to perform the operation on.
     * @return SplitVideoResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec videoSplitVideoRequestCreation(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'splitTime' is set
        if (splitTime == null) {
            throw new WebClientResponseException("Missing the required parameter 'splitTime' when calling videoSplitVideo", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (fileUrl != null)
        headerParams.add("fileUrl", apiClient.parameterToString(fileUrl));
        if (splitTime != null)
        headerParams.add("splitTime", apiClient.parameterToString(splitTime));
        if (timeSpan != null)
        headerParams.add("timeSpan", apiClient.parameterToString(timeSpan));
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

        ParameterizedTypeReference<SplitVideoResult> localVarReturnType = new ParameterizedTypeReference<SplitVideoResult>() {};
        return apiClient.invokeAPI("/video/split", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Split a Video into Two Shorter Videos
     * Cuts a video into two videos based on the specified start time. Supports many input video formats, including AVI, ASF, FLV, MP4, MPEG/MPG, Matroska/WEBM, 3G2, MKV, M4V and MOV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     * <p><b>200</b> - OK
     * @param splitTime Specify the desired time at which to split the video in TimeSpan format.
     * @param fileUrl Optional; URL of a video file being used for conversion. Use this option for files larger than 2GB.
     * @param timeSpan Optional; Specify the desired length of the second video in TimeSpan format. Leave blank to include the rest of the video. Maximum time is 4 hours.
     * @param inputFile Input file to perform the operation on.
     * @return SplitVideoResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SplitVideoResult> videoSplitVideo(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<SplitVideoResult> localVarReturnType = new ParameterizedTypeReference<SplitVideoResult>() {};
        return videoSplitVideoRequestCreation(splitTime, fileUrl, timeSpan, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<SplitVideoResult>> videoSplitVideoWithHttpInfo(OffsetDateTime splitTime, String fileUrl, OffsetDateTime timeSpan, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<SplitVideoResult> localVarReturnType = new ParameterizedTypeReference<SplitVideoResult>() {};
        return videoSplitVideoRequestCreation(splitTime, fileUrl, timeSpan, inputFile).toEntity(localVarReturnType);
    }
}
