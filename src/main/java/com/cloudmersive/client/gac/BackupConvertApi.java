package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.gac.model.MssqlBakEnumerateTablesResult;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-02T23:39:06.977413200-07:00[America/Los_Angeles]")
public class BackupConvertApi {
    private ApiClient apiClient;

    public BackupConvertApi() {
        this(new ApiClient());
    }

    @Autowired
    public BackupConvertApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * <p><b>200</b> - Success
     * @param inputFile Input file to perform the operation on
     * @return MssqlBakEnumerateTablesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataintegrationBackupConvertMssqlBakGetTablesPostRequestCreation(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/plain", "application/json", "text/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<MssqlBakEnumerateTablesResult> localVarReturnType = new ParameterizedTypeReference<MssqlBakEnumerateTablesResult>() {};
        return apiClient.invokeAPI("/dataintegration/backup/convert/mssql/bak/get/tables", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     * 
     * <p><b>200</b> - Success
     * @param inputFile Input file to perform the operation on
     * @return MssqlBakEnumerateTablesResult
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MssqlBakEnumerateTablesResult> dataintegrationBackupConvertMssqlBakGetTablesPost(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MssqlBakEnumerateTablesResult> localVarReturnType = new ParameterizedTypeReference<MssqlBakEnumerateTablesResult>() {};
        return dataintegrationBackupConvertMssqlBakGetTablesPostRequestCreation(inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<MssqlBakEnumerateTablesResult>> dataintegrationBackupConvertMssqlBakGetTablesPostWithHttpInfo(org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<MssqlBakEnumerateTablesResult> localVarReturnType = new ParameterizedTypeReference<MssqlBakEnumerateTablesResult>() {};
        return dataintegrationBackupConvertMssqlBakGetTablesPostRequestCreation(inputFile).toEntity(localVarReturnType);
    }
    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * <p><b>200</b>
     * @param tableName Name of the table to return
     * @param inputFile Input file to perform the operation on
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataintegrationBackupConvertMssqlBakToCsvPostRequestCreation(String tableName, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tableName != null)
        headerParams.add("tableName", apiClient.parameterToString(tableName));
        if (inputFile != null)
            formParams.add("inputFile", inputFile);

        final String[] localVarAccepts = { 
            "text/csv"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Apikey" };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/dataintegration/backup/convert/mssql/bak/to/csv", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     * <p><b>200</b>
     * @param tableName Name of the table to return
     * @param inputFile Input file to perform the operation on
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<File> dataintegrationBackupConvertMssqlBakToCsvPost(String tableName, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return dataintegrationBackupConvertMssqlBakToCsvPostRequestCreation(tableName, inputFile).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<File>> dataintegrationBackupConvertMssqlBakToCsvPostWithHttpInfo(String tableName, org.springframework.core.io.AbstractResource inputFile) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return dataintegrationBackupConvertMssqlBakToCsvPostRequestCreation(tableName, inputFile).toEntity(localVarReturnType);
    }
}
