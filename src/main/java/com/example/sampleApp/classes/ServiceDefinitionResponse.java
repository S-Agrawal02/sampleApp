package com.example.sampleApp.classes;

import java.util.Objects;
import com.example.sampleApp.classes.Pagination;
import com.example.sampleApp.classes.ResponseInfo;
import com.example.sampleApp.classes.ServiceDefinition;
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
 * ServiceDefinitionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-15T14:41:30.090618700+05:30[Asia/Calcutta]")

public class ServiceDefinitionResponse   {
  @JsonProperty("responseInfo")
  private ResponseInfo responseInfo;

  @JsonProperty("serviceDefinition")
  @Valid
  private List<ServiceDefinition> serviceDefinition = null;

  @JsonProperty("pagination")
  private Pagination pagination;

  public ServiceDefinitionResponse responseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
    return this;
  }

  /**
   * Get responseInfo
   * @return responseInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResponseInfo getResponseInfo() {
    return responseInfo;
  }

  public void setResponseInfo(ResponseInfo responseInfo) {
    this.responseInfo = responseInfo;
  }

  public ServiceDefinitionResponse serviceDefinition(List<ServiceDefinition> serviceDefinition) {
    this.serviceDefinition = serviceDefinition;
    return this;
  }

  public ServiceDefinitionResponse addServiceDefinitionItem(ServiceDefinition serviceDefinitionItem) {
    if (this.serviceDefinition == null) {
      this.serviceDefinition = new ArrayList<>();
    }
    this.serviceDefinition.add(serviceDefinitionItem);
    return this;
  }

  /**
   * Get serviceDefinition
   * @return serviceDefinition
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceDefinition> getServiceDefinition() {
    return serviceDefinition;
  }

  public void setServiceDefinition(List<ServiceDefinition> serviceDefinition) {
    this.serviceDefinition = serviceDefinition;
  }

  public ServiceDefinitionResponse pagination(Pagination pagination) {
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
    ServiceDefinitionResponse serviceDefinitionResponse = (ServiceDefinitionResponse) o;
    return Objects.equals(this.responseInfo, serviceDefinitionResponse.responseInfo) &&
        Objects.equals(this.serviceDefinition, serviceDefinitionResponse.serviceDefinition) &&
        Objects.equals(this.pagination, serviceDefinitionResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseInfo, serviceDefinition, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDefinitionResponse {\n");
    
    sb.append("    responseInfo: ").append(toIndentedString(responseInfo)).append("\n");
    sb.append("    serviceDefinition: ").append(toIndentedString(serviceDefinition)).append("\n");
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

