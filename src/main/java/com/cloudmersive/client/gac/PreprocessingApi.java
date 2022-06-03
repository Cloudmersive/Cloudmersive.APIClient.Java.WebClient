package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.GetPageAngleResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:39.143700400-07:00[America/Los_Angeles]")
public class PreprocessingApi {
    private ApiClient apiClient;

    public PreprocessingApi() {
        this(new ApiClient());
    }

    @Autowired
    public PreprocessingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert an image of text into a binarized (light and dark) view
     * Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingBinarizeRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingBinarize", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/binarize", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert an image of text into a binarized (light and dark) view
     * Perform an adaptive binarization algorithm on the input image to prepare it for further OCR operations.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> preprocessingBinarize(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingBinarizeRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> preprocessingBinarizeWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingBinarizeRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert an image of text into a binary (light and dark) view with ML
     * Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingBinarizeAdvancedRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingBinarizeAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/binarize/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert an image of text into a binary (light and dark) view with ML
     * Perform an advanced adaptive, Deep Learning-based binarization algorithm on the input image to prepare it for further OCR operations.  Provides enhanced accuracy than adaptive binarization.  Image will be upsampled to 300 DPI if it has a DPI below 300.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> preprocessingBinarizeAdvanced(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingBinarizeAdvancedRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> preprocessingBinarizeAdvancedWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingBinarizeAdvancedRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Get the angle of the page / document / receipt
     * Analyzes a photo or image of a document and identifies the rotation angle of the page.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return GetPageAngleResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingGetPageAngleRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingGetPageAngle", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetPageAngleResult> localVarReturnType = new ParameterizedTypeReference<GetPageAngleResult>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/get-page-angle", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get the angle of the page / document / receipt
     * Analyzes a photo or image of a document and identifies the rotation angle of the page.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return GetPageAngleResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPageAngleResult> preprocessingGetPageAngle(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetPageAngleResult> localVarReturnType = new ParameterizedTypeReference<GetPageAngleResult>() {};
        return preprocessingGetPageAngleRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<GetPageAngleResult>> preprocessingGetPageAngleWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<GetPageAngleResult> localVarReturnType = new ParameterizedTypeReference<GetPageAngleResult>() {};
        return preprocessingGetPageAngleRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and unrotate a document image
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingUnrotateRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingUnrotate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/unrotate", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and unrotate a document image
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle).  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> preprocessingUnrotate(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnrotateRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> preprocessingUnrotateWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnrotateRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and unrotate a document image (advanced)
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingUnrotateAdvancedRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingUnrotateAdvanced", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/unrotate/advanced", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and unrotate a document image (advanced)
     * Detect and unrotate an image of a document (e.g. that was scanned at an angle) using deep learning.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> preprocessingUnrotateAdvanced(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnrotateAdvancedRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> preprocessingUnrotateAdvancedWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnrotateAdvancedRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec preprocessingUnskewRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling preprocessingUnskew", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/ocr/preprocessing/image/unskew", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Detect and unskew a photo of a document
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> preprocessingUnskew(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnskewRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> preprocessingUnskewWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return preprocessingUnskewRequestCreation(imageFile).toEntity(localVarReturnType);
    }
}
