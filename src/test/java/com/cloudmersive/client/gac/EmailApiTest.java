/*
 * validateapi
 * The validation APIs help you validate data. Check if an E-mail address is real. Check if a domain is real. Check up on an IP address, and even where it is located. All this and much more is available in the validation API.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cloudmersive.client.gac;

import com.cloudmersive.client.gac.model.AddressGetServersResponse;
import com.cloudmersive.client.gac.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.gac.model.FullEmailValidationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for EmailApi
 */
@Ignore
public class EmailApiTest {

    private final EmailApi api = new EmailApi();

    
    /**
     * Partially check whether an email address is valid
     *
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     */
    @Test
    public void emailAddressGetServersTest()  {
        String email = null;
        AddressGetServersResponse response = api.emailAddressGetServers(email).block();

        // TODO: test validations
    }
    
    /**
     * Fully validate an email address
     *
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     */
    @Test
    public void emailFullValidationTest()  {
        String email = null;
        FullEmailValidationResponse response = api.emailFullValidation(email).block();

        // TODO: test validations
    }
    
    /**
     * Validate email adddress for syntactic correctness only
     *
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     */
    @Test
    public void emailPostTest()  {
        String value = null;
        AddressVerifySyntaxOnlyResponse response = api.emailPost(value).block();

        // TODO: test validations
    }
    
}
