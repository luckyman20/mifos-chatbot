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
 * GetAccountsTypePurchasedShares
 */

public class GetAccountsTypePurchasedShares {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("purchasedDate")
  private String purchasedDate = null;

  @SerializedName("numberOfShares")
  private Integer numberOfShares = null;

  @SerializedName("purchasedPrice")
  private Integer purchasedPrice = null;

  public GetAccountsTypePurchasedShares id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetAccountsTypePurchasedShares purchasedDate(String purchasedDate) {
    this.purchasedDate = purchasedDate;
    return this;
  }

   /**
   * Get purchasedDate
   * @return purchasedDate
  **/
  @ApiModelProperty(example = "01 May 2013", value = "")
  public String getPurchasedDate() {
    return purchasedDate;
  }

  public void setPurchasedDate(String purchasedDate) {
    this.purchasedDate = purchasedDate;
  }

  public GetAccountsTypePurchasedShares numberOfShares(Integer numberOfShares) {
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

  public GetAccountsTypePurchasedShares purchasedPrice(Integer purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
    return this;
  }

   /**
   * Get purchasedPrice
   * @return purchasedPrice
  **/
  @ApiModelProperty(example = "5", value = "")
  public Integer getPurchasedPrice() {
    return purchasedPrice;
  }

  public void setPurchasedPrice(Integer purchasedPrice) {
    this.purchasedPrice = purchasedPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsTypePurchasedShares getAccountsTypePurchasedShares = (GetAccountsTypePurchasedShares) o;
    return Objects.equals(this.id, getAccountsTypePurchasedShares.id) &&
        Objects.equals(this.purchasedDate, getAccountsTypePurchasedShares.purchasedDate) &&
        Objects.equals(this.numberOfShares, getAccountsTypePurchasedShares.numberOfShares) &&
        Objects.equals(this.purchasedPrice, getAccountsTypePurchasedShares.purchasedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, purchasedDate, numberOfShares, purchasedPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsTypePurchasedShares {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    purchasedDate: ").append(toIndentedString(purchasedDate)).append("\n");
    sb.append("    numberOfShares: ").append(toIndentedString(numberOfShares)).append("\n");
    sb.append("    purchasedPrice: ").append(toIndentedString(purchasedPrice)).append("\n");
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

