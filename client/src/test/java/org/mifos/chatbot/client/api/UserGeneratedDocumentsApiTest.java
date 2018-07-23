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
import org.mifos.chatbot.client.model.DeleteTemplatesTemplateIdResponse;
import org.mifos.chatbot.client.model.GetTemplatesResponse;
import org.mifos.chatbot.client.model.GetTemplatesTemplateIdResponse;
import org.mifos.chatbot.client.model.GetTemplatesTemplateResponse;
import org.mifos.chatbot.client.model.PostTemplatesRequest;
import org.mifos.chatbot.client.model.PostTemplatesResponse;
import org.mifos.chatbot.client.model.PutTemplatesTemplateIdRequest;
import org.mifos.chatbot.client.model.PutTemplatesTemplateIdResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserGeneratedDocumentsApi
 */
@Ignore
public class UserGeneratedDocumentsApiTest {

    private final UserGeneratedDocumentsApi api = new UserGeneratedDocumentsApi();

    
    /**
     * Add a UGD
     *
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTemplateTest() throws ApiException {
        PostTemplatesRequest body = null;
        PostTemplatesResponse response = api.createTemplate(body);

        // TODO: test validations
    }
    
    /**
     * Delete a UGD
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTemplateTest() throws ApiException {
        Long templateId = null;
        DeleteTemplatesTemplateIdResponse response = api.deleteTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTemplateByTemplateTest() throws ApiException {
        Long templateId = null;
        String response = api.getTemplateByTemplate(templateId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mergeTemplateTest() throws ApiException {
        Long templateId = null;
        String body = null;
        String response = api.mergeTemplate(templateId, body);

        // TODO: test validations
    }
    
    /**
     * Retrieve all UGDs
     *
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        Integer typeId = null;
        Integer entityId = null;
        GetTemplatesResponse response = api.retrieveAll(typeId, entityId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a UGD
     *
     * Example Requests:  templates/1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long templateId = null;
        GetTemplatesTemplateIdResponse response = api.retrieveOne(templateId);

        // TODO: test validations
    }
    
    /**
     * Update a UGD
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void saveTemplateTest() throws ApiException {
        Long templateId = null;
        PutTemplatesTemplateIdRequest body = null;
        PutTemplatesTemplateIdResponse response = api.saveTemplate(templateId, body);

        // TODO: test validations
    }
    
    /**
     * Retrieve UGD Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void templateTest() throws ApiException {
        GetTemplatesTemplateResponse response = api.template();

        // TODO: test validations
    }
    
}
