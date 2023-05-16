package com.example.model;

import java.util.Objects;
import com.example.model.AttributeDefinition;
import com.example.model.AuditDetails;
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
 * Holds the Service Definition details json object.
 */
@ApiModel(description = "Holds the Service Definition details json object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ServiceDefinition   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("code")
  private String code;

  @JsonProperty("isActive")
  private Boolean isActive = true;

  @JsonProperty("attributes")
  @Valid
  private List<AttributeDefinition> attributes = new ArrayList<>();

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails;

  @JsonProperty("additionalDetails")
  private Object additionalDetails;

  @JsonProperty("clientId")
  private String clientId;

  public ServiceDefinition id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the record
   * @return id
  */
  @ApiModelProperty(readOnly = true, value = "Unique identifier of the record")

@Size(min=2,max=64) 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ServiceDefinition tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Tenant Identifier
   * @return tenantId
  */
  @ApiModelProperty(example = "pb.amritsar", value = "Tenant Identifier")

@Size(min=2,max=64) 
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public ServiceDefinition code(String code) {
    this.code = code;
    return this;
  }

  /**
   * unique namespaced service code to identify the attribute config for code
   * @return code
  */
  @ApiModelProperty(required = true, value = "unique namespaced service code to identify the attribute config for code")
  @NotNull

@Size(min=2,max=64) 
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ServiceDefinition isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * If false then consider this as soft deleted record
   * @return isActive
  */
  @ApiModelProperty(value = "If false then consider this as soft deleted record")


  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public ServiceDefinition attributes(List<AttributeDefinition> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ServiceDefinition addAttributesItem(AttributeDefinition attributesItem) {
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<AttributeDefinition> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<AttributeDefinition> attributes) {
    this.attributes = attributes;
  }

  public ServiceDefinition auditDetails(AuditDetails auditDetails) {
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

  public ServiceDefinition additionalDetails(Object additionalDetails) {
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

  public ServiceDefinition clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client Id for service definition
   * @return clientId
  */
  @ApiModelProperty(value = "Client Id for service definition")

@Size(min=2,max=64) 
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinition serviceDefinition = (ServiceDefinition) o;
    return Objects.equals(this.id, serviceDefinition.id) &&
        Objects.equals(this.tenantId, serviceDefinition.tenantId) &&
        Objects.equals(this.code, serviceDefinition.code) &&
        Objects.equals(this.isActive, serviceDefinition.isActive) &&
        Objects.equals(this.attributes, serviceDefinition.attributes) &&
        Objects.equals(this.auditDetails, serviceDefinition.auditDetails) &&
        Objects.equals(this.additionalDetails, serviceDefinition.additionalDetails) &&
        Objects.equals(this.clientId, serviceDefinition.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, code, isActive, attributes, auditDetails, additionalDetails, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

