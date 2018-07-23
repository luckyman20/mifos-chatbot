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
import org.mifos.chatbot.client.model.GetLoanFundSourceAccount;
import org.mifos.chatbot.client.model.GetLoanIncomeFromFeeAccount;
import org.mifos.chatbot.client.model.GetLoanIncomeFromPenaltyAccount;
import org.mifos.chatbot.client.model.GetLoanInterestOnLoanAccount;
import org.mifos.chatbot.client.model.GetLoanOverpaymentLiabilityAccount;
import org.mifos.chatbot.client.model.GetLoanPortfolioAccount;
import org.mifos.chatbot.client.model.GetLoanTransfersInSuspenseAccount;
import org.mifos.chatbot.client.model.GetLoanWriteOffAccount;
import java.io.IOException;

/**
 * GetLoanAccountingMappings
 */

public class GetLoanAccountingMappings {
  @SerializedName("fundSourceAccount")
  private GetLoanFundSourceAccount fundSourceAccount = null;

  @SerializedName("loanPortfolioAccount")
  private GetLoanPortfolioAccount loanPortfolioAccount = null;

  @SerializedName("transfersInSuspenseAccount")
  private GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount = null;

  @SerializedName("interestOnLoanAccount")
  private GetLoanInterestOnLoanAccount interestOnLoanAccount = null;

  @SerializedName("incomeFromFeeAccount")
  private GetLoanIncomeFromFeeAccount incomeFromFeeAccount = null;

  @SerializedName("incomeFromPenaltyAccount")
  private GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount = null;

  @SerializedName("writeOffAccount")
  private GetLoanWriteOffAccount writeOffAccount = null;

  @SerializedName("overpaymentLiabilityAccount")
  private GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount = null;

  public GetLoanAccountingMappings fundSourceAccount(GetLoanFundSourceAccount fundSourceAccount) {
    this.fundSourceAccount = fundSourceAccount;
    return this;
  }

   /**
   * Get fundSourceAccount
   * @return fundSourceAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanFundSourceAccount getFundSourceAccount() {
    return fundSourceAccount;
  }

  public void setFundSourceAccount(GetLoanFundSourceAccount fundSourceAccount) {
    this.fundSourceAccount = fundSourceAccount;
  }

  public GetLoanAccountingMappings loanPortfolioAccount(GetLoanPortfolioAccount loanPortfolioAccount) {
    this.loanPortfolioAccount = loanPortfolioAccount;
    return this;
  }

   /**
   * Get loanPortfolioAccount
   * @return loanPortfolioAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanPortfolioAccount getLoanPortfolioAccount() {
    return loanPortfolioAccount;
  }

  public void setLoanPortfolioAccount(GetLoanPortfolioAccount loanPortfolioAccount) {
    this.loanPortfolioAccount = loanPortfolioAccount;
  }

  public GetLoanAccountingMappings transfersInSuspenseAccount(GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
    return this;
  }

   /**
   * Get transfersInSuspenseAccount
   * @return transfersInSuspenseAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanTransfersInSuspenseAccount getTransfersInSuspenseAccount() {
    return transfersInSuspenseAccount;
  }

  public void setTransfersInSuspenseAccount(GetLoanTransfersInSuspenseAccount transfersInSuspenseAccount) {
    this.transfersInSuspenseAccount = transfersInSuspenseAccount;
  }

  public GetLoanAccountingMappings interestOnLoanAccount(GetLoanInterestOnLoanAccount interestOnLoanAccount) {
    this.interestOnLoanAccount = interestOnLoanAccount;
    return this;
  }

   /**
   * Get interestOnLoanAccount
   * @return interestOnLoanAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanInterestOnLoanAccount getInterestOnLoanAccount() {
    return interestOnLoanAccount;
  }

  public void setInterestOnLoanAccount(GetLoanInterestOnLoanAccount interestOnLoanAccount) {
    this.interestOnLoanAccount = interestOnLoanAccount;
  }

  public GetLoanAccountingMappings incomeFromFeeAccount(GetLoanIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
    return this;
  }

   /**
   * Get incomeFromFeeAccount
   * @return incomeFromFeeAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanIncomeFromFeeAccount getIncomeFromFeeAccount() {
    return incomeFromFeeAccount;
  }

  public void setIncomeFromFeeAccount(GetLoanIncomeFromFeeAccount incomeFromFeeAccount) {
    this.incomeFromFeeAccount = incomeFromFeeAccount;
  }

  public GetLoanAccountingMappings incomeFromPenaltyAccount(GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
    return this;
  }

   /**
   * Get incomeFromPenaltyAccount
   * @return incomeFromPenaltyAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanIncomeFromPenaltyAccount getIncomeFromPenaltyAccount() {
    return incomeFromPenaltyAccount;
  }

  public void setIncomeFromPenaltyAccount(GetLoanIncomeFromPenaltyAccount incomeFromPenaltyAccount) {
    this.incomeFromPenaltyAccount = incomeFromPenaltyAccount;
  }

  public GetLoanAccountingMappings writeOffAccount(GetLoanWriteOffAccount writeOffAccount) {
    this.writeOffAccount = writeOffAccount;
    return this;
  }

   /**
   * Get writeOffAccount
   * @return writeOffAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanWriteOffAccount getWriteOffAccount() {
    return writeOffAccount;
  }

  public void setWriteOffAccount(GetLoanWriteOffAccount writeOffAccount) {
    this.writeOffAccount = writeOffAccount;
  }

  public GetLoanAccountingMappings overpaymentLiabilityAccount(GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount) {
    this.overpaymentLiabilityAccount = overpaymentLiabilityAccount;
    return this;
  }

   /**
   * Get overpaymentLiabilityAccount
   * @return overpaymentLiabilityAccount
  **/
  @ApiModelProperty(value = "")
  public GetLoanOverpaymentLiabilityAccount getOverpaymentLiabilityAccount() {
    return overpaymentLiabilityAccount;
  }

  public void setOverpaymentLiabilityAccount(GetLoanOverpaymentLiabilityAccount overpaymentLiabilityAccount) {
    this.overpaymentLiabilityAccount = overpaymentLiabilityAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetLoanAccountingMappings getLoanAccountingMappings = (GetLoanAccountingMappings) o;
    return Objects.equals(this.fundSourceAccount, getLoanAccountingMappings.fundSourceAccount) &&
        Objects.equals(this.loanPortfolioAccount, getLoanAccountingMappings.loanPortfolioAccount) &&
        Objects.equals(this.transfersInSuspenseAccount, getLoanAccountingMappings.transfersInSuspenseAccount) &&
        Objects.equals(this.interestOnLoanAccount, getLoanAccountingMappings.interestOnLoanAccount) &&
        Objects.equals(this.incomeFromFeeAccount, getLoanAccountingMappings.incomeFromFeeAccount) &&
        Objects.equals(this.incomeFromPenaltyAccount, getLoanAccountingMappings.incomeFromPenaltyAccount) &&
        Objects.equals(this.writeOffAccount, getLoanAccountingMappings.writeOffAccount) &&
        Objects.equals(this.overpaymentLiabilityAccount, getLoanAccountingMappings.overpaymentLiabilityAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fundSourceAccount, loanPortfolioAccount, transfersInSuspenseAccount, interestOnLoanAccount, incomeFromFeeAccount, incomeFromPenaltyAccount, writeOffAccount, overpaymentLiabilityAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetLoanAccountingMappings {\n");
    
    sb.append("    fundSourceAccount: ").append(toIndentedString(fundSourceAccount)).append("\n");
    sb.append("    loanPortfolioAccount: ").append(toIndentedString(loanPortfolioAccount)).append("\n");
    sb.append("    transfersInSuspenseAccount: ").append(toIndentedString(transfersInSuspenseAccount)).append("\n");
    sb.append("    interestOnLoanAccount: ").append(toIndentedString(interestOnLoanAccount)).append("\n");
    sb.append("    incomeFromFeeAccount: ").append(toIndentedString(incomeFromFeeAccount)).append("\n");
    sb.append("    incomeFromPenaltyAccount: ").append(toIndentedString(incomeFromPenaltyAccount)).append("\n");
    sb.append("    writeOffAccount: ").append(toIndentedString(writeOffAccount)).append("\n");
    sb.append("    overpaymentLiabilityAccount: ").append(toIndentedString(overpaymentLiabilityAccount)).append("\n");
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

