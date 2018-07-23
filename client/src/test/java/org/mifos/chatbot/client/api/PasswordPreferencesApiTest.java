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
import org.mifos.chatbot.client.model.GetPasswordPreferencesTemplateResponse;
import org.mifos.chatbot.client.model.PutPasswordPreferencesTemplateRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PasswordPreferencesApi
 */
@Ignore
public class PasswordPreferencesApiTest {

    private final PasswordPreferencesApi api = new PasswordPreferencesApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveTest() throws ApiException {
        GetPasswordPreferencesTemplateResponse response = api.retrieve();

        // TODO: test validations
    }
    
    /**
     * List Application Password validation policies
     *
     * ARGUMENTS Example Requests:  passwordpreferences
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        List<GetPasswordPreferencesTemplateResponse> response = api.template();

        // TODO: test validations
    }
    
    /**
     * Update password preferences
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTest() throws ApiException {
        PutPasswordPreferencesTemplateRequest body = null;
        api.update(body);

        // TODO: test validations
    }
    
}
