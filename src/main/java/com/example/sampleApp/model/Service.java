package com.example.sampleApp.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.example.sampleApp.classes.AttributeValue;
import com.example.sampleApp.classes.AuditDetails;

public class Service {
  private String id;
  private String tenantId;
  private String serviceDefId;
  private String referenceId;
  private String accountId;
  private String clientId;
  private List<AttributeValue> attributes = new ArrayList<>();
  private AuditDetails auditDetails;
  private Object additionalDetails;

  public Service id(String id) {
    this.id = id;
    return this;
  }

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