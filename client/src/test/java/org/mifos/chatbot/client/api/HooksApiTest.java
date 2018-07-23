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
import org.mifos.chatbot.client.model.DeleteHookResponse;
import org.mifos.chatbot.client.model.GetHookResponse;
import org.mifos.chatbot.client.model.GetHookTemplateResponse;
import org.mifos.chatbot.client.model.PostHookRequest;
import org.mifos.chatbot.client.model.PostHookResponse;
import org.mifos.chatbot.client.model.PutHookRequest;
import org.mifos.chatbot.client.model.PutHookResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HooksApi
 */
@Ignore
public class HooksApiTest {

    private final HooksApi api = new HooksApi();

    
    /**
     * Create a Hook
     *
     * The following parameters can be passed for the creation of a hook :-  name - string - Required. The name of the template that is being called. (See /hooks/template for the list of valid hook names.)  isActive - boolean - Determines whether the hook is actually triggered.  events - array - Determines what events the hook is triggered for.  config - hash - Required. Key/value pairs to provide settings for this hook. These settings vary between the templates.  templateId - Optional. The UGD template ID associated with the same entity (client or loan).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHookTest() throws ApiException {
        PostHookRequest body = null;
        PostHookResponse response = api.createHook(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Hook
     *
     * Deletes a hook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHookTest() throws ApiException {
        Long hookId = null;
        DeleteHookResponse response = api.deleteHook(hookId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Hook
     *
     * Returns the details of a Hook.  Example Requests:  hooks/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveHookTest() throws ApiException {
        Long hookId = null;
        GetHookResponse response = api.retrieveHook(hookId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Hooks
     *
     * Returns the list of hooks.  Example Requests:  hooks
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveHooksTest() throws ApiException {
        List<GetHookResponse> response = api.retrieveHooks();

        // TODO: test validations
    }
    
    /**
     * Retrieve Hooks Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  hooks/template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        GetHookTemplateResponse response = api.template();

        // TODO: test validations
    }
    
    /**
     * Update a Hook
     *
     * Updates the details of a hook.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHookTest() throws ApiException {
        Long hookId = null;
        PutHookRequest body = null;
        PutHookResponse response = api.updateHook(hookId, body);

        // TODO: test validations
    }
    
}
