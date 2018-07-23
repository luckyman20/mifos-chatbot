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
import org.mifos.chatbot.client.model.GetJobsJobIDJobRunHistoryResponse;
import org.mifos.chatbot.client.model.GetJobsResponse;
import org.mifos.chatbot.client.model.PutJobsJobsIDRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MifosxBatchJobsApi
 */
@Ignore
public class MifosxBatchJobsApiTest {

    private final MifosxBatchJobsApi api = new MifosxBatchJobsApi();

    
    /**
     * Run a Job
     *
     * Manually Execute Specific Job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void executeJobTest() throws ApiException {
        Long jobId = null;
        String command = null;
        api.executeJob(jobId, command);

        // TODO: test validations
    }
    
    /**
     * Retrieve Scheduler Jobs
     *
     * Returns the list of jobs.  Example Requests:  jobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllTest() throws ApiException {
        List<GetJobsResponse> response = api.retrieveAll();

        // TODO: test validations
    }
    
    /**
     * Retrieve Job Run History
     *
     * Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveHistoryTest() throws ApiException {
        Long jobId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        GetJobsJobIDJobRunHistoryResponse response = api.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Job
     *
     * Returns the details of a Job.  Example Requests:  jobs/5
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveOneTest() throws ApiException {
        Long jobId = null;
        GetJobsResponse response = api.retrieveOne(jobId);

        // TODO: test validations
    }
    
    /**
     * Update a Job
     *
     * Updates the details of a job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobDetailTest() throws ApiException {
        Long jobId = null;
        PutJobsJobsIDRequest body = null;
        api.updateJobDetail(jobId, body);

        // TODO: test validations
    }
    
}
