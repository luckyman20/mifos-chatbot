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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.mifos.chatbot.client.model.StaffData;
import org.mifos.chatbot.client.model.StaffData;

import java.util.ArrayList;
import java.util.List;

/**
 * GetTellersTellerIdCashiersTemplateResponse
 */

public class GetTellersTellerIdCashiersTemplateResponse {
  @SerializedName("tellerId")
  private Long tellerId = null;

  @SerializedName("tellerName")
  private String tellerName = null;

  @SerializedName("officeId")
  private Long officeId = null;

  @SerializedName("officeName")
  private String officeName = null;

  @SerializedName("staffOptions")
  private List<StaffData> staffOptions = null;

  public GetTellersTellerIdCashiersTemplateResponse tellerId(Long tellerId) {
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getTellerId() {
    return tellerId;
  }

  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }

  public GetTellersTellerIdCashiersTemplateResponse tellerName(String tellerName) {
    this.tellerName = tellerName;
    return this;
  }

   /**
   * Get tellerName
   * @return tellerName
  **/
  @ApiModelProperty(example = "Teller1", value = "")
  public String getTellerName() {
    return tellerName;
  }

  public void setTellerName(String tellerName) {
    this.tellerName = tellerName;
  }

  public GetTellersTellerIdCashiersTemplateResponse officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetTellersTellerIdCashiersTemplateResponse officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @ApiModelProperty(example = "Head Office", value = "")
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public GetTellersTellerIdCashiersTemplateResponse staffOptions(List<StaffData> staffOptions) {
    this.staffOptions = staffOptions;
    return this;
  }

  public GetTellersTellerIdCashiersTemplateResponse addStaffOptionsItem(StaffData staffOptionsItem) {
    if (this.staffOptions == null) {
      this.staffOptions = new ArrayList<StaffData>();
    }
    this.staffOptions.add(staffOptionsItem);
    return this;
  }

   /**
   * Get staffOptions
   * @return staffOptions
  **/
  @ApiModelProperty(value = "")
  public List<StaffData> getStaffOptions() {
    return staffOptions;
  }

  public void setStaffOptions(List<StaffData> staffOptions) {
    this.staffOptions = staffOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersTemplateResponse getTellersTellerIdCashiersTemplateResponse = (GetTellersTellerIdCashiersTemplateResponse) o;
    return Objects.equals(this.tellerId, getTellersTellerIdCashiersTemplateResponse.tellerId) &&
        Objects.equals(this.tellerName, getTellersTellerIdCashiersTemplateResponse.tellerName) &&
        Objects.equals(this.officeId, getTellersTellerIdCashiersTemplateResponse.officeId) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersTemplateResponse.officeName) &&
        Objects.equals(this.staffOptions, getTellersTellerIdCashiersTemplateResponse.staffOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tellerId, tellerName, officeId, officeName, staffOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersTemplateResponse {\n");
    
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    tellerName: ").append(toIndentedString(tellerName)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    staffOptions: ").append(toIndentedString(staffOptions)).append("\n");
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

