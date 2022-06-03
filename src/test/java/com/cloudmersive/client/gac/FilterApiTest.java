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
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for FilterApi
 */
@Ignore
public class FilterApiTest {

    private final FilterApi api = new FilterApi();

    
    /**
     * Convert image to black-and-white grayscale
     *
     * Remove color from the image by converting to a grayscale, black-and-white image
     */
    @Test
    public void filterBlackAndWhiteTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterBlackAndWhite(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Despeckle to remove point noise from the image
     *
     * Remove point noise / despeckle the input image
     */
    @Test
    public void filterDespeckleTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterDespeckle(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Detect and highlight edges in an image
     *
     * Perform an edge detection operation on the input image
     */
    @Test
    public void filterEdgeDetectTest()  {
        Integer radius = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterEdgeDetect(radius, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Emboss an image
     *
     * Perform an emboss operation on the input image
     */
    @Test
    public void filterEmbossTest()  {
        Integer radius = null;
        Integer sigma = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterEmboss(radius, sigma, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Perform a guassian blur on the input image
     *
     * Perform a gaussian blur on the input image
     */
    @Test
    public void filterGaussianBlurTest()  {
        Integer radius = null;
        Integer sigma = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterGaussianBlur(radius, sigma, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Perform a motion blur on the input image
     *
     * Perform a motion blur on the input image at a specific angle
     */
    @Test
    public void filterMotionBlurTest()  {
        Integer radius = null;
        Integer sigma = null;
        Integer angle = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterMotionBlur(radius, sigma, angle, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Posterize the image by reducing distinct colors
     *
     * Reduce the unique number of colors in the image to the specified level
     */
    @Test
    public void filterPosterizeTest()  {
        Integer levels = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterPosterize(levels, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Swirl distort the image
     *
     * Swirl distort the image by the specified number of degrees
     */
    @Test
    public void filterSwirlTest()  {
        Integer degrees = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.filterSwirl(degrees, imageFile).block();

        // TODO: test validations
    }
    
}
