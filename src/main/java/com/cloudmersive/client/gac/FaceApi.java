package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import com.cloudmersive.client.gac.model.AgeDetectionResult;
import com.cloudmersive.client.gac.model.FaceCompareResponse;
import com.cloudmersive.client.gac.model.FaceLocateResponse;
import com.cloudmersive.client.gac.model.FaceLocateWithLandmarksResponse;
import java.io.File;
import com.cloudmersive.client.gac.model.GenderDetectionResult;

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
public class FaceApi {
    private ApiClient apiClient;

    public FaceApi() {
        this(new ApiClient());
    }

    @Autowired
    public FaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Compare and match faces
     * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
     * <p><b>200</b> - OK
     * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported.
     * @param matchFace Image of a single face to compare and match against.
     * @return FaceCompareResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceCompareRequestCreation(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource matchFace) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputImage' when calling faceCompare", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'matchFace' is set
        if (matchFace == null) {
            throw new WebClientResponseException("Missing the required parameter 'matchFace' when calling faceCompare", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputImage != null)
            formParams.add("inputImage", inputImage);
        if (matchFace != null)
            formParams.add("matchFace", matchFace);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FaceCompareResponse> localVarReturnType = new ParameterizedTypeReference<FaceCompareResponse>() {};
        return apiClient.invokeAPI("/image/face/compare-and-match", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compare and match faces
     * Find the faces in an input image, and compare against a reference image to determine if there is a match against the face in the reference image.  The reference image (second parameter) should contain exactly one face.
     * <p><b>200</b> - OK
     * @param inputImage Image file to perform the operation on; this image can contain one or more faces which will be matched against face provided in the second image.  Common file formats such as PNG, JPEG are supported.
     * @param matchFace Image of a single face to compare and match against.
     * @return FaceCompareResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FaceCompareResponse> faceCompare(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource matchFace) throws WebClientResponseException {
        ParameterizedTypeReference<FaceCompareResponse> localVarReturnType = new ParameterizedTypeReference<FaceCompareResponse>() {};
        return faceCompareRequestCreation(inputImage, matchFace).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FaceCompareResponse>> faceCompareWithHttpInfo(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource matchFace) throws WebClientResponseException {
        ParameterizedTypeReference<FaceCompareResponse> localVarReturnType = new ParameterizedTypeReference<FaceCompareResponse>() {};
        return faceCompareRequestCreation(inputImage, matchFace).toEntity(localVarReturnType);
    }
    /**
     * Crop image to face with square crop
     * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceCropFirstRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceCropFirst", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/face/crop/first", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Crop image to face with square crop
     * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> faceCropFirst(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return faceCropFirstRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> faceCropFirstWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return faceCropFirstRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Crop image to face with round crop
     * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceCropFirstRoundRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceCropFirstRound", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/face/crop/first/round", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Crop image to face with round crop
     * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> faceCropFirstRound(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return faceCropFirstRoundRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> faceCropFirstRoundWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return faceCropFirstRoundRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect the age of people in an image
     * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return AgeDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceDetectAgeRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceDetectAge", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<AgeDetectionResult> localVarReturnType = new ParameterizedTypeReference<AgeDetectionResult>() {};
        return apiClient.invokeAPI("/image/face/detect-age", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect the age of people in an image
     * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return AgeDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AgeDetectionResult> faceDetectAge(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<AgeDetectionResult> localVarReturnType = new ParameterizedTypeReference<AgeDetectionResult>() {};
        return faceDetectAgeRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AgeDetectionResult>> faceDetectAgeWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<AgeDetectionResult> localVarReturnType = new ParameterizedTypeReference<AgeDetectionResult>() {};
        return faceDetectAgeRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect the gender of people in an image
     * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return GenderDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceDetectGenderRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceDetectGender", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<GenderDetectionResult> localVarReturnType = new ParameterizedTypeReference<GenderDetectionResult>() {};
        return apiClient.invokeAPI("/image/face/detect-gender", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect the gender of people in an image
     * Identify the gender, position, and size of human faces in an image, along with a recognition confidence level.  People in the image should be facing the camera.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return GenderDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GenderDetectionResult> faceDetectGender(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<GenderDetectionResult> localVarReturnType = new ParameterizedTypeReference<GenderDetectionResult>() {};
        return faceDetectGenderRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GenderDetectionResult>> faceDetectGenderWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<GenderDetectionResult> localVarReturnType = new ParameterizedTypeReference<GenderDetectionResult>() {};
        return faceDetectGenderRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and find faces in an image
     * Locate the positions of all faces in an image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FaceLocateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceLocateRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceLocate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FaceLocateResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateResponse>() {};
        return apiClient.invokeAPI("/image/face/locate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and find faces in an image
     * Locate the positions of all faces in an image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FaceLocateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FaceLocateResponse> faceLocate(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FaceLocateResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateResponse>() {};
        return faceLocateRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FaceLocateResponse>> faceLocateWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FaceLocateResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateResponse>() {};
        return faceLocateRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and find faces and landmarks eyes and nose and mouth in image
     * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FaceLocateWithLandmarksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec faceLocateWithLandmarksRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling faceLocateWithLandmarks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FaceLocateWithLandmarksResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateWithLandmarksResponse>() {};
        return apiClient.invokeAPI("/image/face/locate-with-landmarks", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and find faces and landmarks eyes and nose and mouth in image
     * Locate the positions of all faces in an image, along with the eyes, eye brows, nose and mouth components of each
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FaceLocateWithLandmarksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FaceLocateWithLandmarksResponse> faceLocateWithLandmarks(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FaceLocateWithLandmarksResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateWithLandmarksResponse>() {};
        return faceLocateWithLandmarksRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FaceLocateWithLandmarksResponse>> faceLocateWithLandmarksWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FaceLocateWithLandmarksResponse> localVarReturnType = new ParameterizedTypeReference<FaceLocateWithLandmarksResponse>() {};
        return faceLocateWithLandmarksRequestCreation(imageFile).toEntity(localVarReturnType);
    }
}
