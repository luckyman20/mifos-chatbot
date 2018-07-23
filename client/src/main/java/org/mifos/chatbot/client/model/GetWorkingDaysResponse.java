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
import org.mifos.chatbot.client.model.EnumOptionData;
import org.mifos.chatbot.client.model.EnumOptionData;

/**
 * GetWorkingDaysResponse
 */

public class GetWorkingDaysResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("recurrence")
  private String recurrence = null;

  @SerializedName("repaymentRescheduleType")
  private EnumOptionData repaymentRescheduleType = null;

  @SerializedName("extendTermForDailyRepayments")
  private Boolean extendTermForDailyRepayments = null;

  public GetWorkingDaysResponse id(Long id) {
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

  public GetWorkingDaysResponse recurrence(String recurrence) {
    this.recurrence = recurrence;
    return this;
  }

   /**
   * Get recurrence
   * @return recurrence
  **/
  @ApiModelProperty(example = "FREQ=WEEKLY;INTERVAL=1;BYDAY=MO,TU,WE,TH,FR", value = "")
  public String getRecurrence() {
    return recurrence;
  }

  public void setRecurrence(String recurrence) {
    this.recurrence = recurrence;
  }

  public GetWorkingDaysResponse repaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    this.repaymentRescheduleType = repaymentRescheduleType;
    return this;
  }

   /**
   * Get repaymentRescheduleType
   * @return repaymentRescheduleType
  **/
  @ApiModelProperty(value = "")
  public EnumOptionData getRepaymentRescheduleType() {
    return repaymentRescheduleType;
  }

  public void setRepaymentRescheduleType(EnumOptionData repaymentRescheduleType) {
    this.repaymentRescheduleType = repaymentRescheduleType;
  }

  public GetWorkingDaysResponse extendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
    return this;
  }

   /**
   * Get extendTermForDailyRepayments
   * @return extendTermForDailyRepayments
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isExtendTermForDailyRepayments() {
    return extendTermForDailyRepayments;
  }

  public void setExtendTermForDailyRepayments(Boolean extendTermForDailyRepayments) {
    this.extendTermForDailyRepayments = extendTermForDailyRepayments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWorkingDaysResponse getWorkingDaysResponse = (GetWorkingDaysResponse) o;
    return Objects.equals(this.id, getWorkingDaysResponse.id) &&
        Objects.equals(this.recurrence, getWorkingDaysResponse.recurrence) &&
        Objects.equals(this.repaymentRescheduleType, getWorkingDaysResponse.repaymentRescheduleType) &&
        Objects.equals(this.extendTermForDailyRepayments, getWorkingDaysResponse.extendTermForDailyRepayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, recurrence, repaymentRescheduleType, extendTermForDailyRepayments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWorkingDaysResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    recurrence: ").append(toIndentedString(recurrence)).append("\n");
    sb.append("    repaymentRescheduleType: ").append(toIndentedString(repaymentRescheduleType)).append("\n");
    sb.append("    extendTermForDailyRepayments: ").append(toIndentedString(extendTermForDailyRepayments)).append("\n");
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
