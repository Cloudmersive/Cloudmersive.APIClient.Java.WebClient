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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:45.286050300-07:00[America/Los_Angeles]")
public class ConvertApi {
    private ApiClient apiClient;

    public ConvertApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert input image to Bitmap BMP format
     * Converts the input image into PSD format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToBmpRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToBmp", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/bmp", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to Bitmap BMP format
     * Converts the input image into PSD format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToBmp(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToBmpRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToBmpWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToBmpRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to GIF format
     * Converts the input image into GIF format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToGifRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToGif", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/gif", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to GIF format
     * Converts the input image into GIF format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToGif(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToGifRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToGifWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToGifRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to JPG, JPEG format
     * Converts the input image into JPEG/JPG format.  Customize encoding parameters.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param quality Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToJpgRequestCreation(Integer quality, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'quality' is set
        if (quality == null) {
            throw new WebClientResponseException("Missing the required parameter 'quality' when calling convertToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToJpg", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("quality", quality);

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
        return apiClient.invokeAPI("/image/convert/to/jpg/{quality}", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to JPG, JPEG format
     * Converts the input image into JPEG/JPG format.  Customize encoding parameters.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param quality Set the JPEG quality level; lowest quality is 1 (highest compression), highest quality (lowest compression) is 100; recommended value is 75
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToJpg(Integer quality, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToJpgRequestCreation(quality, imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToJpgWithHttpInfo(Integer quality, org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToJpgRequestCreation(quality, imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to Photoshop PSD format
     * Converts the input image into PSD format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToPhotoshopRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToPhotoshop", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/psd", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to Photoshop PSD format
     * Converts the input image into PSD format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToPhotoshop(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToPhotoshopRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToPhotoshopWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToPhotoshopRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to PNG format
     * Converts the input image into PNG format.  Transparency is preserved when present.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToPngRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToPng", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/png", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to PNG format
     * Converts the input image into PNG format.  Transparency is preserved when present.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToPng(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToPngRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToPngWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToPngRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to TIFF format
     * Converts the input image into TIFF format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToTiffRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToTiff", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/tiff", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to TIFF format
     * Converts the input image into TIFF format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToTiff(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToTiffRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToTiffWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToTiffRequestCreation(imageFile).toEntity(localVarReturnType);
    }
    /**
     * Convert input image to WebP format
     * Converts the input image into WebP format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertToWebPRequestCreation(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'imageFile' when calling convertToWebP", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/image/convert/to/webp", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert input image to WebP format
     * Converts the input image into WebP format.  Supported input file formats include AAI, ART, ARW, AVS, BPG, BMP, BMP2, BMP3, BRF, CALS, CGM, CIN, CMYK, CMYKA, CR2, CRW, CUR, CUT, DCM, DCR, DCX, DDS, DIB, DJVU, DNG, DOT, DPX, EMF, EPDF, EPI, EPS, EPS2, EPS3, EPSF, EPSI, EPT, EXR, FAX, FIG, FITS, FPX, GIF, GPLT, GRAY, HDR, HEIC, HPGL, HRZ, ICO, ISOBRL, ISBRL6, JBIG, JNG, JP2, JPT, J2C, J2K, JPEG/JPG, JXR, MAT, MONO, MNG, M2V, MRW, MTV, NEF, ORF, OTB, P7, PALM, PAM, PBM, PCD, PCDS, PCL, PCX, PDF, PEF, PES, PFA, PFB, PFM, PGM, PICON, PICT, PIX, PNG, PNG8, PNG00, PNG24, PNG32, PNG48, PNG64, PNM, PPM, PSB, PSD, PTIF, PWB, RAD, RAF, RGB, RGBA, RGF, RLA, RLE, SCT, SFW, SGI, SID, SUN, SVG, TGA, TIFF, TIM, UIL, VIFF, VICAR, VBMP, WDP, WEBP, WPG, X, XBM, XCF, XPM, XWD, X3F, YCbCr, YCbCrA, YUV.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertToWebP(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToWebPRequestCreation(imageFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertToWebPWithHttpInfo(org.springframework.core.io.AbstractResource imageFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertToWebPRequestCreation(imageFile).toEntity(localVarReturnType);
    }
}
