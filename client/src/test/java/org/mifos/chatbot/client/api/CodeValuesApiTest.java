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
import org.mifos.chatbot.client.model.DeleteCodeValueDataResponse;
import org.mifos.chatbot.client.model.GetCodeValuesDataResponse;
import org.mifos.chatbot.client.model.PostCodeValueDataResponse;
import org.mifos.chatbot.client.model.PostCodeValuesDataRequest;
import org.mifos.chatbot.client.model.PutCodeValueDataResponse;
import org.mifos.chatbot.client.model.PutCodeValuesDataRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CodeValuesApi
 */
@Ignore
public class CodeValuesApiTest {

    private final CodeValuesApi api = new CodeValuesApi();

    
    /**
     * Create a Code Value
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCodeValueTest() throws ApiException {
        Long codeId = null;
        PostCodeValuesDataRequest body = null;
        PostCodeValueDataResponse response = api.createCodeValue(codeId, body);

        // TODO: test validations
    }
    
    /**
     * Delete a Code Value
     *
     * Deletes a code value
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCodeValueTest() throws ApiException {
        Long codeId = null;
        Long codeValueId = null;
        DeleteCodeValueDataResponse response = api.deleteCodeValue(codeId, codeValueId);

        // TODO: test validations
    }
    
    /**
     * List Code Values
     *
     * Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllCodeValuesTest() throws ApiException {
        Long codeId = null;
        List<GetCodeValuesDataResponse> response = api.retrieveAllCodeValues(codeId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Code Value
     *
     * Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveCodeValueTest() throws ApiException {
        Long codeValueId = null;
        GetCodeValuesDataResponse response = api.retrieveCodeValue(codeValueId);

        // TODO: test validations
    }
    
    /**
     * Update a Code Value
     *
     * Updates the details of a code value.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCodeValueTest() throws ApiException {
        Long codeId = null;
        Long codeValueId = null;
        PutCodeValuesDataRequest body = null;
        PutCodeValueDataResponse response = api.updateCodeValue(codeId, codeValueId, body);

        // TODO: test validations
    }
    
}
