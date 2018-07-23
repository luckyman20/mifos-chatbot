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
import org.mifos.chatbot.client.model.PutSavingsChanges;
import org.mifos.chatbot.client.model.PutSavingsChanges;

/**
 * PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse
 */

public class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {
  @SerializedName("officeId")
  private Integer officeId = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("savingsId")
  private Integer savingsId = null;

  @SerializedName("resourceId")
  private Integer resourceId = null;

  @SerializedName("changes")
  private PutSavingsChanges changes = null;

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse officeId(Integer officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Integer officeId) {
    this.officeId = officeId;
  }

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse clientId(Integer clientId) {
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

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse savingsId(Integer savingsId) {
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getSavingsId() {
    return savingsId;
  }

  public void setSavingsId(Integer savingsId) {
    this.savingsId = savingsId;
  }

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse resourceId(Integer resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @ApiModelProperty(example = "6", value = "")
  public Integer getResourceId() {
    return resourceId;
  }

  public void setResourceId(Integer resourceId) {
    this.resourceId = resourceId;
  }

  public PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse changes(PutSavingsChanges changes) {
    this.changes = changes;
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @ApiModelProperty(value = "")
  public PutSavingsChanges getChanges() {
    return changes;
  }

  public void setChanges(PutSavingsChanges changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse = (PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse) o;
    return Objects.equals(this.officeId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.officeId) &&
        Objects.equals(this.clientId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.clientId) &&
        Objects.equals(this.savingsId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.savingsId) &&
        Objects.equals(this.resourceId, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.resourceId) &&
        Objects.equals(this.changes, putSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, clientId, savingsId, resourceId, changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutSavingsAccountsSavingsAccountIdChargesSavingsAccountChargeIdResponse {\n");
    
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

