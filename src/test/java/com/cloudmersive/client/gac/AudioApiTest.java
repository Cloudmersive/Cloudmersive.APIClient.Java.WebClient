/*
 * videoapi
 * The video APIs help you convert, encode, and transcode videos.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import java.math.BigDecimal;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for AudioApi
 */
@Ignore
public class AudioApiTest {

    private final AudioApi api = new AudioApi();

    
    /**
     * Convert Audio File to AAC format.
     *
     * Automatically detect audio file format and convert it to AAC format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     */
    @Test
    public void audioConvertToAacTest()  {
        String fileUrl = null;
        Integer bitRate = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.audioConvertToAac(fileUrl, bitRate, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Convert Audio File to M4A format.
     *
     * Automatically detect audio file format and convert it to M4A format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     */
    @Test
    public void audioConvertToM4aTest()  {
        String fileUrl = null;
        Integer bitRate = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.audioConvertToM4a(fileUrl, bitRate, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Convert Audio File to MP3 format.
     *
     * Automatically detect audio file format and convert it to MP3 format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     */
    @Test
    public void audioConvertToMp3Test()  {
        String fileUrl = null;
        Integer bitRate = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.audioConvertToMp3(fileUrl, bitRate, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Convert Audio File to WAV format.
     *
     * Automatically detect audio file format and convert it to WAV format. Supports many input audio formats, including AAC, FLAC, M4A, MP2, MP3, OGG, WMA, and WAV. Uses 1 API call per 10 MB of file size. Also uses 1 API call per additional minute of processing time over 5 minutes, up to a maximum of 25 minutes total processing time. Maximum output file size is 50GB.
     */
    @Test
    public void audioConvertToWavTest()  {
        String fileUrl = null;
        BigDecimal sampleRate = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.audioConvertToWav(fileUrl, sampleRate, inputFile).block();

        // TODO: test validations
    }
    
}
