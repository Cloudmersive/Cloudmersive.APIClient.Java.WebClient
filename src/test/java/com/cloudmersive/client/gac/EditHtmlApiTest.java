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
import com.cloudmersive.client.gac.model.HtmlGetLanguageResult;
import com.cloudmersive.client.gac.model.HtmlGetLinksResponse;
import com.cloudmersive.client.gac.model.HtmlGetRelCanonicalUrlResult;
import com.cloudmersive.client.gac.model.HtmlGetSitemapUrlResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for EditHtmlApi
 */
@Ignore
public class EditHtmlApiTest {

    private final EditHtmlApi api = new EditHtmlApi();

    
    /**
     * Append an HTML tag to the HEAD section of an HTML Document
     *
     * Appends an HTML tag to the HEAD section of an HTML document.
     */
    @Test
    public void editHtmlHtmlAppendHeaderTagTest()  {
        String htmlTag = null;
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendHeaderTag(htmlTag, inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Append a Heading to an HTML Document
     *
     * Appends a heading to the end of an HTML document.
     */
    @Test
    public void editHtmlHtmlAppendHeadingTest()  {
        String headingText = null;
        String inputFileUrl = null;
        Integer headingSize = null;
        String cssStyle = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendHeading(headingText, inputFileUrl, headingSize, cssStyle, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Append an Image to an HTML Document from a URL
     *
     * Appends an image to the end of an HTML document using a URL.
     */
    @Test
    public void editHtmlHtmlAppendImageFromUrlTest()  {
        String imageUrl = null;
        String inputFileUrl = null;
        String cssStyle = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendImageFromUrl(imageUrl, inputFileUrl, cssStyle, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Append a Base64 Inline Image to an HTML Document
     *
     * Appends a base64 inline image to the end of an HTML document from an input file or URL.
     */
    @Test
    public void editHtmlHtmlAppendImageInlineTest()  {
        String inputFileUrl = null;
        String imageUrl = null;
        String cssStyle = null;
        String imageExtension = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        org.springframework.core.io.AbstractResource imageFile = null;
        byte[] response = api.editHtmlHtmlAppendImageInline(inputFileUrl, imageUrl, cssStyle, imageExtension, inputFile, imageFile).block();

        // TODO: test validations
    }
    
    /**
     * Append a Paragraph to an HTML Document
     *
     * Appends a paragraph to the end of an HTML document.
     */
    @Test
    public void editHtmlHtmlAppendParagraphTest()  {
        String paragraphText = null;
        String inputFileUrl = null;
        String cssStyle = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlAppendParagraph(paragraphText, inputFileUrl, cssStyle, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Create a Blank HTML Document
     *
     * Returns a blank HTML Document format file.  The file is blank, with no contents by default.  Use the optional input parameters to add various starting elements.  Use additional editing commands such as Append Header, Append Paragraph or Append Image from URL to populate the document.
     */
    @Test
    public void editHtmlHtmlCreateBlankDocumentTest()  {
        String title = null;
        String cssUrl = null;
        String cssInline = null;
        String javascriptUrl = null;
        String javascriptInline = null;
        byte[] response = api.editHtmlHtmlCreateBlankDocument(title, cssUrl, cssInline, javascriptUrl, javascriptInline).block();

        // TODO: test validations
    }
    
    /**
     * Gets the language for the HTML document
     *
     * Retrieves the language code (e.g. \&quot;en\&quot; or \&quot;de\&quot;) of an HTML document.
     */
    @Test
    public void editHtmlHtmlGetLanguageTest()  {
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        HtmlGetLanguageResult response = api.editHtmlHtmlGetLanguage(inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Extract resolved link URLs from HTML File
     *
     * Extracts the resolved link URLs, fully-qualified if possible, from an input HTML file.
     */
    @Test
    public void editHtmlHtmlGetLinksTest()  {
        String inputFileUrl = null;
        String baseUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        HtmlGetLinksResponse response = api.editHtmlHtmlGetLinks(inputFileUrl, baseUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Gets the rel canonical URL for the HTML document
     *
     * Gets the rel canonical URL of an HTML document.
     */
    @Test
    public void editHtmlHtmlGetRelCanonicalTest()  {
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        HtmlGetRelCanonicalUrlResult response = api.editHtmlHtmlGetRelCanonical(inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Gets the sitemap URL for the HTML document
     *
     * Gets the sitemap link URL of an HTML document.
     */
    @Test
    public void editHtmlHtmlGetSitemapTest()  {
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        HtmlGetSitemapUrlResult response = api.editHtmlHtmlGetSitemap(inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Sets the language for the HTML document
     *
     * Sets the language code of an HTML document.
     */
    @Test
    public void editHtmlHtmlSetLanguageTest()  {
        String languageCode = null;
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlSetLanguage(languageCode, inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Sets the rel canonical URL for the HTML document
     *
     * Sets the rel canonical URL of an HTML document.  This is useful for telling search engines and other indexers which pages are duplicates of eachother; any pages with the rel&#x3D;canonical tag will be treated as duplicates of the canonical URL.
     */
    @Test
    public void editHtmlHtmlSetRelCanonicalTest()  {
        String canonicalUrl = null;
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlSetRelCanonical(canonicalUrl, inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Sets the sitemap URL for the HTML document
     *
     * Sets the sitemap URL of an HTML document.
     */
    @Test
    public void editHtmlHtmlSetSitemapUrlTest()  {
        String sitemapUrl = null;
        String inputFileUrl = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        byte[] response = api.editHtmlHtmlSetSitemapUrl(sitemapUrl, inputFileUrl, inputFile).block();

        // TODO: test validations
    }
    
}
