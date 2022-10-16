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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:17.104419100-07:00[America/Los_Angeles]")
public class FilterApi {
    private ApiClient apiClient;

    public FilterApi() {
        this(new ApiClient());
    }

    @Autowired
    public FilterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert image to black-and-white grayscale
     * Remove color from the image by converting to a grayscale, black-and-white image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterBlackAndWhiteRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterBlackAndWhite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/black-and-white", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert image to black-and-white grayscale
     * Remove color from the image by converting to a grayscale, black-and-white image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterBlackAndWhite(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterBlackAndWhiteRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterBlackAndWhiteWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterBlackAndWhiteRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Despeckle to remove point noise from the image
     * Remove point noise / despeckle the input image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterDespeckleRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterDespeckle", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/despeckle", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Despeckle to remove point noise from the image
     * Remove point noise / despeckle the input image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterDespeckle(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterDespeckleRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterDespeckleWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterDespeckleRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and highlight edges in an image
     * Perform an edge detection operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterEdgeDetectRequestCreation(Integer radius, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new WebClientResponseException("Missing the required parameter 'radius' when calling filterEdgeDetect", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterEdgeDetect", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("radius", radius);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/edge-detect/{radius}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and highlight edges in an image
     * Perform an edge detection operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the edge detection operation; a larger radius will produce a greater effect
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterEdgeDetect(Integer radius, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterEdgeDetectRequestCreation(radius, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterEdgeDetectWithHttpInfo(Integer radius, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterEdgeDetectRequestCreation(radius, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Emboss an image
     * Perform an emboss operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect
     * @param sigma Sigma, or variance, of the emboss operation
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterEmbossRequestCreation(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new WebClientResponseException("Missing the required parameter 'radius' when calling filterEmboss", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new WebClientResponseException("Missing the required parameter 'sigma' when calling filterEmboss", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterEmboss", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("radius", radius);
        pathParams.put("sigma", sigma);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/emboss/{radius}/{sigma}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Emboss an image
     * Perform an emboss operation on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the emboss operation; a larger radius will produce a greater effect
     * @param sigma Sigma, or variance, of the emboss operation
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterEmboss(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterEmbossRequestCreation(radius, sigma, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterEmbossWithHttpInfo(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterEmbossRequestCreation(radius, sigma, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Perform a guassian blur on the input image
     * Perform a gaussian blur on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
     * @param sigma Sigma, or variance, of the gaussian blur operation
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterGaussianBlurRequestCreation(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new WebClientResponseException("Missing the required parameter 'radius' when calling filterGaussianBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new WebClientResponseException("Missing the required parameter 'sigma' when calling filterGaussianBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterGaussianBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("radius", radius);
        pathParams.put("sigma", sigma);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/blur/guassian/{radius}/{sigma}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform a guassian blur on the input image
     * Perform a gaussian blur on the input image
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
     * @param sigma Sigma, or variance, of the gaussian blur operation
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterGaussianBlur(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterGaussianBlurRequestCreation(radius, sigma, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterGaussianBlurWithHttpInfo(Integer radius, Integer sigma, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterGaussianBlurRequestCreation(radius, sigma, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Perform a motion blur on the input image
     * Perform a motion blur on the input image at a specific angle
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
     * @param sigma Sigma, or variance, of the motion blur operation
     * @param angle Angle of the motion blur in degrees
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterMotionBlurRequestCreation(Integer radius, Integer sigma, Integer angle, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'radius' is set
        if (radius == null) {
            throw new WebClientResponseException("Missing the required parameter 'radius' when calling filterMotionBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'sigma' is set
        if (sigma == null) {
            throw new WebClientResponseException("Missing the required parameter 'sigma' when calling filterMotionBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'angle' is set
        if (angle == null) {
            throw new WebClientResponseException("Missing the required parameter 'angle' when calling filterMotionBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterMotionBlur", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("radius", radius);
        pathParams.put("sigma", sigma);
        pathParams.put("angle", angle);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/blur/motion/{radius}/{sigma}/{angle}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Perform a motion blur on the input image
     * Perform a motion blur on the input image at a specific angle
     * <p><b>200</b> - OK
     * @param radius Radius in pixels of the blur operation; a larger radius will produce a greater blur effect
     * @param sigma Sigma, or variance, of the motion blur operation
     * @param angle Angle of the motion blur in degrees
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterMotionBlur(Integer radius, Integer sigma, Integer angle, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterMotionBlurRequestCreation(radius, sigma, angle, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterMotionBlurWithHttpInfo(Integer radius, Integer sigma, Integer angle, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterMotionBlurRequestCreation(radius, sigma, angle, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Posterize the image by reducing distinct colors
     * Reduce the unique number of colors in the image to the specified level
     * <p><b>200</b> - OK
     * @param levels Number of unique colors to retain in the output image
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterPosterizeRequestCreation(Integer levels, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'levels' is set
        if (levels == null) {
            throw new WebClientResponseException("Missing the required parameter 'levels' when calling filterPosterize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterPosterize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "levels", levels));

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/posterize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Posterize the image by reducing distinct colors
     * Reduce the unique number of colors in the image to the specified level
     * <p><b>200</b> - OK
     * @param levels Number of unique colors to retain in the output image
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterPosterize(Integer levels, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterPosterizeRequestCreation(levels, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterPosterizeWithHttpInfo(Integer levels, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterPosterizeRequestCreation(levels, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Swirl distort the image
     * Swirl distort the image by the specified number of degrees
     * <p><b>200</b> - OK
     * @param degrees Degrees of swirl
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec filterSwirlRequestCreation(Integer degrees, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'degrees' is set
        if (degrees == null) {
            throw new WebClientResponseException("Missing the required parameter 'degrees' when calling filterSwirl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling filterSwirl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "degrees", degrees));

        if (imageFile != null)
            formParams.add("imageFile", imageFile);

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
        return apiClient.invokeAPI("/image/filter/swirl", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Swirl distort the image
     * Swirl distort the image by the specified number of degrees
     * <p><b>200</b> - OK
     * @param degrees Degrees of swirl
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> filterSwirl(Integer degrees, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterSwirlRequestCreation(degrees, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> filterSwirlWithHttpInfo(Integer degrees, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return filterSwirlRequestCreation(degrees, imageFile).toEntity(localVarReturnType);
    }
}
