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
import java.io.IOException;

/**
 * GetSelfSavingsTransactionType
 */

public class GetSelfSavingsTransactionType {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("deposit")
  private Boolean deposit = null;

  @SerializedName("withdrawal")
  private Boolean withdrawal = null;

  @SerializedName("interestPosting")
  private Boolean interestPosting = null;

  @SerializedName("feeDeduction")
  private Boolean feeDeduction = null;

  public GetSelfSavingsTransactionType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetSelfSavingsTransactionType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "savingsAccountTransactionType.withdrawal", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public GetSelfSavingsTransactionType value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "Withdrawal", value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public GetSelfSavingsTransactionType deposit(Boolean deposit) {
    this.deposit = deposit;
    return this;
  }

   /**
   * Get deposit
   * @return deposit
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isDeposit() {
    return deposit;
  }

  public void setDeposit(Boolean deposit) {
    this.deposit = deposit;
  }

  public GetSelfSavingsTransactionType withdrawal(Boolean withdrawal) {
    this.withdrawal = withdrawal;
    return this;
  }

   /**
   * Get withdrawal
   * @return withdrawal
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isWithdrawal() {
    return withdrawal;
  }

  public void setWithdrawal(Boolean withdrawal) {
    this.withdrawal = withdrawal;
  }

  public GetSelfSavingsTransactionType interestPosting(Boolean interestPosting) {
    this.interestPosting = interestPosting;
    return this;
  }

   /**
   * Get interestPosting
   * @return interestPosting
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isInterestPosting() {
    return interestPosting;
  }

  public void setInterestPosting(Boolean interestPosting) {
    this.interestPosting = interestPosting;
  }

  public GetSelfSavingsTransactionType feeDeduction(Boolean feeDeduction) {
    this.feeDeduction = feeDeduction;
    return this;
  }

   /**
   * Get feeDeduction
   * @return feeDeduction
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isFeeDeduction() {
    return feeDeduction;
  }

  public void setFeeDeduction(Boolean feeDeduction) {
    this.feeDeduction = feeDeduction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSelfSavingsTransactionType getSelfSavingsTransactionType = (GetSelfSavingsTransactionType) o;
    return Objects.equals(this.id, getSelfSavingsTransactionType.id) &&
        Objects.equals(this.code, getSelfSavingsTransactionType.code) &&
        Objects.equals(this.value, getSelfSavingsTransactionType.value) &&
        Objects.equals(this.deposit, getSelfSavingsTransactionType.deposit) &&
        Objects.equals(this.withdrawal, getSelfSavingsTransactionType.withdrawal) &&
        Objects.equals(this.interestPosting, getSelfSavingsTransactionType.interestPosting) &&
        Objects.equals(this.feeDeduction, getSelfSavingsTransactionType.feeDeduction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, value, deposit, withdrawal, interestPosting, feeDeduction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSelfSavingsTransactionType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    deposit: ").append(toIndentedString(deposit)).append("\n");
    sb.append("    withdrawal: ").append(toIndentedString(withdrawal)).append("\n");
    sb.append("    interestPosting: ").append(toIndentedString(interestPosting)).append("\n");
    sb.append("    feeDeduction: ").append(toIndentedString(feeDeduction)).append("\n");
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

