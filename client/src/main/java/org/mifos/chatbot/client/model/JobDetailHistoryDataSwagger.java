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
import org.threeten.bp.OffsetDateTime;

/**
 * JobDetailHistoryDataSwagger
 */

public class JobDetailHistoryDataSwagger {
  @SerializedName("version")
  private Long version = null;

  @SerializedName("jobRunStartTime")
  private OffsetDateTime jobRunStartTime = null;

  @SerializedName("jobRunEndTime")
  private OffsetDateTime jobRunEndTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("triggerType")
  private String triggerType = null;

  public JobDetailHistoryDataSwagger version(Long version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public JobDetailHistoryDataSwagger jobRunStartTime(OffsetDateTime jobRunStartTime) {
    this.jobRunStartTime = jobRunStartTime;
    return this;
  }

   /**
   * Get jobRunStartTime
   * @return jobRunStartTime
  **/
  @ApiModelProperty(example = "Jul 16, 2013 12:00:00 PM", value = "")
  public OffsetDateTime getJobRunStartTime() {
    return jobRunStartTime;
  }

  public void setJobRunStartTime(OffsetDateTime jobRunStartTime) {
    this.jobRunStartTime = jobRunStartTime;
  }

  public JobDetailHistoryDataSwagger jobRunEndTime(OffsetDateTime jobRunEndTime) {
    this.jobRunEndTime = jobRunEndTime;
    return this;
  }

   /**
   * Get jobRunEndTime
   * @return jobRunEndTime
  **/
  @ApiModelProperty(example = "Jul 16, 2013 12:00:00 PM", value = "")
  public OffsetDateTime getJobRunEndTime() {
    return jobRunEndTime;
  }

  public void setJobRunEndTime(OffsetDateTime jobRunEndTime) {
    this.jobRunEndTime = jobRunEndTime;
  }

  public JobDetailHistoryDataSwagger status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "success", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public JobDetailHistoryDataSwagger triggerType(String triggerType) {
    this.triggerType = triggerType;
    return this;
  }

   /**
   * Get triggerType
   * @return triggerType
  **/
  @ApiModelProperty(example = "cron", value = "")
  public String getTriggerType() {
    return triggerType;
  }

  public void setTriggerType(String triggerType) {
    this.triggerType = triggerType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDetailHistoryDataSwagger jobDetailHistoryDataSwagger = (JobDetailHistoryDataSwagger) o;
    return Objects.equals(this.version, jobDetailHistoryDataSwagger.version) &&
        Objects.equals(this.jobRunStartTime, jobDetailHistoryDataSwagger.jobRunStartTime) &&
        Objects.equals(this.jobRunEndTime, jobDetailHistoryDataSwagger.jobRunEndTime) &&
        Objects.equals(this.status, jobDetailHistoryDataSwagger.status) &&
        Objects.equals(this.triggerType, jobDetailHistoryDataSwagger.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, jobRunStartTime, jobRunEndTime, status, triggerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDetailHistoryDataSwagger {\n");
    
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    jobRunStartTime: ").append(toIndentedString(jobRunStartTime)).append("\n");
    sb.append("    jobRunEndTime: ").append(toIndentedString(jobRunEndTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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

