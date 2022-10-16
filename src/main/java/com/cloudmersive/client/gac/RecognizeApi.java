package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.FindSymbolResult;
import com.cloudmersive.client.gac.model.FineTextDetectionResult;
import com.cloudmersive.client.gac.model.ImageDescriptionResponse;
import com.cloudmersive.client.gac.model.ImageSimilarityHashDistanceRequest;
import com.cloudmersive.client.gac.model.ImageSimilarityHashDistanceResponse;
import com.cloudmersive.client.gac.model.ImageSimilarityHashResponse;
import com.cloudmersive.client.gac.model.ObjectDetectionResult;
import com.cloudmersive.client.gac.model.TextDetectionResult;
import com.cloudmersive.client.gac.model.VehicleLicensePlateDetectionResult;

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
public class RecognizeApi {
    private ApiClient apiClient;

    public RecognizeApi() {
        this(new ApiClient());
    }

    @Autowired
    public RecognizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ImageDescriptionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDescribeRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDescribe", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ImageDescriptionResponse> localVarReturnType = new ParameterizedTypeReference<ImageDescriptionResponse>() {};
        return apiClient.invokeAPI("/image/recognize/describe", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Describe an image in natural language
     * Generate an English language text description of the image as a sentence.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ImageDescriptionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ImageDescriptionResponse> recognizeDescribe(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ImageDescriptionResponse> localVarReturnType = new ParameterizedTypeReference<ImageDescriptionResponse>() {};
        return recognizeDescribeRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ImageDescriptionResponse>> recognizeDescribeWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ImageDescriptionResponse> localVarReturnType = new ParameterizedTypeReference<ImageDescriptionResponse>() {};
        return recognizeDescribeRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectAndUnskewDocumentRequestCreation(org.springframework.core.io.AbstractResource imageFile, String postProcessingEffect) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectAndUnskewDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (postProcessingEffect != null)
        headerParams.add("PostProcessingEffect", apiClient.parameterToString(postProcessingEffect));
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
        return apiClient.invokeAPI("/image/recognize/detect-document/unskew", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @param postProcessingEffect Optional, post-processing effects to apply to the email, default is None.  Possible values are None and BlackAndWhite (force the image into a black and white view to aid in OCR operations).
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> recognizeDetectAndUnskewDocument(org.springframework.core.io.AbstractResource imageFile, String postProcessingEffect) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return recognizeDetectAndUnskewDocumentRequestCreation(imageFile, postProcessingEffect).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> recognizeDetectAndUnskewDocumentWithHttpInfo(org.springframework.core.io.AbstractResource imageFile, String postProcessingEffect) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return recognizeDetectAndUnskewDocumentRequestCreation(imageFile, postProcessingEffect).toEntity(localVarReturnType);
    }
    /**
     * Detect objects including types and locations in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ObjectDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectObjectsRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectObjects", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-objects", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect objects including types and locations in an image
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ObjectDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ObjectDetectionResult> recognizeDetectObjects(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return recognizeDetectObjectsRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ObjectDetectionResult>> recognizeDetectObjectsWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return recognizeDetectObjectsRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect people including locations in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ObjectDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectPeopleRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectPeople", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-people", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect people including locations in an image
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return ObjectDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ObjectDetectionResult> recognizeDetectPeople(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return recognizeDetectPeopleRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ObjectDetectionResult>> recognizeDetectPeopleWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<ObjectDetectionResult> localVarReturnType = new ParameterizedTypeReference<ObjectDetectionResult>() {};
        return recognizeDetectPeopleRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect fine text in a photo of a document
     * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FineTextDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectTextFineRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectTextFine", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<FineTextDetectionResult> localVarReturnType = new ParameterizedTypeReference<FineTextDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-text/fine", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect fine text in a photo of a document
     * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FineTextDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FineTextDetectionResult> recognizeDetectTextFine(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FineTextDetectionResult> localVarReturnType = new ParameterizedTypeReference<FineTextDetectionResult>() {};
        return recognizeDetectTextFineRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FineTextDetectionResult>> recognizeDetectTextFineWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<FineTextDetectionResult> localVarReturnType = new ParameterizedTypeReference<FineTextDetectionResult>() {};
        return recognizeDetectTextFineRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect large text in a photo
     * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return TextDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectTextLargeRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectTextLarge", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TextDetectionResult> localVarReturnType = new ParameterizedTypeReference<TextDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-text/large", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect large text in a photo
     * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return TextDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TextDetectionResult> recognizeDetectTextLarge(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextDetectionResult> localVarReturnType = new ParameterizedTypeReference<TextDetectionResult>() {};
        return recognizeDetectTextLargeRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<TextDetectionResult>> recognizeDetectTextLargeWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<TextDetectionResult> localVarReturnType = new ParameterizedTypeReference<TextDetectionResult>() {};
        return recognizeDetectTextLargeRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return VehicleLicensePlateDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeDetectVehicleLicensePlatesRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeDetectVehicleLicensePlates", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<VehicleLicensePlateDetectionResult> localVarReturnType = new ParameterizedTypeReference<VehicleLicensePlateDetectionResult>() {};
        return apiClient.invokeAPI("/image/recognize/detect-vehicle-license-plates", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect vehicle license plates in an image
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return VehicleLicensePlateDetectionResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<VehicleLicensePlateDetectionResult> recognizeDetectVehicleLicensePlates(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<VehicleLicensePlateDetectionResult> localVarReturnType = new ParameterizedTypeReference<VehicleLicensePlateDetectionResult>() {};
        return recognizeDetectVehicleLicensePlatesRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<VehicleLicensePlateDetectionResult>> recognizeDetectVehicleLicensePlatesWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<VehicleLicensePlateDetectionResult> localVarReturnType = new ParameterizedTypeReference<VehicleLicensePlateDetectionResult>() {};
        return recognizeDetectVehicleLicensePlatesRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Find the location of a symbol in an image
     * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
     * <p><b>200</b> - OK
     * @param inputImage Image file to search through for the target image.
     * @param targetImage Image to find in the input image.
     * @return FindSymbolResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeFindSymbolRequestCreation(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource targetImage) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputImage' is set
        if (inputImage == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputImage' when calling recognizeFindSymbol", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'targetImage' is set
        if (targetImage == null) {
            throw new WebClientResponseException("Missing the required parameter 'targetImage' when calling recognizeFindSymbol", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputImage != null)
            formParams.add("inputImage", inputImage);
        if (targetImage != null)
            formParams.add("targetImage", targetImage);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<FindSymbolResult> localVarReturnType = new ParameterizedTypeReference<FindSymbolResult>() {};
        return apiClient.invokeAPI("/image/recognize/find/symbol", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Find the location of a symbol in an image
     * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
     * <p><b>200</b> - OK
     * @param inputImage Image file to search through for the target image.
     * @param targetImage Image to find in the input image.
     * @return FindSymbolResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FindSymbolResult> recognizeFindSymbol(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource targetImage) throws WebClientResponseException {
        ParameterizedTypeReference<FindSymbolResult> localVarReturnType = new ParameterizedTypeReference<FindSymbolResult>() {};
        return recognizeFindSymbolRequestCreation(inputImage, targetImage).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<FindSymbolResult>> recognizeFindSymbolWithHttpInfo(org.springframework.core.io.AbstractResource inputImage, org.springframework.core.io.AbstractResource targetImage) throws WebClientResponseException {
        ParameterizedTypeReference<FindSymbolResult> localVarReturnType = new ParameterizedTypeReference<FindSymbolResult>() {};
        return recognizeFindSymbolRequestCreation(inputImage, targetImage).toEntity(localVarReturnType);
    }
    /**
     * Compare two images for similarity
     * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
     * <p><b>200</b> - OK
     * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported.
     * @param comparisonImage Image to compare to the base image.
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeSimilarityCompareRequestCreation(org.springframework.core.io.AbstractResource baseImage, org.springframework.core.io.AbstractResource comparisonImage, String recognitionMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'baseImage' is set
        if (baseImage == null) {
            throw new WebClientResponseException("Missing the required parameter 'baseImage' when calling recognizeSimilarityCompare", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'comparisonImage' is set
        if (comparisonImage == null) {
            throw new WebClientResponseException("Missing the required parameter 'comparisonImage' when calling recognizeSimilarityCompare", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (recognitionMode != null)
        headerParams.add("recognitionMode", apiClient.parameterToString(recognitionMode));
        if (baseImage != null)
            formParams.add("baseImage", baseImage);
        if (comparisonImage != null)
            formParams.add("comparisonImage", comparisonImage);

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
        return apiClient.invokeAPI("/image/recognize/similarity/compare", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Compare two images for similarity
     * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
     * <p><b>200</b> - OK
     * @param baseImage Image file to compare against.  Common file formats such as PNG, JPEG are supported.
     * @param comparisonImage Image to compare to the base image.
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> recognizeSimilarityCompare(org.springframework.core.io.AbstractResource baseImage, org.springframework.core.io.AbstractResource comparisonImage, String recognitionMode) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return recognizeSimilarityCompareRequestCreation(baseImage, comparisonImage, recognitionMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> recognizeSimilarityCompareWithHttpInfo(org.springframework.core.io.AbstractResource baseImage, org.springframework.core.io.AbstractResource comparisonImage, String recognitionMode) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return recognizeSimilarityCompareRequestCreation(baseImage, comparisonImage, recognitionMode).toEntity(localVarReturnType);
    }
    /**
     * Generate a perceptual image hash
     * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
     * @return ImageSimilarityHashResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeSimilarityHashRequestCreation(org.springframework.core.io.AbstractResource imageFile, String recognitionMode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling recognizeSimilarityHash", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (recognitionMode != null)
        headerParams.add("recognitionMode", apiClient.parameterToString(recognitionMode));
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

        ParameterizedTypeReference<ImageSimilarityHashResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashResponse>() {};
        return apiClient.invokeAPI("/image/recognize/similarity/hash", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Generate a perceptual image hash
     * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @param recognitionMode Optional, specify the recognition mode; possible values are Normal, Basic and Advanced.  Default is Normal.
     * @return ImageSimilarityHashResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ImageSimilarityHashResponse> recognizeSimilarityHash(org.springframework.core.io.AbstractResource imageFile, String recognitionMode) throws WebClientResponseException {
        ParameterizedTypeReference<ImageSimilarityHashResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashResponse>() {};
        return recognizeSimilarityHashRequestCreation(imageFile, recognitionMode).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ImageSimilarityHashResponse>> recognizeSimilarityHashWithHttpInfo(org.springframework.core.io.AbstractResource imageFile, String recognitionMode) throws WebClientResponseException {
        ParameterizedTypeReference<ImageSimilarityHashResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashResponse>() {};
        return recognizeSimilarityHashRequestCreation(imageFile, recognitionMode).toEntity(localVarReturnType);
    }
    /**
     * Calculates the similarity between two perceptual image hashes
     * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return ImageSimilarityHashDistanceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec recognizeSimilarityHashDistanceRequestCreation(ImageSimilarityHashDistanceRequest request) throws WebClientResponseException {
        Object postBody = request;
        // verify the required parameter 'request' is set
        if (request == null) {
            throw new WebClientResponseException("Missing the required parameter 'request' when calling recognizeSimilarityHashDistance", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<ImageSimilarityHashDistanceResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashDistanceResponse>() {};
        return apiClient.invokeAPI("/image/recognize/similarity/hash/distance", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Calculates the similarity between two perceptual image hashes
     * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
     * <p><b>200</b> - OK
     * @param request The request parameter
     * @return ImageSimilarityHashDistanceResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ImageSimilarityHashDistanceResponse> recognizeSimilarityHashDistance(ImageSimilarityHashDistanceRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ImageSimilarityHashDistanceResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashDistanceResponse>() {};
        return recognizeSimilarityHashDistanceRequestCreation(request).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<ImageSimilarityHashDistanceResponse>> recognizeSimilarityHashDistanceWithHttpInfo(ImageSimilarityHashDistanceRequest request) throws WebClientResponseException {
        ParameterizedTypeReference<ImageSimilarityHashDistanceResponse> localVarReturnType = new ParameterizedTypeReference<ImageSimilarityHashDistanceResponse>() {};
        return recognizeSimilarityHashDistanceRequestCreation(request).toEntity(localVarReturnType);
    }
}
