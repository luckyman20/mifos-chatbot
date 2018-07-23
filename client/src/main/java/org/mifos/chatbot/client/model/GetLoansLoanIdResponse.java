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


package org.mifos.chatbot.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetLoansLoanIdAmortizationType;
import org.mifos.chatbot.client.model.GetLoansLoanIdCurrency;
import org.mifos.chatbot.client.model.GetLoansLoanIdInterestCalculationPeriodType;
import org.mifos.chatbot.client.model.GetLoansLoanIdInterestRateFrequencyType;
import org.mifos.chatbot.client.model.GetLoansLoanIdInterestType;
import org.mifos.chatbot.client.model.GetLoansLoanIdLoanType;
import org.mifos.chatbot.client.model.GetLoansLoanIdRepaymentFrequencyType;
import org.mifos.chatbot.client.model.GetLoansLoanIdStatus;
import org.mifos.chatbot.client.model.GetLoansLoanIdSummary;
import org.mifos.chatbot.client.model.GetLoansLoanIdTermPeriodFrequencyType;
import org.mifos.chatbot.client.model.GetLoansLoanIdTimeline;
import java.io.IOException;

/**
 * GetLoansLoanIdResponse
 */

public class GetLoansLoanIdResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("accountNo")
  private Long accountNo = null;

  @SerializedName("status")
  private GetLoansLoanIdStatus status = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("clientName")
  private String clientName = null;

  @SerializedName("clientOfficeId")
  private Integer clientOfficeId = null;

  @SerializedName("loanProductId")
  private Integer loanProductId = null;

  @SerializedName("loanProductName")
  private String loanProductName = null;

  @SerializedName("loanProductDescription")
  private String loanProductDescription = null;

  @SerializedName("loanPurposeId")
  private Integer loanPurposeId = null;

  @SerializedName("loanPurposeName")
  private String loanPurposeName = null;

  @SerializedName("loanOfficerId")
  private Integer loanOfficerId = null;

  @SerializedName("loanOfficerName")
  private String loanOfficerName = null;

  @SerializedName("loanType")
  private GetLoansLoanIdLoanType loanType = null;

  @SerializedName("currency")
  private GetLoansLoanIdCurrency currency = null;

  @SerializedName("principal")
  private Long principal = null;

  @SerializedName("termFrequency")
  private Integer termFrequency = null;

  @SerializedName("termPeriodFrequencyType")
  private GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType = null;

  @SerializedName("numberOfRepayments")
  private Integer numberOfRepayments = null;

  @SerializedName("repaymentEvery")
  private Integer repaymentEvery = null;

  @SerializedName("repaymentFrequencyType")
  private GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType = null;

  @SerializedName("interestRatePerPeriod")
  private Integer interestRatePerPeriod = null;

  @SerializedName("interestRateFrequencyType")
  private GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType = null;

  @SerializedName("annualInterestRate")
  private Integer annualInterestRate = null;

  @SerializedName("amortizationType")
  private GetLoansLoanIdAmortizationType amortizationType = null;

  @SerializedName("interestType")
  private GetLoansLoanIdInterestType interestType = null;

  @SerializedName("interestCalculationPeriodType")
  private GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType = null;

  @SerializedName("transactionProcessingStrategyId")
  private Integer transactionProcessingStrategyId = null;

  @SerializedName("timeline")
  private GetLoansLoanIdTimeline timeline = null;

  @SerializedName("summary")
  private GetLoansLoanIdSummary summary = null;

  public GetLoansLoanIdResponse id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetLoansLoanIdResponse accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public GetLoansLoanIdResponse status(GetLoansLoanIdStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdStatus getStatus() {
    return status;
  }

  public void setStatus(GetLoansLoanIdStatus status) {
    this.status = status;
  }

  public GetLoansLoanIdResponse clientId(Integer clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getClientId() {
    return clientId;
  }

  public void setClientId(Integer clientId) {
    this.clientId = clientId;
  }

  public GetLoansLoanIdResponse clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

   /**
   * Get clientName
   * @return clientName
  **/
  @ApiModelProperty(example = "Kampala first Client", value = "")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public GetLoansLoanIdResponse clientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
    return this;
  }

   /**
   * Get clientOfficeId
   * @return clientOfficeId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getClientOfficeId() {
    return clientOfficeId;
  }

  public void setClientOfficeId(Integer clientOfficeId) {
    this.clientOfficeId = clientOfficeId;
  }

  public GetLoansLoanIdResponse loanProductId(Integer loanProductId) {
    this.loanProductId = loanProductId;
    return this;
  }

   /**
   * Get loanProductId
   * @return loanProductId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getLoanProductId() {
    return loanProductId;
  }

  public void setLoanProductId(Integer loanProductId) {
    this.loanProductId = loanProductId;
  }

  public GetLoansLoanIdResponse loanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
    return this;
  }

   /**
   * Get loanProductName
   * @return loanProductName
  **/
  @ApiModelProperty(example = "Kampala Product (with cash accounting)", value = "")
  public String getLoanProductName() {
    return loanProductName;
  }

  public void setLoanProductName(String loanProductName) {
    this.loanProductName = loanProductName;
  }

  public GetLoansLoanIdResponse loanProductDescription(String loanProductDescription) {
    this.loanProductDescription = loanProductDescription;
    return this;
  }

   /**
   * Get loanProductDescription
   * @return loanProductDescription
  **/
  @ApiModelProperty(example = "Typical Kampala loan product with cash accounting enabled for testing.", value = "")
  public String getLoanProductDescription() {
    return loanProductDescription;
  }

  public void setLoanProductDescription(String loanProductDescription) {
    this.loanProductDescription = loanProductDescription;
  }

  public GetLoansLoanIdResponse loanPurposeId(Integer loanPurposeId) {
    this.loanPurposeId = loanPurposeId;
    return this;
  }

   /**
   * Get loanPurposeId
   * @return loanPurposeId
  **/
  @ApiModelProperty(example = "22", value = "")
  public Integer getLoanPurposeId() {
    return loanPurposeId;
  }

  public void setLoanPurposeId(Integer loanPurposeId) {
    this.loanPurposeId = loanPurposeId;
  }

  public GetLoansLoanIdResponse loanPurposeName(String loanPurposeName) {
    this.loanPurposeName = loanPurposeName;
    return this;
  }

   /**
   * Get loanPurposeName
   * @return loanPurposeName
  **/
  @ApiModelProperty(example = "option.HousingImprovement", value = "")
  public String getLoanPurposeName() {
    return loanPurposeName;
  }

  public void setLoanPurposeName(String loanPurposeName) {
    this.loanPurposeName = loanPurposeName;
  }

  public GetLoansLoanIdResponse loanOfficerId(Integer loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
    return this;
  }

   /**
   * Get loanOfficerId
   * @return loanOfficerId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getLoanOfficerId() {
    return loanOfficerId;
  }

  public void setLoanOfficerId(Integer loanOfficerId) {
    this.loanOfficerId = loanOfficerId;
  }

  public GetLoansLoanIdResponse loanOfficerName(String loanOfficerName) {
    this.loanOfficerName = loanOfficerName;
    return this;
  }

   /**
   * Get loanOfficerName
   * @return loanOfficerName
  **/
  @ApiModelProperty(example = "LoanOfficer, Kampala", value = "")
  public String getLoanOfficerName() {
    return loanOfficerName;
  }

  public void setLoanOfficerName(String loanOfficerName) {
    this.loanOfficerName = loanOfficerName;
  }

  public GetLoansLoanIdResponse loanType(GetLoansLoanIdLoanType loanType) {
    this.loanType = loanType;
    return this;
  }

   /**
   * Get loanType
   * @return loanType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdLoanType getLoanType() {
    return loanType;
  }

  public void setLoanType(GetLoansLoanIdLoanType loanType) {
    this.loanType = loanType;
  }

  public GetLoansLoanIdResponse currency(GetLoansLoanIdCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(GetLoansLoanIdCurrency currency) {
    this.currency = currency;
  }

  public GetLoansLoanIdResponse principal(Long principal) {
    this.principal = principal;
    return this;
  }

   /**
   * Get principal
   * @return principal
  **/
  @ApiModelProperty(example = "1000000", value = "")
  public Long getPrincipal() {
    return principal;
  }

  public void setPrincipal(Long principal) {
    this.principal = principal;
  }

  public GetLoansLoanIdResponse termFrequency(Integer termFrequency) {
    this.termFrequency = termFrequency;
    return this;
  }

   /**
   * Get termFrequency
   * @return termFrequency
  **/
  @ApiModelProperty(example = "12", value = "")
  public Integer getTermFrequency() {
    return termFrequency;
  }

  public void setTermFrequency(Integer termFrequency) {
    this.termFrequency = termFrequency;
  }

  public GetLoansLoanIdResponse termPeriodFrequencyType(GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType) {
    this.termPeriodFrequencyType = termPeriodFrequencyType;
    return this;
  }

   /**
   * Get termPeriodFrequencyType
   * @return termPeriodFrequencyType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdTermPeriodFrequencyType getTermPeriodFrequencyType() {
    return termPeriodFrequencyType;
  }

  public void setTermPeriodFrequencyType(GetLoansLoanIdTermPeriodFrequencyType termPeriodFrequencyType) {
    this.termPeriodFrequencyType = termPeriodFrequencyType;
  }

  public GetLoansLoanIdResponse numberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
    return this;
  }

   /**
   * Get numberOfRepayments
   * @return numberOfRepayments
  **/
  @ApiModelProperty(example = "12", value = "")
  public Integer getNumberOfRepayments() {
    return numberOfRepayments;
  }

  public void setNumberOfRepayments(Integer numberOfRepayments) {
    this.numberOfRepayments = numberOfRepayments;
  }

  public GetLoansLoanIdResponse repaymentEvery(Integer repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
    return this;
  }

   /**
   * Get repaymentEvery
   * @return repaymentEvery
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getRepaymentEvery() {
    return repaymentEvery;
  }

  public void setRepaymentEvery(Integer repaymentEvery) {
    this.repaymentEvery = repaymentEvery;
  }

  public GetLoansLoanIdResponse repaymentFrequencyType(GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
    return this;
  }

   /**
   * Get repaymentFrequencyType
   * @return repaymentFrequencyType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdRepaymentFrequencyType getRepaymentFrequencyType() {
    return repaymentFrequencyType;
  }

  public void setRepaymentFrequencyType(GetLoansLoanIdRepaymentFrequencyType repaymentFrequencyType) {
    this.repaymentFrequencyType = repaymentFrequencyType;
  }

  public GetLoansLoanIdResponse interestRatePerPeriod(Integer interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
    return this;
  }

   /**
   * Get interestRatePerPeriod
   * @return interestRatePerPeriod
  **/
  @ApiModelProperty(example = "24", value = "")
  public Integer getInterestRatePerPeriod() {
    return interestRatePerPeriod;
  }

  public void setInterestRatePerPeriod(Integer interestRatePerPeriod) {
    this.interestRatePerPeriod = interestRatePerPeriod;
  }

  public GetLoansLoanIdResponse interestRateFrequencyType(GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType) {
    this.interestRateFrequencyType = interestRateFrequencyType;
    return this;
  }

   /**
   * Get interestRateFrequencyType
   * @return interestRateFrequencyType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdInterestRateFrequencyType getInterestRateFrequencyType() {
    return interestRateFrequencyType;
  }

  public void setInterestRateFrequencyType(GetLoansLoanIdInterestRateFrequencyType interestRateFrequencyType) {
    this.interestRateFrequencyType = interestRateFrequencyType;
  }

  public GetLoansLoanIdResponse annualInterestRate(Integer annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    return this;
  }

   /**
   * Get annualInterestRate
   * @return annualInterestRate
  **/
  @ApiModelProperty(example = "24", value = "")
  public Integer getAnnualInterestRate() {
    return annualInterestRate;
  }

  public void setAnnualInterestRate(Integer annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
  }

  public GetLoansLoanIdResponse amortizationType(GetLoansLoanIdAmortizationType amortizationType) {
    this.amortizationType = amortizationType;
    return this;
  }

   /**
   * Get amortizationType
   * @return amortizationType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdAmortizationType getAmortizationType() {
    return amortizationType;
  }

  public void setAmortizationType(GetLoansLoanIdAmortizationType amortizationType) {
    this.amortizationType = amortizationType;
  }

  public GetLoansLoanIdResponse interestType(GetLoansLoanIdInterestType interestType) {
    this.interestType = interestType;
    return this;
  }

   /**
   * Get interestType
   * @return interestType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdInterestType getInterestType() {
    return interestType;
  }

  public void setInterestType(GetLoansLoanIdInterestType interestType) {
    this.interestType = interestType;
  }

  public GetLoansLoanIdResponse interestCalculationPeriodType(GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
    return this;
  }

   /**
   * Get interestCalculationPeriodType
   * @return interestCalculationPeriodType
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdInterestCalculationPeriodType getInterestCalculationPeriodType() {
    return interestCalculationPeriodType;
  }

  public void setInterestCalculationPeriodType(GetLoansLoanIdInterestCalculationPeriodType interestCalculationPeriodType) {
    this.interestCalculationPeriodType = interestCalculationPeriodType;
  }

  public GetLoansLoanIdResponse transactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
    return this;
  }

   /**
   * Get transactionProcessingStrategyId
   * @return transactionProcessingStrategyId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getTransactionProcessingStrategyId() {
    return transactionProcessingStrategyId;
  }

  public void setTransactionProcessingStrategyId(Integer transactionProcessingStrategyId) {
    this.transactionProcessingStrategyId = transactionProcessingStrategyId;
  }

  public GetLoansLoanIdResponse timeline(GetLoansLoanIdTimeline timeline) {
    this.timeline = timeline;
    return this;
  }

   /**
   * Get timeline
   * @return timeline
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdTimeline getTimeline() {
    return timeline;
  }

  public void setTimeline(GetLoansLoanIdTimeline timeline) {
    this.timeline = timeline;
  }

  public GetLoansLoanIdResponse summary(GetLoansLoanIdSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(value = "")
  public GetLoansLoanIdSummary getSummary() {
    return summary;
  }

  public void setSummary(GetLoansLoanIdSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoansLoanIdResponse getLoansLoanIdResponse = (GetLoansLoanIdResponse) o;
    return Objects.equals(this.id, getLoansLoanIdResponse.id) &&
        Objects.equals(this.accountNo, getLoansLoanIdResponse.accountNo) &&
        Objects.equals(this.status, getLoansLoanIdResponse.status) &&
        Objects.equals(this.clientId, getLoansLoanIdResponse.clientId) &&
        Objects.equals(this.clientName, getLoansLoanIdResponse.clientName) &&
        Objects.equals(this.clientOfficeId, getLoansLoanIdResponse.clientOfficeId) &&
        Objects.equals(this.loanProductId, getLoansLoanIdResponse.loanProductId) &&
        Objects.equals(this.loanProductName, getLoansLoanIdResponse.loanProductName) &&
        Objects.equals(this.loanProductDescription, getLoansLoanIdResponse.loanProductDescription) &&
        Objects.equals(this.loanPurposeId, getLoansLoanIdResponse.loanPurposeId) &&
        Objects.equals(this.loanPurposeName, getLoansLoanIdResponse.loanPurposeName) &&
        Objects.equals(this.loanOfficerId, getLoansLoanIdResponse.loanOfficerId) &&
        Objects.equals(this.loanOfficerName, getLoansLoanIdResponse.loanOfficerName) &&
        Objects.equals(this.loanType, getLoansLoanIdResponse.loanType) &&
        Objects.equals(this.currency, getLoansLoanIdResponse.currency) &&
        Objects.equals(this.principal, getLoansLoanIdResponse.principal) &&
        Objects.equals(this.termFrequency, getLoansLoanIdResponse.termFrequency) &&
        Objects.equals(this.termPeriodFrequencyType, getLoansLoanIdResponse.termPeriodFrequencyType) &&
        Objects.equals(this.numberOfRepayments, getLoansLoanIdResponse.numberOfRepayments) &&
        Objects.equals(this.repaymentEvery, getLoansLoanIdResponse.repaymentEvery) &&
        Objects.equals(this.repaymentFrequencyType, getLoansLoanIdResponse.repaymentFrequencyType) &&
        Objects.equals(this.interestRatePerPeriod, getLoansLoanIdResponse.interestRatePerPeriod) &&
        Objects.equals(this.interestRateFrequencyType, getLoansLoanIdResponse.interestRateFrequencyType) &&
        Objects.equals(this.annualInterestRate, getLoansLoanIdResponse.annualInterestRate) &&
        Objects.equals(this.amortizationType, getLoansLoanIdResponse.amortizationType) &&
        Objects.equals(this.interestType, getLoansLoanIdResponse.interestType) &&
        Objects.equals(this.interestCalculationPeriodType, getLoansLoanIdResponse.interestCalculationPeriodType) &&
        Objects.equals(this.transactionProcessingStrategyId, getLoansLoanIdResponse.transactionProcessingStrategyId) &&
        Objects.equals(this.timeline, getLoansLoanIdResponse.timeline) &&
        Objects.equals(this.summary, getLoansLoanIdResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountNo, status, clientId, clientName, clientOfficeId, loanProductId, loanProductName, loanProductDescription, loanPurposeId, loanPurposeName, loanOfficerId, loanOfficerName, loanType, currency, principal, termFrequency, termPeriodFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, annualInterestRate, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, timeline, summary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoansLoanIdResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    clientOfficeId: ").append(toIndentedString(clientOfficeId)).append("\n");
    sb.append("    loanProductId: ").append(toIndentedString(loanProductId)).append("\n");
    sb.append("    loanProductName: ").append(toIndentedString(loanProductName)).append("\n");
    sb.append("    loanProductDescription: ").append(toIndentedString(loanProductDescription)).append("\n");
    sb.append("    loanPurposeId: ").append(toIndentedString(loanPurposeId)).append("\n");
    sb.append("    loanPurposeName: ").append(toIndentedString(loanPurposeName)).append("\n");
    sb.append("    loanOfficerId: ").append(toIndentedString(loanOfficerId)).append("\n");
    sb.append("    loanOfficerName: ").append(toIndentedString(loanOfficerName)).append("\n");
    sb.append("    loanType: ").append(toIndentedString(loanType)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    principal: ").append(toIndentedString(principal)).append("\n");
    sb.append("    termFrequency: ").append(toIndentedString(termFrequency)).append("\n");
    sb.append("    termPeriodFrequencyType: ").append(toIndentedString(termPeriodFrequencyType)).append("\n");
    sb.append("    numberOfRepayments: ").append(toIndentedString(numberOfRepayments)).append("\n");
    sb.append("    repaymentEvery: ").append(toIndentedString(repaymentEvery)).append("\n");
    sb.append("    repaymentFrequencyType: ").append(toIndentedString(repaymentFrequencyType)).append("\n");
    sb.append("    interestRatePerPeriod: ").append(toIndentedString(interestRatePerPeriod)).append("\n");
    sb.append("    interestRateFrequencyType: ").append(toIndentedString(interestRateFrequencyType)).append("\n");
    sb.append("    annualInterestRate: ").append(toIndentedString(annualInterestRate)).append("\n");
    sb.append("    amortizationType: ").append(toIndentedString(amortizationType)).append("\n");
    sb.append("    interestType: ").append(toIndentedString(interestType)).append("\n");
    sb.append("    interestCalculationPeriodType: ").append(toIndentedString(interestCalculationPeriodType)).append("\n");
    sb.append("    transactionProcessingStrategyId: ").append(toIndentedString(transactionProcessingStrategyId)).append("\n");
    sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

