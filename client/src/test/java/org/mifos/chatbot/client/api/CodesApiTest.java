/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________          
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.chatbot.client.api;

import org.mifos.chatbot.client.ApiException;
import org.mifos.chatbot.client.model.DeleteCodesResponse;
import org.mifos.chatbot.client.model.GetCodesResponse;
import org.mifos.chatbot.client.model.PostCodesRequest;
import org.mifos.chatbot.client.model.PostCodesResponse;
import org.mifos.chatbot.client.model.PutCodesRequest;
import org.mifos.chatbot.client.model.PutCodesResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CodesApi
 */
@Ignore
public class CodesApiTest {

    private final CodesApi api = new CodesApi();

    
    /**
     * Create a Code
     *
     * Creates a code. Codes created through api are always &#39;user defined&#39; and so system defined is marked as false.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCodeTest() throws ApiException {
        PostCodesRequest body = null;
        PostCodesResponse response = api.createCode(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Code
     *
     * Deletes a code if it is not system defined.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCodeTest() throws ApiException {
        Long codeId = null;
        DeleteCodesResponse response = api.deleteCode(codeId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Code
     *
     * Returns the details of a Code.  Example Requests:  codes/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCodeTest() throws ApiException {
        Long codeId = null;
        GetCodesResponse response = api.retrieveCode(codeId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Codes
     *
     * Returns the list of codes.  Example Requests:  codes
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCodesTest() throws ApiException {
        List<GetCodesResponse> response = api.retrieveCodes();

        // TODO: test validations
    }
    
    /**
     * Update a Code
     *
     * Updates the details of a code if it is not system defined.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCodeTest() throws ApiException {
        Long codeId = null;
        PutCodesRequest body = null;
        PutCodesResponse response = api.updateCode(codeId, body);

        // TODO: test validations
    }
    
}
