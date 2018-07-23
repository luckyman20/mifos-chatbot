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
import org.mifos.chatbot.client.model.DeleteEntityTypeEntityIdDocumentsResponse;
import java.io.File;
import org.mifos.chatbot.client.model.GetEntityTypeEntityIdDocumentsResponse;
import org.mifos.chatbot.client.model.PostEntityTypeEntityIdDocumentsResponse;
import org.mifos.chatbot.client.model.PutEntityTypeEntityIdDocumentsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Ignore
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    
    /**
     * Create a Document
     *
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDocumentTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        Long contentLength = null;
        File file = null;
        String name = null;
        String description = null;
        PostEntityTypeEntityIdDocumentsResponse response = api.createDocument(entityType, entityId, contentLength, file, name, description);

        // TODO: test validations
    }
    
    /**
     * Remove a Document
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDocumentTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        DeleteEntityTypeEntityIdDocumentsResponse response = api.deleteDocument(entityType, entityId, documentId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Binary File associated with Document
     *
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        api.downloadFile(entityType, entityId, documentId);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Document
     *
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDocumentTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        GetEntityTypeEntityIdDocumentsResponse response = api.getDocument(entityType, entityId, documentId);

        // TODO: test validations
    }
    
    /**
     * List documents
     *
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retreiveAllDocumentsTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        List<GetEntityTypeEntityIdDocumentsResponse> response = api.retreiveAllDocuments(entityType, entityId);

        // TODO: test validations
    }
    
    /**
     * Update a Document
     *
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDocumentTest() throws ApiException {
        String entityType = null;
        Long entityId = null;
        Long documentId = null;
        Long contentLength = null;
        File file = null;
        String name = null;
        String description = null;
        PutEntityTypeEntityIdDocumentsResponse response = api.updateDocument(entityType, entityId, documentId, contentLength, file, name, description);

        // TODO: test validations
    }
    
}
