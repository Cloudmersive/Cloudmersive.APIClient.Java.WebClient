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

import com.cloudmersive.client.gac.model.DrawPolygonRequest;
import com.cloudmersive.client.gac.model.DrawRectangleRequest;
import com.cloudmersive.client.gac.model.DrawTextRequest;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for EditApi
 */
@Ignore
public class EditApiTest {

    private final EditApi api = new EditApi();

    
    /**
     * Normalizes image rotation and removes EXIF rotation data
     *
     * Automatically orients the input image based on EXIF information and then removes the EXIF information.  EXIF is an additional set of information stored in some images taken with cell phone cameras based on the orientation of the camera.  By normalizing rotation and removing EXIF data these images become much easier to process.
     */
    @Test
    public void editAutoOrientTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editAutoOrient(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Composite two images together
     *
     * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
     */
    @Test
    public void editCompositeBasicTest()  {
        String location = null;
        org.springframework.core.io.AbstractResource baseImage = null;
        org.springframework.core.io.AbstractResource layeredImage = null;
        byte[] response = api.editCompositeBasic(location, baseImage, layeredImage).block();

        // TODO: test validations
    }
    
    /**
     * Composite two images together precisely
     *
     * Composites two input images together; a layered image onto a base image. Position is based on distance in pixels from each side.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.  Providing multiple parameters in a single axis (for example top and bottom) is not recommended, since only one of the parameters will be used per axis.
     */
    @Test
    public void editCompositePreciseTest()  {
        org.springframework.core.io.AbstractResource baseImage = null;
        org.springframework.core.io.AbstractResource layeredImage = null;
        Integer top = null;
        Integer bottom = null;
        Integer left = null;
        Integer right = null;
        Integer width = null;
        Integer height = null;
        byte[] response = api.editCompositePrecise(baseImage, layeredImage, top, bottom, left, right, width, height).block();

        // TODO: test validations
    }
    
    /**
     * Adaptively adjust the contrast of the image to be more appealing and easy to see
     *
     * Uses Gamma to adjust the contrast adaptively the way the human eye sees the world.  Results significantly improve the viewability and visual appeal of the image.
     */
    @Test
    public void editContrastAdaptiveTest()  {
        Double gamma = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editContrastAdaptive(gamma, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Crop an image to an circular area
     *
     * Crop an image to a target circular area
     */
    @Test
    public void editCropCircleTest()  {
        Integer left = null;
        Integer top = null;
        Integer radius = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editCropCircle(left, top, radius, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Crop an image to a rectangular area
     *
     * Crop an image to a target rectangular area
     */
    @Test
    public void editCropRectangleTest()  {
        Integer left = null;
        Integer top = null;
        Integer width = null;
        Integer height = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editCropRectangle(left, top, width, height, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Draw a polygon onto an image
     *
     * Draw one or more polygons, with customized visuals, onto an image
     */
    @Test
    public void editDrawPolygonTest()  {
        DrawPolygonRequest request = null;
        byte[] response = api.editDrawPolygon(request).block();

        // TODO: test validations
    }
    
    /**
     * Draw a rectangle onto an image
     *
     * Draw one or more rectangles, with customized visuals, onto an image
     */
    @Test
    public void editDrawRectangleTest()  {
        DrawRectangleRequest request = null;
        byte[] response = api.editDrawRectangle(request).block();

        // TODO: test validations
    }
    
    /**
     * Draw text onto an image
     *
     * Draw one or more pieces of text, with customized visuals, onto an image
     */
    @Test
    public void editDrawTextTest()  {
        DrawTextRequest request = null;
        byte[] response = api.editDrawText(request).block();

        // TODO: test validations
    }
    
    /**
     * Add a customizeable drop shadow to an image
     *
     * Add a customizeable drop shadow to the image
     */
    @Test
    public void editDropShadowTest()  {
        Integer X = null;
        Integer Y = null;
        Integer sigma = null;
        Integer opacity = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editDropShadow(X, Y, sigma, opacity, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Invert, negate the colors in the image
     *
     * Inverts (negates) all of the colors in the image.  If the image contains transparency, the transparency will first be removed prior to inverting the image.
     */
    @Test
    public void editInvertTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editInvert(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Remove EXIF data from the image
     *
     * Removes any EXIF data and profiles .
     */
    @Test
    public void editRemoveExifDataTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editRemoveExifData(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Remove transparency from the image
     *
     * Removes any active transparency in the image.  Effectively renders the image at the same resolution, in the same file format, over a white background, thus removing transparency.
     */
    @Test
    public void editRemoveTransparencyTest()  {
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editRemoveTransparency(imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Rotate an image any number of degrees
     *
     * Rotates an image by an arbitrary number of degrees
     */
    @Test
    public void editRotateTest()  {
        Double degrees = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editRotate(degrees, imageFile).block();

        // TODO: test validations
    }
    
}
