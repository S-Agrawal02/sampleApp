package com.example.sampleApp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.example.sampleApp.classes.AttributeDefinition;
import com.example.sampleApp.classes.AuditDetails;

public class ServiceDefinition {
  private String id;
  private String tenantId;
  private String code;
  private Boolean isActive = true;
  private List<AttributeDefinition> attributes = new ArrayList<>();
  private AuditDetails auditDetails;
  private Object additionalDetails;
  private String clientId;

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