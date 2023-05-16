package com.example.sampleApp.model;

import java.util.Objects;
import com.example.sampleApp.classes.RequestInfo;
import com.example.sampleApp.model.ServiceDefinition;

public class ServiceDefinitionRequest {

  private RequestInfo requestInfo;
  private ServiceDefinition serviceDefinition;

  public ServiceDefinitionRequest requestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  public RequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public ServiceDefinitionRequest serviceDefinition(ServiceDefinition serviceDefinition) {
    this.serviceDefinition = serviceDefinition;
    return this;
  }

  public ServiceDefinition getServiceDefinition() {
    return serviceDefinition;
  }

  public void setServiceDefinition(ServiceDefinition serviceDefinition) {
    this.serviceDefinition = serviceDefinition;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionRequest serviceDefinitionRequest = (ServiceDefinitionRequest) o;
    return Objects.equals(this.requestInfo, serviceDefinitionRequest.requestInfo) &&
        Objects.equals(this.serviceDefinition, serviceDefinitionRequest.serviceDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, serviceDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionRequest {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    serviceDefinition: ").append(toIndentedString(serviceDefinition)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

