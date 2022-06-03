/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
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
import com.cloudmersive.client.gac.model.SplitDocxDocumentResult;
import com.cloudmersive.client.gac.model.SplitPdfResult;
import com.cloudmersive.client.gac.model.SplitPptxPresentationResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.gac.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.gac.model.SplitXlsxWorksheetResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for SplitDocumentApi
 */
@Ignore
public class SplitDocumentApiTest {

    private final SplitDocumentApi api = new SplitDocumentApi();

    
    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     *
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     */
    @Test
    public void splitDocumentDocxTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        Boolean returnDocumentContents = null;
        SplitDocxDocumentResult response = api.splitDocumentDocx(inputFile, returnDocumentContents).block();

        // TODO: test validations
    }
    
    /**
     * Split a PDF file into separate PDF files, one per page
     *
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     */
    @Test
    public void splitDocumentPdfByPageTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        Boolean returnDocumentContents = null;
        SplitPdfResult response = api.splitDocumentPdfByPage(inputFile, returnDocumentContents).block();

        // TODO: test validations
    }
    
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     *
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     */
    @Test
    public void splitDocumentPptxTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        Boolean returnDocumentContents = null;
        SplitPptxPresentationResult response = api.splitDocumentPptx(inputFile, returnDocumentContents).block();

        // TODO: test validations
    }
    
    /**
     * Split a single Text file (txt) into lines
     *
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     */
    @Test
    public void splitDocumentTxtByLineTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        SplitTextDocumentByLinesResult response = api.splitDocumentTxtByLine(inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Split a single Text file (txt) by a string delimiter
     *
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     */
    @Test
    public void splitDocumentTxtByStringTest()  {
        String splitDelimiter = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        Boolean skipEmptyElements = null;
        SplitTextDocumentByStringResult response = api.splitDocumentTxtByString(splitDelimiter, inputFile, skipEmptyElements).block();

        // TODO: test validations
    }
    
    /**
     * Split a single Excel XLSX into Separate Worksheets
     *
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     */
    @Test
    public void splitDocumentXlsxTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        Boolean returnDocumentContents = null;
        SplitXlsxWorksheetResult response = api.splitDocumentXlsx(inputFile, returnDocumentContents).block();

        // TODO: test validations
    }
    
}
