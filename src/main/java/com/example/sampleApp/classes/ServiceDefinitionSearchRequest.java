package com.example.sampleApp.classes;

import java.util.Objects;
import com.example.sampleApp.classes.Pagination;
import com.example.sampleApp.classes.RequestInfo;
import com.example.sampleApp.classes.ServiceDefinitionCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceDefinitionSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ServiceDefinitionSearchRequest   {
  @JsonProperty("requestInfo")
  private RequestInfo requestInfo;

  @JsonProperty("serviceDefinitionCriteria")
  private ServiceDefinitionCriteria serviceDefinitionCriteria;

  @JsonProperty("pagination")
  private Pagination pagination;

  public ServiceDefinitionSearchRequest requestInfo(RequestInfo requestInfo) {
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

  public ServiceDefinitionSearchRequest serviceDefinitionCriteria(ServiceDefinitionCriteria serviceDefinitionCriteria) {
    this.serviceDefinitionCriteria = serviceDefinitionCriteria;
    return this;
  }

  /**
   * Get serviceDefinitionCriteria
   * @return serviceDefinitionCriteria
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceDefinitionCriteria getServiceDefinitionCriteria() {
    return serviceDefinitionCriteria;
  }

  public void setServiceDefinitionCriteria(ServiceDefinitionCriteria serviceDefinitionCriteria) {
    this.serviceDefinitionCriteria = serviceDefinitionCriteria;
  }

  public ServiceDefinitionSearchRequest pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  */
  @ApiModelProperty(value = "")

  @Valid

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDefinitionSearchRequest serviceDefinitionSearchRequest = (ServiceDefinitionSearchRequest) o;
    return Objects.equals(this.requestInfo, serviceDefinitionSearchRequest.requestInfo) &&
        Objects.equals(this.serviceDefinitionCriteria, serviceDefinitionSearchRequest.serviceDefinitionCriteria) &&
        Objects.equals(this.pagination, serviceDefinitionSearchRequest.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo, serviceDefinitionCriteria, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionSearchRequest {\n");
    
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
    sb.append("    serviceDefinitionCriteria: ").append(toIndentedString(serviceDefinitionCriteria)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

