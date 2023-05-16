package com.example.model;

import java.util.Objects;
import com.example.model.RequestInfo;
import com.example.model.ServiceDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceDefinitionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ServiceDefinitionRequest   {
  @JsonProperty("requestInfo")
  private RequestInfo requestInfo;

  @JsonProperty("serviceDefinition")
  private ServiceDefinition serviceDefinition;

  public ServiceDefinitionRequest requestInfo(RequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  /**
   * Get requestInfo
   * @return requestInfo
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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

  /**
   * Get serviceDefinition
   * @return serviceDefinition
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

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

