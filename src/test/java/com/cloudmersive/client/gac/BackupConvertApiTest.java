/*
 * dataintegrationapi
 * Easily and directly query database backup files, convert into other file formats.
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
import com.cloudmersive.client.gac.model.MssqlBakEnumerateTablesResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for BackupConvertApi
 */
@Ignore
public class BackupConvertApiTest {

    private final BackupConvertApi api = new BackupConvertApi();

    
    /**
     * Lists all tables stored in a SQL Server Backup (.BAK) file
     *
     * 
     */
    @Test
    public void dataintegrationBackupConvertMssqlBakGetTablesPostTest()  {
        org.springframework.core.io.AbstractResource inputFile = null;
        MssqlBakEnumerateTablesResult response = api.dataintegrationBackupConvertMssqlBakGetTablesPost(inputFile).block();

        // TODO: test validations
    }
    
    /**
     * Converts a SQL Server Backup (.BAK) file into CSV for a specified table
     *
     * Input the target table to extract the data as a CSV format file.  Supports a wide array of SQL Server .BAK files and SQL Server backup file versions.  Consumes 1 API call per MB of input data.
     */
    @Test
    public void dataintegrationBackupConvertMssqlBakToCsvPostTest()  {
        String tableName = null;
        org.springframework.core.io.AbstractResource inputFile = null;
        File response = api.dataintegrationBackupConvertMssqlBakToCsvPost(tableName, inputFile).block();

        // TODO: test validations
    }
    
}
