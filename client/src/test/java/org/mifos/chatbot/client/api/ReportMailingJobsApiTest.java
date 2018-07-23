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
import org.mifos.chatbot.client.model.DeleteReportMailingJobsRequest;
import org.mifos.chatbot.client.model.DeleteReportMailingJobsResponse;
import org.mifos.chatbot.client.model.GetReportMailingJobsResponse;
import org.mifos.chatbot.client.model.GetReportMailingJobsTemplate;
import org.mifos.chatbot.client.model.PostReportMailingJobsRequest;
import org.mifos.chatbot.client.model.PostReportMailingJobsResponse;
import org.mifos.chatbot.client.model.PutReportMailingJobsRequest;
import org.mifos.chatbot.client.model.PutReportMailingJobsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportMailingJobsApi
 */
@Ignore
public class ReportMailingJobsApiTest {

    private final ReportMailingJobsApi api = new ReportMailingJobsApi();

    
    /**
     * Create a Report Mailing Job
     *
     * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createReportMailingJobTest() throws ApiException {
        PostReportMailingJobsRequest body = null;
        PostReportMailingJobsResponse response = api.createReportMailingJob(body);

        // TODO: test validations
    }
    
    /**
     * Delete a Report Mailing Job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteReportMailingJobTest() throws ApiException {
        Long entityId = null;
        DeleteReportMailingJobsRequest body = null;
        DeleteReportMailingJobsResponse response = api.deleteReportMailingJob(entityId, body);

        // TODO: test validations
    }
    
    /**
     * List Report Mailing Jobs
     *
     * Example Requests:  reportmailingjobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllReportMailingJobsTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        List<GetReportMailingJobsResponse> response = api.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Report Mailing Job
     *
     * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveReportMailingJobTest() throws ApiException {
        Long entityId = null;
        GetReportMailingJobsResponse response = api.retrieveReportMailingJob(entityId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Report Mailing Job Details Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  reportmailingjobs/template
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveReportMailingJobTemplateTest() throws ApiException {
        GetReportMailingJobsTemplate response = api.retrieveReportMailingJobTemplate();

        // TODO: test validations
    }
    
    /**
     * Update a Report Mailing Job 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateReportMailingJobTest() throws ApiException {
        Long entityId = null;
        PutReportMailingJobsRequest body = null;
        PutReportMailingJobsResponse response = api.updateReportMailingJob(entityId, body);

        // TODO: test validations
    }
    
}