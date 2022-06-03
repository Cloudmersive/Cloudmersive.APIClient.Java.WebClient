package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.gac.model.HtmlTemplateApplicationResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:38:49.991337500-07:00[America/Los_Angeles]")
public class ConvertTemplateApi {
    private ApiClient apiClient;

    public ConvertTemplateApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertTemplateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply Word DOCX template
     * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param templateDefinition Template definition for the document, including what values to replace
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertTemplateApplyDocxTemplateRequestCreation(org.springframework.core.io.AbstractResource inputFile, Object templateDefinition) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new WebClientResponseException("Missing the required parameter 'inputFile' when calling convertTemplateApplyDocxTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (templateDefinition != null)
        headerParams.add("templateDefinition", apiClient.parameterToString(templateDefinition));
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
        return apiClient.invokeAPI("/convert/template/docx/apply", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Apply Word DOCX template
     * Apply operations to fill in a Word DOCX template by replacing target template/placeholder strings in the DOCX with values, generating a final Word DOCX result.  For example, you could create a Word Document invoice containing strings such as \&quot;{FirstName}\&quot; and \&quot;{LastName}\&quot; and then replace these values with \&quot;John\&quot; and \&quot;Smith\&quot;.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @param templateDefinition Template definition for the document, including what values to replace
     * @return byte[]
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<byte[]> convertTemplateApplyDocxTemplate(org.springframework.core.io.AbstractResource inputFile, Object templateDefinition) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertTemplateApplyDocxTemplateRequestCreation(inputFile, templateDefinition).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<byte[]>> convertTemplateApplyDocxTemplateWithHttpInfo(org.springframework.core.io.AbstractResource inputFile, Object templateDefinition) throws WebClientResponseException {
        ParameterizedTypeReference<byte[]> localVarReturnType = new ParameterizedTypeReference<byte[]>() {};
        return convertTemplateApplyDocxTemplateRequestCreation(inputFile, templateDefinition).toEntity(localVarReturnType);
    }
    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * <p><b>200</b> - OK
     * @param value Operations to apply to template
     * @return HtmlTemplateApplicationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec convertTemplateApplyHtmlTemplateRequestCreation(HtmlTemplateApplicationRequest value) throws WebClientResponseException {
        Object postBody = value;
        // verify the required parameter 'value' is set
        if (value == null) {
            throw new WebClientResponseException("Missing the required parameter 'value' when calling convertTemplateApplyHtmlTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<HtmlTemplateApplicationResponse> localVarReturnType = new ParameterizedTypeReference<HtmlTemplateApplicationResponse>() {};
        return apiClient.invokeAPI("/convert/template/html/apply", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Apply HTML template
     * Apply operations to fill in an HTML template, generating a final HTML result
     * <p><b>200</b> - OK
     * @param value Operations to apply to template
     * @return HtmlTemplateApplicationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<HtmlTemplateApplicationResponse> convertTemplateApplyHtmlTemplate(HtmlTemplateApplicationRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlTemplateApplicationResponse> localVarReturnType = new ParameterizedTypeReference<HtmlTemplateApplicationResponse>() {};
        return convertTemplateApplyHtmlTemplateRequestCreation(value).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<HtmlTemplateApplicationResponse>> convertTemplateApplyHtmlTemplateWithHttpInfo(HtmlTemplateApplicationRequest value) throws WebClientResponseException {
        ParameterizedTypeReference<HtmlTemplateApplicationResponse> localVarReturnType = new ParameterizedTypeReference<HtmlTemplateApplicationResponse>() {};
        return convertTemplateApplyHtmlTemplateRequestCreation(value).toEntity(localVarReturnType);
    }
}
