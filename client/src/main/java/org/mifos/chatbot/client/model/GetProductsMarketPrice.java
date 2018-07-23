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
 * GetProductsMarketPrice
 */

public class GetProductsMarketPrice {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("shareValue")
  private Integer shareValue = null;

  public GetProductsMarketPrice id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "4", value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetProductsMarketPrice fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(example = "Feb 1, 2016", value = "")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public GetProductsMarketPrice shareValue(Integer shareValue) {
    this.shareValue = shareValue;
    return this;
  }

   /**
   * Get shareValue
   * @return shareValue
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getShareValue() {
    return shareValue;
  }

  public void setShareValue(Integer shareValue) {
    this.shareValue = shareValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetProductsMarketPrice getProductsMarketPrice = (GetProductsMarketPrice) o;
    return Objects.equals(this.id, getProductsMarketPrice.id) &&
        Objects.equals(this.fromDate, getProductsMarketPrice.fromDate) &&
        Objects.equals(this.shareValue, getProductsMarketPrice.shareValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, shareValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProductsMarketPrice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    shareValue: ").append(toIndentedString(shareValue)).append("\n");
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

