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

import org.mifos.chatbot.client.model.GetGroupsPageItems;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.GetGroupsPageItems;

import java.util.ArrayList;
import java.util.List;

/**
 * GetGroupsResponse
 */

public class GetGroupsResponse {
  @SerializedName("totalFilteredRecords")
  private Integer totalFilteredRecords = null;

  @SerializedName("pageItems")
  private List<GetGroupsPageItems> pageItems = null;

  public GetGroupsResponse totalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
    return this;
  }

   /**
   * Get totalFilteredRecords
   * @return totalFilteredRecords
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getTotalFilteredRecords() {
    return totalFilteredRecords;
  }

  public void setTotalFilteredRecords(Integer totalFilteredRecords) {
    this.totalFilteredRecords = totalFilteredRecords;
  }

  public GetGroupsResponse pageItems(List<GetGroupsPageItems> pageItems) {
    this.pageItems = pageItems;
    return this;
  }

  public GetGroupsResponse addPageItemsItem(GetGroupsPageItems pageItemsItem) {
    if (this.pageItems == null) {
      this.pageItems = new ArrayList<GetGroupsPageItems>();
    }
    this.pageItems.add(pageItemsItem);
    return this;
  }

   /**
   * Get pageItems
   * @return pageItems
  **/
  @ApiModelProperty(value = "")
  public List<GetGroupsPageItems> getPageItems() {
    return pageItems;
  }

  public void setPageItems(List<GetGroupsPageItems> pageItems) {
    this.pageItems = pageItems;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsResponse getGroupsResponse = (GetGroupsResponse) o;
    return Objects.equals(this.totalFilteredRecords, getGroupsResponse.totalFilteredRecords) &&
        Objects.equals(this.pageItems, getGroupsResponse.pageItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalFilteredRecords, pageItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsResponse {\n");
    
    sb.append("    totalFilteredRecords: ").append(toIndentedString(totalFilteredRecords)).append("\n");
    sb.append("    pageItems: ").append(toIndentedString(pageItems)).append("\n");
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

