/*
 * imageapi
 * Image Recognition and Processing APIs let you use Machine Learning to recognize and process images, and also perform useful image modification operations.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for RecognizeApi
 */
@Ignore
public class RecognizeApiTest {

    private final RecognizeApi api = new RecognizeApi();

    
    /**
     * Describe an image in natural language
     *
     * Generate an English language text description of the image as a sentence.
     */
    @Test
    public void recognizeDescribeTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        ImageDescriptionResponse response = api.recognizeDescribe(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect and unskew a photo of a document
     *
     * Detect and unskew a photo of a document (e.g. taken on a cell phone) into a perfectly square image.  Great for document scanning applications; once unskewed, this image is perfect for converting to PDF using the Convert API or optical character recognition using the OCR API.
     */
    @Test
    public void recognizeDetectAndUnskewDocumentTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        String postProcessingEffect = null;
        byte[] response = api.recognizeDetectAndUnskewDocument(imageFile, postProcessingEffect).block();

        // TODO: test validations
    }
    
    /**
     * Detect objects including types and locations in an image
     *
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     */
    @Test
    public void recognizeDetectObjectsTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        ObjectDetectionResult response = api.recognizeDetectObjects(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect people including locations in an image
     *
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     */
    @Test
    public void recognizeDetectPeopleTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        ObjectDetectionResult response = api.recognizeDetectPeople(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect fine text in a photo of a document
     *
     * Identify the position, and size of small/fine text within a photograph of a document.  Identify the location of small text in a photo - such as words and other forms of high density text.  Can be used on a scan of a document or a photograph (e.g. smartphone camera) of a document, page or receipt.  For OCR purposes - please see our Deep Learning OCR APIs.
     */
    @Test
    public void recognizeDetectTextFineTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        FineTextDetectionResult response = api.recognizeDetectTextFine(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect large text in a photo
     *
     * Identify the position, and size of large text within a photograph.  Identify the location of large text in a photo - such as signs, titles, etc. and other forms of large, low-density text.  Not suitable for high-density text (e.g. scans of documents, receipts, etc.) for OCR purposes - for OCR, please see our Deep Learning OCR APIs.
     */
    @Test
    public void recognizeDetectTextLargeTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        TextDetectionResult response = api.recognizeDetectTextLarge(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect vehicle license plates in an image
     *
     * Identify the position, and size, and content of vehicle license plates in an image.  License plates should be within 15-20 degrees on-axis to the camera.  Supported image formats are JPG, PNG and BMP.
     */
    @Test
    public void recognizeDetectVehicleLicensePlatesTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        VehicleLicensePlateDetectionResult response = api.recognizeDetectVehicleLicensePlates(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Find the location of a symbol in an image
     *
     * Determine if an image contains a symbol, and if so, the location of that symbol in the image.
     */
    @Test
    public void recognizeFindSymbolTest()  {
        org.springframework.core.io.AbstractResource inputImage = null;
        org.springframework.core.io.AbstractResource targetImage = null;
        FindSymbolResult response = api.recognizeFindSymbol(inputImage, targetImage).block();

        // TODO: test validations
    }
    
    /**
     * Compare two images for similarity
     *
     * Generates an image similarity score using Deep Learning between 0.0 and 1.0, values closer to 1.0 indicate greater similarity
     */
    @Test
    public void recognizeSimilarityCompareTest()  {
        org.springframework.core.io.AbstractResource baseImage = null;
        org.springframework.core.io.AbstractResource comparisonImage = null;
        String recognitionMode = null;
        byte[] response = api.recognizeSimilarityCompare(baseImage, comparisonImage, recognitionMode).block();

        // TODO: test validations
    }
    
    /**
     * Generate a perceptual image hash
     *
     * Generates a hash value for the image; hash values that are closer together in terms of Hamming Distance are more similar.
     */
    @Test
    public void recognizeSimilarityHashTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        String recognitionMode = null;
        ImageSimilarityHashResponse response = api.recognizeSimilarityHash(imageFile, recognitionMode).block();

        // TODO: test validations
    }
    
    /**
     * Calculates the similarity between two perceptual image hashes
     *
     * Calculates the similarity between two perceptual image hashes by computing the Hamming Distance between them.
     */
    @Test
    public void recognizeSimilarityHashDistanceTest()  {
        ImageSimilarityHashDistanceRequest request = null;
        ImageSimilarityHashDistanceResponse response = api.recognizeSimilarityHashDistance(request).block();

        // TODO: test validations
    }
    
}
