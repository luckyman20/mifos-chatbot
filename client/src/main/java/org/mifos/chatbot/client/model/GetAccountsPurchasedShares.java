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
import org.mifos.chatbot.client.model.GetAccountsPurchasedSharesStatus;
import org.mifos.chatbot.client.model.GetAccountsPurchasedSharesType;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * GetAccountsPurchasedShares
 */

public class GetAccountsPurchasedShares {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("accountId")
  private Integer accountId = null;

  @SerializedName("purchasedDate")
  private LocalDate purchasedDate = null;

  @SerializedName("numberOfShares")
  private Integer numberOfShares = null;

  @SerializedName("purchasedPrice")
  private Double purchasedPrice = null;

  @SerializedName("status")
  private GetAccountsPurchasedSharesStatus status = null;

  @SerializedName("type")
  private GetAccountsPurchasedSharesType type = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("chargeAmount")
  private Double chargeAmount = null;

  @SerializedName("amountPaid")
  private Double amountPaid = null;

  public GetAccountsPurchasedShares id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetAccountsPurchasedShares accountId(Integer accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getAccountId() {
    return accountId;
  }

  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }

  public GetAccountsPurchasedShares purchasedDate(LocalDate purchasedDate) {
    this.purchasedDate = purchasedDate;
    return this;
  }

   /**
   * Get purchasedDate
   * @return purchasedDate
  **/
  @ApiModelProperty(example = "[2016, 4, 1]", value = "")
  public LocalDate getPurchasedDate() {
    return purchasedDate;
  }

  public void setPurchasedDate(LocalDate purchasedDate) {
    this.purchasedDate = purchasedDate;
  }

  public GetAccountsPurchasedShares numberOfShares(Integer numberOfShares) {
    this.numberOfShares = numberOfShares;
    return this;
  }

   /**
   * Get numberOfShares
   * @return numberOfShares
  **/
  @ApiModelProperty(example = "10", value = "")
  public Integer getNumberOfShares() {
    return numberOfShares;
  }

  public void setNumberOfShares(Integer numberOfShares) {
    this.numberOfShares = numberOfShares;
  }

  public GetAccountsPurchasedShares purchasedPrice(Double purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
    return this;
  }

   /**
   * Get purchasedPrice
   * @return purchasedPrice
  **/
  @ApiModelProperty(example = "0.5", value = "")
  public Double getPurchasedPrice() {
    return purchasedPrice;
  }

  public void setPurchasedPrice(Double purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
  }

  public GetAccountsPurchasedShares status(GetAccountsPurchasedSharesStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public GetAccountsPurchasedSharesStatus getStatus() {
    return status;
  }

  public void setStatus(GetAccountsPurchasedSharesStatus status) {
    this.status = status;
  }

  public GetAccountsPurchasedShares type(GetAccountsPurchasedSharesType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public GetAccountsPurchasedSharesType getType() {
    return type;
  }

  public void setType(GetAccountsPurchasedSharesType type) {
    this.type = type;
  }

  public GetAccountsPurchasedShares amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "5.05", value = "")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public GetAccountsPurchasedShares chargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(example = "0.05", value = "")
  public Double getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public GetAccountsPurchasedShares amountPaid(Double amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(example = "5.05", value = "")
  public Double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Double amountPaid) {
    this.amountPaid = amountPaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsPurchasedShares getAccountsPurchasedShares = (GetAccountsPurchasedShares) o;
    return Objects.equals(this.id, getAccountsPurchasedShares.id) &&
        Objects.equals(this.accountId, getAccountsPurchasedShares.accountId) &&
        Objects.equals(this.purchasedDate, getAccountsPurchasedShares.purchasedDate) &&
        Objects.equals(this.numberOfShares, getAccountsPurchasedShares.numberOfShares) &&
        Objects.equals(this.purchasedPrice, getAccountsPurchasedShares.purchasedPrice) &&
        Objects.equals(this.status, getAccountsPurchasedShares.status) &&
        Objects.equals(this.type, getAccountsPurchasedShares.type) &&
        Objects.equals(this.amount, getAccountsPurchasedShares.amount) &&
        Objects.equals(this.chargeAmount, getAccountsPurchasedShares.chargeAmount) &&
        Objects.equals(this.amountPaid, getAccountsPurchasedShares.amountPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, accountId, purchasedDate, numberOfShares, purchasedPrice, status, type, amount, chargeAmount, amountPaid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsPurchasedShares {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    purchasedDate: ").append(toIndentedString(purchasedDate)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    purchasedPrice: ").append(toIndentedString(purchasedPrice)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
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

