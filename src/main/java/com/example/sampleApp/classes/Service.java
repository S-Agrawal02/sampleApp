package com.example.sampleApp.classes;

import java.util.Objects;
import com.example.sampleApp.classes.AttributeValue;
import com.example.sampleApp.classes.AuditDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Hold the Service field details as json object.
 */
@ApiModel(description = "Hold the Service field details as json object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class Service   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("serviceDefId")
  private String serviceDefId;

  @JsonProperty("referenceId")
  private String referenceId;

  @JsonProperty("accountId")
  private String accountId;

  @JsonProperty("clientId")
  private String clientId;

  @JsonProperty("attributes")
  @Valid
  private List<AttributeValue> attributes = new ArrayList<>();

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("additionalDetails")
  private Object additionalDetails;

  public Service id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the record
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "Unique identifier of the record")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant Identifier
   * @return tenantId
  */
  @ApiModelProperty(example = "pb.amritsar", required = true, value = "Tenant Identifier")
  @NotNull

@Size(min=2,max=64) 
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Service serviceDefId(String serviceDefId) {
    this.serviceDefId = serviceDefId;
    return this;
  }

  /**
   * Service definition id
   * @return serviceDefId
  */
  @ApiModelProperty(required = true, value = "Service definition id")
  @NotNull

@Size(min=2,max=64) 
  public String getServiceDefId() {
    return serviceDefId;
  }

  public void setServiceDefId(String serviceDefId) {
    this.serviceDefId = serviceDefId;
  }

  public Service referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * if service is delivered for specific entity then we link this to that entity
   * @return referenceId
  */
  @ApiModelProperty(value = "if service is delivered for specific entity then we link this to that entity")

@Size(min=2,max=64) 
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public Service accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account id of the individual
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "Account id of the individual")
  @NotNull

@Size(min=2,max=64) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Service clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client Id for service
   * @return clientId
  */
  @ApiModelProperty(value = "Client Id for service")

@Size(min=2,max=64) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Service attributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Service addAttributesItem(AttributeValue attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * values we can pass if field type is selected as('singlevaluelist','multivaluelist'). 
   * @return attributes
  */
  @ApiModelProperty(required = true, value = "values we can pass if field type is selected as('singlevaluelist','multivaluelist'). ")
  @NotNull

  @Valid

  public List<AttributeValue> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeValue> attributes) {
    this.attributes = attributes;
  }

  public Service auditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    return this;
  }

  /**
   * Get auditDetails
   * @return auditDetails
  */
  @ApiModelProperty(value = "")

  @Valid

  public AuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }

  public Service additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

  /**
   * Any additional key-value pair to be stored with the service.
   * @return additionalDetails
  */
  @ApiModelProperty(value = "Any additional key-value pair to be stored with the service.")

  @Valid

  public Object getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.tenantId, service.tenantId) &&
        Objects.equals(this.serviceDefId, service.serviceDefId) &&
        Objects.equals(this.referenceId, service.referenceId) &&
        Objects.equals(this.accountId, service.accountId) &&
        Objects.equals(this.clientId, service.clientId) &&
        Objects.equals(this.attributes, service.attributes) &&
        Objects.equals(this.auditDetails, service.auditDetails) &&
        Objects.equals(this.additionalDetails, service.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, serviceDefId, referenceId, accountId, clientId, attributes, auditDetails, additionalDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    serviceDefId: ").append(toIndentedString(serviceDefId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

