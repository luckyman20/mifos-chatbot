/**
 * Copyright 2018 Dingfan Zhao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
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
import org.mifos.chatbot.client.model.*;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * API tests for ProvisioningCriteriaApi
 */
@Ignore
public class ProvisioningCriteriaApiTest {

    private final ProvisioningCriteriaApi api = new ProvisioningCriteriaApi();

    
    /**
     * Create a new Provisioning Criteria
     *
     * Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProvisioningCriteriaTest() throws ApiException {
        PostProvisioningCriteriaRequest body = null;
        PostProvisioningCriteriaResponse response = api.createProvisioningCriteria(body);

        // TODO: test validations
    }
    
    /**
     * Deletes Provisioning Criteria
     *
     * Deletes Provisioning Criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProvisioningCriteriaTest() throws ApiException {
        Long criteriaId = null;
        DeleteProvisioningCriteriaResponse response = api.deleteProvisioningCriteria(criteriaId);

        // TODO: test validations
    }
    
    /**
     * Retrieves all created Provisioning Criterias
     *
     * Retrieves all created Provisioning Criterias
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllProvisioningCriteriasTest() throws ApiException {
        List<GetProvisioningCriteriaResponse> response = api.retrieveAllProvisioningCriterias();

        // TODO: test validations
    }
    
    /**
     * Retrieves a Provisioning Criteria
     *
     * Retrieves a Provisioning Criteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveProvisioningCriteriaTest() throws ApiException {
        Long criteriaId = null;
        GetProvisioningCriteriaCriteriaIdResponse response = api.retrieveProvisioningCriteria(criteriaId);

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
    public void retrieveTemplateTest() throws ApiException {
        String response = api.retrieveTemplate();

        // TODO: test validations
    }
    
    /**
     * Updates a new Provisioning Criteria
     *
     * Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProvisioningCriteriaTest() throws ApiException {
        Long criteriaId = null;
        PutProvisioningCriteriaRequest body = null;
        PutProvisioningCriteriaResponse response = api.updateProvisioningCriteria(criteriaId, body);

        // TODO: test validations
    }
    
}
