package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.XmlAddAttributeWithXPathResult;
import com.cloudmersive.client.gac.model.XmlAddChildWithXPathResult;
import com.cloudmersive.client.gac.model.XmlFilterWithXPathResult;
import com.cloudmersive.client.gac.model.XmlQueryWithXQueryMultiResult;
import com.cloudmersive.client.gac.model.XmlQueryWithXQueryResult;
import com.cloudmersive.client.gac.model.XmlRemoveAllChildrenWithXPathResult;
import com.cloudmersive.client.gac.model.XmlRemoveWithXPathResult;
import com.cloudmersive.client.gac.model.XmlReplaceWithXPathResult;
import com.cloudmersive.client.gac.model.XmlSetValueWithXPathResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-15T18:13:21.963387400-07:00[America/Los_Angeles]")
public class ConvertDataApi {
    private ApiClient apiClient;

    public ConvertDataApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert CSV to JSON conversion
     * Convert a CSV file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataCsvToJsonRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataCsvToJson", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (columnNamesFromFirstRow != null)
        headerParams.add("columnNamesFromFirstRow", apiClient.parameterToString(columnNamesFromFirstRow));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/csv/to/json", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert CSV to JSON conversion
     * Convert a CSV file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> convertDataCsvToJson(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataCsvToJsonRequestCreation(inputFile, columnNamesFromFirstRow).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> convertDataCsvToJsonWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataCsvToJsonRequestCreation(inputFile, columnNamesFromFirstRow).toEntity(localVarReturnType);
    }
    /**
     * Convert CSV to XML conversion
     * Convert a CSV file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataCsvToXmlRequestCreation(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataCsvToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (columnNamesFromFirstRow != null)
        headerParams.add("columnNamesFromFirstRow", apiClient.parameterToString(columnNamesFromFirstRow));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/csv/to/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert CSV to XML conversion
     * Convert a CSV file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param columnNamesFromFirstRow Optional; If true, the first row will be used as the labels for the columns; if false, columns will be named Column0, Column1, etc.  Default is true.  Set to false if you are not using column headings, or have an irregular column structure.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDataCsvToXml(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataCsvToXmlRequestCreation(inputFile, columnNamesFromFirstRow).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDataCsvToXmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Boolean columnNamesFromFirstRow) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataCsvToXmlRequestCreation(inputFile, columnNamesFromFirstRow).toEntity(localVarReturnType);
    }
    /**
     * Convert JSON String to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonString Input JSON String to convert to XML
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataJsonStringToXmlRequestCreation(String jsonString) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'jsonString' is set
        if (jsonString == null) {
            throw new WebClientResponseException("Missing the required parameter 'jsonString' when calling convertDataJsonStringToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "JsonString", jsonString));

        final String[] localVarAccepts = { 
            "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/json-string/to/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert JSON String to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonString Input JSON String to convert to XML
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> convertDataJsonStringToXml(String jsonString) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataJsonStringToXmlRequestCreation(jsonString).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> convertDataJsonStringToXmlWithHttpInfo(String jsonString) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataJsonStringToXmlRequestCreation(jsonString).toEntity(localVarReturnType);
    }
    /**
     * Convert JSON Object to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonObject Input JSON Object to convert to XML
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataJsonToXmlRequestCreation(Object jsonObject) throws WebClientResponseException {
        Object postBody = jsonObject;
        // verify the required parameter 'jsonObject' is set
        if (jsonObject == null) {
            throw new WebClientResponseException("Missing the required parameter 'jsonObject' when calling convertDataJsonToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "text/json", "application/xml", "text/xml", "application/x-www-form-urlencoded"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/json/to/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert JSON Object to XML conversion
     * Convert a JSON object into XML
     * <p><b>200</b> - OK
     * @param jsonObject Input JSON Object to convert to XML
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDataJsonToXml(Object jsonObject) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataJsonToXmlRequestCreation(jsonObject).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDataJsonToXmlWithHttpInfo(Object jsonObject) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataJsonToXmlRequestCreation(jsonObject).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel (97-2003) XLS to JSON conversion
     * Convert an Excel (97-2003) XLS file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXlsToJsonRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXlsToJson", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/xls/to/json", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel (97-2003) XLS to JSON conversion
     * Convert an Excel (97-2003) XLS file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> convertDataXlsToJson(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataXlsToJsonRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> convertDataXlsToJsonWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataXlsToJsonRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX to JSON conversion
     * Convert an Excel XLSX file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXlsxToJsonRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXlsxToJson", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/xlsx/to/json", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX to JSON conversion
     * Convert an Excel XLSX file to a JSON object array
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDataXlsxToJson(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXlsxToJsonRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDataXlsxToJsonWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXlsxToJsonRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert Excel XLSX to XML conversion
     * Convert an Excel XLSX file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXlsxToXmlRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXlsxToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

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
        return apiClient.invokeAPI("/convert/xlsx/to/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert Excel XLSX to XML conversion
     * Convert an Excel XLSX file to a XML file
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDataXlsxToXml(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXlsxToXmlRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDataXlsxToXmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXlsxToXmlRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Adds an attribute to all XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlAttributeName Name of the XML attribute to add
     * @param xmlAttributeValue Value of the XML attribute to add
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlAddAttributeWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlEditAddAttributeWithXPathRequestCreation(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddAttributeWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xmlAttributeName' is set
        if (xmlAttributeName == null) {
            throw new WebClientResponseException("Missing the required parameter 'xmlAttributeName' when calling convertDataXmlEditAddAttributeWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xmlAttributeValue' is set
        if (xmlAttributeValue == null) {
            throw new WebClientResponseException("Missing the required parameter 'xmlAttributeValue' when calling convertDataXmlEditAddAttributeWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddAttributeWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlAttributeName != null)
        headerParams.add("XmlAttributeName", apiClient.parameterToString(xmlAttributeName));
        if (xmlAttributeValue != null)
        headerParams.add("XmlAttributeValue", apiClient.parameterToString(xmlAttributeValue));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlAddAttributeWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddAttributeWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/add-attribute", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Adds an attribute to all XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an attribute to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlAttributeName Name of the XML attribute to add
     * @param xmlAttributeValue Value of the XML attribute to add
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlAddAttributeWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlAddAttributeWithXPathResult> convertDataXmlEditAddAttributeWithXPath(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlAddAttributeWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddAttributeWithXPathResult>() {};
        return convertDataXmlEditAddAttributeWithXPathRequestCreation(xpathExpression, xmlAttributeName, xmlAttributeValue, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlAddAttributeWithXPathResult>> convertDataXmlEditAddAttributeWithXPathWithHttpInfo(String xpathExpression, String xmlAttributeName, String xmlAttributeValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlAddAttributeWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddAttributeWithXPathResult>() {};
        return convertDataXmlEditAddAttributeWithXPathRequestCreation(xpathExpression, xmlAttributeName, xmlAttributeValue, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Adds an XML node as a child to XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlNodeToAdd XML Node to add as a child
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlAddChildWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlEditAddChildWithXPathRequestCreation(String xpathExpression, String xmlNodeToAdd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditAddChildWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xmlNodeToAdd' is set
        if (xmlNodeToAdd == null) {
            throw new WebClientResponseException("Missing the required parameter 'xmlNodeToAdd' when calling convertDataXmlEditAddChildWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlEditAddChildWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlNodeToAdd != null)
        headerParams.add("XmlNodeToAdd", apiClient.parameterToString(xmlNodeToAdd));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlAddChildWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddChildWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/add-child", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Adds an XML node as a child to XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by adding an XML node as a child to all of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlNodeToAdd XML Node to add as a child
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlAddChildWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlAddChildWithXPathResult> convertDataXmlEditAddChildWithXPath(String xpathExpression, String xmlNodeToAdd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlAddChildWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddChildWithXPathResult>() {};
        return convertDataXmlEditAddChildWithXPathRequestCreation(xpathExpression, xmlNodeToAdd, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlAddChildWithXPathResult>> convertDataXmlEditAddChildWithXPathWithHttpInfo(String xpathExpression, String xmlNodeToAdd, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlAddChildWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlAddChildWithXPathResult>() {};
        return convertDataXmlEditAddChildWithXPathRequestCreation(xpathExpression, xmlNodeToAdd, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
     * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlRemoveAllChildrenWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlEditRemoveAllChildNodesWithXPathRequestCreation(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditRemoveAllChildNodesWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlEditRemoveAllChildNodesWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/remove-all-children", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Removes, deletes all children of nodes matching XPath expression, but does not remove the nodes
     * Return the reuslts of editing an XML document by removing all child nodes of the nodes that match an input XPath expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlRemoveAllChildrenWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlRemoveAllChildrenWithXPathResult> convertDataXmlEditRemoveAllChildNodesWithXPath(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return convertDataXmlEditRemoveAllChildNodesWithXPathRequestCreation(xpathExpression, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlRemoveAllChildrenWithXPathResult>> convertDataXmlEditRemoveAllChildNodesWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveAllChildrenWithXPathResult>() {};
        return convertDataXmlEditRemoveAllChildNodesWithXPathRequestCreation(xpathExpression, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Replaces XML nodes matching XPath expression with new node
     * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlNodeReplacement XML Node replacement content
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlReplaceWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlEditReplaceWithXPathRequestCreation(String xpathExpression, String xmlNodeReplacement, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditReplaceWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xmlNodeReplacement' is set
        if (xmlNodeReplacement == null) {
            throw new WebClientResponseException("Missing the required parameter 'xmlNodeReplacement' when calling convertDataXmlEditReplaceWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlEditReplaceWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlNodeReplacement != null)
        headerParams.add("XmlNodeReplacement", apiClient.parameterToString(xmlNodeReplacement));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlReplaceWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlReplaceWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/replace", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Replaces XML nodes matching XPath expression with new node
     * Return the reuslts of editing an XML document by replacing all of the nodes that match an input XPath expression with a new XML node expression.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlNodeReplacement XML Node replacement content
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlReplaceWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlReplaceWithXPathResult> convertDataXmlEditReplaceWithXPath(String xpathExpression, String xmlNodeReplacement, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlReplaceWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlReplaceWithXPathResult>() {};
        return convertDataXmlEditReplaceWithXPathRequestCreation(xpathExpression, xmlNodeReplacement, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlReplaceWithXPathResult>> convertDataXmlEditReplaceWithXPathWithHttpInfo(String xpathExpression, String xmlNodeReplacement, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlReplaceWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlReplaceWithXPathResult>() {};
        return convertDataXmlEditReplaceWithXPathRequestCreation(xpathExpression, xmlNodeReplacement, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Sets the value contents of XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlValue XML Value to set into the matching XML nodes
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlSetValueWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlEditSetValueWithXPathRequestCreation(String xpathExpression, String xmlValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlEditSetValueWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'xmlValue' is set
        if (xmlValue == null) {
            throw new WebClientResponseException("Missing the required parameter 'xmlValue' when calling convertDataXmlEditSetValueWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlEditSetValueWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (xmlValue != null)
        headerParams.add("XmlValue", apiClient.parameterToString(xmlValue));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlSetValueWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlSetValueWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/set-value", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Sets the value contents of XML nodes matching XPath expression
     * Return the reuslts of editing an XML document by setting the contents of all of the nodes that match an input XPath expression.  Supports elements and attributes.
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param xmlValue XML Value to set into the matching XML nodes
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlSetValueWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlSetValueWithXPathResult> convertDataXmlEditSetValueWithXPath(String xpathExpression, String xmlValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlSetValueWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlSetValueWithXPathResult>() {};
        return convertDataXmlEditSetValueWithXPathRequestCreation(xpathExpression, xmlValue, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlSetValueWithXPathResult>> convertDataXmlEditSetValueWithXPathWithHttpInfo(String xpathExpression, String xmlValue, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlSetValueWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlSetValueWithXPathResult>() {};
        return convertDataXmlEditSetValueWithXPathRequestCreation(xpathExpression, xmlValue, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Filter, select XML nodes using XPath expression, get results
     * Return the reuslts of filtering, selecting an XML document with an XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input file to perform the operation on.
     * @return XmlFilterWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlFilterWithXPathRequestCreation(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlFilterWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlFilterWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlFilterWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlFilterWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/select/xpath", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Filter, select XML nodes using XPath expression, get results
     * Return the reuslts of filtering, selecting an XML document with an XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input file to perform the operation on.
     * @return XmlFilterWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlFilterWithXPathResult> convertDataXmlFilterWithXPath(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlFilterWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlFilterWithXPathResult>() {};
        return convertDataXmlFilterWithXPathRequestCreation(xpathExpression, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlFilterWithXPathResult>> convertDataXmlFilterWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlFilterWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlFilterWithXPathResult>() {};
        return convertDataXmlFilterWithXPathRequestCreation(xpathExpression, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Query an XML file using XQuery query, get results
     * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlQueryWithXQueryResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlQueryWithXQueryRequestCreation(String xquery, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new WebClientResponseException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQuery", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlQueryWithXQuery", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xquery != null)
        headerParams.add("XQuery", apiClient.parameterToString(xquery));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlQueryWithXQueryResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryResult>() {};
        return apiClient.invokeAPI("/convert/xml/query/xquery", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Query an XML file using XQuery query, get results
     * Return the reuslts of querying a single XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for a single XML document as input.  Provided XML document is automatically loaded as the default context; to access elements in the document, simply refer to them without a document reference, such as bookstore/book
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
     * @param inputFile Input XML file to perform the operation on.
     * @return XmlQueryWithXQueryResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlQueryWithXQueryResult> convertDataXmlQueryWithXQuery(String xquery, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlQueryWithXQueryResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryResult>() {};
        return convertDataXmlQueryWithXQueryRequestCreation(xquery, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlQueryWithXQueryResult>> convertDataXmlQueryWithXQueryWithHttpInfo(String xquery, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlQueryWithXQueryResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryResult>() {};
        return convertDataXmlQueryWithXQueryRequestCreation(xquery, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Query multiple XML files using XQuery query, get results
     * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
     * @param inputFile1 First input XML file to perform the operation on.
     * @param inputFile2 Second input XML file to perform the operation on.
     * @param inputFile3 Third input XML file to perform the operation on.
     * @param inputFile4 Fourth input XML file to perform the operation on.
     * @param inputFile5 Fifth input XML file to perform the operation on.
     * @param inputFile6 Sixth input XML file to perform the operation on.
     * @param inputFile7 Seventh input XML file to perform the operation on.
     * @param inputFile8 Eighth input XML file to perform the operation on.
     * @param inputFile9 Ninth input XML file to perform the operation on.
     * @param inputFile10 Tenth input XML file to perform the operation on.
     * @return XmlQueryWithXQueryMultiResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlQueryWithXQueryMultiRequestCreation(String xquery, org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xquery' is set
        if (xquery == null) {
            throw new WebClientResponseException("Missing the required parameter 'xquery' when calling convertDataXmlQueryWithXQueryMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile1' is set
        if (inputFile1 == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile1' when calling convertDataXmlQueryWithXQueryMulti", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xquery != null)
        headerParams.add("XQuery", apiClient.parameterToString(xquery));
        if (inputFile1 != null)
            formParams.add("inputFile1", inputFile1);
        if (inputFile2 != null)
            formParams.add("inputFile2", inputFile2);
        if (inputFile3 != null)
            formParams.add("inputFile3", inputFile3);
        if (inputFile4 != null)
            formParams.add("inputFile4", inputFile4);
        if (inputFile5 != null)
            formParams.add("inputFile5", inputFile5);
        if (inputFile6 != null)
            formParams.add("inputFile6", inputFile6);
        if (inputFile7 != null)
            formParams.add("inputFile7", inputFile7);
        if (inputFile8 != null)
            formParams.add("inputFile8", inputFile8);
        if (inputFile9 != null)
            formParams.add("inputFile9", inputFile9);
        if (inputFile10 != null)
            formParams.add("inputFile10", inputFile10);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlQueryWithXQueryMultiResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryMultiResult>() {};
        return apiClient.invokeAPI("/convert/xml/query/xquery/multi", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Query multiple XML files using XQuery query, get results
     * Return the reuslts of querying an XML document with an XQuery expression.  Supports XQuery 3.1 and earlier.  This API is optimized for multiple XML documents as input.  You can refer to the contents of a given document by name, for example doc(\&quot;books.xml\&quot;) or doc(\&quot;restaurants.xml\&quot;) if you included two input files named books.xml and restaurants.xml.  If input files contain no file name, they will default to file names input1.xml, input2.xml and so on.
     * <p><b>200</b> - OK
     * @param xquery Valid XML XQuery 3.1 or earlier query expression; multi-line expressions are supported
     * @param inputFile1 First input XML file to perform the operation on.
     * @param inputFile2 Second input XML file to perform the operation on.
     * @param inputFile3 Third input XML file to perform the operation on.
     * @param inputFile4 Fourth input XML file to perform the operation on.
     * @param inputFile5 Fifth input XML file to perform the operation on.
     * @param inputFile6 Sixth input XML file to perform the operation on.
     * @param inputFile7 Seventh input XML file to perform the operation on.
     * @param inputFile8 Eighth input XML file to perform the operation on.
     * @param inputFile9 Ninth input XML file to perform the operation on.
     * @param inputFile10 Tenth input XML file to perform the operation on.
     * @return XmlQueryWithXQueryMultiResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlQueryWithXQueryMultiResult> convertDataXmlQueryWithXQueryMulti(String xquery, org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<XmlQueryWithXQueryMultiResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryMultiResult>() {};
        return convertDataXmlQueryWithXQueryMultiRequestCreation(xquery, inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlQueryWithXQueryMultiResult>> convertDataXmlQueryWithXQueryMultiWithHttpInfo(String xquery, org.springframework.core.io.AbstractResource inputFile1, org.springframework.core.io.AbstractResource inputFile2, org.springframework.core.io.AbstractResource inputFile3, org.springframework.core.io.AbstractResource inputFile4, org.springframework.core.io.AbstractResource inputFile5, org.springframework.core.io.AbstractResource inputFile6, org.springframework.core.io.AbstractResource inputFile7, org.springframework.core.io.AbstractResource inputFile8, org.springframework.core.io.AbstractResource inputFile9, org.springframework.core.io.AbstractResource inputFile10) throws WebClientResponseException {
        ParameterizedTypeReference<XmlQueryWithXQueryMultiResult> localVarReturnType = new ParameterizedTypeReference<XmlQueryWithXQueryMultiResult>() {};
        return convertDataXmlQueryWithXQueryMultiRequestCreation(xquery, inputFile1, inputFile2, inputFile3, inputFile4, inputFile5, inputFile6, inputFile7, inputFile8, inputFile9, inputFile10).toEntity(localVarReturnType);
    }
    /**
     * Remove, delete XML nodes and items matching XPath expression
     * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input file to perform the operation on.
     * @return XmlRemoveWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlRemoveWithXPathRequestCreation(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'xpathExpression' is set
        if (xpathExpression == null) {
            throw new WebClientResponseException("Missing the required parameter 'xpathExpression' when calling convertDataXmlRemoveWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlRemoveWithXPath", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (xpathExpression != null)
        headerParams.add("XPathExpression", apiClient.parameterToString(xpathExpression));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<XmlRemoveWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveWithXPathResult>() {};
        return apiClient.invokeAPI("/convert/xml/edit/xpath/remove", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove, delete XML nodes and items matching XPath expression
     * Return the reuslts of editing an XML document by removing all of the nodes that match an input XPath expression
     * <p><b>200</b> - OK
     * @param xpathExpression Valid XML XPath query expression
     * @param inputFile Input file to perform the operation on.
     * @return XmlRemoveWithXPathResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<XmlRemoveWithXPathResult> convertDataXmlRemoveWithXPath(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlRemoveWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveWithXPathResult>() {};
        return convertDataXmlRemoveWithXPathRequestCreation(xpathExpression, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<XmlRemoveWithXPathResult>> convertDataXmlRemoveWithXPathWithHttpInfo(String xpathExpression, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<XmlRemoveWithXPathResult> localVarReturnType = new ParameterizedTypeReference<XmlRemoveWithXPathResult>() {};
        return convertDataXmlRemoveWithXPathRequestCreation(xpathExpression, inputFile).toEntity(localVarReturnType);
    }
    /**
     * Convert XML to JSON conversion
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlToJsonRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlToJson", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/convert/xml/to/json", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Convert XML to JSON conversion
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> convertDataXmlToJson(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataXmlToJsonRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<Object>> convertDataXmlToJsonWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return convertDataXmlToJsonRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Transform XML document file with XSLT into a new XML document
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input XML file to perform the operation on.
     * @param transformFile Input XSLT file to use to transform the input XML file.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertDataXmlTransformWithXsltToXmlRequestCreation(org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource transformFile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertDataXmlTransformWithXsltToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'transformFile' is set
        if (transformFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'transformFile' when calling convertDataXmlTransformWithXsltToXml", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);
        if (transformFile != null)
            formParams.add("transformFile", transformFile);

        final String[] localVarAccepts = { 
            "application/xml"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI("/convert/xml/transform/xslt/to/xml", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Transform XML document file with XSLT into a new XML document
     * Convert an XML string or file into JSON
     * <p><b>200</b> - OK
     * @param inputFile Input XML file to perform the operation on.
     * @param transformFile Input XSLT file to use to transform the input XML file.
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertDataXmlTransformWithXsltToXml(org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource transformFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXmlTransformWithXsltToXmlRequestCreation(inputFile, transformFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertDataXmlTransformWithXsltToXmlWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, org.springframework.core.io.AbstractResource transformFile) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertDataXmlTransformWithXsltToXmlRequestCreation(inputFile, transformFile).toEntity(localVarReturnType);
    }
}
